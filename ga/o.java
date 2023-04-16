package ga.o;
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
import ga.n;
import android.widget.LinearLayout;
import ga.y;
import com.contrarywind.view.CustomWheelView;
import java.util.Objects;
import com.contrarywind.view.WheelView;
import android.graphics.Typeface;
import com.contrarywind.view.WheelView$DividerType;
import aa.a;
import java.util.List;
import ia.a;
import ea.e;
import ga.s;
import ga.t;
import ka.b;
import ga.u;

public class o extends l implements View$OnClickListener	// class@00207d
{
    public y t;

    public void o(a p0){
       super(p0.S);
       this.f = p0;
       p0 = p0.S;
       this.l();
       this.h();
       this.g();
       a e = this.f.e;
       int i = 0x7f0a2efe;
       if (e == null) {
          LayoutInflater.from(p0).inflate(this.f.P, this.c);
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
          View view = this.c(i);
          if (view != null) {
             view.setBackgroundResource(R.drawable.arg_RES_7f081081);
          }
       }else {
          e.a(LayoutInflater.from(p0).inflate(this.f.P, this.c));
          this.h = new n(this);
       }
       y oy = new y(this.c(i), this.f.r);
       this.t = oy;
       l tf = this.f;
       a d = tf.d;
       if (d != null) {
          oy.l = d;
       }
       float f = (float)tf.e0;
       oy.b.setOuterTextSize(f);
       oy.c.setOuterTextSize(f);
       oy.d.setOuterTextSize(f);
       o tt = this.t;
       float f1 = (float)this.f.f0;
       tt.b.setCenterTextSize(f1);
       tt.c.setCenterTextSize(f1);
       tt.d.setCenterTextSize(f1);
       tt = this.t;
       l tf1 = this.f;
       d = tf1.f;
       a g = tf1.g;
       e = tf1.h;
       Objects.requireNonNull(tt);
       if (d != null) {
          tt.b.setLabel(d);
       }
       if (g != null) {
          tt.c.setLabel(g);
       }
       if (e != null) {
          tt.d.setLabel(e);
       }
       tt = this.t;
       tf1 = this.f;
       tt.b.setTextXOffset(tf1.l);
       tt.c.setTextXOffset(tf1.m);
       tt.d.setTextXOffset(tf1.n);
       tt = this.t;
       tf1 = this.f;
       tt.b.setCyclic(tf1.o);
       tt.c.setCyclic(tf1.p);
       tt.d.setCyclic(tf1.q);
       tt = this.t;
       e = this.f.p0;
       tt.b.setTypeface(e);
       tt.c.setTypeface(e);
       tt.d.setTypeface(e);
       this.n(this.f.n0);
       tt = this.t;
       e = this.f.i0;
       tt.o = e;
       tt.b.setDividerColor(e);
       tt.c.setDividerColor(tt.o);
       tt.d.setDividerColor(tt.o);
       tt = this.t;
       e = this.f.q0;
       tt.q = e;
       tt.b.setDividerType(e);
       tt.c.setDividerType(tt.q);
       tt.d.setDividerType(tt.q);
       tt = this.t;
       e = this.f.k0;
       tt.r = e;
       tt.b.setLineSpacingMultiplier(e);
       tt.c.setLineSpacingMultiplier(tt.r);
       tt.d.setLineSpacingMultiplier(tt.r);
       tt = this.t;
       e = this.f.g0;
       tt.m = e;
       tt.b.setTextColorOut(e);
       tt.c.setTextColorOut(tt.m);
       tt.d.setTextColorOut(tt.m);
       tt = this.t;
       e = this.f.h0;
       tt.n = e;
       tt.b.setTextColorCenter(e);
       tt.c.setTextColorCenter(tt.n);
       tt.d.setTextColorCenter(tt.n);
       tt = this.t;
       e = this.f.o0;
       tt.b.e(e);
       tt.c.e(e);
       tt.d.e(e);
       tt = this.f.s;
       if (tt) {
          o tt1 = this.t;
          tt1.p = tt;
          tt1.b.setItemHeight(tt);
          tt1.c.setItemHeight(tt);
          tt1.d.setItemHeight(tt);
       }
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
       o tt = this.t;
       if (tt != null) {
          l tf = this.f;
          a i = tf.i;
          a j = tf.j;
          a k = tf.k;
          if (tt.h != null) {
             if (tt.e != null) {
                tt.b.setCurrentItem(i);
             }
             y f = tt.f;
             if (f != null) {
                tt.c.setAdapter(new a(f.get(i)));
                tt.c.setCurrentItem(j);
             }
             f = tt.g;
             if (f != null) {
                tt.d.setAdapter(new a(f.get(i).get(j)));
                tt.d.setCurrentItem(k);
             }
          }else {
             tt.b.setCurrentItem(i);
             tt.c.setCurrentItem(j);
             tt.d.setCurrentItem(k);
          }
       }
       return;
    }
    public void q(){
       if (this.f.a != null) {
          o tt = this.t;
          int[] ointArray = new int[3];
          int i = 0;
          ointArray[0] = tt.b.getCurrentItem();
          y f = tt.f;
          int i1 = 1;
          if (f != null && f.size() > 0) {
             int i2 = (tt.c.getCurrentItem() > (tt.f.get(ointArray[i]).size() - i1))? 0: tt.c.getCurrentItem();
             ointArray[i1] = i2;
          }else {
             ointArray[i1] = tt.c.getCurrentItem();
          }
          f = tt.g;
          if (f != null && f.size() > 0) {
             int i3 = (tt.d.getCurrentItem() > (tt.g.get(ointArray[i]).get(ointArray[i1]).size() - i1))? 0: tt.d.getCurrentItem();
             ointArray[2] = i3;
          }else {
             ointArray[2] = tt.d.getCurrentItem();
          }
          this.f.a.a(ointArray[i], ointArray[i1], ointArray[2], this.o);
       }
       return;
    }
    public void r(List p0){
       this.t(p0, null, null);
    }
    public void s(List p0,List p1){
       this.t(p0, p1, null);
    }
    public void t(List p0,List p1,List p2){
       o tt = this.t;
       tt.e = p0;
       tt.f = p1;
       tt.g = p2;
       tt.b.setAdapter(new a(p0));
       tt.b.setCurrentItem(0);
       y f = tt.f;
       if (f != null) {
          tt.c.setAdapter(new a(f.get(0)));
       }
       f = tt.c;
       f.setCurrentItem(f.getCurrentItem());
       f = tt.g;
       if (f != null) {
          tt.d.setAdapter(new a(f.get(0).get(0)));
       }
       f = tt.d;
       f.setCurrentItem(f.getCurrentItem());
       tt.b.setIsOptions(true);
       tt.c.setIsOptions(true);
       tt.d.setIsOptions(true);
       if (tt.f == null) {
          tt.c.setVisibility(8);
       }else {
          tt.c.setVisibility(0);
       }
       if (tt.g == null) {
          tt.d.setVisibility(8);
       }else {
          tt.d.setVisibility(0);
       }
       tt.j = new s(tt);
       tt.k = new t(tt);
       if (p0 != null && tt.h != null) {
          tt.b.setOnItemSelectedListener(tt.j);
       }
       if (p1 != null && tt.h != null) {
          tt.c.setOnItemSelectedListener(tt.k);
       }
       if (p2 != null && (tt.h != null && tt.l != null)) {
          tt.d.setOnItemSelectedListener(new u(tt));
       }
    label_00c4 :
       this.p();
       return;
    }
    public void u(int p0,int p1,int p2){
       l tf = this.f;
       tf.i = p0;
       tf.j = p1;
       tf.k = p2;
       this.p();
    }
}
