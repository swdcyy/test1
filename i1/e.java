package i1.e;
import androidx.constraintlayout.solver.widgets.d;
import java.lang.Object;
import java.util.ArrayList;
import i1.b$a;
import androidx.constraintlayout.solver.widgets.analyzer.DependencyNode;
import i1.i;
import androidx.constraintlayout.solver.widgets.analyzer.WidgetRun;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import java.util.Iterator;
import java.util.List;
import i1.d;
import androidx.constraintlayout.solver.widgets.analyzer.d;
import h1.c;
import androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour;
import androidx.constraintlayout.solver.widgets.ConstraintAnchor;
import androidx.constraintlayout.solver.widgets.analyzer.a;
import androidx.constraintlayout.solver.widgets.analyzer.c;
import androidx.constraintlayout.solver.widgets.f;
import i1.h;
import i1.c;
import java.util.HashSet;
import h1.b;
import androidx.constraintlayout.solver.widgets.analyzer.b;
import java.util.Collection;
import java.lang.Math;
import i1.b$b;

public class e	// class@00215c
{
    public d a;
    public boolean b;
    public boolean c;
    public d d;
    public ArrayList e;
    public ArrayList f;
    public b$b g;
    public b$a h;
    public ArrayList i;

    public void e(d p0){
       super();
       this.b = true;
       this.c = true;
       this.e = new ArrayList();
       this.f = new ArrayList();
       this.g = null;
       this.h = new b$a();
       this.i = new ArrayList();
       this.a = p0;
       this.d = p0;
    }
    public final void a(DependencyNode p0,int p1,int p2,DependencyNode p3,ArrayList p4,i p5){
       d uod;
       Iterator iterator1;
       Object obj;
       p0 = p0.d;
       if (p0.c == null) {
          e ta = this.a;
          if (p0 != ta.e && p0 != ta.f) {
             if (p5 == null) {
                p5 = new i(p0, p2);
                p4.add(p5);
             }
             p0.c = p5;
             p5.a(p0);
             Iterator iterator = p0.h.k.iterator();
             while (iterator.hasNext()) {
                uod = iterator.next();
                if (uod instanceof DependencyNode) {
                   this.a(uod, p1, 0, p3, p4, p5);
                }
             }
             iterator = p0.i.k.iterator();
             while (iterator.hasNext()) {
                uod = iterator.next();
                if (uod instanceof DependencyNode) {
                   this.a(uod, p1, 1, p3, p4, p5);
                }
             }
             iterator = 1;
             if (p1 == iterator && p0 instanceof d) {
                iterator1 = p0.k.k.iterator();
                while (iterator1.hasNext()) {
                   uod = iterator1.next();
                   if (uod instanceof DependencyNode) {
                      this.a(uod, p1, 2, p3, p4, p5);
                   }
                }
             }
             iterator1 = p0.h.l.iterator();
             while (iterator1.hasNext()) {
                obj = iterator1.next();
                if (obj == p3) {
                   p5.b = iterator;
                }
                this.a(obj, p1, 0, p3, p4, p5);
             }
             iterator1 = p0.i.l.iterator();
             while (iterator1.hasNext()) {
                obj = iterator1.next();
                if (obj == p3) {
                   p5.b = iterator;
                }
                this.a(obj, p1, 1, p3, p4, p5);
             }
             if (p1 == iterator && p0 instanceof d) {
                Iterator iterator2 = p0.k.l.iterator();
                while (iterator2.hasNext()) {
                   this.a(iterator2.next(), p1, 2, p3, p4, p5);
                }
             }
          }
       }
       return;
    }
    public final boolean b(d p0){
       ConstraintWidget$DimensionBehaviour mATCH_CONSTR;
       ConstraintWidget$DimensionBehaviour uDimensionBe1;
       float f1;
       float f2;
       ConstraintWidget u2;
       c uoc = p0;
       Iterator iterator = uoc.N0.iterator();
       int i = 0;
       while (iterator.hasNext()) {
          ConstraintWidget uConstraintW = iterator.next();
          ConstraintWidget u = uConstraintW.U;
          object oobject = u[i];
          object oobject1 = u[1];
          if (uConstraintW.T() == 8) {
             uConstraintW.a = true;
          }else {
             ConstraintWidget$DimensionBehaviour uDimensionBe = 0x3f800000;
             int i1 = 2;
             if (uConstraintW.u - uDimensionBe < 0 && oobject == ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT) {
                uConstraintW.p = i1;
             }
             if (uConstraintW.x - uDimensionBe < 0 && oobject1 == ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT) {
                uConstraintW.q = i1;
             }
             int i2 = 3;
             if (uConstraintW.w() - null > 0) {
                mATCH_CONSTR = ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT;
                if (oobject == mATCH_CONSTR && (oobject1 == ConstraintWidget$DimensionBehaviour.WRAP_CONTENT || oobject1 == ConstraintWidget$DimensionBehaviour.FIXED)) {
                   uConstraintW.p = i2;
                }else if(oobject1 == mATCH_CONSTR && (oobject == ConstraintWidget$DimensionBehaviour.WRAP_CONTENT || oobject == ConstraintWidget$DimensionBehaviour.FIXED)){
                   uConstraintW.q = i2;
                }else if(oobject == mATCH_CONSTR && oobject1 == mATCH_CONSTR){
                   if (uConstraintW.p == null) {
                      uConstraintW.p = i2;
                   }
                   if (uConstraintW.q == null) {
                      uConstraintW.q = i2;
                   }
                }
             }
             mATCH_CONSTR = ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT;
             if (oobject == mATCH_CONSTR && (uConstraintW.p == 1 && (uConstraintW.J.f == null || uConstraintW.L.f == null))) {
                oobject = ConstraintWidget$DimensionBehaviour.WRAP_CONTENT;
             }
          label_008e :
             object oobject2 = oobject;
             if (oobject1 == mATCH_CONSTR && (uConstraintW.q == 1 && (uConstraintW.K.f == null || uConstraintW.M.f == null))) {
                oobject1 = ConstraintWidget$DimensionBehaviour.WRAP_CONTENT;
             }
          label_00a3 :
             object oobject3 = oobject1;
             u = uConstraintW.e;
             u.d = oobject2;
             ConstraintWidget p = uConstraintW.p;
             u.a = p;
             u = uConstraintW.f;
             u.d = oobject3;
             ConstraintWidget q = uConstraintW.q;
             u.a = q;
             ConstraintWidget$DimensionBehaviour mATCH_PARENT = ConstraintWidget$DimensionBehaviour.MATCH_PARENT;
             if (oobject2 != mATCH_PARENT && (oobject2 == ConstraintWidget$DimensionBehaviour.FIXED || (oobject2 == ConstraintWidget$DimensionBehaviour.WRAP_CONTENT && (oobject3 != mATCH_PARENT && (oobject3 == ConstraintWidget$DimensionBehaviour.FIXED || oobject3 == ConstraintWidget$DimensionBehaviour.WRAP_CONTENT))))) {
                i = uConstraintW.U();
                if (oobject2 == mATCH_PARENT) {
                   i = p0.U() - uConstraintW.J.g;
                   i = i - uConstraintW.L.g;
                   i1 = i;
                   mATCH_CONSTR = ConstraintWidget$DimensionBehaviour.FIXED;
                }else {
                   i1 = i;
                   object oobject4 = oobject2;
                }
                i = uConstraintW.y();
                if (oobject3 == mATCH_PARENT) {
                   i = p0.y() - uConstraintW.K.g;
                   i = i - uConstraintW.M.g;
                   i2 = i;
                   uDimensionBe1 = ConstraintWidget$DimensionBehaviour.FIXED;
                }else {
                   i2 = i;
                   uDimensionBe1 = oobject3;
                }
                this.l(uConstraintW, mATCH_CONSTR, i1, uDimensionBe1, i2);
                uConstraintW.e.e.d(uConstraintW.U());
                uConstraintW.f.e.d(uConstraintW.y());
                uConstraintW.a = true;
             }else {
                float f = 0x3f000000;
                if (oobject2 == mATCH_CONSTR) {
                   ConstraintWidget$DimensionBehaviour wRAP_CONTENT = ConstraintWidget$DimensionBehaviour.WRAP_CONTENT;
                   if (oobject3 == wRAP_CONTENT || oobject3 == ConstraintWidget$DimensionBehaviour.FIXED) {
                      if (p == i2) {
                         if (oobject3 == wRAP_CONTENT) {
                            this.l(uConstraintW, wRAP_CONTENT, 0, wRAP_CONTENT, 0);
                         }
                         i2 = uConstraintW.y();
                         f1 = (float)i2 * uConstraintW.Y;
                         f1 = f1 + f;
                         uDimensionBe1 = ConstraintWidget$DimensionBehaviour.FIXED;
                         this.l(uConstraintW, uDimensionBe1, (int)f1, uDimensionBe1, i2);
                         uConstraintW.e.e.d(uConstraintW.U());
                         uConstraintW.f.e.d(uConstraintW.y());
                         uConstraintW.a = true;
                      }else if(p == 1){
                         this.l(uConstraintW, wRAP_CONTENT, 0, oobject3, 0);
                         uConstraintW.e.e.m = uConstraintW.U();
                      }else if(p == i1){
                         ConstraintWidget u1 = uoc.U;
                         ConstraintWidget$DimensionBehaviour fIXED = ConstraintWidget$DimensionBehaviour.FIXED;
                         if (u1[i] == fIXED || u1[i] == mATCH_PARENT) {
                            f1 = uConstraintW.u * (float)p0.U();
                            f1 = f1 + f;
                            this.l(uConstraintW, fIXED, (int)f1, oobject3, uConstraintW.y());
                            uConstraintW.e.e.d(uConstraintW.U());
                            uConstraintW.f.e.d(uConstraintW.y());
                            uConstraintW.a = true;
                         }
                      }else {
                         u2 = uConstraintW.R;
                         if (u2[i].f == null || u2[1].f == null) {
                            this.l(uConstraintW, wRAP_CONTENT, 0, oobject3, 0);
                            uConstraintW.e.e.d(uConstraintW.U());
                            uConstraintW.f.e.d(uConstraintW.y());
                            uConstraintW.a = true;
                         }
                      }
                   }
                }
                if (oobject3 == mATCH_CONSTR) {
                   uDimensionBe = ConstraintWidget$DimensionBehaviour.WRAP_CONTENT;
                   if (oobject2 == uDimensionBe || oobject2 == ConstraintWidget$DimensionBehaviour.FIXED) {
                      if (q == i2) {
                         if (oobject2 == uDimensionBe) {
                            this.l(uConstraintW, uDimensionBe, 0, uDimensionBe, 0);
                         }
                         i1 = uConstraintW.U();
                         ConstraintWidget y = uConstraintW.Y;
                         if (uConstraintW.x() == -1) {
                            y = 0x3f800000 / y;
                         }
                         f2 = (float)i1 * y;
                         f2 = f2 + f;
                         i2 = (int)f2;
                         uDimensionBe1 = ConstraintWidget$DimensionBehaviour.FIXED;
                         this.l(uConstraintW, uDimensionBe1, i1, uDimensionBe1, i2);
                         uConstraintW.e.e.d(uConstraintW.U());
                         uConstraintW.f.e.d(uConstraintW.y());
                         uConstraintW.a = true;
                      }else if(q == 1){
                         this.l(uConstraintW, oobject2, 0, uDimensionBe, 0);
                         uConstraintW.f.e.m = uConstraintW.y();
                      }else if(q == 2){
                         u2 = uoc.U;
                         uDimensionBe = ConstraintWidget$DimensionBehaviour.FIXED;
                         if (u2[1] == uDimensionBe || u2[1] == mATCH_PARENT) {
                            f1 = uConstraintW.x * (float)p0.y();
                            f1 = f1 + f;
                            this.l(uConstraintW, oobject2, uConstraintW.U(), uDimensionBe, (int)f1);
                            uConstraintW.e.e.d(uConstraintW.U());
                            uConstraintW.f.e.d(uConstraintW.y());
                            uConstraintW.a = true;
                         }
                      }else {
                         u = uConstraintW.R;
                         if (u[2].f == null || u[i2].f == null) {
                            this.l(uConstraintW, uDimensionBe, 0, oobject3, 0);
                            uConstraintW.e.e.d(uConstraintW.U());
                            uConstraintW.f.e.d(uConstraintW.y());
                            uConstraintW.a = true;
                         }
                      }
                   }
                }
                if (oobject2 == mATCH_CONSTR && oobject3 == mATCH_CONSTR) {
                   if (p == 1 || q == 1) {
                      uDimensionBe1 = ConstraintWidget$DimensionBehaviour.WRAP_CONTENT;
                      this.l(uConstraintW, uDimensionBe1, 0, uDimensionBe1, 0);
                      uConstraintW.e.e.m = uConstraintW.U();
                      uConstraintW.f.e.m = uConstraintW.y();
                   }else {
                      u = 2;
                      if (q == u && p == u) {
                         u = uoc.U;
                         uDimensionBe1 = ConstraintWidget$DimensionBehaviour.FIXED;
                         if (u[i] == uDimensionBe1 || (u[i] == uDimensionBe1 && (u[1] == uDimensionBe1 || u[1] == uDimensionBe1))) {
                            f1 = uConstraintW.u * (float)p0.U();
                            f1 = f1 + f;
                            i1 = (int)f1;
                            f2 = uConstraintW.x * (float)p0.y();
                            f2 = f2 + f;
                            i2 = (int)f2;
                            this.l(uConstraintW, uDimensionBe1, i1, uDimensionBe1, i2);
                            uConstraintW.e.e.d(uConstraintW.U());
                            uConstraintW.f.e.d(uConstraintW.y());
                            uConstraintW.a = true;
                         }
                      }
                   }
                }
             }
          }
       }
       return i;
    }
    public void c(){
       this.d(this.e);
       this.i.clear();
       i.h = 0;
       this.i(this.a.e, 0, this.i);
       this.i(this.a.f, 1, this.i);
       this.b = false;
    }
    public void d(ArrayList p0){
       p0.clear();
       this.d.e.f();
       this.d.f.f();
       p0.add(this.d.e);
       p0.add(this.d.f);
       Iterator iterator = this.d.N0.iterator();
       HashSet hashSet = null;
       while (iterator.hasNext()) {
          ConstraintWidget uConstraintW = iterator.next();
          if (uConstraintW instanceof f) {
             p0.add(new h(uConstraintW));
          }else if(uConstraintW.c0()){
             if (uConstraintW.c == null) {
                uConstraintW.c = new c(uConstraintW, 0);
             }
             if (hashSet == null) {
                hashSet = new HashSet();
             }
             hashSet.add(uConstraintW.c);
          }else {
             p0.add(uConstraintW.e);
          }
          if (uConstraintW.e0()) {
             if (uConstraintW.d == null) {
                uConstraintW.d = new c(uConstraintW, 1);
             }
             if (hashSet == null) {
                hashSet = new HashSet();
             }
             hashSet.add(uConstraintW.d);
          }else {
             p0.add(uConstraintW.f);
          }
          if (uConstraintW instanceof b) {
             p0.add(new b(uConstraintW));
          }
       }
       if (hashSet != null) {
          p0.addAll(hashSet);
       }
       iterator = p0.iterator();
       while (iterator.hasNext()) {
          iterator.next().f();
       }
       Iterator iterator1 = p0.iterator();
       while (iterator1.hasNext()) {
          WidgetRun widgetRun = iterator1.next();
          if (widgetRun.b == this.d) {
             continue ;
          }
          widgetRun.d();
       }
       return;
    }
    public final int e(d p0,int p1){
       int i = this.i.size();
       long l = 0;
       for (int i1 = 0; i1 < i; i1 = i1 + 1) {
          l = Math.max(l, this.i.get(i1).b(p0, p1));
       }
       return (int)l;
    }
    public boolean f(boolean p0){
       e ta2;
       WidgetRun widgetRun;
       int i = 1;
       int i1 = p0 & i;
       if (this.b != null || this.c != null) {
          Iterator iterator = this.a.N0.iterator();
          while (iterator.hasNext()) {
             ConstraintWidget uConstraintW = iterator.next();
             uConstraintW.o();
             uConstraintW.a = false;
             uConstraintW.e.l();
             uConstraintW.f.l();
          }
          this.a.o();
          e ta = this.a;
          ta.a = false;
          ta.e.l();
          this.a.f.l();
          this.c = false;
       }
       this.b(this.d);
       this.a.Z0(false);
       this.a.a1(false);
       ConstraintWidget$DimensionBehaviour uDimensionBe = this.a.v(false);
       ConstraintWidget$DimensionBehaviour uDimensionBe1 = this.a.v(i);
       if (this.b != null) {
          this.c();
       }
       int i2 = this.a.V();
       int i3 = this.a.W();
       this.a.e.h.d(i2);
       this.a.f.h.d(i3);
       this.m();
       ConstraintWidget$DimensionBehaviour wRAP_CONTENT = ConstraintWidget$DimensionBehaviour.WRAP_CONTENT;
       if (uDimensionBe == wRAP_CONTENT || uDimensionBe1 == wRAP_CONTENT) {
          if (i1) {
             Iterator iterator1 = this.e.iterator();
             while (true) {
                if (iterator1.hasNext()) {
                   if (!iterator1.next().n()) {
                      i1 = 0;
                   }
                }
             }
             this.a.D0(uDimensionBe);
             this.a.U0(uDimensionBe1);
             return i;
          }
          if (i1 && uDimensionBe == ConstraintWidget$DimensionBehaviour.WRAP_CONTENT) {
             this.a.D0(ConstraintWidget$DimensionBehaviour.FIXED);
             e ta1 = this.a;
             ta1.Y0(this.e(ta1, false));
             ta1 = this.a;
             ta1.e.e.d(ta1.U());
          }
          if (i1 && uDimensionBe1 == ConstraintWidget$DimensionBehaviour.WRAP_CONTENT) {
             this.a.U0(ConstraintWidget$DimensionBehaviour.FIXED);
             ta2 = this.a;
             ta2.z0(this.e(ta2, i));
             ta2 = this.a;
             ta2.f.e.d(ta2.y());
          }
       }
    label_00f0 :
       ta2 = this.a;
       ConstraintWidget u = ta2.U;
       ConstraintWidget$DimensionBehaviour fIXED = ConstraintWidget$DimensionBehaviour.FIXED;
       if (u[0] == fIXED || u[0] == ConstraintWidget$DimensionBehaviour.MATCH_PARENT) {
          i1 = ta2.U() + i2;
          this.a.e.i.d(i1);
          this.a.e.e.d((i1 - i2));
          this.m();
          ta2 = this.a;
          ConstraintWidget u1 = ta2.U;
          if (u1[i] == fIXED || u1[i] == ConstraintWidget$DimensionBehaviour.MATCH_PARENT) {
             i1 = ta2.y() + i3;
             this.a.f.i.d(i1);
             this.a.f.e.d((i1 - i3));
          }
          this.m();
          ta2 = 1;
       }else {
          ta2 = null;
       }
       Iterator iterator2 = this.e.iterator();
       while (iterator2.hasNext()) {
          widgetRun = iterator2.next();
          if (widgetRun.b == this.a && widgetRun.g == null) {
             continue ;
          }
          widgetRun.e();
       }
       iterator2 = this.e.iterator();
       while (iterator2.hasNext()) {
          widgetRun = iterator2.next();
          if (!ta2 && (widgetRun.b != this.a && (widgetRun.h.j == null || (widgetRun.i.j == null && (!widgetRun instanceof h || (widgetRun.e.j == null && (!widgetRun instanceof c && !widgetRun instanceof h))))))) {
             i = false;
             goto label_01a6 ;
          }else {
             continue ;
          }
       }
    }
    public boolean g(boolean p0){
       if (this.b != null) {
          Iterator iterator = this.a.N0.iterator();
          while (iterator.hasNext()) {
             ConstraintWidget uConstraintW = iterator.next();
             uConstraintW.o();
             uConstraintW.a = false;
             ConstraintWidget e = uConstraintW.e;
             e.e.j = false;
             e.g = false;
             e.l();
             uConstraintW = uConstraintW.f;
             uConstraintW.e.j = false;
             uConstraintW.g = false;
             uConstraintW.l();
          }
          this.a.o();
          e ta = this.a;
          ta.a = false;
          ConstraintWidget e1 = ta.e;
          e1.e.j = false;
          e1.g = false;
          e1.l();
          e1 = this.a.f;
          e1.e.j = false;
          e1.g = false;
          e1.l();
          this.c();
       }
       this.b(this.d);
       this.a.Z0(false);
       this.a.a1(false);
       this.a.e.h.d(false);
       this.a.f.h.d(false);
       return true;
    }
    public boolean h(boolean p0,int p1){
       e ta;
       WidgetRun widgetRun1;
       int i = 1;
       int i1 = p0 & i;
       ConstraintWidget$DimensionBehaviour uDimensionBe = this.a.v(0);
       ConstraintWidget$DimensionBehaviour uDimensionBe1 = this.a.v(i);
       int i2 = this.a.V();
       int i3 = this.a.W();
       if (i1) {
          ConstraintWidget$DimensionBehaviour wRAP_CONTENT = ConstraintWidget$DimensionBehaviour.WRAP_CONTENT;
          if (uDimensionBe == wRAP_CONTENT || uDimensionBe1 == wRAP_CONTENT) {
             Iterator iterator = this.e.iterator();
             while (true) {
                if (iterator.hasNext()) {
                   WidgetRun widgetRun = iterator.next();
                   if (widgetRun.f == p1 && !widgetRun.n()) {
                      i1 = 0;
                   }
                }
                if (!p1) {
                   if (i1 && uDimensionBe == ConstraintWidget$DimensionBehaviour.WRAP_CONTENT) {
                      this.a.D0(ConstraintWidget$DimensionBehaviour.FIXED);
                      ta = this.a;
                      ta.Y0(this.e(ta, 0));
                      ta = this.a;
                      ta.e.e.d(ta.U());
                   }
                }else if(i1 && uDimensionBe1 == ConstraintWidget$DimensionBehaviour.WRAP_CONTENT){
                   this.a.U0(ConstraintWidget$DimensionBehaviour.FIXED);
                   ta = this.a;
                   ta.z0(this.e(ta, i));
                   ta = this.a;
                   ta.f.e.d(ta.y());
                }
             }
             this.a.D0(uDimensionBe);
             this.a.U0(uDimensionBe1);
             return i;
          }
       }
    label_0089 :
       if (!p1) {
          ta = this.a;
          ConstraintWidget u = ta.U;
          if (u[0] == ConstraintWidget$DimensionBehaviour.FIXED || u[0] == ConstraintWidget$DimensionBehaviour.MATCH_PARENT) {
             i1 = ta.U() + i2;
             this.a.e.i.d(i1);
             this.a.e.e.d((i1 - i2));
          label_00df :
             ta = 1;
          label_00e0 :
             this.m();
             Iterator iterator1 = this.e.iterator();
             while (iterator1.hasNext()) {
                widgetRun1 = iterator1.next();
                if (widgetRun1.f != p1 || (widgetRun1.b == this.a && widgetRun1.g == null)) {
                   continue ;
                }
                widgetRun1.e();
             }
             iterator1 = this.e.iterator();
             while (iterator1.hasNext()) {
                widgetRun1 = iterator1.next();
                if (widgetRun1.f != p1 || (!ta && (widgetRun1.b != this.a && (widgetRun1.h.j == null || (widgetRun1.i.j == null || (!widgetRun1 instanceof c && widgetRun1.e.j == null)))))) {
                   i = false;
                   goto label_0143 ;
                }else {
                   continue ;
                }
             }
          }
       }else {
          ta = this.a;
          ConstraintWidget u1 = ta.U;
          if (u1[i] == ConstraintWidget$DimensionBehaviour.FIXED || u1[i] == ConstraintWidget$DimensionBehaviour.MATCH_PARENT) {
             i1 = ta.y() + i3;
             this.a.f.i.d(i1);
             this.a.f.e.d((i1 - i3));
             goto label_00df ;
          }
       }
       ta = null;
       goto label_00e0 ;
    }
    public final void i(WidgetRun p0,int p1,ArrayList p2){
       d uod;
       Iterator iterator = p0.h.k.iterator();
       while (iterator.hasNext()) {
          uod = iterator.next();
          if (uod instanceof DependencyNode) {
             this.a(uod, p1, 0, p0.i, p2, null);
          }else if(uod instanceof WidgetRun){
             this.a(uod.h, p1, 0, p0.i, p2, null);
          }
       }
       iterator = p0.i.k.iterator();
       while (iterator.hasNext()) {
          uod = iterator.next();
          if (uod instanceof DependencyNode) {
             this.a(uod, p1, 1, p0.h, p2, null);
          }else if(uod instanceof WidgetRun){
             this.a(uod.i, p1, 1, p0.h, p2, null);
          }
       }
       if (p1 == 1) {
          Iterator iterator1 = p0.k.k.iterator();
          while (iterator1.hasNext()) {
             d uod1 = iterator1.next();
             if (uod1 instanceof DependencyNode) {
                this.a(uod1, p1, 2, null, p2, null);
             }
          }
       }
       return;
    }
    public void j(){
       this.b = true;
    }
    public void k(){
       this.c = true;
    }
    public final void l(ConstraintWidget p0,ConstraintWidget$DimensionBehaviour p1,int p2,ConstraintWidget$DimensionBehaviour p3,int p4){
       e th = this.h;
       th.a = p1;
       th.b = p3;
       th.c = p2;
       th.d = p4;
       this.g.b(p0, th);
       p0.Y0(this.h.e);
       p0.z0(this.h.f);
       p0.y0(this.h.h);
       p0.o0(this.h.g);
    }
    public void m(){
       Iterator iterator = this.a.N0.iterator();
       while (iterator.hasNext()) {
          ConstraintWidget uConstraintW = iterator.next();
          if (uConstraintW.a != null) {
             continue ;
          }else {
             ConstraintWidget u = uConstraintW.U;
             int i = 0;
             object oobject = u[i];
             object oobject1 = u[1];
             u = uConstraintW.p;
             ConstraintWidget q = uConstraintW.q;
             ConstraintWidget$DimensionBehaviour wRAP_CONTENT = ConstraintWidget$DimensionBehaviour.WRAP_CONTENT;
             u = (oobject == wRAP_CONTENT || (oobject == ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT && u == 1))? 1: null;
             if (oobject1 == wRAP_CONTENT || (oobject1 == ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT && q == 1)) {
                i = 1;
             }
             WidgetRun e = uConstraintW.e.e;
             DependencyNode j = e.j;
             WidgetRun e1 = uConstraintW.f.e;
             DependencyNode j1 = e1.j;
             if (j != null && j1 != null) {
                wRAP_CONTENT = ConstraintWidget$DimensionBehaviour.FIXED;
                this.l(uConstraintW, wRAP_CONTENT, e.g, wRAP_CONTENT, e1.g);
                uConstraintW.a = true;
             }else if(j != null && i != null){
                this.l(uConstraintW, ConstraintWidget$DimensionBehaviour.FIXED, e.g, wRAP_CONTENT, e1.g);
                if (oobject1 == ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT) {
                   uConstraintW.f.e.m = uConstraintW.y();
                }else {
                   uConstraintW.f.e.d(uConstraintW.y());
                   uConstraintW.a = true;
                }
             }else if(j1 != null && u){
                this.l(uConstraintW, wRAP_CONTENT, e.g, ConstraintWidget$DimensionBehaviour.FIXED, e1.g);
                if (oobject == ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT) {
                   uConstraintW.e.e.m = uConstraintW.U();
                }else {
                   uConstraintW.e.e.d(uConstraintW.U());
                   uConstraintW.a = true;
                }
             }
             if (uConstraintW.a != null) {
                d l = uConstraintW.f.l;
                if (l != null) {
                   l.d(uConstraintW.q());
                }
             }
          }
       }
       return;
    }
    public void n(b$b p0){
       this.g = p0;
    }
}
