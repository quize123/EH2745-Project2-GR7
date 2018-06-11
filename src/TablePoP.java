

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import javax.swing.ScrollPaneConstants;

import java.io.IOException;

import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.SwingConstants;
import javax.swing.JPanel;

import java.awt.Color;


public class TablePoP {

	JFrame OUTPUT;
	private JScrollPane scrollPane;
	private JScrollPane scrollPaneA;
	private JTabbedPane tabbedPane;
	private JTable CROSSTBL1;
	private JTable CLARKTBL1;
	private JScrollPane scrollPane_1;
	private JTable CROSSTBL11;
	private JTable CLARKTBL11;
	private JScrollPane scrollPane_2;
	private JScrollPane scrollPane_3;
	private JScrollPane scrollPane_4;
	private JScrollPane scrollPane_2A;
	private JScrollPane scrollPane_3A;
	private JScrollPane scrollPane_4A;
	private JScrollPane scrollPane_1A;
	private JTable CROSSTBL12;
	private JTable CROSSTBL13;
	private JTable CROSSTBL14;
	private JTable CLARKTBL12A;
	private JTable CLARKTBL13A;
	private JTable CLARKTBL14A;
	private final JTabbedPane tabbedPane_1 = new JTabbedPane(JTabbedPane.LEFT);
	private JPanel CROSS;
	private JPanel CLARK;
	private JLabel label_1;
	private JLabel label_1A;
	private JPanel AMHERST;
	private JPanel BOWMAN;
	private JPanel GRAND;
	private JPanel MAPLE;
	private JPanel TROY;
	private JPanel WAUTAGA;
	private JPanel WINLOCK;
	private JLabel AMHERSTlabel;
	private JLabel label_2;
	private JLabel lblSs;
	private JLabel lblSsKnn;
	private JLabel lblSs_2;
	private JLabel lblSsKnn_2;
	private JLabel lblSs_3;
	private JLabel lblSsKnn_3;
	private JLabel lblSs_4;
	private JLabel lblSsKnn_4;
	private JLabel lblSs_5;
	private JLabel lblSsKnn_5;
	private JLabel lblSs_1;
	private JLabel lblSsKnn_1;
	private JPanel panel_8;
	private JPanel panel_8A;

	private JPanel panel_9;
	private JScrollPane scrollPane_5;
	private JPanel panel_10;
	private JScrollPane scrollPane_6;
	private JPanel panel_11;
	private JScrollPane scrollPane_7;
	private JPanel panel_12;
	private JScrollPane scrollbane123;
	private JPanel panel_13;
	private JScrollPane scrollPane_9;
	private JPanel panel_14;
	private JScrollPane scrollPane_10;
	private JPanel panel_15;
	private JScrollPane scrollPane_11;
	private JLabel Photo2;
	private JLabel Photo3;
	private JLabel Photo4;
	private JLabel Photo5;
	private JLabel Photo6;
	private JLabel Photo7;
	private JLabel Photo8;
	private JPanel panel_16;
	private JPanel panel_16A;
	private JPanel panel_17;
	private JTabbedPane tabbedPane_2;
	private JPanel panel_18;
	private JTabbedPane tabbedPane_3;
	private JPanel panel_19;
	private JTabbedPane tabbedPane_4;
	private JPanel panel_20;
	private JTabbedPane tabbedPane_5;
	private JPanel panel_21;
	private JTabbedPane tabbedPane_6;
	private JPanel panel_22;
	private JTabbedPane tabbedPane_7;
	private JPanel panel_23;

	private JTabbedPane tabbedPane_8;
	private JTabbedPane tabbedPaneA;
	private JScrollPane panel_1;
	private JScrollPane scrollPane_12;
	private JScrollPane scrollPane_13;
	private JScrollPane scrollPane_14;
	private JScrollPane scrollPane_15;
	private JScrollPane scrollPane_16;
	private JScrollPane scrollPane_17;
	private JScrollPane scrollPane_18;
	private JScrollPane scrollPane_19;
	private JScrollPane scrollPane_20;
	private JScrollPane scrollPane_21;
	private JScrollPane scrollPane_22;
	private JScrollPane scrollPane_23;
	private JScrollPane scrollPane_24;
	private JScrollPane scrollPane_25;
	private JScrollPane scrollPane_26;
	private JScrollPane scrollPane_27;
	private JScrollPane scrollPane_28;
	private JScrollPane scrollPane_29;
	private JScrollPane scrollPane_30;
	private JScrollPane scrollPane_31;
	private JScrollPane scrollPane_32;
	private JScrollPane scrollPane_33;
	private JScrollPane scrollPane_34;
	private JScrollPane scrollPane_35;
	private JScrollPane scrollPane_36;
	private JScrollPane scrollPane_37;
	private JScrollPane scrollPane_38;
	private JScrollPane scrollPane_39;
	private JTable AMHERSTTBL1;
	private JTable BOWMANTBL1;
	private JTable GRANDTBL1;
	private JTable AMHERSTTBL11;
	private JTable AMHERSTTBL12;
	private JTable AMHERSTTBL13;
	private JTable AMHERSTTBL14;
	private JTable BOWMANTBL11;
	private JTable BOWMANTBL12;
	private JTable BOWMANTBL13;
	private JTable BOWMANTBL14;
	private JTable GRANDTBL11;
	private JTable GRANDTBL12;
	private JTable GRANDTBL13;
	private JTable GRANDTBL14;
	private JTable MAPLETBL11;
	private JTable MAPLETBL12;
	private JTable MAPLETBL13;
	private JTable MAPLETBL14;
	private JTable TROYTBL11;
	private JTable TROYTBL12;
	private JTable TROYTBL13;
	private JTable TROYTBL14;
	private JTable WAUTAGATBL11;
	private JTable WAUTAGATBL12;
	private JTable WAUTAGATBL13;
	private JTable WAUTAGATBL14;
	private JTable WINLOCKTBL11;
	private JTable WINLOCKTBL12;
	private JTable WINLOCKTBL13;
	private JTable WINLOCKTBL14;
	private JPanel Summary;
	private JTable TROYTBL1;
	private JTable WAUTAGATBL1;
	private JTable WINLOCKTBL1;
	private JTable MAPLETBL1;
	private JLabel HighLoadandLowLoad;
	private JLabel NetworkOutagesPlot;
	private JTable NT1;
	private JLabel lblNetworkScheme;
	private JLabel KTHICON1,KTHICON2,KTHICON3,KTHICON4,KTHICON5,KTHICON6,KTHICON7,KTHICON8,KTHICON9;
	private JTabbedPane tabbedPane_9;
	private JScrollPane scrollPane_40;
	private JScrollPane scrollPane_41;
	private JScrollPane scrollPane_42;
	private JScrollPane scrollPane_43;
	private JTable NT11;
	private JTable NT12;
	private JTable NT13;
	private JTable NT14;
	private JPanel Summary2;
	private JLabel lblNetworkOutages;
	
