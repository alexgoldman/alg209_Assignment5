package edu.pitt.is1017.view;

import java.awt.Color;
import java.awt.TextField;

import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTextField;

import edu.pitt.is1017.controller.Controller;

public class View {
	
	
	 private JTextField itemArea;
	 
	 private JTextField firstName;
	 
	 private JTextField lastName;
	 
	 private JLabel lblUser;
	 
	 private JLabel lblFirstName;
	 
	 private JLabel lblLastName;
	 
	 private JLabel lblTodo;

	 private JFrame frmMain;

	 private JButton btnAdd;
	 
	 private JButton btnDelete;
	 
	 private JButton btnAddUser;
	 
	 private JButton btnDeleteUser;

	 private DefaultListModel listModel;
	 
	 private DefaultListModel userModel;
	 
	 private JList itemList;
	 
	 private JList userList;
	 
	 private Controller controller;
	 

	
	public View(){
		
		
		 frmMain = new JFrame();
		 frmMain.setLayout(null);
	     frmMain.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	     frmMain.setSize(900, 350);
	     
	     itemArea = new JTextField();
	     itemArea.setBounds(435, 110, 120, 30);
	     
	     lblUser = new JLabel("Enter new user or select existing");
	     lblUser.setBounds(20,20, 240,30);
	     
	     lblFirstName = new JLabel("First name");
	     lblFirstName.setBounds(20,80, 240,30);
	     
	     lblLastName = new JLabel("Last name");
	     lblLastName.setBounds(20,135, 240,30);
	     
	     lblTodo = new JLabel("Item Area");
	     lblTodo.setBounds(435,80, 240,30);
	     
	     firstName = new JTextField();
	     firstName.setBounds(20, 110, 120, 30);
	     
	     lastName = new JTextField();
	     lastName.setBounds(20, 160, 120, 30);
	     
	     btnAdd = new JButton ("Add");
	     btnAdd.setBounds(580, 75, 80, 30);
	     
	     btnDelete = new JButton("Delete");
	     btnDelete.setBounds(580, 150, 80, 30);
	     
	     btnAddUser = new JButton ("Add");
	     btnAddUser.setBounds(155, 75, 80, 30);
	     
	     btnDeleteUser = new JButton("Delete");
	     btnDeleteUser.setBounds(155, 150, 80, 30);
	     
	     
	     itemList = new JList();
	     itemList.setBounds(700, 30, 150, 250);
	     itemList.setVisible(true);
	     
	     userList = new JList();
	     userList.setBounds(275, 30, 150, 250);
	     userList.setVisible(true);
	     
	     userModel = new DefaultListModel();
	     userList.setModel(userModel);
	     userList.setBorder(BorderFactory.createLineBorder(Color.black));
	     
	     listModel = new DefaultListModel();
	     itemList.setModel(listModel);
	     itemList.setBorder(BorderFactory.createLineBorder(Color.black));

	     frmMain.add(itemArea);
	     frmMain.add(firstName);
	     frmMain.add(btnAdd);
	     frmMain.add(btnDelete);
	     frmMain.add(itemList);
	     frmMain.add(userList);
	     frmMain.add(btnAddUser);
	     frmMain.add(btnDeleteUser);
	     frmMain.add(btnDeleteUser);
	     frmMain.add(lblUser);
	     frmMain.add(lblFirstName);
	     frmMain.add(lblLastName);
	     frmMain.add(lblTodo);
	     frmMain.add(lastName);

	     
	     frmMain.setVisible(true);
		
	}



	public JButton getBtnAdd() {
		return btnAdd;
	}



	public JButton getBtnDelete() {
		return btnDelete;
	}



	public JTextField getItemArea() {
		return itemArea;
	}



	public DefaultListModel getListModel() {
		return listModel;
	}



	public JList getItemList() {
		return itemList;
	}



	public JTextField getFirstName() {
		return firstName;
	}



	public JTextField getLastName() {
		return lastName;
	}



	public DefaultListModel getUserModel() {
		return userModel;
	}



	public void setFirstName(JTextField firstName) {
		this.firstName = firstName;
	}



	public JList getUserList() {
		return userList;
	}



	public JButton getBtnAddUser() {
		return btnAddUser;
	}



	public JButton getBtnDeleteUser() {
		return btnDeleteUser;
	}
	


}
