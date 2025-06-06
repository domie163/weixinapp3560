import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import qiuyuan from '@/views/modules/qiuyuan/list'
    import forum from '@/views/modules/forum/list'
    import bisaixinxi from '@/views/modules/bisaixinxi/list'
    import saishigonggao from '@/views/modules/saishigonggao/list'
    import qiuduixinxi from '@/views/modules/qiuduixinxi/list'
    import discusssaishijijin from '@/views/modules/discusssaishijijin/list'
    import saishijijin from '@/views/modules/saishijijin/list'
    import duizhang from '@/views/modules/duizhang/list'
    import bisaibaoming from '@/views/modules/bisaibaoming/list'
    import config from '@/views/modules/config/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
      ,{
	path: '/qiuyuan',
        name: '球员',
        component: qiuyuan
      }
      ,{
	path: '/forum',
        name: '社区讨论',
        component: forum
      }
      ,{
	path: '/bisaixinxi',
        name: '比赛信息',
        component: bisaixinxi
      }
      ,{
	path: '/saishigonggao',
        name: '赛事公告',
        component: saishigonggao
      }
      ,{
	path: '/qiuduixinxi',
        name: '球队信息',
        component: qiuduixinxi
      }
      ,{
	path: '/discusssaishijijin',
        name: '赛事集锦评论',
        component: discusssaishijijin
      }
      ,{
	path: '/saishijijin',
        name: '赛事集锦',
        component: saishijijin
      }
      ,{
	path: '/duizhang',
        name: '队长',
        component: duizhang
      }
      ,{
	path: '/bisaibaoming',
        name: '比赛报名',
        component: bisaibaoming
      }
      ,{
	path: '/config',
        name: '轮播图管理',
        component: config
      }
    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
