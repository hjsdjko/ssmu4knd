<template>
	<view class="content">
		<form class="app-update-pv">
			
			<view :style='{"boxShadow":"0 0 2rpx rgba(0,0,0,.8)","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"#ccc","margin":"0","borderWidth":"0","borderStyle":"solid","height":"88rpx"}' class="cu-form-group">
				<view :style='{"width":"22%","fontSize":"24rpx","color":"rgba(0, 0, 0, 1)","textAlign":"left"}' class="title">比赛名称</view>
				<input :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 0)","borderColor":"rgba(205, 205, 205, 1)","borderRadius":"16rpx","color":"rgba(0, 0, 0, 1)","textAlign":"left","borderWidth":"2rpx","fontSize":"26rpx","borderStyle":"solid","height":"60rpx"}' :disabled="ro.bisaimingcheng" v-model="ruleForm.bisaimingcheng" placeholder="比赛名称"></input>
			</view>
			<view :style='{"boxShadow":"0 0 16rpx rgba(0,0,0,.3)","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"#ccc","margin":"0 0 20rpx 0","borderWidth":"0","borderStyle":"solid","height":"108rpx"}' class="cu-form-group" @tap="tupianTap" :class='left == "left"?"":"active"'>
				<view :style='{"width":"22%","fontSize":"24rpx","color":"rgba(1, 1, 1, 1)","textAlign":"left"}' class="title">图片</view>
				<view class="right-input" :style='{textAlign:"left"}' style="padding:0">
					<image :style='{"width":"100rpx","boxShadow":"0 0 16rpx rgba(0,0,0,.3)","borderRadius":"2%","textAlign":"left","height":"100rpx"}' class="avator" v-if="ruleForm.tupian" :src="ruleForm.tupian" mode="aspectFill"></image>
					<image :style='{"width":"100rpx","boxShadow":"0 0 16rpx rgba(0,0,0,.3)","borderRadius":"2%","textAlign":"left","height":"100rpx"}' class="avator" v-else src="../../static/gen/upload.png" mode="aspectFill"></image>
				</view>
			</view>
			<view :style='{"boxShadow":"0 0 2rpx rgba(0,0,0,.8)","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"#ccc","margin":"0","borderWidth":"0","borderStyle":"solid","height":"108rpx"}' class="cu-form-group select">
				<view :style='{"width":"22%","fontSize":"24rpx","color":"rgba(0, 0, 0, 1)","textAlign":"left"}' class="title">比赛日期</view>
				<picker mode="date" :value="ruleForm.bisairiqi" @change="bisairiqiChange">
					<view :style='{"boxShadow":"0 0 16rpx rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 0)","borderColor":"rgba(0,0,0,.6)","borderRadius":"16rpx","color":"rgba(0, 0, 0, 1)","textAlign":"left","borderWidth":"2rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' class="uni-input">{{ruleForm.bisairiqi?ruleForm.bisairiqi:"请选择比赛日期"}}</view>
				</picker>
			</view>
			<view :style='{"boxShadow":"0 0 2rpx rgba(0,0,0,.8)","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"#ccc","margin":"0","borderWidth":"0","borderStyle":"solid","height":"88rpx"}' class="cu-form-group">
				<view :style='{"width":"22%","fontSize":"24rpx","color":"rgba(0, 0, 0, 1)","textAlign":"left"}' class="title">比赛时间</view>
				<input :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 0)","borderColor":"rgba(205, 205, 205, 1)","borderRadius":"16rpx","color":"rgba(0, 0, 0, 1)","textAlign":"left","borderWidth":"2rpx","fontSize":"26rpx","borderStyle":"solid","height":"60rpx"}' :disabled="ro.bisaishijian" v-model="ruleForm.bisaishijian" placeholder="比赛时间"></input>
			</view>
			<view :style='{"boxShadow":"0 0 2rpx rgba(0,0,0,.8)","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"#ccc","margin":"0","borderWidth":"0","borderStyle":"solid","height":"88rpx"}' class="cu-form-group">
				<view :style='{"width":"22%","fontSize":"24rpx","color":"rgba(0, 0, 0, 1)","textAlign":"left"}' class="title">比赛地点</view>
				<input :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 0)","borderColor":"rgba(205, 205, 205, 1)","borderRadius":"16rpx","color":"rgba(0, 0, 0, 1)","textAlign":"left","borderWidth":"2rpx","fontSize":"26rpx","borderStyle":"solid","height":"60rpx"}' :disabled="ro.bisaididian" v-model="ruleForm.bisaididian" placeholder="比赛地点"></input>
			</view>
			<view :style='{"boxShadow":"0 0 2rpx rgba(0,0,0,.8)","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"#ccc","margin":"0","borderWidth":"0","borderStyle":"solid","height":"88rpx"}' class="cu-form-group">
				<view :style='{"width":"22%","fontSize":"24rpx","color":"rgba(0, 0, 0, 1)","textAlign":"left"}' class="title">报名人数</view>
				<input :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 0)","borderColor":"rgba(205, 205, 205, 1)","borderRadius":"16rpx","color":"rgba(0, 0, 0, 1)","textAlign":"left","borderWidth":"2rpx","fontSize":"26rpx","borderStyle":"solid","height":"60rpx"}' :disabled="ro.baomingrenshu" v-model="ruleForm.baomingrenshu" placeholder="报名人数"></input>
			</view>
			
			<!-- 否 -->
 

			<view :style='{"boxShadow":"0 0 2rpx rgba(0,0,0,.8)","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"#ccc","margin":"0","borderWidth":"0","borderStyle":"solid","height":"auto"}' class="cu-form-group">
				<view :style='{"width":"22%","fontSize":"24rpx","color":"rgba(0, 0, 0, 1)","textAlign":"left"}' class="title">比赛要求</view>
				<textarea :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 0)","borderColor":"rgba(205, 205, 205, 1)","borderRadius":"16rpx","color":"rgba(0, 0, 0, 1)","textAlign":"left","borderWidth":"2rpx","fontSize":"28rpx","borderStyle":"solid","height":"200rpx"}' v-model="ruleForm.bisaiyaoqiu" placeholder="比赛要求"></textarea>
			</view>
			
			<view :style='{"boxShadow":"0 0 2rpx rgba(0,0,0,.8)","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"#ccc","margin":"0","borderWidth":"0","borderStyle":"solid","height":"auto"}' class="cu-form-group">
				<view :style='{"width":"22%","fontSize":"24rpx","color":"rgba(0, 0, 0, 1)","textAlign":"left"}' class="title">比赛内容</view>
				<textarea :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 0)","borderColor":"rgba(205, 205, 205, 1)","borderRadius":"16rpx","color":"rgba(0, 0, 0, 1)","textAlign":"left","borderWidth":"2rpx","fontSize":"28rpx","borderStyle":"solid","height":"200rpx"}' v-model="ruleForm.bisaineirong" placeholder="比赛内容"></textarea>
			</view>
			
			<view class="btn">
				<button :style='{"boxShadow":"0 0 0px rgba(0,0,0,0) inset","backgroundColor":"rgba(244, 67, 54, 1)","borderColor":"rgba(57, 78, 99, 1)","borderRadius":"8rpx","color":"#fff","borderWidth":"0","width":"60%","fontSize":"28rpx","borderStyle":"solid","height":"76rpx"}' @tap="onSubmitTap" class="bg-red">提交</button>
			</view>
		</form>

			
	</view>
