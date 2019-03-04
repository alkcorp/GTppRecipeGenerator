package net.alkalus;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.BoxLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;


import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;

public class mainGUI {

	private JFrame frame;
	private JTextField txtI1;
	private JTextField txtI2;
	private JTextField txtI3;
	private JTextField txtI4;
	private JTextField txtI5;
	private JTextField txtI6;
	private JTextField fluidInputName;
	private JTextField aEuT;
	private JTextField aTime;
	private JTextField txtA6;
	private JTextField txtA1;
	private JTextField txtA2;
	private JTextField txtA3;
	private JTextField txtA4;
	private JTextField txtA5;
	private JTextField aOutputName;
	private JTextField FluidInputAmount;
	private JLabel lblAmount_1;
	private JTextField aOutputAmount;
	private JLabel lblInfoWhenDoing;
	private JLabel lblWhereXIs;
	

	JTextPane txtpnOutput;
	private JLabel lblOreDictionaryNames;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					mainGUI window = new mainGUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public mainGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 463, 1021);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new FormLayout(new ColumnSpec[] {
				FormSpecs.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),
				FormSpecs.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("max(372dlu;default):grow"),},
			new RowSpec[] {
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				RowSpec.decode("default:grow"),}));
		
		lblInfoWhenDoing = new JLabel("Info: When doing amounts, Please do `X : Y`");
		frame.getContentPane().add(lblInfoWhenDoing, "4, 2");
		
		lblWhereXIs = new JLabel("Where X is vanilla GT and Y is GTNH. Do not add the `");
		frame.getContentPane().add(lblWhereXIs, "4, 4");
		
		JLabel lblRecipeOutput = new JLabel("Recipe Output:");
		frame.getContentPane().add(lblRecipeOutput, "2, 6, left, default");
		
		aOutputName = new JTextField();
		aOutputName.setText("ITEM NAME HERE");
		frame.getContentPane().add(aOutputName, "4, 6, fill, default");
		aOutputName.setColumns(10);
		
		lblAmount_1 = new JLabel("Amount:");
		frame.getContentPane().add(lblAmount_1, "2, 8, left, default");
		
		aOutputAmount = new JTextField();
		aOutputAmount.setText("1");
		frame.getContentPane().add(aOutputAmount, "4, 8, fill, default");
		aOutputAmount.setColumns(10);
		
		JLabel lblRecipeInputs = new JLabel("Recipe Inputs:");
		frame.getContentPane().add(lblRecipeInputs, "2, 10, left, default");
		
		JLabel lblInputA = new JLabel("Input A");
		frame.getContentPane().add(lblInputA, "4, 10");
		
		JLabel lblAmounts = new JLabel("Amounts");
		frame.getContentPane().add(lblAmounts, "2, 12");
		
		txtI1 = new JTextField();
		txtI1.setText("circuitGood");
		frame.getContentPane().add(txtI1, "4, 12, fill, default");
		txtI1.setColumns(10);
		
		txtA1 = new JTextField();
		txtA1.setText("4 : 8");
		frame.getContentPane().add(txtA1, "2, 14, left, default");
		txtA1.setColumns(10);
		
		JLabel lblInputB = new JLabel("Input B");
		frame.getContentPane().add(lblInputB, "4, 16");
		
		txtI2 = new JTextField();
		txtI2.setText("frameGtCarbon");
		frame.getContentPane().add(txtI2, "4, 18, fill, default");
		txtI2.setColumns(10);
		
		txtA2 = new JTextField();
		txtA2.setText("2 : 8");
		frame.getContentPane().add(txtA2, "2, 20, left, default");
		txtA2.setColumns(10);
		
		JLabel lblInputC = new JLabel("Input C");
		frame.getContentPane().add(lblInputC, "4, 22");
		
		txtI3 = new JTextField();
		txtI3.setText("wireGt08");
		frame.getContentPane().add(txtI3, "4, 24, fill, default");
		txtI3.setColumns(10);
		
		txtA3 = new JTextField();
		txtA3.setText("4 : 8");
		frame.getContentPane().add(txtA3, "2, 26, left, default");
		txtA3.setColumns(10);
		
		JLabel lblInputD = new JLabel("Input D");
		frame.getContentPane().add(lblInputD, "4, 28");
		
		txtI4 = new JTextField();
		txtI4.setText("minecraft:dirt");
		frame.getContentPane().add(txtI4, "4, 30, fill, default");
		txtI4.setColumns(10);
		
		txtA4 = new JTextField();
		txtA4.setText("16 : 64");
		frame.getContentPane().add(txtA4, "2, 32, left, default");
		txtA4.setColumns(10);
		
		JLabel lblInputE = new JLabel("Input E");
		frame.getContentPane().add(lblInputE, "4, 34");
		
		txtI5 = new JTextField();
		txtI5.setText("CI.getTieredMotor(7)");
		frame.getContentPane().add(txtI5, "4, 36, fill, default");
		txtI5.setColumns(10);
		
		txtA5 = new JTextField();
		txtA5.setText("2 : 6");
		frame.getContentPane().add(txtA5, "2, 38, left, default");
		txtA5.setColumns(10);
		
		JLabel lblInputF = new JLabel("Input F");
		frame.getContentPane().add(lblInputF, "4, 40");
		
		txtI6 = new JTextField();
		txtI6.setText("minecraft:diamond");
		frame.getContentPane().add(txtI6, "4, 42, fill, default");
		txtI6.setColumns(10);
		
		txtA6 = new JTextField();
		txtA6.setText("8 : 16");
		frame.getContentPane().add(txtA6, "2, 44, left, default");
		txtA6.setColumns(10);
		
		lblOreDictionaryNames = new JLabel("Ore Dictionary Names preferred for inputs");
		frame.getContentPane().add(lblOreDictionaryNames, "4, 44");
		
		JLabel lblFluidInput = new JLabel("Fluid Input:");
		frame.getContentPane().add(lblFluidInput, "2, 46, left, default");
		
		fluidInputName = new JTextField();
		fluidInputName.setText("molten.tin");
		frame.getContentPane().add(fluidInputName, "4, 46, left, default");
		fluidInputName.setColumns(10);
		
		JLabel lblAmount = new JLabel("Amount:");
		frame.getContentPane().add(lblAmount, "2, 48, left, default");
		
		FluidInputAmount = new JTextField();
		FluidInputAmount.setText("1000 : 2000");
		frame.getContentPane().add(FluidInputAmount, "4, 48, left, default");
		FluidInputAmount.setColumns(10);
		
		JLabel lblEut = new JLabel("Eu/t");
		frame.getContentPane().add(lblEut, "2, 50, left, default");
		
		aEuT = new JTextField();
		aEuT.setText("500");
		frame.getContentPane().add(aEuT, "4, 50, left, default");
		aEuT.setColumns(10);
		
		JLabel lblTimeInTicks = new JLabel("Time In Ticks:");
		frame.getContentPane().add(lblTimeInTicks, "2, 52, left, default");
		
		aTime = new JTextField();
		aTime.setText("20 * 10");
		frame.getContentPane().add(aTime, "4, 52, left, center");
		aTime.setColumns(10);
		
		
		//Recipe Box
		txtpnOutput = new JTextPane();
		txtpnOutput.setFont(new Font("Tahoma", Font.PLAIN, 9));
		txtpnOutput.setEditable(false);
		txtpnOutput.setText("Press Generate");
		frame.getContentPane().add(txtpnOutput, "4, 56, fill, fill");
		
		JButton btnGenerate = new JButton("Generate");
		btnGenerate.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				String aRecipe = 
				"//Recipe for "+aOutputName.getText()+ StringUtils.linebreak() + 
				StringUtils.linebreak() +
				"CORE.RA.addSixSlotAssemblingRecipe(" + StringUtils.linebreak() +				
				"new ItemStack[] {" + StringUtils.linebreak() +

				txtI1.getText() + "(!GTNH ? "+txtA1.getText()+")," + StringUtils.linebreak() +
				txtI2.getText() + "(!GTNH ? "+txtA2.getText()+")," + StringUtils.linebreak() +
				txtI3.getText() + "(!GTNH ? "+txtA3.getText()+")," + StringUtils.linebreak() +
				txtI4.getText() + "(!GTNH ? "+txtA4.getText()+")," + StringUtils.linebreak() +
				txtI5.getText() + "(!GTNH ? "+txtA5.getText()+")," + StringUtils.linebreak() +
				txtI6.getText() + "(!GTNH ? "+txtA6.getText()+")," + StringUtils.linebreak() +				
				
				"}, // Input Items" + StringUtils.linebreak() +					
				"FluidUtils.getFluidStack("+fluidInputName.getText()+", "+FluidInputAmount.getText()+"), // Fluid Input" + StringUtils.linebreak() +					
				""+aOutputName.getText()+ " (!GTNH ? "+aOutputAmount.getText()+"), // Output Item" + StringUtils.linebreak() +					
				""+aTime.getText()+", // Time in Ticks"+StringUtils.linebreak() +
				""+aEuT.getText()+"); // Eu/t";				
				txtpnOutput.setText("");
				txtpnOutput.setText(aRecipe);
				
				
				
			}
		});
		frame.getContentPane().add(btnGenerate, "2, 56");
	}

}
