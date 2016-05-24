package Forms;



public class ParentForm extends javax.swing.JFrame {

   

    public ParentForm() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        formsMenu = new javax.swing.JMenu();
        mnuRoomMaster = new javax.swing.JMenuItem();
        mnuCheckIn = new javax.swing.JMenuItem();
        mnuCheckOut = new javax.swing.JMenuItem();
        mnuExit = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        mnuOccupuedRoomDetail = new javax.swing.JMenuItem();
        mnuCheckInCheckOutStatus = new javax.swing.JMenuItem();
        mnuRoomsDetail = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Forms/parentn2.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 450));

        formsMenu.setText("Forms");
        formsMenu.setFont(new java.awt.Font("MS Shell Dlg", 1, 12)); // NOI18N

        mnuRoomMaster.setText("Room Master Form");
        mnuRoomMaster.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuRoomMasterActionPerformed(evt);
            }
        });
        formsMenu.add(mnuRoomMaster);

        mnuCheckIn.setText("Check In");
        mnuCheckIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuCheckInActionPerformed(evt);
            }
        });
        formsMenu.add(mnuCheckIn);

        mnuCheckOut.setText("Check Out");
        mnuCheckOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuCheckOutActionPerformed(evt);
            }
        });
        formsMenu.add(mnuCheckOut);

        mnuExit.setText("Exit");
        mnuExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuExitActionPerformed(evt);
            }
        });
        formsMenu.add(mnuExit);

        menuBar.add(formsMenu);

        jMenu1.setText("Reports");
        jMenu1.setFont(new java.awt.Font("MS Shell Dlg", 1, 11)); // NOI18N
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        mnuOccupuedRoomDetail.setText("All Occupied Rooms");
        mnuOccupuedRoomDetail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuOccupuedRoomDetailActionPerformed(evt);
            }
        });
        jMenu1.add(mnuOccupuedRoomDetail);

        mnuCheckInCheckOutStatus.setText("Check In/Check Out Status");
        mnuCheckInCheckOutStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuCheckInCheckOutStatusActionPerformed(evt);
            }
        });
        jMenu1.add(mnuCheckInCheckOutStatus);

        mnuRoomsDetail.setText("Room Details");
        mnuRoomsDetail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuRoomsDetailActionPerformed(evt);
            }
        });
        jMenu1.add(mnuRoomsDetail);

        menuBar.add(jMenu1);

        setJMenuBar(menuBar);

        setSize(new java.awt.Dimension(710, 496));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void mnuExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_mnuExitActionPerformed

    private void mnuRoomMasterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuRoomMasterActionPerformed
        RoomMasterForm frmRoomMaster = new RoomMasterForm();
        frmRoomMaster.setVisible(true);
    }//GEN-LAST:event_mnuRoomMasterActionPerformed

    private void mnuCheckInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuCheckInActionPerformed
        CheckInForm frmCheckIn = new CheckInForm();
        frmCheckIn.setVisible(true);
    }//GEN-LAST:event_mnuCheckInActionPerformed

    private void mnuOccupuedRoomDetailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuOccupuedRoomDetailActionPerformed

        AllOccupiedRoomsReportForm frmOccupiedReport = new AllOccupiedRoomsReportForm();
        frmOccupiedReport.setVisible(true);
        
    }//GEN-LAST:event_mnuOccupuedRoomDetailActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
       
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void mnuCheckInCheckOutStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuCheckInCheckOutStatusActionPerformed

     ChechInCheckOutStatusReport frmChInChOutReport = new ChechInCheckOutStatusReport();
     frmChInChOutReport.setVisible(true);
        
    }//GEN-LAST:event_mnuCheckInCheckOutStatusActionPerformed

    private void mnuCheckOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuCheckOutActionPerformed
        CheckOutForm frmCheckOut = new CheckOutForm();
        frmCheckOut.setVisible(true);
    }//GEN-LAST:event_mnuCheckOutActionPerformed

    private void mnuRoomsDetailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuRoomsDetailActionPerformed

        RoomsDetailReport frmRoomDetail = new RoomsDetailReport();
        frmRoomDetail.setVisible(true);

    }//GEN-LAST:event_mnuRoomsDetailActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new ParentForm().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu formsMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem mnuCheckIn;
    private javax.swing.JMenuItem mnuCheckInCheckOutStatus;
    private javax.swing.JMenuItem mnuCheckOut;
    private javax.swing.JMenuItem mnuExit;
    private javax.swing.JMenuItem mnuOccupuedRoomDetail;
    private javax.swing.JMenuItem mnuRoomMaster;
    private javax.swing.JMenuItem mnuRoomsDetail;
    // End of variables declaration//GEN-END:variables
}
