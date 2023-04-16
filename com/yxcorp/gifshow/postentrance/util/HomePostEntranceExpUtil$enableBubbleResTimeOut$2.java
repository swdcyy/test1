package com.yxcorp.gifshow.postentrance.util.HomePostEntranceExpUtil$enableBubbleResTimeOut$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.sdk.switchconfig.a;

public final class HomePostEntranceExpUtil$enableBubbleResTimeOut$2 extends Lambda implements a	// class@001082
{
    public static final HomePostEntranceExpUtil$enableBubbleResTimeOut$2 INSTANCE;

    static {
       HomePostEntranceExpUtil$enableBubbleResTimeOut$2.INSTANCE = new HomePostEntranceExpUtil$enableBubbleResTimeOut$2();
    }
    public void HomePostEntranceExpUtil$enableBubbleResTimeOut$2(){
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       Object obj = PatchProxy.apply(null, this, HomePostEntranceExpUtil$enableBubbleResTimeOut$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.t().d("enableHomePostBubbleResTimeOut", true);
    }
}
