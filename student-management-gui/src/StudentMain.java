


public class StudentMain extends javax.swing.JFrame {
    
    
   private Student [] studentArray = new Student[0];
   
   public  void addElementToObjectArray(Student element){
     Student [] temp = new Student[this.studentArray.length+1]; 
     for (int i=0;i<this.studentArray.length;i++){
         temp[i]= this.studentArray[i];
     }
     temp [this.studentArray.length]=element;
     this.studentArray = temp;
   };
   
   
   public Student serchStudentMethodInMain (String id){
       boolean found =false;
       for (Student s:studentArray){
          if ( s.getId().equals(id)  ){
              found =true;
              return s;
          }
       }
       Student temp = new Student("defalt","defalt",-1,-1);
       return temp ;
   }
   
   
      public int serchStudentMethodInMainReturnIndex (String id){
       boolean found =false;
       for (int i=0;i<studentArray.length;i++){
          if ( studentArray[i].getId().equals(id)  ){
              found =true;
              return i;
          }
       }
       Student temp = new Student("defalt","defalt",-1,-1);
       return -1 ;
   }
   
      public void updateStudentArray (int i,String name, int prd, int dbms){
          studentArray[i].setName(name);
          studentArray[i].setPrf(prd);
          studentArray[i].setDbms(dbms);
          
      }
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(StudentMain.class.getName());
    public StudentMain() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AddNewStudentButten = new javax.swing.JButton();
        SearchStudentButten = new javax.swing.JButton();
        updateStudent = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        AddNewStudentButten.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        AddNewStudentButten.setText("Add New Student");
        AddNewStudentButten.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddNewStudentButtenActionPerformed(evt);
            }
        });

        SearchStudentButten.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        SearchStudentButten.setText("Search Student");
        SearchStudentButten.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchStudentButtenActionPerformed(evt);
            }
        });

        updateStudent.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        updateStudent.setText("Update Student");
        updateStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateStudentActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(SearchStudentButten, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(AddNewStudentButten, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateStudent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(77, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(AddNewStudentButten)
                .addGap(39, 39, 39)
                .addComponent(SearchStudentButten, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(updateStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(88, 88, 88))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AddNewStudentButtenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddNewStudentButtenActionPerformed
        new AddStudent(this).setVisible(true);
    }//GEN-LAST:event_AddNewStudentButtenActionPerformed

    private void SearchStudentButtenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchStudentButtenActionPerformed
        new SearchStucent(this).setVisible(true);
    }//GEN-LAST:event_SearchStudentButtenActionPerformed

    private void updateStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateStudentActionPerformed
        new UpdateStudent(this).setVisible(true);
    }//GEN-LAST:event_updateStudentActionPerformed

    public static void main(String args[]) {
 
        java.awt.EventQueue.invokeLater(() -> new StudentMain().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddNewStudentButten;
    private javax.swing.JButton SearchStudentButten;
    private javax.swing.JButton updateStudent;
    // End of variables declaration//GEN-END:variables
}
