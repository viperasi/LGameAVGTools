package com.xu81.lgtools.avg.view;

import javax.swing.JOptionPane;

public class InfoView {

	public static final int ERROR = -1;
	public static final int INFO = 0;

	public static void showInfo(String message, int type) {
		JOptionPane.showMessageDialog(null, message, type == -1 ? "����" : "ע��",
				type == -1 ? JOptionPane.ERROR_MESSAGE
						: JOptionPane.INFORMATION_MESSAGE);
	}
}
