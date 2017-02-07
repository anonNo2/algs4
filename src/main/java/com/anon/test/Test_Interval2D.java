package com.anon.test;

import edu.princeton.cs.algs4.*;

/**
 * Created by lenovo on 2017/1/17.
 */
public class Test_Interval2D {
    public static void main(String[] args) {
        args = new String[]{".2",".5",".5",".6","10000"};
        double xlo = Double.parseDouble(args[0]);
        double xhi = Double.parseDouble(args[1]);
        double ylo = Double.parseDouble(args[2]);
        double yhi = Double.parseDouble(args[3]);
        Integer T = Integer.parseInt(args[4]);

        Interval1D xinterval1D = new Interval1D(xlo, xhi);
        Interval1D yinterval1D = new Interval1D(ylo, yhi);
        Interval2D interval2D = new Interval2D(xinterval1D, yinterval1D);
        interval2D.draw();

        Counter hits = new Counter("hits");
        for (int t = 0; t<T ; t++){
            double x = Math.random();
            double y = Math.random();

            Point2D p = new Point2D(x,y);
            if(interval2D.contains(p)){
                hits.increment();
            }else {
                p.draw();
            }


        }
        StdOut.print(hits);
        StdOut.println(interval2D.area());

    }

}
