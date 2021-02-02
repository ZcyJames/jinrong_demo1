import { createApp } from 'vue'
import App from './App.vue'
import router from './router'

// eslint-disable-next-line no-unused-vars
router.beforeEach((to,from,next) => {
    if(to.path ==='/test') {
        alert("进入test组件前");
        next();
    } else {
        next();
    }
});

// eslint-disable-next-line no-unused-vars
/*router.afterEach((to,from) => {
    if(from.matched) {
        alert("离开test组件后");
    }
})*/

createApp(App).use(router).mount('#app')
