/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicahistograma;

import java.awt.Color;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author ivan_
 */
public class Grafico {
    
    public static void crearHistgrama(int[] histograma, JPanel panel, Color colorBarra){
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        String serie = "Conjunto de datos";
        for(int i=0; i<histograma.length; i++){
            dataset.addValue(histograma[i], serie, ""+i);
        }
        JFreeChart chart = ChartFactory.createBarChart("Histograma", null, null, 
                dataset, PlotOrientation.VERTICAL, true, true, false);
        CategoryPlot trama = (CategoryPlot) chart.getPlot();
        BarRenderer render = (BarRenderer) trama.getRenderer();
        render.setSeriesPaint(0, colorBarra);
        chart.setAntiAlias(true);
        chart.setBackgroundPaint(new Color(215, 217, 223));
        panel.removeAll();
        panel.repaint();
        panel.setLayout(new java.awt.BorderLayout());
        panel.add(new ChartPanel(chart));
        panel.validate();
    }
}
