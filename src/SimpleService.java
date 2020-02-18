/**
 * 一个简单POJO，将使用Axis2发布为一个Web服务
 *
 */
public class SimpleService {
	
	public String getGreeting(String name) {
		return "Hello, " + name + ". ";
	}
}
