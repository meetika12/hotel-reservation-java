package Forms;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class AllOccupiedRoomsReportForm extends javax.swing.JFrame {

    public AllOccupiedRoomsReportForm() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnLoadReport = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAllOccupiedRooms = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        btnLoadReport.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnLoadReport.setText("Load Report");
        btnLoadReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoadReportActionPerformed(evt);
            }
        });

        tblAllOccupiedRooms.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Customer ID", "Room No", "Name", "Address", "Phone", "Check In Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblAllOccupiedRooms);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 934, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(btnLoadReport, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 899, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 611, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnLoadReport, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 448, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(85, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoadReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoadReportActionPerformed

     
        DefaultTableModel model = (DefaultTableModel) tblAllOccupiedRooms.getModel();
        int rows = model.getRowCount();
        if (rows > 0) {
            for (int i = 0; i < rows; i++) {
                model.removeRow(0);
            }
        }

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel", "root", "meetika");
            Statement stmt = con.createStatement();
            String query = "SELECT * FROM checkin";
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                String custID = rs.getString("customerid");
                String roomNo = rs.getString("roomno");
                String custName = rs.getString("customername");
                String address = rs.getString("address");
                String phone = rs.getString("phone");
                String checkInDate = rs.getString("checkindate");
                model.addRow(new Object[]{custID,roomNo,custName,address,phone,checkInDate});
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.toString());
        }
}//GEN-LAST:event_btnLoadReportActionPerformed

    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AllOccupiedRoomsReportForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLoadReport;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblAllOccupiedRooms;
    // End of variables declaration//GEN-END:variables

}
