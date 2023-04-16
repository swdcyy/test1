package com.yxcorp.gifshow.hotword_v2.HotWordExperimentUtil$placeHolderMatchBubbleKeyWord$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.hotword_v2.HotWordExperimentUtil;
import com.yxcorp.gifshow.hotword_v2.HotWordExperimentUtil$placeHolderMatchBubbleKeyWord$2$1;
import com.yxcorp.gifshow.hotword_v2.HotWordExperimentUtil$placeHolderMatchBubbleKeyWord$2$2;
import java.util.Objects;
import java.lang.Number;

public final class HotWordExperimentUtil$placeHolderMatchBubbleKeyWord$2 extends Lambda implements a	// class@0018fd
{
    public static final HotWordExperimentUtil$placeHolderMatchBubbleKeyWord$2 INSTANCE;

    static {
       HotWordExperimentUtil$placeHolderMatchBubbleKeyWord$2.INSTANCE = new HotWordExperimentUtil$placeHolderMatchBubbleKeyWord$2();
    }
    public void HotWordExperimentUtil$placeHolderMatchBubbleKeyWord$2(){
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       int b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       HotWordExperimentUtil obj = PatchProxy.apply(null, this, HotWordExperimentUtil$placeHolderMatchBubbleKeyWord$2.class, "1");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = HotWordExperimentUtil.g;
       HotWordExperimentUtil$placeHolderMatchBubbleKeyWord$2$1 iNSTANCE = HotWordExperimentUtil$placeHolderMatchBubbleKeyWord$2$1.INSTANCE;
       HotWordExperimentUtil$placeHolderMatchBubbleKeyWord$2$2 iNSTANCE1 = HotWordExperimentUtil$placeHolderMatchBubbleKeyWord$2$2.INSTANCE;
       Objects.requireNonNull(obj);
       Object obj1 = PatchProxy.applyTwoRefs(iNSTANCE, iNSTANCE1, obj, HotWordExperimentUtil.class, "7");
       if (obj1 != patchProxyRe) {
          b = obj1.booleanValue();
       }else {
          b = iNSTANCE.invoke().intValue();
          if (b >= 0) {
             b = (b == 1)? true: false;
          }else {
             b = iNSTANCE1.invoke().booleanValue();
          }
       }
       return b;
    }
}