	private JTable NetWorkOverAll;


	public TablePoP() throws IOException {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 * @throws IOException 
	 */
	private void initialize() throws IOException {
		
		String[] T1C = {"Time","Volt(pu)","Ang(Deg)","Status"} ;
		String[] T5C = {"Time","Uavg(pu)","Ang(Deg)"} ;
		String[] T2C = {"Cluster","Status"} ;
		String[] T4C = {"Status","Size"," Uavg(p.u) ","Angle(degree)"} ;

		

		
		
		ExtractDataFromCSV CSV_OBJ=new ExtractDataFromCSV();
		
	 // SUMMARY

	      String [][] SystemLoad = CSV_OBJ.ExtractTable("src/tables/System.csv");
	      String [][] SystemOverALL = CSV_OBJ.ExtractTable("src/tables/SystemOverAll.csv");
		  String [][] SYS_ANG10 = CSV_OBJ.ExtractTable("src/tables/System10.csv");
		  String [][] SYS_ANG20 = CSV_OBJ.ExtractTable("src/tables/System20.csv");
		  String [][] SYS_ANG30 = CSV_OBJ.ExtractTable("src/tables/System30.csv");
		  String [][] SYS_ANG40 = CSV_OBJ.ExtractTable("src/tables/System40.csv");
		
	 // CLARK
		    String [][] CROSS_VOLTA  = CSV_OBJ.ExtractTable("src/tables/CLAR_VOLT.csv");
		    
	 // CROSS
		    String [][] CROSS_VOLT  = CSV_OBJ.ExtractTable("src/tables/CROSS_VOLT.csv");
		    String [][] CROSS_ANG10 = CSV_OBJ.ExtractTable("src/tables/CROSS_ANG10.csv");
		    String [][] CROSS_ANG20 = CSV_OBJ.ExtractTable("src/tables/CROSS_ANG20.csv");
		    String [][] CROSS_ANG30 = CSV_OBJ.ExtractTable("src/tables/CROSS_ANG30.csv");
		    String [][] CROSS_ANG40 = CSV_OBJ.ExtractTable("src/tables/CROSS_ANG40.csv");
		    
	// AMHERST
			String [][] AMHERST_VOLT  = CSV_OBJ.ExtractTable("src/tables/AMHE_VOLT.csv");
			String [][] AMHERST_ANG10 = CSV_OBJ.ExtractTable("src/tables/AMHE_ANG10.csv");
			String [][] AMHERST_ANG20 = CSV_OBJ.ExtractTable("src/tables/AMHE_ANG20.csv");
			String [][] AMHERST_ANG30 = CSV_OBJ.ExtractTable("src/tables/AMHE_ANG30.csv");
			String [][] AMHERST_ANG40 = CSV_OBJ.ExtractTable("src/tables/AMHE_ANG40.csv");
			
	// BOWMAN
			String [][] BOWMAN_VOLT  = CSV_OBJ.ExtractTable("src/tables/BOWM_VOLT.csv");
			String [][] BOWMAN_ANG10 = CSV_OBJ.ExtractTable("src/tables/BOWM_ANG10.csv");
			String [][] BOWMAN_ANG20 = CSV_OBJ.ExtractTable("src/tables/BOWM_ANG20.csv");
			String [][] BOWMAN_ANG30 = CSV_OBJ.ExtractTable("src/tables/BOWM_ANG30.csv");
			String [][] BOWMAN_ANG40 = CSV_OBJ.ExtractTable("src/tables/BOWM_ANG40.csv");
			
	 // GRAND
			String [][] GRAND_VOLT  = CSV_OBJ.ExtractTable("src/tables/GRAN_VOLT.csv");
			String [][] GRAND_ANG10 = CSV_OBJ.ExtractTable("src/tables/GRAN_ANG10.csv");
			String [][] GRAND_ANG20 = CSV_OBJ.ExtractTable("src/tables/GRAN_ANG20.csv");
			String [][] GRAND_ANG30 = CSV_OBJ.ExtractTable("src/tables/GRAN_ANG30.csv");
			String [][] GRAND_ANG40 = CSV_OBJ.ExtractTable("src/tables/GRAN_ANG40.csv");
			
	 // MAPLE
			String [][] MAPLE_VOLT  = CSV_OBJ.ExtractTable("src/tables/MAPL_VOLT.csv");
			String [][] MAPLE_ANG10 = CSV_OBJ.ExtractTable("src/tables/MAPL_ANG10.csv");
			String [][] MAPLE_ANG20 = CSV_OBJ.ExtractTable("src/tables/MAPL_ANG20.csv");
			String [][] MAPLE_ANG30 = CSV_OBJ.ExtractTable("src/tables/MAPL_ANG30.csv");
			String [][] MAPLE_ANG40 = CSV_OBJ.ExtractTable("src/tables/MAPL_ANG40.csv");
			
	 // TROY
			String [][] TROY_VOLT  = CSV_OBJ.ExtractTable("src/tables/TROY_VOLT.csv");
			String [][] TROY_ANG10 = CSV_OBJ.ExtractTable("src/tables/TROY_ANG10.csv");
			String [][] TROY_ANG20 = CSV_OBJ.ExtractTable("src/tables/TROY_ANG20.csv");
			String [][] TROY_ANG30 = CSV_OBJ.ExtractTable("src/tables/TROY_ANG30.csv");
			String [][] TROY_ANG40 = CSV_OBJ.ExtractTable("src/tables/TROY_ANG40.csv");
			
	 // WAUTAGA
			String [][] WAUTAGA_VOLT  = CSV_OBJ.ExtractTable("src/tables/WAUT_VOLT.csv");
			String [][] WAUTAGA_ANG10 = CSV_OBJ.ExtractTable("src/tables/WAUT_ANG10.csv");
			String [][] WAUTAGA_ANG20 = CSV_OBJ.ExtractTable("src/tables/WAUT_ANG20.csv");
			String [][] WAUTAGA_ANG30 = CSV_OBJ.ExtractTable("src/tables/WAUT_ANG30.csv");
			String [][] WAUTAGA_ANG40 = CSV_OBJ.ExtractTable("src/tables/WAUT_ANG40.csv");
			
	 // WINLOCK
			String [][] WINLOCK_VOLT  = CSV_OBJ.ExtractTable("src/tables/WINL_VOLT.csv");
			String [][] WINLOCK_ANG10 = CSV_OBJ.ExtractTable("src/tables/WINL_ANG10.csv");
			String [][] WINLOCK_ANG20 = CSV_OBJ.ExtractTable("src/tables/WINL_ANG20.csv");
			String [][] WINLOCK_ANG30 = CSV_OBJ.ExtractTable("src/tables/WINL_ANG30.csv");
			String [][] WINLOCK_ANG40 = CSV_OBJ.ExtractTable("src/tables/WINL_ANG40.csv");
			
		

		Image System_Plot1 = new ImageIcon(this.getClass().getResource("img/System.png")).getImage();	
		Image CROSS_Plot1 = new ImageIcon(this.getClass().getResource("img/CROSS_ANG.png")).getImage();
		Image CLARK_Plot1 = new ImageIcon(this.getClass().getResource("img/CLAR_VOLT.png")).getImage();
		Image AMHERST_Plot1 = new ImageIcon(this.getClass().getResource("img/AMHE_ANG.png")).getImage();
		Image BOWMAN_Plot1 = new ImageIcon(this.getClass().getResource("img/BOWM_ANG.png")).getImage();
		Image GRAND_Plot1 = new ImageIcon(this.getClass().getResource("img/GRAN_ANG.png")).getImage();
		Image MAPLE_Plot1 = new ImageIcon(this.getClass().getResource("img/MAPL_ANG.png")).getImage();
		Image TROY_Plot1 = new ImageIcon(this.getClass().getResource("img/TROY_ANG.png")).getImage();
		Image WAUTAGA_Plot1 = new ImageIcon(this.getClass().getResource("img/WAUT_ANG.png")).getImage();
		Image WINLOCK_Plot1 = new ImageIcon(this.getClass().getResource("img/WINL_ANG.png")).getImage();
		Image NetworkSLD = new ImageIcon(this.getClass().getResource("img/network1.png")).getImage();
		
		Image System_Plot = System_Plot1.getScaledInstance(584, 436, Image.SCALE_DEFAULT);
		Image CLARK_Plot = CLARK_Plot1.getScaledInstance(584, 436, Image.SCALE_DEFAULT);
		Image CROSS_Plot = CROSS_Plot1.getScaledInstance(584, 436, Image.SCALE_DEFAULT);
		Image AMHERST_Plot = AMHERST_Plot1.getScaledInstance(584, 436, Image.SCALE_DEFAULT);
		Image BOWMAN_Plot = BOWMAN_Plot1.getScaledInstance(584, 436, Image.SCALE_DEFAULT);
		Image GRAND_Plot = GRAND_Plot1.getScaledInstance(584, 436, Image.SCALE_DEFAULT);
		Image MAPLE_Plot = MAPLE_Plot1.getScaledInstance(584, 436, Image.SCALE_DEFAULT);
		Image TROY_Plot = TROY_Plot1.getScaledInstance(584, 436, Image.SCALE_DEFAULT);
		Image WAUTAGA_Plot = WAUTAGA_Plot1.getScaledInstance(584, 436, Image.SCALE_DEFAULT);
		Image WINLOCK_Plot = WINLOCK_Plot1.getScaledInstance(584, 436, Image.SCALE_DEFAULT);
		
        
        
        Image img = new ImageIcon(this.getClass().getResource("/img/kth_logo.gif")).getImage();        
        
        KTHICON1 = new JLabel("");
        KTHICON1.setIcon(new ImageIcon(img));
        KTHICON1.setBounds(260, 750, 100, 100);
        KTHICON2 = new JLabel("");
        KTHICON2.setIcon(new ImageIcon(img));
        KTHICON2.setBounds(260, 750, 100, 100);
        KTHICON3 = new JLabel("");
        KTHICON3.setIcon(new ImageIcon(img));
        KTHICON3.setBounds(260, 750, 100, 100);
        KTHICON4 = new JLabel("");
        KTHICON4.setIcon(new ImageIcon(img));
        KTHICON4.setBounds(260, 750, 100, 100);
        KTHICON5 = new JLabel("");
        KTHICON5.setIcon(new ImageIcon(img));
        KTHICON5.setBounds(260, 750, 100, 100);
        KTHICON6 = new JLabel("");
        KTHICON6.setIcon(new ImageIcon(img));
        KTHICON6.setBounds(260, 750, 100, 100);
        KTHICON7 = new JLabel("");
        KTHICON7.setIcon(new ImageIcon(img));
        KTHICON7.setBounds(260, 750, 100, 100);
        KTHICON8 = new JLabel("");
        KTHICON8.setIcon(new ImageIcon(img));
        KTHICON8.setBounds(260, 750, 100, 100);
        KTHICON9 = new JLabel("");
        KTHICON9.setIcon(new ImageIcon(img));
        KTHICON9.setBounds(260, 750, 100, 100);

        

	

		OUTPUT = new JFrame();
		OUTPUT.setTitle("OUTPUT");
		OUTPUT.setBounds(100, 100, 725, 920);
		OUTPUT.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		OUTPUT.getContentPane().setLayout(null);
		tabbedPane_1.setBounds(0, 0, 705, 870);
		OUTPUT.getContentPane().add(tabbedPane_1);
		
		
		
		
		
		
		//
		Summary = new JPanel();
		Summary.setBackground(Color.WHITE);
		tabbedPane_1.addTab("Summary", null, Summary, null);
		Summary.setLayout(null);
		
		lblNetworkScheme = new JLabel("NETWORK SCHEME");
		lblNetworkScheme.setBounds(0, 11, 396, 22);
		lblNetworkScheme.setHorizontalAlignment(SwingConstants.CENTER);
		lblNetworkScheme.setFont(new Font("Tahoma", Font.BOLD, 18));
		Summary.add(lblNetworkScheme);
		
		
		JLabel NETWORKSLD = new JLabel("New label");
		NETWORKSLD.setBounds(0, 30, 386, 232);
		Summary.add(NETWORKSLD);
		NETWORKSLD.setIcon(new ImageIcon(NetworkSLD));
		
		 

		
		panel_1 = new JScrollPane();
		panel_1.setBounds(10, 326, 380, 88);
		NT1 = new JTable(SystemLoad,T4C); //Lineout
		panel_1.setViewportView(NT1);
		Summary.add(panel_1);
		

		HighLoadandLowLoad = new JLabel("Network States");
		HighLoadandLowLoad.setBounds(110, 273, 188, 22);
		HighLoadandLowLoad.setHorizontalAlignment(SwingConstants.CENTER);
		HighLoadandLowLoad.setFont(new Font("Tahoma", Font.BOLD, 18));
		Summary.add(HighLoadandLowLoad);
		
	
		
		
		NetworkOutagesPlot = new JLabel("`");
		NetworkOutagesPlot.setBounds(10, 424, 584, 436);
		NetworkOutagesPlot.setIcon(new ImageIcon(System_Plot));
		Summary.add(NetworkOutagesPlot);
		
		tabbedPane_9 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_9.setBounds(400, 48, 210, 365);
		Summary.add(tabbedPane_9);
		
		
		JScrollPane scrollPane_8 = new JScrollPane();
		tabbedPane_9.addTab("K=10", null, scrollPane_8, null);
		NT11 = new JTable(SYS_ANG10,T2C);
		scrollPane_8.setViewportView(NT11);
		
		scrollPane_40 = new JScrollPane();
		tabbedPane_9.addTab("K=20", null, scrollPane_40, null);
		NT12 = new JTable(SYS_ANG20,T2C);
		scrollPane_40.setViewportView(NT12);
		
		scrollPane_41 = new JScrollPane();
		tabbedPane_9.addTab("K=30", null, scrollPane_41, null);
		NT13 = new JTable(SYS_ANG30,T2C);
		scrollPane_41.setViewportView(NT13);
		
		scrollPane_42 = new JScrollPane();
		tabbedPane_9.addTab("K=40", null, scrollPane_42, null);
		NT14 = new JTable(SYS_ANG40,T2C);
		scrollPane_42.setViewportView(NT14);
		

		
		JLabel lblNetworkKnn = new JLabel("NETWORK KNN");
		lblNetworkKnn.setHorizontalAlignment(SwingConstants.CENTER);
		lblNetworkKnn.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNetworkKnn.setBounds(384, 11, 197, 22);
		Summary.add(lblNetworkKnn);
		
		
		Summary2 = new JPanel();
		Summary2.setLayout(null);
		Summary2.setBackground(Color.WHITE);
		tabbedPane_1.addTab("Summary 2", null, Summary2, null);
		
		lblNetworkOutages = new JLabel("NETWORK STATUS");
		lblNetworkOutages.setHorizontalAlignment(SwingConstants.CENTER);
		lblNetworkOutages.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNetworkOutages.setBounds(47, 39, 514, 22);
		Summary2.add(lblNetworkOutages);
		
		scrollPane_43 = new JScrollPane();
		scrollPane_43.setBounds(58, 98, 514, 702);
		Summary2.add(scrollPane_43);
		
		NetWorkOverAll = new JTable(SystemOverALL,T5C);
		scrollPane_43.setViewportView(NetWorkOverAll);
		scrollPane_43.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane_43.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		
		CLARK = new JPanel();
		CLARK.setForeground(Color.WHITE);
		CLARK.setBackground(Color.WHITE);
		
		
		tabbedPane_1.addTab("CLARK", null, CLARK, null);
		CLARK.setLayout(null);
		
		JLabel CLARKLABEL = new JLabel("CLARK");
		CLARKLABEL.setBounds(21, 11, 259, 22);
		CLARK.add(CLARKLABEL);
		CLARKLABEL.setHorizontalAlignment(SwingConstants.CENTER);
		CLARKLABEL.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		JLabel lblTableA = new JLabel("CLARK K-NN");
		lblTableA.setBounds(290, 11, 291, 22);
		CLARK.add(lblTableA);
		lblTableA.setHorizontalAlignment(SwingConstants.CENTER);
		lblTableA.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		
		panel_8A = new JPanel();
		panel_8A.setBackground(Color.WHITE);
		panel_8A.setForeground(Color.WHITE);
		panel_8A.setBounds(21, 33, 259, 281);
		CLARK.add(panel_8A);
		panel_8A.setLayout(null);
		
		scrollPaneA = new JScrollPane();
		scrollPaneA.setBounds(0, 0, 259, 281);
		panel_8A.add(scrollPaneA);
		
		
		CLARKTBL1 = new JTable(CROSS_VOLTA,T5C);
		//CROSSTBL1 = new JTable();
		
		scrollPaneA.setViewportView(CLARKTBL1);
		
		panel_16A = new JPanel();
		panel_16A.setBounds(296, 33, 291, 281);
		CLARK.add(panel_16A);
		panel_16A.setLayout(null);
		
		tabbedPaneA = new JTabbedPane(JTabbedPane.TOP);
		tabbedPaneA.setBounds(0, 0, 291, 281);
		panel_16A.add(tabbedPaneA);
		
		scrollPane_1A = new JScrollPane();
		tabbedPaneA.addTab("K = 10", null, scrollPane_1A, null);
		
	    CLARKTBL11 = new JTable();
		//CROSSTBL11 = new JTable();
		scrollPane_1A.setViewportView(CLARKTBL11);
		
		scrollPane_2A = new JScrollPane();
		tabbedPaneA.addTab("K = 20", null, scrollPane_2A, null);
		
		
		CLARKTBL12A = new JTable();
		//CROSSTBL12 = new JTable();
		scrollPane_2A.setViewportView(CLARKTBL12A);
		
		scrollPane_3A = new JScrollPane();
		tabbedPaneA.addTab("K = 30", null, scrollPane_3A, null);
		
		CLARKTBL13A = new JTable();
		//CROSSTBL13 = new JTable();
		scrollPane_3A.setViewportView(CLARKTBL13A);
		
		
		scrollPane_4A = new JScrollPane();
		tabbedPaneA.addTab("K = 40", null, scrollPane_4A, null);
		
		CLARKTBL14A = new JTable();
		//CROSSTBL14 = new JTable();
		scrollPane_4A.setViewportView(CLARKTBL14A);
		
		label_1A = new JLabel("");
		label_1A.setBounds(0, 313, 576, 436);
		CLARK.add(label_1A);
		label_1A.setIcon(new ImageIcon(CLARK_Plot));
		
		CLARK.add(KTHICON1);
		
		//
		
		//
		CROSS = new JPanel();
		CROSS.setForeground(Color.WHITE);
		CROSS.setBackground(Color.WHITE);
		
		
		tabbedPane_1.addTab("CROSS", null, CROSS, null);
		CROSS.setLayout(null);
		
		JLabel CROSSLABEL = new JLabel("CROSS");
		CROSSLABEL.setBounds(21, 11, 259, 22);
		CROSS.add(CROSSLABEL);
		CROSSLABEL.setHorizontalAlignment(SwingConstants.CENTER);
		CROSSLABEL.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		JLabel lblTable = new JLabel("CROSS K-NN");
		lblTable.setBounds(290, 11, 291, 22);
		CROSS.add(lblTable);
		lblTable.setHorizontalAlignment(SwingConstants.CENTER);
		lblTable.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		
		panel_8 = new JPanel();
		panel_8.setBackground(Color.WHITE);
		panel_8.setForeground(Color.WHITE);
		panel_8.setBounds(21, 33, 259, 281);
		CROSS.add(panel_8);
		panel_8.setLayout(null);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 259, 281);
		panel_8.add(scrollPane);
		
		
		CROSSTBL1 = new JTable(CROSS_VOLT,T1C);
		//CROSSTBL1 = new JTable();
		
		scrollPane.setViewportView(CROSSTBL1);
		
		panel_16 = new JPanel();
		panel_16.setBounds(296, 33, 291, 281);
		CROSS.add(panel_16);
		panel_16.setLayout(null);
		
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 0, 291, 281);
		panel_16.add(tabbedPane);
		
