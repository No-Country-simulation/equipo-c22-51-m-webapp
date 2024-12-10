package com.catdog.comerce.service.impl;

import com.catdog.comerce.dto.request.UserDto;

import com.catdog.comerce.dto.response.ResponseUserDto;
import com.catdog.comerce.entity.Role;
import com.catdog.comerce.entity.User;
import com.catdog.comerce.enums.RoleType;
import com.catdog.comerce.exception.AlreadyExistsException;
import com.catdog.comerce.exception.NotFoundException;
import com.catdog.comerce.repository.RoleRepo;
import com.catdog.comerce.repository.UserRepo;
import com.catdog.comerce.repository.RepoGeneric;
import com.catdog.comerce.service.IUserService;
import com.catdog.comerce.utils.MapperUtil;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class UserServiceImpl extends CrudServiceImpl<UserDto, User,Long> implements IUserService {
    private UserRepo userRepo;
    private RoleRepo roleRepo;

    public UserServiceImpl(MapperUtil mapperUtil, UserRepo userRepo, RoleRepo roleRepo) {
        super(mapperUtil);
        this.userRepo = userRepo;
        this.roleRepo = roleRepo;
    }

    @Override
    protected RepoGeneric<User, Long> getRepo() {
        return userRepo;
    }

    @Override
    protected Class<User> getEntityClass() {
        return User.class;
    }

    @Override
    protected Class<UserDto> getDtoClass() {
        return UserDto.class;
    }

    @Override
    protected void setId(User entity, Long aLong) {
        entity.setIdUser(aLong);
    }

    @Override
    public ResponseUserDto updateInformation(UserDto userDto, Long id) {
        User user = userRepo.findById(id)
                .orElseThrow(()-> new NotFoundException("user",id));

        if (userRepo.existsByDni(userDto.getDni())){
            throw new AlreadyExistsException("user","dni");
        }
        user.setName(userDto.getName());
        user.setLastName(userDto.getLastName());
        user.setDni(userDto.getDni());
        user.setAddress(userDto.getAddress());

        boolean enabledBuyer = user.getName()!=null && user.getLastName()!=null && user.getDni()!=null && user.getAddress()!=null;
        user.setEnableBuyer(enabledBuyer);
        User user1 = userRepo.save(user);
        return mapperUtil.map(user1,ResponseUserDto.class);
    }
}
