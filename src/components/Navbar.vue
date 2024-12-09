<script setup>
import { ref } from 'vue'

const isMenuVisible = ref(false)

function toggleMenu() {
  isMenuVisible.value = !isMenuVisible.value
}
</script>

<template>
  <div class="text-center w-full bg-[#F7B32B]">
    <h1 class="text-base font-bold text-black w-full uppercase p-2">ENVÍO GRATIS Sobre $30.000</h1>
  </div>
  <nav class="flex md:flex-col lg:flex-row justify-between w-[95%] mx-auto py-3">
    <div class="flex items-center gap-3 sm:w-full lg:w-3/4 font-bold text-lg lg:text-xl">
      <router-link to="/facebook">
        <img src="../assets/img/facebook.png" alt="logo" class="w-5 h-5" />
      </router-link>
      <router-link to="/instagram">
        <img src="../assets/img/instagram.png" alt="logo" class="w-5 h-5" />
      </router-link>
      <router-link to="/correo">
        <img src="../assets/img/correo-electronico.png" alt="logo" class="w-5 h-5" />
      </router-link>
    </div>

    <div class="flex gap-2 lg:gap-4 items-center text-md lg:text-lg mt-2 lg:mt-0">
      <button>
        <img src="../assets/img/Vector.png" alt="logo" class="w-5 h-5" />
      </button>
      <router-link to="/Login">Iniciar Sesion</router-link>

      <router-link to="/Register">Registrarse</router-link>
    </div>
  </nav>
  <nav class="bg-[#F7B32B] py-3 lg:py-0">
    <div class="flex flex-col lg:flex-row justify-between items-center lg:w-[95%] mx-auto">
      <div class="flex font-bold text-lg lg:text-xl items-center w-full lg:w-1/4 mb-3 lg:mb-0">
        <router-link to="/Home" class="flex items-center">
          <img
            src="../assets/img/rb_136741.png"
            alt="CatDog logo"
            class="w-10 h-10 lg:w-14 lg:h-14"
          />
          <h2 class="ml-2">CatDog</h2>
        </router-link>
      </div>
      <div
        class="lg:flex gap-4 text-md lg:text-lg capitalize justify-center w-full lg:w-1/2 hidden"
      >
        <ul class="flex gap-2 lg:gap-4">
          <li><router-link to="/Home">ofertas</router-link></li>
          <li><router-link to="/About">perros</router-link></li>
          <li><router-link to="/Contact">gatos</router-link></li>
          <li><router-link to="/Contact">marcas</router-link></li>
          <li><router-link to="/Contact">servicios</router-link></li>
        </ul>
      </div>
      <div class="flex lg:hidden justify-center">
        <button @click="toggleMenu" class="text-black">
          <svg
            xmlns="http://www.w3.org/2000/svg"
            class="w-8 h-8"
            fill="none"
            viewBox="0 0 24 24"
            stroke="currentColor"
          >
            <path
              stroke-linecap="round"
              stroke-linejoin="round"
              stroke-width="2"
              d="M4 6h16M4 12h16m-7 6h7"
            />
          </svg>
        </button>
      </div>
      <div v-if="isMenuVisible" class="w-full lg:hidden">
        <ul class="flex gap-2 text-md capitalize justify-center mt-4">
          <li><router-link to="/Home">ofertas</router-link></li>
          <li><router-link to="/About">perros</router-link></li>
          <li><router-link to="/Contact">gatos</router-link></li>
          <li><router-link to="/Contact">marcas</router-link></li>
          <li><router-link to="/Contact">servicios</router-link></li>
        </ul>
      </div>
      <div
        class="flex gap-2 text-md lg:text-lg items-center capitalize justify-end w-full lg:w-1/4 mt-3 lg:mt-0"
      >
        <form
          class="flex items-center gap-2 lg:gap-4 border text-black font-bold w-full max-w-md rounded-full bg-white p-1"
        >
          <img src="../assets/img/buscar.png" alt="Buscar" class="w-5 h-5 rounded-full ml-2" />
          <input
            class="w-full placeholder:text-xs lg:placeholder:text-sm"
            type="text"
            placeholder="Buscar"
          />
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
