<template>
	<view class="content">
		<view class="logo" v-if="false">
			<image :style='{"boxShadow":"0 0 16rpx #59f43e","borderColor":"#ccc","borderRadius":"40rpx","borderWidth":"2rpx","width":"160rpx","borderStyle":"solid","url":"http://codegen.caihongy.cn/20201024/ed5e326ca66f403aa3197b5fbb4ec733.jpg","isShow":false,"height":"160rpx"}' src='http://codegen.caihongy.cn/20201024/ed5e326ca66f403aa3197b5fbb4ec733.jpg' mode="aspectFill"></image>
		</view>
		<view v-if="tableName=='qiuyuan'" class="uni-form-item uni-column">
			<input :style='{"borderColor":"rgba(242, 199, 68, 1)","backgroundColor":"#fff","borderRadius":"32rpx","color":"#333","textAlign":"left","borderWidth":"4rpx 4rpx 4rpx 4rpx","fontSize":"24rpx","borderStyle":"solid","height":"80rpx"}' v-model="ruleForm.zhanghao" type="text" class="uni-input" name="" placeholder="账号" />
		</view>
		<view v-if="tableName=='qiuyuan'" class="uni-form-item uni-column">
			<input :style='{"borderColor":"rgba(242, 199, 68, 1)","backgroundColor":"#fff","borderRadius":"32rpx","color":"#333","textAlign":"left","borderWidth":"4rpx 4rpx 4rpx 4rpx","fontSize":"24rpx","borderStyle":"solid","height":"80rpx"}' v-model="ruleForm.mima" type="text" class="uni-input" name="" placeholder="密码" />
		</view>
		<view v-if="tableName=='qiuyuan'" class="uni-form-item uni-column">
			<input :style='{"borderColor":"rgba(242, 199, 68, 1)","backgroundColor":"#fff","borderRadius":"32rpx","color":"#333","textAlign":"left","borderWidth":"4rpx 4rpx 4rpx 4rpx","fontSize":"24rpx","borderStyle":"solid","height":"80rpx"}' v-model="ruleForm.xingming" type="text" class="uni-input" name="" placeholder="姓名" />
		</view>
		<view v-if="tableName=='qiuyuan'" class="uni-form-item uni-column">
			<input :style='{"borderColor":"rgba(242, 199, 68, 1)","backgroundColor":"#fff","borderRadius":"32rpx","color":"#333","textAlign":"left","borderWidth":"4rpx 4rpx 4rpx 4rpx","fontSize":"24rpx","borderStyle":"solid","height":"80rpx"}' v-model="ruleForm.nianling" type="text" class="uni-input" name="" placeholder="年龄" />
		</view>
		<view v-if="tableName=='qiuyuan'" class="uni-form-item uni-column">
                        <picker @change="qiuyuanxingbieChange" :value="qiuyuanxingbieIndex" :range="qiuyuanxingbieOptions">
                                <view :style='{"borderColor":"rgba(242, 199, 68, 1)","backgroundColor":"#fff","borderRadius":"32rpx","color":"#333","textAlign":"left","borderWidth":"4rpx 4rpx 4rpx 4rpx","fontSize":"24rpx","borderStyle":"solid","height":"80rpx"}' class="uni-input">{{ruleForm.xingbie?ruleForm.xingbie:"请选择性别"}}</view>
                        </picker>
                </view>
		<view v-if="tableName=='qiuyuan'" class="uni-form-item uni-column">
			<input :style='{"borderColor":"rgba(242, 199, 68, 1)","backgroundColor":"#fff","borderRadius":"32rpx","color":"#333","textAlign":"left","borderWidth":"4rpx 4rpx 4rpx 4rpx","fontSize":"24rpx","borderStyle":"solid","height":"80rpx"}' v-model="ruleForm.shouji" type="text" class="uni-input" name="" placeholder="手机" />
		</view>
		<view v-if="tableName=='duizhang'" class="uni-form-item uni-column">
			<input :style='{"borderColor":"rgba(242, 199, 68, 1)","backgroundColor":"#fff","borderRadius":"32rpx","color":"#333","textAlign":"left","borderWidth":"4rpx 4rpx 4rpx 4rpx","fontSize":"24rpx","borderStyle":"solid","height":"80rpx"}' v-model="ruleForm.duizhangzhanghao" type="text" class="uni-input" name="" placeholder="队长账号" />
		</view>
		<view v-if="tableName=='duizhang'" class="uni-form-item uni-column">
			<input :style='{"borderColor":"rgba(242, 199, 68, 1)","backgroundColor":"#fff","borderRadius":"32rpx","color":"#333","textAlign":"left","borderWidth":"4rpx 4rpx 4rpx 4rpx","fontSize":"24rpx","borderStyle":"solid","height":"80rpx"}' v-model="ruleForm.mima" type="text" class="uni-input" name="" placeholder="密码" />
		</view>
		<view v-if="tableName=='duizhang'" class="uni-form-item uni-column">
			<input :style='{"borderColor":"rgba(242, 199, 68, 1)","backgroundColor":"#fff","borderRadius":"32rpx","color":"#333","textAlign":"left","borderWidth":"4rpx 4rpx 4rpx 4rpx","fontSize":"24rpx","borderStyle":"solid","height":"80rpx"}' v-model="ruleForm.duizhangxingming" type="text" class="uni-input" name="" placeholder="队长姓名" />
		</view>
		<view v-if="tableName=='duizhang'" class="uni-form-item uni-column">
			<input :style='{"borderColor":"rgba(242, 199, 68, 1)","backgroundColor":"#fff","borderRadius":"32rpx","color":"#333","textAlign":"left","borderWidth":"4rpx 4rpx 4rpx 4rpx","fontSize":"24rpx","borderStyle":"solid","height":"80rpx"}' v-model="ruleForm.nianling" type="text" class="uni-input" name="" placeholder="年龄" />
		</view>
		<view v-if="tableName=='duizhang'" class="uni-form-item uni-column">
                        <picker @change="duizhangxingbieChange" :value="duizhangxingbieIndex" :range="duizhangxingbieOptions">
                                <view :style='{"borderColor":"rgba(242, 199, 68, 1)","backgroundColor":"#fff","borderRadius":"32rpx","color":"#333","textAlign":"left","borderWidth":"4rpx 4rpx 4rpx 4rpx","fontSize":"24rpx","borderStyle":"solid","height":"80rpx"}' class="uni-input">{{ruleForm.xingbie?ruleForm.xingbie:"请选择性别"}}</view>
                        </picker>
                </view>
		<view v-if="tableName=='duizhang'" class="uni-form-item uni-column">
			<input :style='{"borderColor":"rgba(242, 199, 68, 1)","backgroundColor":"#fff","borderRadius":"32rpx","color":"#333","textAlign":"left","borderWidth":"4rpx 4rpx 4rpx 4rpx","fontSize":"24rpx","borderStyle":"solid","height":"80rpx"}' v-model="ruleForm.shouji" type="text" class="uni-input" name="" placeholder="手机" />
		</view>
		<view>
			<button @tap="register" type="primary" :style='{"borderColor":"#ccc","backgroundColor":"rgba(242, 199, 68, 1)","borderRadius":"6rpx","color":"rgba(0, 0, 0, 1)","borderWidth":"0px","fontSize":"30rpx","borderStyle":"solid","height":"76rpx"}'>注册</button>
		</view>
	</view>
