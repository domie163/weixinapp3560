const base = {
    get() {
        return {
            url : "http://localhost:8080/ssm856m6/",
            name: "ssm856m6",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssm856m6/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "微信小程序校园工会体育报名系统"
        } 
    }
}
export default base
