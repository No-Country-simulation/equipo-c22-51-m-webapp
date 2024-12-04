<script setup></script>

<template>
  <nav class="bg-[#F7B32B]">
    <div class="flex justify-between items-center w-[95%] mx-auto">
      <div class="flex font-bold text-xl w-[25%] items-center">
        <router-link to="/Home">
          <img src="../assets/img/rb_136741.png" alt="logo" class="w-14 h-14" />
        </router-link>
        <h2>CatDog</h2>
      </div>
      <ul class="flex gap-4 text-lg capitalize w-[50%] justify-center">
        <li>
          <router-link to="/Home">ofertas</router-link>
        </li>
        <li>
          <router-link to="/About">perros</router-link>
        </li>
        <li>
          <router-link to="/Contact">gatos</router-link>
        </li>
        <li>
          <router-link to="/Contact">marcas</router-link>
        </li>
        <li>
          <router-link to="/Contact">servicios</router-link>
        </li>
      </ul>
      <div
        class="flex gap-2 text-lg items-center capitalize justify-end w-[25%] rounded-full overflow-hidden"
      >
        <form
          action=""
          class="flex gap-4 border text-black font-bold w-[50%] rounded-full bg-white p-1 items-center"
        >
          <img src="../assets/img/buscar.png" alt="logo" class="w-5 h-5 rounded-full ml-2" />
          <input class="w-full placeholder:text-sm" type="text" placeholder="Buscar" />
        </form>
      </div>
    </div>
  </nav>
</template>

<style scoped>
input:focus {
  outline: none;
}

li:hover {
  color: black;
  font-weight: bold;
}
</style>
