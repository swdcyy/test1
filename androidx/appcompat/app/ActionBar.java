package androidx.appcompat.app.ActionBar;
import java.lang.Object;
import androidx.appcompat.app.ActionBar$c;
import android.content.res.Configuration;
import android.view.KeyEvent;
import androidx.appcompat.app.ActionBar$a;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.appcompat.app.ActionBar$LayoutParams;
import android.widget.SpinnerAdapter;
import androidx.appcompat.app.ActionBar$b;
import java.lang.CharSequence;
import u0.b$a;
import u0.b;
import android.content.Context;

public abstract class ActionBar	// class@000559
{
    public static final int a = 0;
    public static final int b = 1;
    public static final int c = 2;

    public void ActionBar(){
       super();
    }
    public boolean A(){
       return false;
    }
    public abstract boolean B();
    public abstract ActionBar$c C();
    public void D(Configuration p0){
    }
    public void E(){
    }
    public boolean F(int p0,KeyEvent p1){
       return false;
    }
    public boolean G(KeyEvent p0){
       return false;
    }
    public boolean H(){
       return false;
    }
    public abstract void I();
    public abstract void J(ActionBar$a p0);
    public abstract void K(ActionBar$c p0);
    public abstract void L(int p0);
    public abstract void M(ActionBar$c p0);
    public abstract void N(Drawable p0);
    public abstract void O(int p0);
    public abstract void P(View p0);
    public abstract void Q(View p0,ActionBar$LayoutParams p1);
    public void R(boolean p0){
    }
    public abstract void S(boolean p0);
    public abstract void T(int p0);
    public abstract void U(int p0,int p1);
    public abstract void V(boolean p0);
    public abstract void W(boolean p0);
    public abstract void X(boolean p0);
    public abstract void Y(boolean p0);
    public void Z(int p0){
    }
    public void a0(Drawable p0){
    }
    public abstract void b0(int p0);
    public abstract void c0(Drawable p0);
    public abstract void d0(SpinnerAdapter p0,ActionBar$b p1);
    public abstract void e0(int p0);
    public abstract void f(ActionBar$a p0);
    public abstract void f0(Drawable p0);
    public abstract void g(ActionBar$c p0);
    public abstract void g0(int p0);
    public abstract void h(ActionBar$c p0,int p1);
    public abstract void h0(int p0);
    public abstract void i(ActionBar$c p0,int p1,boolean p2);
    public void i0(boolean p0){
    }
    public abstract void j(ActionBar$c p0,boolean p1);
    public abstract void j0(int p0);
    public boolean k(){
       return false;
    }
    public abstract void k0(CharSequence p0);
    public boolean l(){
       return false;
    }
    public abstract void l0(int p0);
    public void m(boolean p0){
    }
    public abstract void m0(CharSequence p0);
    public abstract View n();
    public void n0(CharSequence p0){
    }
    public abstract int o();
    public abstract void o0();
    public abstract int p();
    public b p0(b$a p0){
       return null;
    }
    public abstract int q();
    public abstract int r();
    public abstract int s();
    public abstract ActionBar$c t();
    public abstract CharSequence u();
    public abstract ActionBar$c v(int p0);
    public abstract int w();
    public Context x(){
       return null;
    }
    public abstract CharSequence y();
    public abstract void z();
}
