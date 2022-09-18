//Dumzo-Ajufo divine Adun-fs-19-273 computer science. 
import java.awt.Color;
import java.awt.GridLayout;
import java.text.DecimalFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class gpaCalc extends javax.swing.JFrame {

    public gpaCalc() { //we created, for row labeling
        initComponents();
        defaultFormFields();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        studentInfoPanel = new javax.swing.JPanel();
        nameLabel = new javax.swing.JLabel();
        nameTF = new javax.swing.JTextField();
        departmentLabel = new javax.swing.JLabel();
        departmentTF = new javax.swing.JTextField();
        courseInfoPanel = new javax.swing.JPanel();
        addCourseBTN = new javax.swing.JButton();
        resetBTN = new javax.swing.JButton();
        calculateBTN = new javax.swing.JButton();
        cgpaLabel = new javax.swing.JLabel();
        coursesSP = new javax.swing.JScrollPane();
        coursesBox = new javax.swing.JPanel();
        coursesBox2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CGPA Calculator");

        nameLabel.setText("Name:");

        nameTF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nameTFKeyReleased(evt);
            }
        });

        departmentLabel.setText("Department:");

        departmentTF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                departmentTFKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout studentInfoPanelLayout = new javax.swing.GroupLayout(studentInfoPanel);
        studentInfoPanel.setLayout(studentInfoPanelLayout);
        studentInfoPanelLayout.setHorizontalGroup(
            studentInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(studentInfoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(departmentLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(departmentTF)
                .addContainerGap())
        );
        studentInfoPanelLayout.setVerticalGroup(
            studentInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(studentInfoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(studentInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLabel)
                    .addComponent(nameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(departmentLabel)
                    .addComponent(departmentTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        addCourseBTN.setText("Add Course");
        addCourseBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCourseBTNActionPerformed(evt);
            }
        });

        resetBTN.setText("Reset");
        resetBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetBTNActionPerformed(evt);
            }
        });

        calculateBTN.setText("Calculate");
        calculateBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculateBTNActionPerformed(evt);
            }
        });

        cgpaLabel.setText("CGPA: 0.0");

        coursesSP.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        javax.swing.GroupLayout coursesBox2Layout = new javax.swing.GroupLayout(coursesBox2);
        coursesBox2.setLayout(coursesBox2Layout);
        coursesBox2Layout.setHorizontalGroup(
            coursesBox2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 943, Short.MAX_VALUE)
        );
        coursesBox2Layout.setVerticalGroup(
            coursesBox2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout coursesBoxLayout = new javax.swing.GroupLayout(coursesBox);
        coursesBox.setLayout(coursesBoxLayout);
        coursesBoxLayout.setHorizontalGroup(
            coursesBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(coursesBoxLayout.createSequentialGroup()
                .addComponent(coursesBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 257, Short.MAX_VALUE))
        );
        coursesBoxLayout.setVerticalGroup(
            coursesBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(coursesBoxLayout.createSequentialGroup()
                .addComponent(coursesBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 264, Short.MAX_VALUE))
        );

        coursesSP.setViewportView(coursesBox);

        javax.swing.GroupLayout courseInfoPanelLayout = new javax.swing.GroupLayout(courseInfoPanel);
        courseInfoPanel.setLayout(courseInfoPanelLayout);
        courseInfoPanelLayout.setHorizontalGroup(
            courseInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(courseInfoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(courseInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(coursesSP, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(courseInfoPanelLayout.createSequentialGroup()
                        .addComponent(addCourseBTN)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(resetBTN)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 612, Short.MAX_VALUE)
                        .addComponent(calculateBTN)
                        .addGap(18, 18, 18)
                        .addComponent(cgpaLabel)))
                .addContainerGap())
        );
        courseInfoPanelLayout.setVerticalGroup(
            courseInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(courseInfoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(courseInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addCourseBTN)
                    .addComponent(cgpaLabel)
                    .addComponent(calculateBTN)
                    .addComponent(resetBTN))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(coursesSP, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(studentInfoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(courseInfoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(studentInfoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(courseInfoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void addCourseBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCourseBTNActionPerformed
        // TODO add your handling code here:
        addCourseFields();
       
    }//GEN-LAST:event_addCourseBTNActionPerformed

    private void nameTFKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameTFKeyReleased
        // TODO add your handling code here:
        student.name = nameTF.getText();
    }//GEN-LAST:event_nameTFKeyReleased

    private void departmentTFKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_departmentTFKeyReleased
        // TODO add your handling code here:
        student.department = departmentTF.getText();
    }//GEN-LAST:event_departmentTFKeyReleased

    private void calculateBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculateBTNActionPerformed
        // TODO add your handling code here:
        student.courses = new ArrayList<>();
        for(int i=0;i<courseIndex;i++){
            Course course = courseFieldsRowArr[i].getCourse();
            if(course.valid()){
                student.courses.add(course);
            }else{
                JOptionPane.showMessageDialog(this, "Invalid inputs: fill all info");
                return;
            }
        }
        DecimalFormat df = new DecimalFormat("0.0");
        cgpaLabel.setText("" + df.format(student.calculateCGPA()));
    }//GEN-LAST:event_calculateBTNActionPerformed

    private void resetBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetBTNActionPerformed
        // TODO add your handling code here:
        defaultFormFields();
    }//GEN-LAST:event_resetBTNActionPerformed

    
    public void addCourseFields(){
        coursesBox2.setLayout(new GridLayout(courseIndex + 2,5,20,1));//creating a layout in the course box panel
        courseFieldsRowArr[courseIndex] = new CourseFieldsRow();
        courseFieldsRowArr[courseIndex].addTOPanel(coursesBox2);
        coursesBox2.revalidate();
        courseIndex++;
    }
    
    public void defaultFormFields(){
        courseIndex = 0;
        courseFieldsRowArr = new CourseFieldsRow[100]; 
        student = new Student();
        
        coursesBox2.removeAll();
        coursesBox2.setLayout(new GridLayout(1,5,150,25));
        coursesBox2.add(new javax.swing.JLabel("Year"));
        coursesBox2.add(new javax.swing.JLabel("Sem"));
        coursesBox2.add(new javax.swing.JLabel("Course Title"));
        coursesBox2.add(new javax.swing.JLabel("Unit"));
        coursesBox2.add(new javax.swing.JLabel("Grade"));            
        
        addCourseFields();
        
        coursesBox2.revalidate(); 
    }
    
    public static void main(String args[]) {
           
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new gpaCalc().setVisible(true);
            }
        });
        
        //Dumzo-Ajufo divine Adun-fs-19-273 computer science. 
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addCourseBTN;
    private javax.swing.JButton calculateBTN;
    private javax.swing.JLabel cgpaLabel;
    private javax.swing.JPanel courseInfoPanel;
    private javax.swing.JPanel coursesBox;
    private javax.swing.JPanel coursesBox2;
    private javax.swing.JScrollPane coursesSP;
    private javax.swing.JLabel departmentLabel;
    private javax.swing.JTextField departmentTF;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField nameTF;
    private javax.swing.JButton resetBTN;
    private javax.swing.JPanel studentInfoPanel;
    // End of variables declaration//GEN-END:variables

    private int courseIndex = 0;
    private CourseFieldsRow[] courseFieldsRowArr = new CourseFieldsRow[100]; // array for courses row, and giving a limit of 100;
    private Student student = new Student();
}



