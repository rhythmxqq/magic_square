package com.company;

public class Main {

    public static void main(String[] args) {
        int n = 6;
        MagicSquare obj = new MagicSquare();
        obj.makeSquare(n);
    }
        static class MagicSquare
        {
            public void makeSquare(int s)
            {
                int magic[][] = new int[s][s];
                int pervoe = s / 2;
                int vtoroe = s - 1;
                for (int no = 1; no <= s * s;)
                {
                    if (pervoe == -1 && vtoroe == s) // 3rd rule
                    {
                        vtoroe = s - 2;
                        pervoe = 0;
                    }
                    else
                    {
                        if (vtoroe == s)
                        {
                            vtoroe = 0;
                        }
                        if (pervoe < 0)
                        {
                            pervoe = s - 1;
                        }
                    }
                    if (magic[pervoe][vtoroe] != 0)
                    {
                        vtoroe = vtoroe - 2;
                        pervoe = pervoe + 1;
                        continue;
                    }
                    else
                    {
                        magic[pervoe][vtoroe] = no;
                        no += 1;
                    }
                    vtoroe += 1;
                    pervoe -= 1;
                }
                System.out.println("Размерность = " + s);
                System.out.println("Сумма в строках, колонках или диагоналях= "+ (s * (s * s + 1) / 2));
                for (pervoe = 0; pervoe < s; pervoe++)
                {
                    for (vtoroe = 0; vtoroe < s; vtoroe++)
                    {
                        System.out.print(magic[pervoe][vtoroe] + " ");
                    }
                    System.out.println();
                }
            }
        }
    }