</template>

<script>
	export default {
		data() {
			return {
                                qiuyuanxingbieOptions: [],
                                qiuyuanxingbieIndex: 0,
                                duizhangxingbieOptions: [],
                                duizhangxingbieIndex: 0,
				ruleForm: {
				},
				tableName:""
			}
		},
		async onLoad() {
			let res = [];
			let table = uni.getStorageSync("loginTable");
	    		this.tableName = table;

                        // 自定义下拉框值
			if(this.tableName=='qiuyuan'){
                        	this.qiuyuanxingbieOptions = "男,女".split(',');
				this.ruleForm.xingbie=this.qiuyuanxingbieOptions[0]
			}
                        // 自定义下拉框值
			if(this.tableName=='duizhang'){
                        	this.duizhangxingbieOptions = "男,女".split(',');
				this.ruleForm.xingbie=this.duizhangxingbieOptions[0]
			}
			
			this.styleChange()
		},
		methods: {
                        // 下拉变化
                        qiuyuanxingbieChange(e) {
                                this.qiuyuanxingbieIndex = e.target.value
                                this.ruleForm.xingbie = this.qiuyuanxingbieOptions[this.qiuyuanxingbieIndex]
                        },
                        // 下拉变化
                        duizhangxingbieChange(e) {
                                this.duizhangxingbieIndex = e.target.value
                                this.ruleForm.xingbie = this.duizhangxingbieOptions[this.duizhangxingbieIndex]
                        },

			styleChange() {
				this.$nextTick(()=>{
					// document.querySelectorAll('.uni-input .uni-input-input').forEach(el=>{
					//   el.style.backgroundColor = this.registerFrom.content.input.backgroundColor
					// })
				})
			},
			// 获取uuid
			getUUID () {
				return new Date().getTime();
			},
			// 注册
			async register() {
				if((!this.ruleForm.zhanghao) && `qiuyuan` == this.tableName){
					this.$utils.msg(`账号不能为空`);
					return
				}
				if((!this.ruleForm.mima) && `qiuyuan` == this.tableName){
					this.$utils.msg(`密码不能为空`);
					return
				}
				if((!this.ruleForm.xingming) && `qiuyuan` == this.tableName){
					this.$utils.msg(`姓名不能为空`);
					return
				}
				if((!this.ruleForm.nianling) && `qiuyuan` == this.tableName){
					this.$utils.msg(`年龄不能为空`);
					return
				}
				if(`qiuyuan` == this.tableName && this.ruleForm.nianling&&(!this.$validate.isIntNumer(this.ruleForm.nianling))){
					this.$utils.msg(`年龄应输入整数`);
					return
				}
				if((!this.ruleForm.shouji) && `qiuyuan` == this.tableName){
					this.$utils.msg(`手机不能为空`);
					return
				}
				if(`qiuyuan` == this.tableName && this.ruleForm.shouji&&(!this.$validate.isMobile(this.ruleForm.shouji))){
					this.$utils.msg(`手机应输入手机格式`);
					return
				}
				if((!this.ruleForm.duizhangzhanghao) && `duizhang` == this.tableName){
					this.$utils.msg(`队长账号不能为空`);
					return
				}
				if((!this.ruleForm.mima) && `duizhang` == this.tableName){
					this.$utils.msg(`密码不能为空`);
					return
				}
				if((!this.ruleForm.duizhangxingming) && `duizhang` == this.tableName){
					this.$utils.msg(`队长姓名不能为空`);
					return
				}
				if((!this.ruleForm.nianling) && `duizhang` == this.tableName){
					this.$utils.msg(`年龄不能为空`);
					return
				}
				if(`duizhang` == this.tableName && this.ruleForm.nianling&&(!this.$validate.isIntNumer(this.ruleForm.nianling))){
					this.$utils.msg(`年龄应输入整数`);
					return
				}
				if((!this.ruleForm.shouji) && `duizhang` == this.tableName){
					this.$utils.msg(`手机不能为空`);
					return
				}
				if(`duizhang` == this.tableName && this.ruleForm.shouji&&(!this.$validate.isMobile(this.ruleForm.shouji))){
					this.$utils.msg(`手机应输入手机格式`);
					return
				}
				await this.$api.register(`${this.tableName}`, this.ruleForm);
				this.$utils.msgBack('注册成功');;
			}
		}
	}
</script>

<style lang="scss" scoped>
	$color-primary: #b49950;

	.content {
		padding: 100upx;
	}
	
	.content:after {
		position: fixed;
		top: 0;
		right: 0;
		left: 0;
		bottom: 0;
		content: '';
				background-image: url(http://codegen.caihongy.cn/20210406/39aee157a15048e59b8f019a7cdcd75b.jpeg);
				background-attachment: fixed;
		background-size: cover;
		background-position: center;
	}

	.logo {
		text-align: center;

		image {
			height: 200upx;
			width: 200upx;
			margin: 0 0 60upx;
		}
	}

	.uni-form-item {
		margin-bottom: 40upx;
		padding: 0;

		.uni-input {
			font-size: 30upx;
			padding: 7px 0;
		}
	}

	button[type="primary"] {
		background-color: $color-primary;
		border-radius: 0;
		font-size: 34upx;
		margin-top: 60upx;
	}

	.links {
		text-align: center;
		margin-top: 40upx;
		font-size: 26upx;
		color: #999;

		view {
			display: inline-block;
			vertical-align: top;
			margin: 0 10upx;
		}

		.link-highlight {
			color: $color-primary
		}
	}
.picker-select-input {
	line-height: 80rpx;
}

</style>
