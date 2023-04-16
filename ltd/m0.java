package ltd.m0;
import java.lang.Object;
import ltd.n0;
import qrd.l1;
import msd.l;
import java.lang.Boolean;
import nsd.c0;
import trd.n;
import java.util.Arrays;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Comparable;

public class m0	// class@001e0b
{
    public int _size;
    public n0[] a;

    public void m0(){
       super();
       this._size = 0;
    }
    public final void a(n0 p0){
       p0.b(this);
       int i = this.f();
       this.n((i + 1));
       this.i()[i] = p0;
       p0.a(i);
       this.p(i);
    }
    public final void b(n0 p0){
       _monitor_enter(this);
       this.a(p0);
       _monitor_exit(this);
    }
    public final boolean c(n0 p0,l p1){
       boolean b;
       _monitor_enter(this);
       if (p1.invoke(this.e()).booleanValue()) {
          this.a(p0);
          b = true;
       }else {
          b = false;
       }
       c0.d(1);
       _monitor_exit(this);
       c0.c(1);
       return b;
    }
    public final void d(){
       _monitor_enter(this);
       m0 ta = this.a;
       if (ta != null) {
          n.w2(ta, null, 0, 0, 6, null);
       }
       this._size = 0;
       _monitor_exit(this);
       return;
    }
    public final n0 e(){
       m0 ta = this.a;
       object oobject = (ta != null)? ta[0]: null;
       return oobject;
    }
    public final int f(){
       return this._size;
    }
    public final boolean g(){
       boolean b = (!this.f())? true: false;
       return b;
    }
    public final n0 h(){
       _monitor_enter(this);
       _monitor_exit(this);
       return this.e();
    }
    public final n0[] i(){
       m0 ta = this.a;
       if (ta == null) {
          ta = new n0[4];
          this.a = ta;
       }else if(this.f() >= ta.length){
          ta = Arrays.copyOf(ta, (this.f() * 2));
          a.h(ta, "java.util.Arrays.copyOf\(this, newSize\)");
          this.a = ta;
       }
       return ta;
    }
    public final boolean j(n0 p0){
       boolean b;
       _monitor_enter(this);
       if (p0.c() == null) {
          b = false;
       }else {
          this.k(p0.getIndex());
          b = true;
       }
       _monitor_exit(this);
       return b;
    }
    public final n0 k(int p0){
       m0 ta = this.a;
       if (ta == null) {
          a.L();
       }
       int i = -1;
       this.n((this.f() + i));
       if (p0 < this.f()) {
          this.q(p0, this.f());
          int i1 = (p0 - 1) / 2;
          if (p0 > 0) {
             object oobject = ta[p0];
             if (oobject == null) {
                a.L();
             }
             object oobject1 = ta[i1];
             if (oobject1 == null) {
                a.L();
             }
             if (oobject.compareTo(oobject1) < 0) {
                this.q(p0, i1);
                this.p(i1);
             }
          }
          this.o(p0);
       }
       object oobject2 = ta[this.f()];
       if (oobject2 == null) {
          a.L();
       }
       oobject2.b(null);
       oobject2.a(i);
       ta[this.f()] = null;
       return oobject2;
    }
    public final n0 l(l p0){
       _monitor_enter(this);
       n0 on0 = this.e();
       n0 on01 = null;
       if (on0 != null) {
          if (p0.invoke(on0).booleanValue()) {
             on01 = this.k(0);
          }
          c0.d(1);
          _monitor_exit(this);
          c0.c(1);
          return on01;
       }else {
          c0.d(2);
          _monitor_exit(this);
          c0.c(2);
          return on01;
       }
    }
    public final n0 m(){
       _monitor_enter(this);
       n0 on0 = (this.f() > 0)? this.k(0): null;
       _monitor_exit(this);
       return on0;
    }
    public final void n(int p0){
       this._size = p0;
    }
    public final void o(int p0){
       while (true) {
          int i = p0 * 2;
          i = i + 1;
          if (i >= this.f()) {
             return;
          }
          m0 ta = this.a;
          if (ta == null) {
             a.L();
          }
          int i1 = i + 1;
          if (i1 < this.f()) {
             object oobject = ta[i1];
             if (oobject == null) {
                a.L();
             }
             object oobject1 = ta[i];
             if (oobject1 == null) {
                a.L();
             }
             if (oobject.compareTo(oobject1) < 0) {
                i = i1;
             }
          }
          object oobject2 = ta[p0];
          if (oobject2 == null) {
             a.L();
          }
          object oobject3 = ta[i];
          if (oobject3 == null) {
             a.L();
          }
          if (oobject2.compareTo(oobject3) <= 0) {
             break ;
          }else {
             this.q(p0, i);
             p0 = i;
          }
       }
       return;
    }
    public final void p(int p0){
       while (true) {
          if (p0 <= 0) {
             return;
          }
          m0 ta = this.a;
          if (ta == null) {
             a.L();
          }
          int i = p0 - 1;
          i = i / 2;
          object oobject = ta[i];
          if (oobject == null) {
             a.L();
          }
          object oobject1 = ta[p0];
          if (oobject1 == null) {
             a.L();
          }
          if (oobject.compareTo(oobject1) <= 0) {
             break ;
          }else {
             this.q(p0, i);
             p0 = i;
          }
       }
       return;
    }
    public final void q(int p0,int p1){
       m0 ta = this.a;
       if (ta == null) {
          a.L();
       }
       object oobject = ta[p1];
       if (oobject == null) {
          a.L();
       }
       object oobject1 = ta[p0];
       if (oobject1 == null) {
          a.L();
       }
       ta[p0] = oobject;
       ta[p1] = oobject1;
       oobject.a(p0);
       oobject1.a(p1);
       return;
    }
}
