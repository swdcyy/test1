package com.loc.fl;
import java.util.ArrayList;
import com.amap.api.location.DPoint;
import java.lang.Object;
import java.util.List;
import java.util.Arrays;
import java.util.Collection;
import java.lang.Math;
import android.content.Context;
import com.loc.fj;
import java.lang.Throwable;
import java.lang.String;
import com.loc.fr;
import java.math.BigDecimal;

public final class fl	// class@001431
{
    public static double a = 3.141593;
    public static final List b;

    static {
       DPoint[] uDPointArray = new DPoint[]{new DPoint(23.38f, 0x405df072b4528284),new DPoint(0x4038fbb9496249a1, 120.47f),new DPoint(0x403984caf709b739, 0x405e57080b673c4f),new DPoint(0x403969cd5f99c38b, 122.44f),new DPoint(0x4038dcda6e75ff61, 122.29f),new DPoint(24.46f, 122.19f),new DPoint(0x403595b2e59af9ec, 120.97f),new DPoint(0x4035d4b1bbcf4e87, 0x405e29e26d4801f7)};
       fl.b = new ArrayList(Arrays.asList(uDPointArray));
    }
    public static double a(double p0){
       return (Math.sin(((p0 * 3000.00f) * (fl.a / 180.00f))) * 0x3ef4f8b588e368f1);
    }
    public static double a(double p0,double p1){
       return ((Math.cos((p1 / 0x40f86a0000000000)) * (p0 / 18000.00f)) + (Math.sin((p0 / 0x40f86a0000000000)) * (p1 / 9000.00f)));
    }
    public static DPoint a(double p0,double p1,double p2,double p3){
       DPoint uDPoint = new DPoint();
       p2 = p0 - p2;
       p3 = p1 - p3;
       DPoint uDPoint1 = fl.d(p2, p3);
       p0 = p0 + p2;
       uDPoint.setLongitude(fl.c((p0 - uDPoint1.getLongitude())));
       uDPoint.setLatitude(fl.c(((p1 + p3) - uDPoint1.getLatitude())));
       return uDPoint;
    }
    public static DPoint a(Context p0,DPoint p1){
       if (p0 == null) {
          return null;
       }
       return fl.b(p1);
    }
    public static DPoint a(DPoint p0){
       if (p0 == null) {
          return p0;
       }
       if (fj.a(p0.getLatitude(), p0.getLongitude())) {
          return fl.c(p0);
       }
       if (fl.e(p0.getLatitude(), p0.getLongitude())) {
          DPoint uDPoint = fl.c(p0);
          p0 = fl.f(uDPoint.getLatitude(), uDPoint.getLongitude());
       }
       return p0;
    }
    public static double b(double p0){
       return (Math.cos(((p0 * 3000.00f) * (fl.a / 180.00f))) * 0.00f);
    }
    public static double b(double p0,double p1){
       return ((Math.sin((p1 / 0x40f86a0000000000)) * (p0 / 18000.00f)) + (Math.cos((p0 / 0x40f86a0000000000)) * (p1 / 9000.00f)));
    }
    public static DPoint b(Context p0,DPoint p1){
       if (!fj.a(p1.getLatitude(), p1.getLongitude())) {
          return p1;
       }
       return fl.a(p0, fl.c(p1.getLongitude(), p1.getLatitude()));
    }
    public static DPoint b(DPoint p0){
       if (!fj.a(p0.getLatitude(), p0.getLongitude())) {
          return p0;
       }
       double[] uodoubleArra = fr.a(p0.getLongitude(), p0.getLatitude());
       return new DPoint(uodoubleArra[1], uodoubleArra[0]);
    }
    public static double c(double p0){
       return new BigDecimal(p0).setScale(8, 4).doubleValue();
    }
    public static DPoint c(double p0,double p1){
       double d = 0x40f86a0000000000;
       p0 = (double)((long)(p0 * d) % 0x2255100);
       p1 = (double)((long)(p1 * d) % 0x2255100);
       double d1 = (double)(int)((- fl.b(p0, p1)) + p1);
       double d2 = (- fl.a((double)(int)((- fl.a(p0, p1)) + p0), d1)) + p0;
       int i = 1;
       int i1 = (p0 > 0)? 1: -1;
       i1 = (double)(int)(d2 + (double)i1);
       d1 = (- fl.b(i1, d1)) + p1;
       if (p1 <= 0) {
          i = -1;
       }
       return new DPoint(((double)(int)(d1 + (double)i) / d), (i1 / d));
    }
    public static DPoint c(DPoint p0){
       DPoint uDPoint = null;
       double d = 0x3f7a37ffff31d771;
       double d1 = 0x3f78c0000225c17d;
       for (int i = 0; i < -361793726333271070000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000.00f; i = i + 1) {
          uDPoint = fl.a(p0.getLongitude(), p0.getLatitude(), d, d1);
          d = p0.getLongitude() - uDPoint.getLongitude();
          d1 = p0.getLatitude() - uDPoint.getLatitude();
       }
       return uDPoint;
    }
    public static DPoint d(double p0,double p1){
       DPoint uDPoint = new DPoint();
       double d = (p0 * p0) + (p1 * p1);
       uDPoint.setLongitude(fl.c(((Math.cos((fl.b(p0) + Math.atan2(p1, p0))) * (fl.a(p1) + Math.sqrt(d))) + 0x3f7a9fbe76c8b439)));
       uDPoint.setLatitude(fl.c(((Math.sin((fl.b(p0) + Math.atan2(p1, p0))) * (fl.a(p1) + Math.sqrt(d))) + 0x3f789374bc6a7efa)));
       return uDPoint;
    }
    public static boolean e(double p0,double p1){
       if (fj.a(new DPoint(p0, p1), fl.b)) {
          return true;
       }
       return false;
    }
    public static DPoint f(double p0,double p1){
       DPoint uDPoint = fl.g(p0, p1);
       return new DPoint(((p0 * 2.00f) - uDPoint.getLatitude()), ((p1 * 2.00f) - uDPoint.getLongitude()));
    }
    public static DPoint g(double p0,double p1){
       double d = p1 - 105.00f;
       double d1 = p0 - 35.00f;
       double d2 = fl.h(d, d1);
       d = fl.i(d, d1);
       double d3 = (p0 / 180.00f) * fl.a;
       double d4 = Math.sin(d3);
       double d5 = (0x3f7b6a8faf80ef0b * d4) * d4;
       d4 = 0x3ff0000000000000 - d5;
       d5 = Math.sqrt(d4);
       return new DPoint((p0 + ((d2 * 180.00f) / ((6335552.72f / (d4 * d5)) * fl.a))), (p1 + ((d * 180.00f) / (((6378245.00f / d5) * Math.cos(d3)) * fl.a))));
    }
    public static double h(double p0,double p1){
       double d = p0 * 2.00f;
       return ((((((((-100.00f + d) + (p1 * 3.00f)) + ((p1 * 0x3fc999999999999a) * p1)) + ((0x3fb999999999999a * p0) * p1)) + (Math.sqrt(Math.abs(p0)) * 0x3fc999999999999a)) + ((((Math.sin(((p0 * 6.00f) * fl.a)) * 20.00f) + (Math.sin((d * fl.a)) * 20.00f)) * 2.00f) / 3.00f)) + ((((Math.sin((fl.a * p1)) * 20.00f) + (Math.sin(((p1 / 3.00f) * fl.a)) * 40.00f)) * 2.00f) / 3.00f)) + ((((Math.sin(((p1 / 12.00f) * fl.a)) * 160.00f) + (Math.sin(((p1 * fl.a) / 30.00f)) * 320.00f)) * 2.00f) / 3.00f));
    }
    public static double i(double p0,double p1){
       double d = p0 * 0x3fb999999999999a;
       return ((((((((p0 + 300.00f) + (p1 * 2.00f)) + (d * p0)) + (d * p1)) + (Math.sqrt(Math.abs(p0)) * 0x3fb999999999999a)) + ((((Math.sin(((6.00f * p0) * fl.a)) * 20.00f) + (Math.sin(((p0 * 2.00f) * fl.a)) * 20.00f)) * 2.00f) / 3.00f)) + ((((Math.sin((fl.a * p0)) * 20.00f) + (Math.sin(((p0 / 3.00f) * fl.a)) * 40.00f)) * 2.00f) / 3.00f)) + ((((Math.sin(((p0 / 12.00f) * fl.a)) * 150.00f) + (Math.sin(((p0 / 30.00f) * fl.a)) * 300.00f)) * 2.00f) / 3.00f));
    }
}