class Student {
    String name, department;
    ArrayList<Course> courses = new ArrayList<>(); //array for course list
    double cgpa = 0;
    
    public double calculateCGPA(){
        cgpa = 0; //reset
        int semester = 1;
        ArrayList<Double> sem_gpas = new ArrayList<>();  // reset semester gpas
        
        int count = 20;  //I dont expect more that 20 semester
        while(count>semester){
            int total_unit = 0; //summation of the creditunit of the semester
            double total_weights = 0;
            ArrayList<Double> weights = new ArrayList<>(); // array that keeps track of all the weights  (grade * unit i.e. 4.0 * 3)
            // A weight is defined as a grade (4.0) * credit unit (3)

            for(int i=0;i<courses.size();i++){   //loop through all the cources
                Course course = courses.get(i);
                if(course.semester_no == semester){ // if course semester matches current semester o be calculated
                    total_unit += course.unit;   // add semester credit unit to total_unit
                    total_weights += course.getWeight(); // add weight of course to weights array
                }
            }

            if(total_unit>0){ // because we assume you have 20 semester we dont add gpsa for semesters without courses
                sem_gpas.add(total_weights/total_unit); // stores your gpa for the semester in sem_gpas array
            }

            semester++; // go to next semester
        }
        
        double total_gpas = 0;
        for(int i=0;i<sem_gpas.size();i++){
            total_gpas += sem_gpas.get(i);
        }
        if(sem_gpas.size()>0){
            cgpa = total_gpas / sem_gpas.size();
        }
        return cgpa;
    }
    //Dumzo-Ajufo divine Adun-fs-19-273 computer science. 
}

