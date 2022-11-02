/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nea;


        
public class ClassDetailsPage extends javax.swing.JFrame {

    /**
     * Creates new form ClassDetailsPage
     */
    public ClassDetailsPage() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Classdetailspage = new javax.swing.JPanel();
        DateLB = new javax.swing.JLabel();
        DateEmptyLB = new javax.swing.JLabel();
        TeacherEmptyLB = new javax.swing.JLabel();
        PeriodLB = new javax.swing.JLabel();
        EnterDetails = new javax.swing.JLabel();
        YrGrpLB = new javax.swing.JLabel();
        LevelLB = new javax.swing.JLabel();
        TeacherField = new javax.swing.JTextField();
        SubLB = new javax.swing.JLabel();
        GrpCombo = new javax.swing.JComboBox<>();
        LvlCombo = new javax.swing.JComboBox<>();
        YrGrpCombo = new javax.swing.JComboBox<>();
        DateField = new javax.swing.JTextField();
        SubCombo = new javax.swing.JComboBox<>();
        DayLB = new javax.swing.JLabel();
        DayCombo = new javax.swing.JComboBox<>();
        PeriodCombo = new javax.swing.JComboBox<>();
        TeacherLB = new javax.swing.JLabel();
        ContinueButtonCD = new javax.swing.JButton();
        GrpLB = new javax.swing.JLabel();
        SetLB = new javax.swing.JLabel();
        SetCombo = new javax.swing.JComboBox<>();
        LBScrollPane = new javax.swing.JScrollPane();
        LearningBehaviourPage = new javax.swing.JPanel();
        TitleLB = new javax.swing.JLabel();
        StudentListeningY = new javax.swing.JRadioButton();
        StudentPostureLB = new javax.swing.JLabel();
        StudentListeningN = new javax.swing.JRadioButton();
        YesLB = new javax.swing.JLabel();
        NoLB = new javax.swing.JLabel();
        StudentRespectY = new javax.swing.JRadioButton();
        StudentRespectN = new javax.swing.JRadioButton();
        StudentSilenceLB = new javax.swing.JLabel();
        StudentCoatHatOffY = new javax.swing.JRadioButton();
        StudentEngagedLB = new javax.swing.JLabel();
        StudentCoatHatOffN = new javax.swing.JRadioButton();
        StudentFocusLB = new javax.swing.JLabel();
        NoPhoneY = new javax.swing.JRadioButton();
        StudentListeningLB = new javax.swing.JLabel();
        NoPhoneN = new javax.swing.JRadioButton();
        StudentRespectLB = new javax.swing.JLabel();
        StudentCoatHatOffLB = new javax.swing.JLabel();
        NoPhoneLB = new javax.swing.JLabel();
        LBCommentField = new javax.swing.JTextField();
        LBCommentsLB = new javax.swing.JLabel();
        ContinueButtonLB = new javax.swing.JButton();
        StudentPostureY = new javax.swing.JRadioButton();
        StudentPostureN = new javax.swing.JRadioButton();
        StudentSilenceY = new javax.swing.JRadioButton();
        StudentSilenceN = new javax.swing.JRadioButton();
        StudentEngagedY = new javax.swing.JRadioButton();
        StudentEngagedN = new javax.swing.JRadioButton();
        StudentFocusY = new javax.swing.JRadioButton();
        StudentFocusN = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("William Perkin Monitoring System");
        setLocation(new java.awt.Point(550, 100));
        setPreferredSize(new java.awt.Dimension(866, 1000));
        setResizable(false);
        getContentPane().setLayout(new java.awt.CardLayout());

        Classdetailspage.setName(""); // NOI18N
        Classdetailspage.setPreferredSize(new java.awt.Dimension(864, 844));
        Classdetailspage.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        DateLB.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        DateLB.setText("Date");
        Classdetailspage.add(DateLB, new org.netbeans.lib.awtextra.AbsoluteConstraints(294, 359, -1, -1));

