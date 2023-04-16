package com.yxcorp.gifshow.v3.editor.sticker.vote.detail.f;
import mn6.c;
import com.yxcorp.gifshow.v3.editor.sticker.vote.detail.i;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.framework.model.user.QCurrentUser;
import tkd.b;
import tkd.d;
import ou5.b;
import com.kwai.framework.model.feed.BaseFeed;
import kp.r1;
import wtc.i;
import android.content.Context;
import com.kwai.framework.model.user.User;
import com.yxcorp.gifshow.entity.QPreInfo;
import n3d.a;
import n3d.d;
import com.kwai.gifshow.post.api.feature.vote.model.VoteResultResponse;
import com.kwai.gifshow.post.api.feature.vote.model.VoteResult;
import k2b.e0;
import k2b.s;
import psb.e;
import psb.f;
import brd.t;
import java.util.concurrent.TimeUnit;
import t45.d;
import brd.z;
import wtc.k;
import erd.g;
import crd.b;
import ln6.c;
import faa.a;
import java.lang.StringBuilder;
import q87.c;

public final class f implements c	// class@0012d5
{
    public final i a;

    public void f(i p0){
       this.a = p0;
    }
    public final void a(int p0){
       f ta = this.a;
       Objects.requireNonNull(ta);
       i oi = i.class;
       if (!PatchProxy.isSupport(oi) || (!PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), ta, oi, "5") && ta.t != null)) {
          if (!QCurrentUser.me().isLogined()) {
             d.a(-1712118428).ne(ta.c, r1.R0(ta.g), "photo_vote", 0, "", ta.g, null, null, new i(ta)).h();
          }else {
             boolean b = true;
             ta.r = b;
             if (p0) {
                if (p0 == b) {
                   ta.i.mVoteResult.setRightCountInc();
                   s.n(ta.g, "2", ta.h());
                }
             }else {
                ta.i.mVoteResult.setLeftCountInc();
                s.n(ta.g, "1", ta.h());
             }
             ta.n = f.a().b(ta.g.getId(), p0).delay(3000, TimeUnit.MILLISECONDS).observeOn(d.a).subscribe(new k(ta));
             i j = ta.j;
             if (j != null) {
                j.a(ta.i, p0);
             }
             Object[] objArray = new Object[b];
             objArray[0] = "vote option:"+p0;
             a.D().s("ShowVoteView", "photo detail show vote", objArray);
          }
       }
       return;
    }
}
