<template>
  <div id="app">
    <PillowFight/>
  </div>
</template>

<script>
import PillowFight from './components/PillowFight.vue'

export default {
  name: 'app',
  components: {
      PillowFight
  }
}
</script>

<style>
#app {
  font-family: 'Avenir', Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
</style>
