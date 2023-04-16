package c.t.m.g.bs;
import java.lang.Math;

public class bs	// class@000bf6
{

    public static double a(double p0){
       return ((p0 * 0x400921fb54442d18) / 180.00f);
    }
    public static double a(double p0,double p1,double p2,double p3){
       p0 = bs.a(p0);
       p2 = bs.a(p2);
       return ((double)Math.round(((((Math.asin(Math.sqrt((Math.pow(Math.sin(((p0 - p2) / 2.00f)), 2.00f) + ((Math.cos(p0) * Math.cos(p2)) * Math.pow(Math.sin(((bs.a(p1) - bs.a(p3)) / 2.00f)), 2.00f))))) * 2.00f) * 6378.14f) * 0x408f400000000000) * 0x408f400000000000)) / 0x408f400000000000);
    }
}