</template>

<script>
	import wPicker from "@/components/w-picker/w-picker.vue";

	export default {
		data() {
			return {
				ruleForm: {
				bisaimingcheng: '',
				tupian: '',
				bisairiqi: '',
				bisaishijian: '',
				bisaididian: '',
				baomingrenshu: '',
				bisaiyaoqiu: '',
				bisaineirong: '',
				},
				// 登陆用户信息
				user: {},
                                ro:{
                                   bisaimingcheng : false,
                                   tupian : false,
                                   bisairiqi : false,
                                   bisaishijian : false,
                                   bisaididian : false,
                                   baomingrenshu : false,
                                   bisaiyaoqiu : false,
                                   bisaineirong : false,
                                },
			}
		},
		components: {
			wPicker
		},
		computed: {
			
			
			
			
			
			
			
			
		},
		async onLoad(options) {
			let table = uni.getStorageSync("nowTable");
			// 获取用户信息
			let res = await this.$api.session(table);
			this.user = res.data;
			
			// ss读取


			// 如果有登陆，获取登陆后保存的userid
			this.ruleForm.userid = uni.getStorageSync("userid")
			if (options.refid) {
				// 如果上一级页面传递了refid，获取改refid数据信息
				this.ruleForm.refid = options.refid;
				this.ruleForm.nickname = uni.getStorageSync("nickname");
			}
			// 如果是更新操作
			if (options.id) {
				this.ruleForm.id = options.id;
				// 获取信息
				res = await this.$api.info(`saishixinxi`, this.ruleForm.id);
				this.ruleForm = res.data;
			}
			// 跨表
			if(options.cross){
				var obj = uni.getStorageSync('crossObj');
				for (var o in obj){
					if(o=='bisaimingcheng'){
					this.ruleForm.bisaimingcheng = obj[o];
					this.ro.bisaimingcheng = true;
					continue;
					}
					if(o=='tupian'){
					this.ruleForm.tupian = obj[o];
					this.ro.tupian = true;
					continue;
					}
					if(o=='bisairiqi'){
					this.ruleForm.bisairiqi = obj[o];
					this.ro.bisairiqi = true;
					continue;
					}
					if(o=='bisaishijian'){
					this.ruleForm.bisaishijian = obj[o];
					this.ro.bisaishijian = true;
					continue;
					}
					if(o=='bisaididian'){
					this.ruleForm.bisaididian = obj[o];
					this.ro.bisaididian = true;
					continue;
					}
					if(o=='baomingrenshu'){
					this.ruleForm.baomingrenshu = obj[o];
					this.ro.baomingrenshu = true;
					continue;
					}
					if(o=='bisaiyaoqiu'){
					this.ruleForm.bisaiyaoqiu = obj[o];
					this.ro.bisaiyaoqiu = true;
					continue;
					}
					if(o=='bisaineirong'){
					this.ruleForm.bisaineirong = obj[o];
					this.ro.bisaineirong = true;
					continue;
					}
				}
			}
			this.styleChange()
		},
		methods: {
			styleChange() {
				this.$nextTick(()=>{
					// document.querySelectorAll('.app-update-pv .cu-form-group .uni-input-input').forEach(el=>{
					//   el.style.backgroundColor = this.addUpdateForm.input.content.backgroundColor
					// })
				})
			},

			// 多级联动参数

			bisairiqiChange(e) {
				this.ruleForm.bisairiqi = e.target.value;
				this.$forceUpdate();
			},



			tupianTap() {
				let _this = this;
				this.$api.upload(function(res) {
					_this.ruleForm.tupian = _this.$base.url + 'upload/' + res.file;
					_this.$forceUpdate();
					_this.$nextTick(()=>{
						_this.styleChange()
					})
				});
			},

			getUUID () {
				return new Date().getTime();
			},
			async onSubmitTap() {
				if((!this.ruleForm.bisaimingcheng)){
					this.$utils.msg(`比赛名称不能为空`);
					return
				}
				if((!this.ruleForm.baomingrenshu)){
					this.$utils.msg(`报名人数不能为空`);
					return
				}
				if(this.ruleForm.baomingrenshu&&(!this.$validate.isIntNumer(this.ruleForm.baomingrenshu))){
					this.$utils.msg(`报名人数应输入整数`);
					return
				}
				if(this.ruleForm.id){
					await this.$api.update(`saishixinxi`, this.ruleForm);
				}else{
					await this.$api.add(`saishixinxi`, this.ruleForm);
				}
				this.$utils.msgBack('提交成功');
			},
			optionsChange(e) {
				this.index = e.target.value
			},
			bindDateChange(e) {
				this.date = e.target.value
			},
			getDate(type) {
				const date = new Date();
				let year = date.getFullYear();
				let month = date.getMonth() + 1;
				let day = date.getDate();
				if (type === 'start') {
					year = year - 60;
				} else if (type === 'end') {
					year = year + 2;
				}
				month = month > 9 ? month : '0' + month;;
				day = day > 9 ? day : '0' + day;
				return `${year}-${month}-${day}`;
			},
			toggleTab(str) {
				this.$refs[str].show();
			}
		}
	}
