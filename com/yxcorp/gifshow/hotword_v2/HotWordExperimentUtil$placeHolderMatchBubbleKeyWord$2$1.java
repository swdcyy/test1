package com.yxcorp.gifshow.hotword_v2.HotWordExperimentUtil$placeHolderMatchBubbleKeyWord$2$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import xf6.d;
import xf6.l;
import java.lang.Integer;

public final class HotWordExperimentUtil$placeHolderMatchBubbleKeyWord$2$1 extends Lambda implements a	// class@0018fb
{
    public static final HotWordExperimentUtil$placeHolderMatchBubbleKeyWord$2$1 INSTANCE;

    static {
       HotWordExperimentUtil$placeHolderMatchBubbleKeyWord$2$1.INSTANCE = new HotWordExperimentUtil$placeHolderMatchBubbleKeyWord$2$1();
    }
    public void HotWordExperimentUtil$placeHolderMatchBubbleKeyWord$2$1(){
       super(0);
    }
    public final int invoke(){
       Object obj = PatchProxy.apply(null, this, HotWordExperimentUtil$placeHolderMatchBubbleKeyWord$2$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return l.e("KEY_SEARCH_ENABLE_PLACE_HOLDER_MATCH_HOT_WORD", -1);
    }
    public Object invoke(){
       return Integer.valueOf(this.invoke());
    }
}
