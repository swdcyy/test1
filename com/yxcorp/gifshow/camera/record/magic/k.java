package com.yxcorp.gifshow.camera.record.magic.k;
import erd.g;
import com.yxcorp.gifshow.camera.record.magic.l;
import java.lang.Object;
import com.yxcorp.gifshow.magic.data.repo.response.MagicEmojiEntrance;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.magic.data.repo.MagicBusinessId;
import m4b.c;
import com.yxcorp.gifshow.model.response.MagicEmojiResponse;
import e4b.b;
import s5b.b;
import j4b.i;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import java.util.List;
import com.yxcorp.gifshow.plugin.magicemoji.MagicEmojiPageConfig$b;
import com.yxcorp.gifshow.plugin.magicemoji.MagicEmojiPageConfig;
import brd.t;
import f4b.k;
import ce9.u;
import ce9.d0;
import crd.b;

public final class k implements g	// class@000e44
{
    public final l b;

    public void k(l p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       k tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, l.class, "25")) {
       }else {
          MagicBusinessId vIDEO = MagicBusinessId.VIDEO;
          if (tb.p.k0() == vIDEO) {
             MagicEmojiResponse magicEmojiRe = b.b(vIDEO);
             String str = "MagicHandler";
             int i = 0;
             if (magicEmojiRe != null) {
                Object[] objArray = new Object[i];
                b.D().E(str, "[magicface][keypath] ", "onMagicEntranceDataCallback firtPageData already has", objArray);
                tb.p.D(new i(tb.c(magicEmojiRe, i), tb.c(magicEmojiRe, 1), tb.d(magicEmojiRe)));
             }else {
                MagicEmojiEntrance mMagicFaceIn = p0.mMagicFaceInfo;
                if (mMagicFaceIn != null) {
                   tb.n.m(mMagicFaceIn);
                }
                Object[] objArray1 = new Object[i];
                b.D().E(str, "[magicface][keypath][remote] ", "/rest/n/magicFace/page start onMagicEntranceDataCallback", objArray1);
                k.b(vIDEO, tb.n.a()).subscribe(new u(tb, p0), new d0(tb));
             }
          }
       }
       return;
    }
}
