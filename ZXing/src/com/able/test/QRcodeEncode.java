package com.able.test;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.common.BitMatrix;

public class QRcodeEncode {

	public static void main(String[] args){
		try {
			//��ά������
			String contet = "http://izhongwei.github.io/blog/index.html";
			//��ά������·��
			String path = "E:";
			MultiFormatWriter multiFormatWriter = new MultiFormatWriter();
			Map hints = new HashMap();
			hints.put(EncodeHintType.CHARACTER_SET, "UTF-8");
			BitMatrix bitMatrix = multiFormatWriter.encode(contet, BarcodeFormat.QR_CODE, 400, 400, hints);
			File file = new File(path,"test.jpg");
			ImageWrite.writeToFile(bitMatrix, "jpg", file);
			System.out.println("��ά���Ѿ�����");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
