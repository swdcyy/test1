package com.hhh.smartwidget.popup.c$a;
import android.app.Activity;
import java.lang.Object;
import com.hhh.smartwidget.popup.PopupInterface$Excluded;
import com.hhh.smartwidget.a;
import com.hhh.smartwidget.SystemBarInfo;
import android.view.Window;
import android.view.View;
import android.view.ViewGroup;
import android.content.res.Resources;
import java.lang.String;
import com.hhh.smartwidget.popup.c;
import android.graphics.drawable.Drawable;
import com.hhh.smartwidget.popup.PopupInterface$b;
import com.hhh.smartwidget.popup.PopupInterface$d;
import com.hhh.smartwidget.popup.PopupInterface$f;

public class c$a	// class@000597
{
    public final Activity a;
    public int b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public long h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public Drawable o;
    public Bundle p;
    public Object q;
    public String r;
    public PopupInterface$Excluded s;
    public PopupInterface$d t;
    public PopupInterface$f u;
    public PopupInterface$c v;
    public PopupInterface$b w;
    public PopupInterface$b x;

    public void c$a(Activity p0){
       super();
       this.b = -1;
       boolean b = true;
       this.c = b;
       this.d = b;
       this.e = b;
       this.h = -1;
       this.i = Integer.MAX_VALUE;
       this.j = Integer.MAX_VALUE;
       this.r = "popup_type_popup";
       this.s = PopupInterface$Excluded.NOT_AGAINST;
       this.a = p0;
       if (!a.h()) {
          this.k = a.d(p0);
          SystemBarInfo systemBarInf = new SystemBarInfo();
          ViewGroup decorView = p0.getWindow().getDecorView();
          int childCount = decorView.getChildCount();
          int i = 0;
          int i1 = 0;
          while (i1 < childCount) {
             View childAt = decorView.getChildAt(i1);
             if (childAt.getId() == 0x1020030) {
                systemBarInf.b = b;
                if (a.h()) {
                   systemBarInf.c = childAt.getWidth();
                   break ;
                }else {
                   systemBarInf.c = childAt.getHeight();
                   break ;
                }
             }
             i1 = i1 + 1;
          }
          if (systemBarInf.b != null) {
             SystemBarInfo c = systemBarInf.c;
             if (c <= null) {
                c = a.b(a.c().getIdentifier("navigation_bar_height", "dimen", "android"));
             }
             i = c;
          }
          this.l = i;
       }
       return;
    }
    public c a(){
       return new c(this);
    }
    public c$a b(Drawable p0){
       this.o = p0;
       return this;
    }
    public c$a c(int p0){
       this.l = p0;
       return this;
    }
    public c$a d(boolean p0){
       this.c = p0;
       return this;
    }
    public c$a e(boolean p0){
       this.e = p0;
       return this;
    }
    public c$a f(PopupInterface$b p0){
       this.w = p0;
       return this;
    }
    public c$a g(PopupInterface$d p0){
       this.t = p0;
       return this;
    }
    public c$a h(PopupInterface$b p0){
       this.x = p0;
       return this;
    }
    public c$a i(int p0){
       this.b = p0;
       return this;
    }
    public c$a j(long p0){
       this.h = p0;
       return this;
    }
    public c$a k(int p0){
       this.k = p0;
       return this;
    }
    public final c l(PopupInterface$f p0){
       c uoc = this.a();
       uoc.b.u = p0;
       uoc.q();
       return uoc;
    }
}
