package com.kuaishou.live.lite.anchorinfo.infov2.LiteAnchorInfoV2Item$playFollowAnim$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class LiteAnchorInfoV2Item$playFollowAnim$1 extends Lambda implements a	// class@001e62
{
    public final a $onAnimFinishCallback;

    public void LiteAnchorInfoV2Item$playFollowAnim$1(a p0){
       this.$onAnimFinishCallback = p0;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       if (PatchProxy.applyVoid(null, this, LiteAnchorInfoV2Item$playFollowAnim$1.class, "1")) {
          return;
       }
       this.$onAnimFinishCallback.invoke();
       return;
    }
}
