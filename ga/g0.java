package ga.g0;
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
import ga.v0;
import ga.f0;
import java.util.Calendar;
import java.lang.IllegalArgumentException;
import com.contrarywind.view.WheelView;
import com.contrarywind.view.WheelView$DividerType;
import fa.b;
import java.text.DateFormat;
import java.util.Date;
import ea.g;
import java.text.ParseException;
import java.util.Objects;
import java.lang.System;
import fa.c;
import aa.a;
import java.util.ArrayList;
import fa.a;
import java.util.List;
import ia.a;
import aa.b;
import ga.r0;
import ka.b;
import ga.s0;
import java.lang.RuntimeException;
import java.util.Arrays;
import ga.t0;
import ga.u0;

public class g0 extends a implements View$OnClickListener	// class@002062
{
    public v0 r;

    public void g0(b p0){
       b y;
       super(p0.Q);
       this.f = p0;
       p0 = p0.Q;
       this.h();
       this.e();
       this.d();
       b e = this.f.e;
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
       LinearLayout linearLayout = this.c(R.id.timepicker);
       linearLayout.setBackgroundColor(this.f.X);
       a tf = this.f;
       v0 ov0 = new v0(linearLayout, tf.t, tf.P, tf.b0);
       this.r = ov0;
       if (tf.c != null) {
          ov0.x = new f0(this);
       }
       g0 tr = this.r;
       a tf1 = this.f;
       tr.w = tf1.A;
       b x = tf1.x;
       if (x != null) {
          y = tf1.y;
          if (y != null && x <= y) {
             tr.j = x;
             tr.k = y;
          }
       }
       tr = tf1.v;
       if (tr != null && tf1.w != null) {
          if (tr.getTimeInMillis() - this.f.w.getTimeInMillis() <= 0) {
             this.n();
          }else {
             throw new IllegalArgumentException("startDate can\'t be later than endDate");
          }
       }else {
          int i = 1;
          if (tr != null) {
             if (tr.get(i) >= 1900) {
                this.n();
             }else {
                throw new IllegalArgumentException("The startDate can not as early as 1900");
             }
          }else {
             tr = tf1.w;
             if (tr != null) {
                if (tr.get(i) <= 2100) {
                   this.n();
                }else {
                   throw new IllegalArgumentException("The endDate should not be later than 2100");
                }
             }else {
                this.n();
             }
          }
       }
       this.o();
       tr = this.r;
       tf1 = this.f;
       x = tf1.B;
       y = tf1.C;
       b d = tf1.D;
       b e1 = tf1.E;
       b f = tf1.F;
       e = tf1.G;
       if (tr.w == null) {
          if (x != null) {
             tr.b.setLabel(x);
          }else {
             tr.b.setLabel(tr.a.getContext().getString(R.string.arg_RES_7f103c76));
          }
          if (y != null) {
             tr.c.setLabel(y);
          }else {
             tr.c.setLabel(tr.a.getContext().getString(R.string.arg_RES_7f103c73));
          }
          if (d != null) {
             tr.d.setLabel(d);
          }else {
             tr.d.setLabel(tr.a.getContext().getString(R.string.arg_RES_7f103c70));
          }
          if (e1 != null) {
             tr.e.setLabel(e1);
          }else {
             tr.e.setLabel(tr.a.getContext().getString(R.string.arg_RES_7f103c71));
          }
          if (f != null) {
             tr.f.setLabel(f);
          }else {
             tr.f.setLabel(tr.a.getContext().getString(R.string.arg_RES_7f103c72));
          }
          if (e != null) {
             tr.g.setLabel(e);
          }else {
             ov0 = tr.g;
             ov0.setLabel(tr.a.getContext().getString(R.string.arg_RES_7f103c74));
          }
       }
       tr = this.r;
       tf1 = this.f;
       e = tf1.M;
       tr.d.setTextXOffset(tf1.H);
       tr.c.setTextXOffset(tf1.I);
       tr.b.setTextXOffset(tf1.J);
       tr.e.setTextXOffset(tf1.K);
       tr.f.setTextXOffset(tf1.L);
       tr.g.setTextXOffset(e);
       this.j(this.f.i0);
       tr = this.r;
       e = this.f.z;
       tr.b.setCyclic(e);
       tr.c.setCyclic(e);
       tr.d.setCyclic(e);
       tr.e.setCyclic(e);
       tr.f.setCyclic(e);
       tr.g.setCyclic(e);
       tr = this.r;
       e = this.f.e0;
       tr.t = e;
       tr.d.setDividerColor(e);
       ov0 = tr.c;
       ov0.setDividerColor(tr.t);
       ov0 = tr.b;
       ov0.setDividerColor(tr.t);
       ov0 = tr.e;
       ov0.setDividerColor(tr.t);
       ov0 = tr.f;
       ov0.setDividerColor(tr.t);
       ov0 = tr.g;
       ov0.setDividerColor(tr.t);
       tr = this.r;
       e = this.f.l0;
       tr.v = e;
       tr.d.setDividerType(e);
       ov0 = tr.c;
       ov0.setDividerType(tr.v);
       ov0 = tr.b;
       ov0.setDividerType(tr.v);
       ov0 = tr.e;
       ov0.setDividerType(tr.v);
       ov0 = tr.f;
       ov0.setDividerType(tr.v);
       ov0 = tr.g;
       ov0.setDividerType(tr.v);
       tr = this.r;
       e = this.f.g0;
       tr.u = e;
       tr.d.setLineSpacingMultiplier(e);
       ov0 = tr.c;
       ov0.setLineSpacingMultiplier(tr.u);
       ov0 = tr.b;
       ov0.setLineSpacingMultiplier(tr.u);
       ov0 = tr.e;
       ov0.setLineSpacingMultiplier(tr.u);
       ov0 = tr.f;
       ov0.setLineSpacingMultiplier(tr.u);
       ov0 = tr.g;
       ov0.setLineSpacingMultiplier(tr.u);
       tr = this.r;
       e = this.f.c0;
       tr.r = e;
       tr.d.setTextColorOut(e);
       ov0 = tr.c;
       ov0.setTextColorOut(tr.r);
       ov0 = tr.b;
       ov0.setTextColorOut(tr.r);
       ov0 = tr.e;
       ov0.setTextColorOut(tr.r);
       ov0 = tr.f;
       ov0.setTextColorOut(tr.r);
       ov0 = tr.g;
       ov0.setTextColorOut(tr.r);
       tr = this.r;
       e = this.f.d0;
       tr.s = e;
       tr.d.setTextColorCenter(e);
       ov0 = tr.c;
       ov0.setTextColorCenter(tr.s);
       ov0 = tr.b;
       ov0.setTextColorCenter(tr.s);
       ov0 = tr.e;
       ov0.setTextColorCenter(tr.s);
       ov0 = tr.f;
       ov0.setTextColorCenter(tr.s);
       ov0 = tr.g;
       ov0.setTextColorCenter(tr.s);
       tr = this.r;
       e = this.f.j0;
       tr.d.e(e);
       tr.c.e(e);
       tr.b.e(e);
       tr.e.e(e);
       tr.f.e(e);
       tr.g.e(e);
       return;
    }
    public boolean f(){
       return this.f.h0;
    }
    public void l(){
       if (this.f.b != null) {
          try{
             this.f.b.a(b.b.a().parse(this.r.a()), this.n);
          }catch(java.text.ParseException e0){
             e0.printStackTrace();
          }
       }
    }
    public void m(Calendar p0){
       this.f.u = p0;
       this.o();
    }
    public final void n(){
       int i2;
       int i3;
       v0 j;
       g0 tr = this.r;
       a tf = this.f;
       b v = tf.v;
       b w = tf.w;
       Objects.requireNonNull(tr);
       int i = 5;
       int i1 = 2;
       if (v == null && w != null) {
          i2 = w.get(1);
          i1 = w.get(i1) + 1;
          i3 = w.get(i);
          j = tr.j;
          if (i2 > j) {
             tr.k = i2;
             tr.m = i1;
             tr.o = i3;
          }else if(i2 == j){
             j = tr.l;
             if (i1 > j) {
                tr.k = i2;
                tr.m = i1;
                tr.o = i3;
             }else if(i1 == j && i3 > tr.n){
                tr.k = i2;
                tr.m = i1;
                tr.o = i3;
             }
          }
       }else if(v != null && w == null){
          i3 = v.get(1);
          i1 = v.get(i1) + 1;
          i2 = v.get(i);
          j = tr.k;
          if (i3 < j) {
             tr.l = i1;
             tr.n = i2;
             tr.j = i3;
          }else if(i3 == j){
             j = tr.m;
             if (i1 < j) {
                tr.l = i1;
                tr.n = i2;
                tr.j = i3;
             }else if(i1 == j && i2 < tr.o){
                tr.l = i1;
                tr.n = i2;
                tr.j = i3;
             }
          }
       }else if(v != null && w != null){
          tr.j = v.get(1);
          tr.k = w.get(1);
          tr.l = v.get(i1) + 1;
          tr.m = w.get(i1) + 1;
          tr.n = v.get(i);
          tr.o = w.get(i);
       }
       a tf1 = this.f;
       w = tf1.v;
       if (w != null && tf1.w != null) {
          b u = tf1.u;
          if (u != null && (u.getTimeInMillis() - this.f.v.getTimeInMillis() < 0 || this.f.u.getTimeInMillis() - this.f.w.getTimeInMillis() > 0)) {
             tf1 = this.f;
             tf1.u = tf1.v;
          }
       }else if(w != null){
          tf1.u = w;
       }else {
          w = tf1.w;
          if (w != null) {
             tf1.u = w;
          }
       }
       return;
    }
    public final void o(){
       int i6;
       int i7;
       int i8;
       int i9;
       int i10;
       v0 ov0;
       WheelView wheelView;
       v0 b;
       a uoa = this;
       Calendar instance = Calendar.getInstance();
       b u = uoa.f.u;
       int i = 13;
       int i1 = 11;
       int i2 = 12;
       int i3 = 2;
       int i4 = 5;
       int i5 = 1;
       if (u == null) {
          instance.setTimeInMillis(System.currentTimeMillis());
          i6 = instance.get(i5);
          i7 = instance.get(i3);
          i8 = instance.get(i4);
          i1 = instance.get(i1);
          i9 = instance.get(i2);
          i10 = instance.get(i);
       }else {
          i6 = u.get(i5);
          i7 = uoa.f.u.get(i3);
          i8 = uoa.f.u.get(i4);
          i1 = uoa.f.u.get(i1);
          i9 = uoa.f.u.get(i2);
          i10 = uoa.f.u.get(i);
       }
       g0 r = uoa.r;
       int i11 = 0x7f0a0a50;
       int i12 = 0x7f0a2be8;
       i2 = 0x7f0a45f6;
       i4 = 0;
       if (r.w != null) {
          int[] ointArray = c.d(i6, (i7 + i5), i8);
          i6 = ointArray[i4];
          i7 = ointArray[i5] - i5;
          i8 = ointArray[i3];
          ov0 = (ointArray[3] == i5)? 1: null;
          wheelView = r.a.findViewById(i2);
          r.b = wheelView;
          wheelView.setAdapter(new a(a.c(r.j, r.k)));
          String str = "";
          r.b.setLabel(str);
          r.b.setCurrentItem((i6 - r.j));
          r.b.setGravity(r.h);
          wheelView = r.a.findViewById(i12);
          r.c = wheelView;
          wheelView.setAdapter(new a(a.b(i6)));
          r.c.setLabel(str);
          i2 = a.e(i6);
          if (i2 && (i7 > (i2 - i5) || ov0)) {
             r.c.setCurrentItem((i7 + 1));
          }else {
             r.c.setCurrentItem(i7);
          }
          r.c.setGravity(r.h);
          r.d = r.a.findViewById(i11);
          if (!a.e(i6)) {
             r.d.setAdapter(new a(a.a(a.f(i6, i7))));
          }else {
             r.d.setAdapter(new a(a.a(a.d(i6))));
          }
          r.d.setLabel(str);
          r.d.setCurrentItem((i8 - i5));
          r.d.setGravity(r.h);
          WheelView wheelView1 = r.a.findViewById(R.id.hour);
          r.e = wheelView1;
          wheelView1.setAdapter(new b(0, 23));
          r.e.setCurrentItem(i1);
          r.e.setGravity(r.h);
          wheelView1 = r.a.findViewById(R.id.min);
          r.f = wheelView1;
          wheelView1.setAdapter(new b(0, 59));
          r.f.setCurrentItem(i9);
          r.f.setGravity(r.h);
          wheelView1 = r.a.findViewById(R.id.second);
          r.g = wheelView1;
          wheelView1.setAdapter(new b(0, 59));
          r.g.setCurrentItem(i9);
          r.g.setGravity(r.h);
          r.b.setOnItemSelectedListener(new r0(r));
          r.c.setOnItemSelectedListener(new s0(r));
          r.b(r.d);
          r.b(r.e);
          r.b(r.f);
          r.b(r.g);
          ov0 = r.i;
          if (ov0.length == 6) {
             b = r.b;
             i10 = (ov0[0])? 0: 8;
             b.setVisibility(i10);
             ov0 = r.c;
             i6 = (r.i[i5])? 0: 8;
             ov0.setVisibility(i6);
             ov0 = r.d;
             i6 = (r.i[2])? 0: 8;
             ov0.setVisibility(i6);
             ov0 = r.e;
             i6 = (r.i[3])? 0: 8;
             ov0.setVisibility(i6);
             ov0 = r.f;
             i6 = (r.i[4])? 0: 8;
             ov0.setVisibility(i6);
             ov0 = r.g;
             i6 = (r.i[5])? 0: 8;
             ov0.setVisibility(i6);
             r.c();
          }else {
             throw new RuntimeException("type[] length is not 6");
          }
       }else {
          String[] stringArray = new String[]{"1","3","5","7","8","10","12"};
          String[] stringArray1 = new String[]{"4","6","9","11"};
          List list = Arrays.asList(stringArray);
          List list1 = Arrays.asList(stringArray1);
          r.p = i6;
          wheelView = r.a.findViewById(i2);
          r.b = wheelView;
          wheelView.setAdapter(new b(r.j, r.k));
          r.b.setCurrentItem((i6 - r.j));
          r.b.setGravity(r.h);
          wheelView = r.a.findViewById(i12);
          r.c = wheelView;
          v0 j = r.j;
          v0 k = r.k;
          if (j == k) {
             wheelView.setAdapter(new b(r.l, r.m));
             r.c.setCurrentItem(((i7 + 1) - r.l));
          }else if(i6 == j){
             wheelView.setAdapter(new b(r.l, 12));
             r.c.setCurrentItem(((i7 + 1) - r.l));
          }else if(i6 == k){
             wheelView.setAdapter(new b(1, r.m));
             r.c.setCurrentItem(i7);
          }else {
             wheelView.setAdapter(new b(1, 12));
             r.c.setCurrentItem(i7);
          }
          r.c.setGravity(r.h);
          r.d = r.a.findViewById(0x7f0a0a50);
          v0 j1 = r.j;
          j = r.k;
          if (j1 == j && r.l == r.m) {
             i7 = i7 + 1;
             if (list.contains(String.valueOf(i7))) {
                if (r.o > 31) {
                   r.o = 31;
                }
                r.d.setAdapter(new b(r.n, r.o));
             }else if(list1.contains(String.valueOf(i7))){
                i2 = 30;
                if (r.o > i2) {
                   r.o = i2;
                }
                r.d.setAdapter(new b(r.n, r.o));
             }else if((i6 % 4) || ((i6 % 100) || !(i6 % 400))){
                i2 = 29;
                if (r.o > i2) {
                   r.o = i2;
                }
                r.d.setAdapter(new b(r.n, r.o));
             }else {
                i2 = 28;
                if (r.o > i2) {
                   r.o = i2;
                }
                r.d.setAdapter(new b(r.n, r.o));
             }
             r.d.setCurrentItem((i8 - r.n));
          }else if(i6 == j1){
             i2 = i7 + 1;
             if (i2 == r.l) {
                if (list.contains(String.valueOf(i2))) {
                   r.d.setAdapter(new b(r.n, 31));
                }else if(list1.contains(String.valueOf(i2))){
                   r.d.setAdapter(new b(r.n, 30));
                }else if((i6 % 4) || ((i6 % 100) || !(i6 % 400))){
                   r.d.setAdapter(new b(r.n, 29));
                }else {
                   r.d.setAdapter(new b(r.n, 28));
                }
                r.d.setCurrentItem((i8 - r.n));
             }
          }
          if (i6 == j) {
             i2 = i7 + 1;
             if (i2 == r.m) {
                if (list.contains(String.valueOf(i2))) {
                   if (r.o > 31) {
                      r.o = 31;
                   }
                   r.d.setAdapter(new b(1, r.o));
                label_0426 :
                   k = 1;
                }else if(list1.contains(String.valueOf(i2))){
                   i2 = 30;
                   if (r.o > i2) {
                      r.o = i2;
                   }
                   r.d.setAdapter(new b(1, r.o));
                   goto label_0426 ;
                }else if((i6 % 4) || ((i6 % 100) || !(i6 % 400))){
                   i2 = 29;
                   if (r.o > i2) {
                      r.o = i2;
                   }
                   r.d.setAdapter(new b(1, r.o));
                }else {
                   i2 = 28;
                   if (r.o > i2) {
                      r.o = i2;
                   }
                   r.d.setAdapter(new b(1, r.o));
                }
                r.d.setCurrentItem((i8 - 1));
             }
          }
          i7 = i7 + 1;
          if (list.contains(String.valueOf(i7))) {
             r.d.setAdapter(new b(1, 31));
          }else if(list1.contains(String.valueOf(i7))){
             r.d.setAdapter(new b(1, 30));
          }else if((i6 % 4) || ((i6 % 100) || !(i6 % 400))){
             r.d.setAdapter(new b(1, 29));
          }else {
             r.d.setAdapter(new b(1, 28));
          }
          r.d.setCurrentItem((i8 - 1));
          r.d.setGravity(r.h);
          WheelView wheelView2 = r.a.findViewById(R.id.hour);
          r.e = wheelView2;
          wheelView2.setAdapter(new b(0, 23));
          r.e.setCurrentItem(i1);
          r.e.setGravity(r.h);
          wheelView2 = r.a.findViewById(R.id.min);
          r.f = wheelView2;
          wheelView2.setAdapter(new b(0, 59));
          r.f.setCurrentItem(i9);
          r.f.setGravity(r.h);
          wheelView2 = r.a.findViewById(R.id.second);
          r.g = wheelView2;
          wheelView2.setAdapter(new b(0, 59));
          r.g.setCurrentItem(i10);
          r.g.setGravity(r.h);
          r.b.setOnItemSelectedListener(new t0(r, list, list1));
          r.c.setOnItemSelectedListener(new u0(r, list, list1));
          r.b(r.d);
          r.b(r.e);
          r.b(r.f);
          r.b(r.g);
          ov0 = r.i;
          if (ov0.length == 6) {
             b = r.b;
             i3 = 0;
             i10 = (ov0[i3])? 0: 8;
             b.setVisibility(i10);
             ov0 = r.c;
             i6 = (r.i[1])? 0: 8;
             ov0.setVisibility(i6);
             ov0 = r.d;
             i6 = (r.i[2])? 0: 8;
             ov0.setVisibility(i6);
             ov0 = r.e;
             i6 = (r.i[3])? 0: 8;
             ov0.setVisibility(i6);
             ov0 = r.f;
             i6 = (r.i[4])? 0: 8;
             ov0.setVisibility(i6);
             ov0 = r.g;
             if (!r.i[5]) {
                i3 = 8;
             }
             ov0.setVisibility(i3);
             r.c();
          }else {
             throw new IllegalArgumentException("type[] length is not 6");
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
