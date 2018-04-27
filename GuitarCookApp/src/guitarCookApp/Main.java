package guitarCookApp;

import java.awt.EventQueue;

import guitarCookApp.constructeur.Contraintes;
import guitarCookApp.views.Fenetre;

public class Main {

	public static void main(String[] args) {
		/**
		 * Launch the application.
		 */		

		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				try 
				{
					Fenetre frame = new Fenetre();

					frame.setVisible(true);
				} 
				catch (Exception e) 
				{
					e.printStackTrace();
				}

			}
		});
	}
}