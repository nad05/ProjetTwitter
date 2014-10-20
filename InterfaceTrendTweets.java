import java.awt.BorderLayout;
import java.awt.Dimension;
import java.util.List;
import java.util.Iterator;
import java.util.Vector;
import java.util.ArrayList;

import javax.swing.*;

import twitter4j.TwitterException;

public class InterfaceTrendTweets {

	public static void main(String[] args) {

	Tweet wt = new Tweet();

	try {
		// Vector<String> lesTweets = new Vector<String>();
		// lesTweets = Tweet.getTrend();

		// Tweet wt = new Tweet();
		 Vector<String> lesTweets = wt.getTrend();
		// lesTweets = Tweet.getTrend();
		
				
		JFrame f = new JFrame("Liste tweets tendances");
		JPanel global_panel = new JPanel();
		global_panel.setLayout(new BorderLayout());

		JPanel titre_panel = new JPanel();
		JLabel titre = new JLabel("Liste des tweets");
		titre_panel.add(titre);

		JPanel button_panel = new JPanel();
		JButton actualiser = new JButton("Actualiser");
		actualiser.setPreferredSize(new Dimension(100, 18));
		button_panel.add(actualiser);

		JScrollPane selection_trend = new JScrollPane();
		JList l = new JList(lesTweets);
		l.setVisibleRowCount(7);
		selection_trend.setViewportView(l);



		global_panel.add(titre_panel, BorderLayout.NORTH);	
		global_panel.add(button_panel, BorderLayout.SOUTH);
		global_panel.add(selection_trend, BorderLayout.CENTER);	

		
		f.setVisible(true);	
		f.setLocationRelativeTo(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.add(global_panel);
		f.setSize(350, 300);
	} catch (TwitterException err) {
			System.out.println("Erreur");	
	}

}

}
