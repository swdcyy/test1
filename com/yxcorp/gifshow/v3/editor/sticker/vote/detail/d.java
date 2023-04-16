package com.yxcorp.gifshow.v3.editor.sticker.vote.detail.d;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.v3.editor.sticker.vote.detail.i;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.model.feed.BaseFeed;
import wtc.j;
import android.content.Context;
import com.kwai.gifshow.post.api.feature.vote.model.VoteResultResponse;
import n3d.a;
import com.yxcorp.gifshow.v3.editor.sticker.vote.VoteDetailActivity;
import k2b.e0;
import k2b.s;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import k2b.y1;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$FeedLogContext;
import k2b.u1;
import faa.a;
import q87.c;

public final class d implements View$OnClickListener	// class@0012d3
{
    public final i b;

    public void d(i p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       int i;
       d tb = this.b;
       Objects.requireNonNull(tb);
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, tb, i.class, "6")) {
       }else {
          VoteDetailActivity.u3(tb.c, tb.g.getId(), tb.i, 1, new j(tb));
          i g = tb.g;
          e0 uoe0 = tb.h();
          i = 0;
          if (!PatchProxy.applyVoidTwoRefs(g, uoe0, objArray, s.class, "15")) {
             ClientEvent$ElementPackage uElementPack = y1.a("voting_sticker_result", 1605, 12);
             ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
             ClientContent$PhotoPackage photoPackage = new ClientContent$PhotoPackage();
             uContentPack.photoPackage = photoPackage;
             String id = (g != null)? g.getId(): "";
             photoPackage.identity = id;
             if (s.c(g) != null) {
                uContentPack.photoPackage.feedLogCtx = s.c(g);
             }
             u1.L("", uoe0, i, uElementPack, uContentPack);
          }
          Object[] objArray1 = new Object[]{"startVoteResultDetailActivity"};
          a.D().s("ShowVoteView", "photo detail show vote", objArray1);
       }
       return;
    }
}
