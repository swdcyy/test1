package com.kuaishou.live.effect.resource.download.common.LiveMagicGiftDownloadController$a;
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
import java.util.Objects;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.model.SimpleMagicFace;
import java.util.List;
import com.kuaishou.android.live.log.b;
import c03.b;
import com.kuaishou.live.effect.resource.download.common.LiveMagicGiftDownloadVersion;
import xz2.a;
import vz2.f;
import c03.m;
import vz2.z;
import java.util.Map;

public class LiveMagicGiftDownloadController$a implements a0	// class@001b25
{
    public final LiveMagicGiftDownloadController a;

    public void LiveMagicGiftDownloadController$a(LiveMagicGiftDownloadController p0){
       this.a = p0;
       super();
    }
    public void a(MagicEmoji$MagicFace p0,a p1,int p2,Throwable p3){
       if (PatchProxy.isSupport(LiveMagicGiftDownloadController$a.class) && PatchProxy.applyVoidFourRefs(p0, p1, Integer.valueOf(p2), p3, this, LiveMagicGiftDownloadController$a.class, "1")) {
          return;
       }
       LiveMagicGiftDownloadController$a ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoidOneRefs(p0, ta, LiveMagicGiftDownloadController.class, "18")) {
          ta.q();
          b.P(ta.a, "[oneMagicGiftDownloadFailed]£º "+p0.mId+"*"+p0.mName);
       }
       a.d(p0, p1, this.a.u().f(), Integer.valueOf(p2), p3);
       f.e.d().b(p0.mId, p2, p3);
       return;
    }
    public boolean b(MagicEmoji$MagicFace p0){
       return z.b(this, p0);
    }
    public void c(MagicEmoji$MagicFace p0,a p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveMagicGiftDownloadController$a.class, "2")) {
          return;
       }
       LiveMagicGiftDownloadController$a ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoidOneRefs(p0, ta, LiveMagicGiftDownloadController.class, "19")) {
          b.P(ta.a, "[oneMagicGiftDownloadCompleted]£º"+p0+" sNeedDownloadMagicGifts.size: "+ta.g.size()+" totalCount: "+ta.m+" sDownloadAllMagicGiftState£º"+ta.i);
          if (p0 != null) {
             ta.B(p0);
             ta.y();
             ta.A(p0);
          }
       }
       a.c(p0, p1, this.a.u().f());
       f.e.d().a(p0.mId);
       return;
    }
}
