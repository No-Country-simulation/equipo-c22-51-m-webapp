<script setup></script>

<template>
  <div class="flex flex-col h-screen">
    <div class="flex flex-col items-center justify-center h-[20%] w-full">
      <h1 class="text-5xl font-bold">CatDog</h1>
    </div>
    <div class="flex flex-col items-center justify-center h-[60%] w-full max-w-md mx-auto">
      <h2 class="text-2xl font-bold mb-4 text-start w-full">Ingresar a CatDog</h2>
      <div class="flex gap-4 text-lg justify-center w-full mb-16">
        <button
          class="flex items-center justify-center gap-2 border text-black font-bold rounded-md bg-white p-2 w-[300px] hover:bg-gray-100 hover:shadow-md transition"
        >
          <img src="../assets/img/google.png" alt="Google" class="w-10 h-10" />
          <span class="text-sm">Sign up with Google</span>
        </button>
        <button
          class="flex items-center justify-center gap-2 border text-black font-bold rounded-md bg-white p-2 w-[300px] hover:bg-gray-100 hover:shadow-md transition"
        >
          <img src="../assets/img/gmail.png" alt="Email" class="w-10 h-10" />
          <span class="text-sm">Sign up with Email</span>
        </button>
      </div>
      <h3 class="text-2xl uppercase font-bold text-gray-600 my-8 text-center">- or -</h3>
      <div class="flex flex-col gap-4 text-lg w-full">
        <form class="flex items-center border-b-2 text-black font-bold bg-white p-2">
          <input class="w-full placeholder:text-sm" type="text" placeholder="Email" />
        </form>
        <form class="flex items-center border-b-2 text-black font-bold bg-white p-2">
          <input class="w-full placeholder:text-sm" type="text" placeholder="Password" />
        </form>
        <button
          class="flex items-center justify-center border border-black text-white font-bold bg-black py-2 w-full mt-4 hover:bg-gray-800 hover:shadow-md transition"
        >
          <span>ingresar</span>
        </button>
        <button
          class="flex items-center justify-center border border-blue-600 text-blue-600 font-bold bg-white py-2 w-full hover:bg-blue-50 hover:shadow-md transition"
        >
          <span>Registrarse</span>
        </button>
        <router-link
          to="/register"
          class="text-end text-blue-600 font-bold text-sm hover:underline"
        >
          <span>¿Olvido su Contraseña??</span>
        </router-link>
      </div>
    </div>
    <footer class="flex items-center justify-center h-[20%] w-full text-sm">
      <router-link to="/terminosycondiciones" class="text-black hover:underline">
        CatDog Terms & Conditions
      </router-link>
    </footer>
  </div>
</template>

<style scoped>
input:focus {
  outline: none;
}
</style>
