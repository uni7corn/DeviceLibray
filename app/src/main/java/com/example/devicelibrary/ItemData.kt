package com.example.devicelibrary

class ItemData() {
    var cnName = ""
    var ehName = ""
    var content = ""
}


object ListName {
    val hardwareList = arrayOf(
        "是否是折叠手机",
        "是否是平板(1:是；0：不是)",
        "系统版本",
        "cpu最大频率",
        "builder类型",
        "设备分辨率",
        "设备指纹",
        "基带版本",
        "获取设备指令集名称",
        "系统引导加载程序版本号",
        "cpu名字",
        "执行代码编译的Host值",
        "设备型号",
        "无线电固件版本",
        "修订版本列表",
        "物理尺寸",
        "获取第二个指令集名称",
        "设备品牌",
        "硬件名",
        "产品名称",
        "手机cpu架构，支持的指令集",
        "显示屏参数",
        "设备序列号",
        "制造商",
        "cpu当前频率",
        "描述Build的标签",
        "SDK版本号",
        "屏幕密度（像素比例：0.75/1.0/1.5/2.0）",
        "编译时间",
        "设备参数",
        "执行代码编译的User值",
        "build基本操作系统",
        "主板名称",
        "cpu最小频率",
        "屏幕密度（每寸像素：120/160/240/320）"
    )

    val generalList = arrayOf(
        "安卓ID",
        "移动设备识别码,10及以上无法取",
        "",
        "移动网络代码",
        "GAID",
        "",
        "安全补丁更新日期",
        "本地语言",
        "移动国家代码",
        "设备标识符UUID",
        "mac地址",
        "卡槽移动设备身份码2",
        "当前注册运营商的数字名称",
        "语言环境的三字母缩写",
        "卡槽移动设备身份码1",
        "蓝牙mac地址",
        "用户显示的语言环境语言的名称",
        "当前设备支持的UI类型",
        "网络运营商名称",
        "支持卡槽数量",
        "当前网络类型",
        "时区的ID",
        "此地区的国家/地区的缩写",
        "基站编号"
    )

    val simList = arrayOf(
        "sim卡1ISO国家代码等同于SIM提供商的国家代码",
        "sim卡2移动用户身份",
        "设备当前sim卡数量",
        "sim卡2ISO国家代码等同于SIM提供商的国家代码",
        "sim卡1的序列号",
        "sim卡1对应手机号",
        "sim卡2对应手机号",
        "sim卡2的序列号",
        "sim卡1移动用户身份"
    )
    val storageList = arrayOf(
        "运行内存总大小(单位byte)",
        "运行内存可用大小(单位byte)",
        "sd卡总空间(单位byte)",
        "sd卡已用空间(单位byte)",
        "内部存储可用空间(单位byte)",
        "内部存储总空间(单位byte)",
        "音乐大小(单位byte)",
        "播客大小(单位byte)",
        "铃声大小(单位byte)",
        "闹铃大小(单位byte)",
        "通知大小(单位byte)",
        "图片大小(单位byte)",
        "电影大小(单位byte)",
        "下载大小(单位byte)",
        "DCIM大小(单位byte)",
        "文档大小(单位byte)",
        "屏幕截图大小(单位byte)",
        "有声读物大小(单位byte)",
    )
    val otherList = arrayOf(
        "最后一次开机时间，以毫秒为单位",
        "底部是否有物理按键：有：1；无：0",
        "是否为模拟器（0：不是；1：是）",
        "手机模式 0 ， 1 ，2",
        "是否使用vpn（0：不是；1：是）",
        "是否开启飞行模式（0：不是；1：是）",
        "手机开机时长",
        "手机的信号强度\n（>-90,越大信号越强；\"\"表示未取到）",
        "是否允许位置模拟（0：不是；1：是）",
        "是否root（0：不是；1：是）",
        "vpn代理地址",
        "是否开启debug调试（0：不是；1：是）",
        "是否使用代理（0：不是；1：是）",
        "http代理host:port"
    )

    val mediaList = arrayOf(
        "联系⼈小组个数(基数默认偏大，会算上自带群组名)",
        "图片外部文件个数",
        "视频外部文件个数",
        "视频内部文件个数",
        "音频外部文件个数",
        "音频内部文件个数",
        "图片内部文件个数",
        "下载的文件个数"
    )

}