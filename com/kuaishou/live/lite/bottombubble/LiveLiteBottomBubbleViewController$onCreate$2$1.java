package com.kuaishou.live.lite.bottombubble.LiveLiteBottomBubbleViewController$onCreate$2$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import android.view.MotionEvent;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;

public final class LiveLiteBottomBubbleViewController$onCreate$2$1 extends Lambda implements l	// class@001edd
{
    public static final LiveLiteBottomBubbleViewController$onCreate$2$1 INSTANCE;

    static {
       LiveLiteBottomBubbleViewController$onCreate$2$1.INSTANCE = new LiveLiteBottomBubbleViewController$onCreate$2$1();
    }
    public void LiveLiteBottomBubbleViewController$onCreate$2$1(){
       super(1);
    }
    public Object invoke(Object p0){
       return Boolean.valueOf(this.invoke(p0));
    }
    public final boolean invoke(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveLiteBottomBubbleViewController$onCreate$2$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "it");
       return true;
    }
}
