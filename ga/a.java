package ga.a;
import android.content.Context;
import java.lang.Object;
import ga.a$d;
import ga.a$e;
import android.app.Dialog;
import ga.a$b;
import android.view.animation.Animation$AnimationListener;
import android.view.animation.Animation;
import android.view.ViewGroup;
import ca.b;
import ga.a$c;
import java.lang.Runnable;
import android.view.View;
import fa.g;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout$LayoutParams;
import android.view.LayoutInflater;
import ag6.a;
import android.view.ViewGroup$LayoutParams;
import android.view.Window;
import ga.b;
import android.content.DialogInterface$OnDismissListener;
import ga.a$a;
import android.view.View$OnClickListener;
import android.app.Activity;
import fa.d;
import android.view.View$OnKeyListener;
import android.view.ViewParent;
import ea.c;
import android.view.View$OnTouchListener;

public class a	// class@002056
{
    public Context b;
    public ViewGroup c;
    public ViewGroup d;
    public ViewGroup e;
    public b f;
    public c g;
    public boolean h;
    public Animation i;
    public Animation j;
    public boolean k;
    public int l;
    public Dialog m;
    public View n;
    public boolean o;
    public View$OnKeyListener p;
    public final View$OnTouchListener q;

    public void a(Context p0){
       super();
       this.l = 80;
       this.o = true;
       this.p = new a$d(this);
       this.q = new a$e(this);
       this.b = p0;
    }
    public void a(){
       if (this.f()) {
          a tm = this.m;
          if (tm != null) {
             tm.dismiss();
          }
       }else if(this.h != null){
          return;
       }else if(this.o != null){
          this.i.setAnimationListener(new a$b(this));
          this.c.startAnimation(this.i);
       }else {
          this.b();
       }
       this.h = true;
       return;
    }
    public void b(){
       this.f.O.post(new a$c(this));
    }
    public View c(int p0){
       return this.c.findViewById(p0);
    }
    public void d(){
       this.j = AnimationUtils.loadAnimation(this.b, g.b(this.l, true));
       this.i = AnimationUtils.loadAnimation(this.b, g.b(this.l, false));
    }
    public void e(){
       ViewGroup viewGroup;
       int i = -1;
       FrameLayout$LayoutParams layoutParams = new FrameLayout$LayoutParams(i, -2, 80);
       LayoutInflater layoutInflat = LayoutInflater.from(this.b);
       if (this.f()) {
          viewGroup = a.c(layoutInflat, R.layout.arg_RES_7f0d078c, null, false);
          this.e = viewGroup;
          viewGroup.setBackgroundColor(false);
          viewGroup = this.e.findViewById(R.id.content_container);
          this.c = viewGroup;
          int i1 = 30;
          layoutParams.leftMargin = i1;
          layoutParams.rightMargin = i1;
          viewGroup.setLayoutParams(layoutParams);
          if (this.e != null) {
             Dialog uDialog = new Dialog(this.b, 0x7f11069e);
             this.m = uDialog;
             uDialog.setCancelable(this.f.i0);
             this.m.setContentView(this.e);
             Window window = this.m.getWindow();
             if (window != null) {
                window.setWindowAnimations(R.style.arg_RES_7f1105dc);
                window.setGravity(17);
             }
             this.m.setOnDismissListener(new b(this));
          }
          this.e.setOnClickListener(new a$a(this));
       }else {
          a tf = this.f;
          if (tf.O == null) {
             tf.O = d.a(this.b).getWindow().getDecorView();
          }
          ViewGroup viewGroup1 = a.c(layoutInflat, R.layout.arg_RES_7f0d078c, this.f.O, false);
          this.d = viewGroup1;
          viewGroup1.setLayoutParams(new FrameLayout$LayoutParams(i, i));
          b uob = this.f.f0;
          if (uob != i) {
             this.d.setBackgroundColor(uob);
          }
          viewGroup = this.d.findViewById(R.id.content_container);
          this.c = viewGroup;
          viewGroup.setLayoutParams(layoutParams);
       }
       boolean b = true;
       a te = (this.f())? this.e: this.d;
       te.setFocusable(b);
       te.setFocusableInTouchMode(b);
       te.setOnKeyListener(this.p);
       return;
    }
    public boolean f(){
       return false;
    }
    public boolean g(){
       boolean b = false;
       if (this.f()) {
          return b;
       }
       if (this.d.getParent() != null || this.k != null) {
          b = true;
       }
       return b;
    }
    public void h(){
       a tm = this.m;
       if (tm != null) {
          tm.setCancelable(this.f.i0);
       }
       return;
    }
    public a i(c p0){
       this.g = p0;
       return this;
    }
    public a j(boolean p0){
       a td = this.d;
       if (td != null) {
          View view = td.findViewById(R.id.outmost_container);
          if (p0) {
             view.setOnTouchListener(this.q);
          }else {
             view.setOnTouchListener(null);
          }
       }
       return this;
    }
    public void k(){
       if (this.f()) {
          a tm = this.m;
          if (tm != null) {
             tm.show();
          }
       }else if(this.g()){
          return;
       }else {
          this.k = true;
          this.f.O.addView(this.d);
          if (this.o != null) {
             this.c.startAnimation(this.j);
          }
          this.d.requestFocus();
       }
       return;
    }
}
