package com.kuaishou.commercial.search.feed.AdSearchDoubleFeedClickRecommendPresenter$a;
import com.kwai.video.player.IMediaPlayer$OnInfoListener;
import com.kuaishou.commercial.search.feed.AdSearchDoubleFeedClickRecommendPresenter;
import java.lang.Object;
import com.kwai.video.player.IMediaPlayer;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.commercial.search.b;

public final class AdSearchDoubleFeedClickRecommendPresenter$a implements IMediaPlayer$OnInfoListener	// class@001555
{
    public final AdSearchDoubleFeedClickRecommendPresenter b;

    public void AdSearchDoubleFeedClickRecommendPresenter$a(AdSearchDoubleFeedClickRecommendPresenter p0){
       this.b = p0;
       super();
    }
    public final boolean onInfo(IMediaPlayer p0,int p1,int p2){
       if (PatchProxy.isSupport(AdSearchDoubleFeedClickRecommendPresenter$a.class)) {
          p0 = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, AdSearchDoubleFeedClickRecommendPresenter$a.class, "1");
          if (p0 != PatchProxyResult.class) {
             return p0.booleanValue();
          }
       }
       if (p1 == 0x2775) {
          b.m(AdSearchDoubleFeedClickRecommendPresenter.P8(this.b).mEntity, 1);
          this.b.c9(1);
       }
       return false;
    }
}
