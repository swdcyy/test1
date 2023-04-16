package com.yxcorp.plugin.search.result.reduce.presenter.c;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import android.view.ViewTreeObserver;
import com.yxcorp.plugin.search.result.reduce.presenter.c$a;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import hed.i;
import android.view.View$OnLayoutChangeListener;
import android.content.Context;
import com.yxcorp.utility.n;
import lnc.a1;
import android.app.Activity;
import android.graphics.Rect;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.view.ViewGroup;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import nfd.t0;
import j06.c;
import ekd.m1;
import androidx.recyclerview.widget.RecyclerView;

public class c extends PresenterV2	// class@002330
{
    public View$OnLayoutChangeListener A;
    public boolean p;
    public View q;
    public View r;
    public View s;
    public RecyclerView t;
    public Rect u;
    public Rect v;
    public int w;
    public int x;
    public int y;
    public int z;

    public void c(boolean p0){
       super();
       this.p = p0;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, c.class, "4")) {
          return;
       }
       this.m8().getViewTreeObserver().addOnGlobalLayoutListener(new c$a(this));
       this.A = new i(this);
       this.m8().addOnLayoutChangeListener(this.A);
       return;
    }
    public void F8(){
       if (PatchProxy.applyVoid(null, this, c.class, "3")) {
          return;
       }
       this.y = n.A(this.getContext());
       this.w = a1.d(0x7f070e54);
       this.z = a1.e(15.00f);
       this.x = n.j(this.getActivity());
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, c.class, "5")) {
          return;
       }
       this.m8().removeOnLayoutChangeListener(this.A);
       return;
    }
    public void P8(View p0){
       int i2;
       int i4;
       c uoc = c.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uoc, "6")) {
          return;
       }
       int i = 0;
       int top = (p0 != null && p0.getTop() > 0)? p0.getTop(): 0;
       int i1 = this.s.getHeight() + this.q.getHeight();
       c tv = this.v;
       Rect top1 = tv.top;
       c tw = this.w;
       c ty = this.y;
       if (top1 < (tw + ty)) {
          i2 = ((tw + ty) + tv.bottom) / 2;
       }else if(top1 >= (tw + ty)){
          Rect bottom = tv.bottom;
          if (bottom <= this.x) {
             i2 = (top1 + bottom) / 2;
          }
       }
       i2 = ((top1 + this.x) + ty) / 2;
       ty = 1;
       if (this.q.getVisibility() == 4 || this.r.getVisibility() == 4) {
          if (this.r.getVisibility() != 4) {
          label_00a1 :
             ty = 0;
          }
       }else {
          int i3 = ((this.y + i1) + this.z) + this.w;
          Object obj = PatchProxy.apply(null, this, uoc, "7");
          if (obj != PatchProxyResult.class) {
             i4 = obj.intValue();
          }else {
             uoc = this.t;
             i4 = (uoc == null || uoc.getChildCount() <= 0)? 0: this.t.getChildAt(i).getHeight() + this.t.getLayoutParams().topMargin;
          }
          if ((i3 + i4) <= i2) {
          }
       }
       if (this.p != null) {
          i = (int)((((double)tv.height() * 0x3fe0000000000000) + (double)this.y) + (double)t0.e);
       }
       i2 = (ty)? (i2 - this.y) + i: (i2 - i1) - this.y;
       c tz = this.z;
       c tx = this.x;
       if (((i2 + i1) + tz) > tx) {
          i2 = (tx - i1) - tz;
       }
       i2 = i2 - top;
       float f = 139.00f;
       if (i2 < a1.e(f)) {
          i2 = a1.e(f);
       }
       p0.setTranslationY((float)i2);
       uoc = (ty)? this.q: this.r;
       tz = (ty)? this.r: this.q;
       float f1 = (float)((tv.left + tv.right) / 2);
       uoc.setX((f1 - (float)(uoc.getWidth() / 2)));
       tz.setVisibility(4);
       tz = 0;
       float f2 = (ty)? 0: (float)i1;
       if ((c.a() - p0.getWidth()) > 0) {
          float f3 = (float)p0.getWidth() * 0x3f000000;
          float f4 = f1 - f3;
          if (f4 - tz > 0) {
             float f5 = f1 + f3;
             if (f5 - (float)c.a() > 0) {
                f4 = f4 - (f5 - (float)c.a());
                uoc.setX(((float)(p0.getWidth() - c.a()) + f1));
             }else {
                uoc.setX(f3);
             }
             p0.setTranslationX(f4);
          }
       }
       p0.setPivotX(f1);
       p0.setPivotY(f2);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "2")) {
          return;
       }
       this.r = m1.f(p0, 0x7f0a023c);
       this.s = m1.f(p0, 0x7f0a0b73);
       this.q = m1.f(p0, 0x7f0a0240);
       this.t = m1.f(p0, 0x7f0a0955);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, c.class, "1")) {
          return;
       }
       this.u = this.r8("SEARCH_REDUCE_ANCHOR_RECT");
       this.v = this.r8("SEARCH_REDUCE_SOURCE_VIEW_RECT");
       return;
    }
}
