package androidx.transition.b;
import k2.f;
import androidx.transition.Transition;
import java.util.List;
import java.lang.Object;
import androidx.transition.TransitionSet;
import android.view.View;
import java.util.ArrayList;
import android.view.ViewGroup;
import androidx.transition.e;
import java.util.Collection;
import androidx.transition.b$b;
import androidx.transition.Transition$f;
import androidx.transition.b$c;
import android.graphics.Rect;
import androidx.transition.b$d;
import androidx.transition.Transition$e;
import androidx.transition.b$a;

public class b extends f	// class@0009e6
{

    public void b(){
       super();
    }
    public static boolean B(Transition p0){
       boolean b = (f.l(p0.B()) && (!f.l(p0.C()) || !f.l(p0.D())))? true: false;
       return b;
    }
    public Object A(Object p0){
       if (p0 == null) {
          return null;
       }
       TransitionSet transitionSe = new TransitionSet();
       transitionSe.l0(p0);
       return transitionSe;
    }
    public void a(Object p0,View p1){
       if (p0 != null) {
          p0.b(p1);
       }
       return;
    }
    public void b(Object p0,ArrayList p1){
       int i1;
       if (p0 == null) {
          return;
       }
       int i = 0;
       if (p0 instanceof TransitionSet) {
          i1 = p0.o0();
          for (; i < i1; i = i + 1) {
             this.b(p0.n0(i), p1);
          }
       }else if(!b.B(p0) && f.l(p0.E())){
          i1 = p1.size();
          for (; i < i1; i = i + 1) {
             p0.b(p1.get(i));
          }
       }
       return;
    }
    public void c(ViewGroup p0,Object p1){
       e.b(p0, p1);
    }
    public boolean e(Object p0){
       return p0 instanceof Transition;
    }
    public Object g(Object p0){
       p0 = (p0 != null)? p0.m(): null;
       return p0;
    }
    public Object m(Object p0,Object p1,Object p2){
       if (p0 != null && p1 != null) {
          TransitionSet transitionSe = new TransitionSet();
          transitionSe.l0(p0);
          transitionSe.l0(p1);
          transitionSe.t0(1);
          p0 = transitionSe;
       }else if(p0 != null){
          p0 = (p1 != null)? p1: null;
       }
       if (p2 != null) {
          p1 = new TransitionSet();
          if (p0 != null) {
             p1.l0(p0);
          }
          p1.l0(p2);
          return p1;
       }else {
          return p0;
       }
    }
    public Object n(Object p0,Object p1,Object p2){
       TransitionSet transitionSe = new TransitionSet();
       if (p0 != null) {
          transitionSe.l0(p0);
       }
       if (p1 != null) {
          transitionSe.l0(p1);
       }
       if (p2 != null) {
          transitionSe.l0(p2);
       }
       return transitionSe;
    }
    public void p(Object p0,View p1){
       if (p0 != null) {
          p0.U(p1);
       }
       return;
    }
    public void q(Object p0,ArrayList p1,ArrayList p2){
       int i = 0;
       if (p0 instanceof TransitionSet) {
          int i1 = p0.o0();
          for (; i < i1; i = i + 1) {
             this.q(p0.n0(i), p1, p2);
          }
       }else if(!b.B(p0)){
          List list = p0.E();
          if (list.size() == p1.size() && list.containsAll(p1)) {
             View view = (p2 == null)? null: p2.size();
             while (i < view) {
                p0.b(p2.get(i));
                i = i + 1;
             }
             for (int i2 = p1.size() - 1; i2 >= 0; i2--) {
                p0.U(p1.get(i2));
             }
          }
       }
       return;
    }
    public void r(Object p0,View p1,ArrayList p2){
       p0.a(new b$b(this, p1, p2));
    }
    public void t(Object p0,Object p1,ArrayList p2,Object p3,ArrayList p4,Object p5,ArrayList p6){
       b$c uoc = new b$c(this, p1, p2, p3, p4, p5, p6);
       p0.a(v9);
    }
    public void u(Object p0,Rect p1){
       if (p0 != null) {
          p0.a0(new b$d(this, p1));
       }
       return;
    }
    public void v(Object p0,View p1){
       if (p1 != null) {
          Rect rect = new Rect();
          this.k(p1, rect);
          p0.a0(new b$a(this, rect));
       }
       return;
    }
    public void y(Object p0,View p1,ArrayList p2){
       List list = p0.E();
       list.clear();
       int i = p2.size();
       for (int i1 = 0; i1 < i; i1 = i1 + 1) {
          f.d(list, p2.get(i1));
       }
       list.add(p1);
       p2.add(p1);
       this.b(p0, p2);
       return;
    }
    public void z(Object p0,ArrayList p1,ArrayList p2){
       if (p0 != null) {
          p0.E().clear();
          p0.E().addAll(p2);
          this.q(p0, p1, p2);
       }
       return;
    }
}
