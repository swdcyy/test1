package com.yxcorp.gifshow.magic.ui.magicemoji.swap.f;
import n3d.a;
import com.yxcorp.gifshow.magic.ui.magicemoji.swap.SwapMagicAlbumActivity$i;
import com.kwai.feature.post.api.feature.kuaishan.model.KSAssetExportInfo;
import android.content.Intent;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.io.Serializable;
import ekd.j0;
import com.yxcorp.gifshow.models.QMedia;
import j8c.b;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.magic.ui.magicemoji.swap.SwapMagicAlbumActivity;
import java.util.Iterator;
import java.lang.Iterable;
import com.yxcorp.gifshow.magic.ui.magicemoji.swap.SwapMagicAlbumActivity$a;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.util.Objects;
import java.util.Collection;
import nsd.s0;
import java.util.ArrayList;
import com.yxcorp.gifshow.magic.ui.magicemoji.swap.f$a;
import java.lang.Runnable;
import ekd.k1;
import java.util.List;
import trd.t;

public final class f implements a	// class@001c3d
{
    public final SwapMagicAlbumActivity$i b;
    public final KSAssetExportInfo c;
    public final Intent d;

    public void f(SwapMagicAlbumActivity$i p0,KSAssetExportInfo p1,Intent p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public final void onActivityCallback(int p0,int p1,Intent p2){
       if (PatchProxy.isSupport(f.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, this, f.class, "1")) {
          return;
       }
       if (p0 == 101 && p1 == -1) {
          a.m(p2);
          QMedia qMedia = j0.e(p2, "kuaishan_clip_video_qmedia");
          String str = "SwapMagicAlbumActivity";
          if (qMedia == null) {
             b.b(str, "clipMedia is null");
             return;
          }else {
             b.d(str, "clipMedia, success, clipMedia:"+qMedia+", "+"exportPath:"+qMedia.mExportFilePath);
             Iterator iterator = this.b.b.W.iterator();
             QMedia qMedia1 = null;
             while (iterator.hasNext()) {
                p2 = iterator.next();
                QMedia qMedia2 = p2.b();
                if (qMedia2 != null) {
                   qMedia1 = qMedia2.path;
                }
                if (TextUtils.n(qMedia1, qMedia.path)) {
                   qMedia1 = p2;
                   break ;
                }
             }
             SwapMagicAlbumActivity w = this.b.b.W;
             Objects.requireNonNull(w, "null cannot be cast to non-null type kotlin.collections.MutableCollection<T>");
             s0.a(w).remove(qMedia1);
             f tb = this.b;
             tb.b.W.add(new SwapMagicAlbumActivity$a(qMedia, this.c, true, tb.e));
             if (this.b.f != null) {
                k1.p(new f$a(this, qMedia), Integer.valueOf(800));
             }
             if (this.b.b.C3()) {
                this.b.b.D3(t.k(qMedia), t.k(this.b.c), this.d);
             }
          }
       }
       return;
    }
}
