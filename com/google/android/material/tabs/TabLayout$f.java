package com.google.android.material.tabs.TabLayout$f;
import java.lang.Object;
import android.view.View;
import android.graphics.drawable.Drawable;
import java.lang.CharSequence;
import com.google.android.material.tabs.TabLayout;
import java.lang.IllegalArgumentException;
import java.lang.String;
import android.content.Context;
import android.widget.LinearLayout;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import ag6.a;
import android.text.TextUtils;
import com.google.android.material.tabs.TabLayout$TabView;

public class TabLayout$f	// class@0016ce
{
    public Object a;
    public Drawable b;
    public CharSequence c;
    public CharSequence d;
    public int e;
    public View f;
    public TabLayout g;
    public TabLayout$TabView h;

    public void TabLayout$f(){
       super();
       this.e = -1;
    }
    public View a(){
       return this.f;
    }
    public Drawable b(){
       return this.b;
    }
    public int c(){
       return this.e;
    }
    public Object d(){
       return this.a;
    }
    public CharSequence e(){
       return this.c;
    }
    public boolean f(){
       TabLayout$f tg = this.g;
       if (tg == null) {
          throw new IllegalArgumentException("Tab not attached to a TabLayout");
       }
       boolean b = (tg.getSelectedTabPosition() == this.e)? true: false;
       return b;
    }
    public void g(){
       this.g = null;
       this.h = null;
       this.a = null;
       this.b = null;
       this.c = null;
       this.d = null;
       this.e = -1;
       this.f = null;
    }
    public void h(){
       TabLayout$f tg = this.g;
       if (tg == null) {
          throw new IllegalArgumentException("Tab not attached to a TabLayout");
       }
       tg.selectTab(this);
       return;
    }
    public TabLayout$f i(CharSequence p0){
       this.d = p0;
       this.p();
       return this;
    }
    public TabLayout$f j(int p0){
       this.k(a.c(LayoutInflater.from(this.h.getContext()), p0, this.h, false));
       return this;
    }
    public TabLayout$f k(View p0){
       this.f = p0;
       this.p();
       return this;
    }
    public TabLayout$f l(Drawable p0){
       this.b = p0;
       this.p();
       return this;
    }
    public void m(int p0){
       this.e = p0;
    }
    public TabLayout$f n(Object p0){
       this.a = p0;
       return this;
    }
    public TabLayout$f o(CharSequence p0){
       if (TextUtils.isEmpty(this.d) && !TextUtils.isEmpty(p0)) {
          this.h.setContentDescription(p0);
       }
       this.c = p0;
       this.p();
       return this;
    }
    public void p(){
       TabLayout$f th = this.h;
       if (th != null) {
          th.d();
       }
       return;
    }
}
