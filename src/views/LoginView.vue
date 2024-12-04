<script setup></script>

<template>
  <div class="flex flex-col items-center justify-center h-screen">
    <div class="flex flex-col items-center justify-center w-full h-[20%] max-w-md">
      <h1 class="text-5xl font-bold">CatDog</h1>
    </div>
    <div class="flex flex-col items-center justify-center w-[60%] mx-auto h-[100%] max-w-md">
      <h2 class="text-2xl font-bold mb-4 text-start w-full">Ingresar a CatDog</h2>
      <div class="flex gap-4 text-lg items-center justify-between w-full mx-auto">
        <button
          class="flex items-center justify-center rounded-md gap-2 border text-black font-bold w-[300px] mx-4 max-w-md bg-white p-2"
        >
          <img src="../assets/img/google.png" alt="Google" class="w-10 h-10" />
          <span class="ml-2 text-sm">Sign up with Google</span>
        </button>
        <button
          class="flex items-center justify-center gap-2 border rounded-md text-black font-bold max-w-md w-[300px] bg-white p-1"
        >
          <img src="../assets/img/gmail.png" alt="Facebook" class="w-10 h-10" />
          <span class="ml-2 text-sm">Sign up with Email</span>
        </button>
      </div>
      <h3 class="text-center text-2xl uppercase font-bold text-gray-600 my-16">- or -</h3>
      <div class="flex flex-col gap-4 text-lg items-center justify-center w-full">
        <form
          class="flex items-center gap-4 border-b-2 text-black font-bold w-full max-w-md bg-white p-2"
        >
          <input class="w-full placeholder:text-sm" type="text" placeholder="Email" />
        </form>
        <form
          class="flex items-center gap-4 border-b-2 text-black font-bold w-full max-w-md bg-white p-2"
        >
          <input class="w-full placeholder:text-sm" type="text" placeholder="Password" />
        </form>
        <button
          class="flex items-center gap-2 border text-black font-bold w-full max-w-md rounded-full bg-white p-1"
        >
          <img src="../assets/img/login.png" alt="Login" class="w-10 h-10 rounded-full" />
          <span class="ml-2">Login</span>
        </button>
        <button
          class="flex items-center gap-2 border text-black font-bold w-full max-w-md rounded-full bg-white p-1"
        >
          <img src="../assets/img/register.png" alt="Register" class="w-10 h-10 rounded-full" />
          <span class="ml-2">Register</span>
        </button>
      </div>
    </div>
    <footer class="flex flex-col items-center justify-center w-full h-[10%]">
      <p>© 2023 CatDog. Todos los derechos reservados.</p>
    </footer>
  </div>
</template>

<style scoped></style>
