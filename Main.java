package FinalProject;

import java.awt.EventQueue;

public class Main {

	public static void main(String[] args) {
	
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IDandPassword iDandPassword = new IDandPassword();
					LoginPage login = new LoginPage(iDandPassword.getLoginInfo());
				    login.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IDandPassword iDandPassword = new IDandPassword();
					ShoppingPage shop = new ShoppingPage(iDandPassword.getLoginInfo());
					shop.setVisible(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		

	}

}
