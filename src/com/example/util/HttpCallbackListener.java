package com.example.util;

public interface HttpCallbackListener {

	void onFinish(String response);//���������ɹ���Ӧ��ʱ�����ø÷���
	void onError(Exception e);//������������������ʱ�����ø÷���

}
