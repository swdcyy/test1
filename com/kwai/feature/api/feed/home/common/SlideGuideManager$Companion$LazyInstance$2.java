package com.kwai.feature.api.feed.home.common.SlideGuideManager$Companion$LazyInstance$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kwai.feature.api.feed.home.common.SlideGuideManager;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class SlideGuideManager$Companion$LazyInstance$2 extends Lambda implements a	// class@000ef4
{
    public static final SlideGuideManager$Companion$LazyInstance$2 INSTANCE;

    static {
       SlideGuideManager$Companion$LazyInstance$2.INSTANCE = new SlideGuideManager$Companion$LazyInstance$2();
    }
    public void SlideGuideManager$Companion$LazyInstance$2(){
       super(0);
    }
    public final SlideGuideManager invoke(){
       Object obj = PatchProxy.apply(null, this, SlideGuideManager$Companion$LazyInstance$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new SlideGuideManager();
    }
    public Object invoke(){
       return this.invoke();
    }
}
