package com.yxcorp.gifshow.util.ColorURLSpan;
import lnc.o7;
import hya.d;
import android.text.style.URLSpan;
import java.lang.String;
import android.view.View;
import android.view.View$OnClickListener;
import android.view.View$OnLongClickListener;
import java.lang.ref.WeakReference;
import java.lang.Object;
import android.app.Activity;
import e3a.a;
import cya.d;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.mix.QComment;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import o56.a;
import android.content.Context;
import ync.a;

public class ColorURLSpan extends URLSpan implements o7, d	// class@001eda
{
    public int b;
    public int c;
    public String d;
    public String e;
    public boolean f;
    public int g;
    public int h;
    public int i;
    public int j;
    public QPhoto k;
    public QComment l;
    public View$OnClickListener m;
    public String mElementName;
    public View$OnLongClickListener n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;
    public boolean t;
    public static int u;

    public void ColorURLSpan(String p0,String p1){
       super(p0);
       this.d = null;
       this.f = false;
       this.g = -1;
       this.h = -1;
       this.i = -1;
       this.j = -1;
       this.p = true;
       this.r = false;
       this.s = false;
       this.t = false;
       this.e = p1;
    }
    public void ColorURLSpan(String p0,String p1,String p2){
       super(p0);
       this.d = null;
       this.f = false;
       this.g = -1;
       this.h = -1;
       this.i = -1;
       this.j = -1;
       this.p = true;
       this.r = false;
       this.s = false;
       this.t = false;
       this.d = p1;
       this.e = p2;
    }
    public void a(View p0,boolean p1){
       this.o = p1;
       p0.invalidate();
    }
    public String b(){
       return this.e;
    }
    public ColorURLSpan c(int p0,int p1){
       this.i = p0;
       this.j = p1;
       return this;
    }
    public ColorURLSpan d(int p0,int p1){
       this.g = p0;
       this.h = p1;
       return this;
    }
    public ColorURLSpan e(boolean p0){
       this.s = p0;
       return this;
    }
    public ColorURLSpan f(boolean p0){
       this.p = p0;
       return this;
    }
    public ColorURLSpan g(int p0){
       this.b = p0;
       return this;
    }
    public ColorURLSpan h(String p0){
       this.mElementName = p0;
       return this;
    }
    public ColorURLSpan i(View$OnClickListener p0){
       this.m = p0;
       return this;
    }
    public ColorURLSpan j(View$OnLongClickListener p0){
       this.n = p0;
       return this;
    }
    public ColorURLSpan k(boolean p0){
       this.q = p0;
       return this;
    }
    public ColorURLSpan l(int p0){
       this.c = p0;
       return this;
    }
    public ColorURLSpan m(boolean p0){
       this.f = p0;
       return this;
    }
    public void onClick(View p0){
       if (this.p != null) {
          if (this.c != null) {
             this.a(p0, false);
          }
          p0.setTag(R.id.open_url, new WeakReference(this));
          a.a(p0);
          d uod = new d(this.getURL(), this.b());
          uod.g(this.d);
          uod.l(this.k);
          uod.m(this.f);
          uod.i(this.mElementName);
          uod.h(this.l);
          uod.i = this.r;
          uod.k(this.q);
          uod.e(this.g, this.h);
          uod.d(this.i, this.j);
          uod.j(this.t);
          uod.a(p0);
       }
       ColorURLSpan tm = this.m;
       if (tm != null) {
          tm.onClick(p0);
       }
       return;
    }
    public boolean onLongClick(View p0){
       ColorURLSpan tn = this.n;
       if (tn != null) {
          return tn.onLongClick(p0);
       }
       return false;
    }
    public void updateDrawState(TextPaint p0){
       super.updateDrawState(p0);
       p0.setUnderlineText(false);
       if (!ColorURLSpan.u) {
          ColorURLSpan.u = a.d(a.B);
       }
       ColorURLSpan tb = this.b;
       if (tb == null) {
          p0.setColor(ColorURLSpan.u);
       }else if(this.o != null){
          ColorURLSpan tc = this.c;
          if (tc != null) {
             tb = tc;
          }
       }
       p0.setColor(tb);
       p0.setFakeBoldText(this.s);
       return;
    }
}
