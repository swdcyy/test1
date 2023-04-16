package ga.l;
import android.content.Context;
import java.lang.Object;
import ga.l$d;
import ga.l$e;
import android.app.Dialog;
import android.animation.Animator;
import ca.a;
import ga.l$c;
import java.lang.Runnable;
import android.view.ViewGroup;
import android.view.View;
import ga.l$f;
import android.view.ViewTreeObserver;
import ga.l$b;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import android.widget.FrameLayout$LayoutParams;
import android.view.LayoutInflater;
import ag6.a;
import android.view.ViewGroup$LayoutParams;
import android.view.Window;
import ga.m;
import android.content.DialogInterface$OnDismissListener;
import ga.l$a;
import android.view.View$OnClickListener;
import android.app.Activity;
import fa.d;
import android.view.View$OnKeyListener;
import android.view.ViewParent;
import ea.c;
import android.view.View$OnTouchListener;

public class l	// class@002076
{
    public Context b;
    public ViewGroup c;
    public ViewGroup d;
    public ViewGroup e;
    public a f;
    public c g;
    public l$f h;
    public boolean i;
    public Animator j;
    public Animator k;
    public boolean l;
    public int m;
    public Dialog n;
    public View o;
    public boolean p;
    public float q;
    public View$OnKeyListener r;
    public final View$OnTouchListener s;

    public void l(Context p0){
       super();
       this.m = 80;
       this.p = true;
       this.r = new l$d(this);
       this.s = new l$e(this);
       this.b = p0;
    }
    public void a(){
       if (this.i()) {
          l tn = this.n;
          if (tn != null) {
             tn.dismiss();
          }
       }else if(this.i != null){
          return;
       }else if(this.p != null){
          this.k.start();
       }else {
          this.b();
       }
       this.i = true;
       return;
    }
    public void b(){
       this.f.Q.post(new l$c(this));
    }
    public View c(int p0){
       return this.c.findViewById(p0);
    }
    public l$f d(){
       return this.h;
    }
    public Dialog e(){
       return this.n;
    }
    public ViewGroup f(){
       return this.c;
    }
    public void g(){
       this.c.getViewTreeObserver().addOnGlobalLayoutListener(new l$b(this));
    }
    public void h(){
       ViewGroup viewGroup;
       int i = -1;
       int i1 = 80;
       FrameLayout$LayoutParams layoutParams = new FrameLayout$LayoutParams(i, -2, i1);
       LayoutInflater layoutInflat = LayoutInflater.from(this.b);
       if (this.i()) {
          viewGroup = a.c(layoutInflat, R.layout.arg_RES_7f0d078c, null, false);
          this.e = viewGroup;
          viewGroup.setBackgroundColor(false);
          this.c = this.e.findViewById(0x7f0a094a);
          if (!this.j()) {
             i = 30;
             layoutParams.leftMargin = i;
             layoutParams.rightMargin = i;
          }
          this.c.setLayoutParams(layoutParams);
          if (this.e != null) {
             Dialog uDialog = new Dialog(this.b, 0x7f11069e);
             this.n = uDialog;
             uDialog.setCancelable(this.f.n0);
             this.n.setContentView(this.e);
             Window window = this.n.getWindow();
             if (window != null) {
                if (this.j()) {
                   window.setWindowAnimations(R.style.arg_RES_7f1105dd);
                   window.setGravity(i1);
                }else {
                   window.setWindowAnimations(R.style.arg_RES_7f1105dc);
                   window.setGravity(17);
                }
             }
             this.n.setOnDismissListener(new m(this));
          }
          this.e.setOnClickListener(new l$a(this));
       }else {
          l tf = this.f;
          if (tf.Q == null) {
             tf.Q = d.a(this.b).getWindow().getDecorView();
          }
          ViewGroup viewGroup1 = a.c(layoutInflat, R.layout.arg_RES_7f0d078c, this.f.Q, false);
          this.d = viewGroup1;
          viewGroup1.setLayoutParams(new FrameLayout$LayoutParams(i, i));
          a j0 = this.f.j0;
          if (j0 != i) {
             this.d.setBackgroundColor(j0);
          }
          viewGroup = this.d.findViewById(R.id.content_container);
          this.c = viewGroup;
          viewGroup.setLayoutParams(layoutParams);
       }
       boolean b = true;
       l te = (this.i())? this.e: this.d;
       te.setFocusable(b);
       te.setFocusableInTouchMode(b);
       te.setOnKeyListener(this.r);
       return;
    }
    public boolean i(){
       return false;
    }
    public boolean j(){
       return false;
    }
    public boolean k(){
       boolean b = false;
       if (this.i()) {
          return b;
       }
       if (this.d.getParent() != null || this.l != null) {
          b = true;
       }
       return b;
    }
    public void l(){
       l tn = this.n;
       if (tn != null) {
          tn.setCancelable(this.f.n0);
       }
       return;
    }
    public l m(c p0){
       this.g = p0;
       return this;
    }
    public l n(boolean p0){
       l td = this.d;
       if (td != null) {
          View view = td.findViewById(R.id.outmost_container);
          if (p0) {
             view.setOnTouchListener(this.s);
          }else {
             view.setOnTouchListener(null);
          }
       }
       return this;
    }
    public void o(){
       l tn;
       if (this.i()) {
          tn = this.n;
          if (tn != null) {
             tn.show();
          }
       }else if(this.k()){
          return;
       }else {
          this.l = true;
          this.f.Q.addView(this.d);
          if (this.p != null) {
             tn = this.j;
             if (tn != null) {
                tn.start();
             }
          }
          this.d.requestFocus();
       }
       return;
    }
}
