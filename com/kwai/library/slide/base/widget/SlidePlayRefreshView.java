package com.kwai.library.slide.base.widget.SlidePlayRefreshView;
import com.kwai.library.widget.refresh.RefreshLayout;
import android.content.Context;
import android.util.AttributeSet;
import ekd.i;
import com.yxcorp.utility.n;
import lnc.a1;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.library.widget.refresh.KwaiRefreshView;
import android.view.ViewGroup;
import android.view.MotionEvent;
import o17.b;
import o17.a;
import com.kwai.library.widget.refresh.RefreshLayout$LayoutParams;
import android.content.res.Resources;
import cw9.c;

public class SlidePlayRefreshView extends RefreshLayout	// class@0008f1
{

    public void SlidePlayRefreshView(Context p0){
       super(p0, null);
    }
    public void SlidePlayRefreshView(Context p0,AttributeSet p1){
       super(p0, p1);
       if (i.c()) {
          this.setRefreshInitialOffset((float)((- n.A(p0)) - a1.d(R.dimen.arg_RES_7f0702e8)));
       }
       return;
    }
    public View B(AttributeSet p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, SlidePlayRefreshView.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new KwaiRefreshView(this.getContext(), p0);
    }
    public void a(MotionEvent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SlidePlayRefreshView.class, "6")) {
          return;
       }
       if (!this.u()) {
          super.onTouchEvent(p0);
       }
       return;
    }
    public void b(MotionEvent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SlidePlayRefreshView.class, "5")) {
          return;
       }
       if (!this.u()) {
          super.onInterceptTouchEvent(p0);
       }
       return;
    }
    public void l(AttributeSet p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SlidePlayRefreshView.class, "3")) {
          return;
       }
       super.l(p0);
       return;
    }
    public boolean onInterceptTouchEvent(MotionEvent p0){
       return false;
    }
    public boolean onTouchEvent(MotionEvent p0){
       return false;
    }
    public b y(){
       Object obj = PatchProxy.apply(null, this, SlidePlayRefreshView.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new a(this.getContext());
    }
    public RefreshLayout$LayoutParams z(AttributeSet p0){
       p0 = PatchProxy.applyOneRefs(p0, this, SlidePlayRefreshView.class, "2");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       return new RefreshLayout$LayoutParams(c.a(this.getResources(), 0x7f07030d), c.a(this.getResources(), 0x7f07030d));
    }
}
