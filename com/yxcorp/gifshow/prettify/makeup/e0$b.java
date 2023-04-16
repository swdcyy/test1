package com.yxcorp.gifshow.prettify.makeup.e0$b;
import ekd.f$j;
import java.util.List;
import android.view.View;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.utility.n;
import java.util.Collection;
import ekd.q;
import java.util.Iterator;
import android.graphics.drawable.Drawable;

public class e0$b extends f$j	// class@001175
{
    public Drawable a;
    public final List b;
    public final View c;
    public final View d;
    public final View e;
    public final List f;

    public void e0$b(List p0,View p1,View p2,View p3,List p4){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       super();
    }
    public void onAnimationCancel(Animator p0){
       Iterator iterator;
       View view;
       if (PatchProxy.applyVoidOneRefs(p0, this, e0$b.class, "3")) {
          return;
       }
       n.Y(this.c, 4, false);
       n.Y(this.e, false, false);
       float f = 0;
       if (!q.f(this.f)) {
          iterator = this.f.iterator();
          while (iterator.hasNext()) {
             view = iterator.next();
             if (view == null) {
                continue ;
             }
             view.setAlpha(0x3f800000);
             view.setTranslationX(f);
          }
       }
       if (!q.f(this.b)) {
          iterator = this.b.iterator();
          while (iterator.hasNext()) {
             view = iterator.next();
             if (view == null) {
                continue ;
             }
             view.setAlpha(0x3f800000);
             view.setTranslationX(f);
          }
       }
       e0$b td = this.d;
       if (td != null) {
          e0$b ta = this.a;
          if (ta != null) {
             td.setBackground(ta);
          }
       }
       p0.removeAllListeners();
       return;
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e0$b.class, "2")) {
          return;
       }
       n.Y(this.e, 4, false);
       if (!q.f(this.f)) {
          Iterator iterator = this.f.iterator();
          while (iterator.hasNext()) {
             View view = iterator.next();
             if (view == null) {
                continue ;
             }
             view.setVisibility(8);
             view.setAlpha(0x3f800000);
             view.setTranslationX(0);
          }
       }
       e0$b td = this.d;
       if (td != null) {
          e0$b ta = this.a;
          if (ta != null) {
             td.setBackground(ta);
          }
       }
       return;
    }
    public void onAnimationStart(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e0$b.class, "1")) {
          return;
       }
       int i = 0;
       if (!q.f(this.b)) {
          Iterator iterator = this.b.iterator();
          while (iterator.hasNext()) {
             View view = iterator.next();
             if (view == null) {
                continue ;
             }
             n.Y(view, i, i);
          }
       }
       n.Y(this.c, i, i);
       e0$b td = this.d;
       if (td != null) {
          this.a = td.getBackground();
          this.d.setBackground(null);
       }
       return;
    }
}
