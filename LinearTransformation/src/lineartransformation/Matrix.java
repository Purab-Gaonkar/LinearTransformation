/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lineartransformation;

/**
 *
 * @author student
 */
public class Matrix {
    private int[][] elements;

	public Matrix(int[][] elements) {
		this.elements = elements;
	}
        public static double[] vectorAdd(double []v,double []u) {
		double []w = new double[v.length];
		for(int i=0;i<v.length;i++) {
			w[i]=v[i]+u[i];
		}
		return w;
	}
	public static double[] scalerMulti(double []v,int u) {
		double []w = new double[v.length];
		for(int i=0;i<v.length;i++) {
			w[i]=v[i]*u;
		}
		return w;
	}
	public static double[] linearTransformation(double[] v) {
		double x = v[0];
		double y = v[1];
		double z = v[2];
		
		double transformedx=((2*x)+y);
		double transformedy=(x-y);
		double transformedz=(x+y);
		double w[]= new double[] {transformedx,transformedy,transformedz};
		return w;
	}
}
