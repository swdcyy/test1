package androidx.transition.TransitionSet;
import androidx.transition.Transition;
import java.util.ArrayList;
import android.content.Context;
import android.util.AttributeSet;
import androidx.transition.c;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import org.xmlpull.v1.XmlPullParser;
import java.lang.String;
import o1.g;
import android.view.View;
import java.lang.Object;
import androidx.transition.Transition$f;
import androidx.transition.TransitionSet$a;
import java.util.Iterator;
import androidx.transition.Transition$e;
import android.animation.TimeInterpolator;
import androidx.transition.PathMotion;
import e3.n;
import android.view.ViewGroup;
import e3.o;
import java.lang.StringBuilder;
import e3.p;
import android.util.AndroidRuntimeException;
import androidx.transition.TransitionSet$b;

public class TransitionSet extends Transition	// class@0009d9
{
    public ArrayList L;
    public boolean M;
    public int N;
    public boolean O;
    public int P;

    public void TransitionSet(){
       super();
       this.L = new ArrayList();
       this.M = true;
       this.O = false;
       this.P = 0;
    }
    public void TransitionSet(Context p0,AttributeSet p1){
       super(p0, p1);
       this.L = new ArrayList();
       this.M = true;
       this.O = false;
       this.P = 0;
       XmlResourceParser xmlResourceP = p0.obtainStyledAttributes(p1, c.i);
       this.t0(g.g(xmlResourceP, p1, "transitionOrdering", false, false));
       xmlResourceP.recycle();
    }
    public void R(View p0){
       super.R(p0);
       int i = this.L.size();
       for (int i1 = 0; i1 < i; i1 = i1 + 1) {
          this.L.get(i1).R(p0);
       }
       return;
    }
    public Transition T(Transition$f p0){
       return this.p0(p0);
    }
    public Transition U(View p0){
       return this.q0(p0);
    }
    public void V(View p0){
       super.V(p0);
       int i = this.L.size();
       for (int i1 = 0; i1 < i; i1 = i1 + 1) {
          this.L.get(i1).V(p0);
       }
       return;
    }
    public void X(){
       if (this.L.isEmpty()) {
          this.h0();
          this.p();
          return;
       }else {
          this.w0();
          if (this.M == null) {
             for (int i = 1; i < this.L.size(); i = i + 1) {
                int i1 = i - 1;
                Transition transition = this.L.get(i1);
                transition.a(new TransitionSet$a(this, this.L.get(i)));
             }
             Transition transition1 = this.L.get(0);
             if (transition1 != null) {
                transition1.X();
             }
          }else {
             Iterator iterator = this.L.iterator();
             while (iterator.hasNext()) {
                iterator.next().X();
             }
          }
          return;
       }
    }
    public void Y(boolean p0){
       super.Y(p0);
       int i = this.L.size();
       for (int i1 = 0; i1 < i; i1 = i1 + 1) {
          this.L.get(i1).Y(p0);
       }
       return;
    }
    public Transition Z(long p0){
       this.r0(p0);
       return this;
    }
    public Transition a(Transition$f p0){
       return this.j0(p0);
    }
    public void a0(Transition$e p0){
       super.a0(p0);
       this.P = this.P | 0x08;
       int i = this.L.size();
       for (int i1 = 0; i1 < i; i1 = i1 + 1) {
          this.L.get(i1).a0(p0);
       }
       return;
    }
    public Transition b(View p0){
       return this.k0(p0);
    }
    public Transition b0(TimeInterpolator p0){
       return this.s0(p0);
    }
    public Object clone(){
       return this.m();
    }
    public void d0(PathMotion p0){
       super.d0(p0);
       this.P = this.P | 0x04;
       if (this.L != null) {
          for (int i = 0; i < this.L.size(); i = i + 1) {
             this.L.get(i).d0(p0);
          }
       }
       return;
    }
    public void e0(n p0){
       super.e0(p0);
       this.P = this.P | 0x02;
       int i = this.L.size();
       for (int i1 = 0; i1 < i; i1 = i1 + 1) {
          this.L.get(i1).e0(p0);
       }
       return;
    }
    public Transition f0(ViewGroup p0){
       this.u0(p0);
       return this;
    }
    public void g(o p0){
       if (this.J(p0.b)) {
          Iterator iterator = this.L.iterator();
          while (iterator.hasNext()) {
             Transition transition = iterator.next();
             if (transition.J(p0.b)) {
                transition.g(p0);
                p0.c.add(transition);
             }
          }
       }
       return;
    }
    public Transition g0(long p0){
       return this.v0(p0);
    }
    public void i(o p0){
       super.i(p0);
       int i = this.L.size();
       for (int i1 = 0; i1 < i; i1 = i1 + 1) {
          this.L.get(i1).i(p0);
       }
       return;
    }
    public String i0(String p0){
       String str = super.i0(p0);
       for (int i = 0; i < this.L.size(); i = i + 1) {
          str = str+"\n"+this.L.get(i).i0(p0+"  ");
       }
       return str;
    }
    public void j(o p0){
       if (this.J(p0.b)) {
          Iterator iterator = this.L.iterator();
          while (iterator.hasNext()) {
             Transition transition = iterator.next();
             if (transition.J(p0.b)) {
                transition.j(p0);
                p0.c.add(transition);
             }
          }
       }
       return;
    }
    public TransitionSet j0(Transition$f p0){
       super.a(p0);
       return this;
    }
    public TransitionSet k0(View p0){
       for (int i = 0; i < this.L.size(); i = i + 1) {
          this.L.get(i).b(p0);
       }
       super.b(p0);
       return this;
    }
    public TransitionSet l0(Transition p0){
       this.m0(p0);
       Transition td = this.d;
       if (td >= 0) {
          p0.Z(td);
       }
       if (this.P & 0x01) {
          p0.b0(this.u());
       }
       if (this.P & 0x02) {
          p0.e0(this.y());
       }
       if (this.P & 0x04) {
          p0.d0(this.x());
       }
       if (this.P & 0x08) {
          p0.a0(this.t());
       }
       return this;
    }
    public Transition m(){
       TransitionSet transitionSe = super.m();
       transitionSe.L = new ArrayList();
       int i = this.L.size();
       for (int i1 = 0; i1 < i; i1 = i1 + 1) {
          transitionSe.m0(this.L.get(i1).m());
       }
       return transitionSe;
    }
    public final void m0(Transition p0){
       this.L.add(p0);
       p0.s = this;
    }
    public Transition n0(int p0){
       if (p0 < 0 || p0 >= this.L.size()) {
          return null;
       }
       return this.L.get(p0);
    }
    public void o(ViewGroup p0,p p1,p p2,ArrayList p3,ArrayList p4){
       TransitionSet transitionSe = this;
       long l = this.A();
       int i = transitionSe.L.size();
       for (int i1 = 0; i1 < i; i1 = i1 + 1) {
          Object obj = transitionSe.L.get(i1);
          int i2 = 0;
          if (l - i2 > 0 && (transitionSe.M != null || !i1)) {
             long l1 = obj.A();
             if (l1 - i2 > 0) {
                l1 = l1 + l;
                obj.g0(l1);
             }else {
                obj.g0(l);
             }
          }
          obj.o(p0, p1, p2, p3, p4);
       }
       return;
    }
    public int o0(){
       return this.L.size();
    }
    public TransitionSet p0(Transition$f p0){
       super.T(p0);
       return this;
    }
    public void q(ViewGroup p0){
       super.q(p0);
       int i = this.L.size();
       for (int i1 = 0; i1 < i; i1 = i1 + 1) {
          this.L.get(i1).q(p0);
       }
       return;
    }
    public TransitionSet q0(View p0){
       for (int i = 0; i < this.L.size(); i = i + 1) {
          this.L.get(i).U(p0);
       }
       super.U(p0);
       return this;
    }
    public TransitionSet r0(long p0){
       super.Z(p0);
       if (this.d - null >= 0) {
          TransitionSet tL = this.L;
          if (tL != null) {
             int i = tL.size();
             for (int i1 = 0; i1 < i; i1 = i1 + 1) {
                this.L.get(i1).Z(p0);
             }
          }
       }
       return this;
    }
    public TransitionSet s0(TimeInterpolator p0){
       this.P = this.P | 0x01;
       TransitionSet tL = this.L;
       if (tL != null) {
          int i = tL.size();
          for (int i1 = 0; i1 < i; i1 = i1 + 1) {
             this.L.get(i1).b0(p0);
          }
       }
       super.b0(p0);
       return this;
    }
    public TransitionSet t0(int p0){
       int i = 1;
       if (p0) {
          if (p0 == i) {
             this.M = false;
          }else {
             throw new AndroidRuntimeException("Invalid parameter for TransitionSet ordering: "+p0);
          }
       }else {
          this.M = i;
       }
       return this;
    }
    public TransitionSet u0(ViewGroup p0){
       super.f0(p0);
       int i = this.L.size();
       for (int i1 = 0; i1 < i; i1 = i1 + 1) {
          this.L.get(i1).f0(p0);
       }
       return this;
    }
    public TransitionSet v0(long p0){
       super.g0(p0);
       return this;
    }
    public final void w0(){
       TransitionSet$b uob = new TransitionSet$b(this);
       Iterator iterator = this.L.iterator();
       while (iterator.hasNext()) {
          iterator.next().a(uob);
       }
       this.N = this.L.size();
       return;
    }
}
