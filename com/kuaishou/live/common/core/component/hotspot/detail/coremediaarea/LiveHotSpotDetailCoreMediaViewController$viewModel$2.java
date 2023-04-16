package com.kuaishou.live.common.core.component.hotspot.detail.coremediaarea.LiveHotSpotDetailCoreMediaViewController$viewModel$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.common.core.component.hotspot.detail.coremediaarea.LiveHotSpotDetailCoreMediaViewController;
import androidx.lifecycle.ViewModelProvider$Factory;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.common.core.component.hotspot.detail.coremediaarea.LiveHotSpotDetailCoreMediaViewController$viewModel$2$1;
import com.kuaishou.live.common.core.component.hotspot.detail.coremediaarea.LiveHotSpotDetailCoreMediaViewController$viewModel$2$a;

public final class LiveHotSpotDetailCoreMediaViewController$viewModel$2 extends Lambda implements a	// class@001387
{
    public final LiveHotSpotDetailCoreMediaViewController this$0;

    public void LiveHotSpotDetailCoreMediaViewController$viewModel$2(LiveHotSpotDetailCoreMediaViewController p0){
       this.this$0 = p0;
       super(0);
    }
    public final ViewModelProvider$Factory invoke(){
       Object obj = PatchProxy.apply(null, this, LiveHotSpotDetailCoreMediaViewController$viewModel$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new LiveHotSpotDetailCoreMediaViewController$viewModel$2$a(new LiveHotSpotDetailCoreMediaViewController$viewModel$2$1(this));
    }
    public Object invoke(){
       return this.invoke();
    }
}
