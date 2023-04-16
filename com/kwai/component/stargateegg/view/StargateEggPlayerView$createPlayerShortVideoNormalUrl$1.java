package com.kwai.component.stargateegg.view.StargateEggPlayerView$createPlayerShortVideoNormalUrl$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kwai.component.stargateegg.view.StargateEggPlayerView;
import com.kwai.framework.player.core.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import wc6.d;
import com.kwai.video.wayne.player.builder.WayneBuildData;
import com.kwai.video.wayne.player.builder.PlayerCommonBuildData;
import kotlin.jvm.internal.a;
import android.content.res.AssetManager;
import android.content.Context;
import java.io.InputStream;
import com.kwai.plugin.dva.split.SplitAssetHelper;
import kotlin.jvm.internal.Ref$LongRef;
import com.kwai.component.stargateegg.view.StargateEggPlayerView$createPlayerShortVideoNormalUrl$1$1;
import com.kwai.video.player.misc.IMediaDataSource;
import com.kwai.framework.player.core.c;

public final class StargateEggPlayerView$createPlayerShortVideoNormalUrl$1 extends Lambda implements a	// class@000b52
{
    public final StargateEggPlayerView this$0;

    public void StargateEggPlayerView$createPlayerShortVideoNormalUrl$1(StargateEggPlayerView p0){
       this.this$0 = p0;
       super(0);
    }
    public final b invoke(){
       WayneBuildData obj = PatchProxy.apply(null, this, StargateEggPlayerView$createPlayerShortVideoNormalUrl$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int i = 0;
       obj = new d(this.this$0.P).setBizFt(":ks-components:stargateegg").setStartPlayType(i).setMediaCodecPolicy(this.this$0.S);
       StargateEggPlayerView$createPlayerShortVideoNormalUrl$1 tthis$0 = this.this$0;
       StargateEggPlayerView l = tthis$0.L;
       StargateEggPlayerView stargateEggP = (l - -1 && (tthis$0.K - -1 && tthis$0.M != null))? 1: null;
       if (stargateEggP) {
          obj.setAbLoopCount(tthis$0.K, l, tthis$0.M, true);
          tthis$0 = this.this$0;
          tthis$0.K = -1;
          tthis$0.L = -1;
          tthis$0.M = i;
       }
       StargateEggPlayerView$createPlayerShortVideoNormalUrl$1 tthis$01 = this.this$0;
       if (tthis$01.i != null) {
          StargateEggPlayerView j = tthis$01.J;
          if (j == null) {
             a.S("mAppContext");
          }
          InputStream inputStream = SplitAssetHelper.open(j.getAssets(), this.this$0.f);
          a.o(inputStream, "mAppContext.assets.open\(mSrcUriString\)");
          Ref$LongRef longRef = new Ref$LongRef();
          longRef.element = 0;
          obj.setMediaDataSource(new StargateEggPlayerView$createPlayerShortVideoNormalUrl$1$1(this, longRef, inputStream));
       }else {
          obj.setNormalUrl(tthis$01.f, 1);
       }
       return c.a(obj);
    }
    public Object invoke(){
       return this.invoke();
    }
}
