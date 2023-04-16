package com.kwai.live.gzone.accompanyplay.anchor.LiveGzoneAnchorAccompanyFleetStateFragment$b;
import nkc.c;
import com.kwai.live.gzone.accompanyplay.anchor.LiveGzoneAnchorAccompanyFleetStateFragment;
import nkc.d;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import mkc.b;
import android.view.View;
import mkc.c;
import java.lang.Throwable;
import com.kwai.library.widget.emptyview.KwaiEmptyStateView$a;
import com.kwai.library.widget.emptyview.KwaiEmptyStateView;
import com.kwai.live.gzone.accompanyplay.anchor.LiveGzoneAnchorAccompanyFleetStateFragment$b$a;
import android.view.View$OnClickListener;
import qvb.i;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;

public class LiveGzoneAnchorAccompanyFleetStateFragment$b extends c	// class@000af2
{
    public final LiveGzoneAnchorAccompanyFleetStateFragment h;

    public void LiveGzoneAnchorAccompanyFleetStateFragment$b(LiveGzoneAnchorAccompanyFleetStateFragment p0,d p1){
       this.h = p0;
       super(p1);
    }
    public void d(boolean p0){
       LiveGzoneAnchorAccompanyFleetStateFragment$b uob = LiveGzoneAnchorAccompanyFleetStateFragment$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uob, "2")) {
          return;
       }
       LiveGzoneAnchorAccompanyFleetStateFragment r = this.h.R;
       if (r != null) {
          c.h(r, b.d);
       }
       return;
    }
    public void f(){
       if (PatchProxy.applyVoid(null, this, LiveGzoneAnchorAccompanyFleetStateFragment$b.class, "3")) {
          return;
       }
       b[] uobArray = new b[]{b.i};
       c.d(this.h.R, uobArray);
       return;
    }
    public void i(){
    }
    public void j(){
       if (PatchProxy.applyVoid(null, this, LiveGzoneAnchorAccompanyFleetStateFragment$b.class, "6")) {
          return;
       }
       b[] uobArray = new b[]{b.g};
       c.d(this.h.R, uobArray);
       return;
    }
    public void k(boolean p0,Throwable p1){
       LiveGzoneAnchorAccompanyFleetStateFragment$b uob = LiveGzoneAnchorAccompanyFleetStateFragment$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, uob, "5")) {
          return;
       }
       LiveGzoneAnchorAccompanyFleetStateFragment r = this.h.R;
       if (r == null) {
          return;
       }
       View view = c.h(r, b.g);
       if (view != null) {
          KwaiEmptyStateView$a uoa = KwaiEmptyStateView.e();
          uoa.p(new LiveGzoneAnchorAccompanyFleetStateFragment$b$a(this));
          uoa.q(3);
          uoa.a(view);
       }
       return;
    }
    public void n(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveGzoneAnchorAccompanyFleetStateFragment$b.class, "1")) {
          return;
       }
       this.h.q().a();
       return;
    }
    public void p(){
    }
    public void x(){
       if (PatchProxy.applyVoid(null, this, LiveGzoneAnchorAccompanyFleetStateFragment$b.class, "4")) {
          return;
       }
       b[] uobArray = new b[]{b.d};
       c.d(this.h.R, uobArray);
       return;
    }
}
