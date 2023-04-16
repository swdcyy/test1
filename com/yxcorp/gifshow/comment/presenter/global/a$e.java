package com.yxcorp.gifshow.comment.presenter.global.a$e;
import com.yxcorp.gifshow.comment.e$c;
import com.yxcorp.gifshow.comment.presenter.global.a;
import com.kuaishou.android.model.mix.QComment;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import y8c.g;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.activity.x;
import k2b.e0;
import yk9.d;
import java.util.Objects;
import com.yxcorp.gifshow.comment.e$g;
import al9.a;
import qvb.i;
import com.yxcorp.gifshow.model.response.CommentResponse;
import java.util.List;
import java.util.Iterator;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.android.model.mix.QComment$CommentViewBindEntity;
import java.util.Set;
import com.kuaishou.android.model.mix.QSubComment;
import com.yxcorp.gifshow.comment.utils.d;
import java.lang.Math;
import com.yxcorp.gifshow.comment.CommentConfig;
import brd.y;
import java.lang.Boolean;
import java.lang.Long;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ResultPackage;
import java.lang.System;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import q2b.h$b;
import lnc.i3;
import com.google.protobuf.nano.MessageNano;
import k2b.u1;
import com.yxcorp.gifshow.log.model.FeedLogCtx;
import com.yxcorp.gifshow.entity.QPhoto;
import ek9.d1;

public class a$e implements e$c	// class@0010ef
{
    public final e$c a;
    public final QComment b;
    public final boolean c;
    public final a d;

    public void a$e(a p0,e$c p1,QComment p2,boolean p3){
       this.d = p0;
       this.a = p1;
       this.b = p2;
       this.c = p3;
       super();
    }
    public void a(QComment p0,Throwable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a$e.class, "3")) {
          return;
       }
       a$e ta = this.a;
       if (ta != null) {
          ta.a(p0, p1);
       }
       this.d.M.g7().k0();
       ta = this.d;
       ta.q.v(p0, this.c, ta.L, p1, ta.getActivity().N2());
       Objects.requireNonNull(this.d);
       return;
    }
    public void b(QComment p0,e$g p1){
       QComment qComment;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a$e.class, "2")) {
          return;
       }
       a$e ta = this.a;
       if (ta != null) {
          ta.b(p0, p1);
       }
       this.d.X8().c0(p0);
       if (this.d.X8().L0() != null) {
          CommentResponse uCommentResp = this.d.X8().L0();
          uCommentResp.mCommentCount = uCommentResp.mCommentCount + 1;
       }
       int i = 0;
       if (p0.mParent != null) {
          Iterator iterator = this.d.M.q().getItems().iterator();
          while (true) {
             if (iterator.hasNext()) {
                qComment = iterator.next();
                if (TextUtils.n(qComment.getId(), p0.mParent.getId()) && qComment != p0) {
                   p0.mParent = qComment;
                   qComment.getEntity().mNewSubCommentIdSet.add(p0.getId());
                   QComment mParent = p0.mParent;
                   mParent.mSubCommentCount = mParent.mSubCommentCount + 1;
                   this.d.M.q().add(Math.max(d.f(mParent.mSubComment), i), p0);
                }
             }
          }
       }else if(this.d.X8().L0() == null){
          this.d.X8().add(i, p0);
       }
       this.d.M.g7().k0();
       a$e td = this.d;
       if (td.Q.mLocationAfterAddComment != null) {
          td.z.onNext(p0);
       }
       td = this.d;
       a q = td.q;
       a$e tc = this.c;
       a l = td.L;
       x ox = td.getActivity().N2();
       Objects.requireNonNull(q);
       if (!PatchProxy.isSupport(d.class) || (!PatchProxy.applyVoidFourRefs(p0, Boolean.valueOf(tc), Long.valueOf(l), ox, q, d.class, "15") && q.a != null)) {
          ClientEvent$ResultPackage resultPackag = new ClientEvent$ResultPackage();
          resultPackag.timeCost = System.currentTimeMillis() - l;
          qComment = p0.mReplyComment;
          String id = (qComment != null)? qComment.getId(): null;
          if (!TextUtils.x(id)) {
             ClientContent$ContentPackage uContentPack = q.c(p0, id, tc);
             h$b uob = h$b.d(7, 301);
             if ((q.i).equals("DETAIL")) {
                i3 oi3 = i3.f();
                oi3.d("resultPackage_params", resultPackag.toString());
                oi3.d("replyContentPackage_params", uContentPack.toString());
                String str = oi3.e();
                u1.R("REPLY_PHOTO_COMMENT", str, 14);
             }else {
                uob.q(resultPackag);
                uob.h(uContentPack);
                uob.l(q.a.getFeedLogCtx());
                u1.r0(uob);
             }
          }
          h$b uob1 = h$b.d(7, 300);
          uob1.q(resultPackag);
          uob1.h(q.c(p0, id, tc));
          uob1.l(q.a.getFeedLogCtx());
          u1.p0("", ox, uob1);
       }
       Objects.requireNonNull(this.d);
       return;
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, a$e.class, "1")) {
          return;
       }
       a$e ta = this.a;
       if (ta != null) {
          ta.c();
       }
       this.d.X8().m0(this.b);
       this.d.X8().r1(this.b);
       this.d.S8(this.b);
       return;
    }
    public void d(QComment p0,Throwable p1){
       d1.d(this, p0, p1);
    }
}