		scrollPane_1 = new JScrollPane();
		tabbedPane.addTab("K = 10", null, scrollPane_1, null);
		
	    CROSSTBL11 = new JTable(CROSS_ANG10,T2C);
		//CROSSTBL11 = new JTable();
		scrollPane_1.setViewportView(CROSSTBL11);
		
		scrollPane_2 = new JScrollPane();
		tabbedPane.addTab("K = 20", null, scrollPane_2, null);
		
		
		CROSSTBL12 = new JTable(CROSS_ANG20,T2C);
		//CROSSTBL12 = new JTable();
		scrollPane_2.setViewportView(CROSSTBL12);
		
		scrollPane_3 = new JScrollPane();
		tabbedPane.addTab("K = 30", null, scrollPane_3, null);
		
		CROSSTBL13 = new JTable(CROSS_ANG30,T2C);
		//CROSSTBL13 = new JTable();
		scrollPane_3.setViewportView(CROSSTBL13);
		
		scrollPane_4 = new JScrollPane();
		tabbedPane.addTab("K = 40", null, scrollPane_4, null);
		
		CROSSTBL14 = new JTable(CROSS_ANG40,T2C);
		//CROSSTBL14 = new JTable();
		scrollPane_4.setViewportView(CROSSTBL14);
		
		label_1 = new JLabel("");
		label_1.setBounds(0, 313, 576, 436);
		CROSS.add(label_1);
		label_1.setIcon(new ImageIcon(CROSS_Plot));
		CROSS.add(KTHICON2);
		
