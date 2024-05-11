const base = {
    get() {
        return {
            url : "http://localhost:8080/ssmu4knd/",
            name: "ssmu4knd",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssmu4knd/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "马拉松报名系统微信小程序"
        } 
    }
}
export default base
