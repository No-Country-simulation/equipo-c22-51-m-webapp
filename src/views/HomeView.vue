<script setup>
import TheWelcome from '../components/TheWelcome.vue'
import TextoSuperior from '../components/TextoSuperior.vue'
import Navbar from '../components/Navbar.vue'
import NavbarLogo from '../components/NavbarLogo.vue'
import CarrouselHero from '../components/CarrouselHero.vue'
import Marcas from '../components/Marcas.vue'
import Footer from '@/components/Footer.vue'
</script>

<template>
  <main>
    <TextoSuperior />
    <Navbar />
    <NavbarLogo />
    <CarrouselHero />
    <TheWelcome />
    <Marcas />
    <Footer />
  </main>
</template>
