package com.kuaishou.live.lite.interactivemessage.LiveLiteInteractiveMessageViewController$setupGestureDetector$disposable$1$2;
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

public final class LiveLiteInteractiveMessageViewController$setupGestureDetector$disposable$1$2 extends Lambda implements l	// class@0009c8
{
    public static final LiveLiteInteractiveMessageViewController$setupGestureDetector$disposable$1$2 INSTANCE;

    static {
       LiveLiteInteractiveMessageViewController$setupGestureDetector$disposable$1$2.INSTANCE = new LiveLiteInteractiveMessageViewController$setupGestureDetector$disposable$1$2();
    }
    public void LiveLiteInteractiveMessageViewController$setupGestureDetector$disposable$1$2(){
       super(1);
    }
    public Object invoke(Object p0){
       return Boolean.valueOf(this.invoke(p0));
    }
    public final boolean invoke(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveLiteInteractiveMessageViewController$setupGestureDetector$disposable$1$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "it");
       return true;
    }
}
