# BuglyDemo
Bugly 简单接入使用
1.使用gradlew assemblerelease名利编译基础版本，保存目录在：项目目录\build\oldApk
2.修改 项目目录\app\tinker-support.gradle baseApkDir参数
3.使用gradlew buildTinkerPatchRelease 编译出差异包
4.上传bugly下发更新

注意：资源更新时候，编译好基础包，需要保存好基础包再clean项目后，再copy回来项目目录\build\oldApk目录下，再执行命令编译，不然会报R.txt文件相关的错误
