package ga.e0;
import android.view.View$OnClickListener;
import ga.a;
import ca.b;
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
import android.widget.LinearLayout;
import ga.q0;
import com.contrarywind.view.WheelView;
import java.util.Objects;
import android.graphics.Typeface;
import com.contrarywind.view.WheelView$DividerType;
import java.util.List;
import ea.e;
import aa.a;
import ia.a;
import ga.o0;
import ga.p0;
import ka.b;

public class e0 extends a implements View$OnClickListener	// class@00205e
{
    public q0 r;

    public void e0(b p0){
       super(p0.Q);
       this.f = p0;
       p0 = p0.Q;
       this.h();
       this.e();
       this.d();
       b e = this.f.e;
       if (e == null) {
          LayoutInflater.from(p0).inflate(this.f.N, this.c);
          TextView textView = this.c(R.id.tvTitle);
          RelativeLayout relativeLayo = this.c(R.id.rv_topbar);
          Button uButton = this.c(R.id.btnSubmit);
          Button uButton1 = this.c(R.id.btnCancel);
          uButton.setTag("submit");
          uButton1.setTag("cancel");
          uButton.setOnClickListener(this);
          uButton1.setOnClickListener(this);
          String str = (TextUtils.isEmpty(this.f.R))? p0.getResources().getString(R.string.arg_RES_7f103c75): this.f.R;
          uButton.setText(str);
          String str1 = (TextUtils.isEmpty(this.f.S))? p0.getResources().getString(R.string.arg_RES_7f103c6f): this.f.S;
          uButton1.setText(str1);
          str1 = (TextUtils.isEmpty(this.f.T))? "": this.f.T;
          textView.setText(str1);
          uButton.setTextColor(this.f.U);
          uButton1.setTextColor(this.f.V);
          textView.setTextColor(this.f.W);
          relativeLayo.setBackgroundColor(this.f.Y);
          uButton.setTextSize((float)this.f.Z);
          uButton1.setTextSize((float)this.f.Z);
          textView.setTextSize((float)this.f.a0);
       }else {
          e.a(LayoutInflater.from(p0).inflate(this.f.N, this.c));
       }
       LinearLayout linearLayout = this.c(R.id.optionspicker);
       linearLayout.setBackgroundColor(this.f.X);
       q0 oq0 = new q0(linearLayout, this.f.r);
       this.r = oq0;
       a tf = this.f;
       b d = tf.d;
       if (d != null) {
          oq0.l = d;
       }
       float f = (float)tf.b0;
       oq0.b.setTextSize(f);
       oq0.c.setTextSize(f);
       oq0.d.setTextSize(f);
       e0 tr = this.r;
       a tf1 = this.f;
       d = tf1.f;
       b g = tf1.g;
       e = tf1.h;
       Objects.requireNonNull(tr);
       if (d != null) {
          tr.b.setLabel(d);
       }
       if (g != null) {
          tr.c.setLabel(g);
       }
       if (e != null) {
          tr.d.setLabel(e);
       }
       tr = this.r;
       tf1 = this.f;
       tr.b.setTextXOffset(tf1.l);
       tr.c.setTextXOffset(tf1.m);
       tr.d.setTextXOffset(tf1.n);
       tr = this.r;
       tf1 = this.f;
       tr.b.setCyclic(tf1.o);
       tr.c.setCyclic(tf1.p);
       tr.d.setCyclic(tf1.q);
       tr = this.r;
       e = this.f.k0;
       tr.b.setTypeface(e);
       tr.c.setTypeface(e);
       tr.d.setTypeface(e);
       this.j(this.f.i0);
       tr = this.r;
       e = this.f.e0;
       tr.o = e;
       tr.b.setDividerColor(e);
       tr.c.setDividerColor(tr.o);
       tr.d.setDividerColor(tr.o);
       tr = this.r;
       e = this.f.l0;
       tr.p = e;
       tr.b.setDividerType(e);
       tr.c.setDividerType(tr.p);
       tr.d.setDividerType(tr.p);
       tr = this.r;
       e = this.f.g0;
       tr.q = e;
       tr.b.setLineSpacingMultiplier(e);
       tr.c.setLineSpacingMultiplier(tr.q);
       tr.d.setLineSpacingMultiplier(tr.q);
       tr = this.r;
       e = this.f.c0;
       tr.m = e;
       tr.b.setTextColorOut(e);
       tr.c.setTextColorOut(tr.m);
       tr.d.setTextColorOut(tr.m);
       tr = this.r;
       e = this.f.d0;
       tr.n = e;
       tr.b.setTextColorCenter(e);
       tr.c.setTextColorCenter(tr.n);
       tr.d.setTextColorCenter(tr.n);
       tr = this.r;
       e = this.f.j0;
       tr.b.e(e);
       tr.c.e(e);
       tr.d.e(e);
       return;
    }
    public boolean f(){
       return this.f.h0;
    }
    public void l(){
       if (this.f.a != null) {
          e0 tr = this.r;
          int[] ointArray = new int[3];
          int i = 0;
          ointArray[0] = tr.b.getCurrentItem();
          q0 f = tr.f;
          int i1 = 1;
          if (f != null && f.size() > 0) {
             int i2 = (tr.c.getCurrentItem() > (tr.f.get(ointArray[i]).size() - i1))? 0: tr.c.getCurrentItem();
             ointArray[i1] = i2;
          }else {
             ointArray[i1] = tr.c.getCurrentItem();
          }
          f = tr.g;
          if (f != null && f.size() > 0) {
             int i3 = (tr.d.getCurrentItem() > (tr.g.get(ointArray[i]).get(ointArray[i1]).size() - i1))? 0: tr.d.getCurrentItem();
             ointArray[2] = i3;
          }else {
             ointArray[2] = tr.d.getCurrentItem();
          }
          this.f.a.a(ointArray[i], ointArray[i1], ointArray[2], this.n);
       }
       return;
    }
    public void m(List p0){
       e0 tr = this.r;
       tr.e = p0;
       tr.f = null;
       tr.g = null;
       tr.b.setAdapter(new a(p0));
       int i = 0;
       tr.b.setCurrentItem(i);
       q0 f = tr.f;
       if (f != null) {
          tr.c.setAdapter(new a(f.get(i)));
       }
       f = tr.c;
       f.setCurrentItem(f.getCurrentItem());
       f = tr.g;
       if (f != null) {
          tr.d.setAdapter(new a(f.get(i).get(i)));
       }
       f = tr.d;
       f.setCurrentItem(f.getCurrentItem());
       tr.b.setIsOptions(true);
       tr.c.setIsOptions(true);
       tr.d.setIsOptions(true);
       int i1 = 8;
       if (tr.f == null) {
          tr.c.setVisibility(i1);
       }else {
          tr.c.setVisibility(i);
       }
       if (tr.g == null) {
          tr.d.setVisibility(i1);
       }else {
          tr.d.setVisibility(i);
       }
       tr.j = new o0(tr);
       tr.k = new p0(tr);
       if (tr.h != null) {
          tr.b.setOnItemSelectedListener(tr.j);
       }
       e0 tr1 = this.r;
       if (tr1 != null) {
          a tf = this.f;
          b i2 = tf.i;
          b j = tf.j;
          b k = tf.k;
          if (tr1.h != null) {
             if (tr1.e != null) {
                tr1.b.setCurrentItem(i2);
             }
             q0 f1 = tr1.f;
             if (f1 != null) {
                tr1.c.setAdapter(new a(f1.get(i2)));
                tr1.c.setCurrentItem(j);
             }
             f1 = tr1.g;
             if (f1 != null) {
                tr1.d.setAdapter(new a(f1.get(i2).get(j)));
                tr1.d.setCurrentItem(k);
             }
          }else {
             tr1.b.setCurrentItem(i2);
             tr1.c.setCurrentItem(j);
             tr1.d.setCurrentItem(k);
          }
       }
       return;
    }
    public void onClick(View p0){
       if ((p0.getTag()).equals("submit")) {
          this.l();
       }
       this.a();
       return;
    }
}
