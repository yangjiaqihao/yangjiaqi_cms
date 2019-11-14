package com.yangjiaqi.common;

import java.io.Serializable;

/**
 * ����ǰ��˽�����Э��
 *
 */
public class MsgResult implements Serializable {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3270650550789341492L;
	
	int result;
	String errorMsg;
	Object data;
	
	public MsgResult() {
		
	}
	
	public MsgResult(int result, String errorMsg, Object data) {
		super();
		this.result = result;
		this.errorMsg = errorMsg;
		this.data = data;
	}
	public int getResult() {
		return result;
	}
	public void setResult(int result) {
		this.result = result;
	}
	public String getErrorMsg() {
		return errorMsg;
	}
	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	
	
	
	
}
