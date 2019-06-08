import com.ms.wfc.app.*;
import com.ms.wfc.core.*;
import com.ms.wfc.ui.*;
import com.ms.wfc.html.*;

/**
 * This class can take a variable number of parameters on the command
 * line. Program execution begins with the main() method. The class
 * constructor is not invoked unless an object of type 'Form1' is
 * created in the main() method.
 */
public class Form1 extends Form
{
	public Form1()
	{
		// Required for Visual J++ Form Designer support
		initForm();		

		// TODO: Add any constructor code after initForm call
	}

	/**
	 * Form1 overrides dispose so it can clean up the
	 * component list.
	 */
	public void dispose()
	{
		super.dispose();
		components.dispose();
	}

	private void groupBox1_enter(Object source, Event e)
	{
		
	}

	private void ptCurrLabel_click(Object source, Event e)
	{
		
	}

	private void currCalc(Object source, Event e)
	{
		int dingus;
		try {
		int area = Integer.parseInt(inputCurrEdit.getText());
		
		if(area < 0) {
			area = area - area - area;
		}
		
		int ptCurrI = ((area * 2) + (area * 6)) / 2;
		String ptCurrS = Integer.toString(ptCurrI);
		
		int cCurrI = ((area * 2) + (area * 6)) / 2;
		String cCurrS = Integer.toString(cCurrI);
		
		int idepCurrI = ((area * 1) + (area * 10)) / 2;
		String idepCurrS = Integer.toString(idepCurrI);
		
		int wCurrI = ((area * 70) + (area * 100)) / 2;
		String wCurrS = Integer.toString(wCurrI);

		ptCurrLabel.setText(ptCurrS);
		idepCurrLabel.setText(idepCurrS);
		wCurrLabel.setText(wCurrS);
		cCurrLabel.setText(cCurrS);
		}
		catch(Exception err) {
			ptCurrLabel.setText("Numbers only!");
			idepCurrLabel.setText("Numbers only!");
			wCurrLabel.setText("Numbers only!");
			cCurrLabel.setText("Numbers only!");
		}
	}

	/**
	 * NOTE: The following code is required by the Visual J++ form
	 * designer.  It can be modified using the form editor.  Do not
	 * modify it using the code editor.
	 */
	Container components = new Container();
	GroupBox groupBox1 = new GroupBox();
	Edit inputCurrEdit = new Edit();
	Label label1 = new Label();
	UpDown inputCurrUpDown = new UpDown();
	Label ptLabel = new Label();
	Label idepLabel = new Label();
	Label wLabel = new Label();
	Label cLabel = new Label();
	Label ptCurrLabel = new Label();
	Label idepCurrLabel = new Label();
	Label wCurrLabel = new Label();
	Label cCurrLabel = new Label();
	Button calculateButton = new Button();

	private void initForm()
	{
		groupBox1.setDock(ControlDock.BOTTOM);
		groupBox1.setLocation(new Point(0, 77));
		groupBox1.setSize(new Point(298, 112));
		groupBox1.setTabIndex(0);
		groupBox1.setTabStop(false);
		groupBox1.setText("Deposition Currents");
		groupBox1.addOnEnter(new EventHandler(this.groupBox1_enter));

		inputCurrEdit.setLocation(new Point(152, 8));
		inputCurrEdit.setSize(new Point(128, 23));
		inputCurrEdit.setTabIndex(1);
		inputCurrEdit.setText("0");

		label1.setLocation(new Point(8, 8));
		label1.setSize(new Point(136, 32));
		label1.setTabIndex(2);
		label1.setTabStop(false);
		label1.setText("Patturn current in um^2 (numbers only)");

		inputCurrUpDown.setBuddyControl(inputCurrEdit);
		inputCurrUpDown.setLocation(new Point(280, 8));
		inputCurrUpDown.setSize(new Point(16, 23));
		inputCurrUpDown.setTabIndex(3);
		inputCurrUpDown.setMaximum(10000);

		ptLabel.setLocation(new Point(8, 15));
		ptLabel.setSize(new Point(100, 23));
		ptLabel.setTabIndex(0);
		ptLabel.setTabStop(false);
		ptLabel.setText("Platinum");

		idepLabel.setLocation(new Point(8, 39));
		idepLabel.setSize(new Point(100, 23));
		idepLabel.setTabIndex(1);
		idepLabel.setTabStop(false);
		idepLabel.setText("IDEP");

		wLabel.setLocation(new Point(8, 63));
		wLabel.setSize(new Point(100, 23));
		wLabel.setTabIndex(2);
		wLabel.setTabStop(false);
		wLabel.setText("Tungsten");

		cLabel.setLocation(new Point(8, 87));
		cLabel.setSize(new Point(100, 23));
		cLabel.setTabIndex(3);
		cLabel.setTabStop(false);
		cLabel.setText("Carbon");

		ptCurrLabel.setLocation(new Point(192, 16));
		ptCurrLabel.setSize(new Point(100, 23));
		ptCurrLabel.setTabIndex(4);
		ptCurrLabel.setTabStop(false);
		ptCurrLabel.setText("");
		ptCurrLabel.setTextAlign(HorizontalAlignment.RIGHT);
		ptCurrLabel.addOnClick(new EventHandler(this.ptCurrLabel_click));

		idepCurrLabel.setLocation(new Point(192, 39));
		idepCurrLabel.setSize(new Point(100, 23));
		idepCurrLabel.setTabIndex(5);
		idepCurrLabel.setTabStop(false);
		idepCurrLabel.setText("");
		idepCurrLabel.setTextAlign(HorizontalAlignment.RIGHT);

		wCurrLabel.setLocation(new Point(192, 63));
		wCurrLabel.setSize(new Point(100, 23));
		wCurrLabel.setTabIndex(6);
		wCurrLabel.setTabStop(false);
		wCurrLabel.setText("");
		wCurrLabel.setTextAlign(HorizontalAlignment.RIGHT);

		cCurrLabel.setLocation(new Point(192, 87));
		cCurrLabel.setSize(new Point(100, 23));
		cCurrLabel.setTabIndex(7);
		cCurrLabel.setTabStop(false);
		cCurrLabel.setText("");
		cCurrLabel.setTextAlign(HorizontalAlignment.RIGHT);

		calculateButton.setLocation(new Point(152, 40));
		calculateButton.setSize(new Point(144, 23));
		calculateButton.setTabIndex(4);
		calculateButton.setText("Calculate");
		calculateButton.addOnClick(new EventHandler(this.currCalc));

		this.setText("Depo Calculator");
		this.setAcceptButton(calculateButton);
		this.setAutoScaleBaseSize(new Point(7, 16));
		this.setBorderStyle(FormBorderStyle.FIXED_SINGLE);
		this.setClientSize(new Point(298, 189));
		this.setHelpButton(true);
		this.setMaximizeBox(false);
		this.setTopMost(true);

		this.setNewControls(new Control[] {
							calculateButton, 
							inputCurrUpDown, 
							label1, 
							inputCurrEdit, 
							groupBox1});
		groupBox1.setNewControls(new Control[] {
								 cCurrLabel, 
								 wCurrLabel, 
								 idepCurrLabel, 
								 ptCurrLabel, 
								 cLabel, 
								 wLabel, 
								 idepLabel, 
								 ptLabel});
	}

	/**
	 * The main entry point for the application. 
	 *
	 * @param args Array of parameters passed to the application
	 * via the command line.
	 */
	public static void main(String args[])
	{
		Application.run(new Form1());
	}
}
