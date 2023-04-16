package com.kuaishou.live.lite.highfrequency.LiveLiteHighFrequencyGuideController$registerGiftItemVCFactory$1$createViewController$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.lite.highfrequency.LiveLiteHighFrequencyGuideController$registerGiftItemVCFactory$1;
import com.kuaishou.live.lite.delayinfo.LiveLiteDelayInfoResponse$HighFrequencyActionStyle;
import mb3.d;
import com.kuaishou.live.lite.delayinfo.LiveLiteDelayInfoResponse;
import com.kuaishou.live.lite.delayinfo.LiveLiteDelayInfoResponse$HighFrequencyActionStyles;
import java.lang.Object;

public final class LiveLiteHighFrequencyGuideController$registerGiftItemVCFactory$1$createViewController$1 extends Lambda implements a	// class@0009a9
{
    public final LiveLiteHighFrequencyGuideController$registerGiftItemVCFactory$1 this$0;

    public void LiveLiteHighFrequencyGuideController$registerGiftItemVCFactory$1$createViewController$1(LiveLiteHighFrequencyGuideController$registerGiftItemVCFactory$1 p0){
       this.this$0 = p0;
       super(0);
    }
    public final LiveLiteDelayInfoResponse$HighFrequencyActionStyle invoke(){
       LiveLiteDelayInfoResponse$HighFrequencyActionStyles mSendGiftCon;
       d k = this.this$0.a.k;
       if (k != null) {
          LiveLiteDelayInfoResponse mHighFrequen = k.mHighFrequencyActionStyle;
          if (mHighFrequen != null) {
             mSendGiftCon = mHighFrequen.mSendGiftConfig;
          label_0010 :
             return mSendGiftCon;
          }
       }
       mSendGiftCon = null;
       goto label_0010 ;
    }
    public Object invoke(){
       return this.invoke();
    }
}
