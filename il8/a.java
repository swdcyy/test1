package il8.a;
import il8.b;
import androidx.fragment.app.c;
import java.lang.Object;
import java.util.Stack;
import gl8.f;
import gl8.e;
import el8.d;
import jl8.c;
import androidx.fragment.app.e;
import androidx.fragment.app.Fragment;
import dl8.a;
import androidx.lifecycle.Lifecycle$State;
import il8.a$a;
import el8.c;
import java.lang.StringBuilder;
import java.lang.String;
import gl8.d;
import il8.c;
import com.yxcorp.utility.SystemUtil;
import java.lang.IllegalArgumentException;

public final class a implements b	// class@0026a3
{
    public final c a;
    public final int b;
    public final Stack c;
    public final e d;
    public c e;

    public void a(c p0,int p1){
       super();
       this.c = new Stack();
       this.d = new f();
       this.a = p0;
       this.b = p1;
    }
    public e a(){
       return this.d;
    }
    public boolean b(d p0,c p1){
       a$a uoa1;
       a$a a;
       a$a b;
       e uoe = this.a.beginTransaction();
       Fragment uFragment = this.d();
       a uoa = p0.a();
       if (uFragment != null) {
          uoe.A(uFragment, Lifecycle$State.STARTED);
          if (uoa.c != null) {
             uoe.s(uFragment);
          }
       }
       Fragment uFragment1 = null;
       if (uoa.b != null) {
          int i = p1.f();
          int i1 = this.c.size();
          while (true) {
             i1 = i1 - 1;
             if (i1 >= 0) {
                uoa1 = this.c.get(i1);
                if (uoa1.c != i) {
                   continue ;
                }
             }else {
                uoa1 = uFragment1;
             }
             if (uoa1 != null) {
                a = uoa1.a;
                if (a != null) {
                   b = uoa1.b;
                   uoa1.a = uFragment1;
                   uoa1.b = uFragment1;
                   uoe.E(a);
                   uoe.A(a, Lifecycle$State.RESUMED);
                   break ;
                }
             }
          }
          this.c.push(new a$a(a, b, p1.f(), p0.b()));
          uoe.m();
          this.a.executePendingTransactions();
          this.d.c(a, uFragment);
          return true;
       }
    label_0052 :
       a = p1.b(p0.b());
       if (uoa.a()) {
          uoe.z(uoa.d, uoa.e, uoa.f, uoa.g);
          uFragment1 = this.c.size()+"_"+p1.f();
          uoe.j(uFragment1);
       }
       uoe.f(this.b, a);
       b = uFragment1;
       goto label_0094 ;
    }
    public c c(){
       c uoc = null;
       if (this.c.isEmpty()) {
          return uoc;
       }
       a$a uoa = this.c.peek();
       a$a a = uoa.a;
       if (a == null) {
          return uoc;
       }
       a te = this.e;
       if (te == null) {
          this.e = new c(a, uoa.d, uoa.c);
       }else {
          te.b = uoa.d;
          te.a = a;
          te.c = uoa.c;
       }
       return this.e;
    }
    public final Fragment d(){
       c uoc = this.c();
       if (uoc == null) {
          return null;
       }
       return uoc.a;
    }
    public final boolean e(int p0,boolean p1){
       boolean b = false;
       a uoa = (p0 == (this.c.size() - 1))? 1: null;
       if (!uoa && this.c.get(p0).b != null) {
          if (!SystemUtil.I()) {
             return b;
          }else {
             throw new IllegalArgumentException("Illegal operation£¡£¡");
          }
       }else {
          e uoe = this.a.beginTransaction();
          a$a uoa1 = this.c.remove(p0);
          a$a a = uoa1.a;
          if (a != null) {
             uoe.u(a);
          }
          a = uoa1.b;
          if (a != null) {
             this.a.popBackStack(a, 1);
          }
          Fragment uFragment = this.d();
          if (p1 && uFragment != null) {
             uoe.E(uFragment);
             uoe.A(uFragment, Lifecycle$State.RESUMED);
          }
          this.d.a(uoa1.a, uFragment);
          uoe.m();
          this.a.executePendingTransactions();
          return 1;
       }
    }
    public boolean pop(){
       if (this.c.isEmpty()) {
          return false;
       }
       return this.e((this.c.size() - 1), 1);
    }
    public boolean remove(int p0){
       boolean b = false;
       if (p0 >= this.c.size()) {
          return b;
       }
       if (p0 == (this.c.size() - 1)) {
          b = true;
       }
       return this.e(p0, b);
    }
}
