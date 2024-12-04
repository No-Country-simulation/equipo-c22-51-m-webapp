<script setup></script>

<template>
  <nav class="bg-[#F7B32B]">
    <div class="flex justify-between items-center w-[95%] mx-auto">
      <div class="flex font-bold text-xl items-center w-1/4">
        <router-link to="/Home" class="flex items-center">
          <img src="../assets/img/rb_136741.png" alt="CatDog logo" class="w-14 h-14" />
          <h2 class="ml-2">CatDog</h2>
        </router-link>
      </div>
      <ul class="flex gap-4 text-lg capitalize justify-center w-1/2">
        <li><router-link to="/Home">ofertas</router-link></li>
        <li><router-link to="/About">perros</router-link></li>
        <li><router-link to="/Contact">gatos</router-link></li>
        <li><router-link to="/Contact">marcas</router-link></li>
        <li><router-link to="/Contact">servicios</router-link></li>
      </ul>
      <div class="flex gap-2 text-lg items-center capitalize justify-end w-1/4">
        <form
          class="flex items-center gap-4 border text-black font-bold w-full max-w-md rounded-full bg-white p-1"
        >
          <img src="../assets/img/buscar.png" alt="Buscar" class="w-5 h-5 rounded-full ml-2" />
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
