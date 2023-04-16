package com.yxcrop.gifshow.v3.editor.sticker_v2.ui.relay.RelayStickerFriendsPanelView$b;
import com.yxcorp.image.fresco.wrapper.ImageCallback;
import com.yxcrop.gifshow.v3.editor.sticker_v2.ui.relay.RelayStickerFriendsPanelView;
import java.util.concurrent.atomic.AtomicInteger;
import com.yxcorp.gifshow.record.interactive.RelayUserInfo;
import com.yxcorp.gifshow.image.KwaiImageView;
import java.lang.Object;
import android.graphics.drawable.Drawable;
import m0d.l;
import android.graphics.Bitmap;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import rmd.a;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import java.io.File;
import wkd.b;
import j80.c;
import java.lang.StringBuilder;
import java.lang.System;
import com.yxcorp.gifshow.util.BitmapUtil;
import com.yxcrop.gifshow.v3.editor.sticker_v2.ui.relay.RelayStickerFriendsPanelView$b$a;
import ub.b;
import com.yxcorp.gifshow.image.KwaiBindableImageView;

public final class RelayStickerFriendsPanelView$b implements ImageCallback	// class@000ace
{
    public final RelayStickerFriendsPanelView b;
    public final AtomicInteger c;
    public final RelayUserInfo d;
    public final KwaiImageView e;

    public void RelayStickerFriendsPanelView$b(RelayStickerFriendsPanelView p0,AtomicInteger p1,RelayUserInfo p2,KwaiImageView p3){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       super();
    }
    public void onCompleted(Drawable p0){
       l.a(this, p0);
    }
    public void onCompletedBitmap(Bitmap p0){
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(p0, this, RelayStickerFriendsPanelView$b.class, str)) {
          return;
       }
       l.b(this, p0);
       if (p0 == null) {
          this.b.c(this.c);
          return;
       }else {
          a a = a.a;
          String id = this.d.getId();
          Objects.requireNonNull(a);
          String str1 = PatchProxy.applyOneRefs(id, a, a.class, "2");
          if (str1 != PatchProxyResult.class) {
          }else {
             a.p(id, "uid");
             File uFile = PatchProxy.apply(null, a, a.class, str);
             if (uFile != PatchProxyResult.class) {
             }else {
                uFile = b.a(-1504323719).c(".interactive_sticker_cache");
             }
             str1 = new File(uFile, id+System.currentTimeMillis()+".jpg").getAbsolutePath();
             a.o(str1, "File\(getInteractiveStick¡­MAGE_SUFFIX\).absolutePath");
          }
          BitmapUtil.M(p0, str1, 98);
          this.e.w(new File(str1), this.b.m, this.b.m, new RelayStickerFriendsPanelView$b$a(this));
          this.d.setProfileLocalPath(str1);
          return;
       }
    }
    public void onProgress(float p0){
       l.c(this, p0);
    }
}
