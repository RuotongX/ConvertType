package convert;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class DisplayControl extends JFrame{

	private DisplayPanel view;
	private ModelForSuffix model;
	
	public DisplayControl(String name) {
		super(name);
		
		view = new DisplayPanel();
		model = new ModelForSuffix();
		
		this.view.getComfirm().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				model.path = view.getInputpath().getText();
				model.inputsuffix = view.getSourcesuffix().getText().toLowerCase();
				model.outputsuffix = view.getOutputsuffix().getText().toLowerCase();
				suffixRename(model.path,model.inputsuffix,model.outputsuffix);
				JOptionPane.showMessageDialog(null,
						"Complete.", "",
						JOptionPane.INFORMATION_MESSAGE);
			}
		});
		this.getContentPane().setLayout(null);
		this.getContentPane().add(view);
		// Set program to stop when window closed
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(null);
		setSize(1281, 720); // manually computed sizes
	}
	 public static void suffixRename(String path, String from, String to) {
	        File file = new File(path);
	        File[] fs = file.listFiles();
	        for (int i = 0; i < fs.length; i++) {
	            File f2 = fs[i];
	            if (f2.isDirectory()) {
	                suffixRename(f2.getPath(), from, to);
	            } else {
	                String name = f2.getName();
	                if (name.endsWith(from)) {
	                    f2.renameTo(new File(f2.getParent() + File.separator 
	                            + name.substring(0, name.indexOf(from)) + to));
	                }
	            }
	        }
	    }
}
