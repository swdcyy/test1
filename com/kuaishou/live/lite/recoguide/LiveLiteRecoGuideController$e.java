package com.kuaishou.live.lite.recoguide.LiveLiteRecoGuideController$e;
import ok.x;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveLiteRecoGuideConfig;
import java.lang.reflect.Type;
import wg3.a;
import kotlin.jvm.internal.a;

public final class LiveLiteRecoGuideController$e implements x	// class@000ad7
{
    public static final LiveLiteRecoGuideController$e b;

    static {
       LiveLiteRecoGuideController$e.b = new LiveLiteRecoGuideController$e();
    }
    public void LiveLiteRecoGuideController$e(){
       super();
    }
    public Object get(){
       LiveConfigStartupResponse$LiveLiteRecoGuideConfig liveLiteReco = PatchProxy.apply(null, this, LiveLiteRecoGuideController$e.class, "1");
       if (liveLiteReco != PatchProxyResult.class) {
       }else {
          liveLiteReco = a.w(LiveConfigStartupResponse$LiveLiteRecoGuideConfig.class);
          a.o(liveLiteReco, "com.kuaishou.live.model.¡­fig::class.java\n        \)");
       }
       return liveLiteReco;
    }
}
