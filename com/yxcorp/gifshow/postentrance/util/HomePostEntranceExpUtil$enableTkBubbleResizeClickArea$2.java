package com.yxcorp.gifshow.postentrance.util.HomePostEntranceExpUtil$enableTkBubbleResizeClickArea$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.sdk.switchconfig.a;

public final class HomePostEntranceExpUtil$enableTkBubbleResizeClickArea$2 extends Lambda implements a	// class@001084
{
    public static final HomePostEntranceExpUtil$enableTkBubbleResizeClickArea$2 INSTANCE;

    static {
       HomePostEntranceExpUtil$enableTkBubbleResizeClickArea$2.INSTANCE = new HomePostEntranceExpUtil$enableTkBubbleResizeClickArea$2();
    }
    public void HomePostEntranceExpUtil$enableTkBubbleResizeClickArea$2(){
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       Object obj = PatchProxy.apply(null, this, HomePostEntranceExpUtil$enableTkBubbleResizeClickArea$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.t().d("enableHomePostTkBubbleResizeArea", false);
    }
}
