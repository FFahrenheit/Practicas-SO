using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using System.Windows.Forms.DataVisualization.Charting;

namespace PracticaHistogramaNET
{
    public partial class Form1 : Form
    {
        int[] conjunto = { 5, 8, 9, 2, 7, 4, 2};
        String[] datos = { "A", "B", "C", "D", "E", "F", "G"};
        Burbuja burbuja;

        public Form1()
        {
            InitializeComponent();
            this.burbuja = new Burbuja(conjunto);
        }

        private void btnOrdenar_Click(object sender, EventArgs e)
        {
            burbuja.Sort();
            this.conjunto = burbuja.GetConjunto();

            Series series = this.chart1.Series.Add("Total");
            this.chart1.Series.Clear();

            this.chart1.Palette = ChartColorPalette.SeaGreen;
            this.chart1.Titles.Add("Ventas");
            for (int i = 0; i < conjunto.Length; i++)
            {
                series = this.chart1.Series.Add(datos[i]);
                series.Points.Add(conjunto[i]);
            }
        }
    }
}
