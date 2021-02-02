<template>
  <div>
    <h1>这里是test页面</h1>
  </div>
</template>

<script>
import axios from 'axios'
export default {
  name: "test",
  mounted() {
      axios.post('/api/test3',{}).then(function (resp){
            var data=resp.data;
            console.log(data)
      })
  }
}
</script>

<style scoped>

</style>