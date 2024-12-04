<template>
  <h2 class="text-center bg-[#A9E5BB] text-lg pt-3 font-bold uppercase">Lo Nuevo de CatDog</h2>
  <div class="w-full mx-auto bg-[#A9E5BB] items-center flex flex-col">
    <swiper
      :effect="'coverflow'"
      :grabCursor="true"
      :centeredSlides="true"
      :slidesPerView="'5'"
      :initialSlide="1"
      :spaceBetween="3"
      :loop="true"
      :coverflowEffect="{
        rotate: 0,
        stretch: 0,
        depth: 150,
        modifier: 2,
        slideShadows: false,
      }"
      :pagination="{ clickable: true }"
      :navigation="true"
      :modules="[EffectCoverflow, Navigation]"
      class="mySwiper"
    >
      <swiper-slide v-for="(img, index) in imgs" :key="index">
        <div class="image-container">
          <img :src="img" alt="Nature 1" />
        </div>
      </swiper-slide>
    </swiper>
    <button class="bg-[#2D1E2F] text-white text-xs font-bold uppercase w-32 h-8 rounded-full mb-6">
      <a href="#"> Ver +</a>
    </button>
  </div>
</template>

<script setup>
import { Swiper, SwiperSlide } from 'swiper/vue'
import { ref } from 'vue'

const imgs = ref([
  'src/assets/img/acana-classic--removebg-preview.png',
  'src/assets/img/acanaaaaa-removebg-preview.png',
  'src/assets/img/acana-duck-pear_-removebg-preview.png',
  'src/assets/img/acana-freshwater-fish-recipe.jpg',
  'src/assets/img/bil-jac-small-breed-removebg-preview.png',
  'src/assets/img/bocadito-de-removebg-preview.png',
  'src/assets/img/brit-care-adult-salmon-removebg-preview.png',
])

// Import Swiper styles
import 'swiper/css'
import 'swiper/css/effect-coverflow'
import 'swiper/css/pagination'
import 'swiper/css/navigation'

// Import Swiper modules
import { EffectCoverflow, Navigation } from 'swiper/modules'
</script>

<style>
/* Contenedor del Swiper */
.mySwiper {
  width: 95%;
  margin: auto;
  height: 400px; /* Ajusta la altura total del carrusel */
  display: flex;
  align-items: center;
  justify-content: center;
}

/* Contenedor de cada slide */
.image-container {
  display: flex;
  align-items: center; /* Centra verticalmente */
  justify-content: center; /* Centra horizontalmente */
  height: 100%; /* Asegura que ocupe toda la altura disponible */
}

/* Estilo de las imágenes */
.mySwiper img {
  width: 120px; /* Tamaño inicial de las imágenes */
  height: 200px;
  object-fit: cover;
  border-radius: 10px;
  transition: transform 0.3s ease; /* Suaviza la transición */
}

/* Imagen activa más grande */
.swiper-slide-active img {
  transform: scale(1.6); /* Agranda la imagen central */
}
</style>
