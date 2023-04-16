package com.yxcorp.gifshow.comment.log.CommentStayTimeLogPresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.comment.log.CommentStayTimeLogPresenter$a;
import com.yxcorp.gifshow.comment.log.CommentStayTimeLogPresenter$2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.recyclerview.widget.RecyclerView;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import androidx.recyclerview.widget.RecyclerView$r;
import androidx.lifecycle.Lifecycle;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleObserver;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import qvb.i;
import al9.a;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import g9c.d;
import android.os.SystemClock;
import android.app.Activity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.activity.x;
import java.util.Objects;
import yk9.d;
import java.lang.Long;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$UrlPackage;
import q2b.h$b;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import java.lang.Number;
import com.yxcorp.gifshow.log.model.FeedLogCtx;
import com.yxcorp.gifshow.entity.QPhoto;
import k2b.e0;
import k2b.u1;
import com.yxcorp.gifshow.comment.fragment.CommentsFragment;

public class CommentStayTimeLogPresenter extends PresenterV2	// class@0010e0
{
    public CommentsFragment p;
    public d q;
    public long r;
    public final RecyclerView$r s;
    public final LifecycleObserver t;

    public void CommentStayTimeLogPresenter(){
       super();
       this.r = -1;
       this.s = new CommentStayTimeLogPresenter$a(this);
       this.t = new CommentStayTimeLogPresenter$2(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, CommentStayTimeLogPresenter.class, "2")) {
          return;
       }
       this.p.h0().removeOnScrollListener(this.s);
       this.p.h0().addOnScrollListener(this.s);
       this.p.getLifecycle().removeObserver(this.t);
       this.p.getLifecycle().addObserver(this.t);
       return;
    }
    public final boolean P8(){
       Object obj = PatchProxy.apply(null, this, CommentStayTimeLogPresenter.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       int i = this.p.q().G();
       boolean b = false;
       if (!i) {
          return b;
       }
       if (this.p.h0().getLayoutManager().E() >= (i + (this.p.ia().b1() + 1))) {
          b = true;
       }
       return b;
    }
    public void R8(){
       if (PatchProxy.applyVoid(null, this, CommentStayTimeLogPresenter.class, "6")) {
          return;
       }
       if (this.r - null > 0) {
          long l = SystemClock.elapsedRealtime() - this.r;
          CommentStayTimeLogPresenter tq = this.q;
          Activity activity = this.getActivity();
          x ox = this.getActivity().N2();
          Objects.requireNonNull(tq);
          if (!PatchProxy.isSupport(d.class) || !PatchProxy.applyVoidThreeRefs(activity, Long.valueOf(l), ox, tq, d.class, "77")) {
             h$b uob = h$b.e(7, "HIDDEN_COMMENT_BUTTON");
             ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
             uContentPack.photoPackage = tq.i();
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "HIDDEN_COMMENT_BUTTON";
             i3 oi3 = i3.f();
             oi3.c("hidden_comment_stay_duration", Long.valueOf(l));
             uElementPack.params = oi3.e();
             uob.k(uElementPack);
             uob.h(uContentPack);
             uob.u(activity.N2().b());
             uob.l(tq.a.getFeedLogCtx());
             u1.p0("", ox, uob);
          }
          this.r = -1;
       }
       return;
    }
    public void S8(){
       if (PatchProxy.applyVoid(null, this, CommentStayTimeLogPresenter.class, "3")) {
          return;
       }
       if (this.r < 0 && this.P8()) {
          this.r = SystemClock.elapsedRealtime();
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, CommentStayTimeLogPresenter.class, "1")) {
          return;
       }
       this.p = this.r8("FRAGMENT");
       this.q = this.q8(d.class);
       return;
    }
}
