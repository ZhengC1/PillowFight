<template>
<p> hello </p>
</template>
<script>
import axios from 'axios';
export default {
    name: 'PillowFight',
    beforeCreate() {
            axios.get('http://localhost:8080/api/User', {
        headers: {"Access-Control-Allow-Origin": "*"}
        }).then(response => {
            this.users = response.data;
        }).catch(e => {
            this.errors = e 
        })
    },
}
</script>
<style>
</style>