		//
		
		
		AMHERST = new JPanel();
		AMHERST.setBackground(Color.WHITE);
		AMHERST.setForeground(Color.WHITE);
		tabbedPane_1.addTab("AMHERST", null, AMHERST, null);
		AMHERST.setLayout(null);
		
		AMHERSTlabel = new JLabel("AMHERST");
		AMHERSTlabel.setBounds(21, 11, 259, 22);

		
		AMHERSTlabel.setHorizontalAlignment(SwingConstants.CENTER);
		AMHERSTlabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		AMHERST.add(AMHERSTlabel);
		
		label_2 = new JLabel("AMHERST K-NN");
		label_2.setBounds(290, 11, 291, 22);
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		AMHERST.add(label_2);
		
		panel_9 = new JPanel();
		panel_9.setLayout(null);
		panel_9.setBounds(21, 33, 259, 281);
		AMHERST.add(panel_9);
		
		scrollPane_5 = new JScrollPane();
		scrollPane_5.setBounds(0, 0, 259, 281);
		panel_9.add(scrollPane_5);
		
		
		AMHERSTTBL1 = new JTable(AMHERST_VOLT,T1C);
		//AMHERSTTBL1 = new JTable();
		scrollPane_5.setViewportView(AMHERSTTBL1);
		
		Photo2 = new JLabel("");
		Photo2.setBounds(0, 313, 576, 436);
		Photo2.setIcon(new ImageIcon(AMHERST_Plot));
		AMHERST.add(Photo2);
		
