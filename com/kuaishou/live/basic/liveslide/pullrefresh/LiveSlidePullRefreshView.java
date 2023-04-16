package com.kuaishou.live.basic.liveslide.pullrefresh.LiveSlidePullRefreshView;
import h51.a;
import com.kwai.library.widget.refresh.RefreshLayout;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.library.widget.refresh.KwaiRefreshView;
import android.view.ViewGroup;
import com.kuaishou.live.basic.liveslide.pullrefresh.LiveSlidePullRefreshView$a;
import com.kwai.library.widget.refresh.RefreshLayout$h;
import android.view.MotionEvent;
import h51.b;
import java.util.Objects;
import h51.f;
import com.kwai.library.widget.refresh.RefreshLayout$g;
import java.lang.Boolean;
import o17.b;
import o17.a;
import com.kwai.library.widget.refresh.RefreshLayout$LayoutParams;
import lnc.a1;

public class LiveSlidePullRefreshView extends RefreshLayout implements a	// class@000cd5
{

    public void LiveSlidePullRefreshView(Context p0){
       super(p0, null);
    }
    public void LiveSlidePullRefreshView(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public View B(AttributeSet p0){
       KwaiRefreshView obj = PatchProxy.applyOneRefs(p0, this, LiveSlidePullRefreshView.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new KwaiRefreshView(this.getContext(), p0);
       obj.setLoadingColor(-1);
       this.c(new LiveSlidePullRefreshView$a(this));
       return obj;
    }
    public void a(MotionEvent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveSlidePullRefreshView.class, "7")) {
          return;
       }
       if (!this.u()) {
          super.onTouchEvent(p0);
       }
       return;
    }
    public void b(MotionEvent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveSlidePullRefreshView.class, "6")) {
          return;
       }
       if (!this.u()) {
          super.onInterceptTouchEvent(p0);
       }
       return;
    }
    public boolean onInterceptTouchEvent(MotionEvent p0){
       return false;
    }
    public boolean onTouchEvent(MotionEvent p0){
       return false;
    }
    public void setOnRefreshListener(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveSlidePullRefreshView.class, "5")) {
          return;
       }
       Objects.requireNonNull(p0);
       super.setOnRefreshListener(new f(p0));
       return;
    }
    public void setRefreshing(boolean p0){
       if (PatchProxy.isSupport(LiveSlidePullRefreshView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, LiveSlidePullRefreshView.class, "3")) {
          return;
       }
       if (!p0) {
          this.setVisibility(8);
       }
       super.setRefreshing(p0);
       return;
    }
    public b y(){
       Object obj = PatchProxy.apply(null, this, LiveSlidePullRefreshView.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new a(this.getContext());
    }
    public RefreshLayout$LayoutParams z(AttributeSet p0){
       p0 = PatchProxy.applyOneRefs(p0, this, LiveSlidePullRefreshView.class, "2");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       return new RefreshLayout$LayoutParams(a1.d(0x7f07030d), a1.d(0x7f07030d));
    }
}
