package k2.e;
import k2.f;
import android.transition.Transition;
import java.util.List;
import java.lang.Object;
import android.transition.TransitionSet;
import android.view.View;
import java.util.ArrayList;
import android.view.ViewGroup;
import android.transition.TransitionManager;
import java.util.Collection;
import k2.e$b;
import android.transition.Transition$TransitionListener;
import k2.e$c;
import android.graphics.Rect;
import k2.e$d;
import android.transition.Transition$EpicenterCallback;
import k2.e$a;

public class e extends f	// class@00245f
{

    public void e(){
       super();
    }
    public static boolean B(Transition p0){
       boolean b = (f.l(p0.getTargetIds()) && (!f.l(p0.getTargetNames()) || !f.l(p0.getTargetTypes())))? true: false;
       return b;
    }
    public Object A(Object p0){
       if (p0 == null) {
          return null;
       }
       TransitionSet transitionSe = new TransitionSet();
       transitionSe.addTransition(p0);
       return transitionSe;
    }
    public void a(Object p0,View p1){
       if (p0 != null) {
          p0.addTarget(p1);
       }
       return;
    }
    public void b(Object p0,ArrayList p1){
       int transitionCo;
       if (p0 == null) {
          return;
       }
       int i = 0;
       if (p0 instanceof TransitionSet) {
          transitionCo = p0.getTransitionCount();
          for (; i < transitionCo; i = i + 1) {
             this.b(p0.getTransitionAt(i), p1);
          }
       }else if(!e.B(p0) && f.l(p0.getTargets())){
          transitionCo = p1.size();
          for (; i < transitionCo; i = i + 1) {
             p0.addTarget(p1.get(i));
          }
       }
       return;
    }
    public void c(ViewGroup p0,Object p1){
       TransitionManager.beginDelayedTransition(p0, p1);
    }
    public boolean e(Object p0){
       return p0 instanceof Transition;
    }
    public Object g(Object p0){
       p0 = (p0 != null)? p0.clone(): null;
       return p0;
    }
    public Object m(Object p0,Object p1,Object p2){
       if (p0 != null && p1 != null) {
          p0 = new TransitionSet().addTransition(p0).addTransition(p1).setOrdering(1);
       }else if(p0 != null){
          p0 = (p1 != null)? p1: null;
       }
       if (p2 != null) {
          p1 = new TransitionSet();
          if (p0 != null) {
             p1.addTransition(p0);
          }
          p1.addTransition(p2);
          return p1;
       }else {
          return p0;
       }
    }
    public Object n(Object p0,Object p1,Object p2){
       TransitionSet transitionSe = new TransitionSet();
       if (p0 != null) {
          transitionSe.addTransition(p0);
       }
       if (p1 != null) {
          transitionSe.addTransition(p1);
       }
       if (p2 != null) {
          transitionSe.addTransition(p2);
       }
       return transitionSe;
    }
    public void p(Object p0,View p1){
       if (p0 != null) {
          p0.removeTarget(p1);
       }
       return;
    }
    public void q(Object p0,ArrayList p1,ArrayList p2){
       int i = 0;
       if (p0 instanceof TransitionSet) {
          int transitionCo = p0.getTransitionCount();
          for (; i < transitionCo; i = i + 1) {
             this.q(p0.getTransitionAt(i), p1, p2);
          }
       }else if(!e.B(p0)){
          List tars = p0.getTargets();
          if (tars != null && (tars.size() == p1.size() && tars.containsAll(p1))) {
             View view = (p2 == null)? null: p2.size();
             while (i < view) {
                p0.addTarget(p2.get(i));
                i = i + 1;
             }
             for (int i1 = p1.size() - 1; i1 >= 0; i1--) {
                p0.removeTarget(p1.get(i1));
             }
          }
       }
       return;
    }
    public void r(Object p0,View p1,ArrayList p2){
       p0.addListener(new e$b(this, p1, p2));
    }
    public void t(Object p0,Object p1,ArrayList p2,Object p3,ArrayList p4,Object p5,ArrayList p6){
       e$c uoc = new e$c(this, p1, p2, p3, p4, p5, p6);
       p0.addListener(v9);
    }
    public void u(Object p0,Rect p1){
       if (p0 != null) {
          p0.setEpicenterCallback(new e$d(this, p1));
       }
       return;
    }
    public void v(Object p0,View p1){
       if (p1 != null) {
          Rect rect = new Rect();
          this.k(p1, rect);
          p0.setEpicenterCallback(new e$a(this, rect));
       }
       return;
    }
    public void y(Object p0,View p1,ArrayList p2){
       List tars = p0.getTargets();
       tars.clear();
       int i = p2.size();
       for (int i1 = 0; i1 < i; i1 = i1 + 1) {
          f.d(tars, p2.get(i1));
       }
       tars.add(p1);
       p2.add(p1);
       this.b(p0, p2);
       return;
    }
    public void z(Object p0,ArrayList p1,ArrayList p2){
       if (p0 != null) {
          p0.getTargets().clear();
          p0.getTargets().addAll(p2);
          this.q(p0, p1, p2);
       }
       return;
    }
}
