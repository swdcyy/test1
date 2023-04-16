package com.yxcorp.gifshow.v3.editor.sticker.StickerPostAlbumActivity$b$a;
import com.yxcorp.gifshow.v3.editor.sticker.resource.EditStickerRepo$a;
import com.yxcorp.gifshow.v3.editor.sticker.StickerPostAlbumActivity$b;
import java.lang.Object;
import java.util.List;
import java.util.Map;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.Collection;
import ekd.q;
import java.util.Iterator;
import java.lang.Iterable;
import com.yxcorp.gifshow.v3.editor.sticker.model.StickerGroupInfo;
import com.yxcorp.gifshow.v3.editor.sticker.model.StickerDetailInfo;
import com.yxcorp.gifshow.v3.editor.sticker.StickerPostAlbumActivity;
import java.util.Objects;
import itc.b3;
import java.lang.Runnable;
import t45.c;
import com.yxcorp.gifshow.v3.editor.sticker.StickerRanker;
import android.content.Intent;
import android.app.Activity;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import androidx.fragment.app.Fragment;
import tkd.b;
import tkd.d;
import om6.j;
import java.lang.Boolean;
import androidx.fragment.app.FragmentActivity;
import om6.k;
import com.yxcorp.gifshow.fragment.AttrAnimProgressFragment;
import faa.a;
import java.lang.StringBuilder;
import w46.b;

public final class StickerPostAlbumActivity$b$a implements EditStickerRepo$a	// class@00120a
{
    public final StickerPostAlbumActivity$b a;

    public void StickerPostAlbumActivity$b$a(StickerPostAlbumActivity$b p0){
       this.a = p0;
       super();
    }
    public void a(int p0,List p1,Map p2){
       StickerPostAlbumActivity$b a;
       if (PatchProxy.isSupport(StickerPostAlbumActivity$b$a.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, p2, this, StickerPostAlbumActivity$b$a.class, "1")) {
          return;
       }
       a.p(p1, "stickerList");
       if (p0 == 2 && !q.f(p1)) {
          Iterator iterator = p1.iterator();
          while (true) {
             if (iterator.hasNext()) {
                List stickerInfos = iterator.next().getStickerInfos();
                a.o(stickerInfos, "groupInfo.stickerInfos");
                Iterator iterator1 = stickerInfos.iterator();
                while (true) {
                   if (iterator1.hasNext()) {
                      StickerDetailInfo stickerDetai = iterator1.next();
                      StickerDetailInfo mStickerId = stickerDetai.mStickerId;
                      StickerPostAlbumActivity s = this.a.a.S;
                      if (s == null) {
                         a.S("mStickerId");
                      }
                      if (a.g(mStickerId, s)) {
                         a = this.a.a;
                         a.o(stickerDetai, "it");
                         Objects.requireNonNull(a);
                         if (!PatchProxy.applyVoidOneRefs(stickerDetai, a, StickerPostAlbumActivity.class, "6")) {
                            c.a(new b3(a, stickerDetai));
                            break ;
                         }
                         break ;
                      }
                   }else {
                      continue ;
                   }
                }
                return;
             }else {
                StickerRanker.i.l(p1);
                SerializableHook.putExtra(this.a.a.getIntent(), "stickerDetailInfo", new StickerDetailInfo());
                a = this.a.a;
                a.U = true;
                if (a.W.isVisible()) {
                   StickerPostAlbumActivity$b a1 = this.a.a;
                   d.a(0x2538349d).fv(a1, a1.V, a1.I3(), this.a.a.R, "", "", Boolean.FALSE, false);
                   this.a.a.W.dismiss();
                   return;
                }
             }
          }
       }else {
          Object[] objArray = new Object[0];
          a.D().t("StickerPostAlbumActivity", "fetchStickerInfo error: result = "+p0+", stickerList = "+p1, objArray);
       }
       return;
    }
}
