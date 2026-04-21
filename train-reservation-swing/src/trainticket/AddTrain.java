package trainticket;

import java.io.IOException;
import javax.swing.JOptionPane; // Add this import

public class AddTrain extends javax.swing.JFrame {
    
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(AddTrain.class.getName());

    public AddTrain() throws IOException {
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        addTrains = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        trainIdTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        firstClassTextField = new javax.swing.JTextField();
        secondClassTextField = new javax.swing.JTextField();
        thirdClassTextField = new javax.swing.JTextField();
        addTrainButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setBackground(new java.awt.Color(51, 153, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Add Trains");
        jLabel1.setOpaque(true);

        addTrains.setIcon(new javax.swing.ImageIcon(getClass().getResource("/train.jpeg"))); // NOI18N
        addTrains.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addTrainsActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Train ID");

        trainIdTextField.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Train Seats");

        jLabel4.setText("First Class");

        jLabel5.setText("Second Class");

        jLabel6.setText("Third Class");

        addTrainButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        addTrainButton.setText("Add Train");
        addTrainButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addTrainButtonActionPerformed(evt);
            }
        });

        backButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        backButton.setText("Save And Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(addTrains)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(trainIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addGap(18, 18, 18)
                                    .addComponent(thirdClassTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel4))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(firstClassTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                                        .addComponent(secondClassTextField)))))
                        .addGap(0, 33, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(addTrainButton, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(addTrains)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(trainIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(firstClassTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(secondClassTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(thirdClassTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addTrainButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14))))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        try {
            TrainData.saveDataToFile();
        } catch (IOException ex) {
            System.getLogger(AddTrain.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
        try {
            new Home().setVisible(true);
        } catch (IOException ex) {
            System.getLogger(AddTrain.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
        
        this.dispose();
    }//GEN-LAST:event_backButtonActionPerformed

    private void addTrainButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addTrainButtonActionPerformed
        String trainId = trainIdTextField.getText().trim();
    String firstClassStr = firstClassTextField.getText().trim();
    String secondClassStr = secondClassTextField.getText().trim();
    String thirdClassStr = thirdClassTextField.getText().trim();

    // 1. Validate that no fields are empty
    if (trainId.isEmpty() || firstClassStr.isEmpty() || secondClassStr.isEmpty() || thirdClassStr.isEmpty()) {
        JOptionPane.showMessageDialog(this, "All fields must be filled out.", "Input Error", JOptionPane.ERROR_MESSAGE);
        return; // Stop if validation fails
    }

    // 2. *** NEW: Check if Train ID already exists ***
    if (TrainData.findTrainIndexById(trainId) != -1) {
        JOptionPane.showMessageDialog(this, "Train ID '" + trainId + "' already exists. Please use a unique ID.", "Input Error", JOptionPane.ERROR_MESSAGE);
        return; // Stop if duplicate found
    }

    try {
        // 3. Convert text to numbers
        int firstClass = Integer.parseInt(firstClassStr);
        int secondClass = Integer.parseInt(secondClassStr);
        int thirdClass = Integer.parseInt(thirdClassStr);

        // 4. Check if the array is full before adding
        if (TrainData.top >= TrainData.trainArray.length) {
            JOptionPane.showMessageDialog(this, "Cannot add more trains. The system is full.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // 5. Create a new train object and add it to the STATIC array
        trains newTrain = new trains(trainId, firstClass, secondClass, thirdClass);
        TrainData.trainArray[TrainData.top] = newTrain;

        // 6. IMPORTANT: Increment the STATIC counter
        TrainData.top++;

        // 7. Give feedback to the user and clear the fields
        JOptionPane.showMessageDialog(this, "Train '" + trainId + "' added successfully!");
        trainIdTextField.setText("");
        firstClassTextField.setText("");
        secondClassTextField.setText("");
        thirdClassTextField.setText("");

    } catch (NumberFormatException e) {
        // This catch block handles cases where the user types non-numeric text for seats
        JOptionPane.showMessageDialog(this, "Seat capacities must be valid numbers.", "Input Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_addTrainButtonActionPerformed

    private void addTrainsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addTrainsActionPerformed
        try {
            new availableTrains().setVisible(true);
        } catch (IOException ex) {
            System.getLogger(AddTrain.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
    }//GEN-LAST:event_addTrainsActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addTrainButton;
    private javax.swing.JButton addTrains;
    private javax.swing.JButton backButton;
    private javax.swing.JTextField firstClassTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField secondClassTextField;
    private javax.swing.JTextField thirdClassTextField;
    private javax.swing.JTextField trainIdTextField;
    // End of variables declaration//GEN-END:variables
}