		panel_17 = new JPanel();
		panel_17.setLayout(null);
		panel_17.setBounds(296, 33, 291, 281);
		AMHERST.add(panel_17);
		
		tabbedPane_2 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_2.setBounds(0, 0, 291, 281);
		panel_17.add(tabbedPane_2);
		
		scrollPane_12 = new JScrollPane();
		tabbedPane_2.addTab("K = 10", null, scrollPane_12, null);
		
		AMHERSTTBL11 = new JTable(AMHERST_ANG10,T2C);
		//AMHERSTTBL11 = new JTable();
		scrollPane_12.setViewportView(AMHERSTTBL11);
		
		scrollPane_13 = new JScrollPane();
		tabbedPane_2.addTab("K = 20", null, scrollPane_13, null);
		
		AMHERSTTBL12 = new JTable(AMHERST_ANG20,T2C);
		//AMHERSTTBL12 = new JTable();
		scrollPane_13.setViewportView(AMHERSTTBL12);
		
		scrollPane_14 = new JScrollPane();
		tabbedPane_2.addTab("K = 30", null, scrollPane_14, null);
		
		AMHERSTTBL13 = new JTable(AMHERST_ANG30,T2C);
		//AMHERSTTBL13 = new JTable();
		scrollPane_14.setViewportView(AMHERSTTBL13);
		
		scrollPane_15 = new JScrollPane();
		tabbedPane_2.addTab("K = 40", null, scrollPane_15, null);
		
