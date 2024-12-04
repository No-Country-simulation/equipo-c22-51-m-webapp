<script setup></script>

<template>
  <nav class="flex justify-between w-[95%] mx-auto py-3">
    <div class="flex items-center gap-3 w-3/4 font-bold text-xl">
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

    <div class="flex gap-4 items-center text-lg">
      <button>
        <img src="../assets/img/Vector.png" alt="logo" class="w-5 h-5" />
      </button>
      <router-link to="/Login">Iniciar Sesion</router-link>

      <router-link to="/Register">Registrarse</router-link>
    </div>
  </nav>
</template>

<style scoped></style>
