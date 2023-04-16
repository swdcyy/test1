package androidx.appcompat.app.a$a;
import android.content.Context;
import androidx.appcompat.app.a;
import java.lang.Object;
import androidx.appcompat.app.AlertController$f;
import android.view.ContextThemeWrapper;
import androidx.appcompat.app.AlertController;
import android.app.Dialog;
import android.content.DialogInterface$OnCancelListener;
import android.content.DialogInterface$OnDismissListener;
import android.content.DialogInterface$OnKeyListener;
import android.widget.ListAdapter;
import android.content.DialogInterface$OnClickListener;
import android.view.View;
import android.graphics.drawable.Drawable;
import java.lang.CharSequence;

public class a$a	// class@000584
{
    public final AlertController$f a;
    public final int b;

    public void a$a(Context p0){
       super(p0, a.f(p0, 0));
    }
    public void a$a(Context p0,int p1){
       super();
       this.a = new AlertController$f(new ContextThemeWrapper(p0, a.f(p0, p1)));
       this.b = p1;
    }
    public a a(){
       a uoa = new a(this.a.a, this.b);
       this.a.a(uoa.d);
       uoa.setCancelable(this.a.r);
       if (this.a.r != null) {
          uoa.setCanceledOnTouchOutside(true);
       }
       uoa.setOnCancelListener(this.a.s);
       uoa.setOnDismissListener(this.a.t);
       AlertController$f u = this.a.u;
       if (u != null) {
          uoa.setOnKeyListener(u);
       }
       return uoa;
    }
    public Context b(){
       return this.a.a;
    }
    public a$a c(ListAdapter p0,DialogInterface$OnClickListener p1){
       a$a ta = this.a;
       ta.w = p0;
       ta.x = p1;
       return this;
    }
    public a$a d(boolean p0){
       this.a.r = p0;
       return this;
    }
    public a$a e(View p0){
       this.a.g = p0;
       return this;
    }
    public a$a f(Drawable p0){
       this.a.d = p0;
       return this;
    }
    public a$a g(int p0){
       a$a ta = this.a;
       ta.h = ta.a.getText(p0);
       return this;
    }
    public a$a h(int p0,DialogInterface$OnClickListener p1){
       a$a ta = this.a;
       ta.l = ta.a.getText(p0);
       p0.n = p1;
       return this;
    }
    public a$a i(CharSequence p0,DialogInterface$OnClickListener p1){
       a$a ta = this.a;
       ta.l = p0;
       ta.n = p1;
       return this;
    }
    public a$a j(DialogInterface$OnKeyListener p0){
       this.a.u = p0;
       return this;
    }
    public a$a k(int p0,DialogInterface$OnClickListener p1){
       a$a ta = this.a;
       ta.i = ta.a.getText(p0);
       p0.k = p1;
       return this;
    }
    public a$a l(ListAdapter p0,int p1,DialogInterface$OnClickListener p2){
       a$a ta = this.a;
       ta.w = p0;
       ta.x = p2;
       ta.I = p1;
       ta.H = true;
       return this;
    }
    public a$a m(int p0){
       a$a ta = this.a;
       ta.f = ta.a.getText(p0);
       return this;
    }
    public a$a n(CharSequence p0){
       this.a.f = p0;
       return this;
    }
    public a$a o(View p0){
       a$a ta = this.a;
       ta.z = p0;
       ta.y = 0;
       ta.E = false;
       return this;
    }
}
