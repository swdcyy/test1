package com.yxcorp.gifshow.hotword_v2.HotWordExperimentUtil$placeHolderMatchBubbleKeyWord$2$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.framework.abtest.f;

public final class HotWordExperimentUtil$placeHolderMatchBubbleKeyWord$2$2 extends Lambda implements a	// class@0018fc
{
    public static final HotWordExperimentUtil$placeHolderMatchBubbleKeyWord$2$2 INSTANCE;

    static {
       HotWordExperimentUtil$placeHolderMatchBubbleKeyWord$2$2.INSTANCE = new HotWordExperimentUtil$placeHolderMatchBubbleKeyWord$2$2();
    }
    public void HotWordExperimentUtil$placeHolderMatchBubbleKeyWord$2$2(){
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       Object obj = PatchProxy.apply(null, this, HotWordExperimentUtil$placeHolderMatchBubbleKeyWord$2$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return f.a("PlaceHolder_Match_BubbleKeyWord");
    }
}
