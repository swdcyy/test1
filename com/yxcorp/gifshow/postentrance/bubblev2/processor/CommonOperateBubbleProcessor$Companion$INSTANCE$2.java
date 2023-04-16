package com.yxcorp.gifshow.postentrance.bubblev2.processor.CommonOperateBubbleProcessor$Companion$INSTANCE$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.postentrance.bubblev2.processor.CommonOperateBubbleProcessor;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class CommonOperateBubbleProcessor$Companion$INSTANCE$2 extends Lambda implements a	// class@001031
{
    public static final CommonOperateBubbleProcessor$Companion$INSTANCE$2 INSTANCE;

    static {
       CommonOperateBubbleProcessor$Companion$INSTANCE$2.INSTANCE = new CommonOperateBubbleProcessor$Companion$INSTANCE$2();
    }
    public void CommonOperateBubbleProcessor$Companion$INSTANCE$2(){
       super(0);
    }
    public final CommonOperateBubbleProcessor invoke(){
       Object obj = PatchProxy.apply(null, this, CommonOperateBubbleProcessor$Companion$INSTANCE$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new CommonOperateBubbleProcessor();
    }
    public Object invoke(){
       return this.invoke();
    }
}
