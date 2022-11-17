/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.ProjectController;
import controller.TaskController;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.List;
import javax.swing.DefaultListModel;
import model.Project;
import model.Task;
import util.ButtonColumnCelRenderer;
import util.DeadlineColumnCelRender;
import util.TaskTableModel;

/**
 *
 * @author Windows 10
 */
public class MainScreen extends javax.swing.JFrame {
    
    ProjectController projectController;
    TaskController taskController;
    
    DefaultListModel projectsModel; 
    TaskTableModel taskModel;
    
    public MainScreen() {        
        initComponents();
        initController();
        initComponentsModel();
        decorateTableTask();
        this.setLocationRelativeTo(null) ;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        emptyList = new javax.swing.JPanel();
        emptyListIcon = new javax.swing.JLabel();
        emptyListSubTitle = new javax.swing.JLabel();
        emptyListTitle = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        header = new javax.swing.JPanel();
        headerTitle = new javax.swing.JLabel();
        headerSubTitle = new javax.swing.JLabel();
        projects = new javax.swing.JPanel();
        projectsTitle = new javax.swing.JLabel();
        projectsAdd = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        tasks = new javax.swing.JPanel();
        tasksTitle = new javax.swing.JLabel();
        tasksAdd = new javax.swing.JLabel();
        projectsList = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        projectsListItems = new javax.swing.JList<>();
        jPanelTasks = new javax.swing.JPanel();
        jScrollPaneTasks = new javax.swing.JScrollPane();
        jTableTasks = new javax.swing.JTable();

        emptyList.setBackground(new java.awt.Color(255, 255, 255));
        emptyList.setMaximumSize(new java.awt.Dimension(2147483647, 200));
        emptyList.setMinimumSize(new java.awt.Dimension(60, 200));
        emptyList.setPreferredSize(new java.awt.Dimension(300, 200));

        emptyListIcon.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        emptyListIcon.setForeground(new java.awt.Color(0, 165, 102));
        emptyListIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        emptyListIcon.setText("Nenhuma tarefa por aqui");

        emptyListSubTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        emptyListSubTitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lists.png"))); // NOI18N
        emptyListSubTitle.setMinimumSize(new java.awt.Dimension(60, 200));

        emptyListTitle.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        emptyListTitle.setForeground(new java.awt.Color(153, 153, 153));
        emptyListTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        emptyListTitle.setText("Clique no botão \"+\" para adicionar uma nova tarefa");

        javax.swing.GroupLayout emptyListLayout = new javax.swing.GroupLayout(emptyList);
        emptyList.setLayout(emptyListLayout);
        emptyListLayout.setHorizontalGroup(
            emptyListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(emptyListLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(emptyListSubTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(emptyListIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(emptyListTitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 696, Short.MAX_VALUE)
        );
        emptyListLayout.setVerticalGroup(
            emptyListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(emptyListLayout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(emptyListSubTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(emptyListIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(emptyListTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(118, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(600, 600));

        header.setBackground(new java.awt.Color(0, 165, 102));

        headerTitle.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        headerTitle.setForeground(new java.awt.Color(255, 255, 255));
        headerTitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tick.png"))); // NOI18N
        headerTitle.setText(" Todo App");

        headerSubTitle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        headerSubTitle.setForeground(new java.awt.Color(255, 255, 255));
        headerSubTitle.setText("Anote tudo, não se esqueça de nada!");

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(headerLayout.createSequentialGroup()
                        .addComponent(headerTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(43, 43, 43))
                    .addComponent(headerSubTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 1100, Short.MAX_VALUE))
                .addContainerGap())
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(headerTitle)
                .addGap(18, 18, 18)
                .addComponent(headerSubTitle)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        projects.setBackground(new java.awt.Color(255, 255, 255));
        projects.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        projectsTitle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        projectsTitle.setForeground(new java.awt.Color(0, 165, 102));
        projectsTitle.setText("Projetos");
        projectsTitle.setMaximumSize(new java.awt.Dimension(66, 25));
        projectsTitle.setMinimumSize(new java.awt.Dimension(66, 25));

        projectsAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/add.png"))); // NOI18N
        projectsAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                projectsAddMouseClicked(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cross-icon.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout projectsLayout = new javax.swing.GroupLayout(projects);
        projects.setLayout(projectsLayout);
        projectsLayout.setHorizontalGroup(
            projectsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(projectsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(projectsTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(91, 91, 91)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(projectsAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        projectsLayout.setVerticalGroup(
            projectsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(projectsLayout.createSequentialGroup()
                .addGroup(projectsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(projectsAdd, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                    .addComponent(projectsTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        tasks.setBackground(new java.awt.Color(255, 255, 255));
        tasks.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tasks.setPreferredSize(new java.awt.Dimension(882, 67));

        tasksTitle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tasksTitle.setForeground(new java.awt.Color(0, 165, 102));
        tasksTitle.setText("Tarefas");

        tasksAdd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tasksAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/add.png"))); // NOI18N
        tasksAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tasksAddMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout tasksLayout = new javax.swing.GroupLayout(tasks);
        tasks.setLayout(tasksLayout);
        tasksLayout.setHorizontalGroup(
            tasksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tasksLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tasksTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tasksAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        tasksLayout.setVerticalGroup(
            tasksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tasksTitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(tasksAdd, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
        );

        projectsList.setBackground(new java.awt.Color(255, 255, 255));
        projectsList.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        projectsListItems.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        projectsListItems.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        projectsListItems.setFixedCellHeight(50);
        projectsListItems.setSelectionBackground(new java.awt.Color(0, 165, 102));
        projectsListItems.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                projectsListItemsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(projectsListItems);

        javax.swing.GroupLayout projectsListLayout = new javax.swing.GroupLayout(projectsList);
        projectsList.setLayout(projectsListLayout);
        projectsListLayout.setHorizontalGroup(
            projectsListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, projectsListLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        projectsListLayout.setVerticalGroup(
            projectsListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(projectsListLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanelTasks.setBackground(new java.awt.Color(255, 255, 255));
        jPanelTasks.setAutoscrolls(true);
        jPanelTasks.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jPanelTasks.setPreferredSize(new java.awt.Dimension(60, 200));
        jPanelTasks.setLayout(new java.awt.BorderLayout());

        jTableTasks.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTableTasks.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nome", "Descrição", "Prazo", "Tarefa Concluída"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableTasks.setGridColor(new java.awt.Color(255, 255, 255));
        jTableTasks.setRowHeight(50);
        jTableTasks.setSelectionBackground(new java.awt.Color(102, 255, 102));
        jTableTasks.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTableTasks.setShowHorizontalLines(true);
        jTableTasks.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableTasksMouseClicked(evt);
            }
        });
        jScrollPaneTasks.setViewportView(jTableTasks);

        jPanelTasks.add(jScrollPaneTasks, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(projects, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(projectsList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tasks, javax.swing.GroupLayout.DEFAULT_SIZE, 820, Short.MAX_VALUE)
                    .addComponent(jPanelTasks, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tasks, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                    .addComponent(projects, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelTasks, javax.swing.GroupLayout.DEFAULT_SIZE, 412, Short.MAX_VALUE)
                    .addComponent(projectsList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void projectsAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_projectsAddMouseClicked
        // TODO add your handling code here:
        ProjectDialogScreen projectDialogScreen = new ProjectDialogScreen(this, rootPaneCheckingEnabled);
        projectDialogScreen.setVisible(true);
        
        projectDialogScreen.addWindowListener(new WindowAdapter(){
            public void windowClosed(WindowEvent e) {
                loadProjects();
            }
        });
    }//GEN-LAST:event_projectsAddMouseClicked

    private void tasksAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tasksAddMouseClicked
        // TODO add your handling code here:
        TaskDialogScreen taskDialogScreen = new TaskDialogScreen(this, rootPaneCheckingEnabled);
        
        int projectIndex = projectsListItems.getSelectedIndex();
        Project project = (Project) projectsModel.get(projectIndex);
        taskDialogScreen.setProject(project);
        taskDialogScreen.setVisible(true);
        
        taskDialogScreen.addWindowListener(new WindowAdapter() {
                public void windowClosed(WindowEvent e) {
                    int projectIndex = projectsListItems.getSelectedIndex();
                    Project project = (Project) projectsModel.get(projectIndex);
                    loadTasks(project.getId());
                }
        });
    }//GEN-LAST:event_tasksAddMouseClicked

    private void jTableTasksMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableTasksMouseClicked
        // TODO add your handling code here:
        int rowIndex = jTableTasks.rowAtPoint(evt.getPoint());
        int columnIndex = jTableTasks.columnAtPoint(evt.getPoint());
        Task task = taskModel.getTasks().get(rowIndex);
        
        switch (columnIndex) {
            case 1:
                break;
            case 3:
                taskController.update(task);
                break;
            case 4:
                TaskDialogScreenAtt taskDialogScreenAtt = new TaskDialogScreenAtt(this, rootPaneCheckingEnabled);
                taskDialogScreenAtt.setTask(task);
                taskDialogScreenAtt.setInfos();
                taskDialogScreenAtt.setVisible(true);  
                taskDialogScreenAtt.addWindowListener(new WindowAdapter() {
                public void windowClosed(WindowEvent e) {
                    int projectIndex = projectsListItems.getSelectedIndex();
                    Project project = (Project) projectsModel.get(projectIndex);
                    loadTasks(project.getId());
                }
        });
                break;
            case 5:
                taskController.removeById(task.getId());
                taskModel.getTasks().remove(task);
                int projectIndex = projectsListItems.getSelectedIndex();
                Project project = (Project) projectsModel.get(projectIndex);
                loadTasks(project.getId());
                break;
        }
    }//GEN-LAST:event_jTableTasksMouseClicked

    private void projectsListItemsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_projectsListItemsMouseClicked
        // TODO add your handling code here:
        int projectIndex = projectsListItems.getSelectedIndex();
        Project project = (Project) projectsModel.get(projectIndex);
        loadTasks(project.getId());
    }//GEN-LAST:event_projectsListItemsMouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        int projectIndex = projectsListItems.getSelectedIndex();
        Project project = (Project) projectsModel.get(projectIndex);
        taskController.removeAll(project.getId());
        projectController.removeById(project.getId());
        loadProjects();
    }//GEN-LAST:event_jLabel1MouseClicked

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
                if ("Java swing".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainScreen().setVisible(true);
            }
        });  
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel emptyList;
    private javax.swing.JLabel emptyListIcon;
    private javax.swing.JLabel emptyListSubTitle;
    private javax.swing.JLabel emptyListTitle;
    private javax.swing.JPanel header;
    private javax.swing.JLabel headerSubTitle;
    private javax.swing.JLabel headerTitle;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanelTasks;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPaneTasks;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTable jTableTasks;
    private javax.swing.JPanel projects;
    private javax.swing.JLabel projectsAdd;
    private javax.swing.JPanel projectsList;
    private javax.swing.JList<String> projectsListItems;
    private javax.swing.JLabel projectsTitle;
    private javax.swing.JPanel tasks;
    private javax.swing.JLabel tasksAdd;
    private javax.swing.JLabel tasksTitle;
    // End of variables declaration//GEN-END:variables

    public void decorateTableTask() {
        jTableTasks.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 14));
        jTableTasks.getTableHeader().setBackground(new Color(0,165,102));
        jTableTasks.getTableHeader().setForeground(new Color(255,255, 255));
        
        jTableTasks.getColumnModel().getColumn(2).setCellRenderer(new DeadlineColumnCelRender());
                
        jTableTasks.getColumnModel().getColumn(4).setCellRenderer(new ButtonColumnCelRenderer("edit"));
        jTableTasks.getColumnModel().getColumn(5).setCellRenderer(new ButtonColumnCelRenderer("delete"));

        
        jTableTasks.setAutoCreateRowSorter(true);
    }
    
    public void initController() {
    projectController = new ProjectController();
    taskController = new TaskController();
    }
    
    public void initComponentsModel() {
        projectsModel = new DefaultListModel();
        loadProjects();
        
        taskModel = new TaskTableModel();
        jTableTasks.setModel(taskModel);
        
        if(!projectsModel.isEmpty()) {
            projectsListItems.setSelectedIndex(0);
            int projectIndex = projectsListItems.getSelectedIndex();
            Project project = (Project) projectsModel.get(projectIndex);
            loadTasks(project.getId());
        }
    }
     
    public void loadTasks(int idProject) {
        List<Task> tasks = taskController.getAll(idProject);
        taskModel.setTasks(tasks);
        showJTableTasks(!tasks.isEmpty());
    }
    
    private void showJTableTasks(boolean hasTasks) {
        if (hasTasks) {
            if (emptyList.isVisible()) {
                emptyList.setVisible(false);
                jPanelTasks.remove(emptyList);
            }

            jPanelTasks.add(jScrollPaneTasks);
            jScrollPaneTasks.setVisible(true);
            jScrollPaneTasks.setSize(jPanelTasks.getWidth(),   jPanelTasks.getHeight());
        } else {
            if (jScrollPaneTasks.isVisible()) {
                jScrollPaneTasks.setVisible(false);
                jPanelTasks.remove(jScrollPaneTasks);
            }

            jPanelTasks.add(emptyList);
            emptyList.setVisible(true);
            emptyList.setSize(  jPanelTasks.getWidth(),   jPanelTasks.getHeight());
        }
    }
    
    public void loadProjects() {
        List<Project> projects = projectController.getAll();
        projectsModel.clear();
        for (int i = 0 ; i < projects.size(); i++) {
            Project project = projects.get(i);
            projectsModel.addElement(project);
            
            projectsListItems.setModel(projectsModel);
        }
    }
}
