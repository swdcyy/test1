package com.yxcorp.gifshow.comment.presenter.global.i;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import qvb.i;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import com.yxcorp.gifshow.comment.presenter.global.i$a;
import qvb.q;
import qvb.j;
import com.yxcorp.gifshow.comment.CommentParams;
import com.kuaishou.android.model.mix.QComment;
import pk9.h;
import el9.g0;
import el9.h0;
import java.util.Objects;
import ek9.t0;
import com.kwai.robust.PatchProxyResult;
import crd.b;
import erd.r;
import brd.t;
import erd.g;
import el9.f0;
import io.reactivex.internal.functions.Functions;
import com.yxcorp.gifshow.comment.presenter.global.h;
import fl9.b;
import com.yxcorp.gifshow.comment.CommentConfig;
import y8c.g;
import fk9.b;
import java.util.List;
import g9c.a;
import pk9.h$a;
import java.lang.Integer;
import fl9.a;
import fl9.c;
import android.content.Context;
import e17.i;
import android.app.Activity;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import k2b.e0;
import k2b.f0;
import yk9.d;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import java.lang.System;
import java.lang.Long;
import java.lang.Number;
import com.yxcorp.gifshow.log.model.ClickMetaData;
import com.yxcorp.gifshow.log.model.FeedLogCtx;
import com.yxcorp.gifshow.entity.QPhoto;
import k2b.u1;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import brd.y;
import im8.f;

public class i extends PresenterV2	// class@0010fb
{
    public boolean A;
    public b B;
    public final int C;
    public QComment D;
    public h E;
    public RecyclerFragment p;
    public QPhoto q;
    public d r;
    public CommentParams s;
    public CommentConfig t;
    public t u;
    public y v;
    public t w;
    public f x;
    public t0 y;
    public q z;

    public void i(){
       super(0);
    }
    public void i(int p0){
       super();
       this.C = p0;
    }
    public void E8(){
       i oi = i.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, oi, "2")) {
          return;
       }
       i$a uoa = new i$a(this);
       this.z = uoa;
       this.p.q().h(uoa);
       if (!PatchProxy.applyVoid(objArray, this, oi, "4")) {
          CommentParams mComment = this.s.mComment;
          if (mComment != null && mComment.mHasPosition == null) {
             h oh = new h(mComment);
             this.E = oh;
             boolean b = true;
             oh.f(b);
             this.s.mComment.mHasPosition = b;
          }
       }
       oi = this.y;
       g0 og0 = new g0(this);
       h0 oh0 = new h0(this);
       Objects.requireNonNull(oi);
       b uob = PatchProxy.applyTwoRefs(og0, oh0, oi, t0.class, "28");
       if (uob != PatchProxyResult.class) {
       }else {
          uob = oi.m.filter(oh0).subscribe(og0);
       }
       this.X7(uob);
       g e = Functions.e;
       this.X7(this.u.subscribe(new f0(this), e));
       this.X7(this.w.subscribe(new h(this), e));
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, i.class, "6")) {
          return;
       }
       this.p.q().f(this.z);
       this.P8();
       i tB = this.B;
       if (tB != null) {
          tB.b();
       }
       return;
    }
    public final void P8(){
       if (PatchProxy.applyVoid(null, this, i.class, "7")) {
          return;
       }
       i tE = this.E;
       if (tE != null) {
          tE.a();
       }
       return;
    }
    public void R8(){
       int i;
       boolean b;
       i tE;
       i tB;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       i oi = i.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, oi, "10")) {
          return;
       }
       if (this.t.mDisableAnchorComment != null) {
          return;
       }
       QComment qComment = PatchProxy.apply(objArray, this, oi, "5");
       String str = "1";
       if (qComment != patchProxyRe) {
       }else {
          i tE1 = this.E;
          if (tE1 != null && tE1.d == null) {
             qComment = tE1.b();
             if (qComment == null && this.p.g7() instanceof b) {
                tE1 = this.E;
                List list = this.p.g7().Q0();
                tB = this.p;
                Objects.requireNonNull(tE1);
                h oh = PatchProxy.applyTwoRefs(list, tB, tE1, h.class, str);
                if (oh != patchProxyRe) {
                }else {
                   oh = tE1.b;
                   if (oh == null) {
                      oh = tE1.c;
                      oh = (oh != null)? oh.a(list, tB, tE1): objArray;
                      tE1.b = oh;
                      tE1.c = objArray;
                   }
                }
                qComment = oh;
             }
          }else {
             qComment = objArray;
          }
       }
       this.D = qComment;
       if (qComment == null) {
          return;
       }else {
          i = this.p.g7().t1(this.D);
          b = true;
          if (i >= 0) {
             this.D = this.p.g7().N0(i);
             if (!PatchProxy.isSupport(oi) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(i), this, oi, "11")) {
                tB = this.B;
                if (tB != null) {
                   tB.b();
                }
                c uoc = PatchProxy.applyTwoRefs(this.q, this.s, objArray, a.class, str);
                if (uoc != patchProxyRe) {
                }else {
                   uoc = new c();
                }
                this.B = uoc;
                tE = this.E;
                if (tE == null || tE.i == null) {
                   b = false;
                }
                uoc.a = b;
                uoc.a(this.getContext(), this.p, i, this.C);
             }
          }else if(PatchProxy.applyVoid(objArray, this, oi, "13")){
             tE = this.E;
             if (tE == null || tE.g == null) {
                i.a(R.style.arg_RES_7f11066a, 0x7f100774);
                tE = this.r;
                i tD = this.D;
                e0 uoe0 = f0.a(this.p, this.getActivity());
                Objects.requireNonNull(tE);
                if (!PatchProxy.applyVoidTwoRefs(tD, uoe0, tE, d.class, "73") && tD != null) {
                   ClientContent$ContentPackage uContentPack = tE.c(tD, tD.mReplyToCommentId, b);
                   uContentPack.photoPackage = tE.i();
                   ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                   uElementPack.action2 = "CLICK_NOTIFICATION_SPECIAL";
                   i3 oi3 = i3.f();
                   oi3.c("read_time", Long.valueOf(System.currentTimeMillis()));
                   uElementPack.params = oi3.e();
                   u1.B(new ClickMetaData().setLogPage(uoe0).setType(b).setElementPackage(uElementPack).setContentPackage(uContentPack).setFeedLogCtx(tE.a.getFeedLogCtx()));
                }
             }
          }
          tE = this.E;
          if (tE != null && (tE.a != null && i >= 0)) {
             QComment qComment1 = tE.b();
             if (!PatchProxy.applyVoidOneRefs(qComment1, this, oi, "8") && this.p.g7() instanceof b) {
                int i1 = this.p.g7().t1(qComment1);
                if (i1 > -1) {
                   this.p.g7().v1(qComment1);
                   this.p.g7().l0(i1);
                }
             }
          }
          this.P8();
          return;
       }
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, i.class, "1")) {
          return;
       }
       this.p = this.r8("FRAGMENT");
       this.q = this.q8(QPhoto.class);
       this.r = this.q8(d.class);
       this.s = this.q8(CommentParams.class);
       this.y = this.r8("COMMENT_GLOBAL_ACTION");
       this.u = this.r8("COMMENT_DIFFER_NOTIFY_FINISH_OBSERVABLE");
       this.v = this.r8("COMMENT_REPLY_OBSERVER");
       this.w = this.r8("COMMENT_SCROLL_TO_TOP_OBSERVABLE");
       this.x = this.x8("DETAIL_SCROLL_DISTANCE");
       this.t = this.q8(CommentConfig.class);
       return;
    }
}
