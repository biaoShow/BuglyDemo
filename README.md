# BuglyDemo
Bugly 简单接入使用
1.使用gradlew assemblerelease名利编译基础版本，保存目录在：项目目录\build\oldApk
2.修改 项目目录\app\tinker-support.gradle baseApkDir参数
3.使用gradlew buildTinkerPatchRelease 编译出差异包
4.上传bugly下发更新
