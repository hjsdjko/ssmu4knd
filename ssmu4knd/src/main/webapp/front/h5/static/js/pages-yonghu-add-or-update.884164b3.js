(window["webpackJsonp"]=window["webpackJsonp"]||[]).push([["pages-yonghu-add-or-update"],{"04b3":function(e,r,t){"use strict";t.r(r);var i=t("825a"),o=t.n(i);for(var n in i)"default"!==n&&function(e){t.d(r,e,(function(){return i[e]}))}(n);r["default"]=o.a},"0da0":function(e,r,t){var i=t("d0b5");"string"===typeof i&&(i=[[e.i,i,""]]),i.locals&&(e.exports=i.locals);var o=t("4f06").default;o("56ced3d2",i,!0,{sourceMap:!1,shadowMode:!1})},"195e":function(e,r,t){"use strict";var i=t("0da0"),o=t.n(i);o.a},"49aa":function(e,r,t){"use strict";var i,o=function(){var e=this,r=e.$createElement,t=e._self._c||r;return t("v-uni-view",{staticClass:"content"},[t("v-uni-form",{staticClass:"app-update-pv"},[t("v-uni-view",{staticClass:"cu-form-group",style:{boxShadow:"0 0 2rpx rgba(0,0,0,.8)",backgroundColor:"rgba(255, 255, 255, 0.25)",borderColor:"#ccc",margin:"0",borderWidth:"0",borderStyle:"solid",height:"88rpx"}},[t("v-uni-view",{staticClass:"title",style:{width:"22%",fontSize:"24rpx",color:"rgba(0, 0, 0, 1)",textAlign:"left"}},[e._v("用户名")]),t("v-uni-input",{style:{boxShadow:"0 0 0px rgba(0,0,0,.6) inset",backgroundColor:"rgba(255, 255, 255, 0)",borderColor:"rgba(205, 205, 205, 1)",borderRadius:"16rpx",color:"rgba(0, 0, 0, 1)",textAlign:"left",borderWidth:"2rpx",fontSize:"26rpx",borderStyle:"solid",height:"60rpx"},attrs:{disabled:e.ro.yonghuming,placeholder:"用户名"},model:{value:e.ruleForm.yonghuming,callback:function(r){e.$set(e.ruleForm,"yonghuming",r)},expression:"ruleForm.yonghuming"}})],1),t("v-uni-view",{staticClass:"cu-form-group",style:{boxShadow:"0 0 2rpx rgba(0,0,0,.8)",backgroundColor:"rgba(255, 255, 255, 0.25)",borderColor:"#ccc",margin:"0",borderWidth:"0",borderStyle:"solid",height:"88rpx"}},[t("v-uni-view",{staticClass:"title",style:{width:"22%",fontSize:"24rpx",color:"rgba(0, 0, 0, 1)",textAlign:"left"}},[e._v("密码")]),t("v-uni-input",{style:{boxShadow:"0 0 0px rgba(0,0,0,.6) inset",backgroundColor:"rgba(255, 255, 255, 0)",borderColor:"rgba(205, 205, 205, 1)",borderRadius:"16rpx",color:"rgba(0, 0, 0, 1)",textAlign:"left",borderWidth:"2rpx",fontSize:"26rpx",borderStyle:"solid",height:"60rpx"},attrs:{disabled:e.ro.mima,placeholder:"密码"},model:{value:e.ruleForm.mima,callback:function(r){e.$set(e.ruleForm,"mima",r)},expression:"ruleForm.mima"}})],1),t("v-uni-view",{staticClass:"cu-form-group",style:{boxShadow:"0 0 2rpx rgba(0,0,0,.8)",backgroundColor:"rgba(255, 255, 255, 0.25)",borderColor:"#ccc",margin:"0",borderWidth:"0",borderStyle:"solid",height:"88rpx"}},[t("v-uni-view",{staticClass:"title",style:{width:"22%",fontSize:"24rpx",color:"rgba(0, 0, 0, 1)",textAlign:"left"}},[e._v("姓名")]),t("v-uni-input",{style:{boxShadow:"0 0 0px rgba(0,0,0,.6) inset",backgroundColor:"rgba(255, 255, 255, 0)",borderColor:"rgba(205, 205, 205, 1)",borderRadius:"16rpx",color:"rgba(0, 0, 0, 1)",textAlign:"left",borderWidth:"2rpx",fontSize:"26rpx",borderStyle:"solid",height:"60rpx"},attrs:{disabled:e.ro.xingming,placeholder:"姓名"},model:{value:e.ruleForm.xingming,callback:function(r){e.$set(e.ruleForm,"xingming",r)},expression:"ruleForm.xingming"}})],1),t("v-uni-view",{staticClass:"cu-form-group",class:"left"==e.left?"":"active",style:{boxShadow:"0 0 16rpx rgba(0,0,0,.3)",backgroundColor:"rgba(255, 255, 255, 0.25)",borderColor:"#ccc",margin:"0 0 20rpx 0",borderWidth:"0",borderStyle:"solid",height:"108rpx"},on:{click:function(r){arguments[0]=r=e.$handleEvent(r),e.touxiangTap.apply(void 0,arguments)}}},[t("v-uni-view",{staticClass:"title",style:{width:"22%",fontSize:"24rpx",color:"rgba(1, 1, 1, 1)",textAlign:"left"}},[e._v("头像")]),t("v-uni-view",{staticClass:"right-input",staticStyle:{padding:"0"},style:{textAlign:"left"}},[e.ruleForm.touxiang?t("v-uni-image",{staticClass:"avator",style:{width:"100rpx",boxShadow:"0 0 16rpx rgba(0,0,0,.3)",borderRadius:"2%",textAlign:"left",height:"100rpx"},attrs:{src:e.ruleForm.touxiang,mode:"aspectFill"}}):t("v-uni-image",{staticClass:"avator",style:{width:"100rpx",boxShadow:"0 0 16rpx rgba(0,0,0,.3)",borderRadius:"2%",textAlign:"left",height:"100rpx"},attrs:{src:"../../static/gen/upload.png",mode:"aspectFill"}})],1)],1),t("v-uni-view",{staticClass:"cu-form-group select",style:{boxShadow:"0 0 2rpx rgba(0,0,0,.8)",backgroundColor:"rgba(255, 255, 255, 0.25)",borderColor:"#ccc",margin:"0",borderWidth:"0",borderStyle:"solid",height:"108rpx"}},[t("v-uni-view",{staticClass:"title",style:{width:"22%",fontSize:"24rpx",color:"rgba(0, 0, 0, 1)",textAlign:"left"}},[e._v("性别")]),t("v-uni-picker",{attrs:{value:e.xingbieIndex,range:e.xingbieOptions},on:{change:function(r){arguments[0]=r=e.$handleEvent(r),e.xingbieChange.apply(void 0,arguments)}}},[t("v-uni-view",{staticClass:"uni-input",style:{boxShadow:"0 0 16rpx rgba(0,0,0,.6) inset",backgroundColor:"rgba(255, 255, 255, 0)",borderColor:"rgba(0,0,0,.6)",borderRadius:"16rpx",color:"rgba(0, 0, 0, 1)",textAlign:"left",borderWidth:"2rpx",fontSize:"28rpx",borderStyle:"solid",height:"88rpx"}},[e._v(e._s(e.ruleForm.xingbie?e.ruleForm.xingbie:"请选择性别"))])],1)],1),t("v-uni-view",{staticClass:"cu-form-group",style:{boxShadow:"0 0 2rpx rgba(0,0,0,.8)",backgroundColor:"rgba(255, 255, 255, 0.25)",borderColor:"#ccc",margin:"0",borderWidth:"0",borderStyle:"solid",height:"88rpx"}},[t("v-uni-view",{staticClass:"title",style:{width:"22%",fontSize:"24rpx",color:"rgba(0, 0, 0, 1)",textAlign:"left"}},[e._v("手机")]),t("v-uni-input",{style:{boxShadow:"0 0 0px rgba(0,0,0,.6) inset",backgroundColor:"rgba(255, 255, 255, 0)",borderColor:"rgba(205, 205, 205, 1)",borderRadius:"16rpx",color:"rgba(0, 0, 0, 1)",textAlign:"left",borderWidth:"2rpx",fontSize:"26rpx",borderStyle:"solid",height:"60rpx"},attrs:{disabled:e.ro.shouji,placeholder:"手机"},model:{value:e.ruleForm.shouji,callback:function(r){e.$set(e.ruleForm,"shouji",r)},expression:"ruleForm.shouji"}})],1),t("v-uni-view",{staticClass:"cu-form-group",style:{boxShadow:"0 0 2rpx rgba(0,0,0,.8)",backgroundColor:"rgba(255, 255, 255, 0.25)",borderColor:"#ccc",margin:"0",borderWidth:"0",borderStyle:"solid",height:"88rpx"}},[t("v-uni-view",{staticClass:"title",style:{width:"22%",fontSize:"24rpx",color:"rgba(0, 0, 0, 1)",textAlign:"left"}},[e._v("邮箱")]),t("v-uni-input",{style:{boxShadow:"0 0 0px rgba(0,0,0,.6) inset",backgroundColor:"rgba(255, 255, 255, 0)",borderColor:"rgba(205, 205, 205, 1)",borderRadius:"16rpx",color:"rgba(0, 0, 0, 1)",textAlign:"left",borderWidth:"2rpx",fontSize:"26rpx",borderStyle:"solid",height:"60rpx"},attrs:{disabled:e.ro.youxiang,placeholder:"邮箱"},model:{value:e.ruleForm.youxiang,callback:function(r){e.$set(e.ruleForm,"youxiang",r)},expression:"ruleForm.youxiang"}})],1),t("v-uni-view",{staticClass:"cu-form-group",style:{boxShadow:"0 0 2rpx rgba(0,0,0,.8)",backgroundColor:"rgba(255, 255, 255, 0.25)",borderColor:"#ccc",margin:"0",borderWidth:"0",borderStyle:"solid",height:"88rpx"}},[t("v-uni-view",{staticClass:"title",style:{width:"22%",fontSize:"24rpx",color:"rgba(0, 0, 0, 1)",textAlign:"left"}},[e._v("余额")]),t("v-uni-input",{style:{boxShadow:"0 0 0px rgba(0,0,0,.6) inset",backgroundColor:"rgba(255, 255, 255, 0)",borderColor:"rgba(205, 205, 205, 1)",borderRadius:"16rpx",color:"rgba(0, 0, 0, 1)",textAlign:"left",borderWidth:"2rpx",fontSize:"26rpx",borderStyle:"solid",height:"60rpx"},attrs:{disabled:e.ro.money,placeholder:"余额"},model:{value:e.ruleForm.money,callback:function(r){e.$set(e.ruleForm,"money",r)},expression:"ruleForm.money"}})],1),t("v-uni-view",{staticClass:"btn"},[t("v-uni-button",{staticClass:"bg-red",style:{boxShadow:"0 0 0px rgba(0,0,0,0) inset",backgroundColor:"rgba(244, 67, 54, 1)",borderColor:"rgba(57, 78, 99, 1)",borderRadius:"8rpx",color:"#fff",borderWidth:"0",width:"60%",fontSize:"28rpx",borderStyle:"solid",height:"76rpx"},on:{click:function(r){arguments[0]=r=e.$handleEvent(r),e.onSubmitTap.apply(void 0,arguments)}}},[e._v("提交")])],1)],1)],1)},n=[];t.d(r,"b",(function(){return o})),t.d(r,"c",(function(){return n})),t.d(r,"a",(function(){return i}))},"6e35":function(e,r,t){"use strict";t.r(r);var i=t("49aa"),o=t("04b3");for(var n in o)"default"!==n&&function(e){t.d(r,e,(function(){return o[e]}))}(n);t("195e");var a,u=t("f0c5"),s=Object(u["a"])(o["default"],i["b"],i["c"],!1,null,"6c6e6af6",null,!1,i["a"],a);r["default"]=s.exports},"825a":function(e,r,t){"use strict";var i=t("4ea4");Object.defineProperty(r,"__esModule",{value:!0}),r.default=void 0,t("ac6a"),t("28a5"),t("96cf");var o=i(t("3b8d")),n=i(t("e2b1")),a={data:function(){return{ruleForm:{yonghuming:"",mima:"",xingming:"",touxiang:"",xingbie:"",shouji:"",youxiang:"",money:""},xingbieOptions:[],xingbieIndex:0,user:{},ro:{yonghuming:!1,mima:!1,xingming:!1,touxiang:!1,xingbie:!1,shouji:!1,youxiang:!1,money:!1}}},components:{wPicker:n.default},computed:{},onLoad:function(){var e=(0,o.default)(regeneratorRuntime.mark((function e(r){var t,i,o,n;return regeneratorRuntime.wrap((function(e){while(1)switch(e.prev=e.next){case 0:return t=uni.getStorageSync("nowTable"),e.next=3,this.$api.session(t);case 3:if(i=e.sent,this.user=i.data,this.xingbieOptions="男,女".split(","),this.ruleForm.userid=uni.getStorageSync("userid"),r.refid&&(this.ruleForm.refid=r.refid,this.ruleForm.nickname=uni.getStorageSync("nickname")),!r.id){e.next=14;break}return this.ruleForm.id=r.id,e.next=12,this.$api.info("yonghu",this.ruleForm.id);case 12:i=e.sent,this.ruleForm=i.data;case 14:if(!r.cross){e.next=53;break}o=uni.getStorageSync("crossObj"),e.t0=regeneratorRuntime.keys(o);case 17:if((e.t1=e.t0()).done){e.next=53;break}if(n=e.t1.value,"yonghuming"!=n){e.next=23;break}return this.ruleForm.yonghuming=o[n],this.ro.yonghuming=!0,e.abrupt("continue",17);case 23:if("mima"!=n){e.next=27;break}return this.ruleForm.mima=o[n],this.ro.mima=!0,e.abrupt("continue",17);case 27:if("xingming"!=n){e.next=31;break}return this.ruleForm.xingming=o[n],this.ro.xingming=!0,e.abrupt("continue",17);case 31:if("touxiang"!=n){e.next=35;break}return this.ruleForm.touxiang=o[n],this.ro.touxiang=!0,e.abrupt("continue",17);case 35:if("xingbie"!=n){e.next=39;break}return this.ruleForm.xingbie=o[n],this.ro.xingbie=!0,e.abrupt("continue",17);case 39:if("shouji"!=n){e.next=43;break}return this.ruleForm.shouji=o[n],this.ro.shouji=!0,e.abrupt("continue",17);case 43:if("youxiang"!=n){e.next=47;break}return this.ruleForm.youxiang=o[n],this.ro.youxiang=!0,e.abrupt("continue",17);case 47:if("money"!=n){e.next=51;break}return this.ruleForm.money=o[n],this.ro.money=!0,e.abrupt("continue",17);case 51:e.next=17;break;case 53:this.styleChange();case 54:case"end":return e.stop()}}),e,this)})));function r(r){return e.apply(this,arguments)}return r}(),methods:{styleChange:function(){this.$nextTick((function(){}))},xingbieChange:function(e){this.xingbieIndex=e.target.value,this.ruleForm.xingbie=this.xingbieOptions[this.xingbieIndex]},touxiangTap:function(){var e=this;this.$api.upload((function(r){e.ruleForm.touxiang=e.$base.url+"upload/"+r.file,e.$forceUpdate(),e.$nextTick((function(){e.styleChange()}))}))},getUUID:function(){return(new Date).getTime()},onSubmitTap:function(){var e=(0,o.default)(regeneratorRuntime.mark((function e(){return regeneratorRuntime.wrap((function(e){while(1)switch(e.prev=e.next){case 0:if(this.ruleForm.yonghuming){e.next=3;break}return this.$utils.msg("用户名不能为空"),e.abrupt("return");case 3:if(this.ruleForm.mima){e.next=6;break}return this.$utils.msg("密码不能为空"),e.abrupt("return");case 6:if(this.ruleForm.xingming){e.next=9;break}return this.$utils.msg("姓名不能为空"),e.abrupt("return");case 9:if(!this.ruleForm.shouji||this.$validate.isMobile(this.ruleForm.shouji)){e.next=12;break}return this.$utils.msg("手机应输入手机格式"),e.abrupt("return");case 12:if(!this.ruleForm.youxiang||this.$validate.isEmail(this.ruleForm.youxiang)){e.next=15;break}return this.$utils.msg("邮箱应输入邮件格式"),e.abrupt("return");case 15:if(!this.ruleForm.money||this.$validate.isNumber(this.ruleForm.money)){e.next=18;break}return this.$utils.msg("余额应输入数字"),e.abrupt("return");case 18:if(!this.ruleForm.id){e.next=23;break}return e.next=21,this.$api.update("yonghu",this.ruleForm);case 21:e.next=25;break;case 23:return e.next=25,this.$api.add("yonghu",this.ruleForm);case 25:this.$utils.msgBack("提交成功");case 26:case"end":return e.stop()}}),e,this)})));function r(){return e.apply(this,arguments)}return r}(),optionsChange:function(e){this.index=e.target.value},bindDateChange:function(e){this.date=e.target.value},getDate:function(e){var r=new Date,t=r.getFullYear(),i=r.getMonth()+1,o=r.getDate();return"start"===e?t-=60:"end"===e&&(t+=2),i=i>9?i:"0"+i,o=o>9?o:"0"+o,"".concat(t,"-").concat(i,"-").concat(o)},toggleTab:function(e){this.$refs[e].show()}}};r.default=a},d0b5:function(e,r,t){var i=t("24fb");r=i(!1),r.push([e.i,'@charset "UTF-8";\n/**\r\n * 这里是uni-app内置的常用样式变量\r\n *\r\n * uni-app 官方扩展插件及插件市场（https://ext.dcloud.net.cn）上很多三方插件均使用了这些样式变量\r\n * 如果你是插件开发者，建议你使用scss预处理，并在插件代码中直接使用这些变量（无需 import 这个文件），方便用户通过搭积木的方式开发整体风格一致的App\r\n *\r\n */\n/**\r\n * 如果你是App开发者（插件使用者），你可以通过修改这些变量来定制自己的插件主题，实现自定义主题功能\r\n *\r\n * 如果你的项目同样使用了scss预处理，你也可以直接在你的 scss 代码中使用如下变量，同时无需 import 这个文件\r\n */\n/* 颜色变量 */\n/* 行为相关颜色 */\n/* 文字基本颜色 */\n/* 背景颜色 */\n/* 边框颜色 */\n/* 尺寸变量 */\n/* 文字尺寸 */\n/* 图片尺寸 */\n/* Border Radius */\n/* 水平间距 */\n/* 垂直间距 */\n/* 透明度 */\n/* 文章场景相关 */.container[data-v-6c6e6af6]{padding:%?20?%}.content[data-v-6c6e6af6]:after{position:fixed;top:0;right:0;left:0;bottom:0;content:"";background-attachment:fixed;background-size:cover;background-position:50%}uni-textarea[data-v-6c6e6af6]{border:%?1?% solid #eee;border-radius:%?20?%;padding:%?20?%}.title[data-v-6c6e6af6]{width:%?180?%}.avator[data-v-6c6e6af6]{width:%?150?%;height:%?60?%}.right-input[data-v-6c6e6af6]{-webkit-box-flex:1;-webkit-flex:1;flex:1;text-align:left;padding:0 %?24?%}.cu-form-group.active[data-v-6c6e6af6]{-webkit-box-pack:justify;-webkit-justify-content:space-between;justify-content:space-between}.btn[data-v-6c6e6af6]{display:-webkit-box;display:-webkit-flex;display:flex;-webkit-box-align:center;-webkit-align-items:center;align-items:center;-webkit-box-pack:center;-webkit-justify-content:center;justify-content:center;-webkit-flex-wrap:wrap;flex-wrap:wrap;padding:%?20?% 0}.cu-form-group[data-v-6c6e6af6]{padding:0 %?24?%;background-color:initial;min-height:inherit}.cu-form-group + .cu-form-group[data-v-6c6e6af6]{border:0}.cu-form-group uni-input[data-v-6c6e6af6]{padding:0 %?30?%}.uni-input[data-v-6c6e6af6]{padding:0 %?30?%}.cu-form-group uni-textarea[data-v-6c6e6af6]{padding:%?30?%;margin:0}.cu-form-group uni-picker[data-v-6c6e6af6]::after{line-height:%?88?%}.select .uni-input[data-v-6c6e6af6]{line-height:%?88?%}.input .right-input[data-v-6c6e6af6]{line-height:%?60?%}',""]),e.exports=r}}]);