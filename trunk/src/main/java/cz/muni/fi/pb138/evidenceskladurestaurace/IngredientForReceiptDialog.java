package cz.muni.fi.pb138.evidenceskladurestaurace;

import cz.muni.fi.pb138.evidenceskladurestaurace.model.IngredientsTableModel;
import cz.muni.fi.pb138.evidenceskladurestaurace.persistence.Ingredient;
import cz.muni.fi.pb138.evidenceskladurestaurace.persistence.IngredientDAO;
import cz.muni.fi.pb138.evidenceskladurestaurace.persistence.Recipe;
import cz.muni.fi.pb138.evidenceskladurestaurace.persistence.RecipeDAO;
import cz.muni.fi.pb138.evidenceskladurestaurace.persistence.RecipeDAOImpl;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Adams
 */
public class IngredientForReceiptDialog extends javax.swing.JFrame {

    private Ingredient ingredient;
    private IngredientDAO ingredientDAO;
    private IngredientsTableModel ingredientsTableModel;
    private List<Ingredient> recipeIngredientList = new ArrayList<>();
    private RecipeDAO recipeDAO = new RecipeDAOImpl();
    private Recipe receipt = null;
    private List<Ingredient> allIngredients = null;

    public IngredientForReceiptDialog(IngredientsTableModel ingredientsTableModel, IngredientDAO ingredientDAO, RecipeDAO recipeDAO, Recipe receipt) {
        initComponents();
        this.ingredient = new Ingredient();
        this.ingredientsTableModel = ingredientsTableModel;
        this.ingredientDAO = ingredientDAO;
        this.receipt = receipt;
        this.recipeDAO = recipeDAO;

        // new recipe does not have ingredients
        if (receipt.getIngredients() != null) {
            this.recipeIngredientList = receipt.getIngredients();
        }

        setLocationRelativeTo(null);

        allIngredients = ingredientDAO.findAll();
        for (Ingredient ingr : allIngredients) {
            ingredientBox.addItem(ingr.getName());
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        amountSpinner = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();
        unitVariable = new javax.swing.JLabel();
        ingredientBox = new javax.swing.JComboBox();
        addIngredient = new javax.swing.JButton();
        cancelIngredient = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Add New Ingredient");

        jLabel2.setText("Select Ingredient :");

        jLabel3.setText("Amount:");

        jLabel4.setText("Unit:");

        unitVariable.setText("unit");

        ingredientBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingredientBoxActionPerformed(evt);
            }
        });

        addIngredient.setText("Add");
        addIngredient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addIngredientActionPerformed(evt);
            }
        });

        cancelIngredient.setText("Cancel");
        cancelIngredient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelIngredientActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jLabel1)
                    .add(layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jLabel3)
                            .add(jLabel4))
                        .add(70, 70, 70)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(amountSpinner, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 59, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(unitVariable)))
                    .add(layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                            .add(addIngredient)
                            .add(jLabel2))
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(layout.createSequentialGroup()
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(ingredientBox, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 167, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                            .add(layout.createSequentialGroup()
                                .add(36, 36, 36)
                                .add(cancelIngredient)))))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(layout.createSequentialGroup()
                        .add(jLabel1)
                        .add(22, 22, 22)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(jLabel2)
                            .add(ingredientBox, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .add(7, 7, 7)
                        .add(jLabel4)
                        .add(18, 18, 18)
                        .add(jLabel3)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 59, Short.MAX_VALUE)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(addIngredient)
                            .add(cancelIngredient))
                        .addContainerGap())
                    .add(layout.createSequentialGroup()
                        .add(0, 0, Short.MAX_VALUE)
                        .add(unitVariable)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(amountSpinner, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(88, 88, 88))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ingredientBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingredientBoxActionPerformed
        String ingredientString = (String) ingredientBox.getSelectedItem();
        Ingredient ingr = ingredientDAO.findIngredientsByName(ingredientString);
        unitVariable.setText(ingr.getUnit().toString());

    }//GEN-LAST:event_ingredientBoxActionPerformed

    private void cancelIngredientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelIngredientActionPerformed
        dispose();
    }//GEN-LAST:event_cancelIngredientActionPerformed

    private void addIngredientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addIngredientActionPerformed
        String ingredientString = (String) ingredientBox.getSelectedItem();
        Ingredient ingr = ingredientDAO.findIngredientsByName(ingredientString);

        ingredient.setName(ingredientString);
        ingredient.setAmount((int) amountSpinner.getValue());
        ingredient.setUnit(ingr.getUnit());

        recipeIngredientList.add(ingredient);
        receipt.setIngredients(recipeIngredientList);

        ingredientsTableModel.setIngredients(recipeIngredientList);

        dispose();
    }//GEN-LAST:event_addIngredientActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addIngredient;
    private javax.swing.JSpinner amountSpinner;
    private javax.swing.JButton cancelIngredient;
    private javax.swing.JComboBox ingredientBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel unitVariable;
    // End of variables declaration//GEN-END:variables
}
