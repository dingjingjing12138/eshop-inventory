package com.roncoo.eshop.inventory.vo;

/**
 * 请求的响应
 * @author Administrator
 *
 */
public class Response {

	public static final String SUCCESS = "success";
	public static final String FAILURE = "failure";
	
	private String status;
	private String message;
	
	public Response() {
		
	}
	
	public Response(String status) {
		this.status = status;
	}
	
	public Response(String status, String message) {
		this.status = status;
		this.message = message;
	}
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}

	public void test2(){
		System.out.println("master commit");
	}

	public void test(){
		System.out.println("远程修改 commit");
	}
	
	public void remotetest(){
		System.out.println("远程修改22222222222 commit");
	}

	public void localtest(){
		System.out.println("远程修改1 commit");
	}

}