class Course{//initializers
    public String title;
    public int semester_no = -1, unit = 0;
    double grade = -1;
    
    public boolean valid(){ // checks if you wrote something
        if(title.equalsIgnoreCase("") || semester_no == -1 || unit == 0 || grade == -1){
            return false;
        }
        return true;
    }
    
    public double getWeight(){
        return  grade * unit; 
    }
   
}

class CourseFieldsRow {
    private javax.swing.JTextField yearTF = new javax.swing.JTextField(2);
    private javax.swing.JTextField semTF = new javax.swing.JTextField(2);
    private javax.swing.JTextField titleTF = new javax.swing.JTextField(15);
    private javax.swing.JTextField unitTF = new javax.swing.JTextField(2);
    private javax.swing.JTextField gradeTF = new javax.swing.JTextField(4);
    
    //Dumzo-Ajufo divine Adun-fs-19-273 computer science. 
    
    public void addTOPanel(javax.swing.JPanel panel){ //the order of the text fields
        JPanel yp = new JPanel();
        yp.add(yearTF);
        panel.add(yearTF);
        JPanel sp = new JPanel();
        sp.add(semTF);
        panel.add(semTF);
        JPanel tp = new JPanel();
        tp.add(titleTF);
        panel.add(titleTF);
        JPanel up = new JPanel();
        up.add(unitTF);
        panel.add(unitTF);
        JPanel gp = new JPanel();
        gp.add(gradeTF);
        panel.add(gradeTF);        
    }
    
    public Course getCourse(){
        Course course = new Course();
        course.title = titleTF.getText();
        try{
            course.semester_no = ((Integer.parseInt(yearTF.getText())-1)*2) + Integer.parseInt(semTF.getText()); // seperates the semester(current year -1 *2+semester )
            course.unit = Integer.parseInt(unitTF.getText());
            int scoreT = Integer.parseInt(gradeTF.getText());
             if (scoreT >=70){
               course.grade = 5.0;
            }else if (scoreT >= 60 && scoreT < 70){
                course.grade = 4.0;
            }else if (scoreT>=50 && scoreT <= 60){
                course.grade = 3.0;
            }else if (scoreT>=45 && scoreT <50){
                course.grade = 2.0;
            }else if (scoreT>=40 && scoreT <45){
                course.grade = 1.0;
            }else {
                course.grade = 0.0;
            }//Dumzo-Ajufo divine Adun-fs-19-273 computer science. 
        }catch(Exception e){
            System.out.println(e.toString());
        }
        
        return course;
    }
}//Dumzo-Ajufo divine Adun-fs-19-273 computer science.