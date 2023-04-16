package com.kuaishou.live.lite.highfrequency.LiveLiteHighFrequencyGuideController$registerFansGroupItemVCFactory$1$createViewController$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.lite.highfrequency.LiveLiteHighFrequencyGuideController$registerFansGroupItemVCFactory$1;
import com.kuaishou.live.lite.delayinfo.LiveLiteDelayInfoResponse$HighFrequencyActionStyle;
import mb3.d;
import com.kuaishou.live.lite.delayinfo.LiveLiteDelayInfoResponse;
import com.kuaishou.live.lite.delayinfo.LiveLiteDelayInfoResponse$HighFrequencyActionStyles;
import java.lang.Object;

public final class LiveLiteHighFrequencyGuideController$registerFansGroupItemVCFactory$1$createViewController$1 extends Lambda implements a	// class@0009a7
{
    public final LiveLiteHighFrequencyGuideController$registerFansGroupItemVCFactory$1 this$0;

    public void LiveLiteHighFrequencyGuideController$registerFansGroupItemVCFactory$1$createViewController$1(LiveLiteHighFrequencyGuideController$registerFansGroupItemVCFactory$1 p0){
       this.this$0 = p0;
       super(0);
    }
    public final LiveLiteDelayInfoResponse$HighFrequencyActionStyle invoke(){
       LiveLiteDelayInfoResponse$HighFrequencyActionStyles mJoinFansGro;
       d k = this.this$0.a.k;
       if (k != null) {
          LiveLiteDelayInfoResponse mHighFrequen = k.mHighFrequencyActionStyle;
          if (mHighFrequen != null) {
             mJoinFansGro = mHighFrequen.mJoinFansGroupConfig;
          label_0010 :
             return mJoinFansGro;
          }
       }
       mJoinFansGro = null;
       goto label_0010 ;
    }
    public Object invoke(){
       return this.invoke();
    }
}
