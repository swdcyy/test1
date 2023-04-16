package com.kwai.slide.play.detail.dispatcher.slide.SlideDispatchAssist$enableDispatchOptCancel$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.sdk.switchconfig.a;

public final class SlideDispatchAssist$enableDispatchOptCancel$2 extends Lambda implements a	// class@0017bb
{
    public static final SlideDispatchAssist$enableDispatchOptCancel$2 INSTANCE;

    static {
       SlideDispatchAssist$enableDispatchOptCancel$2.INSTANCE = new SlideDispatchAssist$enableDispatchOptCancel$2();
    }
    public void SlideDispatchAssist$enableDispatchOptCancel$2(){
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       Object obj = PatchProxy.apply(null, this, SlideDispatchAssist$enableDispatchOptCancel$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.t().d("enableDispatchOptCancel", true);
    }
}
