package com.kuaishou.live.common.core.component.hotspot.detail.coremediaarea.LiveHotSpotDetailPhotoPlayerCardViewController$createPlayerManager$dataSource$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Object;
import com.kwai.video.wayne.player.builder.WayneBuildData;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kwai.framework.model.feed.BaseFeed;
import kp.r1;

public final class LiveHotSpotDetailPhotoPlayerCardViewController$createPlayerManager$dataSource$1 extends Lambda implements l	// class@001393
{
    public final long $position;
    public final QPhoto $qPhoto;

    public void LiveHotSpotDetailPhotoPlayerCardViewController$createPlayerManager$dataSource$1(long p0,QPhoto p1){
       this.$position = p0;
       this.$qPhoto = p1;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(WayneBuildData p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveHotSpotDetailPhotoPlayerCardViewController$createPlayerManager$dataSource$1.class, "1")) {
          return;
       }
       a.o(p0, "it");
       p0.setStartPosition(this.$position);
       p0.setBizFt("HotSpotDetail");
       p0.setBizType(r1.o0(this.$qPhoto.getEntity(), "HotSpotDetail"));
       return;
    }
}
