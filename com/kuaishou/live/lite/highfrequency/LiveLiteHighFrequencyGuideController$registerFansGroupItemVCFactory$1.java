package com.kuaishou.live.lite.highfrequency.LiveLiteHighFrequencyGuideController$registerFansGroupItemVCFactory$1;
import mb3.a;
import mb3.d;
import java.lang.Object;
import mb3.f;
import mb3.c;
import n93.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.kuaishou.live.lite.highfrequency.biz.fansgroup.LiveLiteHighFrequencyGuideFansGroupItemVC;
import com.kuaishou.livestream.message.nano.HighFrequencyActionGuide;
import com.kuaishou.live.lite.highfrequency.LiveLiteHighFrequencyGuideController$registerFansGroupItemVCFactory$1$createViewController$1;
import nb3.a;
import ip3.a;
import msd.a;
import com.kuaishou.live.common.core.component.highfrequency.textdescription.HighFluencyDescriptionBinder$a;
import e93.a;
import pg1.e;
import com.kuaishou.live.lite.highfrequency.LiveLiteHighFrequencyGuideType;

public final class LiveLiteHighFrequencyGuideController$registerFansGroupItemVCFactory$1 implements a	// class@0009a8
{
    public final d a;

    public void LiveLiteHighFrequencyGuideController$registerFansGroupItemVCFactory$1(d p0){
       this.a = p0;
       super();
    }
    public a a(f p0,c p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, LiveLiteHighFrequencyGuideController$registerFansGroupItemVCFactory$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "areaData");
       a.p(p1, "delegate");
       LiveLiteHighFrequencyGuideController$registerFansGroupItemVCFactory$1 ta = this.a;
       LiveLiteHighFrequencyGuideFansGroupItemVC liveLiteHigh = new LiveLiteHighFrequencyGuideFansGroupItemVC(p0.a(), new LiveLiteHighFrequencyGuideController$registerFansGroupItemVCFactory$1$createViewController$1(this), p1, new a(this.a.u), ta.q, ta.r, ta.w, ta.x);
       return obj;
    }
    public LiveLiteHighFrequencyGuideType getType(){
       return LiveLiteHighFrequencyGuideType.FANS_GROUP;
    }
}
