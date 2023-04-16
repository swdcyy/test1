package com.yxcorp.gifshow.detail.player.panel.smallwindow.play.SmallWindowPlaySession$createPlayBuildDataKpMid$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.detail.player.panel.smallwindow.play.SmallWindowPlaySession;
import java.lang.Integer;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Object;
import com.kwai.video.wayne.player.builder.WayneBuildData;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.lang.Number;
import com.kwai.video.wayne.player.builder.PlayerCommonBuildData;
import com.kwai.framework.model.feed.BaseFeed;
import kp.r1;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import uw9.t3;
import le5.f;

public final class SmallWindowPlaySession$createPlayBuildDataKpMid$1 extends Lambda implements l	// class@00163f
{
    public final QPhoto $photo;
    public final Integer $playType;
    public final long $pos;
    public final int $retryCount;
    public final SmallWindowPlaySession this$0;

    public void SmallWindowPlaySession$createPlayBuildDataKpMid$1(SmallWindowPlaySession p0,Integer p1,long p2,int p3,QPhoto p4){
       this.this$0 = p0;
       this.$playType = p1;
       this.$pos = p2;
       this.$retryCount = p3;
       this.$photo = p4;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(WayneBuildData p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SmallWindowPlaySession$createPlayBuildDataKpMid$1.class, "1")) {
          return;
       }
       a.p(p0, "buildData");
       SmallWindowPlaySession$createPlayBuildDataKpMid$1 t$playType = this.$playType;
       if (t$playType != null) {
          WayneBuildData wayneBuildDa = p0.setStartPlayType(t$playType.intValue());
       }
       p0.setStartPosition(this.$pos).setMediaCodecPolicy(2).setIsSlideMode(false).setPlayIndex(this.$retryCount).setBizFt(":ks-features:ft-feed:detail").setBizType(r1.o0(this.$photo.getEntity(), "SmallWindowPlay")).setSelectManifestRepId(t3.a(this.this$0.b, this.$photo)).setEnableAPJoySound(f.s());
       return;
    }
}
