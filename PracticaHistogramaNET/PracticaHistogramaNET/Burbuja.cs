using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace PracticaHistogramaNET
{
    class Burbuja
    {
        private int[] conjunto;

        public Burbuja(int[] conjunto)
        {
            this.conjunto = conjunto;
        }

        public int[] GetConjunto()
        {
            return this.conjunto;
        }

        public void Sort()
        {
            for (int i = 0; i < conjunto.Length - 1; i++)
            {
                for (int j = 0; j < conjunto.Length - i - 1; j++)
                {
                    if (conjunto[j] > conjunto[j + 1])
                    {
                        int temp = conjunto[j];
                        conjunto[j] = conjunto[j + 1];
                        conjunto[j + 1] = temp;
                    }
                }
            }
        }
    }
}
