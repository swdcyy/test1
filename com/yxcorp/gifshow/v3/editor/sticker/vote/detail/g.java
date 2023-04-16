package com.yxcorp.gifshow.v3.editor.sticker.vote.detail.g;
import erd.g;
import com.yxcorp.gifshow.v3.editor.sticker.vote.detail.i;
import java.lang.Object;
import com.kwai.gifshow.post.api.feature.vote.model.VoteResultResponse;
import java.util.Objects;
import android.graphics.RectF;
import com.kwai.gifshow.post.api.feature.vote.model.VoteInfo;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import com.yxcorp.gifshow.v3.editor.sticker.vote.VoteView;
import android.content.Context;
import android.widget.FrameLayout;
import com.yxcorp.gifshow.v3.editor.sticker.vote.EditVoteView;
import android.view.ViewTreeObserver;
import android.widget.RelativeLayout;
import com.yxcorp.gifshow.v3.editor.sticker.vote.detail.h;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import com.yxcorp.gifshow.v3.editor.sticker.vote.detail.f;
import mn6.c;
import com.yxcorp.gifshow.v3.editor.sticker.vote.detail.d;
import android.view.View$OnClickListener;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.android.model.feed.PhotoType;
import kp.w1;
import com.yxcorp.gifshow.v3.editor.sticker.vote.detail.e;
import crd.b;
import ok.h;
import lnc.b9;
import android.view.View;
import k2b.s;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import k2b.y1;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import k2b.u1;
import wtc.g;
import wtc.d;

public final class g implements g	// class@0012d6
{
    public final i b;

    public void g(i p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       String id;
       g tb = this.b;
       Objects.requireNonNull(tb);
       if (p0 != null) {
          VoteResultResponse mVoteInfo = p0.mVoteInfo;
          if (mVoteInfo == null || (mVoteInfo.getPosition() == null || (p0.mVoteResult != null && tb.m == null))) {
             i h = tb.h;
             int i = 0;
             int i1 = 1;
             if (h == null) {
                h = i.class;
                if (!PatchProxy.applyVoidOneRefs(p0, tb, h, "3")) {
                   Object[] objArray = new Object[i1];
                   objArray[i] = "voteResultResponse:"+p0.toString();
                   a.D().s("ShowVoteView", "photo detail show vote", objArray);
                   tb.i = p0;
                   p0 = new VoteView(tb.d.getContext());
                   tb.h = p0;
                   p0.setAllowDispatchTouchEvent(i1);
                   p0 = null;
                   if (!PatchProxy.applyVoid(p0, tb, h, "4")) {
                      tb.h.getViewTreeObserver().addOnGlobalLayoutListener(new h(tb));
                      tb.h.setOnOptionsClickListener(new f(tb));
                      if (tb.i.mIsAuthor != null) {
                         tb.h.setAuthorResultOnClickListener(new d(tb));
                      }
                      if (w1.r(tb.g) == PhotoType.VIDEO) {
                         tb.l = b9.c(tb.l, new e(tb));
                      }
                   }
                   tb.d.addView(tb.h);
                   if (tb.t == null) {
                      tb.h.setAlpha(0);
                   }
                   id = tb.g.getId();
                   if (!PatchProxy.applyVoidOneRefs(id, p0, s.class, "13")) {
                      ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
                      ClientContent$PhotoPackage photoPackage = new ClientContent$PhotoPackage();
                      uContentPack.photoPackage = photoPackage;
                      photoPackage.identity = id;
                      u1.u0(i, y1.a("voting_sticker", 1606, 12), uContentPack);
                   }
                }
             }else if(tb.b == null){
                i = true;
             }
             h.g(p0, i);
             if (tb.b != null) {
                tb.h.findViewById(R.id.iv_vote_close).setOnClickListener(new g(tb));
                tb.h.findViewById(R.id.iv_vote_no_qt_close).setOnClickListener(new d(tb));
             }
          }
       }
    label_011a :
       return;
    }
}
