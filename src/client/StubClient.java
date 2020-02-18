package client;

import autoclient.SimpleServiceStub;

/**
 * 基于wsdl2java.sh生成的client实现Web服务的调用
 * 
 * 代码生成方式：
 * 
 * 使用axis2-1.7.9-bin.zip中的wsdl2java工具
 * 
 * $AXIS2_HOME/bin/wsdl2java.sh -uri
 * http://192.168.1.121:8080/axis2/services/SimpleService?wsdl -p autoclient -s
 * -o stub
 * 
 * -uri: 指定被调用服务的wsdl -p: 生成java文件的包名 -o: 生成的文件目录
 *
 */
public class StubClient {

	public static void main(String[] args) throws Exception {

		SimpleServiceStub sss = new SimpleServiceStub();
		// 封装getGreeting方法的参数
		SimpleServiceStub.GetGreeting gg = new SimpleServiceStub.GetGreeting();

		gg.setName("王晓东");

		System.out.println(sss.getGreeting(gg).get_return());
	}
}
