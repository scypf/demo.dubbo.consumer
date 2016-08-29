# demo.dubbo.consumer
代码已上传

关键在于引用提供端的依赖，注意两点：
1.pom中加入提供端的dependency
2.将提供端的接口部分打成jar包导入lib中 (只打service层即可，实现层不需要)（可以参考http://blog.csdn.net/fangxiaoji/article/details/41846997）
