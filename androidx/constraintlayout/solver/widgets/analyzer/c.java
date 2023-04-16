package androidx.constraintlayout.solver.widgets.analyzer.c;
import androidx.constraintlayout.solver.widgets.analyzer.WidgetRun;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import androidx.constraintlayout.solver.widgets.analyzer.DependencyNode$Type;
import androidx.constraintlayout.solver.widgets.analyzer.DependencyNode;
import i1.d;
import androidx.constraintlayout.solver.widgets.analyzer.c$a;
import java.lang.Enum;
import androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour;
import androidx.constraintlayout.solver.widgets.analyzer.a;
import androidx.constraintlayout.solver.widgets.ConstraintAnchor;
import java.lang.Object;
import java.util.List;
import java.lang.Math;
import h1.a;
import androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type;
import androidx.constraintlayout.solver.widgets.analyzer.WidgetRun$RunType;
import java.lang.String;
import java.lang.StringBuilder;

public class c extends WidgetRun	// class@000699
{
    public static int[] k;

    static {
       int[] ointArray = new int[2];
       c.k = ointArray;
    }
    public void c(ConstraintWidget p0){
       super(p0);
       p0.e = DependencyNode$Type.LEFT;
       p0.e = DependencyNode$Type.RIGHT;
       this.f = 0;
    }
    public void a(d p0){
       WidgetRun b;
       ConstraintWidget p;
       WidgetRun i;
       int i1;
       int i2;
       int i3;
       int i4;
       DependencyNode g;
       float f3;
       float f4;
       WidgetRun widgetRun = this;
       DependencyNode uDependencyN = 3;
       if (c$a.a[widgetRun.j.ordinal()] != uDependencyN) {
          if (widgetRun.e.j == null && widgetRun.d == ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT) {
             b = widgetRun.b;
             p = b.p;
             if (p != 2) {
                if (p == uDependencyN) {
                   p = b.q;
                   i3 = -1;
                   if (p == null || p == uDependencyN) {
                      ConstraintWidget f1 = b.f;
                      WidgetRun h1 = f1.h;
                      WidgetRun i5 = f1.i;
                      uDependencyN = (b.J.f != null)? 1: null;
                      i4 = (b.K.f != null)? 1: 0;
                      int i6 = (b.L.f != null)? 1: 0;
                      int i7 = (b.M.f != null)? 1: 0;
                      int i8 = b.x();
                      if (uDependencyN && (i4 && (i6 && i7))) {
                         float f2 = widgetRun.b.w();
                         if (h1.j != null && i5.j != null) {
                            b = widgetRun.h;
                            if (b.c != null && widgetRun.i.c != null) {
                               this.p(c.k, (b.l.get(0).g + widgetRun.h.f), (widgetRun.i.l.get(0).g - widgetRun.i.f), (h1.g + h1.f), (i5.g - i5.f), f2, i8);
                               widgetRun.e.d(c.k[0]);
                               widgetRun.b.f.e.d(c.k[1]);
                            }
                            return;
                         }else {
                            b = widgetRun.h;
                            if (b.j != null) {
                               i = widgetRun.i;
                               if (i.j != null) {
                                  if (h1.c == null || i5.c == null) {
                                     return;
                                  }else {
                                     this.p(c.k, (b.g + b.f), (i.g - i.f), (h1.l.get(0).g + h1.f), (i5.l.get(0).g - i5.f), f2, i8);
                                     widgetRun.e.d(c.k[0]);
                                     widgetRun.b.f.e.d(c.k[1]);
                                  }
                               }
                            }
                            b = widgetRun.h;
                            if (b.c != null && (widgetRun.i.c != null && (h1.c == null || i5.c == null))) {
                               return;
                            }else {
                               this.p(c.k, (b.l.get(0).g + widgetRun.h.f), (widgetRun.i.l.get(0).g - widgetRun.i.f), (h1.l.get(0).g + h1.f), (i5.l.get(0).g - i5.f), f2, i8);
                               widgetRun.e.d(c.k[0]);
                               widgetRun.b.f.e.d(c.k[1]);
                            }
                         }
                      }else if(uDependencyN != null && i6){
                         if (widgetRun.h.c == null || widgetRun.i.c == null) {
                            return;
                         }else {
                            f3 = widgetRun.b.w();
                            i2 = widgetRun.h.l.get(0).g + widgetRun.h.f;
                            i4 = widgetRun.i.l.get(0).g - widgetRun.i.f;
                            if (i8 != i3 && i8) {
                               if (i8 == 1) {
                                  i2 = widgetRun.g((i4 - i2), 0);
                                  i4 = (int)(((float)i2 / f3) + 0x3f000000);
                                  i3 = widgetRun.g(i4, 1);
                                  if (i4 != i3) {
                                     i2 = (int)(((float)i3 * f3) + 0x3f000000);
                                  }
                                  widgetRun.e.d(i2);
                                  widgetRun.b.f.e.d(i3);
                               }
                            }else {
                               i2 = widgetRun.g((i4 - i2), 0);
                               i4 = (int)(((float)i2 * f3) + 0x3f000000);
                               i3 = widgetRun.g(i4, 1);
                               if (i4 != i3) {
                                  i2 = (int)(((float)i3 / f3) + 0x3f000000);
                               }
                               widgetRun.e.d(i2);
                               widgetRun.b.f.e.d(i3);
                            }
                         }
                      }else if(i4 && i7){
                         if (h1.c == null || i5.c == null) {
                            return;
                         }else {
                            f3 = widgetRun.b.w();
                            i2 = h1.l.get(0).g + h1.f;
                            i4 = i5.l.get(0).g - i5.f;
                            if (i8 != i3) {
                               if (i8) {
                                  if (i8 == 1) {
                                  label_02c6 :
                                     i2 = widgetRun.g((i4 - i2), 1);
                                     i4 = (int)(((float)i2 / f3) + 0x3f000000);
                                     i3 = widgetRun.g(i4, 0);
                                     if (i4 != i3) {
                                        i2 = (int)(((float)i3 * f3) + 0x3f000000);
                                     }
                                     widgetRun.e.d(i3);
                                     widgetRun.b.f.e.d(i2);
                                  }
                               }else {
                                  i2 = widgetRun.g((i4 - i2), 1);
                                  i4 = (int)(((float)i2 * f3) + 0x3f000000);
                                  i3 = widgetRun.g(i4, 0);
                                  if (i4 != i3) {
                                     i2 = (int)(((float)i3 / f3) + 0x3f000000);
                                  }
                                  widgetRun.e.d(i3);
                                  widgetRun.b.f.e.d(i2);
                               }
                            }else {
                               goto label_02c6 ;
                            }
                         }
                      }
                   }else {
                      i1 = b.x();
                      if (i1 != i3) {
                         if (i1) {
                            if (i1 != 1) {
                               i1 = 0;
                            label_006c :
                               widgetRun.e.d(i1);
                            }else {
                               b = widgetRun.b;
                               f4 = (float)b.f.e.g;
                               f3 = b.w();
                            }
                         }else {
                            b = widgetRun.b;
                            f4 = (float)b.f.e.g / b.w();
                         label_006a :
                            i1 = (int)(f4 + 0x3f000000);
                            goto label_006c ;
                         }
                      }else {
                         b = widgetRun.b;
                         f4 = (float)b.f.e.g;
                         f3 = b.w();
                      }
                      f4 = f4 * f3;
                      goto label_006a ;
                   }
                }
             }else {
                ConstraintWidget uConstraintW = b.L();
                if (uConstraintW != null) {
                   b = uConstraintW.e.e;
                   if (b.j != null) {
                      widgetRun.e.d((int)(((float)b.g * widgetRun.b.u) + 0x3f000000));
                   }
                }
             }
          }
          b = widgetRun.h;
          if (b.c != null) {
             i = widgetRun.i;
             if (i.c != null) {
                if (b.j != null && (i.j != null && widgetRun.e.j != null)) {
                   return;
                }else if(widgetRun.e.j == null && widgetRun.d == ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT){
                   b = widgetRun.b;
                   if (b.p == null && !b.c0()) {
                      WidgetRun h = widgetRun.h;
                      i1 = widgetRun.h.l.get(0).g + h.f;
                      i2 = widgetRun.i.l.get(0).g + widgetRun.i.f;
                      i3 = i2 - i1;
                      h.d(i1);
                      widgetRun.i.d(i2);
                      widgetRun.e.d(i3);
                      return;
                   }
                }
                if (widgetRun.e.j == null && (widgetRun.d == ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT && (widgetRun.a == 1 && (widgetRun.h.l.size() > 0 && widgetRun.i.l.size() > 0)))) {
                   i = widgetRun.b;
                   p = i.t;
                   i1 = Math.max(i.s, Math.min(((widgetRun.i.l.get(0).g + widgetRun.i.f) - (widgetRun.h.l.get(0).g + widgetRun.h.f)), widgetRun.e.m));
                   if (p > null) {
                      i1 = Math.min(p, i1);
                   }
                   widgetRun.e.d(i1);
                }
             label_03d3 :
                if (widgetRun.e.j == null) {
                   return;
                }else {
                   DependencyNode uDependencyN1 = widgetRun.h.l.get(0);
                   uDependencyN = widgetRun.i.l.get(0);
                   i4 = uDependencyN1.g + widgetRun.h.f;
                   i3 = uDependencyN.g + widgetRun.i.f;
                   float f = widgetRun.b.z();
                   if (uDependencyN1 == uDependencyN) {
                      i4 = uDependencyN1.g;
                      g = uDependencyN.g;
                      f = 0x3f000000;
                   }
                   widgetRun.h.d((int)(((float)i4 + 0x3f000000) + ((float)((g - i4) - widgetRun.e.g) * f)));
                   widgetRun.i.d((widgetRun.h.g + widgetRun.e.g));
                }
             }
          }
          return;
       }else {
          b = widgetRun.b;
          widgetRun.o(p0, b.J, b.L, 0);
          return;
       }
    }
    public void d(){
       ConstraintWidget$DimensionBehaviour mATCH_PARENT;
       ConstraintWidget uConstraintW;
       DependencyNode uDependencyN;
       WidgetRun tb = this.b;
       if (tb.a != null) {
          this.e.d(tb.U());
       }
       if (this.e.j == null) {
          ConstraintWidget$DimensionBehaviour uDimensionBe = this.b.B();
          this.d = uDimensionBe;
          if (uDimensionBe != ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT) {
             mATCH_PARENT = ConstraintWidget$DimensionBehaviour.MATCH_PARENT;
             if (uDimensionBe == mATCH_PARENT) {
                uConstraintW = this.b.L();
                if (uConstraintW == null || (uConstraintW.B() == ConstraintWidget$DimensionBehaviour.FIXED || uConstraintW.B() == mATCH_PARENT)) {
                   this.b(this.h, uConstraintW.e.h, this.b.J.f());
                   this.b(this.i, uConstraintW.e.i, (- this.b.L.f()));
                   this.e.d(((uConstraintW.U() - this.b.J.f()) - this.b.L.f()));
                   return;
                }
             }
             if (this.d == ConstraintWidget$DimensionBehaviour.FIXED) {
                this.e.d(this.b.U());
             }
          }
       }else {
          mATCH_PARENT = ConstraintWidget$DimensionBehaviour.MATCH_PARENT;
          if (this.d == mATCH_PARENT) {
             uConstraintW = this.b.L();
             if (uConstraintW == null || (uConstraintW.B() == ConstraintWidget$DimensionBehaviour.FIXED || uConstraintW.B() == mATCH_PARENT)) {
                this.b(this.h, uConstraintW.e.h, this.b.J.f());
                this.b(this.i, uConstraintW.e.i, (- this.b.L.f()));
                return;
             }
          }
       }
       tb = this.e;
       int i = 0;
       int i1 = 1;
       if (tb.j != null) {
          WidgetRun tb1 = this.b;
          if (tb1.a != null) {
             uConstraintW = tb1.R;
             if (uConstraintW[i].f != null && uConstraintW[i1].f != null) {
                if (tb1.c0()) {
                   this.h.f = this.b.R[i].f();
                   this.i.f = - this.b.R[i1].f();
                }else {
                   uDependencyN = this.h(this.b.R[i]);
                   if (uDependencyN != null) {
                      this.b(this.h, uDependencyN, this.b.R[i].f());
                   }
                   uDependencyN = this.h(this.b.R[i1]);
                   if (uDependencyN != null) {
                      this.b(this.i, uDependencyN, (- this.b.R[i1].f()));
                   }
                   this.h.b = i1;
                   this.i.b = i1;
                }
             }else if(uConstraintW[i].f != null){
                uDependencyN = this.h(uConstraintW[i]);
                if (uDependencyN != null) {
                   this.b(this.h, uDependencyN, this.b.R[i].f());
                   this.b(this.i, this.h, this.e.g);
                }
             }else if(uConstraintW[i1].f != null){
                uDependencyN = this.h(uConstraintW[i1]);
                if (uDependencyN != null) {
                   this.b(this.i, uDependencyN, (- this.b.R[i1].f()));
                   this.b(this.h, this.i, (- this.e.g));
                }
             }else if(!tb1 instanceof a && (tb1.L() != null && this.b.p(ConstraintAnchor$Type.CENTER).f == null)){
                this.b(this.h, this.b.L().e.h, this.b.V());
                this.b(this.i, this.h, this.e.g);
             }
          }else if(this.d == ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT){
             tb1 = this.b;
             ConstraintWidget p = tb1.p;
             if (p != 2) {
                WidgetRun widgetRun = 3;
                if (p == widgetRun) {
                   if (tb1.q == widgetRun) {
                      this.h.a = this;
                      this.i.a = this;
                      p = tb1.f;
                      p.h.a = this;
                      p.i.a = this;
                      tb.a = this;
                      if (tb1.e0()) {
                         this.e.l.add(this.b.f.e);
                         this.b.f.e.k.add(this.e);
                         uConstraintW = this.b.f;
                         uConstraintW.e.a = this;
                         this.e.l.add(uConstraintW.h);
                         this.e.l.add(this.b.f.i);
                         this.b.f.h.k.add(this.e);
                         this.b.f.i.k.add(this.e);
                      }else if(this.b.c0()){
                         this.b.f.e.l.add(this.e);
                         this.e.k.add(this.b.f.e);
                      }else {
                         this.b.f.e.l.add(this.e);
                      }
                   }else {
                      tb1 = tb1.f.e;
                      tb.l.add(tb1);
                      tb1.k.add(this.e);
                      this.b.f.h.k.add(this.e);
                      this.b.f.i.k.add(this.e);
                      tb = this.e;
                      tb.b = i1;
                      tb.k.add(this.h);
                      this.e.k.add(this.i);
                      this.h.l.add(this.e);
                      this.i.l.add(this.e);
                   }
                }
             }else {
                uConstraintW = tb1.L();
                if (uConstraintW != null) {
                   tb = uConstraintW.f.e;
                   this.e.l.add(tb);
                   tb.k.add(this.e);
                   tb = this.e;
                   tb.b = i1;
                   tb.k.add(this.h);
                   this.e.k.add(this.i);
                }
             }
          }
          tb = this.b;
          ConstraintWidget r = tb.R;
          if (r[i].f != null && r[i1].f != null) {
             if (tb.c0()) {
                this.h.f = this.b.R[i].f();
                this.i.f = - this.b.R[i1].f();
             }else {
                this.h(this.b.R[i]).b(this);
                this.h(this.b.R[i1]).b(this);
                this.j = WidgetRun$RunType.CENTER;
             }
          }else if(r[i].f != null){
             uDependencyN = this.h(r[i]);
             if (uDependencyN != null) {
                this.b(this.h, uDependencyN, this.b.R[i].f());
                this.c(this.i, this.h, i1, this.e);
             }
          }else if(r[i1].f != null){
             uDependencyN = this.h(r[i1]);
             if (uDependencyN != null) {
                this.b(this.i, uDependencyN, (- this.b.R[i1].f()));
                this.c(this.h, this.i, -1, this.e);
             }
          }else if(!tb instanceof a && tb.L() != null){
             this.b(this.h, this.b.L().e.h, this.b.V());
             this.c(this.i, this.h, i1, this.e);
          }
       }else {
          goto label_01dc ;
       }
    label_03de :
       return;
    }
    public void e(){
       WidgetRun th = this.h;
       if (th.j != null) {
          this.b.Z0(th.g);
       }
       return;
    }
    public void f(){
       this.c = null;
       this.h.c();
       this.i.c();
       this.e.c();
       this.g = false;
    }
    public void l(){
       this.g = false;
       this.h.c();
       this.h.j = false;
       this.i.c();
       this.i.j = false;
       this.e.j = false;
    }
    public boolean n(){
       if (this.d != ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT) {
          return true;
       }
       if (this.b.p == null) {
          return true;
       }
       return false;
    }
    public final void p(int[] p0,int p1,int p2,int p3,int p4,float p5,int p6){
       p2 = p2 - p1;
       p4 = p4 - p3;
       if (p6 != -1) {
          if (p6) {
             if (p6 == 1) {
                p0[0] = p2;
                p0[1] = (int)(((float)p2 * p5) + 0x3f000000);
             }
          }else {
             p0[0] = (int)(((float)p4 * p5) + 0x3f000000);
             p0[1] = p4;
          }
       }else {
          p1 = (int)(((float)p4 * p5) + 0x3f000000);
          int i = (int)(((float)p2 / p5) + 0x3f000000);
          if (p1 <= p2) {
             p0[0] = p1;
             p0[1] = p4;
          }else if(i <= p4){
             p0[0] = p2;
             p0[1] = i;
          }
       }
       return;
    }
    public String toString(){
       return "HorizontalRun "+this.b.u();
    }
}
