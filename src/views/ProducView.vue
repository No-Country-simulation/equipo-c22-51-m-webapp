<script setup>
import Navbar from '../components/Navbar.vue'
</script>

<template>
  <header>
    <Navbar />
  </header>
  <main class="grid grid-cols-6 w-[95%] mx-auto mt-16">
    <div class="col-span-2">
      <div class="flex gap-4 justify-center items-center">
        <span>
          <img class="w-6" src="../assets/img/flecha-izquierda.png" alt="Flecha izquierda" />
        </span>
        <img class="w-[200px] h-[300px]" src="../assets/img/1.png" alt="Producto" />
        <span>
          <img class="w-6" src="../assets/img/flecha-derecha.png" alt="Flecha derecha" />
        </span>
      </div>
      <div class="flex gap-4 justify-center mt-4">
        <img class="w-16 h-24" src="../assets/img/1.png" alt="Producto pequeño" />
        <img class="w-16 h-24" src="../assets/img/1.png" alt="Producto pequeño" />
      </div>
    </div>
    <div class="col-span-4 ml-16">
      <h2 class="text-center text-2xl font-semibold">Titulo Alimento</h2>
      <div class="grid grid-cols-2 justify-start items-start w-1/2 mt-10 pl-10">
        <p class="font-bold">$ 52,990</p>
        <p>$ 54,990</p>
        <p>Ahorras 3%</p>
        <p>$(2,000)</p>
        <select class="col-span-2 mt-4 h-8 bg-gray-100 border text-sm">
          <option value="">Select one...</option>
          <option value="1">1</option>
          <option value="2">2</option>
          <option value="3">3</option>
          <option value="4">4</option>
          <option value="5">5</option>
        </select>
      </div>
      <div>
        <p class="pt-6 pb-3 text-xs font-light capitalize ml-4">Cantidad</p>
        <div class="flex gap-4">
          <div class="flex w-[15%] rounded-sm justify-between items-center border px-4">
            <button class="text-xs font-semibold">-</button>
            <p class="text-xs">1</p>
            <button class="text-xs font-semibold">+</button>
          </div>
          <button class="w-1/2 rounded-sm border border-black">
            <p class="text-lg font-bold">Comprar</p>
          </button>
        </div>
      </div>
      <div class="flex-col flex mt-10">
        <span>Estimated Delivery: Jul 30 - Aug 03</span>
        <span>Free Shipping & Returns: On all orders over $75</span>
      </div>
      <div class="w-full mt-8">
        <div class="flex justify-start items-center">
          <div class="w-[60%] bg-[#F8F8F8] flex items-center gap-x-2 justify-center flex-col p-2">
            <div class="gap-2 flex py-2">
              <span class="bg-white p-1">Visa</span>
              <span class="bg-white p-1">Visa</span>
              <span class="bg-white p-1">Visa</span>
              <span class="bg-white p-1">Visa</span>
              <span class="bg-white p-1">Visa</span>
              <span class="bg-white p-1">Visa</span>
              <span class="bg-white p-1">Visa</span>
            </div>
            <h4 class="text-xs mt-2">Guarantee safe & secure checkout</h4>
          </div>
        </div>
      </div>
    </div>
  </main>
</template>

<style scoped>
p {
  font-size: 20px;
}

span {
  font-size: 12px;
  font-weight: 300;
}
</style>
