package com.facebook.react.uimanager.b;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Double;
import java.lang.String;
import java.lang.Math;
import com.facebook.react.uimanager.b$a;
import od.a;
import java.lang.reflect.Array;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;

public class b	// class@00133a
{

    public void b(){
       super();
    }
    public static void a(double[] p0,double p1){
       p0[11] = 0xbff0000000000000 / p1;
    }
    public static void b(double[] p0,double p1){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(p0, Double.valueOf(p1), null, uob, "10")) {
          return;
       }
       p0[5] = Math.cos(p1);
       p0[6] = Math.sin(p1);
       p0[9] = - Math.sin(p1);
       p0[10] = Math.cos(p1);
       return;
    }
    public static void c(double[] p0,double p1){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(p0, Double.valueOf(p1), null, uob, "11")) {
          return;
       }
       p0[0] = Math.cos(p1);
       p0[2] = - Math.sin(p1);
       p0[8] = Math.sin(p1);
       p0[10] = Math.cos(p1);
       return;
    }
    public static void d(double[] p0,double p1){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(p0, Double.valueOf(p1), null, uob, "12")) {
          return;
       }
       p0[0] = Math.cos(p1);
       p0[1] = Math.sin(p1);
       p0[4] = - Math.sin(p1);
       p0[5] = Math.cos(p1);
       return;
    }
    public static void e(double[] p0,double p1){
       p0[0] = p1;
    }
    public static void f(double[] p0,double p1){
       p0[5] = p1;
    }
    public static void g(double[] p0,double p1){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(p0, Double.valueOf(p1), null, uob, "8")) {
          return;
       }
       p0[4] = Math.tan(p1);
       return;
    }
    public static void h(double[] p0,double p1){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(p0, Double.valueOf(p1), null, uob, "9")) {
          return;
       }
       p0[1] = Math.tan(p1);
       return;
    }
    public static void i(double[] p0,double p1,double p2){
       p0[12] = p1;
       p0[13] = p2;
    }
    public static void j(double[] p0,double p1,double p2,double p3){
       p0[12] = p1;
       p0[13] = p2;
       p0[14] = p3;
    }
    public static void k(double[] p0,b$a p1){
       boolean b;
       double[] obj = p0;
       b$a obj1 = p1;
       double d = double.class;
       if (PatchProxy.applyVoidTwoRefs(obj, obj1, null, b.class, "2")) {
          return;
       }
       int i = 16;
       int i1 = 1;
       b = (obj.length == i)? true: false;
       a.a(b);
       b$a perspective = obj1.perspective;
       b$a scale = obj1.scale;
       b$a skew = obj1.skew;
       b$a translation = obj1.translation;
       obj1 = obj1.rotationDegrees;
       int i2 = 15;
       if (b.n(obj[i2])) {
          return;
       }else {
          double[][] uodoubleArra = Array.newInstance(d, new int[2]{4,4});
          double[] uodoubleArra1 = new double[i];
          int i3 = 0;
          int i4 = 4;
          while (i3 < i4) {
             for (int i5 = 0; i5 < i4; i5 = i5 + 1) {
                int i6 = i3 * 4;
                i6 = i6 + i5;
                double d1 = obj[i6] / obj[i2];
                uodoubleArra[i3][i5] = d1;
                if (i5 == 3) {
                   d1 = 0;
                }
                uodoubleArra1[i6] = d1;
             }
             i3 = i3 + 1;
             i5 = 2;
          }
          long l = 0x3ff0000000000000;
          uodoubleArra1[i2] = l;
          if (b.n(b.l(uodoubleArra1))) {
             return;
          }else if(b.n(uodoubleArra[0][3]) && b.n(uodoubleArra[i1][3])){
             int i7 = 2;
             if (b.n(uodoubleArra[i7][3])) {
                long l1 = 0;
                perspective[i7] = l1;
                perspective[i1] = l1;
                perspective[0] = l1;
                perspective[3] = l;
                for (i7 = 0; i7 < 3; i7 = i7 + 1) {
                   translation[i7] = uodoubleArra[3][i7];
                }
                double[][] uodoubleArra2 = Array.newInstance(d, new int[2]{3,3});
                for (int i8 = 0; i8 < 3; i8 = i8 + 1) {
                   uodoubleArra2[i8][0] = uodoubleArra[i8][0];
                   uodoubleArra2[i8][i1] = uodoubleArra[i8][i1];
                   int i9 = 2;
                   uodoubleArra2[i8][i9] = uodoubleArra[i8][i9];
                }
                scale[0] = b.w(uodoubleArra2[0]);
                uodoubleArra2[0] = b.x(uodoubleArra2[0], scale[0]);
                skew[0] = b.v(uodoubleArra2[0], uodoubleArra2[i1]);
                uodoubleArra2[i1] = b.t(uodoubleArra2[i1], uodoubleArra2[0], 0x3ff0000000000000, (- skew[0]));
                skew[0] = b.v(uodoubleArra2[0], uodoubleArra2[i1]);
                uodoubleArra2[i1] = b.t(uodoubleArra2[i1], uodoubleArra2[0], 0x3ff0000000000000, (- skew[0]));
                scale[i1] = b.w(uodoubleArra2[i1]);
                uodoubleArra2[i1] = b.x(uodoubleArra2[i1], scale[i1]);
                skew[0] = skew[0] / scale[i1];
                skew[i1] = b.v(uodoubleArra2[0], uodoubleArra2[2]);
                uodoubleArra2[2] = b.t(uodoubleArra2[2], uodoubleArra2[0], 0x3ff0000000000000, (- skew[i1]));
                skew[2] = b.v(uodoubleArra2[i1], uodoubleArra2[2]);
                uodoubleArra2[2] = b.t(uodoubleArra2[2], uodoubleArra2[i1], 0x3ff0000000000000, (- skew[2]));
                scale[2] = b.w(uodoubleArra2[2]);
                uodoubleArra2[2] = b.x(uodoubleArra2[2], scale[2]);
                skew[i1] = skew[i1] / scale[2];
                skew[2] = skew[2] / scale[2];
                if (b.v(uodoubleArra2[0], b.u(uodoubleArra2[i1], uodoubleArra2[2])) < 0) {
                   for (i8 = 0; i8 < 3; i8 = i8 + 1) {
                      double d2 = 0xbff0000000000000;
                      double d3 = scale[i8] * d2;
                      scale[i8] = d3;
                      object oobject = uodoubleArra2[i8];
                      double d4 = oobject[0] * d2;
                      oobject[0] = d4;
                      oobject = uodoubleArra2[i8];
                      d4 = oobject[i1] * d2;
                      oobject[i1] = d4;
                      oobject = uodoubleArra2[i8];
                      i = 2;
                      d4 = oobject[i] * d2;
                      oobject[i] = d4;
                   }
                }
                obj1[0] = b.r(((- Math.atan2(uodoubleArra2[2][i1], uodoubleArra2[2][2])) * 0x404ca5dc1a63c1f8));
                obj1[i1] = b.r(((- Math.atan2((- uodoubleArra2[2][0]), Math.sqrt(((uodoubleArra2[2][i1] * uodoubleArra2[2][i1]) + (uodoubleArra2[2][2] * uodoubleArra2[2][2]))))) * 0x404ca5dc1a63c1f8));
                obj1[2] = b.r(((- Math.atan2(uodoubleArra2[i1][0], uodoubleArra2[0][0])) * 0x404ca5dc1a63c1f8));
                return;
             }
          }
          obj = new double[i4];
          obj[0] = uodoubleArra[0][3];
          obj[i1] = uodoubleArra[i1][3];
          obj[2] = uodoubleArra[2][3];
          obj[3] = uodoubleArra[3][3];
          b.p(obj, b.s(b.m(uodoubleArra1)), perspective);
          goto label_00c5 ;
       }
    }
    public static double l(double[] p0){
       long l = p0[0];
       long l1 = p0[1];
       long l2 = p0[2];
       long l3 = p0[3];
       long l4 = p0[4];
       long l5 = p0[5];
       long l6 = p0[6];
       long l7 = p0[7];
       long l8 = p0[8];
       long l9 = p0[9];
       long l10 = p0[10];
       long l11 = p0[11];
       long l12 = p0[12];
       long l13 = p0[13];
       long l14 = p0[14];
       long l15 = p0[15];
       double d = l3 * l6;
       double d1 = l2 * l7;
       double d2 = l3 * l5;
       double d3 = l1 * l7;
       double d4 = l2 * l5;
       double d5 = l1 * l6;
       double d6 = l3 * l4;
       double d7 = l7 * l;
       double d8 = l2 * l4;
       double d9 = l6 * l;
       double d10 = l1 * l4;
       double d11 = l * l5;
       return (((((((((((((((((((((((((d * l9) * l12) - ((d1 * l9) * l12)) - ((d2 * l10) * l12)) + ((d3 * l10) * l12)) + ((d4 * l11) * l12)) - ((d5 * l11) * l12)) - ((d * l8) * l13)) + ((d1 * l8) * l13)) + ((d6 * l10) * l13)) - ((d7 * l10) * l13)) - ((d8 * l11) * l13)) + ((d9 * l11) * l13)) + ((d2 * l8) * l14)) - ((d3 * l8) * l14)) - ((d6 * l9) * l14)) + ((d7 * l9) * l14)) + ((d10 * l11) * l14)) - ((l11 * d11) * l14)) - ((d4 * l8) * l15)) + ((d5 * l8) * l15)) + ((d8 * l9) * l15)) - ((d9 * l9) * l15)) - ((d10 * l10) * l15)) + ((d11 * l10) * l15));
    }
    public static double[] m(double[] p0){
       double d1;
       double d2;
       double d3;
       double d4;
       double d5;
       double d6;
       double d7;
       double d8;
       double d9;
       double d10;
       double d11;
       double d12;
       double d13;
       double d14;
       double d15;
       double d16;
       double d17;
       double d18;
       double d19;
       double d20;
       double d21;
       double d22;
       double d23;
       double d24;
       double d25;
       double d26;
       double d27;
       double d28;
       double d29;
       double d30;
       double[] obj = p0;
       Object obj1 = PatchProxy.applyOneRefs(obj, null, b.class, "3");
       if (obj1 != PatchProxyResult.class) {
          return obj1;
       }
       double d = b.l(p0);
       if (b.n(d)) {
          return obj;
       }
       long l = obj[0];
       long l1 = obj[1];
       long l2 = obj[2];
       long l3 = obj[3];
       long l4 = obj[4];
       long l5 = obj[5];
       long l6 = obj[6];
       long l7 = obj[7];
       long l8 = obj[8];
       long l9 = obj[9];
       long l10 = obj[10];
       long l11 = obj[11];
       long l12 = obj[12];
       long l13 = obj[13];
       long l14 = obj[14];
       long l15 = obj[15];
       obj = new double[]{((((((d1 * l13) - (d2 * l13)) + (d3 * l14)) - (d4 * l14)) - (d5 * l15)) + (d6 * l15)) / d,((((((d7 * l13) - (d8 * l13)) - (d9 * l14)) + (d10 * l14)) + (d11 * l15)) - (d12 * l15)) / d,((((((d13 * l13) - (d14 * l13)) + (d15 * l14)) - (d16 * l14)) - (d17 * l15)) + (d18 * l15)) / d,((((((d14 * l9) - (d13 * l9)) - (d15 * l10)) + (d16 * l10)) + (d17 * l11)) - (d18 * l11)) / d,((((((d2 * l12) - (d1 * l12)) - (d1 * l14)) + (d19 * l14)) + (d20 * l15)) - (d21 * l15)) / d,((((((d8 * l12) - (d7 * l12)) + (d7 * l14)) - (d2 * l14)) - (d22 * l15)) + (d23 * l15)) / d,((((((d14 * l12) - (d13 * l12)) - (d24 * l14)) + (d25 * l14)) + (d26 * l15)) - (d27 * l15)) / d,((((((d13 * l8) - (d14 * l8)) + (d24 * l10)) - (d25 * l10)) - (d26 * l11)) + (d27 * l11)) / d,((((((d4 * l12) - (d3 * l12)) + (d1 * l13)) - (d19 * l13)) - (d1 * l15)) + (d3 * l15)) / d,((((((d9 * l12) - (d10 * l12)) - (d7 * l13)) + (d2 * l13)) + (d7 * l15)) - (d2 * l15)) / d,((((((d16 * l12) - (d15 * l12)) + (d24 * l13)) - (d25 * l13)) - (d28 * l15)) + (l15 * d29)) / d,((((((d15 * l8) - (d16 * l8)) - (d24 * l9)) + (d25 * l9)) + (d28 * l11)) - (l11 * d29)) / d,((((((d5 * l12) - (d6 * l12)) - (d20 * l13)) + (d21 * l13)) + (d1 * l14)) - (d3 * l14)) / d,((((((d12 * l12) - (d11 * l12)) + (d22 * l13)) - (d23 * l13)) - (d7 * l14)) + (d2 * l14)) / d,(((((d30 - (l12 * d18)) - (d26 * l13)) + (l13 * d27)) + (d28 * l14)) - (l14 * d29)) / d,((((((d18 * l8) - (d17 * l8)) + (d26 * l9)) - (d27 * l9)) - (d28 * l10)) + (d29 * l10)) / d};
       d1 = l6 * l11;
       d2 = l7 * l10;
       d3 = l7 * l9;
       d4 = l5 * l11;
       d5 = l6 * l9;
       d6 = l5 * l10;
       d7 = l3 * l10;
       d8 = l2 * l11;
       d9 = l3 * l9;
       d10 = l1 * l11;
       d11 = l2 * l9;
       d12 = l1 * l10;
       d13 = l2 * l7;
       d14 = l3 * l6;
       d15 = l3 * l5;
       d16 = l1 * l7;
       d17 = l2 * l5;
       d18 = l1 * l6;
       d1 = l7 * l8;
       d19 = l4 * l11;
       d20 = l6 * l8;
       d21 = l4 * l10;
       d7 = l3 * l8;
       d2 = l * l11;
       d22 = l2 * l8;
       d23 = l * l10;
       d24 = l3 * l4;
       d25 = l7 * l;
       d26 = l2 * l4;
       d27 = l6 * l;
       d1 = l5 * l8;
       d3 = l4 * l9;
       d7 = l1 * l8;
       d2 = l * l9;
       d28 = l1 * l4;
       d29 = l * l5;
       d30 = d17 * l12;
       return obj;
    }
    public static boolean n(double p0){
       boolean b;
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyOneRefs(Double.valueOf(p0), null, uob, "1");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       b = false;
       if (Double.isNaN(p0)) {
          return b;
       }else if(Math.abs(p0) - 0x3ee4f8b588e368f1 < 0){
          b = true;
       }
       return b;
    }
    public static void o(double[] p0,double[] p1,double[] p2){
       long l = p1[0];
       long l1 = p1[1];
       long l2 = p1[2];
       long l3 = p1[3];
       long l4 = p1[4];
       long l5 = p1[5];
       long l6 = p1[6];
       long l7 = p1[7];
       long l8 = p1[8];
       long l9 = p1[9];
       long l10 = p1[10];
       long l11 = p1[11];
       long l12 = p1[12];
       long l13 = p1[13];
       long l14 = p1[14];
       long l15 = p1[15];
       long l16 = p2[0];
       long l17 = p2[1];
       long l18 = p2[2];
       long l19 = p2[3];
       p0[0] = (((l16 * l) + (l17 * l4)) + (l18 * l8)) + (l19 * l12);
       p0[1] = (((l16 * l1) + (l17 * l5)) + (l18 * l9)) + (l19 * l13);
       p0[2] = (((l16 * l2) + (l17 * l6)) + (l18 * l10)) + (l19 * l14);
       p0[3] = (((l16 * l3) + (l17 * l7)) + (l18 * l11)) + (l19 * l15);
       l16 = p2[4];
       l17 = p2[5];
       l18 = p2[6];
       l19 = p2[7];
       p0[4] = (((l16 * l) + (l17 * l4)) + (l18 * l8)) + (l19 * l12);
       p0[5] = (((l16 * l1) + (l17 * l5)) + (l18 * l9)) + (l19 * l13);
       p0[6] = (((l16 * l2) + (l17 * l6)) + (l18 * l10)) + (l19 * l14);
       p0[7] = (((l16 * l3) + (l17 * l7)) + (l18 * l11)) + (l19 * l15);
       l16 = p2[8];
       l17 = p2[9];
       l18 = p2[10];
       l19 = p2[11];
       p0[8] = (((l16 * l) + (l17 * l4)) + (l18 * l8)) + (l19 * l12);
       p0[9] = (((l16 * l1) + (l17 * l5)) + (l18 * l9)) + (l19 * l13);
       p0[10] = (((l16 * l2) + (l17 * l6)) + (l18 * l10)) + (l19 * l14);
       p0[11] = (((l16 * l3) + (l17 * l7)) + (l18 * l11)) + (l19 * l15);
       l16 = p2[12];
       l17 = p2[13];
       l18 = p2[14];
       l19 = p2[15];
       p0[12] = (((l * l16) + (l4 * l17)) + (l8 * l18)) + (l12 * l19);
       p0[13] = (((l1 * l16) + (l5 * l17)) + (l9 * l18)) + (l13 * l19);
       p0[14] = (((l2 * l16) + (l6 * l17)) + (l10 * l18)) + (l14 * l19);
       p0[15] = (((l16 * l3) + (l17 * l7)) + (l18 * l11)) + (l19 * l15);
    }
    public static void p(double[] p0,double[] p1,double[] p2){
       long l = p0[0];
       long l1 = p0[1];
       long l2 = p0[2];
       long l3 = p0[3];
       p2[0] = (((p1[0] * l) + (p1[4] * l1)) + (p1[8] * l2)) + (p1[12] * l3);
       p2[1] = (((p1[1] * l) + (p1[5] * l1)) + (p1[9] * l2)) + (p1[13] * l3);
       p2[2] = (((p1[2] * l) + (p1[6] * l1)) + (p1[10] * l2)) + (p1[14] * l3);
       p2[3] = (((l * p1[3]) + (l1 * p1[7])) + (l2 * p1[11])) + (l3 * p1[15]);
    }
    public static void q(double[] p0){
       p0[14] = 0;
       p0[13] = 0;
       p0[12] = 0;
       p0[11] = 0;
       p0[9] = 0;
       p0[8] = 0;
       p0[7] = 0;
       p0[6] = 0;
       p0[4] = 0;
       p0[3] = 0;
       p0[2] = 0;
       p0[1] = 0;
       p0[15] = 0x3ff0000000000000;
       p0[10] = 0x3ff0000000000000;
       p0[5] = 0x3ff0000000000000;
       p0[0] = 0x3ff0000000000000;
    }
    public static double r(double p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyOneRefs(Double.valueOf(p0), null, uob, "6");
          if (obj != PatchProxyResult.class) {
             return obj.doubleValue();
          }
       }
       return ((double)Math.round((p0 * 0x408f400000000000)) * 0x3f50624dd2f1a9fc);
    }
    public static double[] s(double[] p0){
       double[] uodoubleArra = new double[]{p0[0],p0[4],p0[8],p0[12],p0[1],p0[5],p0[9],p0[13],p0[2],p0[6],p0[10],p0[14],p0[3],p0[7],p0[11],p0[15]};
       return uodoubleArra;
    }
    public static double[] t(double[] p0,double[] p1,double p2,double p3){
       double[] uodoubleArra = new double[]{(p0[0] * p2) + (p1[0] * p3),(p0[1] * p2) + (p1[1] * p3),(p2 * p0[2]) + (p3 * p1[2])};
       return uodoubleArra;
    }
    public static double[] u(double[] p0,double[] p1){
       double[] uodoubleArra = new double[]{(p0[1] * p1[2]) - (p0[2] * p1[1]),(p0[2] * p1[0]) - (p0[0] * p1[2]),(p0[0] * p1[1]) - (p0[1] * p1[0])};
       return uodoubleArra;
    }
    public static double v(double[] p0,double[] p1){
       return (((p0[0] * p1[0]) + (p0[1] * p1[1])) + (p0[2] * p1[2]));
    }
    public static double w(double[] p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, b.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.doubleValue();
       }
       return Math.sqrt((((p0[0] * p0[0]) + (p0[1] * p0[1])) + (p0[2] * p0[2])));
    }
    public static double[] x(double[] p0,double p1){
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Double.valueOf(p1), null, uob, "5");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       double d = 0x3ff0000000000000;
       if (b.n(p1)) {
          p1 = b.w(p0);
       }
       d = d / p1;
       double[] uodoubleArra = new double[]{p0[0] * d,p0[1] * d,p0[2] * d};
       return uodoubleArra;
    }
}
