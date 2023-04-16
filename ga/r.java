package ga.r;
import android.view.View$OnClickListener;
import ga.l;
import ca.a;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import android.widget.TextView;
import android.widget.RelativeLayout;
import android.widget.Button;
import java.lang.Object;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.content.res.Resources;
import java.lang.String;
import ea.a;
import ga.p;
import android.widget.LinearLayout;
import ga.d0;
import ga.q;
import ea.b;
import java.util.Calendar;
import java.lang.IllegalArgumentException;
import com.contrarywind.view.WheelView;
import com.contrarywind.view.WheelView$DividerType;
import fa.b;
import java.text.DateFormat;
import java.util.Date;
import ea.g;
import java.text.ParseException;
import java.lang.System;

public class r extends l implements View$OnClickListener	// class@002083
{
    public d0 t;

    public void r(a p0){
       super(p0.S);
       this.f = p0;
       p0 = p0.S;
       this.l();
       this.h();
       this.g();
       a e = this.f.e;
       if (e == null) {
          LayoutInflater.from(p0).inflate(R.layout.arg_RES_7f0d114f, this.c);
          TextView textView = this.c(R.id.tvTitle);
          RelativeLayout relativeLayo = this.c(R.id.rv_topbar);
          Button uButton = this.c(R.id.btnSubmit);
          Button uButton1 = this.c(R.id.btnCancel);
          uButton.setTag("submit");
          uButton1.setTag("cancel");
          uButton.setOnClickListener(this);
          uButton1.setOnClickListener(this);
          String str = (TextUtils.isEmpty(this.f.T))? p0.getResources().getString(R.string.arg_RES_7f103c75): this.f.T;
          uButton.setText(str);
          String str1 = (TextUtils.isEmpty(this.f.U))? p0.getResources().getString(R.string.arg_RES_7f103c6f): this.f.U;
          uButton1.setText(str1);
          str1 = (TextUtils.isEmpty(this.f.V))? "": this.f.V;
          textView.setText(str1);
          uButton.setTextColor(this.f.W);
          uButton1.setTextColor(this.f.X);
          textView.setTextColor(this.f.Y);
          relativeLayo.setBackgroundColor(this.f.a0);
          uButton.setTextSize((float)this.f.b0);
          uButton1.setTextSize((float)this.f.b0);
          textView.setTextSize((float)this.f.c0);
       }else {
          e.a(LayoutInflater.from(p0).inflate(this.f.P, this.c));
          this.h = new p(this);
       }
       l tf = this.f;
       d0 uod0 = new d0(this.c(0x7f0a3eff), tf.u, tf.R, tf.d0);
       this.t = uod0;
       float f = (float)tf.e0;
       r or = null;
       if (f - or > 0) {
          uod0.r = f;
       }
       f = (float)tf.f0;
       if (f - or > 0) {
          uod0.s = f;
       }
       f = tf.s;
       if (f - or) {
          uod0.g(f);
       }
       if (this.f.c != null) {
          this.t.n(new q(this));
       }
       this.t.j(this.f.B);
       l tf1 = this.f;
       e = tf1.y;
       if (e != null) {
          a z = tf1.z;
          if (z != null && e <= z) {
             or = this.t;
             or.j = e;
             or.k = z;
          }
       }
       e = tf1.w;
       if (e != null && tf1.x != null) {
          if (e.getTimeInMillis() - this.f.x.getTimeInMillis() <= 0) {
             this.s();
          }else {
             throw new IllegalArgumentException("startDate can\'t be later than endDate");
          }
       }else {
          int i = 1;
          if (e != null) {
             if (e.get(i) >= 1900) {
                this.s();
             }else {
                throw new IllegalArgumentException("The startDate can not as early as 1900");
             }
          }else {
             tf1 = tf1.x;
             if (tf1 != null) {
                if (tf1.get(i) <= 2100) {
                   this.s();
                }else {
                   throw new IllegalArgumentException("The endDate should not be later than 2100");
                }
             }else {
                this.s();
             }
          }
       }
       this.t();
       tf1 = this.f;
       this.t.h(tf1.D, tf1.E, tf1.F, tf1.G, tf1.H, tf1.I);
       r tt = this.t;
       l tf2 = this.f;
       tt.d.setTextXOffset(tf2.J);
       tt.c.setTextXOffset(tf2.K);
       tt.b.setTextXOffset(tf2.L);
       tt.e.setTextXOffset(tf2.M);
       tt.f.setTextXOffset(tf2.N);
       tt.g.setTextXOffset(tf2.O);
       this.n(this.f.n0);
       this.t.e(this.f.A);
       this.t.f(this.f.i0);
       tt = this.t;
       e = this.f.q0;
       tt.z = e;
       tt.d.setDividerType(e);
       tt.c.setDividerType(tt.z);
       tt.b.setDividerType(tt.z);
       tt.e.setDividerType(tt.z);
       tt.f.setDividerType(tt.z);
       tt.g.setDividerType(tt.z);
       this.t.i(this.f.k0);
       this.t.p(this.f.g0);
       this.t.o(this.f.h0);
       this.t.b(this.f.o0);
       return;
    }
    public boolean i(){
       l tf = this.f;
       boolean b = (tf.l0 != null || tf.m0 != null)? true: false;
       return b;
    }
    public boolean j(){
       return this.f.m0;
    }
    public void onClick(View p0){
       if ((p0.getTag()).equals("submit")) {
          this.q();
       }
       this.a();
       return;
    }
    public final void p(){
       l tf = this.f;
       a w = tf.w;
       if (w != null && tf.x != null) {
          a v = tf.v;
          if (v != null && (v.getTimeInMillis() - this.f.w.getTimeInMillis() < 0 || this.f.v.getTimeInMillis() - this.f.x.getTimeInMillis() > 0)) {
             tf = this.f;
             tf.v = tf.w;
          }
       }else if(w != null){
          tf.v = w;
       }else {
          w = tf.x;
          if (w != null) {
             tf.v = w;
          }
       }
       return;
    }
    public void q(){
       if (this.f.b != null) {
          try{
             this.f.b.a(b.b.a().parse(this.t.a()), this.o);
          }catch(java.text.ParseException e0){
             e0.printStackTrace();
          }
       }
    }
    public void r(Calendar p0){
       if (p0 != null) {
          this.f.v = p0;
          this.p();
          this.t();
       }
       return;
    }
    public final void s(){
       l tf = this.f;
       this.t.l(tf.w, tf.x);
       this.p();
    }
    public final void t(){
       int i5;
       int i6;
       Calendar instance = Calendar.getInstance();
       a v = this.f.v;
       int i = 12;
       int i1 = 11;
       int i2 = 5;
       int i3 = 2;
       int i4 = 1;
       if (v == null) {
          instance.setTimeInMillis(System.currentTimeMillis());
          i5 = instance.get(i4);
          i3 = instance.get(i3);
          i2 = instance.get(i2);
          i1 = instance.get(i1);
          i = instance.get(i);
          i6 = instance.get(13);
       }else {
          i5 = v.get(i4);
          i3 = this.f.v.get(i3);
          i2 = this.f.v.get(i2);
          i1 = this.f.v.get(i1);
          i = this.f.v.get(i);
          i6 = this.f.v.get(13);
       }
       this.t.k(i5, i3, i2, i1, i, i6);
       return;
    }
}
