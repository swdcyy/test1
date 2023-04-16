package com.kuaishou.live.lite.recoguide.LiveLiteRecoGuideController$b$a$a;
import com.kuaishou.live.lite.recoguide.a$a;
import com.kuaishou.live.lite.recoguide.LiveLiteRecoGuideController$b$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ia3.c;
import com.kuaishou.live.lite.recoguide.LiveLiteRecoGuideController$b;
import com.kuaishou.live.lite.recoguide.LiveLiteRecoGuideController;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import xp5.i;
import kotlin.jvm.internal.a;
import ok.x;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveLiteRecoGuideConfig;
import java.util.Objects;
import msd.l;

public final class LiveLiteRecoGuideController$b$a$a implements a$a	// class@000ad2
{
    public final LiveLiteRecoGuideController$b$a a;

    public void LiveLiteRecoGuideController$b$a$a(LiveLiteRecoGuideController$b$a p0){
       this.a = p0;
       super();
    }
    public final void a(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveLiteRecoGuideController$b$a$a.class, "1")) {
          return;
       }
       c a = c.a;
       ClientContent$LiveStreamPackage liveStreamPa = this.a.a.e.r.a();
       a.o(liveStreamPa, "logPackageService.liveStreamPackage");
       LiveConfigStartupResponse$LiveLiteRecoGuideConfig liveLiteReco = this.a.a.e.n.get();
       if (liveLiteReco != null) {
          objArray = liveLiteReco.mSubBizType;
       }
       Object[] objArray1 = objArray;
       Objects.requireNonNull(objArray1, "null cannot be cast to non-null type kotlin.String");
       c.b(a, liveStreamPa, objArray1, 1, null, null, 16, null);
       this.a.a.e.W2();
       return;
    }
}
