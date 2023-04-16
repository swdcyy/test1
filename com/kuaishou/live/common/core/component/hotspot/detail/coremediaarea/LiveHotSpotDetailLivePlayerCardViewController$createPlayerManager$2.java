package com.kuaishou.live.common.core.component.hotspot.detail.coremediaarea.LiveHotSpotDetailLivePlayerCardViewController$createPlayerManager$2;
import msd.p;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.common.core.component.hotspot.detail.coremediaarea.LiveHotSpotDetailLivePlayerCardViewController;
import com.yxcorp.gifshow.live.widget.LivePlayTextureView;
import java.lang.Object;
import java.lang.Number;
import qrd.l1;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import android.view.View;
import com.kuaishou.live.viewcontroller.ViewController;
import hn1.o;

public final class LiveHotSpotDetailLivePlayerCardViewController$createPlayerManager$2 extends Lambda implements p	// class@00138b
{
    public final LivePlayTextureView $textureView;
    public final LiveHotSpotDetailLivePlayerCardViewController this$0;

    public void LiveHotSpotDetailLivePlayerCardViewController$createPlayerManager$2(LiveHotSpotDetailLivePlayerCardViewController p0,LivePlayTextureView p1){
       this.this$0 = p0;
       this.$textureView = p1;
       super(2);
    }
    public Object invoke(Object p0,Object p1){
       this.invoke(p0.intValue(), p1.intValue());
       return l1.a;
    }
    public final void invoke(int p0,int p1){
       if (PatchProxy.isSupport(LiveHotSpotDetailLivePlayerCardViewController$createPlayerManager$2.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, LiveHotSpotDetailLivePlayerCardViewController$createPlayerManager$2.class, "1")) {
          return;
       }
       o.a(this.$textureView, this.this$0.P2(), p0, p1);
       return;
    }
}
