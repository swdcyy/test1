package com.kuaishou.live.effect.resource.download.common.h;
import java.lang.Runnable;
import com.kuaishou.live.effect.resource.download.common.LiveMagicGiftDownloadController;
import java.util.List;
import wz2.a;
import java.lang.Object;
import java.lang.StringBuilder;
import java.lang.String;
import com.kuaishou.android.live.log.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import vz2.p;
import t45.c;
import java.util.Iterator;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import c03.b;
import wz2.a$a;
import vz2.a0;
import vz2.k;
import e93.f;

public final class h implements Runnable	// class@001b3e
{
    public final LiveMagicGiftDownloadController b;
    public final List c;
    public final a d;

    public void h(LiveMagicGiftDownloadController p0,List p1,a p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void run(){
       h tb = this.b;
       h tc = this.c;
       h td = this.d;
       b.P(tb.a, "[downloadMagicGifts]£º start  magicGifts size: "+tc.size()+" needDownload: "+tc);
       int i = td.d();
       LiveMagicGiftDownloadController liveMagicGif = LiveMagicGiftDownloadController.class;
       if (!PatchProxy.isSupport(liveMagicGif) || !PatchProxy.applyVoidTwoRefs(tc, Integer.valueOf(i), tb, liveMagicGif, "33")) {
          c.a(new p(tb, tc, i));
       }
       i = 0;
       Iterator iterator = tc.iterator();
       while (iterator.hasNext()) {
          MagicEmoji$MagicFace magicFace = iterator.next();
          if (!tb.b(magicFace)) {
             if (tb.u().d(magicFace)) {
                b.P(tb.a, "[downloadMagicGifts]£º  now magicgift is downloading  >>>>>>>>>>>>>>>>>>  "+magicFace);
             }else {
                b.P(tb.a, "[downloadMagicGifts]£º to download <<<<<<<<<<<<<<<<<<<< "+magicFace);
                a$a uoa = a$a.b(td);
                uoa.g(tb.s);
                tb.u().e(magicFace, uoa.a());
             }
          }else {
             b.P(tb.a, "[downloadMagicGifts]£º already download completed "+magicFace);
             if (magicFace != null) {
                tb.B(magicFace);
                tb.A(magicFace);
                i = 1;
             }
          }
       }
       if (i) {
          f.h("updateAllMagicGiftDownloadState", new k(tb));
       }
       return;
    }
}
