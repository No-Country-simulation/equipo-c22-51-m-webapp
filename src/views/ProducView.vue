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
        <img class="w-[250px] h-[320px] object-cover" src="../assets/img/1.png" alt="Producto" />
        <span>
          <img class="w-6" src="../assets/img/flecha-derecha.png" alt="Flecha derecha" />
        </span>
      </div>
      <div class="flex gap-4 justify-center mt-4">
        <img class="w-16 h-24 object-cover" src="../assets/img/1.png" alt="Producto pequeño" />
        <img class="w-16 h-24 object-cover" src="../assets/img/1.png" alt="Producto pequeño" />
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
  <div>
    <div
      class="bg-[#FFFFFF] w-[80%] mx-auto mt-10 flex justify-center gap-10 shadow-md shadow-slate-400/15"
    >
      <div class="flex items-center justify-center py-4">
        <img class="w-6 h-6 object-contain" src="../assets/img/icon.png" alt="" />
        <div class="ml-2">
          <h3>High Quality</h3>
          <p>crafted from top materials</p>
        </div>
      </div>
      <div class="flex items-center justify-center py-4">
        <img class="w-6 h-6 object-contain" src="../assets/img/icon (1).png" alt="" />
        <div class="ml-2">
          <h3>Warrany Protection</h3>
          <p>Over 2 years</p>
        </div>
      </div>
      <div class="flex items-center justify-center py-4">
        <img class="w-6 h-6 object-contain" src="../assets/img/Vector (1).png" alt="" />
        <div class="ml-2">
          <h3>Free Shipping</h3>
          <p>Order over 150 $</p>
        </div>
      </div>
      <div class="flex items-center justify-center py-4">
        <img class="w-6 h-6 object-contain" src="../assets/img/2891214031638194523 1.png" alt="" />
        <div class="ml-2">
          <h3>24 / 7 Support</h3>
          <p>Dedicated support</p>
        </div>
      </div>
    </div>
  </div>
  <section>
    <div class="w-[80%] mx-auto my-10">
      <h2 class="text-xl font-semibold text-center mb-10 capitalize">informacion</h2>
      <div class="flex justify-between">
        <p class="mt-4 w-1/2">
          Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nulla quam velit, vulputate eu
          pharetra nec, mattis ac neque. Duis vulputate commodo lectus, ac blandit elit tincidunt
          id. Sed rhoncus, tortor sed eleifend tristique, tortor mauris tincidunt dolor, et dapibus
          est magna vel metus. Integer eu velit est. Nullam a nibh odio, non imperdiet leo. In et
          purus a libero ultricies sodales. Nam sit amet sem mauris. Nam lacinia, purus ac ultricies
          tristique, elit augue ultrices purus, quis lacinia est. Phasellus vel purus ac orci
          ultricies condimentum. Nam imperdiet sagittis quam. Donec sit amet diam eu massa imperdiet
          ultricies. Vivamus et sem justo, vel mattis massa. Maecenas hendrerit congue urna et
          porttitor. Praesent non felis ac massa convallis condimentum. Aliquam erat volutpat. Sed
          ultricies tristique nulla sit amet adipiscing. Curabitur in metus urna. In hac habitasse
          platea dictumst. Integer purus urna, pretium vel volutpat nec, cursus eu metus. Nam neque
          tellus, malesuada in iaculis ac, auctor in ligula. Nam dictum ultricies convallis.
          Phasellus in libero at nisi pulvinar imperdiet. Maecenas convallis, erat sed consequat
          tristique, lacus nulla condimentum metus, quisque tristique metus mi at lectus. Fusce sit
          amet diam sit amet mi pharetra posuere. Praesent dapibus, nisi a
        </p>
        <img class="w-[240px] h-[300px] object-cover" src="../assets/img/1.png" alt="" />
      </div>
    </div>
  </section>
</template>

<style scoped>
p {
  font-size: 20px;
}

span {
  font-size: 12px;
  font-weight: 300;
}

h3 {
  font-size: 12px;
  font-weight: 600;
}

p {
  font-size: 10px;
  font-weight: 300;
}
</style>
