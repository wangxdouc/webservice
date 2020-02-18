package client;

import javax.xml.namespace.QName;

import org.apache.axis2.addressing.EndpointReference;
import org.apache.axis2.client.Options;
import org.apache.axis2.rpc.client.RPCServiceClient;

/**
 * Web服务SimpleService的RPC客户端
 * 
 * @see default.SimpleService
 */
public class RPCClient {
	
	public static void main(String[] args) throws Exception {
		
		// 使用RPC方式调用Web服务
		RPCServiceClient client = new RPCServiceClient();
		Options options = client.getOptions();
		
		// 指定调用Web服务的URL
		EndpointReference er = new EndpointReference("http://172.16.49.128:8080/axis2/services/SimpleService");
		options.setTo(er);
		
		// 指定调用服务的方法的参数值
		Object[] opAddArgs = new Object[] {"Xiaodong Wang"};

		// 指定调用服务的方法的返回值类型的Class对象
		Class[] classs = new Class[] {String.class};
		
		// 指定服务WSDL的命名空间及调用服务的方法名
		QName qname = new QName("http://ws.apache.org/axis2","getGreeting");
		
		// 调用服务
		System.out.println(client.invokeBlocking(qname, opAddArgs, classs)[0]);
	}
}
