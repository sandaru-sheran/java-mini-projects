package trainticket;

import java.io.IOException;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class bookSeats extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(bookSeats.class.getName());
    private static final java.util.List<trains> TRAIN_DATA = new java.util.ArrayList<>();
    
    static {
        TRAIN_DATA.add(new trains("T001", 50, 100, 200));
        TRAIN_DATA.add(new trains("T002", 10, 20, 30));
    }

public bookSeats() {
    initComponents();
    trainIdTextField.addActionListener(e -> updateAllSeatLabels());


    updateAllSeatLabels();
 
}


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        image = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        trainIdTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();
        classComboBox = new javax.swing.JComboBox<>();
        bookSeatButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        secendseatleftLable = new javax.swing.JLabel();
        thirdseatsleftLable = new javax.swing.JLabel();
        firstseatLable = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setBackground(new java.awt.Color(51, 153, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Book Seats");
        jLabel1.setOpaque(true);

        image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ticket.jpg"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Train ID");

        trainIdTextField.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Train Seats");

        backButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        backButton.setText("Save And Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        classComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "First Class  Rs 5000", "Second Class Rs3000", "Third Class Rs 1000" }));
        classComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                classComboBoxActionPerformed(evt);
            }
        });

        bookSeatButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bookSeatButton.setText("Book Seat");
        bookSeatButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookSeatButtonActionPerformed(evt);
            }
        });

        jLabel4.setText("First Class Seat Left");

        jLabel5.setText("Second Class Seat Left");

        jLabel6.setText("Third Class Seat Left");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(image)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(thirdseatsleftLable, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                            .addComponent(secendseatleftLable, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(classComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(trainIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(firstseatLable, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bookSeatButton, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(8, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(image)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(trainIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(classComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(firstseatLable))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(secendseatleftLable))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(thirdseatsleftLable))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bookSeatButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        try {
            TrainData.saveDataToFile();
        } catch (IOException ex) {
            System.getLogger(bookSeats.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
        try {
            Home home = new Home();
            home.setVisible(true);
            this.dispose();
        } catch (IOException ex) {
            System.getLogger(bookSeats.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
    }//GEN-LAST:event_backButtonActionPerformed

    private void bookSeatButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookSeatButtonActionPerformed
       // 1. Get user input
    String trainId = trainIdTextField.getText().trim();
    String selectedClassString = (String) classComboBox.getSelectedItem();

    // 2. Validate that a Train ID has been entered
    if (trainId.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please enter a Train ID first.", "Input Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // 3. Find the index of the train using your helper method
    int trainIndex = TrainData.findTrainIndexById(trainId);

    // 4. Check if the train was found
    if (trainIndex != -1) {
        // If found, get the train object from the central array
        trains trainToEdit = TrainData.trainArray[trainIndex];

        // 5. Determine which class to book from the combo box
        String className = selectedClassString.split(" ")[0]; // Gets "First", "Second", or "Third"
        boolean booked = false;

        // 6. Check for available seats and deduct from the correct class
        switch (className) {
            case "First":
                if (trainToEdit.firstClass > 0) {
                    trainToEdit.firstClass--; // Deduct one seat
                    booked = true;
                }
                break;
            case "Second":
                if (trainToEdit.secondClass > 0) {
                    trainToEdit.secondClass--; // Deduct one seat
                    booked = true;
                }
                break;
            case "Third":
                if (trainToEdit.thirdClass > 0) {
                    trainToEdit.thirdClass--; // Deduct one seat
                    booked = true;
                }
                break;
        }

        // 7. Provide feedback to the user and update the UI
        if (booked) {
            JOptionPane.showMessageDialog(this, "Booking Confirmed!", "Seat Booked", JOptionPane.INFORMATION_MESSAGE);
            updateAllSeatLabels(); // Refresh the labels to show the new count
        } else {
            JOptionPane.showMessageDialog(this, "Sorry, no seats are left in " + className + " Class.", "Booking Failed", JOptionPane.WARNING_MESSAGE);
        }

    } else {
        // If the train index was -1, the train was not found
        JOptionPane.showMessageDialog(this, "Train ID '" + trainId + "' not found.", "Error", JOptionPane.ERROR_MESSAGE);
    }


       

    }//GEN-LAST:event_bookSeatButtonActionPerformed


    
    private void updateAllSeatLabels() {
        String trainId = trainIdTextField.getText();
        int trainIndex = TrainData.findTrainIndexById(trainId);
        if (trainIndex != -1) {
        trains train = TrainData.trainArray[trainIndex];
        firstseatLable.setText(String.valueOf(train.firstClass));
        secendseatleftLable.setText(String.valueOf(train.secondClass));
        thirdseatsleftLable.setText(String.valueOf(train.thirdClass));
    } else {
        // If the train was not found, clear the labels.
        firstseatLable.setText("-");
        secendseatleftLable.setText("-");
        thirdseatsleftLable.setText("-");
    }
        
    }

    private void classComboBoxActionPerformed(java.awt.event.ActionEvent evt) {
    updateAllSeatLabels();
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JButton bookSeatButton;
    private javax.swing.JComboBox<String> classComboBox;
    private javax.swing.JLabel firstseatLable;
    private javax.swing.JButton image;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel secendseatleftLable;
    private javax.swing.JLabel thirdseatsleftLable;
    private javax.swing.JTextField trainIdTextField;
    // End of variables declaration//GEN-END:variables
}