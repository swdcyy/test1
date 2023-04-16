package com.yxcorp.gifshow.postentrance.util.HomePostEntranceExpUtil$enableMoodBubble$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.framework.abtest.f;

public final class HomePostEntranceExpUtil$enableMoodBubble$2 extends Lambda implements a	// class@001083
{
    public static final HomePostEntranceExpUtil$enableMoodBubble$2 INSTANCE;

    static {
       HomePostEntranceExpUtil$enableMoodBubble$2.INSTANCE = new HomePostEntranceExpUtil$enableMoodBubble$2();
    }
    public void HomePostEntranceExpUtil$enableMoodBubble$2(){
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       Object obj = PatchProxy.apply(null, this, HomePostEntranceExpUtil$enableMoodBubble$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (f.e("enableMoodTabADR") != b) {
          b = false;
       }
       return b;
    }
}
