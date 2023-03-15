/*Steven Lantz
*ITDEV-140-002
*Fall 2019
*Semester Project: Airline App*/
package lantz_airlineapp;

import java.awt.Color;
import javax.swing.JOptionPane;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Payment extends javax.swing.JFrame {

//Instantiating objects
    Date date = new Date();//Get date for assignment info
    AirlineUX ux = new AirlineUX();
    
   

//Field declaration
    private static int totalDue ;
 
    
    /**
     * Creates new form Payment
     */
    public Payment(int totalPayment) {
        totalDue = totalPayment;
        
        initComponents();
        //Set background color on form
        getContentPane().setBackground(new java.awt.Color(51, 153, 255));
        
//Hide error messages
        lblFName.setVisible(false);
        lblLName.setVisible(false);
        lblCardNum.setVisible(false);
        lblMonth.setVisible(false);
        lblYear.setVisible(false);
        lblCvc.setVisible(false);
        lblCardType.setVisible(false);

//Set total due field
txtTotalDue.setText(String.valueOf(totalDue));
txtTotalDue.setBackground(Color.black);

txtTotalDue.setForeground(Color.red);

        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jMenuItem1 = new javax.swing.JMenuItem();
        jLabel10 = new javax.swing.JLabel();
        lblCreditLogos = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtFName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtLName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        radVisa = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        txtTotalDue = new javax.swing.JTextField();
        radMC = new javax.swing.JRadioButton();
        radAmex = new javax.swing.JRadioButton();
        radDiscover = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        txtCardNum = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        cmbMonth = new javax.swing.JComboBox<>();
        cmbYear = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        txtCvc = new javax.swing.JTextField();
        btnAuthorize = new javax.swing.JButton();
        btnClearForm = new javax.swing.JButton();
        lblFName = new javax.swing.JLabel();
        lblLName = new javax.swing.JLabel();
        lblCardNum = new javax.swing.JLabel();
        lblMonth = new javax.swing.JLabel();
        lblYear = new javax.swing.JLabel();
        lblCvc = new javax.swing.JLabel();
        lblCardType = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mniInfo = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        jLabel10.setText("jLabel10");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Payment Information");

        lblCreditLogos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/credit-card-logos150.jpg"))); // NOI18N

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 2, 38)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 255));
        jLabel1.setText("Cheap-O Airlines");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 306, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("sansserif", 1, 16)); // NOI18N
        jLabel2.setText("First Name:");

        txtFName.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        txtFName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFNameActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("sansserif", 1, 16)); // NOI18N
        jLabel3.setText("Last Name:");

        txtLName.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N

        jLabel4.setFont(new java.awt.Font("sansserif", 1, 32)); // NOI18N
        jLabel4.setText("PAYMENT DETAILS");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel5.setFont(new java.awt.Font("sansserif", 1, 16)); // NOI18N
        jLabel5.setText("Payment Method:");
        jLabel5.setToolTipText("");

        radVisa.setBackground(new java.awt.Color(0, 153, 255));
        buttonGroup1.add(radVisa);
        radVisa.setFont(new java.awt.Font("sansserif", 1, 16)); // NOI18N
        radVisa.setText("VISA");
        radVisa.setActionCommand("Visa");

        jLabel6.setFont(new java.awt.Font("sansserif", 1, 16)); // NOI18N
        jLabel6.setText("Total Amount Due:");

        txtTotalDue.setBackground(new java.awt.Color(0, 0, 0));
        txtTotalDue.setFont(new java.awt.Font("sansserif", 1, 16)); // NOI18N
        txtTotalDue.setForeground(new java.awt.Color(51, 255, 0));
        txtTotalDue.setEnabled(false);
        txtTotalDue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalDueActionPerformed(evt);
            }
        });

        radMC.setBackground(new java.awt.Color(51, 153, 255));
        buttonGroup1.add(radMC);
        radMC.setFont(new java.awt.Font("sansserif", 1, 16)); // NOI18N
        radMC.setText("MC");

        radAmex.setBackground(new java.awt.Color(0, 153, 255));
        buttonGroup1.add(radAmex);
        radAmex.setFont(new java.awt.Font("sansserif", 1, 16)); // NOI18N
        radAmex.setText("AMEX");

        radDiscover.setBackground(new java.awt.Color(0, 153, 255));
        buttonGroup1.add(radDiscover);
        radDiscover.setFont(new java.awt.Font("sansserif", 1, 16)); // NOI18N
        radDiscover.setText("DISCOVER");

        jLabel7.setFont(new java.awt.Font("sansserif", 1, 16)); // NOI18N
        jLabel7.setText("Card Number:");

        txtCardNum.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N

        jLabel8.setFont(new java.awt.Font("sansserif", 1, 16)); // NOI18N
        jLabel8.setText("Exp Date:");

        cmbMonth.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        cmbMonth.setMaximumRowCount(12);
        cmbMonth.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "JAN", "FEB", "MAR", "APR", "MAY", "JUN", "JUL", "AUG", "SEP", "OCT", "NOV", "DEC" }));
        cmbMonth.setSelectedIndex(-1);

        cmbYear.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        cmbYear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026" }));
        cmbYear.setSelectedIndex(-1);

        jLabel9.setFont(new java.awt.Font("sansserif", 1, 16)); // NOI18N
        jLabel9.setText("CVC:");

        txtCvc.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N

        btnAuthorize.setBackground(new java.awt.Color(0, 204, 51));
        btnAuthorize.setFont(new java.awt.Font("sansserif", 1, 16)); // NOI18N
        btnAuthorize.setText("Authorize");
        btnAuthorize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAuthorizeActionPerformed(evt);
            }
        });

        btnClearForm.setBackground(new java.awt.Color(255, 51, 51));
        btnClearForm.setFont(new java.awt.Font("sansserif", 1, 16)); // NOI18N
        btnClearForm.setText("Clear");
        btnClearForm.setActionCommand("");
        btnClearForm.setAutoscrolls(true);
        btnClearForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearFormActionPerformed(evt);
            }
        });

        lblFName.setFont(new java.awt.Font("sansserif", 3, 14)); // NOI18N
        lblFName.setForeground(new java.awt.Color(255, 51, 51));
        lblFName.setText("Please enter a first name");

        lblLName.setFont(new java.awt.Font("sansserif", 3, 14)); // NOI18N
        lblLName.setForeground(new java.awt.Color(255, 51, 51));
        lblLName.setText("Please enter a last name");

        lblCardNum.setFont(new java.awt.Font("sansserif", 3, 14)); // NOI18N
        lblCardNum.setForeground(new java.awt.Color(255, 51, 51));
        lblCardNum.setText("Please enter a credit card #");

        lblMonth.setFont(new java.awt.Font("sansserif", 1, 20)); // NOI18N
        lblMonth.setForeground(new java.awt.Color(255, 51, 51));
        lblMonth.setText("X");

        lblYear.setFont(new java.awt.Font("sansserif", 1, 20)); // NOI18N
        lblYear.setForeground(new java.awt.Color(255, 51, 51));
        lblYear.setText("X");

        lblCvc.setFont(new java.awt.Font("sansserif", 1, 20)); // NOI18N
        lblCvc.setForeground(new java.awt.Color(255, 51, 51));
        lblCvc.setText("X");

        lblCardType.setFont(new java.awt.Font("sansserif", 3, 14)); // NOI18N
        lblCardType.setForeground(new java.awt.Color(255, 51, 51));
        lblCardType.setText("Please make a selection");

        mniInfo.setText("File");

        jMenuItem2.setText("Info");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        mniInfo.add(jMenuItem2);

        jMenuBar1.add(mniInfo);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblCreditLogos))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel7)
                                    .addComponent(lblFName)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtFName, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtCardNum, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE))
                                    .addComponent(lblCardNum))
                                .addGap(18, 18, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 203, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addComponent(txtLName, javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                            .addComponent(cmbMonth, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                        .addGap(5, 5, 5)
                                                        .addComponent(lblMonth)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(cmbYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(5, 5, 5)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                            .addComponent(jLabel9)
                                                            .addGroup(layout.createSequentialGroup()
                                                                .addComponent(lblYear)
                                                                .addGap(21, 21, 21)
                                                                .addComponent(txtCvc, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(lblCvc))
                                            .addComponent(lblLName))
                                        .addGap(0, 7, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(21, 21, 21)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(radVisa)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(radMC)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(radAmex)
                                        .addGap(18, 18, 18)
                                        .addComponent(radDiscover))
                                    .addComponent(lblCardType)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(118, 118, 118)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(29, 29, 29)
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtTotalDue, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(138, 138, 138)
                                .addComponent(btnAuthorize)
                                .addGap(27, 27, 27)
                                .addComponent(btnClearForm, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblCreditLogos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(31, 31, 31)
                .addComponent(jLabel4)
                .addGap(2, 2, 2)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtTotalDue, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(radVisa)
                    .addComponent(radMC)
                    .addComponent(radAmex)
                    .addComponent(radDiscover))
                .addGap(0, 0, 0)
                .addComponent(lblCardType, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblFName)
                    .addComponent(lblLName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCardNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMonth)
                    .addComponent(txtCvc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblYear)
                    .addComponent(lblCvc))
                .addGap(0, 0, 0)
                .addComponent(lblCardNum, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAuthorize, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClearForm, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtFNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFNameActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
    
    JOptionPane.showMessageDialog(null,"Steven Lantz"
                                                                                + "\nITDEV-140-002"
                                                                                +  "\nFall 2019"
                                                                                + "\nFinal Project: Airline Booking" 
                                                                                +  "\n" + date.toLocaleString() );

    }//GEN-LAST:event_jMenuItem2ActionPerformed
//Clear all fields in the form
    private void btnClearFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearFormActionPerformed
    clearForm();
    }//GEN-LAST:event_btnClearFormActionPerformed

//Authorize button action selected 
    private void btnAuthorizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAuthorizeActionPerformed
    
//Test if fields are empty or meet criteria
        if(txtFName.getText().isEmpty() || txtLName.getText().isEmpty()
                || radVisa.isSelected() == false && radMC.isSelected() == false
                && radAmex.isSelected() == false && radDiscover.isSelected() == false
                || txtCardNum.getText().isEmpty() || cmbMonth.getSelectedIndex() == -1
                || cmbYear.getSelectedIndex() == -1 || txtCvc.getText().isEmpty()
                || isLong(txtCardNum.getText()) == false || isLong(txtCvc.getText()) ==false
                || creditCardTest(txtCardNum.getText()) == false 
                || cvcTest(txtCvc.getText()) == false){
      
            //If any fields are empty or don't meet criteria, show error messages
            if(radVisa.isSelected() == false && radMC.isSelected() == false
                    && radAmex.isSelected() == false && radDiscover.isSelected() == false){
                lblCardType.setVisible(true);
            }
            if(txtFName.getText().isEmpty()){
                lblFName.setVisible(true);
            }
            if(txtLName.getText().isEmpty()){
                lblLName.setVisible(true);
            }
            if(txtCardNum.getText().isEmpty()){
                lblCardNum.setVisible(true);
            }
            if(cmbMonth.getSelectedIndex() == -1){
                lblMonth.setVisible(true);
            }
            if(cmbYear.getSelectedIndex() == -1){
                lblYear.setVisible(true);
            }
            if(txtCvc.getText().isEmpty()){
                lblCvc.setVisible(true);
            }
//If Credit Card # is not integer
            if(isLong(txtCardNum.getText()) == false){
                JOptionPane.showMessageDialog(null, "Please enter a valid cc number");
            }
            
//If Credit Card # is integer
            if (isLong(txtCardNum.getText()) == true) {
                
//Test credit card number is 16 digits
                if (creditCardTest(txtCardNum.getText()) == false) {
                    JOptionPane.showMessageDialog(null, "Please enter 16 digits for credit card number");
                }
            }

//If CVC is not integer
            if (isLong(txtCvc.getText()) == false) {
                JOptionPane.showMessageDialog(null, "Please enter a valid cvc number");
            }
          //If CVC number is integer, test for correct format
            if (isLong(txtCvc.getText()) == true) {
        //Test CVC number is 3 digits
                if (cvcTest(txtCvc.getText()) == false) {
                    JOptionPane.showMessageDialog(null, "Please enter only 3 digits for CVC number");
                }
            }
        
        } //End of testing fields empty or match criteria
        else {
            JOptionPane.showMessageDialog(null, "Thank you for your payment!" + 
                                                                                    "\n\nWe hope you enjoy flying on Cheap-0 Airlines!");
            
           this.dispose();
           new Results().setVisible(true);
     
         
        }
    }//GEN-LAST:event_btnAuthorizeActionPerformed

    private void txtTotalDueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalDueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalDueActionPerformed

//Clear all fields in the form
    public void clearForm() {
        //Reset all fields in form
        buttonGroup1.clearSelection();
        txtFName.setText("");
        txtLName.setText("");
        txtCardNum.setText("");
        cmbMonth.setSelectedIndex(-1);
        cmbYear.setSelectedIndex(-1);
        txtCvc.setText("");
        //Hide error messages
        lblFName.setVisible(false);
        lblLName.setVisible(false);
        lblCardType.setVisible(false);
        lblCardNum.setVisible(false);
        lblMonth.setVisible(false);
        lblYear.setVisible(false);
        lblCvc.setVisible(false);
    }
    
    //Test if userInput is an integer
    //Returns false if not integer
     public boolean isLong(String userInput) {
        try {
           Long.parseLong(userInput);
        } catch (NumberFormatException e) {

            return false;
        
        } catch (NullPointerException e) {
            
            return false;
        }
        return true;
    }
    
     //Test credit card number has correct number of digits
     //Returns true if 16 digit credit card number
     public boolean creditCardTest(String creditCardNum){
         
         Pattern pattern = Pattern.compile("\\d{16}");
         Matcher matcher = pattern.matcher(creditCardNum);
         
         if(matcher.matches()){
             return true;
         }
         else
             return false;
     }
     
     //Test CVC number has correct number of digits
     //Returns true if 3 digit CVC number
     public boolean cvcTest(String cvcNum){
         
         Pattern pattern = Pattern.compile("\\d{3}");
         Matcher matcher = pattern.matcher(cvcNum);
         
         if(matcher.matches()){
             return true;
         }
         else
             return false;
     }
     

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Payment(totalDue).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAuthorize;
    private javax.swing.JButton btnClearForm;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cmbMonth;
    private javax.swing.JComboBox<String> cmbYear;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblCardNum;
    private javax.swing.JLabel lblCardType;
    private javax.swing.JLabel lblCreditLogos;
    private javax.swing.JLabel lblCvc;
    private javax.swing.JLabel lblFName;
    private javax.swing.JLabel lblLName;
    private javax.swing.JLabel lblMonth;
    private javax.swing.JLabel lblYear;
    private javax.swing.JMenu mniInfo;
    private javax.swing.JRadioButton radAmex;
    private javax.swing.JRadioButton radDiscover;
    private javax.swing.JRadioButton radMC;
    private javax.swing.JRadioButton radVisa;
    private javax.swing.JTextField txtCardNum;
    private javax.swing.JTextField txtCvc;
    private javax.swing.JTextField txtFName;
    private javax.swing.JTextField txtLName;
    private javax.swing.JTextField txtTotalDue;
    // End of variables declaration//GEN-END:variables
}