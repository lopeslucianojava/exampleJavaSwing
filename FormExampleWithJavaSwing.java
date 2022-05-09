package customers;

import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class FormExampleWithJavaSwing extends JFrame {
	
	/**
	 * SERIAL
	 */
	private static final long serialVersionUID = -6221135258143372539L;
	private JTextField campoNome;
	private JTextField campoEmail;
	private JTextField campoDDDTel;
	private JTextField campoTelefone;
	private JTextField campoDDDCel;
	private JTextField campoCelular;
	private JTextField campoEndereco;
	private JTextField campoNumero;
	private JTextField campoComplemento;
	private JTextField campoBairro;
	private JTextField campoCidade;
	private JTextField campoEstado;
	private JTextField campoCep;
	private JTextField campoCPF;
	private JTextField campoRG;
	private JTextField campoNascimento;
	
	private JLabel nome;
	private JLabel email;
	private JLabel dddTelefone;
	private JLabel telefone;
	private JLabel dddCelular;
	private JLabel celular;
	private JLabel endereco;
	private JLabel numero;
	private JLabel complemento;
	private JLabel bairro;
	private JLabel cidade;
	private JLabel estado;
	private JLabel cep;
	private JLabel cpf;
	private JLabel rg;
	private JLabel nascimento;
	
	public FormExampleWithJavaSwing(String titulo) {
		super(titulo);
		
		campoNome = new JTextField(35);
		campoEmail = new JTextField(25);
		campoDDDTel = new JTextField(3);
		campoTelefone = new JTextField(8);
		campoDDDCel = new JTextField(3);
		campoCelular = new JTextField(8);
		campoEndereco = new JTextField(55);
		campoNumero = new JTextField(5);
		campoComplemento = new JTextField(21);
		campoBairro = new JTextField(35);
		campoCidade = new JTextField(20);
		campoEstado = new JTextField(3);
		campoCep = new JTextField(8);
		campoCPF = new JTextField(10);
		campoRG = new JTextField(9);
		campoNascimento = new JTextField(10);

		nome = new JLabel("Nome:");
		email = new JLabel("E-mail:");
		dddTelefone = new JLabel("DDD:");
		telefone = new JLabel("Telefone:");
		dddCelular = new JLabel("DDD:");
		celular = new JLabel("Celular:");
		endereco = new JLabel("Endereço:");
		numero = new JLabel("Nº:");
		complemento = new JLabel("Complemento:");
		bairro = new JLabel("Bairro:");
		cidade = new JLabel("Cidade:");
		estado = new JLabel("Estado:");
		cep = new JLabel("Cep:");
		cpf = new JLabel("CPF:");
		rg = new JLabel("RG:");
		nascimento = new JLabel("Nacimento: dd/mm/aa");
	}
	
	private void mostrarTela() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocation(150, 300);
		setLayout(new GridLayout(6, 1));
		Container cp = getContentPane();
		
		JPanel [] panel = new JPanel[6]; 
		
		for (int i = 0 ; i < panel.length; i++) {
			panel[i] = new JPanel(); 
		}
				
		panel[0].add(nome);
		panel[0].add(campoNome);
		panel[0].add(email);
		panel[0].add(campoEmail);
		panel[1].add(dddTelefone);
		panel[1].add(campoDDDTel);
		panel[1].add(telefone);
		panel[1].add(campoTelefone);
		panel[1].add(dddCelular);
		panel[1].add(campoDDDCel);
		panel[1].add(celular);
		panel[1].add(campoCelular);
		panel[2].add(endereco);
		panel[2].add(campoEndereco);
		panel[2].add(numero);
		panel[2].add(campoNumero);
		panel[3].add(complemento);
		panel[3].add(campoComplemento);
		panel[3].add(bairro);
		panel[3].add(campoBairro);
				
		panel[4].add(cep);
		panel[4].add(campoCep);
		panel[4].add(cidade);
		panel[4].add(campoCidade);
		panel[4].add(estado);
		panel[4].add(campoEstado);
		panel[5].add(rg);
		panel[5].add(campoRG);
		panel[5].add(cpf);
		panel[5].add(campoCPF);
		panel[5].add(nascimento);
		panel[5].add(campoNascimento);
		
		for (int i = 0; i < panel.length; i++) {
			cp.add(panel[i]);
		}
		pack();
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		FormExampleWithJavaSwing executar = new FormExampleWithJavaSwing("Cadastro de Cliente");
		executar.mostrarTela();
	}
}
