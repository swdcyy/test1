package com.yxcorp.gifshow.ad.detail.presenter.ad.actionbar.comment.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import n49.s;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.ads.PhotoAdvertisement$CommentActionBarInfo;
import mxb.c;
import android.view.View;
import mz8.a;
import erd.g;
import crd.b;
import brd.t;
import mz8.b;
import android.content.Context;
import com.yxcorp.utility.n;
import android.view.animation.DecelerateInterpolator;
import android.animation.TimeInterpolator;
import android.animation.AnimatorSet;
import ekd.f;
import com.yxcorp.gifshow.ad.detail.presenter.ad.actionbar.comment.a$a;
import android.animation.Animator$AnimatorListener;
import android.animation.Animator;
import java.lang.Number;
import android.view.ViewGroup;
import com.yxcorp.gifshow.ad.detail.presenter.ad.actionbar.comment.a$b;
import com.yxcorp.gifshow.util.Edge2EdgeHelper;
import android.app.Activity;
import dg.h;
import dg.e;
import mxb.j0;
import mxb.i0;
import com.kwai.framework.model.feed.BaseFeed;
import ekd.m1;
import androidx.recyclerview.widget.RecyclerView;
import io.reactivex.subjects.PublishSubject;

public class a extends PresenterV2	// class@001569
{
    public View p;
    public RecyclerView q;
    public QPhoto r;
    public PublishSubject s;
    public PublishSubject t;
    public PhotoAdvertisement$CommentActionBarInfo u;
    public boolean v;
    public Animator w;
    public boolean x;

    public void a(){
       super();
    }
    public void E8(){
       boolean b;
       a uoa = a.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoa, "3")) {
          return;
       }
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       a obj = PatchProxy.apply(objArray, this, uoa, "4");
       if (obj != patchProxyRe) {
          b = obj.booleanValue();
       }else {
          obj = this.r;
          Object obj1 = PatchProxy.applyOneRefs(obj, objArray, s.class, "7");
          if (obj1 != patchProxyRe) {
             b = obj1.booleanValue();
          }else if(!s.K(obj) && (s.J(obj) || s.L(obj))){
             b = true;
          }else {
             b = false;
          }
       }
       if (!b) {
          return;
       }else if(PatchProxy.applyVoid(objArray, this, uoa, "5")){
          this.u = c.m(this.r);
          this.v = false;
       }
       this.p.setVisibility(8);
       this.X7(this.s.subscribe(new a(this)));
       this.X7(this.t.subscribe(new b(this)));
       return;
    }
    public boolean P8(){
       return true;
    }
    public final void R8(){
       if (PatchProxy.applyVoid(null, this, a.class, "6")) {
          return;
       }
       if (this.p.getVisibility()) {
          return;
       }
       a tu = this.u;
       if (tu == null) {
          return;
       }
       if (("1").equals(tu.mCommentActionLocation)) {
          this.p.setVisibility(8);
       }else if(this.w == null){
          AnimatorSet uAnimatorSet = f.e(this.p, (float)(- (n.c(this.getContext(), 64.00f) + this.S8())), (float)n.c(this.getContext(), 56.00f), 200, new DecelerateInterpolator());
          this.w = uAnimatorSet;
          uAnimatorSet.addListener(new a$a(this));
       }
       if (!this.w.isStarted()) {
          this.w.start();
       }
       return;
    }
    public final int S8(){
       a obj = PatchProxy.apply(null, this, a.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.q;
       if (obj == null || obj.getVisibility()) {
          return 0;
       }
       return this.q.getHeight();
    }
    public final void V8(){
       a uoa = a.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoa, "7")) {
          return;
       }
       if (!this.P8()) {
          return;
       }
       if (this.v != null) {
          return;
       }
       a tw = this.w;
       if (tw != null) {
          tw.cancel();
       }
       a$b uob = new a$b(this);
       if (!PatchProxy.applyVoidOneRefs(uob, this, uoa, "8") && this.p.getVisibility()) {
          float f = (float)n.c(this.getContext(), 56.00f);
          this.p.setTranslationY(f);
          int i = 0;
          this.p.setVisibility(i);
          int i1 = n.c(this.getContext(), 64.00f) + this.S8();
          Object obj = PatchProxy.apply(objArray, this, uoa, "9");
          if (obj != PatchProxyResult.class) {
             i = obj.intValue();
          }else if(Edge2EdgeHelper.b()){
             i = Edge2EdgeHelper.c(this.getActivity());
          }
          f.n(f, (float)(- (i1 + i)), 240.00f, 18.00f, uob);
       }
       if (this.x == null) {
          this.x = true;
          i0.a().t(5, this.r.mEntity);
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "2")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a0115);
       this.q = m1.f(p0, 0x7f0a0ce1);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       this.r = this.q8(QPhoto.class);
       this.s = this.r8("FLOATING_ACTIONBAR_SHOW_CONTROL");
       this.t = this.r8("COMMENT_TK_ACTION_BAR_CLOSE_BY_USER");
       return;
    }
}
