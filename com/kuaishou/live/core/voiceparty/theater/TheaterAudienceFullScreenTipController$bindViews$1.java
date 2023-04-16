package com.kuaishou.live.core.voiceparty.theater.TheaterAudienceFullScreenTipController$bindViews$1;
import msd.p;
import kotlin.jvm.internal.Lambda;
import dw2.i;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import dw2.i$b;

public final class TheaterAudienceFullScreenTipController$bindViews$1 extends Lambda implements p	// class@00194e
{
    public static final TheaterAudienceFullScreenTipController$bindViews$1 INSTANCE;

    static {
       TheaterAudienceFullScreenTipController$bindViews$1.INSTANCE = new TheaterAudienceFullScreenTipController$bindViews$1();
    }
    public void TheaterAudienceFullScreenTipController$bindViews$1(){
       super(2);
    }
    public final i invoke(i p0,Boolean p1){
       i$b d;
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, TheaterAudienceFullScreenTipController$bindViews$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "playTip");
       a.o(p1, "isLive");
       if (p1.booleanValue()) {
          d = i$b.d;
       }
       return d;
    }
    public Object invoke(Object p0,Object p1){
       return this.invoke(p0, p1);
    }
}
