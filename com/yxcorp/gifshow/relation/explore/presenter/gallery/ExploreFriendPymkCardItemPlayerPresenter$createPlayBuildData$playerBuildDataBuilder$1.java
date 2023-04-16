package com.yxcorp.gifshow.relation.explore.presenter.gallery.ExploreFriendPymkCardItemPlayerPresenter$createPlayBuildData$playerBuildDataBuilder$1;
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
import com.kwai.video.wayne.player.builder.PlayerCommonBuildData;
import com.kwai.framework.model.feed.BaseFeed;
import kp.r1;

public final class ExploreFriendPymkCardItemPlayerPresenter$createPlayBuildData$playerBuildDataBuilder$1 extends Lambda implements l	// class@001826
{
    public final QPhoto $photo;

    public void ExploreFriendPymkCardItemPlayerPresenter$createPlayBuildData$playerBuildDataBuilder$1(QPhoto p0){
       this.$photo = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(WayneBuildData p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ExploreFriendPymkCardItemPlayerPresenter$createPlayBuildData$playerBuildDataBuilder$1.class, "1")) {
          return;
       }
       a.p(p0, "buildData");
       p0 = p0.setStartPosition(0).setIsPreload(false).setMediaCodecPolicy(false).setIsSlideMode(false).setPlayIndex(false).setBizFt(":ks-features:ft-social:relation");
       a.o(p0, "buildData.setStartPositi¡­BuildConfig.PROJECT_NAME\)");
       p0.setBizType(r1.o0(this.$photo.getEntity(), "RecommendUserPlay"));
       return;
    }
}