		AMHERSTTBL14 = new JTable(AMHERST_ANG40,T2C);
		//AMHERSTTBL14 = new JTable();
		scrollPane_15.setViewportView(AMHERSTTBL14);
		AMHERST.add(KTHICON3);
		
		BOWMAN = new JPanel();
		BOWMAN.setBackground(Color.WHITE);
		tabbedPane_1.addTab("BOWMAN", null, BOWMAN, null);
		BOWMAN.setLayout(null);
		
		
		lblSs = new JLabel("BOWMAN");
		lblSs.setBounds(21, 11, 259, 22);
		lblSs.setHorizontalAlignment(SwingConstants.CENTER);
		lblSs.setFont(new Font("Tahoma", Font.BOLD, 18));
		BOWMAN.add(lblSs);
		
		lblSsKnn = new JLabel("BOWMAN K-NN");
		lblSsKnn.setBounds(290, 11, 291, 22);
		lblSsKnn.setHorizontalAlignment(SwingConstants.CENTER);
		lblSsKnn.setFont(new Font("Tahoma", Font.BOLD, 18));
		BOWMAN.add(lblSsKnn);
		
		panel_10 = new JPanel();
		panel_10.setLayout(null);
		panel_10.setBounds(21, 33, 259, 281);
		BOWMAN.add(panel_10);
		
		scrollPane_6 = new JScrollPane();
		scrollPane_6.setBounds(0, 0, 259, 281);
		panel_10.add(scrollPane_6);
		
		
		BOWMANTBL1 = new JTable(BOWMAN_VOLT,T1C);
		//BOWMANTBL1 = new JTable();
		scrollPane_6.setViewportView(BOWMANTBL1);
		
		Photo3 = new JLabel("");
		Photo3.setBounds(0, 313, 576, 436);
		Photo3.setIcon(new ImageIcon(BOWMAN_Plot));
		BOWMAN.add(Photo3);
		
		panel_18 = new JPanel();
		panel_18.setLayout(null);
		panel_18.setBounds(296, 33, 291, 281);
		BOWMAN.add(panel_18);
		
		tabbedPane_3 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_3.setBounds(0, 0, 291, 281);
		panel_18.add(tabbedPane_3);
		
		scrollPane_16 = new JScrollPane();
		tabbedPane_3.addTab("K = 10", null, scrollPane_16, null);
		
		BOWMANTBL11 = new JTable(BOWMAN_ANG10,T2C);
		//BOWMANTBL11 = new JTable();
		scrollPane_16.setViewportView(BOWMANTBL11);
		
		scrollPane_17 = new JScrollPane();
		tabbedPane_3.addTab("K = 20", null, scrollPane_17, null);
		
		BOWMANTBL12 = new JTable(BOWMAN_ANG20,T2C);
		//BOWMANTBL12 = new JTable();
		scrollPane_17.setViewportView(BOWMANTBL12);
		
		scrollPane_18 = new JScrollPane();
		tabbedPane_3.addTab("K = 30", null, scrollPane_18, null);
		
		BOWMANTBL13 = new JTable(BOWMAN_ANG30,T2C);
		//BOWMANTBL13 = new JTable();
		scrollPane_18.setViewportView(BOWMANTBL13);
		
		scrollPane_19 = new JScrollPane();
		tabbedPane_3.addTab("K = 40", null, scrollPane_19, null);
		
		BOWMANTBL14 = new JTable(BOWMAN_ANG40,T2C);
		//BOWMANTBL14 = new JTable();
		scrollPane_19.setViewportView(BOWMANTBL14);
		BOWMAN.add(KTHICON4);
		
		GRAND = new JPanel();
		GRAND.setBackground(Color.WHITE);
		tabbedPane_1.addTab("GRAND", null, GRAND, null);
		GRAND.setLayout(null);
		
		lblSs_1 = new JLabel("GRAND");
		lblSs_1.setBounds(21, 11, 259, 22);
		lblSs_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblSs_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		GRAND.add(lblSs_1);
		
		lblSsKnn_1 = new JLabel("GRAND K-NN");
		lblSsKnn_1.setBounds(290, 11, 291, 22);
		lblSsKnn_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblSsKnn_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		GRAND.add(lblSsKnn_1);
		
		panel_11 = new JPanel();
		panel_11.setLayout(null);
		panel_11.setBounds(21, 33, 259, 281);
		GRAND.add(panel_11);
		
		scrollPane_7 = new JScrollPane();
		scrollPane_7.setBounds(0, 0, 259, 281);
		panel_11.add(scrollPane_7);
		
		GRANDTBL1 = new JTable(GRAND_VOLT,T1C);
		//GRANDTBL1 = new JTable();
		scrollPane_7.setViewportView(GRANDTBL1);
		
		Photo4 = new JLabel("");
		Photo4.setBounds(0, 313, 576, 436);
		Photo4.setIcon(new ImageIcon(GRAND_Plot));
		GRAND.add(Photo4);
		
		panel_19 = new JPanel();
		panel_19.setLayout(null);
		panel_19.setBounds(296, 33, 291, 281);
		GRAND.add(panel_19);
		
		tabbedPane_4 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_4.setBounds(0, 0, 291, 281);
		panel_19.add(tabbedPane_4);
		
		scrollPane_20 = new JScrollPane();
		tabbedPane_4.addTab("K = 10", null, scrollPane_20, null);
		
		GRANDTBL11 = new JTable(GRAND_ANG10,T2C);
		//GRANDTBL11 = new JTable();
		scrollPane_20.setViewportView(GRANDTBL11);
		
		scrollPane_21 = new JScrollPane();
		tabbedPane_4.addTab("K = 20", null, scrollPane_21, null);
		
		GRANDTBL12 = new JTable(GRAND_ANG20,T2C);
		//GRANDTBL12 = new JTable();
		scrollPane_21.setViewportView(GRANDTBL12);
		
		scrollPane_22 = new JScrollPane();
		tabbedPane_4.addTab("K = 30", null, scrollPane_22, null);
		
		GRANDTBL13 = new JTable(GRAND_ANG30,T2C);
		//GRANDTBL13 = new JTable();
		scrollPane_22.setViewportView(GRANDTBL13);
		
		scrollPane_23 = new JScrollPane();
		tabbedPane_4.addTab("K = 40", null, scrollPane_23, null);
		
		GRANDTBL14 = new JTable(GRAND_ANG40,T2C);
		//GRANDTBL14 = new JTable();
		
