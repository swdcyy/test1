package p1.d$b;
import java.lang.Object;
import p1.d;
import android.graphics.Path;
import java.lang.Math;

public class d$b	// class@002899
{
    public char a;
    public float[] b;

    public void d$b(char p0,float[] p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public void d$b(d$b p0){
       super();
       this.a = p0.a;
       p0 = p0.b;
       this.b = d.c(p0, 0, p0.length);
    }
    public static void a(Path p0,float[] p1,char p2,char p3,float[] p4){
       int i8;
       int i14;
       int i15;
       int i16;
       int i17;
       int i18;
       int i19;
       float f;
       float f1;
       float f2;
       float f3;
       float f4;
       float f5;
       float f6;
       Path path = p0;
       int i = p3;
       int i1 = p4;
       int i2 = p1[0];
       int i3 = p1[1];
       int i4 = p1[2];
       int i5 = p1[3];
       int i6 = p1[4];
       int i7 = p1[5];
       switch (i){
           case 'A':
           case 'a':
             i8 = 7;
             break;
           case 'C':
           case 'c':
             i8 = 6;
             break;
           case 'H':
           case 'V':
           case 'h':
           case 'v':
             i8 = 1;
             break;
           case 'Q':
           case 'q':
           case 's':
           case 'S':
             i8 = 4;
             break;
           case 'Z':
           case 'z':
             p0.close();
             path.moveTo(i6, i7);
             i2 = i6;
             i4 = i2;
             i3 = i7;
             i5 = i3;
          label_0038 :
             i8 = 2;
             break;
           default:
             goto label_0038 ;
       }
       boolean i9 = i2;
       boolean i10 = i3;
       int i11 = i6;
       int i12 = i7;
       int i13 = 0;
       i2 = p2;
       while (i13 < i1.length) {
          if (i != 65) {
             if (i != 67) {
                if (i != 72) {
                   i7 = 81;
                   if (i != i7) {
                      if (i != 86) {
                         if (i != 97) {
                            i14 = 99;
                            if (i != i14) {
                               if (i != 104) {
                                  i15 = 113;
                                  if (i != i15) {
                                     if (i != 118) {
                                        if (i != 76) {
                                           if (i != 77) {
                                              i16 = 115;
                                              i17 = 0x40000000;
                                              if (i != 83) {
                                                 i6 = 116;
                                                 i18 = 84;
                                                 if (i != i18) {
                                                    if (i != 108) {
                                                       if (i != 109) {
                                                          if (i != i16) {
                                                             if (i == i6) {
                                                                if (i2 != i15 && (i2 != i6 && (i2 == i7 || i2 == i18))) {
                                                                   f = i9 - i4;
                                                                   f1 = i10 - i5;
                                                                }else {
                                                                   f1 = 0;
                                                                   f = 0;
                                                                }
                                                                i3 = i13 + 0;
                                                                i5 = i13 + 1;
                                                                path.rQuadTo(f, f1, i1[i3], i1[i5]);
                                                                i4 = f + i9;
                                                                f1 = f1 + i10;
                                                                i9 = i9 + i1[i3];
                                                                i10 = i10 + i1[i5];
                                                                i5 = f1;
                                                             }
                                                          }else if(i2 != i14 && (i2 != i16 && (i2 == 0.00f || i2 == 0.00f))){
                                                             f1 = i9 - i4;
                                                             f2 = i10 - i5;
                                                             f3 = f2;
                                                             f2 = f1;
                                                          }else {
                                                             f2 = 0;
                                                             f3 = 0;
                                                          }
                                                          i18 = i13 + 0;
                                                          i16 = i13 + 1;
                                                          i15 = i13 + 2;
                                                          i17 = i13 + 3;
                                                          p0.rCubicTo(f2, f3, i1[i18], i1[i16], i1[i15], i1[i17]);
                                                          f1 = i1[i18] + i9;
                                                          f2 = i1[i16] + i10;
                                                          i9 = i9 + i1[i15];
                                                          i4 = i1[i17];
                                                       label_0211 :
                                                          f4 = i10 + i4;
                                                       label_0213 :
                                                          f3 = f1;
                                                          f4 = f2;
                                                          i10 = f4;
                                                       }else {
                                                          i2 = i13 + 0;
                                                          i9 = i9 + i1[i2];
                                                          i3 = i13 + 1;
                                                          i10 = i10 + i1[i3];
                                                          if (i13 > 0) {
                                                             path.rLineTo(i1[i2], i1[i3]);
                                                          }else {
                                                             path.rMoveTo(i1[i2], i1[i3]);
                                                          }
                                                       }
                                                    }else {
                                                       i2 = i13 + 0;
                                                       i6 = i13 + 1;
                                                       path.rLineTo(i1[i2], i1[i6]);
                                                       i9 = i9 + i1[i2];
                                                       i2 = i1[i6];
                                                    }
                                                 }else if(i2 != i15 && (i2 != i6 && (i2 == i7 || i2 == i18))){
                                                    f5 = i9 * i17;
                                                    f5 = f5 - i4;
                                                    f6 = i10 * i17;
                                                    f6 = f6 - i5;
                                                 }
                                                 i2 = i13 + 0;
                                                 i4 = i13 + 1;
                                                 path.quadTo(f5, f6, i1[i2], i1[i4]);
                                                 i19 = i13;
                                                 i5 = f6;
                                                 i4 = f5;
                                                 i9 = i1[i2];
                                                 i10 = i1[i4];
                                              }else if(i2 != i14 && (i2 != i16 && (i2 == 67 || i2 == 83))){
                                                 f5 = i9 * i17;
                                                 f5 = f5 - i4;
                                                 f6 = i10 * i17;
                                                 f6 = f6 - i5;
                                              }
                                              i10 = i13 + 0;
                                              i9 = i13 + 1;
                                              i18 = i13 + 2;
                                              i16 = i13 + 3;
                                              p0.cubicTo(f5, f6, i1[i10], i1[i9], i1[i18], i1[i16]);
                                              i2 = i1[i10];
                                              i3 = i1[i9];
                                              f4 = i1[i16];
                                              i9 = i1[i18];
                                              goto label_0213 ;
                                           }else {
                                              i2 = i13 + 0;
                                              i3 = i1[i2];
                                              i6 = i13 + 1;
                                              i7 = i1[i6];
                                              if (i13 > 0) {
                                                 path.lineTo(i1[i2], i1[i6]);
                                                 i9 = i3;
                                                 i10 = i7;
                                              }else {
                                                 path.moveTo(i1[i2], i1[i6]);
                                                 i9 = i3;
                                                 i10 = i7;
                                              }
                                           }
                                           i19 = i13;
                                           i12 = i10;
                                           i11 = i9;
                                        }else {
                                           i2 = i13 + 0;
                                           i6 = i13 + 1;
                                           path.lineTo(i1[i2], i1[i6]);
                                           i9 = i1[i2];
                                           i10 = i1[i6];
                                        }
                                     }else {
                                        i2 = i13 + 0;
                                        path.rLineTo(0, i1[i2]);
                                        i2 = i1[i2];
                                     }
                                     i10 = i10 + i2;
                                  }else {
                                     i2 = i13 + 0;
                                     i4 = i13 + 1;
                                     i6 = i13 + 2;
                                     i14 = i13 + 3;
                                     path.rQuadTo(i1[i2], i1[i4], i1[i6], i1[i14]);
                                     f1 = i1[i2] + i9;
                                     f2 = i1[i4] + i10;
                                     f5 = i9 + i1[i6];
                                     i4 = i1[i14];
                                     goto label_0211 ;
                                  }
                               }else {
                                  i2 = i13 + 0;
                                  path.rLineTo(i1[i2], 0);
                                  f5 = i9 + i1[i2];
                               }
                            }else {
                               i2 = i13 + 0;
                               i2 = i13 + 1;
                               i18 = i13 + 2;
                               i16 = i13 + 3;
                               i15 = i13 + 4;
                               i17 = i13 + 5;
                               p0.rCubicTo(i1[i2], i1[i2], i1[i18], i1[i16], i1[i15], i1[i17]);
                               f1 = i1[i18] + i9;
                               f2 = i1[i16] + i10;
                               f5 = i9 + i1[i15];
                               i4 = i1[i17];
                               goto label_0211 ;
                            }
                            i19 = i13;
                         }else {
                            i18 = i13 + 5;
                            f4 = i1[i18] + i9;
                            i16 = i13 + 6;
                            f = i1[i16] + i10;
                            i2 = i13 + 0;
                            i7 = i1[i2];
                            i2 = i13 + 1;
                            i14 = i1[i2];
                            i2 = i13 + 2;
                            i15 = i1[i2];
                            i2 = i13 + 3;
                            i3 = 0;
                            i17 = (i1[i2] - i3)? 1: 0;
                            i2 = i13 + 4;
                            int i20 = (i1[i2] - i3)? 1: 0;
                            i19 = i13;
                            d$b.c(p0, i9, i10, f4, f, i7, i14, i15, i17, i20);
                            f5 = i9 + i1[i18];
                            f6 = i10 + i1[i16];
                         label_030c :
                            f4 = f6;
                            f3 = f5;
                         }
                      }else {
                         i19 = i13;
                         i13 = i19 + 0;
                         path.lineTo(i9, i1[i13]);
                         i10 = i1[i13];
                      }
                   }else {
                      i19 = i13;
                      i13 = i19 + 0;
                      i3 = i19 + 1;
                      i5 = i19 + 2;
                      i7 = i19 + 3;
                      path.quadTo(i1[i13], i1[i3], i1[i5], i1[i7]);
                      i9 = i1[i5];
                      i10 = i1[i7];
                      i4 = i1[i13];
                      i5 = i1[i3];
                   }
                }else {
                   i19 = i13;
                   i13 = i19 + 0;
                   path.lineTo(i1[i13], i10);
                   i9 = i1[i13];
                }
             }else {
                i19 = i13;
                i13 = i19 + 0;
                i13 = i19 + 1;
                i13 = i19 + 2;
                i10 = i19 + 3;
                i9 = i19 + 4;
                i = i19 + 5;
                p0.cubicTo(i1[i13], i1[i13], i1[i13], i1[i10], i1[i9], i1[i]);
                i9 = i1[i9];
                i10 = i1[i];
                i5 = i1[i10];
                i4 = i1[i13];
             }
          }else {
             i19 = i13;
             i15 = i10;
             i = i9;
             i18 = i19 + 5;
             i5 = i1[i18];
             i16 = i19 + 6;
             i6 = i1[i16];
             i13 = i19 + 0;
             i7 = i1[i13];
             i13 = i19 + 1;
             i14 = i1[i13];
             i13 = i19 + 2;
             i13 = i1[i13];
             i2 = i19 + 3;
             i3 = 0;
             i10 = (i1[i2] - i3)? true: false;
             i2 = i19 + 4;
             i9 = (i1[i2] - i3)? true: false;
             d$b.c(p0, i, i15, i5, i6, i7, i14, i13, i10, i9);
             i9 = i1[i18];
             i10 = i1[i16];
             goto label_030c ;
          }
          i13 = i19 + i8;
          i2 = p3;
          i = i2;
          i15 = 2;
       }
       p1[0] = i9;
       p1[1] = i10;
       p1[2] = i4;
       p1[3] = i5;
       p1[4] = i11;
       p1[5] = i12;
       return;
    }
    public static void b(Path p0,double p1,double p2,double p3,double p4,double p5,double p6,double p7,double p8,double p9){
       double d = p3;
       int i = (int)Math.ceil(Math.abs(((p9 * 4.00f) / 0x400921fb54442d18)));
       double d1 = Math.cos(p7);
       double d2 = Math.sin(p7);
       double d3 = Math.cos(p8);
       double d4 = Math.sin(p8);
       double d5 = - d;
       double d6 = d5 * d1;
       double d7 = p4 * d2;
       d5 = d5 * d2;
       double d8 = p4 * d1;
       d3 = p9 / (double)i;
       double d9 = p8;
       double d10 = (d4 * d5) + (d3 * d8);
       double d11 = (d6 * d4) - (d7 * d3);
       int i1 = 0;
       d4 = p5;
       double d12 = p6;
       while (i1 < i) {
          double d13 = d9 + d3;
          double d14 = Math.sin(d13);
          double d15 = Math.cos(d13);
          double d16 = d * d1;
          d16 = d16 * d15;
          d16 = p1 + d16;
          double d17 = d7 * d14;
          double d18 = d16 - d17;
          d16 = d * d2;
          d16 = d16 * d15;
          d16 = p2 + d16;
          d17 = d8 * d14;
          d = d16 + d17;
          d16 = d6 * d14;
          d17 = d7 * d15;
          d16 = d16 - d17;
          d14 = d14 * d5;
          d15 = d15 * d8;
          d14 = d14 + d15;
          d9 = d13 - d9;
          d15 = d9 / 2.00f;
          d15 = Math.tan(d15);
          double d19 = d15 * 3.00f;
          d19 = d19 * d15;
          d19 = d19 + 4.00f;
          d15 = Math.sqrt(d19);
          d15 = d15 - 0x3ff0000000000000;
          d9 = Math.sin(d9) * d15;
          d9 = d9 / 3.00f;
          d11 = d11 * d9;
          d4 = d4 + d11;
          d10 = d10 * d9;
          d1 = d12 + d10;
          d12 = d9 * d16;
          d2 = d18 - d12;
          d9 = d9 * d14;
          d3 = d - d9;
          p0.rLineTo(0, 0);
          float f = (float)d2;
          float f1 = (float)d3;
          p0.cubicTo((float)d4, (float)d1, f, f1, (float)d18, (float)d);
          i1 = i1 + 1;
          i = i;
          int i2 = p3;
       }
       return;
    }
    public static void c(Path p0,float p1,float p2,float p3,float p4,float p5,float p6,float p7,boolean p8,boolean p9){
       float f4;
       float f = p1;
       float f1 = p3;
       float f2 = p5;
       double d = Math.toRadians((double)p7);
       double d1 = Math.cos(d);
       double d2 = Math.sin(d);
       double d3 = (double)f;
       double d4 = d3 * d1;
       double d5 = d3;
       d3 = (double)p2;
       double d6 = (double)f2;
       d4 = (d4 + (d3 * d2)) / d6;
       double d7 = d3;
       d3 = (double)p6;
       double d8 = (((double)(- f) * d2) + (d3 * d1)) / d3;
       double d9 = (double)p4;
       double d10 = (((double)f1 * d1) + (d9 * d2)) / d6;
       double d11 = d6;
       d6 = (((double)(- f1) * d2) + (d9 * d1)) / d3;
       d9 = d4 - d10;
       double d12 = d8 - d6;
       double d13 = (d4 + d10) / 2.00f;
       double d14 = (d8 + d6) / 2.00f;
       double d15 = (d9 * d9) + (d12 * d12);
       if (!d15) {
          return;
       }
       double d16 = (0x3ff0000000000000 / d15) - 0x3fd0000000000000;
       if (d16 < 0) {
          f = (float)(Math.sqrt(d15) / 0x3ffffff583a53b8e);
          float f3 = f2 * f;
          f4 = p6 * f;
          d$b.c(p0, p1, p2, p3, p4, f3, f4, p7, p8, p9);
          return;
       }else {
          d15 = Math.sqrt(d16);
          d9 = d9 * d15;
          d15 = d15 * d12;
          int i = p9;
          if (p8 == i) {
             d13 = d13 - d15;
             d14 = d14 + d9;
          }else {
             d13 = d13 + d15;
             d14 = d14 - d9;
          }
          d8 = d2;
          d12 = Math.atan2((d8 - d14), (d4 - d13));
          double d17 = Math.atan2((d6 - d14), (d10 - d13)) - d12;
          f4 = ((v2 = d17) >= 0)? 1: 0;
          if (i != f4) {
             d6 = 0x401921fb54442d18;
             d17 = (v2 > 0)? d17 - d6: d17 + d6;
          }
       label_00d2 :
          d13 = d13 * d11;
          d14 = d14 * d3;
          d$b.b(p0, ((d13 * d1) - (d14 * d8)), ((d13 * d8) + (d14 * d1)), d11, d3, d5, d7, d, d12, d17);
          return;
       }
    }
    public static void e(d$b[] p0,Path p1){
       float[] uofloatArray = new float[6];
       char c = 'm';
       for (int i = 0; i < p0.length; i = i + 1) {
          d$b.a(p1, uofloatArray, c, p0[i].a, p0[i].b);
       }
       return;
    }
    public void d(d$b p0,d$b p1,float p2){
       this.a = p0.a;
       int i = 0;
       d$b b = p0.b;
       while (i < b.length) {
          float f = 0x3f800000 - p2;
          float f1 = b[i] * f;
          f = p1.b[i] * p2;
          f1 = f1 + f;
          this.b[i] = f1;
          i = i + 1;
       }
       return;
    }
}
