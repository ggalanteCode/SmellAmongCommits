/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import Parsers.ParserStarter;

import java.io.FileWriter;
import java.util.ArrayList;
import javax.swing.ImageIcon;

import com.google.common.base.Stopwatch;
import models.Project;
import repository.RepositoryHandler;
import tools.Analyze;
import tools.JcodeOdor;
import tools.SourceMeter;
import tools.SpotBugs;
import tools.Tool;
import tools.PhDSmells;
import utils.CliUtils;
import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.IOException;

/**
 * Window used to select which tools will be used and the parameters that those must use
 * @see javax.swing.JDialog
 * @author mefi
 */
public class Parameters extends javax.swing.JDialog {
    private ArrayList<Tool> tools;
    private Project p;
    private SourceMeter sm;
    private SpotBugs sb;
    private JcodeOdor jo;
    private PhDSmells phDSmells;
    private String commitId;
    private RepositoryHandler gr;
    private String MVNParam="/C mvn clean install";
   
    /**
     * Create new form parameter
     * @param p project
     * @param commitId commit version
     * @param gr repository
     */
    public Parameters(Project p, String commitId,RepositoryHandler gr) {
        initComponents();
        setVisible(true);
        pack();
        setTitle("Sbac");
        goBack.setIcon(new ImageIcon(getClass().getResource("/images/back.png")));
        confirmB.setIcon(new ImageIcon(getClass().getResource("/images/confirm.png")));
        this.p=p;
        this.tools = new ArrayList<>();
        this.commitId=commitId;
        this.gr=gr;
        sm = new SourceMeter(p);
        sb = new SpotBugs(p);
        jo = new JcodeOdor(p);
        phDSmells = new PhDSmells(p);
        smF.setText(sm.getDefaultParam());  
        sbF.setText(sb.getDefaultParam());   
        PhdSmellsF.setText(phDSmells.getDefaultParam());//test

    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        sbLabel = new javax.swing.JLabel();
        sbF = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        smF = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        PhdSmellsF = new javax.swing.JTextField();
        confirmB = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        sbcheck = new javax.swing.JCheckBox();
        smcheck = new javax.swing.JCheckBox();
        phScheck = new javax.swing.JCheckBox();
        goBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        panel.setBackground(new java.awt.Color(255, 255, 255));

        sbLabel.setBackground(new java.awt.Color(255, 255, 255));
        sbLabel.setText("SpotBugs");
        sbLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sbLabelMouseClicked(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Sourcemeter");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("PhDSmells");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        confirmB.setBackground(new java.awt.Color(0, 0, 0));
        confirmB.setForeground(new java.awt.Color(255, 255, 255));
        confirmB.setBorderPainted(false);
        confirmB.setContentAreaFilled(false);
        confirmB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmBActionPerformed(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setText(" ?");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        sbcheck.setBackground(new java.awt.Color(0, 0, 0));
        sbcheck.setForeground(new java.awt.Color(255, 255, 255));

        smcheck.setBackground(new java.awt.Color(0, 0, 0));

        phScheck.setBackground(new java.awt.Color(0, 0, 0));

        goBack.setBorderPainted(false);
        goBack.setContentAreaFilled(false);
        goBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(goBack)
                        .addGap(36, 36, 36)
                        .addComponent(confirmB)
                        .addGap(114, 114, 114)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelLayout.createSequentialGroup()
                                .addGap(152, 152, 152)
                                .addComponent(sbLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelLayout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(panelLayout.createSequentialGroup()
                                            .addComponent(phScheck, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(PhdSmellsF, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelLayout.createSequentialGroup()
                                                .addComponent(smcheck, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(smF, javax.swing.GroupLayout.DEFAULT_SIZE, 326, Short.MAX_VALUE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelLayout.createSequentialGroup()
                                                .addGap(126, 126, 126)
                                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelLayout.createSequentialGroup()
                                                .addGap(128, 128, 128)
                                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(panelLayout.createSequentialGroup()
                                        .addComponent(sbcheck, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(sbF, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 19, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(sbLabel)
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(sbcheck)
                    .addComponent(sbF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(jLabel2)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelLayout.createSequentialGroup()
                                .addComponent(smF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(jLabel3))
                            .addComponent(smcheck))
                        .addGap(11, 11, 11)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PhdSmellsF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(phScheck))
                        .addGap(18, 18, 18)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(confirmB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(goBack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(35, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void confirmBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmBActionPerformed
        long stopwatch = System.currentTimeMillis();
        System.out.println("CRONOMETRO PARTITO");
        tools = new ArrayList<>();

        if(smcheck.isSelected()){
            if(!smF.getText().equals(sm.getDefaultParam()))
                sm.setDefaultParam(smF.getText());
            tools.add(sm);
        }
        
        if(sbcheck.isSelected()){ 
            if(!sbF.getText().equals(sb.getDefaultParam()))
                sb.setDefaultParam(sbF.getText());
            tools.add(sb);
        }

        if(phScheck.isSelected()){
            if(!PhdSmellsF.getText().equals(phDSmells.getDefaultParam()))
                phDSmells.setDefaultParam(PhdSmellsF.getText());
            tools.add(phDSmells);
        }
    
        if(tools.isEmpty())
            new Dialog("you have to select at least one tool to analyze");
        else{
            dispose();

            /*BUILDING PHASE */


            WorkingAdv wa = new WorkingAdv();

            CliUtils cliUtils = new CliUtils("cmd",new File(gr.getLocalPath().toString()),MVNParam.split(" "));
            int run=1;
            try {
                CliUtils.Result execute = cliUtils.execute();
                run = execute.code;

            } catch (IOException ex) {
                Logger.getLogger(Parameters.class.getName()).log(Level.SEVERE, null, ex);
                ex.printStackTrace();
                System.out.println("cannot find build file");
            } catch (Exception ex) {
                Logger.getLogger(Parameters.class.getName()).log(Level.SEVERE, null, ex);
                ex.printStackTrace();
            }
            finally{

                if(run==0) {
                    System.out.println("build succesfull");
                } else {
                    System.out.println("build unsuccesfull , local path " + gr.getLocalPath().toString());
                }

                wa.halt();
            }

            System.out.println("Invoking Analyzer-Class.");
            Analyze.getAnalyzer().startAnalyze(tools);
            String checkEnd = Loading.checkEnd(tools);
            new Dialog(checkEnd); //exitcode
            setVisible(true);
            stopwatch = System.currentTimeMillis() - stopwatch;
            //try {
            //    FileWriter myWriter = new FileWriter("C:\\Users\\laura\\OneDrive - Università degli Studi di Milano\\Desktop\\Tirocinio\\Database\\cronometro.txt", true);
            //    // myWriter.write("CRONOMETRO: " + stopwatch/1000 + " sec\r\n");
            //    myWriter.close();
            //} catch(IOException e) {}
            if(!tools.isEmpty()){
                new ParserStarter(tools,commitId,p.getUrl());
            }
            dispose();
            new Download();

        }
        //Analyze.getAnalyzer().startAnalyze(tools,joF.getText().split(" "));
        
    }//GEN-LAST:event_confirmBActionPerformed

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        
        new Dialog("<HTML>you can add parameters for each tools ,if you dont want just click confirm<BR>Output path :<BR>Spotbugs<BR>"+sb.getOutputPath()+"<BR>Sourcemeters<BR>"+sm.getOutputPath()+"<BR>JCodeOdor<BR>"+jo.getOutputPath()+"</HTML>");
    }//GEN-LAST:event_jLabel4MouseClicked

    private void sbLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sbLabelMouseClicked
        // TODO add your handling code here:
        new Helper("<HTML><div class=\"section\" id=\"running-spotbugs\">\n" +
"<h1>Running SpotBugs<a class=\"headerlink\" href=\"#running-spotbugs\" title=\"Permalink to this headline\"></a></h1>\n" +
"<p>SpotBugs has two user interfaces: a graphical user interface (GUI) and a command line user interface.\n" +
"This chapter describes how to run each of these user interfaces.</p>\n" +
"<div class=\"section\" id=\"quick-start\">\n" +
"<h2>Quick Start<a class=\"headerlink\" href=\"#quick-start\" title=\"Permalink to this headline\"></a></h2>\n" +
"<p>If you are running SpotBugs on a Windows system, double-click on the file <code class=\"docutils literal notranslate\"><span class=\"pre\">%SPOTBUGS_HOME%\\lib\\spotbugs.jar</span></code> to start the SpotBugs GUI.</p>\n" +
"<p>On a Unix, Linux, or macOS system, run the <code class=\"docutils literal notranslate\"><span class=\"pre\">$SPOTBUGS_HOME/bin/spotbugs</span></code> script, or run the command <code class=\"docutils literal notranslate\"><span class=\"pre\">java</span> <span class=\"pre\">-jar</span> <span class=\"pre\">$SPOTBUGS_HOME/lib/spotbugs.jar</span></code> to run the SpotBugs GUI.</p>\n" +
"<p>Refer to <a class=\"reference internal\" href=\"gui.html\"><span class=\"doc\">Using the SpotBugs GUI</span></a> for information on how to use the GUI.</p>\n" +
"</div>\n" +
"<div class=\"section\" id=\"executing-spotbugs\">\n" +
"<h2>Executing SpotBugs<a class=\"headerlink\" href=\"#executing-spotbugs\" title=\"Permalink to this headline\"></a></h2>\n" +
"<p>This section describes how to invoke the SpotBugs program.\n" +
"There are two ways to invoke SpotBugs: directly, or using a wrapper script.</p>\n" +
"<div class=\"section\" id=\"direct-invocation-of-spotbugs\">\n" +
"<h3>Direct invocation of SpotBugs<a class=\"headerlink\" href=\"#direct-invocation-of-spotbugs\" title=\"Permalink to this headline\"></a></h3>\n" +
"<p>The preferred method of running SpotBugs is to directly execute <code class=\"docutils literal notranslate\"><span class=\"pre\">$SPOTBUGS_HOME/lib/spotbugs.jar</span></code> using the -jar command line switch of the JVM (java) executable.\n" +
"(Versions of SpotBugs prior to 1.3.5 required a wrapper script to invoke SpotBugs.)</p>\n" +
"<p>The general syntax of invoking SpotBugs directly is the following:</p>\n" +
"<div class=\"highlight-sh notranslate\"><div class=\"highlight\"><pre><span></span>java <span class=\"o\">[</span>JVM arguments<span class=\"o\">]</span> -jar <span class=\"nv\">$SPOTBUGS_HOME</span>/lib/spotbugs.jar options...\n" +
"</pre></div>\n" +
"</div>\n" +
"<div class=\"section\" id=\"choosing-the-user-interface\">\n" +
"<h4>Choosing the User Interface<a class=\"headerlink\" href=\"#choosing-the-user-interface\" title=\"Permalink to this headline\"></a></h4>\n" +
"<p>The first command line option chooses the SpotBugs user interface to execute. Possible values are:</p>\n" +
"<dl class=\"simple\">\n" +
"<dt>-gui:</dt><dd><p>runs the graphical user interface (GUI)</p>\n" +
"</dd>\n" +
"<dt>-textui:</dt><dd><p>runs the command line user interface</p>\n" +
"</dd>\n" +
"<dt>-version:</dt><dd><p>displays the SpotBugs version number</p>\n" +
"</dd>\n" +
"<dt>-help:</dt><dd><p>displays help information for the SpotBugs command line user interface</p>\n" +
"</dd>\n" +
"<dt>-gui1:</dt><dd><p>executes the original (obsolete) SpotBugs graphical user interface</p>\n" +
"</dd>\n" +
"</dl>\n" +
"</div>\n" +
"<div class=\"section\" id=\"java-virtual-machine-jvm-arguments\">\n" +
"<h4>Java Virtual Machine (JVM) arguments<a class=\"headerlink\" href=\"#java-virtual-machine-jvm-arguments\" title=\"Permalink to this headline\"></a></h4>\n" +
"<p>Several Java Virtual Machine arguments are useful when invoking SpotBugs.</p>\n" +
"<dl class=\"simple\">\n" +
"<dt>-XmxNNm:</dt><dd><p>Set the maximum Java heap size to NN megabytes.\n" +
"SpotBugs generally requires a large amount of memory.\n" +
"For a very large project, using 1500 megabytes is not unusual.</p>\n" +
"</dd>\n" +
"<dt>-Dname=value:</dt><dd><p>Set a Java system property.\n" +
"For example, you might use the argument <code class=\"docutils literal notranslate\"><span class=\"pre\">-Duser.language=ja</span></code> to display GUI messages in Japanese.</p>\n" +
"</dd>\n" +
"</dl>\n" +
"</div>\n" +
"</div>\n" +
"<div class=\"section\" id=\"invocation-of-spotbugs-using-a-wrapper-script\">\n" +
"<h3>Invocation of SpotBugs using a wrapper script<a class=\"headerlink\" href=\"#invocation-of-spotbugs-using-a-wrapper-script\" title=\"Permalink to this headline\"></a></h3>\n" +
"<p>Another way to run SpotBugs is to use a wrapper script.</p>\n" +
"<p>On Unix-like systems, use the following command to invoke the wrapper script:</p>\n" +
"<div class=\"highlight-sh notranslate\"><div class=\"highlight\"><pre><span></span>$ <span class=\"nv\">$SPOTBUGS_HOME</span>/bin/spotbugs options...\n" +
"</pre></div>\n" +
"</div>\n" +
"<p>On Windows systems, the command to invoke the wrapper script is</p>\n" +
"<div class=\"highlight-sh notranslate\"><div class=\"highlight\"><pre><span></span>C:<span class=\"se\">\\M</span>y Directory&gt;%SPOTBUGS_HOME%<span class=\"se\">\\b</span>in<span class=\"se\">\\s</span>potbugs.bat options...\n" +
"</pre></div>\n" +
"</div>\n" +
"<p>On both Unix-like and Windows systems, you can simply add the <code class=\"docutils literal notranslate\"><span class=\"pre\">$SPOTBUGS_HOME/bin</span></code> directory to your <code class=\"docutils literal notranslate\"><span class=\"pre\">PATH</span></code> environment variable and then invoke SpotBugs using the <code class=\"docutils literal notranslate\"><span class=\"pre\">spotbugs</span></code> command.</p>\n" +
"<div class=\"section\" id=\"wrapper-script-command-line-options\">\n" +
"<h4>Wrapper script command line options<a class=\"headerlink\" href=\"#wrapper-script-command-line-options\" title=\"Permalink to this headline\"></a></h4>\n" +
"<p>The SpotBugs wrapper scripts support the following command-line options.\n" +
"Note that these command line options are not handled by the SpotBugs program per se; rather, they are handled by the wrapper script.</p>\n" +
"<dl>\n" +
"<dt>-jvmArgs <em>args</em>:</dt><dd><p>Specifies arguments to pass to the JVM. For example, you might want to set a JVM property:</p>\n" +
"<div class=\"highlight-sh notranslate\"><div class=\"highlight\"><pre><span></span>$ spotbugs -textui -jvmArgs <span class=\"s2\">\"-Duser.language=ja\"</span> myApp.jar\n" +
"</pre></div>\n" +
"</div>\n" +
"</dd>\n" +
"<dt>-javahome <em>directory</em>:</dt><dd><p>Specifies the directory containing the JRE (Java Runtime Environment) to use to execute FindBugs.</p>\n" +
"</dd>\n" +
"<dt>-maxHeap <em>size</em>:</dt><dd><p>Specifies the maximum Java heap size in megabytes. The default is 256.\n" +
"More memory may be required to analyze very large programs or libraries.</p>\n" +
"</dd>\n" +
"<dt>-debug:</dt><dd><p>Prints a trace of detectors run and classes analyzed to standard output.\n" +
"Useful for troubleshooting unexpected analysis failures.</p>\n" +
"</dd>\n" +
"<dt>-property <em>name=value</em>:</dt><dd><p>This option sets a system property.\n" +
"SpotBugs uses system properties to configure analysis options.\n" +
"See <a class=\"reference internal\" href=\"analysisprops.html\"><span class=\"doc\">Analysis Properties</span></a>.\n" +
"You can use this option multiple times in order to set multiple properties.\n" +
"Note: In most versions of Windows, the name=value string must be in quotes.</p>\n" +
"</dd>\n" +
"</dl>\n" +
"</div>\n" +
"</div>\n" +
"</div>\n" +
"<div class=\"section\" id=\"command-line-options\">\n" +
"<h2>Command-line Options<a class=\"headerlink\" href=\"#command-line-options\" title=\"Permalink to this headline\"></a></h2>\n" +
"<p>This section describes the command line options supported by SpotBugs.\n" +
"These command line options may be used when invoking SpotBugs directly, or when using a wrapper script.</p>\n" +
"<div class=\"section\" id=\"common-command-line-options\">\n" +
"<h3>Common command-line options<a class=\"headerlink\" href=\"#common-command-line-options\" title=\"Permalink to this headline\"></a></h3>\n" +
"<p>These options may be used with both the GUI and command-line interfaces.</p>\n" +
"<dl class=\"simple\">\n" +
"<dt>-effort[:min|less|default|more|max]:</dt><dd><p>Set analysis effort level.\n" +
"The -effort:min disables several analyses that increase precision but also increase memory consumption. You may want to try this option if you find that SpotBugs with the -effort:less still runs out of memory, or takes an unusually long time to complete its analysis.\n" +
"The -effort:less disables some analyses that increase precision but also increase memory consumption. You may want to try this option if you find that SpotBugs with the -effort:more/-effort:default runs out of memory, or takes an unusually long time to complete its analysis.\n" +
"The -effort:more runs several analyses to find bugs, this is the -effort:default.\n" +
"The -effort:max enable analyses which increase precision and find more bugs, but which may require more memory and take more time to complete.\n" +
"See <a class=\"reference internal\" href=\"effort.html\"><span class=\"doc\">Effort</span></a>.</p>\n" +
"</dd>\n" +
"<dt>-project <em>project</em>:</dt><dd><p>Specify a project to be analyzed. The project file you specify should be one that was created using the GUI interface.\n" +
"It will typically end in the extension .fb or .fbp.</p>\n" +
"</dd>\n" +
"<dt>-pluginList &lt;jar1[;jar2…]&gt;:</dt><dd><p>Specify list of plugin Jar files to load.</p>\n" +
"</dd>\n" +
"<dt>-home &lt;home directory&gt;:</dt><dd><p>Specify SpotBugs home directory.</p>\n" +
"</dd>\n" +
"<dt>-adjustExperimental:</dt><dd><p>Lower priority of experimental Bug Patterns.</p>\n" +
"</dd>\n" +
"<dt>-workHard:</dt><dd><p>Ensure analysis effort is at least ‘default’.</p>\n" +
"</dd>\n" +
"<dt>-conserveSpace:</dt><dd><p>Same as -effort:min (for backward compatibility).</p>\n" +
"</dd>\n" +
"</dl>\n" +
"</div>\n" +
"<div class=\"section\" id=\"gui-options\">\n" +
"<h3>GUI Options<a class=\"headerlink\" href=\"#gui-options\" title=\"Permalink to this headline\"></a></h3>\n" +
"<p>These options are only accepted by the Graphical User Interface.</p>\n" +
"<dl class=\"simple\">\n" +
"<dt>-look:plastic|gtk|native:</dt><dd><p>Set Swing look and feel.</p>\n" +
"</dd>\n" +
"</dl>\n" +
"</div>\n" +
"<div class=\"section\" id=\"text-ui-options\">\n" +
"<h3>Text UI Options<a class=\"headerlink\" href=\"#text-ui-options\" title=\"Permalink to this headline\"></a></h3>\n" +
"<p>These options are only accepted by the Text User Interface.</p>\n" +
"<dl>\n" +
"<dt>-sortByClass:</dt><dd><p>Sort reported bug instances by class name.</p>\n" +
"</dd>\n" +
"<dt>-include <em>filterFile.xml</em>:</dt><dd><p>Only report bug instances that match the filter specified by filterFile.xml.\n" +
"See <a class=\"reference internal\" href=\"filter.html\"><span class=\"doc\">Filter file</span></a>.</p>\n" +
"</dd>\n" +
"<dt>-exclude <em>filterFile.xml</em>:</dt><dd><p>Report all bug instances except those matching the filter specified by filterFile.xml.\n" +
"See <a class=\"reference internal\" href=\"filter.html\"><span class=\"doc\">Filter file</span></a>.</p>\n" +
"</dd>\n" +
"<dt>-onlyAnalyze <em>com.foobar.MyClass,com.foobar.mypkg.*</em>:</dt><dd><p>Restrict analysis to find bugs to given comma-separated list of classes and packages.\n" +
"Unlike filtering, this option avoids running analysis on classes and packages that are not explicitly matched: for large projects, this may greatly reduce the amount of time needed to run the analysis.\n" +
"(However, some detectors may produce inaccurate results if they aren’t run on the entire application.)\n" +
"Classes should be specified using their full classnames (including package), and packages should be specified in the same way they would in a Java import statement to import all classes in the package (i.e., add .* to the full name of the package).\n" +
"Replace .* with .- to also analyze all subpackages.</p>\n" +
"</dd>\n" +
"<dt>-low:</dt><dd><p>Report all bugs.</p>\n" +
"</dd>\n" +
"<dt>-medium:</dt><dd><p>Report medium and high priority bugs. This is the default setting.</p>\n" +
"</dd>\n" +
"<dt>-high:</dt><dd><p>Report only high priority bugs.</p>\n" +
"</dd>\n" +
"<dt>-relaxed:</dt><dd><p>Relaxed reporting mode.\n" +
"For many detectors, this option suppresses the heuristics used to avoid reporting false positives.</p>\n" +
"</dd>\n" +
"<dt>-xml:</dt><dd><p>Produce the bug reports as XML.\n" +
"The XML data produced may be viewed in the GUI at a later time.\n" +
"You may also specify this option as <code class=\"docutils literal notranslate\"><span class=\"pre\">-xml:withMessages</span></code>; when this variant of the option is used, the XML output will contain human-readable messages describing the warnings contained in the file.\n" +
"XML files generated this way are easy to transform into reports.</p>\n" +
"</dd>\n" +
"<dt>-html:</dt><dd><p>Generate HTML output. By default, SpotBugs will use the default.xsl XSLT stylesheet to generate the HTML: you can find this file in spotbugs.jar, or in the SpotBugs source or binary distributions.\n" +
"Variants of this option include <code class=\"docutils literal notranslate\"><span class=\"pre\">-html:plain.xsl</span></code>, <code class=\"docutils literal notranslate\"><span class=\"pre\">-html:fancy.xsl</span></code> and <code class=\"docutils literal notranslate\"><span class=\"pre\">-html:fancy-hist.xsl</span></code>.\n" +
"The <code class=\"docutils literal notranslate\"><span class=\"pre\">plain.xsl</span></code> stylesheet does not use Javascript or DOM, and may work better with older web browsers, or for printing.\n" +
"The <code class=\"docutils literal notranslate\"><span class=\"pre\">fancy.xsl</span></code> stylesheet uses DOM and Javascript for navigation and CSS for visual presentation.\n" +
"The <code class=\"docutils literal notranslate\"><span class=\"pre\">fancy-hist.xsl</span></code> an evolution of <code class=\"docutils literal notranslate\"><span class=\"pre\">fancy.xsl</span></code> stylesheet. It makes an extensive use of DOM and Javascript for dynamically filtering the lists of bugs.</p>\n" +
"<p>If you want to specify your own XSLT stylesheet to perform the transformation to HTML, specify the option as <code class=\"docutils literal notranslate\"><span class=\"pre\">-html:myStylesheet.xsl</span></code>, where <code class=\"docutils literal notranslate\"><span class=\"pre\">myStylesheet.xsl</span></code> is the filename of the stylesheet you want to use.</p>\n" +
"</dd>\n" +
"<dt>-sarif:</dt><dd><p>Produce the bug reports in <a class=\"reference external\" href=\"https://docs.oasis-open.org/sarif/sarif/v2.1.0/sarif-v2.1.0.html\">SARIF 2.1.0</a>.</p>\n" +
"</dd>\n" +
"<dt>-emacs:</dt><dd><p>Produce the bug reports in Emacs format.</p>\n" +
"</dd>\n" +
"<dt>-xdocs:</dt><dd><p>Produce the bug reports in xdoc XML format for use with Apache Maven.</p>\n" +
"</dd>\n" +
"<dt>-output <em>filename</em>:</dt><dd><p>Produce the output in the specified file.</p>\n" +
"</dd>\n" +
"<dt>-outputFile <em>filename</em>:</dt><dd><p>This argument is deprecated. Use <code class=\"docutils literal notranslate\"><span class=\"pre\">-output</span></code> instead.</p>\n" +
"</dd>\n" +
"<dt>-nested[:true|false]:</dt><dd><p>This option enables or disables scanning of nested jar and zip files found in the list of files and directories to be analyzed.\n" +
"By default, scanning of nested jar/zip files is enabled. To disable it, add <code class=\"docutils literal notranslate\"><span class=\"pre\">-nested:false</span></code> to the command line arguments.</p>\n" +
"</dd>\n" +
"<dt>-auxclasspath <em>classpath</em>:</dt><dd><p>Set the auxiliary classpath for analysis.\n" +
"This classpath should include all jar files and directories containing classes that are part of the program being analyzed but you do not want to have analyzed for bugs.</p>\n" +
"</dd>\n" +
"<dt>-auxclasspathFromInput:</dt><dd><p>Read the auxiliary classpath for analysis from standard input, each line adds new entry to the auxiliary classpath for analysis.</p>\n" +
"</dd>\n" +
"<dt>-auxclasspathFromFile <em>filepath</em>:</dt><dd><p>Read the auxiliary classpath for analysis from file, each line adds new entry to the auxiliary classpath for analysis.</p>\n" +
"</dd>\n" +
"<dt>-analyzeFromFile <em>filepath</em>:</dt><dd><p>Read the files to analyze from file, each line adds new entry to the classpath for analysis.</p>\n" +
"</dd>\n" +
"<dt>-userPrefs <em>edu.umd.cs.findbugs.core.prefs</em>:</dt><dd><p>Set the path of the user preferences file to use, which might override some of the options above.\n" +
"Specifying userPrefs as first argument would mean some later options will override them, as last argument would mean they will override some previous options).\n" +
"This rationale behind this option is to reuse SpotBugs Eclipse project settings for command line execution.</p>\n" +
"</dd>\n" +
"<dt>-showPlugins:</dt><dd><p>Show list of available detector plugins.</p>\n" +
"</dd>\n" +
"</dl>\n" +
"<div class=\"section\" id=\"output-options\">\n" +
"<h4>Output options<a class=\"headerlink\" href=\"#output-options\" title=\"Permalink to this headline\"></a></h4>\n" +
"<dl class=\"simple\">\n" +
"<dt>-timestampNow:</dt><dd><p>Set timestamp of results to be current time.</p>\n" +
"</dd>\n" +
"<dt>-quiet:</dt><dd><p>Suppress error messages.</p>\n" +
"</dd>\n" +
"<dt>-longBugCodes:</dt><dd><p>Report long bug codes.</p>\n" +
"</dd>\n" +
"<dt>-progress:</dt><dd><p>Display progress in terminal window.</p>\n" +
"</dd>\n" +
"<dt>-release &lt;release name&gt;:</dt><dd><p>Set the release name of the analyzed application.</p>\n" +
"</dd>\n" +
"<dt>-maxRank &lt;rank&gt;:</dt><dd><p>Only report issues with a bug rank at least as scary as that provided.</p>\n" +
"</dd>\n" +
"<dt>-dontCombineWarnings:</dt><dd><p>Don’t combine warnings that differ only in line number.</p>\n" +
"</dd>\n" +
"<dt>-train[:outputDir]:</dt><dd><p>Save training data (experimental); output dir defaults to ‘.’.</p>\n" +
"</dd>\n" +
"<dt>-useTraining[:inputDir]:</dt><dd><p>Use training data (experimental); input dir defaults to ‘.’.</p>\n" +
"</dd>\n" +
"<dt>-redoAnalysis &lt;filename&gt;:</dt><dd><p>Redo analysis using configureation from previous analysis.</p>\n" +
"</dd>\n" +
"<dt>-sourceInfo &lt;filename&gt;:</dt><dd><p>Specify source info file (line numbers for fields/classes).</p>\n" +
"</dd>\n" +
"<dt>-projectName &lt;project name&gt;:</dt><dd><p>Descriptive name of project.</p>\n" +
"</dd>\n" +
"<dt>-reanalyze &lt;filename&gt;:</dt><dd><p>Redo analysis in provided file.</p>\n" +
"</dd>\n" +
"</dl>\n" +
"</div>\n" +
"<div class=\"section\" id=\"output-filtering-options\">\n" +
"<h4>Output filtering options<a class=\"headerlink\" href=\"#output-filtering-options\" title=\"Permalink to this headline\"></a></h4>\n" +
"<dl class=\"simple\">\n" +
"<dt>-bugCategories &lt;cat1[,cat2…]&gt;:</dt><dd><p>Only report bugs in given categories.</p>\n" +
"</dd>\n" +
"<dt>-excludeBugs &lt;baseline bugs&gt;:</dt><dd><p>Exclude bugs that are also reported in the baseline xml output.</p>\n" +
"</dd>\n" +
"<dt>-applySuppression:</dt><dd><p>Exclude any bugs that match suppression filter loaded from fbp file.</p>\n" +
"</dd>\n" +
"</dl>\n" +
"</div>\n" +
"<div class=\"section\" id=\"detector-visitor-configuration-options\">\n" +
"<h4>Detector (visitor) configuration options<a class=\"headerlink\" href=\"#detector-visitor-configuration-options\" title=\"Permalink to this headline\"></a></h4>\n" +
"<dl class=\"simple\">\n" +
"<dt>-visitors &lt;v1[,v2…]&gt;:</dt><dd><p>Run only named visitors.</p>\n" +
"</dd>\n" +
"<dt>-omitVisitors &lt;v1[,v2…]&gt;:</dt><dd><p>Omit named visitors.</p>\n" +
"</dd>\n" +
"<dt>-chooseVisitors &lt;+v1,-v2,…&gt;:</dt><dd><p>Selectively enable/disable detectors.</p>\n" +
"</dd>\n" +
"<dt>-choosePlugins &lt;+p1,-p2,…&gt;:</dt><dd><p>Selectively enable/disable plugins.</p>\n" +
"</dd>\n" +
"<dt>-adjustPriority &lt;v1=(raise|lower)[,…]&gt;:</dt><dd><p>Raise/lower priority of warnings for given visitor(s)</p>\n" +
"</dd>\n" +
"</dl>\n" +
"</div>\n" +
"<div class=\"section\" id=\"project-configuration-options\">\n" +
"<h4>Project configuration options<a class=\"headerlink\" href=\"#project-configuration-options\" title=\"Permalink to this headline\"></a></h4>\n" +
"<dl class=\"simple\">\n" +
"<dt>-sourcepath &lt;source path&gt;:</dt><dd><p>Set source path for analyzed classes.</p>\n" +
"</dd>\n" +
"<dt>-exitcode:</dt><dd><p>Set exit code of process.</p>\n" +
"</dd>\n" +
"<dt>-noClassOk:</dt><dd><p>Output empty warning file if no classes are specified.</p>\n" +
"</dd>\n" +
"<dt>-xargs:</dt><dd><p>Get list of classfiles/jarfiles from standard input rather than command line.</p>\n" +
"</dd>\n" +
"<dt>-bugReporters &lt;name,name2,-name3&gt;:</dt><dd><p>Bug reporter decorators to explicitly enable/disagoBack\n" +
"</dd>\n" +
"<dt>-printConfiguration:</dt><dd><p>Print configuration and exit, without running analysis.</p>\n" +
"</dd>\n" +
"</dl>\n" +
"</div>\n" +
"</div>\n" +
"</div>\n" +
"</div></HTML>");
    }//GEN-LAST:event_sbLabelMouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        new Helper("<HTML><h3>SOURCEMETER ONLINE DOCUMENTATION</h3><p>https://www.sourcemeter.com/resources/java/</p></HTML>");
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        new Helper( "-g: to get a GUI at the end of analysis\n-t: default settings to save results into DB\n-x: to obtain a NON analysable XML");
    }//GEN-LAST:event_jLabel3MouseClicked
    private void goBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goBackActionPerformed
        // TODO add your handling code here:
        dispose();
        new CommitPicker(p);
    }//GEN-LAST:event_goBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton confirmB;
    private javax.swing.JButton goBack;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JCheckBox phScheck;
    private javax.swing.JTextField PhdSmellsF;
    private javax.swing.JPanel panel;
    private javax.swing.JTextField sbF;
    private javax.swing.JLabel sbLabel;
    private javax.swing.JCheckBox sbcheck;
    private javax.swing.JTextField smF;
    private javax.swing.JCheckBox smcheck;
    // End of variables declaration//GEN-END:variables
}
