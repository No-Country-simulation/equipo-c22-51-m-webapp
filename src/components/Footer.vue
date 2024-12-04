<template>
  <footer class="flex flex-col gap-4 bg-white w-[80%] mx-auto justify-between mt-10">
    <div class="flex gap-4 justify-between h-44">
      <div class="lista-footer">
        <h4>Nosotros</h4>
        <ul>
          <li>
            <router-link to="/Nosotros">Nosotros</router-link>
          </li>
          <li>
            <router-link to="/NuestraCausa">Nuestra causa</router-link>
          </li>
          <li>
            <router-link to="/Blog">blog</router-link>
          </li>
        </ul>
      </div>
      <div class="lista-footer">
        <h4>Tienda</h4>
        <ul>
          <li>
            <router-link to="/Nosotros">Descuentos y alianzas</router-link>
          </li>
          <li>
            <router-link to="/NuestraCausa">Farmacia</router-link>
          </li>
          <li>
            <router-link to="/Blog">Servicio a domicilio</router-link>
          </li>
        </ul>
      </div>
      <div class="lista-footer">
        <h4>¿Como comprar?</h4>
        <ul>
          <li>
            <router-link to="/Nosotros">Terminos y condiciones</router-link>
          </li>
          <li>
            <router-link to="/NuestraCausa">Políticas de envío</router-link>
          </li>
          <li>
            <router-link to="/Blog">Políticas de devolución</router-link>
          </li>
          <li>
            <router-link to="/Blog">Polítoca de privacidad</router-link>
          </li>
        </ul>
      </div>
      <div class="w-1/4 lista-footer">
        <h4>Contacto</h4>
        <ul>
          <li class="mb-4">
            <router-link to="/Nosotros">¿Necesitas contactarnos?</router-link>
          </li>
          <li>
            <router-link to="/Blog"
              >Escoge el medio que más te acomode para resolver tus dudas o inconvenientes de tu
              producto.</router-link
            >
          </li>
        </ul>
      </div>
    </div>
    <div class="flex justify-end gap-4 mt-10">
      <router-link to="/facebook">
        <img src="../assets/img/facebook.png" alt="logo" class="w-6 h-6" />
      </router-link>
      <router-link to="/instagram">
        <img src="../assets/img/instagram.png" alt="logo" class="w-6 h-6" />
      </router-link>
      <router-link to="/correo">
        <img src="../assets/img/correo-electronico.png" alt="logo" class="w-6 h-6" />
      </router-link>
    </div>
  </footer>
</template>

<script setup></script>

<style scoped>
h4 {
  font-weight: bold;
  font-size: 1.1rem;
}

.lista-footer {
  display: flex;
  flex-direction: column;
  gap: 0.5rem;
}

.lista-footer li {
  list-style: none;
  display: flex;
  align-items: center;
  justify-content: space-between;
  height: 50%;
  width: 100%;
  font-weight: semibold;
}
</style>