		scrollPane_23.setViewportView(GRANDTBL14);
		GRAND.add(KTHICON5);
		
		MAPLE = new JPanel();
		MAPLE.setBackground(Color.WHITE);
		tabbedPane_1.addTab("MAPLE", null, MAPLE, null);
		MAPLE.setLayout(null);
		
		lblSs_2 = new JLabel("MAPLE");
		lblSs_2.setBounds(21, 11, 259, 22);
		lblSs_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblSs_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		MAPLE.add(lblSs_2);
		
		lblSsKnn_2 = new JLabel("MAPLE K-NN");
		lblSsKnn_2.setBounds(290, 11, 291, 22);
		lblSsKnn_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblSsKnn_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		MAPLE.add(lblSsKnn_2);
		
		panel_12 = new JPanel();
		panel_12.setLayout(null);
		panel_12.setBounds(21, 33, 259, 281);
		MAPLE.add(panel_12);
		
		
		scrollbane123 = new JScrollPane();
		scrollbane123.setBounds(0, 0, 259, 281);
		panel_12.add(scrollbane123);
		
		MAPLETBL1 = new JTable(MAPLE_VOLT,T1C);
		//MAPLETBL1 = new JTable();

		scrollbane123.setViewportView(MAPLETBL1);
		
		Photo5 = new JLabel("");
		Photo5.setBounds(0, 313, 576, 436);
		Photo5.setIcon(new ImageIcon(MAPLE_Plot));
		MAPLE.add(Photo5);
		
		panel_23 = new JPanel();
		panel_23.setLayout(null);
		panel_23.setBounds(296, 33, 291, 281);
		MAPLE.add(panel_23);
		
		tabbedPane_8 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_8.setBounds(0, 0, 291, 281);
		panel_23.add(tabbedPane_8);
		
		scrollPane_24 = new JScrollPane();
		tabbedPane_8.addTab("K = 10", null, scrollPane_24, null);
		
		MAPLETBL11 = new JTable(MAPLE_ANG10,T2C);
		//MAPLETBL11 = new JTable();
		scrollPane_24.setViewportView(MAPLETBL11);
		
		scrollPane_25 = new JScrollPane();
		tabbedPane_8.addTab("K = 20", null, scrollPane_25, null);
		
		MAPLETBL12 = new JTable(MAPLE_ANG20,T2C);
		//MAPLETBL12 = new JTable();
		scrollPane_25.setViewportView(MAPLETBL12);
		
		scrollPane_26 = new JScrollPane();
		tabbedPane_8.addTab("K = 30", null, scrollPane_26, null);
		
		MAPLETBL13 = new JTable(MAPLE_ANG30,T2C);
		//MAPLETBL13 = new JTable();
		scrollPane_26.setViewportView(MAPLETBL13);
		
		scrollPane_27 = new JScrollPane();
		tabbedPane_8.addTab("K = 40", null, scrollPane_27, null);
		
		MAPLETBL14 = new JTable(MAPLE_ANG40,T2C);
		//MAPLETBL14 = new JTable();
		scrollPane_27.setViewportView(MAPLETBL14);
		MAPLE.add(KTHICON6);
		
		TROY = new JPanel();
		TROY.setBackground(Color.WHITE);
		tabbedPane_1.addTab("TROY", null, TROY, null);
		TROY.setLayout(null);
		
		lblSs_3 = new JLabel("TROY");
		lblSs_3.setBounds(21, 11, 259, 22);
		lblSs_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblSs_3.setFont(new Font("Tahoma", Font.BOLD, 18));
		TROY.add(lblSs_3);
		
		lblSsKnn_3 = new JLabel("TROY K-NN");
		lblSsKnn_3.setBounds(290, 11, 291, 22);
		lblSsKnn_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblSsKnn_3.setFont(new Font("Tahoma", Font.BOLD, 18));
		TROY.add(lblSsKnn_3);
		
		panel_13 = new JPanel();
		panel_13.setLayout(null);
		panel_13.setBounds(21, 33, 259, 281);
		TROY.add(panel_13);
		
		scrollPane_9 = new JScrollPane();
		scrollPane_9.setBounds(0, 0, 259, 281);
		panel_13.add(scrollPane_9);
		
		TROYTBL1 = new JTable(TROY_VOLT,T1C);
		//TROYTBL1 = new JTable();
		scrollPane_9.setViewportView(TROYTBL1);
		
		Photo6 = new JLabel("");
		Photo6.setBounds(0, 313, 576, 436);
		Photo6.setIcon(new ImageIcon(TROY_Plot));
		TROY.add(Photo6);
		
		panel_22 = new JPanel();
		panel_22.setLayout(null);
		panel_22.setBounds(296, 33, 291, 281);
		TROY.add(panel_22);
		
		tabbedPane_7 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_7.setBounds(0, 0, 291, 281);
		panel_22.add(tabbedPane_7);
		
		scrollPane_28 = new JScrollPane();
		tabbedPane_7.addTab("K = 10", null, scrollPane_28, null);
		
		TROYTBL11 = new JTable(TROY_ANG10,T2C);
		//TROYTBL11 = new JTable();
		scrollPane_28.setViewportView(TROYTBL11);
		
		scrollPane_29 = new JScrollPane();
		tabbedPane_7.addTab("K = 20", null, scrollPane_29, null);
		
		TROYTBL12 = new JTable(TROY_ANG20,T2C);
		//TROYTBL12 = new JTable();
		scrollPane_29.setViewportView(TROYTBL12);
		
		scrollPane_30 = new JScrollPane();
		tabbedPane_7.addTab("K = 30", null, scrollPane_30, null);
		
		TROYTBL13 = new JTable(TROY_ANG30,T2C);
		//TROYTBL13 = new JTable();
		scrollPane_30.setViewportView(TROYTBL13);
		
		scrollPane_31 = new JScrollPane();
		tabbedPane_7.addTab("K = 40", null, scrollPane_31, null);
		
		TROYTBL14 = new JTable(TROY_ANG40,T2C);
		//TROYTBL14 = new JTable();
		scrollPane_31.setViewportView(TROYTBL14);
		TROY.add(KTHICON7);
		
		WAUTAGA = new JPanel();
		WAUTAGA.setBackground(Color.WHITE);
		tabbedPane_1.addTab("WAUTAGA", null, WAUTAGA, null);
		WAUTAGA.setLayout(null);
		
