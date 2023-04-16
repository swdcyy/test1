package com.kuaishou.live.effect.resource.download.common.LiveMagicGiftDownloadController$b;
import vz2.a0;
import com.kuaishou.live.effect.resource.download.common.LiveMagicGiftDownloadController;
import java.lang.Object;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import wz2.a;
import java.lang.Throwable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import java.lang.StringBuilder;
import java.util.List;
import com.kuaishou.android.live.log.b;
import c03.b;
import com.kuaishou.live.effect.resource.download.common.LiveMagicGiftDownloadVersion;
import xz2.a;
import vz2.f;
import c03.m;
import com.yxcorp.gifshow.model.SimpleMagicFace;
import vz2.z;

public class LiveMagicGiftDownloadController$b implements a0	// class@001b26
{
    public final LiveMagicGiftDownloadController a;

    public void LiveMagicGiftDownloadController$b(LiveMagicGiftDownloadController p0){
       this.a = p0;
       super();
    }
    public void a(MagicEmoji$MagicFace p0,a p1,int p2,Throwable p3){
       if (PatchProxy.isSupport(LiveMagicGiftDownloadController$b.class) && PatchProxy.applyVoidFourRefs(p0, p1, Integer.valueOf(p2), p3, this, LiveMagicGiftDownloadController$b.class, "2")) {
          return;
       }
       b.P(this.a.a, "[downloadMagicGiftsImmediately]:magicGift download failed "+p0);
       a.d(p0, p1, this.a.u().f(), Integer.valueOf(p2), p3);
       f.e.d().b(p0.mId, p2, p3);
       return;
    }
    public boolean b(MagicEmoji$MagicFace p0){
       return z.b(this, p0);
    }
    public void c(MagicEmoji$MagicFace p0,a p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveMagicGiftDownloadController$b.class, "1")) {
          return;
       }
       b.P(this.a.a, "[downloadMagicGiftsImmediately]:magicGift download completed "+p0);
       this.a.B(p0);
       this.a.z(p0);
       a.c(p0, p1, this.a.u().f());
       f.e.d().a(p0.mId);
       return;
    }
}
