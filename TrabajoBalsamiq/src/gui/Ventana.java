package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import clases.ArregloAdministradores;
import clases.ArregloClientes;
import clases.ArregloProductos;
import clases.ArregloProveedores;
import clases.ArregloTrabajadores;
import clases.Cliente;
import clases.Producto;

import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;

import java.awt.CardLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JPasswordField;
import java.awt.Font;

public class Ventana extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JLayeredPane layeredPane;
	private JPanel panel_Ingreso;
	private JLabel lblSebastianBaby;
	private JButton btnAdministrador;
	private JButton btnVendedor;
	private JPanel panel_LoginAdm;
	private JPanel panel_LoginVen;
	private JLabel lblUsuario;
	private JLabel lblContrasea;
	private JTextField txt_usuadm;
	private JButton btnAtrs;
	private JButton btnIngresar;
	private JButton btnOlvidoSuContrasea;
	private JLabel label;
	private JLabel label_1;
	private JButton button;
	private JButton button_1;
	private JButton button_2;
	private JTextField txt_usuven;
	private JTextField txt_conven;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana frame = new Ventana();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public void switchPanels(JPanel x)
	{
		layeredPane.removeAll();
		layeredPane.add(x);
		layeredPane.repaint();
		layeredPane.validate();
	}
	/**
	 * Create the frame.
	 */
	public Ventana() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		layeredPane = new JLayeredPane();
		layeredPane.setBounds(10, 11, 564, 339);
		contentPane.add(layeredPane);
		layeredPane.setLayout(new CardLayout(0, 0));
		
		panel_Ingreso = new JPanel();
		layeredPane.add(panel_Ingreso, "name_189371361621700");
		panel_Ingreso.setLayout(null);
		
		lblSebastianBaby = new JLabel("SEBASTIAN BABY");
		lblSebastianBaby.setBounds(232, 37, 149, 14);
		panel_Ingreso.add(lblSebastianBaby);
		
		btnAdministrador = new JButton("ADMINISTRADOR");
		btnAdministrador.addActionListener(this);
		btnAdministrador.setBounds(72, 161, 169, 23);
		panel_Ingreso.add(btnAdministrador);
		
		btnVendedor = new JButton("VENDEDOR");
		btnVendedor.addActionListener(this);
		btnVendedor.setBounds(376, 161, 149, 23);
		panel_Ingreso.add(btnVendedor);
		
		panel_LoginAdm = new JPanel();
		layeredPane.add(panel_LoginAdm, "name_189537666044400");
		panel_LoginAdm.setLayout(null);
		
		lblUsuario = new JLabel("USUARIO:");
		lblUsuario.setBounds(127, 97, 99, 14);
		panel_LoginAdm.add(lblUsuario);
		
		lblContrasea = new JLabel("CONTRASE\u00D1A:");
		lblContrasea.setBounds(127, 150, 99, 14);
		panel_LoginAdm.add(lblContrasea);
		
		txt_usuadm = new JTextField();
		txt_usuadm.setBounds(236, 94, 174, 20);
		panel_LoginAdm.add(txt_usuadm);
		txt_usuadm.setColumns(10);
		
		btnAtrs = new JButton("ATR\u00C1S");
		btnAtrs.addActionListener(this);
		btnAtrs.setBounds(61, 256, 89, 23);
		panel_LoginAdm.add(btnAtrs);
		
		btnIngresar = new JButton("INGRESAR");
		btnIngresar.addActionListener(this);
		btnIngresar.setBounds(236, 256, 117, 23);
		panel_LoginAdm.add(btnIngresar);
		
		btnOlvidoSuContrasea = new JButton("OLVIDO SU CONTRASE\u00D1A");
		btnOlvidoSuContrasea.addActionListener(this);
		btnOlvidoSuContrasea.setBounds(363, 256, 191, 23);
		panel_LoginAdm.add(btnOlvidoSuContrasea);
		
		txt_conadm = new JPasswordField();
		txt_conadm.setBounds(236, 148, 174, 17);
		panel_LoginAdm.add(txt_conadm);
		
		panel_LoginVen = new JPanel();
		layeredPane.add(panel_LoginVen, "name_189597417607000");
		panel_LoginVen.setLayout(null);
		
		label = new JLabel("USUARIO:");
		label.setBounds(146, 94, 50, 14);
		panel_LoginVen.add(label);
		
		label_1 = new JLabel("CONTRASE\u00D1A:");
		label_1.setBounds(146, 148, 72, 14);
		panel_LoginVen.add(label_1);
		
		button = new JButton("ATR\u00C1S");
		button.addActionListener(this);
		button.setBounds(53, 253, 89, 23);
		panel_LoginVen.add(button);
		
		button_1 = new JButton("INGRESAR");
		button_1.addActionListener(this);
		button_1.setBounds(256, 253, 89, 23);
		panel_LoginVen.add(button_1);
		
		button_2 = new JButton("OLVIDO SU CONTRASE\u00D1A");
		button_2.setBounds(355, 253, 157, 23);
		panel_LoginVen.add(button_2);
		
		txt_usuven = new JTextField();
		txt_usuven.setBounds(256, 91, 195, 20);
		panel_LoginVen.add(txt_usuven);
		txt_usuven.setColumns(10);
		
		txt_conven = new JTextField();
		txt_conven.setBounds(256, 145, 195, 20);
		panel_LoginVen.add(txt_conven);
		txt_conven.setColumns(10);
		
		panel_Adm = new JPanel();
		layeredPane.add(panel_Adm, "name_193574933390900");
		panel_Adm.setLayout(null);
		
		lblBienvenido = new JLabel("BIENVENIDO");
		lblBienvenido.setBounds(158, 37, 88, 14);
		panel_Adm.add(lblBienvenido);
		
		label_2 = new JLabel("*");
		label_2.setBounds(262, 37, 190, 14);
		panel_Adm.add(label_2);
		
		btnInventario = new JButton("INVENTARIO");
		btnInventario.addActionListener(this);
		btnInventario.setBounds(309, 62, 159, 23);
		panel_Adm.add(btnInventario);
		
		btnProveedor = new JButton("PROVEEDOR");
		btnProveedor.addActionListener(this);
		btnProveedor.setBounds(309, 96, 159, 23);
		panel_Adm.add(btnProveedor);
		
		btnTrabajador = new JButton("TRABAJADOR");
		btnTrabajador.addActionListener(this);
		btnTrabajador.setBounds(309, 130, 159, 23);
		panel_Adm.add(btnTrabajador);
		
		btnRegistrarCliente = new JButton("REGISTRAR CLIENTE");
		btnRegistrarCliente.addActionListener(this);
		btnRegistrarCliente.setBounds(309, 164, 159, 23);
		panel_Adm.add(btnRegistrarCliente);
		
		btnEditarPerfil = new JButton("EDITAR PERFIL");
		btnEditarPerfil.setBounds(309, 198, 159, 23);
		panel_Adm.add(btnEditarPerfil);
		
		btnSalir = new JButton("SALIR");
		btnSalir.addActionListener(this);
		btnSalir.setBounds(343, 232, 89, 23);
		panel_Adm.add(btnSalir);
		
		panel_OlvConAdm = new JPanel();
		layeredPane.add(panel_OlvConAdm, "name_194058586368400");
		panel_OlvConAdm.setLayout(null);
		
		lblIngreseCelular = new JLabel("INGRESE CELULAR:");
		lblIngreseCelular.setBounds(29, 76, 170, 14);
		panel_OlvConAdm.add(lblIngreseCelular);
		
		lblIngreseDni = new JLabel("INGRESE DNI:");
		lblIngreseDni.setBounds(29, 101, 170, 14);
		panel_OlvConAdm.add(lblIngreseDni);
		
		lblIngreseNuevaContrasea = new JLabel("INGRESE NUEVA CONTRASE\u00D1A:");
		lblIngreseNuevaContrasea.setBounds(29, 126, 170, 14);
		panel_OlvConAdm.add(lblIngreseNuevaContrasea);
		
		lblConfirmeNuevaContrasea = new JLabel("CONFIRME NUEVA CONTRASE\u00D1A:");
		lblConfirmeNuevaContrasea.setBounds(29, 151, 170, 14);
		panel_OlvConAdm.add(lblConfirmeNuevaContrasea);
		
		txt_olvceladm = new JTextField();
		txt_olvceladm.setBounds(209, 73, 86, 20);
		panel_OlvConAdm.add(txt_olvceladm);
		txt_olvceladm.setColumns(10);
		
		txt_olvdniadm = new JTextField();
		txt_olvdniadm.setBounds(209, 98, 86, 20);
		panel_OlvConAdm.add(txt_olvdniadm);
		txt_olvdniadm.setColumns(10);
		
		txt_olvconadm = new JTextField();
		txt_olvconadm.setBounds(209, 123, 86, 20);
		panel_OlvConAdm.add(txt_olvconadm);
		txt_olvconadm.setColumns(10);
		
		txt_olvconadm2 = new JTextField();
		txt_olvconadm2.setBounds(209, 148, 86, 20);
		panel_OlvConAdm.add(txt_olvconadm2);
		txt_olvconadm2.setColumns(10);
		
		btnAtrs_1 = new JButton("ATR\u00C1S");
		btnAtrs_1.addActionListener(this);
		btnAtrs_1.setBounds(29, 281, 89, 23);
		panel_OlvConAdm.add(btnAtrs_1);
		
		btnEnviar = new JButton("ENVIAR");
		btnEnviar.addActionListener(this);
		btnEnviar.setBounds(440, 281, 89, 23);
		panel_OlvConAdm.add(btnEnviar);
		
		panel_Ven = new JPanel();
		layeredPane.add(panel_Ven, "name_196658479014900");
		panel_Ven.setLayout(null);
		
		label_3 = new JLabel("BIENVENIDO");
		label_3.setBounds(142, 29, 88, 14);
		panel_Ven.add(label_3);
		
		label_4 = new JLabel("*");
		label_4.setBounds(246, 29, 190, 14);
		panel_Ven.add(label_4);
		
		btnInventario_1 = new JButton("INVENTARIO");
		btnInventario_1.addActionListener(this);
		btnInventario_1.setBounds(323, 54, 161, 23);
		panel_Ven.add(btnInventario_1);
		
		btnRegistrarPrenda = new JButton("REGISTRAR PRENDA");
		btnRegistrarPrenda.setBounds(323, 88, 161, 23);
		panel_Ven.add(btnRegistrarPrenda);
		
		btnRegistrarNuevaVenta = new JButton("REGISTRAR NUEVA VENTA");
		btnRegistrarNuevaVenta.setBounds(323, 122, 161, 23);
		panel_Ven.add(btnRegistrarNuevaVenta);
		
		btnEditarPerfil_1 = new JButton("EDITAR PERFIL");
		btnEditarPerfil_1.setBounds(323, 156, 161, 23);
		panel_Ven.add(btnEditarPerfil_1);
		
		btnSalir_1 = new JButton("SALIR");
		btnSalir_1.setBounds(364, 190, 89, 23);
		panel_Ven.add(btnSalir_1);
		
		panel_Inv = new JPanel();
		layeredPane.add(panel_Inv, "name_236661719311100");
		panel_Inv.setLayout(null);
		
		lblBuscar = new JLabel("BUSCAR: ");
		lblBuscar.setBounds(24, 47, 61, 14);
		panel_Inv.add(lblBuscar);
		
		txt_businv = new JTextField();
		txt_businv.setBounds(108, 44, 171, 20);
		panel_Inv.add(txt_businv);
		txt_businv.setColumns(10);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(24, 78, 530, 130);
		panel_Inv.add(scrollPane);
		
		tblTable = new JTable();
		tblTable.setFillsViewportHeight(true);
		scrollPane.setViewportView(tblTable);
		modelo = new DefaultTableModel();
		modelo.addColumn("SERIE");
		modelo.addColumn("PRODUCTO");
		modelo.addColumn("MARCAR");
		modelo.addColumn("STOCK");
		modelo.addColumn("PRECIO");
		tblTable.setModel(modelo);
		
		btnSalida = new JButton("SALIDA");
		btnSalida.addActionListener(this);
		btnSalida.setBounds(24, 305, 89, 23);
		panel_Inv.add(btnSalida);
		
		btnAdicionar = new JButton("ADICIONAR");
		btnAdicionar.addActionListener(this);
		btnAdicionar.setBounds(426, 21, 128, 23);
		panel_Inv.add(btnAdicionar);
		
		lblSerie = new JLabel("SERIE:");
		lblSerie.setBounds(24, 219, 61, 14);
		panel_Inv.add(lblSerie);
		
		lblProducto = new JLabel("PRODUCTO:");
		lblProducto.setBounds(24, 252, 89, 14);
		panel_Inv.add(lblProducto);
		
		lblMarcar = new JLabel("MARCAR:");
		lblMarcar.setBounds(315, 219, 100, 14);
		panel_Inv.add(lblMarcar);
		
		lblStock = new JLabel("STOCK:");
		lblStock.setBounds(315, 252, 72, 14);
		panel_Inv.add(lblStock);
		
		lblPrecio = new JLabel("PRECIO:");
		lblPrecio.setBounds(315, 289, 72, 14);
		panel_Inv.add(lblPrecio);
		
		txt_serinv = new JTextField();
		txt_serinv.setBounds(95, 216, 122, 20);
		panel_Inv.add(txt_serinv);
		txt_serinv.setColumns(10);
		
		txt_proinv = new JTextField();
		txt_proinv.setColumns(10);
		txt_proinv.setBounds(95, 249, 122, 20);
		panel_Inv.add(txt_proinv);
		
		txt_marinv = new JTextField();
		txt_marinv.setColumns(10);
		txt_marinv.setBounds(370, 216, 122, 20);
		panel_Inv.add(txt_marinv);
		
		txt_stoinv = new JTextField();
		txt_stoinv.setColumns(10);
		txt_stoinv.setBounds(370, 249, 122, 20);
		panel_Inv.add(txt_stoinv);
		
		txt_preinv = new JTextField();
		txt_preinv.setColumns(10);
		txt_preinv.setBounds(370, 286, 122, 20);
		panel_Inv.add(txt_preinv);
		
		btnOk = new JButton("OK");
		btnOk.addActionListener(this);
		btnOk.setBounds(289, 43, 61, 23);
		panel_Inv.add(btnOk);
		
		panel_Prov = new JPanel();
		layeredPane.add(panel_Prov, "name_239432842705600");
		panel_Prov.setLayout(null);
		
		lblBuscar_1 = new JLabel("BUSCAR:");
		lblBuscar_1.setBounds(23, 38, 67, 14);
		panel_Prov.add(lblBuscar_1);
		
		txt_busprov = new JTextField();
		txt_busprov.setBounds(100, 35, 255, 20);
		panel_Prov.add(txt_busprov);
		txt_busprov.setColumns(10);
		
		btnRegistrar = new JButton("REGISTRAR");
		btnRegistrar.addActionListener(this);
		btnRegistrar.setBounds(23, 87, 89, 23);
		panel_Prov.add(btnRegistrar);
		
		btnModificar = new JButton("MODIFICAR");
		btnModificar.setBounds(236, 87, 91, 23);
		panel_Prov.add(btnModificar);
		
		btnEliminar = new JButton("ELIMINAR");
		btnEliminar.setBounds(421, 87, 89, 23);
		panel_Prov.add(btnEliminar);
		
		scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 134, 544, 158);
		panel_Prov.add(scrollPane_1);
		
		tblTable1 = new JTable();
		tblTable1.setFillsViewportHeight(true);
		scrollPane_1.setViewportView(tblTable1);
		modelo1 = new DefaultTableModel();
		modelo1.addColumn("NOMBRE");
		modelo1.addColumn("PRODUCTO");
		modelo1.addColumn("PRECIO");
		tblTable1.setModel(modelo1);
		
		btnSalida_1 = new JButton("SALIDA");
		btnSalida_1.addActionListener(this);
		btnSalida_1.setBounds(20, 305, 89, 23);
		panel_Prov.add(btnSalida_1);
		
		panel_Trab = new JPanel();
		layeredPane.add(panel_Trab, "name_242954199631400");
		panel_Trab.setLayout(null);
		
		btnRegistrar_1 = new JButton("REGISTRAR");
		btnRegistrar_1.setBounds(37, 77, 89, 23);
		panel_Trab.add(btnRegistrar_1);
		
		btnModificar_1 = new JButton("MODIFICAR");
		btnModificar_1.setBounds(231, 77, 91, 23);
		panel_Trab.add(btnModificar_1);
		
		btnDespedir = new JButton("DESPEDIR");
		btnDespedir.setBounds(405, 77, 89, 23);
		panel_Trab.add(btnDespedir);
		
		lblBuscar_2 = new JLabel("BUSCAR:");
		lblBuscar_2.setBounds(37, 34, 89, 14);
		panel_Trab.add(lblBuscar_2);
		
		txt_bustrab = new JTextField();
		txt_bustrab.setBounds(136, 31, 245, 20);
		panel_Trab.add(txt_bustrab);
		txt_bustrab.setColumns(10);
		
		scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(10, 126, 544, 169);
		panel_Trab.add(scrollPane_2);
		
		tblTable2 = new JTable();
		tblTable2.setFillsViewportHeight(true);
		scrollPane_2.setViewportView(tblTable2);
		modelo2 = new DefaultTableModel();
		modelo2.addColumn("NOMBRE");
		modelo2.addColumn("TURNO");
		tblTable2.setModel(modelo2);
		
		btnSalida_2 = new JButton("SALIDA");
		btnSalida_2.addActionListener(this);
		btnSalida_2.setBounds(10, 305, 89, 23);
		panel_Trab.add(btnSalida_2);
		
		panel_EdPerf = new JPanel();
		layeredPane.add(panel_EdPerf, "name_244128889273800");
		panel_EdPerf.setLayout(null);
		
		lblNombres = new JLabel("Nombres:");
		lblNombres.setBounds(110, 35, 46, 14);
		panel_EdPerf.add(lblNombres);
		
		lblApellidos = new JLabel("Apellidos:");
		lblApellidos.setBounds(110, 60, 46, 14);
		panel_EdPerf.add(lblApellidos);
		
		lblDni = new JLabel("DNI:");
		lblDni.setBounds(110, 85, 46, 14);
		panel_EdPerf.add(lblDni);
		
		lblCorreo = new JLabel("Correo:");
		lblCorreo.setBounds(110, 110, 46, 14);
		panel_EdPerf.add(lblCorreo);
		
		lblTelefono = new JLabel("Telefono:");
		lblTelefono.setBounds(110, 135, 46, 14);
		panel_EdPerf.add(lblTelefono);
		
		lblUsuario_1 = new JLabel("Usuario:");
		lblUsuario_1.setBounds(110, 160, 46, 14);
		panel_EdPerf.add(lblUsuario_1);
		
		lblContrasea_1 = new JLabel("Contrase\u00F1a:");
		lblContrasea_1.setBounds(110, 185, 60, 14);
		panel_EdPerf.add(lblContrasea_1);
		
		textField = new JTextField();
		textField.setBounds(207, 32, 102, 20);
		panel_EdPerf.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(207, 57, 102, 20);
		panel_EdPerf.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(207, 82, 102, 20);
		panel_EdPerf.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(207, 107, 102, 20);
		panel_EdPerf.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(207, 132, 102, 20);
		panel_EdPerf.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(207, 157, 102, 20);
		panel_EdPerf.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(207, 182, 102, 20);
		panel_EdPerf.add(textField_6);
		
		panel_RegCli = new JPanel();
		layeredPane.add(panel_RegCli, "name_122268155406600");
		panel_RegCli.setLayout(null);
		
		lblNombreDelCliente = new JLabel("Nombres del cliente:");
		lblNombreDelCliente.setBounds(29, 58, 156, 14);
		panel_RegCli.add(lblNombreDelCliente);
		
		lblRegistroDelCliente = new JLabel("REGISTRO DEL CLIENTE:");
		lblRegistroDelCliente.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblRegistroDelCliente.setBounds(29, 11, 302, 25);
		panel_RegCli.add(lblRegistroDelCliente);
		
		lblApellidoDelCliente = new JLabel("Apellidos del cliente:");
		lblApellidoDelCliente.setBounds(29, 83, 156, 14);
		panel_RegCli.add(lblApellidoDelCliente);
		
		lblDniDelCliente = new JLabel("DNI del cliente:");
		lblDniDelCliente.setBounds(29, 108, 156, 14);
		panel_RegCli.add(lblDniDelCliente);
		
		lblTelefonoDelCliente = new JLabel("Telefono del cliente:");
		lblTelefonoDelCliente.setBounds(29, 133, 156, 14);
		panel_RegCli.add(lblTelefonoDelCliente);
		
		txt_nomcli = new JTextField();
		txt_nomcli.setBounds(195, 55, 86, 20);
		panel_RegCli.add(txt_nomcli);
		txt_nomcli.setColumns(10);
		
		txt_apecli = new JTextField();
		txt_apecli.setBounds(195, 80, 86, 20);
		panel_RegCli.add(txt_apecli);
		txt_apecli.setColumns(10);
		
		txt_dnicli = new JTextField();
		txt_dnicli.setBounds(195, 105, 86, 20);
		panel_RegCli.add(txt_dnicli);
		txt_dnicli.setColumns(10);
		
		txt_telcli = new JTextField();
		txt_telcli.setBounds(195, 130, 86, 20);
		panel_RegCli.add(txt_telcli);
		txt_telcli.setColumns(10);
		
		btnAtras = new JButton("ATRAS");
		btnAtras.addActionListener(this);
		btnAtras.setBounds(29, 293, 89, 23);
		panel_RegCli.add(btnAtras);
		
		btnRegistrar_2 = new JButton("REGISTRAR");
		btnRegistrar_2.addActionListener(this);
		btnRegistrar_2.setBounds(422, 293, 132, 23);
		panel_RegCli.add(btnRegistrar_2);
	}
	ArregloAdministradores aa=new ArregloAdministradores();
	ArregloProductos ap=new ArregloProductos();
	ArregloProveedores aprov=new ArregloProveedores();
	ArregloTrabajadores atrab=new ArregloTrabajadores();
	ArregloClientes ac=new ArregloClientes();
	private JPanel panel_Adm;
	private JPanel panel_OlvConAdm;
	private JLabel lblBienvenido;
	private JLabel label_2;
	private JButton btnInventario;
	private JButton btnProveedor;
	private JButton btnTrabajador;
	private JButton btnRegistrarCliente;
	private JButton btnEditarPerfil;
	private JButton btnSalir;
	private JLabel lblIngreseCelular;
	private JLabel lblIngreseDni;
	private JLabel lblIngreseNuevaContrasea;
	private JLabel lblConfirmeNuevaContrasea;
	private JTextField txt_olvceladm;
	private JTextField txt_olvdniadm;
	private JTextField txt_olvconadm;
	private JTextField txt_olvconadm2;
	private JButton btnAtrs_1;
	private JButton btnEnviar;
	private JPanel panel_Ven;
	private JLabel label_3;
	private JLabel label_4;
	private JButton btnInventario_1;
	private JButton btnRegistrarPrenda;
	private JButton btnRegistrarNuevaVenta;
	private JButton btnEditarPerfil_1;
	private JButton btnSalir_1;
	private JPanel panel_Inv;
	private JLabel lblBuscar;
	private JTextField txt_businv;
	private JScrollPane scrollPane;
	private JTable tblTable;
	private DefaultTableModel modelo;
	private JButton btnSalida;
	private JPanel panel_Prov;
	private JLabel lblBuscar_1;
	private JTextField txt_busprov;
	private JButton btnRegistrar;
	private JButton btnModificar;
	private JButton btnEliminar;
	private JScrollPane scrollPane_1;
	private JTable tblTable1;
	private DefaultTableModel modelo1;
	private JButton btnSalida_1;
	private JPanel panel_Trab;
	private JButton btnRegistrar_1;
	private JButton btnModificar_1;
	private JButton btnDespedir;
	private JLabel lblBuscar_2;
	private JTextField txt_bustrab;
	private JScrollPane scrollPane_2;
	private JTable tblTable2;
	private DefaultTableModel modelo2;
	private JButton btnSalida_2;
	private JPanel panel_EdPerf;
	private JLabel lblNombres;
	private JLabel lblApellidos;
	private JLabel lblDni;
	private JLabel lblCorreo;
	private JLabel lblTelefono;
	private JLabel lblUsuario_1;
	private JLabel lblContrasea_1;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JPasswordField txt_conadm;
	private JButton btnAdicionar;
	private JLabel lblSerie;
	private JLabel lblProducto;
	private JLabel lblMarcar;
	private JLabel lblStock;
	private JLabel lblPrecio;
	private JTextField txt_serinv;
	private JTextField txt_proinv;
	private JTextField txt_marinv;
	private JTextField txt_stoinv;
	private JTextField txt_preinv;
	private JPanel panel_RegCli;
	private JLabel lblNombreDelCliente;
	private JLabel lblRegistroDelCliente;
	private JLabel lblApellidoDelCliente;
	private JLabel lblDniDelCliente;
	private JLabel lblTelefonoDelCliente;
	private JTextField txt_nomcli;
	private JTextField txt_apecli;
	private JTextField txt_dnicli;
	private JTextField txt_telcli;
	private JButton btnAtras;
	private JButton btnRegistrar_2;
	private JButton btnOk;
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnOk) {
			do_btnOk_actionPerformed(arg0);
		}
		if (arg0.getSource() == btnAtras) {
			do_btnAtras_actionPerformed(arg0);
		}
		if (arg0.getSource() == btnRegistrar_2) {
			do_btnRegistrar_2_actionPerformed(arg0);
		}
		if (arg0.getSource() == btnRegistrarCliente) {
			do_btnRegistrarCliente_actionPerformed(arg0);
		}
		if (arg0.getSource() == btnRegistrar) {
			do_btnRegistrar_actionPerformed(arg0);
		}
		if (arg0.getSource() == btnAdicionar) {
			do_btnAdicionar_actionPerformed(arg0);
		}
		if (arg0.getSource() == btnSalida_2) {
			do_btnSalida_2_actionPerformed(arg0);
		}
		if (arg0.getSource() == btnTrabajador) {
			do_btnTrabajador_actionPerformed(arg0);
		}
		if (arg0.getSource() == btnSalir) {
			do_btnSalir_actionPerformed(arg0);
		}
		if (arg0.getSource() == btnProveedor) {
			do_btnProveedor_actionPerformed(arg0);
		}
		if (arg0.getSource() == btnSalida_1) {
			do_btnSalida_1_actionPerformed(arg0);
		}
		if (arg0.getSource() == btnSalida) {
			do_btnSalida_actionPerformed(arg0);
		}
		if (arg0.getSource() == btnInventario_1) {
			do_btnInventario_1_actionPerformed(arg0);
		}
		if (arg0.getSource() == btnInventario) {
			do_btnInventario_actionPerformed(arg0);
		}
		if (arg0.getSource() == btnEnviar) {
			do_btnEnviar_actionPerformed(arg0);
		}
		if (arg0.getSource() == btnAtrs_1) {
			do_btnAtrs_1_actionPerformed(arg0);
		}
		if (arg0.getSource() == btnOlvidoSuContrasea) {
			do_btnOlvidoSuContrasea_actionPerformed(arg0);
		}
		if (arg0.getSource() == btnIngresar) {
			do_btnIngresar_actionPerformed(arg0);
		}
		if (arg0.getSource() == button_1) {
			do_button_1_actionPerformed(arg0);
		}
		if (arg0.getSource() == button) {
			do_button_actionPerformed(arg0);
		}
		if (arg0.getSource() == btnAtrs) {
			do_btnAtrs_actionPerformed(arg0);
		}
		if (arg0.getSource() == btnVendedor) {
			do_btnVendedor_actionPerformed(arg0);
		}
		if (arg0.getSource() == btnAdministrador) {
			do_btnAdministrador_actionPerformed(arg0);
		}
	}
	void listar_prod(){
		modelo.setRowCount(0);
		for(int i=0;i<ap.tamano();i++){
			Object[] fila ={ap.obtener(i).getSerie_p(),
			ap.obtener(i).getNom_p(),
			ap.obtener(i).getMarca_p(),
			ap.obtener(i).getStock_p(),
			ap.obtener(i).getPre_p()};
			modelo.addRow(fila);
		}
	}
	void buscar_prod(){
		modelo.setRowCount(0);
		for(int i=0;i<1;i++){
			Object[] fila ={ap.obtener(i).getSerie_p(),
			ap.obtener(i).getNom_p(),
			ap.obtener(i).getMarca_p(),
			ap.obtener(i).getStock_p(),
			ap.obtener(i).getPre_p()};
			modelo.addRow(fila);
		}
	}
	void listar_prov(){
		modelo1.setRowCount(0);
		for(int i=0;i<aprov.tamano();i++){
			Object[] fila ={aprov.obtener(i).getNom_prov(),
			aprov.obtener(i).getNom_pro_prov(),
			aprov.obtener(i).getPre_prov()};
			modelo1.addRow(fila);
		}
	}
	void listar_trab(){
		modelo2.setRowCount(0);
		for(int i=0;i<atrab.tamano();i++){
			Object[] fila ={atrab.obtener(i).getNom_tra(),
			atrab.obtener(i).getTurno_tra()};
			modelo2.addRow(fila);
		}
	}
	void mensaje(String s){
		JOptionPane.showMessageDialog(this, s);
	}
	public boolean Verificar_Telefono_Repetido_Admin(){
		boolean verif_tra = false;
           for(int i = 0 ; i<aa.tamano();i++){
               if(aa.obtener(i).getTelf_adm() == leer_olvceladm()){
                  verif_tra = true;
                  break;
               }
           }
          return verif_tra;
	}
	public boolean Verificar_Dni_Repetido_Admin(){
		boolean verif_dra = false;
           for(int i = 0 ; i<aa.tamano();i++){
               if(aa.obtener(i).getDni_adm() == leer_olvdniadm()){
                  verif_dra = true;
                  break;
               }
           }
          return verif_dra;
	}
	public boolean Verificar_Producto_Repetido(){
		boolean veri = false;
		int ser_rep=Integer.parseInt(txt_serinv.getText().trim());
           for(int i = 0 ; i<ap.tamano();i++){
               if(ap.obtener(i).getSerie_p() == ser_rep){
                  veri = true;
                  break;
               }
        }
          return veri;
	}
	public boolean Buscar_Producto(){
		boolean veri = false;
		int bus_pro=Integer.parseInt(txt_businv.getText().trim());
           for(int i = 0 ; i<ap.tamano();i++){
               if(ap.obtener(i).getSerie_p() == bus_pro){
                  veri = true;
                  break;
               }
        }
          return veri;
	}
	public boolean Verificar_Dni_Repetido(){
		boolean veri = false;
		int dni_rep=Integer.parseInt(txt_dnicli.getText().trim());
           for(int i = 0 ; i<ac.tamano();i++){
               if(ac.obtener(i).getDni_cli() == dni_rep){
                  veri = true;
                  break;
               }
        }
          return veri;
	}
	double leer_olvceladm(){
		return Double.parseDouble(txt_olvceladm.getText().trim());
	}
	int leer_olvdniadm(){
		return Integer.parseInt(txt_olvdniadm.getText().trim());
	}
	protected void do_btnAdministrador_actionPerformed(ActionEvent arg0) {
		switchPanels(panel_LoginAdm);
		txt_usuadm.grabFocus();
	}
	protected void do_btnVendedor_actionPerformed(ActionEvent arg0) {
		switchPanels(panel_LoginVen);
		txt_usuven.grabFocus();
	}
	protected void do_btnAtrs_actionPerformed(ActionEvent arg0) {
		switchPanels(panel_Ingreso);
	}
	protected void do_button_actionPerformed(ActionEvent arg0) {
		switchPanels(panel_Ingreso);
	}
	protected void do_btnIngresar_actionPerformed(ActionEvent arg0) {
		String usu_adm=txt_usuadm.getText().trim();
		if(usu_adm.length()>0){
				String con_adm=txt_conadm.getText().trim();
				if(con_adm.length()>0){
				for(int i = 0 ; i<aa.tamano();i++){
					if(usu_adm.equals(aa.obtener(i).getUsu_adm()) && con_adm.equals(aa.obtener(i).getCon_adm())){
							txt_usuadm.setText("");
							txt_conadm.setText("");
							switchPanels(panel_Adm);
							label_2.setText(aa.obtener(i).getNom_adm());
							//txtcod_pa.grabFocus();
					}
					else{
						mensaje("El usuario o contraseña son incorrectos.");
						txt_usuadm.setText("");
						txt_conadm.setText("");
						txt_usuadm.grabFocus();
						}
					}
				}else{
					mensaje("Ingrese una contraseña válida.");
					txt_conadm.grabFocus();
				}
		}else{
			mensaje("Ingrese un usuario válido.");
			txt_usuadm.grabFocus();
		}
	}
	protected void do_btnOlvidoSuContrasea_actionPerformed(ActionEvent arg0) {
		switchPanels(panel_OlvConAdm);	
		txt_olvceladm.grabFocus();
	}
	protected void do_btnAtrs_1_actionPerformed(ActionEvent arg0) {
		switchPanels(panel_LoginAdm);
		txt_usuadm.grabFocus();
	}
	protected void do_btnEnviar_actionPerformed(ActionEvent arg0) {
		try{
			double olv_cel_adm=leer_olvceladm();
			if(Verificar_Telefono_Repetido_Admin()==true){
			try{
				int olv_dni_adm=leer_olvdniadm();
				if(Verificar_Dni_Repetido_Admin()==true){
				String olv_con_adm=txt_olvconadm.getText().trim();
				String olv_con_adm2=txt_olvconadm2.getText().trim();
				if(olv_con_adm.length()>0 || olv_con_adm2.length()>0){
					if(olv_con_adm.equals(olv_con_adm2)){
						for(int i=0;i<aa.tamano();i++){
							aa.obtener(i).setCon_adm(olv_con_adm);					
						}
						txt_olvceladm.setText("");
						txt_olvdniadm.setText("");
						txt_olvconadm.setText("");
						txt_olvconadm2.setText("");
						mensaje("Se cambio la contraseña correctamente.");
						switchPanels(panel_LoginAdm);
					}
					else{
						mensaje("Las contraseñas no coinciden.");
						txt_olvconadm.setText("");
						txt_olvconadm2.setText("");
						txt_olvconadm.grabFocus();
					}
				}else{
					mensaje("Ingrese una nueva contraseña válida.");
					txt_olvconadm.grabFocus();
				}
				}else{
					mensaje("El número de dni escrito no coincide con el de la cuenta.");
					txt_olvdniadm.setText("");
					txt_olvconadm.setText("");
					txt_olvconadm2.setText("");
					txt_olvdniadm.grabFocus();
				}
			}catch(Exception e){
				mensaje("Ingrese un número de dni válido.");
				txt_olvdniadm.grabFocus();
			}
			}else{
				mensaje("El número de celular escrito no coincide con el de la cuenta.");
				txt_olvceladm.setText("");
				txt_olvconadm.setText("");
				txt_olvconadm2.setText("");
				txt_olvceladm.grabFocus();
			}
		}catch(Exception e){
			mensaje("Ingrese un número de celular válido.");
			txt_olvceladm.grabFocus();
		}	
	}
	protected void do_btnInventario_actionPerformed(ActionEvent arg0) {
		switchPanels(panel_Inv);
		txt_businv.grabFocus();
		listar_prod();
	}

	protected void do_btnInventario_1_actionPerformed(ActionEvent arg0) {
		switchPanels(panel_Inv);
		txt_businv.grabFocus();
		listar_prod();
	}
	protected void do_btnSalida_actionPerformed(ActionEvent arg0) {
		switchPanels(panel_Adm);
		txt_businv.setText("");
	}
	protected void do_btnSalida_1_actionPerformed(ActionEvent arg0) {
		switchPanels(panel_Adm);
		txt_busprov.setText("");
	}
	protected void do_btnProveedor_actionPerformed(ActionEvent arg0) {
		switchPanels(panel_Prov);
		txt_busprov.grabFocus();
		listar_prov();
	}
	protected void do_btnSalir_actionPerformed(ActionEvent arg0) {
		switchPanels(panel_LoginAdm);
	}
	protected void do_btnTrabajador_actionPerformed(ActionEvent arg0) {
		switchPanels(panel_Trab);
		txt_bustrab.grabFocus();
		listar_trab();
	}
	protected void do_btnSalida_2_actionPerformed(ActionEvent arg0) {
		switchPanels(panel_Adm);
	}
	protected void do_btnAdicionar_actionPerformed(ActionEvent arg0) {
		try{
			int ser_inv=Integer.parseInt(txt_serinv.getText().trim());
			String pro_inv=txt_proinv.getText().trim();
			if(pro_inv.length()>0){
				String mar_inv=txt_marinv.getText().trim();
				if(mar_inv.length()>0){
					try{
						int sto_inv=Integer.parseInt(txt_stoinv.getText().trim());
						try{
							double pre_inv=Double.parseDouble(txt_preinv.getText().trim());
							if(Verificar_Producto_Repetido()){
								mensaje("El producto ya existe.");
								txt_serinv.setText("");
								txt_proinv.setText("");
								txt_marinv.setText("");
								txt_stoinv.setText("");
								txt_preinv.setText("");
								txt_serinv.grabFocus();
							}
							else{						
								Producto p=new Producto(ser_inv,pro_inv,mar_inv,sto_inv,pre_inv);
								ap.adicionar(p);
								listar_prod();
								mensaje("Se agrego un nuevo producto exitosamente.");
								txt_serinv.setText("");
								txt_proinv.setText("");
								txt_marinv.setText("");
								txt_stoinv.setText("");
								txt_preinv.setText("");
								txt_serinv.grabFocus();
						}
						}catch(Exception e){
							mensaje("Ingrese un precio válido.");
							txt_preinv.grabFocus();
						}
					}catch(Exception e){
						mensaje("Ingrese un stock válido.");
						txt_stoinv.grabFocus();
					}
				}else{
					mensaje("Ingrese una marca válida.");
					txt_marinv.grabFocus();
				}
			}else{
				mensaje("Ingrese un producto válido.");
				txt_proinv.grabFocus();
			}
		}catch(Exception e){
			mensaje("Ingrese una serie válida.");
			txt_serinv.grabFocus();
		}
	}
	protected void do_btnRegistrarCliente_actionPerformed(ActionEvent arg0) {
		switchPanels(panel_RegCli);
		txt_nomcli.grabFocus();
		txt_nomcli.setText("");
		txt_apecli.setText("");
		txt_dnicli.setText("");
		txt_telcli.setText("");
	}
	protected void do_btnRegistrar_2_actionPerformed(ActionEvent arg0) {
		String nom_cli=txt_nomcli.getText().trim();
		if(nom_cli.length()>0){
			String ape_cli=txt_apecli.getText().trim();
			if(ape_cli.length()>0){
				try{
					int dni_cli=Integer.parseInt(txt_dnicli.getText().trim());
					try{
						double tel_cli=Double.parseDouble(txt_telcli.getText().trim());
						if(Verificar_Dni_Repetido()){
							mensaje("El DNI del cliente ya existe.");
							txt_nomcli.setText("");
							txt_apecli.setText("");
							txt_dnicli.setText("");
							txt_telcli.setText("");
							txt_nomcli.grabFocus();
						}else{
							Cliente c=new Cliente(nom_cli,ape_cli,dni_cli,tel_cli);
							ac.adicionar(c);
							mensaje("Se registro a un nuevo cliente exitosamente.");
							txt_nomcli.setText("");
							txt_apecli.setText("");
							txt_dnicli.setText("");
							txt_telcli.setText("");
							txt_nomcli.grabFocus();
						}
					}catch(Exception e){
						mensaje("Ingrese un telefono del cliente válido.");
						txt_telcli.grabFocus();
					}
				}catch(Exception e){
					mensaje("Ingrese un dni del cliente válido.");
					txt_dnicli.grabFocus();
				}
			}else{
				mensaje("Ingrese un apellido del cliente válido.");
				txt_apecli.grabFocus();
			}
		}else{
			mensaje("Ingrese un nombre del cliente válido.");
			txt_nomcli.grabFocus();
		}
	}
	protected void do_btnAtras_actionPerformed(ActionEvent arg0) {
		switchPanels(panel_Adm);
	}
	protected void do_btnOk_actionPerformed(ActionEvent arg0) {
		int temp=0;
		try{
			int ser_inv=Integer.parseInt(txt_businv.getText().trim());
			if(Buscar_Producto()){
				for(int i=0;i<ap.tamano();i++){
					if(ser_inv==ap.obtener(i).getSerie_p()){
						temp=i;
						Producto p=new Producto(ser_inv,ap.obtener(i).getNom_p(),ap.obtener(i).getMarca_p(),ap.obtener(i).getStock_p(),ap.obtener(i).getPre_p());
						Producto p0=new Producto(ap.obtener(0).getSerie_p(),ap.obtener(0).getNom_p(),ap.obtener(0).getMarca_p(),ap.obtener(0).getStock_p(),ap.obtener(0).getPre_p());
						ap.set(0, p);
						buscar_prod();
						txt_businv.setText("");
						ap.set(temp, p);
						ap.set(0, p0);
					}
				}
			}else{
				mensaje("El numero de serie no existe.");
				txt_businv.setText("");
				txt_businv.grabFocus();
			}
		}catch(Exception e){
			mensaje("Ingrese una serie valida en el cuadro buscar.");
			txt_businv.grabFocus();
		}
	}
	protected void do_btnRegistrar_actionPerformed(ActionEvent arg0) {
		
	}
	protected void do_button_1_actionPerformed(ActionEvent arg0) {

	}
}
	
