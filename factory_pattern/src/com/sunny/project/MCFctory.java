package com.sunny.project;
/**
 * ʥ��ϵ�мӹ���
 * @author Administrator
 *
 */
public class MCFctory implements PersonFactory {

	public Boy getBoy() {
		// TODO Auto-generated method stub
		return new MCBoy();
	}

	public Girl getGirl() {
		// TODO Auto-generated method stub
		return new MCGirl();
	}

}
