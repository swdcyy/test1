package com.kuaishou.tk.api.view.player.TKOlympicPlayerView$createPlayerShortVideoNormalUrl$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.tk.api.view.player.TKOlympicPlayerView;
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
import com.kuaishou.tk.api.view.player.TKOlympicPlayerView$createPlayerShortVideoNormalUrl$1$1;
import com.kwai.video.player.misc.IMediaDataSource;
import com.kwai.framework.player.core.c;

public final class TKOlympicPlayerView$createPlayerShortVideoNormalUrl$1 extends Lambda implements a	// class@000f9c
{
    public final TKOlympicPlayerView this$0;

    public void TKOlympicPlayerView$createPlayerShortVideoNormalUrl$1(TKOlympicPlayerView p0){
       this.this$0 = p0;
       super(0);
    }
    public final b invoke(){
       WayneBuildData obj = PatchProxy.apply(null, this, TKOlympicPlayerView$createPlayerShortVideoNormalUrl$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int i = 0;
       obj = new d(this.this$0.K).setBizFt(":ks-kernels:tk-api").setStartPlayType(i).setMediaCodecPolicy(this.this$0.N);
       TKOlympicPlayerView$createPlayerShortVideoNormalUrl$1 tthis$0 = this.this$0;
       TKOlympicPlayerView v = tthis$0.V;
       TKOlympicPlayerView tKOlympicPla = (v - -1 && (tthis$0.U - -1 && tthis$0.W != null))? 1: null;
       if (tKOlympicPla) {
          obj.setAbLoopCount(tthis$0.U, v, tthis$0.W, true);
          tthis$0 = this.this$0;
          tthis$0.U = -1;
          tthis$0.V = -1;
          tthis$0.W = i;
       }
       TKOlympicPlayerView$createPlayerShortVideoNormalUrl$1 tthis$01 = this.this$0;
       if (tthis$01.i != null) {
          TKOlympicPlayerView j = tthis$01.J;
          if (j == null) {
             a.S("mAppContext");
          }
          InputStream inputStream = SplitAssetHelper.open(j.getAssets(), this.this$0.f);
          a.o(inputStream, "mAppContext.assets.open\(mSrcUriString\)");
          Ref$LongRef longRef = new Ref$LongRef();
          longRef.element = 0;
          obj.setMediaDataSource(new TKOlympicPlayerView$createPlayerShortVideoNormalUrl$1$1(this, longRef, inputStream));
       }else {
          obj.setNormalUrl(tthis$01.f, 1);
       }
       return c.a(obj);
    }
    public Object invoke(){
       return this.invoke();
    }
}
