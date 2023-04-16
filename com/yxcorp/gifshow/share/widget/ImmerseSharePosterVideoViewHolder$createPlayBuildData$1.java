package com.yxcorp.gifshow.share.widget.ImmerseSharePosterVideoViewHolder$createPlayBuildData$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import com.kwai.video.wayne.player.builder.WayneBuildData;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kwai.video.wayne.player.builder.PlayerCommonBuildData;

public final class ImmerseSharePosterVideoViewHolder$createPlayBuildData$1 extends Lambda implements l	// class@001d0b
{
    public static final ImmerseSharePosterVideoViewHolder$createPlayBuildData$1 INSTANCE;

    static {
       ImmerseSharePosterVideoViewHolder$createPlayBuildData$1.INSTANCE = new ImmerseSharePosterVideoViewHolder$createPlayBuildData$1();
    }
    public void ImmerseSharePosterVideoViewHolder$createPlayBuildData$1(){
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(WayneBuildData p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ImmerseSharePosterVideoViewHolder$createPlayBuildData$1.class, "1")) {
          return;
       }
       a.p(p0, "buildData");
       p0.mBizFt = ":ks-components:kuaishou-forward";
       p0.setBizType("immerse_share_panel");
       p0.setStartPosition(0);
       p0.setIsSlideMode(false);
       return;
    }
}
