package q0.d;
import androidx.collection.ArraySet;
import java.lang.Object;
import java.util.Iterator;
import java.lang.ref.WeakReference;
import android.app.Activity;
import q0.c;
import androidx.appcompat.app.AppCompatDelegateImpl;
import android.app.Dialog;
import androidx.appcompat.widget.j;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import androidx.appcompat.widget.Toolbar;
import java.lang.CharSequence;
import u0.b$a;
import u0.b;
import android.content.Context;
import java.lang.String;
import android.util.AttributeSet;
import q0.a;
import android.view.MenuInflater;
import androidx.appcompat.app.ActionBar;
import android.content.res.Configuration;

public abstract class d	// class@002940
{
    public static final int b = 0;
    public static final int c = 0;
    public static int d = 156;
    public static final ArraySet e;
    public static final Object f;

    static {
       d.e = new ArraySet();
       d.f = new Object();
    }
    public void d(){
       super();
    }
    public static void D(d p0){
       Object f = d.f;
       _monitor_enter(f);
       d.E(p0);
       _monitor_exit(f);
    }
    public static void E(d p0){
       Object f = d.f;
       _monitor_enter(f);
       Iterator iterator = d.e.iterator();
       while (iterator.hasNext()) {
          d uod = iterator.next().get();
          if (uod == p0 || uod == null) {
             iterator.remove();
          }
       }
       _monitor_exit(f);
       return;
    }
    public static void J(int p0){
       if (p0 != -1 && (p0 && (p0 != 1 && (p0 != 2 && (p0 == 3 && d.d != p0))))) {
          d.d = p0;
          d.f();
       }
       return;
    }
    public static void c(d p0){
       Object f = d.f;
       _monitor_enter(f);
       d.E(p0);
       d.e.add(new WeakReference(p0));
       _monitor_exit(f);
    }
    public static void f(){
       Object f = d.f;
       _monitor_enter(f);
       Iterator iterator = d.e.iterator();
       while (iterator.hasNext()) {
          d uod = iterator.next().get();
          if (uod != null) {
             uod.e();
          }
       }
       _monitor_exit(f);
       return;
    }
    public static d h(Activity p0,c p1){
       return new AppCompatDelegateImpl(p0, p1);
    }
    public static d i(Dialog p0,c p1){
       return new AppCompatDelegateImpl(p0, p1);
    }
    public static int l(){
       return d.d;
    }
    public static boolean t(){
       return j.a();
    }
    public abstract void A(Bundle p0);
    public abstract void B();
    public abstract void C();
    public abstract boolean F(int p0);
    public abstract void G(int p0);
    public abstract void H(View p0);
    public abstract void I(View p0,ViewGroup$LayoutParams p1);
    public abstract void K(boolean p0);
    public abstract void L(int p0);
    public abstract void M(Toolbar p0);
    public void N(int p0){
    }
    public abstract void O(CharSequence p0);
    public abstract b P(b$a p0);
    public abstract void d(View p0,ViewGroup$LayoutParams p1);
    public abstract boolean e();
    public Context g(Context p0){
       return p0;
    }
    public abstract View j(View p0,String p1,Context p2,AttributeSet p3);
    public abstract View k(int p0);
    public abstract a m();
    public int n(){
       return -100;
    }
    public abstract MenuInflater o();
    public abstract ActionBar p();
    public abstract boolean q(int p0);
    public abstract void r();
    public abstract void s();
    public abstract boolean u();
    public abstract void v(Configuration p0);
    public abstract void w(Bundle p0);
    public abstract void x();
    public abstract void y(Bundle p0);
    public abstract void z();
}
