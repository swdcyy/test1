package a8a.c;
import qvb.q;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import uw9.o;
import q87.c;
import az6.a;
import com.yxcorp.gifshow.detail.slideplay.b;
import android.view.View;
import qvb.i;
import z7a.a;
import qvb.a;
import qvb.j;
import java.lang.Throwable;
import java.lang.Boolean;
import android.content.Context;
import ekd.p0;
import e17.i;
import java.util.List;
import java.util.Collection;
import ekd.q;
import mkc.b;
import mkc.c;
import com.kwai.library.widget.emptyview.KwaiEmptyStateView$a;
import com.kwai.library.widget.emptyview.KwaiEmptyStateView;
import lnc.a1;
import java.lang.CharSequence;
import a8a.a;
import android.view.View$OnClickListener;
import qvb.p;
import ekd.m1;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import java.lang.Runnable;
import com.yxcorp.gifshow.entity.QPhoto;
import a8a.b;
import ekd.k1;
import java.lang.StringBuilder;

public final class c extends PresenterV2 implements q	// class@000076
{
    public PhotoDetailParam p;
    public Runnable q;
    public i r;
    public View s;

    public void c(){
       super();
    }
    public void E8(){
       c uoc = c.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoc, "3")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, uoc, "4")) {
          int i = 0;
          Object[] objArray1 = new Object[i];
          o.C().w("MagicFaceFriendsUsingFlowPresenter", "initFeedList", objArray1);
          b uob = b.e(this.p.mSlidePlayId);
          if (uob != null) {
             this.s.setVisibility(i);
             i oi = uob.M7();
             if (oi instanceof a) {
                this.r = oi;
                oi.h(this);
                this.r.a();
             }
          }
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, c.class, "5")) {
          return;
       }
       c tr = this.r;
       if (tr != null) {
          tr.f(this);
       }
       return;
    }
    public void M1(boolean p0,Throwable p1){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, uoc, "7")) {
          return;
       }
       if (this.getContext() != null && !p0.C(this.getContext())) {
          i.a(R.style.arg_RES_7f110668, 0x7f1038e7);
       }
       if (p0) {
          c tr = this.r;
          if (tr != null && !q.f(tr.getItems())) {
             return;
          }else if(PatchProxy.applyVoid(null, this, uoc, "8")){
             Object[] objArray = new Object[0];
             o.C().w("MagicFaceFriendsUsingFlowPresenter", "showRetryView", objArray);
             KwaiEmptyStateView$a uoa = KwaiEmptyStateView.e();
             uoa.b();
             uoa.i(a1.p(R.string.arg_RES_7f100d25));
             uoa.p(new a(this));
             uoa.a(c.h(this.s, b.g));
             this.s.setVisibility(8);
          }
       }
       return;
    }
    public void Z1(boolean p0,boolean p1){
       p.d(this, p0, p1);
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "2")) {
          return;
       }
       this.s = m1.f(p0, 0x7f0a0feb);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, c.class, "1")) {
          return;
       }
       this.p = this.q8(PhotoDetailParam.class);
       this.q = this.r8("DETAIL_FLOW_END_LISTENER");
       return;
    }
    public boolean rg(){
       return p.e(this);
    }
    public void t5(boolean p0){
       p.c(this, p0);
    }
    public void v2(boolean p0,boolean p1){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, uoc, "6")) {
          return;
       }
       this.s.setVisibility(8);
       int i = 0;
       if (p0) {
          uoc = this.r;
          if (uoc != null && !q.f(uoc.getItems())) {
             QPhoto item = this.r.getItem(i);
             c tp = this.p;
             if (tp != null) {
                tp.mPhoto = item;
             }
             uoc = this.q;
             if (uoc != null) {
                uoc.run();
             }
          }else {
             i.a(R.style.arg_RES_7f110668, 0x7f101092);
             k1.r(new b(this), 2200);
          }
       }
       Object[] objArray = new Object[i];
       o.C().w("MagicFaceFriendsUsingFlowPresenter", "flow onFinishLoading firstPage:"+p0, objArray);
       return;
    }
}
