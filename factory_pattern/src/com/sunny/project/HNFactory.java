package com.sunny.project;
/**
 * ����ϵ�мӹ���
 * @author Administrator
 *
 */
public class HNFactory implements PersonFactory {

	public Boy getBoy() {
		// TODO Auto-generated method stub
		return new HNBoy();
	}

	public Girl getGirl() {
		// TODO Auto-generated method stub
		return new HNGirl();
	}

}
