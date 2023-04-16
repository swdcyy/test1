package i1.c;
import androidx.constraintlayout.solver.widgets.analyzer.WidgetRun;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import java.util.ArrayList;
import i1.d;
import androidx.constraintlayout.solver.widgets.analyzer.DependencyNode;
import androidx.constraintlayout.solver.widgets.d;
import java.lang.Object;
import androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour;
import androidx.constraintlayout.solver.widgets.analyzer.a;
import java.lang.Math;
import java.util.Iterator;
import androidx.constraintlayout.solver.widgets.ConstraintAnchor;
import java.lang.String;
import java.lang.StringBuilder;

public class c extends WidgetRun	// class@00215a
{
    public ArrayList k;
    public int l;

    public void c(ConstraintWidget p0,int p1){
       super(p0);
       this.k = new ArrayList();
       this.f = p1;
       this.p();
    }
    public void a(d p0){
       int i7;
       int i8;
       float f;
       WidgetRun widgetRun2;
       DependencyNode uDependencyN1;
       int i10;
       int i11;
       a m;
       float f2;
       WidgetRun widgetRun4;
       int i15;
       boolean b1;
       int i16;
       DependencyNode uDependencyN2;
       float f3;
       WidgetRun b3;
       ConstraintWidget w;
       int i17;
       DependencyNode g;
       ConstraintWidget$DimensionBehaviour uDimensionBe;
       WidgetRun widgetRun = this;
       if (widgetRun.h.j != null && widgetRun.i.j != null) {
          ConstraintWidget uConstraintW = widgetRun.b.L();
          int b = (uConstraintW != null && uConstraintW instanceof d)? uConstraintW.B1(): false;
          int i = widgetRun.i.g - widgetRun.h.g;
          int i1 = widgetRun.k.size();
          int i2 = 0;
          while (true) {
             int i3 = -1;
             DependencyNode uDependencyN = 8;
             if (i2 < i1) {
                if (widgetRun.k.get(i2).b.T() == uDependencyN) {
                   i2 = i2 + 1;
                }else {
                label_004d :
                   int i4 = i1 - 1;
                   int i5 = i4;
                   while (i5 >= 0) {
                      if (widgetRun.k.get(i5).b.T() == uDependencyN) {
                         i5 = i5 - 1;
                      }else {
                         i3 = i5;
                      }
                   }
                   i5 = 0;
                   while (true) {
                      if (i5 < 2) {
                         int i6 = 0;
                         i7 = 0;
                         i8 = 0;
                         int i9 = 0;
                         f = 0;
                         while (true) {
                            if (i6 < i1) {
                               WidgetRun widgetRun1 = widgetRun.k.get(i6);
                               if (widgetRun1.b.T() != uDependencyN) {
                                  i9 = i9 + 1;
                                  if (i6 > 0 && i6 >= i2) {
                                     i7 = i7 + widgetRun1.h.f;
                                  }
                                  widgetRun2 = widgetRun1.e;
                                  uDependencyN = widgetRun2.g;
                                  WidgetRun widgetRun3 = (widgetRun1.d != ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT)? 1: null;
                                  if (widgetRun3) {
                                     widgetRun2 = widgetRun.f;
                                     if (widgetRun2 == null && widgetRun1.b.e.e.j == null) {
                                        return;
                                     }else if(widgetRun2 == 1 && widgetRun1.b.f.e.j == null){
                                        return;
                                     }else {
                                        uDependencyN1 = uDependencyN;
                                     }
                                  }else {
                                     uDependencyN1 = uDependencyN;
                                     if (widgetRun1.a == 1 && !i5) {
                                        m = widgetRun2.m;
                                        i8 = i8 + 1;
                                     }else if(widgetRun2.j != null){
                                        m = uDependencyN1;
                                     }
                                     widgetRun3 = 1;
                                  label_00d7 :
                                     if (!widgetRun3) {
                                        i8 = i8 + 1;
                                        i10 = widgetRun1.b.F0[widgetRun.f];
                                        if (i10 - null >= 0) {
                                           f = f + i10;
                                        }
                                     }else {
                                        i7 = i7 + uDependencyN;
                                     }
                                     if (i6 < i4 && i6 < i3) {
                                        i11 = - widgetRun1.i.f;
                                        i7 = i7 + i11;
                                     }
                                  }
                                  uDependencyN = uDependencyN1;
                                  goto label_00d7 ;
                               }
                            label_00f6 :
                               i6 = i6 + 1;
                               uDependencyN = 8;
                               widgetRun2 = 2;
                            }else if(i7 < i || !i8){
                               i11 = i9;
                            label_0110 :
                               uDependencyN = widgetRun.h.g;
                               if (b) {
                                  uDependencyN = widgetRun.i.g;
                               }
                               float f1 = 0x3f000000;
                               if (i7 > i) {
                                  f2 = 2.00f;
                                  i10 = (b)? uDependencyN + (int)(((float)(i7 - i) / f2) + f1): uDependencyN - (int)(((float)(i7 - i) / f2) + f1);
                               }
                            label_0131 :
                               if (i8 > 0) {
                                  f2 = (float)(i - i7);
                                  int i12 = (int)((f2 / (float)i8) + f1);
                                  int i13 = 0;
                                  i6 = 0;
                                  while (i13 < i1) {
                                     widgetRun4 = widgetRun.k.get(i13);
                                     int i14 = i12;
                                     i15 = i7;
                                     if (widgetRun4.b.T() != 8 && widgetRun4.d == ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT) {
                                        widgetRun2 = widgetRun4.e;
                                        if (widgetRun2.j == null) {
                                           if (f - null > 0) {
                                              uDependencyN2 = i10;
                                              float f4 = widgetRun4.b.F0[widgetRun.f] * f2;
                                              f4 = f4 / f;
                                              f4 = f4 + 0x3f000000;
                                              i10 = (int)f4;
                                           }else {
                                              uDependencyN2 = i10;
                                              i10 = i14;
                                           }
                                           if (widgetRun.f == null) {
                                              WidgetRun b2 = widgetRun4.b;
                                              f3 = f2;
                                              ConstraintWidget t = b2.t;
                                              ConstraintWidget s = b2.s;
                                              b1 = b;
                                              i16 = i11;
                                              b = (widgetRun4.a == 1)? Math.min(i10, widgetRun2.m): i10;
                                              b = Math.max(s, b);
                                              if (t > null) {
                                                 b = Math.min(t, b);
                                              }
                                              if (b != i10) {
                                              label_01ce :
                                                 i6 = i6 + 1;
                                                 i10 = b;
                                              }
                                           }else {
                                              b1 = b;
                                              i16 = i11;
                                              f3 = f2;
                                              b3 = widgetRun4.b;
                                              w = b3.w;
                                              uConstraintW = b3.v;
                                              i17 = (widgetRun4.a == 1)? Math.min(i10, widgetRun2.m): i10;
                                              b = Math.max(uConstraintW, i17);
                                              if (w > null) {
                                                 b = Math.min(w, b);
                                              }
                                              if (b != i10) {
                                                 goto label_01ce ;
                                              }
                                           }
                                           widgetRun4.e.d(i10);
                                        label_01df :
                                           i13 = i13 + 1;
                                           i12 = i14;
                                           i7 = i15;
                                           uDependencyN = uDependencyN2;
                                           f2 = f3;
                                           b = b1;
                                           i11 = i16;
                                           c uoc = 0x3f000000;
                                        }
                                     }
                                     b1 = b;
                                     i16 = i11;
                                     uDependencyN2 = i10;
                                     f3 = f2;
                                     goto label_01df ;
                                  }
                                  b1 = b;
                                  i16 = i11;
                                  uDependencyN2 = i10;
                                  i15 = i7;
                                  if (i6 > 0) {
                                     i8 = i8 - i6;
                                     b = 0;
                                     i11 = 0;
                                     while (b < i1) {
                                        WidgetRun widgetRun5 = widgetRun.k.get(b);
                                        if (widgetRun5.b.T() != 8) {
                                           if (b > 0 && b >= i2) {
                                              i11 = i11 + widgetRun5.h.f;
                                           }
                                           i11 = i11 + widgetRun5.e.g;
                                           if (b < i4 && b < i3) {
                                              i10 = - widgetRun5.i.f;
                                              i11 = i11 + i10;
                                           }
                                        }
                                     label_022b :
                                        b = b + 1;
                                     }
                                     i7 = i11;
                                  }else {
                                     i7 = i15;
                                  }
                                  i11 = 2;
                                  if (widgetRun.l == i11 && !i6) {
                                     widgetRun.l = 0;
                                  }else {
                                     b = 0;
                                  }
                               }else {
                                  b1 = b;
                                  i16 = i11;
                                  uDependencyN2 = i10;
                                  i11 = 2;
                               }
                               if (i7 > i) {
                                  widgetRun.l = i11;
                               }
                               if (i16 > 0 && (!i8 && i2 == i3)) {
                                  widgetRun.l = i11;
                               }
                            label_0255 :
                               c l = widgetRun.l;
                               uDependencyN = 1;
                               if (l == uDependencyN) {
                                  i5 = i16;
                                  if (i5 > uDependencyN) {
                                     i = (i - i7) / (i5 - 1);
                                  }else if(i5 == uDependencyN){
                                     i = (i - i7) / 2;
                                  }else {
                                     i = 0;
                                  }
                                  if (i8 > 0) {
                                     i = 0;
                                  }
                                  uDependencyN = uDependencyN2;
                                  i11 = 0;
                                  while (i11 < i1) {
                                     if (b1) {
                                        b = i11 + 1;
                                        b = i1 - b;
                                     }else {
                                        b = i11;
                                     }
                                     b3 = widgetRun.k.get(b);
                                     if (b3.b.T() == 8) {
                                        b3.h.d(uDependencyN);
                                        b3.i.d(uDependencyN);
                                     }else if(i11 > 0){
                                        i10 = (b1)? uDependencyN - i: uDependencyN + i;
                                     }
                                  label_029e :
                                     if (i11 > 0 && i11 >= i2) {
                                        i10 = (b1)? i10 - b3.h.f: i10 + b3.h.f;
                                     }
                                  label_02af :
                                     if (b1) {
                                        b3.i.d(i10);
                                     }else {
                                        b3.h.d(i10);
                                     }
                                     widgetRun4 = b3.e;
                                     g = widgetRun4.g;
                                     if (b3.d == ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT && b3.a == 1) {
                                        g = widgetRun4.m;
                                     }
                                     i10 = (b1)? i10 - g: i10 + g;
                                     if (b1) {
                                        b3.h.d(i10);
                                     }else {
                                        b3.i.d(i10);
                                     }
                                     b3.g = true;
                                     if (i11 < i4 && i11 < i3) {
                                        if (b1) {
                                           b = - b3.i.f;
                                           i10 = i10 - b;
                                        }else {
                                           b = - b3.i.f;
                                           i10 = i10 + b;
                                        }
                                     }
                                     i11 = i11 + 1;
                                  }
                               }else {
                                  i5 = i16;
                                  if (l == null) {
                                     i = (i - i7) / (i5 + 1);
                                     if (i8 > 0) {
                                        i = 0;
                                     }
                                     uDependencyN = uDependencyN2;
                                     i11 = 0;
                                     while (i11 < i1) {
                                        if (b1) {
                                           b = i11 + 1;
                                           b = i1 - b;
                                        }else {
                                           b = i11;
                                        }
                                        b3 = widgetRun.k.get(b);
                                        if (b3.b.T() == 8) {
                                           b3.h.d(uDependencyN);
                                           b3.i.d(uDependencyN);
                                        }else if(b1){
                                           i10 = uDependencyN - i;
                                        }else {
                                           i10 = uDependencyN + i;
                                        }
                                        if (i11 > 0 && i11 >= i2) {
                                           i10 = (b1)? i10 - b3.h.f: i10 + b3.h.f;
                                        }
                                     label_0345 :
                                        if (b1) {
                                           b3.i.d(i10);
                                        }else {
                                           b3.h.d(i10);
                                        }
                                        widgetRun4 = b3.e;
                                        g = widgetRun4.g;
                                        if (b3.d == ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT && b3.a == 1) {
                                           i17 = Math.min(g, widgetRun4.m);
                                        }
                                        i10 = (b1)? i10 - i17: i10 + i17;
                                        if (b1) {
                                           b3.h.d(i10);
                                        }else {
                                           b3.i.d(i10);
                                        }
                                        if (i11 < i4 && i11 < i3) {
                                           if (b1) {
                                              b = - b3.i.f;
                                              i10 = i10 - b;
                                           }else {
                                              b = - b3.i.f;
                                              i10 = i10 + b;
                                           }
                                        }
                                        i11 = i11 + 1;
                                     }
                                  }else if(l == 2){
                                     float f5 = (widgetRun.f == null)? widgetRun.b.z(): widgetRun.b.P();
                                     if (b1) {
                                        f5 = 0x3f800000 - f5;
                                     }
                                     i11 = (int)(((float)(i - i7) * f5) + 0x3f000000);
                                     if (i11 < 0 || i8 > 0) {
                                        i11 = 0;
                                     }
                                     i10 = (b1)? uDependencyN2 - i11: uDependencyN2 + i11;
                                     i11 = 0;
                                     while (i11 < i1) {
                                        if (b1) {
                                           b = i11 + 1;
                                           b = i1 - b;
                                        }else {
                                           b = i11;
                                        }
                                        b3 = widgetRun.k.get(b);
                                        if (b3.b.T() == 8) {
                                           b3.h.d(i10);
                                           b3.i.d(i10);
                                           uDimensionBe = 1;
                                        }else if(i11 > 0 && i11 >= i2){
                                           i10 = (b1)? i10 - b3.h.f: i10 + b3.h.f;
                                        }
                                     label_03f8 :
                                        if (b1) {
                                           b3.i.d(i10);
                                        }else {
                                           b3.h.d(i10);
                                        }
                                        WidgetRun e = b3.e;
                                        g = e.g;
                                        if (b3.d == ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT) {
                                           if (b3.a == 1) {
                                              a m1 = e.m;
                                           }
                                        }else {
                                           uDimensionBe = 1;
                                        }
                                        i10 = (b1)? i10 - m1: i10 + m1;
                                        if (b1) {
                                           b3.h.d(i10);
                                        }else {
                                           b3.i.d(i10);
                                        }
                                        if (i11 < i4 && i11 < i3) {
                                           if (b1) {
                                              b = - b3.i.f;
                                              i10 = i10 - b;
                                           }else {
                                              b = - b3.i.f;
                                              i10 = i10 + b;
                                           }
                                        }
                                        i11 = i11 + 1;
                                     }
                                  }
                               }
                            }else {
                               i5 = i5 + 1;
                               uDependencyN = 8;
                            }
                         }
                      }else {
                         w = null;
                         i7 = 0;
                         i8 = 0;
                         f = 0;
                         goto label_0110 ;
                      }
                   }
                }
             }else {
                i2 = -1;
                goto label_004d ;
             }
          }
       }
       return;
    }
    public void d(){
       ConstraintWidget l;
       ConstraintWidget uConstraintW;
       DependencyNode uDependencyN1;
       ConstraintWidget uConstraintW1;
       Iterator iterator = this.k.iterator();
       while (iterator.hasNext()) {
          iterator.next().d();
       }
       int i = this.k.size();
       int i1 = 1;
       if (i < i1) {
          return;
       }
       int i2 = 0;
       WidgetRun b = this.k.get(i2).b;
       WidgetRun b1 = this.k.get((i - i1)).b;
       if (this.f == null) {
          ConstraintWidget j = b.J;
          l = b1.L;
          DependencyNode uDependencyN = this.i(j, i2);
          i1 = j.f();
          uConstraintW = this.q();
          if (uConstraintW != null) {
             i1 = uConstraintW.J.f();
          }
          if (uDependencyN != null) {
             this.b(this.h, uDependencyN, i1);
          }
          uDependencyN1 = this.i(l, i2);
          i = l.f();
          uConstraintW1 = this.r();
          if (uConstraintW1 != null) {
             i = uConstraintW1.L.f();
          }
          if (uDependencyN1 != null) {
             this.b(this.i, uDependencyN1, (- i));
          }
       }else {
          uConstraintW1 = b.K;
          l = b1.M;
          DependencyNode uDependencyN2 = this.i(uConstraintW1, i1);
          int i3 = uConstraintW1.f();
          uConstraintW = this.q();
          if (uConstraintW != null) {
             i3 = uConstraintW.K.f();
          }
          if (uDependencyN2 != null) {
             this.b(this.h, uDependencyN2, i3);
          }
          uDependencyN1 = this.i(l, i1);
          i = l.f();
          uConstraintW1 = this.r();
          if (uConstraintW1 != null) {
             i = uConstraintW1.M.f();
          }
          if (uDependencyN1 != null) {
             this.b(this.i, uDependencyN1, (- i));
          }
       }
       this.h.a = this;
       this.i.a = this;
       return;
    }
    public void e(){
       for (int i = 0; i < this.k.size(); i = i + 1) {
          this.k.get(i).e();
       }
       return;
    }
    public void f(){
       this.c = null;
       Iterator iterator = this.k.iterator();
       while (iterator.hasNext()) {
          iterator.next().f();
       }
       return;
    }
    public long j(){
       int i = this.k.size();
       long l = 0;
       for (int i1 = 0; i1 < i; i1 = i1 + 1) {
          WidgetRun widgetRun = this.k.get(i1);
          l = l + (long)widgetRun.h.f;
          l = l + widgetRun.j();
          l = l + (long)widgetRun.i.f;
       }
       return l;
    }
    public void l(){
       this.h.j = false;
       this.i.j = false;
    }
    public boolean n(){
       int i = this.k.size();
       int i1 = 0;
       while (true) {
          if (i1 >= i) {
             return true;
          }
          if (!this.k.get(i1).n()) {
             break ;
          }else {
             i1 = i1 + 1;
          }
       }
       return false;
    }
    public final void p(){
       WidgetRun tb = this.b;
       ConstraintWidget uConstraintW = tb.M(this.f);
       WidgetRun widgetRun = tb;
       ConstraintWidget uConstraintW1 = uConstraintW;
       while (uConstraintW1 != null) {
          uConstraintW = uConstraintW1.M(this.f);
       }
       this.b = widgetRun;
       this.k.add(widgetRun.O(this.f));
       for (uConstraintW1 = widgetRun.K(this.f); uConstraintW1 != null; uConstraintW1 = uConstraintW1.K(this.f)) {
          this.k.add(uConstraintW1.O(this.f));
       }
       Iterator iterator = this.k.iterator();
       while (iterator.hasNext()) {
          widgetRun = iterator.next();
          WidgetRun tf = this.f;
          if (tf == null) {
             widgetRun.b.c = this;
          }else if(tf == 1){
             widgetRun.b.d = this;
          }
       }
       c uoc = (this.f == null && this.b.L().B1())? 1: null;
       if (uoc && this.k.size() > 1) {
          uoc = this.k;
          this.b = uoc.get((uoc.size() - 1)).b;
       }
       int i = (this.f == null)? this.b.A(): this.b.Q();
       this.l = i;
       return;
    }
    public final ConstraintWidget q(){
       WidgetRun widgetRun;
       int i = 0;
       while (true) {
          if (i >= this.k.size()) {
             return null;
          }
          widgetRun = this.k.get(i);
          if (widgetRun.b.T() != 8) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return widgetRun.b;
    }
    public final ConstraintWidget r(){
       WidgetRun widgetRun;
       int i = this.k.size() - 1;
       while (true) {
          if (i < 0) {
             return null;
          }
          widgetRun = this.k.get(i);
          if (widgetRun.b.T() != 8) {
             break ;
          }else {
             i = i - 1;
          }
       }
       return widgetRun.b;
    }
    public String toString(){
       String str = "ChainRun ";
       String str1 = (this.f == null)? "horizontal : ": "vertical : ";
       str = str+str1;
       Iterator iterator = this.k.iterator();
       while (iterator.hasNext()) {
          str = str+"<"+iterator.next()+"> ";
       }
       return str;
    }
}
