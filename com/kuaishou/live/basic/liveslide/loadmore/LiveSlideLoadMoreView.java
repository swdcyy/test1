package com.kuaishou.live.basic.liveslide.loadmore.LiveSlideLoadMoreView;
import f51.b;
import android.widget.FrameLayout;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import f51.e;
import xtd.i;
import ytd.b;
import com.kuaishou.live.basic.liveslide.loadmore.LiveSlideLoadMoreView$a;
import xtd.d;
import xtd.g;
import f51.a;

public class LiveSlideLoadMoreView extends FrameLayout implements b	// class@000cd3
{
    public KwaiLoadingView b;
    public View c;
    public e d;
    public a e;

    public void LiveSlideLoadMoreView(Context p0){
       super(p0, null);
    }
    public void LiveSlideLoadMoreView(Context p0,AttributeSet p1){
       super(p0, p1, -1);
    }
    public void LiveSlideLoadMoreView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public void setContentView(View p0){
       this.c = p0;
    }
    public void setEnableLoadMore(boolean p0){
       if (PatchProxy.isSupport(LiveSlideLoadMoreView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, LiveSlideLoadMoreView.class, "1")) {
          return;
       }
       if (!p0) {
          LiveSlideLoadMoreView td = this.d;
          if (td == null) {
             return;
          }else {
             td.d(false);
             return;
          }
       }else if(this.d == null){
          e uoe = new e(this.c);
          this.d = uoe;
          i oi = new i(uoe);
          oi.b(new LiveSlideLoadMoreView$a(this));
       }
       this.d.d(true);
       return;
    }
    public void setLoadMoreViewGestureDelegate(a p0){
       this.e = p0;
    }
}
