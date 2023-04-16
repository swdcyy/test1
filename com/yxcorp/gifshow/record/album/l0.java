package com.yxcorp.gifshow.record.album.l0;
import erd.o;
import java.lang.Object;
import java.lang.Boolean;
import k8c.a;
import java.lang.String;
import q87.c;
import android.util.Pair;
import com.kwai.gifshow.post.api.feature.popup.BubbleEnterPostParam;
import java.io.File;
import java.lang.Integer;
import brd.t;
import com.yxcorp.gifshow.record.album.LocalAlbumUtils;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gifshow.edit.draft.model.DraftFileManager;
import k8c.q1;

public final class l0 implements o	// class@001731
{
    public final long b;

    public void l0(long p0){
       this.b = p0;
    }
    public final Object apply(Object p0){
       l0 tb = this.b;
       String str = null;
       if (p0.booleanValue()) {
          Object[] objArray = new Object[0];
          a.D().w("LocalAlbumUtils", "block by recover dialog", objArray);
          p0 = t.just(new Pair(new BubbleEnterPostParam(1, str, str), Integer.valueOf(-101)));
       }else {
          p0 = LocalAlbumUtils.class;
          if (PatchProxy.isSupport(p0)) {
             p0 = PatchProxy.applyOneRefs(Long.valueOf(tb), str, p0, "33");
             if (p0 != PatchProxyResult.class) {
             }
          }
          if (!TextUtils.x(LocalAlbumUtils.a)) {
             p0 = DraftFileManager.E().X(new File(LocalAlbumUtils.a)).flatMap(new q1(tb));
          }else {
             p0 = LocalAlbumUtils.k(tb);
          }
       }
       return p0;
    }
}