</script>

<style lang="scss" scoped>
	.container {
		padding: 20upx;
	}
	
	.content:after {
		position: fixed;
		top: 0;
		right: 0;
		left: 0;
		bottom: 0;
		content: '';
		background-attachment: fixed;
		background-size: cover;
		background-position: center;
	}

	textarea {
		border: 1upx solid #EEEEEE;
		border-radius: 20upx;
		padding: 20upx;
	}

	.title {
		width: 180upx;
	}

	.avator {
		width: 150upx;
		height: 60upx;
	}

	.right-input {
		flex: 1;
		text-align: left;
		padding: 0 24upx;
	}
	
	.cu-form-group.active {
		justify-content: space-between;
	}
	
	.btn {
	  display: flex;
	  align-items: center;
	  justify-content: center;
	  flex-wrap: wrap;
	  padding: 20upx 0;
	}
	
	.cu-form-group {
		padding: 0 24upx;
		background-color: transparent;
		min-height: inherit;
	}
	
	.cu-form-group+.cu-form-group {
		border: 0;
	}
	
	.cu-form-group uni-input {
		padding: 0 30upx;
	}
	
	.uni-input {
		padding: 0 30upx;
	}
	
	.cu-form-group uni-textarea {
		padding: 30upx;
		margin: 0;
	}
	
	.cu-form-group uni-picker::after {
		line-height: 88rpx;
	}
	
	.select .uni-input {
		line-height: 88rpx;
	}
	
	.input .right-input {
		line-height: 60rpx;
	}
</style>
