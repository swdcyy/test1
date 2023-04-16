package com.kuaishou.live.lite.anchorinfo.LiteRecommendAnchorInfoController$recommendAnchorInfoContainer$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.lite.anchorinfo.LiteRecommendAnchorInfoController;
import android.widget.FrameLayout;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.content.Context;
import com.kuaishou.live.viewcontroller.ViewController;

public final class LiteRecommendAnchorInfoController$recommendAnchorInfoContainer$2 extends Lambda implements a	// class@001e2b
{
    public final LiteRecommendAnchorInfoController this$0;

    public void LiteRecommendAnchorInfoController$recommendAnchorInfoContainer$2(LiteRecommendAnchorInfoController p0){
       this.this$0 = p0;
       super(0);
    }
    public final FrameLayout invoke(){
       Object obj = PatchProxy.apply(null, this, LiteRecommendAnchorInfoController$recommendAnchorInfoContainer$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new FrameLayout(this.this$0.D2());
    }
    public Object invoke(){
       return this.invoke();
    }
}
