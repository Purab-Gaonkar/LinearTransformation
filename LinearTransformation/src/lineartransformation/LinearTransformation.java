/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lineartransformation;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author student
 */
public class LinearTransformation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                                Scanner s = new Scanner(System.in);
                                System.out.println("Enter The Size Of the vectors:");
				int sz = s.nextInt();
				double[] v1 = new double[sz];
				double[] v2 = new double[sz];
				System.out.println("Enter The First Vector:");
				for (int j = 0; j < sz; j++) {
					v1[j] = s.nextDouble();
				}
				System.out.println("Enter The Second Vector:");
				for (int i = 0; i < sz; i++) {
					v2[i] = s.nextDouble();
				}
				System.out.println("Result After Adding The Two Vectors is:");
				double[] x = Matrix.vectorAdd(v1, v2);
				for (int b = 0; b < sz; b++) {
					System.out.println(x[b]);
				}
				System.out.println("Enter The Scaler Value For Multiplication:");
				int sca = s.nextInt();
				x = Matrix.scalerMulti(v1, sca);
				System.out.println("Vector 1 after Multiplying with " + sca);
				for (int p = 0; p < sz; p++) {
					System.out.println(x[p]);
				}

				double[] w = Matrix.linearTransformation(v1);
				System.out.println("Vector 1 after Tranformation is:");
				for (int o = 0; o < sz; o++) {
					System.out.println(w[o]);
				}
				double[] e = Matrix.linearTransformation(v2);
				System.out.println("Vector 2 after Tranformation is:");
				for (int l = 0; l < sz; l++) {
					System.out.println(e[l]);
				}
                              //  double[] v = Matrix.linearTransformation(Matrix.vectorAdd(v1, v2));
				//System.out.println("Vector 2 after Tranformation is:");
				//for (int l = 0; l < sz; l++) {
				//	System.out.println(v[l]);
				//}
                              //  double []h=Matrix.vectorAdd(e, w);
                              //  for (int l = 0; l < sz; l++) {
				//	System.out.println(h[l]);
				//}
                                
				System.out.print(
						"verifying whether transformation preserves vector addition by perfoming (T(vector 1 + vector 2) = T(u)+T(v)):");
				System.out.println(
						Arrays.equals(Matrix.linearTransformation(Matrix.vectorAdd(v1, v2)), Matrix.vectorAdd(e, w)));
				System.out.println("");
    }
    
}
