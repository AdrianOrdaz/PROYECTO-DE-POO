package consultorioDental;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.border.LineBorder;

import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AdministrarCaja extends metodosDise�o {

	public static void main(String[] args) {
		AdministrarCaja fg = new AdministrarCaja(); //nombre del archivo
		fg.CrearGui();
	}

	private void  CrearGui() {
		JFrame fCR = new JFrame("Administrar Caja");
		Container con = this.getContentPane();
		con = fCR.getContentPane();
		con.setLayout(new GridBagLayout());
		
		fCR.pack();
		fCR.setExtendedState(JFrame.MAXIMIZED_BOTH);
		fCR.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fCR.setVisible(true);
		con.setBackground(Color.WHITE);
		
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{100, 0, 230, 298, 0, 105, 0, 0};
		gbl_contentPane.rowHeights = new int[]{96, 0, 231, 62, 121, 0, 53, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		con.setLayout(gbl_contentPane);
		
		JLabel lbTitulo = new JLabel("Administrar caja");
		lbTitulo.setFont(new Font("Tahoma", Font.PLAIN, 46));
		GridBagConstraints gbc_lbTitulo = new GridBagConstraints();
		gbc_lbTitulo.insets = new Insets(0, 0, 5, 5);
		gbc_lbTitulo.gridx = 1;
		gbc_lbTitulo.gridy = 1;
		con.add(lbTitulo, gbc_lbTitulo);
		
		JButton btnGenerarRecibo = new JButton("Generar recibo");
		btnGenerarRecibo.setFont(new Font("Tahoma", Font.PLAIN, 29));
		GridBagConstraints gbc_btnGenerarRecibo = new GridBagConstraints();
		gbc_btnGenerarRecibo.fill = GridBagConstraints.BOTH;
		gbc_btnGenerarRecibo.insets = new Insets(0, 0, 5, 5);
		gbc_btnGenerarRecibo.gridx = 2;
		gbc_btnGenerarRecibo.gridy = 3;
		con.add(btnGenerarRecibo, gbc_btnGenerarRecibo);
		
		JButton btnTransaccion = new JButton("Transaccion");
		btnTransaccion.setFont(new Font("Tahoma", Font.PLAIN, 29));
		GridBagConstraints gbc_btnTransaccion = new GridBagConstraints();
		gbc_btnTransaccion.fill = GridBagConstraints.BOTH;
		gbc_btnTransaccion.insets = new Insets(0, 0, 5, 5);
		gbc_btnTransaccion.gridx = 4;
		gbc_btnTransaccion.gridy = 3;
		con.add(btnTransaccion, gbc_btnTransaccion);
		
		JButton btnCorteCaja = new JButton("Corte de caja");
		btnCorteCaja.setFont(new Font("Tahoma", Font.PLAIN, 29));
		GridBagConstraints gbc_btnCorteCaja = new GridBagConstraints();
		gbc_btnCorteCaja.fill = GridBagConstraints.BOTH;
		gbc_btnCorteCaja.insets = new Insets(0, 0, 5, 5);
		gbc_btnCorteCaja.gridx = 2;
		gbc_btnCorteCaja.gridy = 5;
		con.add(btnCorteCaja, gbc_btnCorteCaja);
		
		JButton btnMovExtra = new JButton("<html>Movimiento<br>extraordinario</html");
		btnMovExtra.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		//btnMovExtra.setHorizontalAlignment(SwingConstants.RIGHT);
		setBackground(Color.WHITE);
		btnMovExtra.setFont(new Font("Tahoma", Font.PLAIN, 29));
		GridBagConstraints gbc_btnMovExtra = new GridBagConstraints();
		gbc_btnMovExtra.insets = new Insets(0, 0, 5, 5);
		gbc_btnMovExtra.fill = GridBagConstraints.BOTH;
		gbc_btnMovExtra.gridx = 4;
		gbc_btnMovExtra.gridy = 5;
		con.add(btnMovExtra, gbc_btnMovExtra);
		
		JButton btnHome = new JButton(new ImageIcon("src/img/home.png"));
		btnHome.setPreferredSize(new Dimension(35, 35));
		btnHome.setBorder(new LineBorder(Color.white));
		GridBagConstraints gbc_btnHome = new GridBagConstraints();
		gbc_btnHome.gridx = 6;
		gbc_btnHome.gridy = 7;
		con.add(btnHome, gbc_btnHome);
		
		fCR.revalidate();
		fCR.repaint();
	}

}