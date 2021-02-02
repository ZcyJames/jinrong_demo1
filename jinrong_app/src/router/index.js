import { createRouter, createWebHashHistory } from 'vue-router'

const routes = [
  {
    path:'/',
    redirect:'/test'
  },
  {
    path: '/test',
    name: 'test',
    component: ()=>import('../views/test.vue'),

  }
]

const router = createRouter({
  history: createWebHashHistory(),
  routes
})

export default router
