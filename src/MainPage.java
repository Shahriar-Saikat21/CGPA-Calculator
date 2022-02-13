import javax.swing.JOptionPane;


public class MainPage extends javax.swing.JFrame {

    public MainPage() {
        initComponents();
        setLocationRelativeTo(null);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        previousCGPATF = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        previousCreditTF = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        courNameOneTF = new javax.swing.JTextField();
        courNameFourTF = new javax.swing.JTextField();
        courNameFiveTF = new javax.swing.JTextField();
        courNameThreeTF = new javax.swing.JTextField();
        courNameSixTF = new javax.swing.JTextField();
        courNameSevenTF = new javax.swing.JTextField();
        oneBox = new javax.swing.JComboBox<>();
        courNameTwoTF = new javax.swing.JTextField();
        twoBox = new javax.swing.JComboBox<>();
        threeBox = new javax.swing.JComboBox<>();
        fourBox = new javax.swing.JComboBox<>();
        fiveBox = new javax.swing.JComboBox<>();
        sixBox = new javax.swing.JComboBox<>();
        sevenBox = new javax.swing.JComboBox<>();
        onePointTF = new javax.swing.JTextField();
        twoPointTF = new javax.swing.JTextField();
        threePointTF = new javax.swing.JTextField();
        fourPointTF = new javax.swing.JTextField();
        fivePointTF = new javax.swing.JTextField();
        sixPointTF = new javax.swing.JTextField();
        sevenPointTF = new javax.swing.JTextField();
        calculateBTN = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        resetBTN = new javax.swing.JButton();
        resultLabel = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CGPA Calculator");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 0, 51));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CGPA Calculator");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(279, 279, 279))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 974, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel2.setText("Previous CGPA");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 116, 139, 31));

        previousCGPATF.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        getContentPane().add(previousCGPATF, new org.netbeans.lib.awtextra.AbsoluteConstraints(286, 116, 135, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel3.setText("Previous Completed Credit");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(439, 116, 239, 31));

        previousCreditTF.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        getContentPane().add(previousCreditTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 116, 135, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel4.setText("Course Name");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 165, 139, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel5.setText("Credit");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(286, 165, 76, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel6.setText("Point");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 165, 76, -1));

        courNameOneTF.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        getContentPane().add(courNameOneTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 209, 123, -1));

        courNameFourTF.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        getContentPane().add(courNameFourTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 314, 123, -1));

        courNameFiveTF.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        getContentPane().add(courNameFiveTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 353, 123, -1));

        courNameThreeTF.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        getContentPane().add(courNameThreeTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 281, 123, -1));

        courNameSixTF.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        getContentPane().add(courNameSixTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 386, 123, -1));

        courNameSevenTF.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        getContentPane().add(courNameSevenTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 419, 123, -1));

        oneBox.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        oneBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4" }));
        getContentPane().add(oneBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(276, 209, 70, -1));

        courNameTwoTF.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        getContentPane().add(courNameTwoTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 242, 123, -1));

        twoBox.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        twoBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4" }));
        getContentPane().add(twoBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(276, 242, 70, -1));

        threeBox.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        threeBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4" }));
        getContentPane().add(threeBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(276, 281, 70, -1));

        fourBox.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        fourBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4" }));
        getContentPane().add(fourBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(276, 314, 70, -1));

        fiveBox.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        fiveBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4" }));
        getContentPane().add(fiveBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(276, 353, 70, -1));

        sixBox.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        sixBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4" }));
        getContentPane().add(sixBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(276, 386, 70, -1));

        sevenBox.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        sevenBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4" }));
        getContentPane().add(sevenBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(276, 419, 70, -1));

        onePointTF.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        getContentPane().add(onePointTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(372, 209, 84, -1));

        twoPointTF.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        getContentPane().add(twoPointTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(372, 242, 84, -1));

        threePointTF.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        getContentPane().add(threePointTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(372, 281, 84, -1));

        fourPointTF.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        getContentPane().add(fourPointTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(372, 314, 84, -1));

        fivePointTF.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        getContentPane().add(fivePointTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(372, 353, 84, -1));

        sixPointTF.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        getContentPane().add(sixPointTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(372, 386, 84, -1));

        sevenPointTF.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        getContentPane().add(sevenPointTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(372, 419, 84, -1));

        calculateBTN.setBackground(new java.awt.Color(51, 0, 51));
        calculateBTN.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        calculateBTN.setForeground(new java.awt.Color(255, 255, 255));
        calculateBTN.setText("Calculate");
        calculateBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculateBTNActionPerformed(evt);
            }
        });
        getContentPane().add(calculateBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(614, 211, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel7.setText("Your Current CGPA");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(649, 270, 223, -1));

        resetBTN.setBackground(new java.awt.Color(0, 153, 153));
        resetBTN.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        resetBTN.setForeground(new java.awt.Color(255, 255, 255));
        resetBTN.setText("Reset");
        resetBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetBTNActionPerformed(evt);
            }
        });
        getContentPane().add(resetBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(765, 211, 140, -1));

        resultLabel.setFont(new java.awt.Font("Segoe UI", 3, 48)); // NOI18N
        getContentPane().add(resultLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 300, 220, 80));

        jLabel8.setText("Developed By Shahriar Imtiaz Saikat");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(377, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(272, 272, 272))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(51, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addContainerGap())
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 460, 980, 80));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void calculateBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculateBTNActionPerformed
        try{
            double pastCGPA = Double.parseDouble(previousCGPATF.getText());
            int pastCompletedCredit = Integer.parseInt(previousCreditTF.getText());
            
            int totalPresentCredit = oneBox.getSelectedIndex()+twoBox.getSelectedIndex()+threeBox.getSelectedIndex()
                    +fourBox.getSelectedIndex()+fiveBox.getSelectedIndex()+sixBox.getSelectedIndex()+sevenBox.getSelectedIndex();
            
            int oneFlag=0,twoFlag=0,threeFlag=0,fourFlag=0,fiveFlag=0,sixFlag=0,sevenFlag=0;
            
            if(onePointTF.getText().isEmpty()){
                onePointTF.setText("0");
                oneFlag = 1;
            }
            if(twoPointTF.getText().isEmpty()){
                twoPointTF.setText("0");
                twoFlag = 1;
            }
            if(threePointTF.getText().isEmpty()){
                threePointTF.setText("0");
                threeFlag = 1;
            }
            if(fourPointTF.getText().isEmpty()){
                fourPointTF.setText("0");
                fourFlag = 1;
            }
            if(fivePointTF.getText().isEmpty()){
                fivePointTF.setText("0");
                fiveFlag = 1;
            }
            if(sixPointTF.getText().isEmpty()){
                sixPointTF.setText("0");
                sixFlag = 1;
            }
            if(sevenPointTF.getText().isEmpty()){
                sevenPointTF.setText("0");
                sevenFlag = 1;
            }
            
            double totalWeight = oneBox.getSelectedIndex()*Double.parseDouble(onePointTF.getText())+
                    twoBox.getSelectedIndex()*Double.parseDouble(twoPointTF.getText())+
                    threeBox.getSelectedIndex()*Double.parseDouble(threePointTF.getText())+
                    fourBox.getSelectedIndex()*Double.parseDouble(fourPointTF.getText())+
                    fiveBox.getSelectedIndex()*Double.parseDouble(fivePointTF.getText())+
                    sixBox.getSelectedIndex()*Double.parseDouble(sixPointTF.getText())+
                    sevenBox.getSelectedIndex()*Double.parseDouble(sevenPointTF.getText()); 
            
            double totalGPA = totalWeight/totalPresentCredit;
            
            double currentCGPA = ((pastCGPA * pastCompletedCredit)+(totalGPA*totalPresentCredit))/(pastCompletedCredit+totalPresentCredit);
            
            if(oneFlag>0){
                onePointTF.setText("");
            }
            if(twoFlag>0){
                twoPointTF.setText("");
            }
            if(threeFlag>0){
                threePointTF.setText("");
            }
            if(fourFlag>0){
                fourPointTF.setText("");
            }
            if(fiveFlag>0){
                fivePointTF.setText("");
            }
            if(sixFlag>0){
                sixPointTF.setText("");
            }
            if(sevenFlag>0){
                sevenPointTF.setText("");
            }
            
            int n = 2;
            double number = Math.round(currentCGPA*Math.pow(10,n))/Math.pow(10,n);
            resultLabel.setText(number+""); 
            
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Invalid Inputs, Please Enter Correct Inputs");
        }
               
    }//GEN-LAST:event_calculateBTNActionPerformed

    private void resetBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetBTNActionPerformed
        previousCGPATF.setText("");
        previousCreditTF.setText("");
        resultLabel.setText("");
        onePointTF.setText("");
        twoPointTF.setText("");
        threePointTF.setText("");
        fourPointTF.setText("");
        fivePointTF.setText("");
        sixPointTF.setText("");
        sevenPointTF.setText("");
        courNameOneTF.setText("");
        courNameTwoTF.setText("");
        courNameThreeTF.setText("");
        courNameFourTF.setText("");
        courNameFiveTF.setText("");
        courNameSixTF.setText("");
        courNameSevenTF.setText("");
        oneBox.setSelectedIndex(0);
        twoBox.setSelectedIndex(0);
        threeBox.setSelectedIndex(0);
        fourBox.setSelectedIndex(0);
        fiveBox.setSelectedIndex(0);
        sixBox.setSelectedIndex(0);
        sevenBox.setSelectedIndex(0);       
    }//GEN-LAST:event_resetBTNActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton calculateBTN;
    private javax.swing.JTextField courNameFiveTF;
    private javax.swing.JTextField courNameFourTF;
    private javax.swing.JTextField courNameOneTF;
    private javax.swing.JTextField courNameSevenTF;
    private javax.swing.JTextField courNameSixTF;
    private javax.swing.JTextField courNameThreeTF;
    private javax.swing.JTextField courNameTwoTF;
    private javax.swing.JComboBox<String> fiveBox;
    private javax.swing.JTextField fivePointTF;
    private javax.swing.JComboBox<String> fourBox;
    private javax.swing.JTextField fourPointTF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JComboBox<String> oneBox;
    private javax.swing.JTextField onePointTF;
    private javax.swing.JTextField previousCGPATF;
    private javax.swing.JTextField previousCreditTF;
    private javax.swing.JButton resetBTN;
    private javax.swing.JLabel resultLabel;
    private javax.swing.JComboBox<String> sevenBox;
    private javax.swing.JTextField sevenPointTF;
    private javax.swing.JComboBox<String> sixBox;
    private javax.swing.JTextField sixPointTF;
    private javax.swing.JComboBox<String> threeBox;
    private javax.swing.JTextField threePointTF;
    private javax.swing.JComboBox<String> twoBox;
    private javax.swing.JTextField twoPointTF;
    // End of variables declaration//GEN-END:variables
}
