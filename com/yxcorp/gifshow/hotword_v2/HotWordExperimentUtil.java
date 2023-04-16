package com.yxcorp.gifshow.hotword_v2.HotWordExperimentUtil;
import com.yxcorp.gifshow.hotword_v2.HotWordExperimentUtil$searchHotWordStyle$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.yxcorp.gifshow.hotword_v2.HotWordExperimentUtil$placeHolderMatchBubbleKeyWord$2;
import com.yxcorp.gifshow.hotword_v2.HotWordExperimentUtil$bubbleReshowDelayDuration$2;
import com.yxcorp.gifshow.hotword_v2.HotWordExperimentUtil$bubbleCompatibleWithCaptionType$2;
import com.yxcorp.gifshow.hotword_v2.HotWordExperimentUtil$enableBubbleUnLogin$2;
import com.yxcorp.gifshow.hotword_v2.HotWordExperimentUtil$enableBubbleTK$2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.Boolean;

public final class HotWordExperimentUtil	// class@0018ff
{
    public static final p a;
    public static final p b;
    public static final p c;
    public static final p d;
    public static final p e;
    public static final p f;
    public static final HotWordExperimentUtil g;

    static {
       HotWordExperimentUtil.g = new HotWordExperimentUtil();
       HotWordExperimentUtil.a = s.c(HotWordExperimentUtil$searchHotWordStyle$2.INSTANCE);
       HotWordExperimentUtil.b = s.c(HotWordExperimentUtil$placeHolderMatchBubbleKeyWord$2.INSTANCE);
       HotWordExperimentUtil.c = s.c(HotWordExperimentUtil$bubbleReshowDelayDuration$2.INSTANCE);
       HotWordExperimentUtil.d = s.c(HotWordExperimentUtil$bubbleCompatibleWithCaptionType$2.INSTANCE);
       HotWordExperimentUtil.e = s.c(HotWordExperimentUtil$enableBubbleUnLogin$2.INSTANCE);
       HotWordExperimentUtil.f = s.c(HotWordExperimentUtil$enableBubbleTK$2.INSTANCE);
    }
    public void HotWordExperimentUtil(){
       super();
    }
    public static final int d(){
       Object obj = PatchProxy.apply(null, null, HotWordExperimentUtil.class, "1");
       if (obj == PatchProxyResult.class) {
          obj = HotWordExperimentUtil.a.getValue();
       }
       return obj.intValue();
    }
    public final int a(){
       Object obj = PatchProxy.apply(null, this, HotWordExperimentUtil.class, "4");
       if (obj == PatchProxyResult.class) {
          obj = HotWordExperimentUtil.d.getValue();
       }
       return obj.intValue();
    }
    public final boolean b(){
       Object obj = PatchProxy.apply(null, this, HotWordExperimentUtil.class, "6");
       if (obj == PatchProxyResult.class) {
          obj = HotWordExperimentUtil.f.getValue();
       }
       return obj.booleanValue();
    }
    public final boolean c(){
       Object obj = PatchProxy.apply(null, this, HotWordExperimentUtil.class, "5");
       if (obj == PatchProxyResult.class) {
          obj = HotWordExperimentUtil.e.getValue();
       }
       return obj.booleanValue();
    }
}