        DateEmptyLB.setForeground(new java.awt.Color(255, 0, 0));
        DateEmptyLB.setText("Field is Empty");
        Classdetailspage.add(DateEmptyLB, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 367, -1, -1));

        TeacherEmptyLB.setForeground(new java.awt.Color(255, 0, 0));
        TeacherEmptyLB.setText("Field is Empty");
        Classdetailspage.add(TeacherEmptyLB, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 500, -1, -1));

        PeriodLB.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        PeriodLB.setText("Period");
        Classdetailspage.add(PeriodLB, new org.netbeans.lib.awtextra.AbsoluteConstraints(294, 448, -1, -1));

        EnterDetails.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        EnterDetails.setText("Enter the Details of the Class");
        Classdetailspage.add(EnterDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(229, 25, -1, -1));

        YrGrpLB.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        YrGrpLB.setText("Year Group");
        Classdetailspage.add(YrGrpLB, new org.netbeans.lib.awtextra.AbsoluteConstraints(294, 183, -1, -1));

        LevelLB.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        LevelLB.setText("Level");
        Classdetailspage.add(LevelLB, new org.netbeans.lib.awtextra.AbsoluteConstraints(294, 271, -1, -1));

        TeacherField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TeacherFieldActionPerformed(evt);
            }
        });
        TeacherField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TeacherFieldKeyReleased(evt);
            }
        });
        Classdetailspage.add(TeacherField, new org.netbeans.lib.awtextra.AbsoluteConstraints(448, 495, 158, 25));

        SubLB.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        SubLB.setText("Subject");
        Classdetailspage.add(SubLB, new org.netbeans.lib.awtextra.AbsoluteConstraints(294, 315, -1, -1));

        GrpCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Trainee", "Newly Qualified" }));
        Classdetailspage.add(GrpCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(448, 543, 158, -1));

        LvlCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nurture", "Core", "Higher", "Advanced" }));
        Classdetailspage.add(LvlCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(448, 275, 158, 22));

        YrGrpCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "7", "8", "9", "10", "11", "12", "13" }));
        Classdetailspage.add(YrGrpCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(448, 187, 158, 22));

        DateField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DateFieldActionPerformed(evt);
            }
        });
        DateField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                DateFieldKeyReleased(evt);
            }
        });
        Classdetailspage.add(DateField, new org.netbeans.lib.awtextra.AbsoluteConstraints(448, 362, 158, 24));

        SubCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "English", "English Elective", "Maths", "Science", "French", "German", "Spanish", "Latin", "History", "Geography", "R.E.", "Ethics", "P.E.", "Computer Science (KS4)", "ICT (KS4)", "Computing (KS3)", "Art", "Music", "Drama", "Food Technology", "Study", "Life Skills" }));
        Classdetailspage.add(SubCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(448, 319, 158, 22));

        DayLB.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        DayLB.setText("Day");
        Classdetailspage.add(DayLB, new org.netbeans.lib.awtextra.AbsoluteConstraints(294, 404, -1, -1));

        DayCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" }));
        Classdetailspage.add(DayCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(448, 408, 158, 22));

        PeriodCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7" }));
        Classdetailspage.add(PeriodCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(448, 452, 158, 22));

        TeacherLB.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        TeacherLB.setText("Duty Teacher");
        Classdetailspage.add(TeacherLB, new org.netbeans.lib.awtextra.AbsoluteConstraints(294, 492, -1, -1));

        ContinueButtonCD.setText("Continue");
        ContinueButtonCD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ContinueButtonCDActionPerformed(evt);
            }
        });
        Classdetailspage.add(ContinueButtonCD, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 770, 245, 104));

        GrpLB.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        GrpLB.setText("Teacher Group");
        Classdetailspage.add(GrpLB, new org.netbeans.lib.awtextra.AbsoluteConstraints(297, 538, -1, -1));

        SetLB.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        SetLB.setText("Set");
        Classdetailspage.add(SetLB, new org.netbeans.lib.awtextra.AbsoluteConstraints(294, 227, 88, -1));

        SetCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8" }));
        Classdetailspage.add(SetCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(448, 231, 158, 22));

        getContentPane().add(Classdetailspage, "card2");

        LBScrollPane.setHorizontalScrollBar(null);
        LBScrollPane.setPreferredSize(new java.awt.Dimension(866, 844));

        LearningBehaviourPage.setPreferredSize(new java.awt.Dimension(866, 844));

        TitleLB.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        TitleLB.setText("Fill in the Data for Learning Behaviour");

        StudentPostureLB.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        StudentPostureLB.setText("Student's Posture shows that they are alert and ready to learn");

        StudentListeningN.setSelected(true);

        YesLB.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        YesLB.setText("Yes");

        NoLB.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        NoLB.setText("No");

        StudentRespectN.setSelected(true);

        StudentSilenceLB.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        StudentSilenceLB.setText("Students remain silent unless invited to speak");

        StudentEngagedLB.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        StudentEngagedLB.setText("Students appear engaged");

        StudentCoatHatOffN.setSelected(true);

        StudentFocusLB.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        StudentFocusLB.setText("Students remain on task during independent work");

        StudentListeningLB.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        StudentListeningLB.setText("Students display good listening behaviour");

        NoPhoneN.setSelected(true);

        StudentRespectLB.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        StudentRespectLB.setText("Students act respectfully towards the teacher and each other");

        StudentCoatHatOffLB.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        StudentCoatHatOffLB.setText("Coats and Hats have been taken off");

        NoPhoneLB.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        NoPhoneLB.setText("No phones out (unless directed by the teacher)");

        LBCommentsLB.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        LBCommentsLB.setText("Additional Comments");

        ContinueButtonLB.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        ContinueButtonLB.setText("Continue");
        ContinueButtonLB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ContinueButtonLBActionPerformed(evt);
            }
        });

        StudentPostureN.setSelected(true);

        StudentSilenceN.setSelected(true);

        StudentEngagedN.setSelected(true);

        StudentFocusN.setSelected(true);

        javax.swing.GroupLayout LearningBehaviourPageLayout = new javax.swing.GroupLayout(LearningBehaviourPage);
        LearningBehaviourPage.setLayout(LearningBehaviourPageLayout);
        LearningBehaviourPageLayout.setHorizontalGroup(
            LearningBehaviourPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LearningBehaviourPageLayout.createSequentialGroup()
                .addContainerGap(78, Short.MAX_VALUE)
                .addGroup(LearningBehaviourPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LearningBehaviourPageLayout.createSequentialGroup()
                        .addComponent(LBCommentsLB)
                        .addGap(51, 51, 51)
                        .addComponent(LBCommentField, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LearningBehaviourPageLayout.createSequentialGroup()
                        .addGroup(LearningBehaviourPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(LearningBehaviourPageLayout.createSequentialGroup()
                                .addGroup(LearningBehaviourPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(StudentCoatHatOffLB, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(NoPhoneLB, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(StudentRespectLB, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(StudentListeningLB, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(StudentFocusLB, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(StudentEngagedLB, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(StudentSilenceLB, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(StudentPostureLB, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(87, 87, 87)
                                .addGroup(LearningBehaviourPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(StudentCoatHatOffY)
                                    .addComponent(NoPhoneY)
                                    .addComponent(StudentRespectY)
                                    .addComponent(StudentListeningY)
                                    .addComponent(StudentFocusY)
                                    .addComponent(StudentEngagedY)
                                    .addComponent(StudentSilenceY)
                                    .addComponent(StudentPostureY)
                                    .addComponent(YesLB))
                                .addGap(53, 53, 53)
                                .addGroup(LearningBehaviourPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(LearningBehaviourPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(NoPhoneN)
                                        .addComponent(StudentFocusN)
                                        .addComponent(StudentEngagedN)
                                        .addComponent(StudentSilenceN)
                                        .addComponent(StudentPostureN))
                                    .addComponent(NoLB)))
                            .addComponent(StudentRespectN)
                            .addComponent(StudentCoatHatOffN)
                            .addComponent(StudentListeningN))
                        .addGap(109, 109, 109))))
            .addGroup(LearningBehaviourPageLayout.createSequentialGroup()
                .addGroup(LearningBehaviourPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LearningBehaviourPageLayout.createSequentialGroup()
                        .addGap(273, 273, 273)
                        .addComponent(ContinueButtonLB, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(LearningBehaviourPageLayout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addComponent(TitleLB)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        LearningBehaviourPageLayout.setVerticalGroup(
            LearningBehaviourPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LearningBehaviourPageLayout.createSequentialGroup()
                .addGroup(LearningBehaviourPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LearningBehaviourPageLayout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(TitleLB)
                        .addGap(54, 54, 54)
                        .addComponent(YesLB))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LearningBehaviourPageLayout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addComponent(NoLB)))
                .addGap(18, 18, 18)
                .addGroup(LearningBehaviourPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(StudentPostureN)
                    .addComponent(StudentPostureY)
                    .addComponent(StudentPostureLB))
                .addGap(18, 18, 18)
                .addGroup(LearningBehaviourPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LearningBehaviourPageLayout.createSequentialGroup()
                        .addGroup(LearningBehaviourPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(StudentSilenceN)
                            .addComponent(StudentSilenceY))
                        .addGap(18, 18, 18)
                        .addGroup(LearningBehaviourPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(LearningBehaviourPageLayout.createSequentialGroup()
                                .addComponent(StudentEngagedN)
                                .addGap(24, 24, 24)
                                .addComponent(StudentFocusN)
                                .addGap(18, 18, 18)
                                .addComponent(StudentListeningN)
                                .addGap(18, 18, 18)
                                .addComponent(StudentRespectN)
                                .addGap(18, 18, 18)
                                .addComponent(StudentCoatHatOffN)
                                .addGap(18, 18, 18)
                                .addComponent(NoPhoneN))
                            .addGroup(LearningBehaviourPageLayout.createSequentialGroup()
                                .addComponent(StudentEngagedY)
                                .addGap(24, 24, 24)
                                .addComponent(StudentFocusY)
                                .addGap(18, 18, 18)
                                .addComponent(StudentListeningY)
                                .addGap(18, 18, 18)
                                .addComponent(StudentRespectY)
                                .addGap(18, 18, 18)
                                .addComponent(StudentCoatHatOffY)
                                .addGap(18, 18, 18)
                                .addComponent(NoPhoneY))
                            .addGroup(LearningBehaviourPageLayout.createSequentialGroup()
                                .addComponent(StudentEngagedLB)
                                .addGap(18, 18, 18)
                                .addComponent(StudentFocusLB)
                                .addGap(18, 18, 18)
                                .addComponent(StudentListeningLB)
                                .addGap(18, 18, 18)
                                .addComponent(StudentRespectLB)
                                .addGap(18, 18, 18)
                                .addComponent(StudentCoatHatOffLB)
                                .addGap(18, 18, 18)
                                .addComponent(NoPhoneLB)))
                        .addGap(69, 69, 69)
                        .addGroup(LearningBehaviourPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LBCommentField, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LBCommentsLB))
                        .addGap(40, 40, 40)
                        .addComponent(ContinueButtonLB, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(StudentSilenceLB))
                .addContainerGap(90, Short.MAX_VALUE))
        );

        LBScrollPane.setViewportView(LearningBehaviourPage);

        getContentPane().add(LBScrollPane, "card4");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DateFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DateFieldActionPerformed
        
    }//GEN-LAST:event_DateFieldActionPerformed

    private void TeacherFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TeacherFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TeacherFieldActionPerformed

    
    private void ContinueButtonCDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ContinueButtonCDActionPerformed
        if (DateField.getText().isEmpty() && TeacherField.getText().isEmpty()) {
            DateEmptyLB.setText("Field is Empty");
            TeacherEmptyLB.setText("Field is Empty");
        } 
        else if (DateField.getText().isEmpty()) {
            DateEmptyLB.setText("Field is Empty");
        }
        else if (TeacherField.getText().isEmpty()) {
            TeacherEmptyLB.setText("Field is Empty");
        }
        else {
            
            int YrGrp = Integer.parseInt(YrGrpCombo.getSelectedItem().toString());
            int Set = Integer.parseInt(SetCombo.getSelectedItem().toString());
            String Lvl = LvlCombo.getSelectedItem().toString();
            String Sub = SubCombo.getSelectedItem().toString();
            String InputDate = DateField.getText();
            String InputDay = DayCombo.getSelectedItem().toString();
            int Period = Integer.parseInt(PeriodCombo.getSelectedItem().toString());
            String DutyTeacher = TeacherField.getText();
            String TeacherGroup = GrpCombo.getSelectedItem().toString();
            
            LBScrollPane.setVisible(true);
            Classdetailspage.setVisible(false);
        }
        
    }//GEN-LAST:event_ContinueButtonCDActionPerformed

    private void DateFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_DateFieldKeyReleased
        DateEmptyLB.setText("");
    }//GEN-LAST:event_DateFieldKeyReleased

    private void TeacherFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TeacherFieldKeyReleased
        TeacherEmptyLB.setText("");
    }//GEN-LAST:event_TeacherFieldKeyReleased

    private void ContinueButtonLBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ContinueButtonLBActionPerformed

        boolean StudentPosture = StudentPostureY.isSelected();
        boolean StudentSilence = StudentSilenceY.isSelected();
        boolean StudentEngaged = StudentEngagedY.isSelected();
        boolean StudentFocus = StudentFocusY.isSelected();
        boolean StudentListening = StudentListeningY.isSelected();
        boolean StudentRespect = StudentRespectY.isSelected();
        boolean StudentCoatHatOff = StudentCoatHatOffY.isSelected();
        boolean NoPhone = NoPhoneY.isSelected();

        
    }//GEN-LAST:event_ContinueButtonLBActionPerformed

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
            java.util.logging.Logger.getLogger(ClassDetailsPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClassDetailsPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClassDetailsPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClassDetailsPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClassDetailsPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Classdetailspage;
    private javax.swing.JButton ContinueButtonCD;
    private javax.swing.JButton ContinueButtonLB;
    private javax.swing.JLabel DateEmptyLB;
    private javax.swing.JTextField DateField;
    private javax.swing.JLabel DateLB;
    private javax.swing.JComboBox<String> DayCombo;
    private javax.swing.JLabel DayLB;
    private javax.swing.JLabel EnterDetails;
    private javax.swing.JComboBox<String> GrpCombo;
    private javax.swing.JLabel GrpLB;
    private javax.swing.JTextField LBCommentField;
    private javax.swing.JLabel LBCommentsLB;
    private javax.swing.JScrollPane LBScrollPane;
    private javax.swing.JPanel LearningBehaviourPage;
    private javax.swing.JLabel LevelLB;
    private javax.swing.JComboBox<String> LvlCombo;
    private javax.swing.JLabel NoLB;
    private javax.swing.JLabel NoPhoneLB;
    private javax.swing.JRadioButton NoPhoneN;
    private javax.swing.JRadioButton NoPhoneY;
    private javax.swing.JComboBox<String> PeriodCombo;
    private javax.swing.JLabel PeriodLB;
    private javax.swing.JComboBox<String> SetCombo;
    private javax.swing.JLabel SetLB;
    private javax.swing.JLabel StudentCoatHatOffLB;
    private javax.swing.JRadioButton StudentCoatHatOffN;
    private javax.swing.JRadioButton StudentCoatHatOffY;
    private javax.swing.JLabel StudentEngagedLB;
    private javax.swing.JRadioButton StudentEngagedN;
    private javax.swing.JRadioButton StudentEngagedY;
    private javax.swing.JLabel StudentFocusLB;
    private javax.swing.JRadioButton StudentFocusN;
    private javax.swing.JRadioButton StudentFocusY;
    private javax.swing.JLabel StudentListeningLB;
    private javax.swing.JRadioButton StudentListeningN;
    private javax.swing.JRadioButton StudentListeningY;
    private javax.swing.JLabel StudentPostureLB;
    private javax.swing.JRadioButton StudentPostureN;
    private javax.swing.JRadioButton StudentPostureY;
    private javax.swing.JLabel StudentRespectLB;
    private javax.swing.JRadioButton StudentRespectN;
    private javax.swing.JRadioButton StudentRespectY;
    private javax.swing.JLabel StudentSilenceLB;
    private javax.swing.JRadioButton StudentSilenceN;
    private javax.swing.JRadioButton StudentSilenceY;
    private javax.swing.JComboBox<String> SubCombo;
    private javax.swing.JLabel SubLB;
    private javax.swing.JLabel TeacherEmptyLB;
    private javax.swing.JTextField TeacherField;
    private javax.swing.JLabel TeacherLB;
    private javax.swing.JLabel TitleLB;
    private javax.swing.JLabel YesLB;
    private javax.swing.JComboBox<String> YrGrpCombo;
    private javax.swing.JLabel YrGrpLB;
    // End of variables declaration//GEN-END:variables
}