		lblSs_4 = new JLabel("WAUTAGA");
		lblSs_4.setBounds(21, 11, 259, 22);
		lblSs_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblSs_4.setFont(new Font("Tahoma", Font.BOLD, 18));
		WAUTAGA.add(lblSs_4);
		
		lblSsKnn_4 = new JLabel("WAUTAGA K-NN");
		lblSsKnn_4.setBounds(290, 11, 291, 22);
		lblSsKnn_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblSsKnn_4.setFont(new Font("Tahoma", Font.BOLD, 18));
		WAUTAGA.add(lblSsKnn_4);
		
		panel_14 = new JPanel();
		panel_14.setLayout(null);
		panel_14.setBounds(21, 33, 259, 281);
		WAUTAGA.add(panel_14);
		
		scrollPane_10 = new JScrollPane();
		scrollPane_10.setBounds(0, 0, 259, 281);
		panel_14.add(scrollPane_10);
		
		WAUTAGATBL1 = new JTable(WAUTAGA_VOLT,T1C);
		//WAUTAGATBL1 = new JTable();
		scrollPane_10.setViewportView(WAUTAGATBL1);
		
		Photo7 = new JLabel("");
		Photo7.setBounds(0, 313, 576, 436);
		Photo7.setIcon(new ImageIcon(WAUTAGA_Plot));
		WAUTAGA.add(Photo7);
		
		panel_21 = new JPanel();
		panel_21.setLayout(null);
		panel_21.setBounds(296, 33, 291, 281);
		WAUTAGA.add(panel_21);
		
		tabbedPane_6 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_6.setBounds(0, 0, 291, 281);
		panel_21.add(tabbedPane_6);
		
		scrollPane_32 = new JScrollPane();
		tabbedPane_6.addTab("K = 10", null, scrollPane_32, null);
		
		WAUTAGATBL11 = new JTable(WAUTAGA_ANG10,T2C);
		//WAUTAGATBL11 = new JTable();
		scrollPane_32.setViewportView(WAUTAGATBL11);
		
		scrollPane_33 = new JScrollPane();
		tabbedPane_6.addTab("K = 20", null, scrollPane_33, null);
		
		WAUTAGATBL12 = new JTable(WAUTAGA_ANG20,T2C);
		//WAUTAGATBL12 = new JTable();
		scrollPane_33.setViewportView(WAUTAGATBL12);
		
		scrollPane_34 = new JScrollPane();
		tabbedPane_6.addTab("K = 30", null, scrollPane_34, null);
		
		WAUTAGATBL13 = new JTable(WAUTAGA_ANG30,T2C);
		//WAUTAGATBL13 = new JTable();
		scrollPane_34.setViewportView(WAUTAGATBL13);
		
		scrollPane_35 = new JScrollPane();
		tabbedPane_6.addTab("K = 40", null, scrollPane_35, null);
		
		WAUTAGATBL14 = new JTable(WAUTAGA_ANG40,T2C);
		//WAUTAGATBL14 = new JTable();
		scrollPane_35.setViewportView(WAUTAGATBL14);
		WAUTAGA.add(KTHICON8);
		
		WINLOCK = new JPanel();
		WINLOCK.setBackground(Color.WHITE);
		tabbedPane_1.addTab("WINLOCK", null, WINLOCK, null);
		WINLOCK.setLayout(null);
		
		lblSs_5 = new JLabel("WINLOCK");
		lblSs_5.setBounds(21, 11, 259, 22);
		lblSs_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblSs_5.setFont(new Font("Tahoma", Font.BOLD, 18));
		WINLOCK.add(lblSs_5);
		
		lblSsKnn_5 = new JLabel("WINLOCK K-NN");
		lblSsKnn_5.setBounds(290, 11, 291, 22);
		lblSsKnn_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblSsKnn_5.setFont(new Font("Tahoma", Font.BOLD, 18));
		WINLOCK.add(lblSsKnn_5);
		
		panel_15 = new JPanel();
		panel_15.setLayout(null);
		panel_15.setBounds(21, 33, 259, 281);
		WINLOCK.add(panel_15);
		
		scrollPane_11 = new JScrollPane();
		scrollPane_11.setBounds(0, 0, 259, 281);
		panel_15.add(scrollPane_11);
		
		WINLOCKTBL1 = new JTable(WINLOCK_VOLT,T1C);
		//WINLOCKTBL1 = new JTable();
		scrollPane_11.setViewportView(WINLOCKTBL1);
		
		Photo8 = new JLabel("");
		Photo8.setBounds(0, 313, 576, 436);
		Photo8.setIcon(new ImageIcon(WINLOCK_Plot));
		WINLOCK.add(Photo8);
		
		panel_20 = new JPanel();
		panel_20.setLayout(null);
		panel_20.setBounds(296, 33, 291, 281);
		WINLOCK.add(panel_20);
		
		tabbedPane_5 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_5.setBounds(0, 0, 291, 281);
		panel_20.add(tabbedPane_5);
		
		scrollPane_36 = new JScrollPane();
		tabbedPane_5.addTab("K = 10", null, scrollPane_36, null);
		
		WINLOCKTBL11 = new JTable(WINLOCK_ANG10,T2C);
		//WINLOCKTBL11 = new JTable();
		scrollPane_36.setViewportView(WINLOCKTBL11);
		
		scrollPane_37 = new JScrollPane();
		tabbedPane_5.addTab("K = 20", null, scrollPane_37, null);
		
		WINLOCKTBL12 = new JTable(WINLOCK_ANG20,T2C);
		//WINLOCKTBL12 = new JTable();
		scrollPane_37.setViewportView(WINLOCKTBL12);
		
		scrollPane_38 = new JScrollPane();
		tabbedPane_5.addTab("K = 30", null, scrollPane_38, null);
		
		WINLOCKTBL13 = new JTable(WINLOCK_ANG30,T2C);
		//WINLOCKTBL13 = new JTable();
		
		scrollPane_38.setViewportView(WINLOCKTBL13);
		scrollPane_39 = new JScrollPane();
		tabbedPane_5.addTab("K = 40", null, scrollPane_39, null);
		
		//WINLOCKTBL14 = new JTable();
		WINLOCKTBL14 = new JTable(WINLOCK_ANG40,T2C);
		
		
		scrollPane_39.setViewportView(WINLOCKTBL14);
		WINLOCK.add(KTHICON9);
        
	}
}
