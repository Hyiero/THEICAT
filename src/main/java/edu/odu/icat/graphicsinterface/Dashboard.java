/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.odu.icat.graphicsinterface;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
//import com.jgoodies.forms.layout.FormLayout;
//import com.jgoodies.forms.layout.ColumnSpec;
//import com.jgoodies.forms.layout.RowSpec;
import javax.swing.SpringLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import java.io.IOException;


public class Dashboard extends JFrame {

	private JPanel contentPane;
	private JPanel Workspace;
    private ImagePanel logo;

	/**
	 * Create the frame.
	 */
	public Dashboard() {
		setTitle("Dashboard");


		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 507, 415);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		SpringLayout sl_contentPane = new SpringLayout();
		contentPane.setLayout(sl_contentPane);

        try{
        logo = new ImagePanel("logo.png");
        sl_contentPane.putConstraint(SpringLayout.NORTH, logo, 40, SpringLayout.NORTH, contentPane);
        //sl_contentPane.putConstraint(SpringLayout.SOUTH, logo, 40, SpringLayout.NORTH, contentPane);
        sl_contentPane.putConstraint(SpringLayout.WEST, logo, 10, SpringLayout.WEST, contentPane);
        //sl_contentPane.putConstraint(SpringLayout.EAST, logo, 10, SpringLayout.EAST, contentPane);
        contentPane.add(logo);
        }
        catch(IOException e){System.out.println("File not found: logo.png");}

		JButton btnNewButton = new JButton("New Project");
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnNewButton, -99, SpringLayout.SOUTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnNewButton, -40, SpringLayout.SOUTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnNewButton, 170, SpringLayout.WEST, contentPane);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			WorkSpace Ws = new WorkSpace();	
			Ws.setVisible(true);
			}
		});
		sl_contentPane.putConstraint(SpringLayout.WEST, btnNewButton, 10, SpringLayout.WEST, contentPane);
		contentPane.add(btnNewButton);
		
		JTextPane txtpnSearch = new JTextPane();
		sl_contentPane.putConstraint(SpringLayout.NORTH, txtpnSearch, 10, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, txtpnSearch, -165, SpringLayout.EAST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, txtpnSearch, -44, SpringLayout.EAST, contentPane);
		txtpnSearch.setText("Search");
		contentPane.add(txtpnSearch);
		
		JLabel lblIcatdashboard = new JLabel("ICAT - Dashboard");
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblIcatdashboard, 0, SpringLayout.NORTH, txtpnSearch);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblIcatdashboard, 10, SpringLayout.WEST, contentPane);
		contentPane.add(lblIcatdashboard);
	}
}
    

