package com.kuaishou.live.basic.playview.LivePlayViewHelper;
import com.kuaishou.live.basic.playview.LivePlayViewHelper$isWideScreenFitKswitchOpen$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kuaishou.live.basic.playview.LivePlayViewHelper$isPreviewLiveObserveLayoutChangeKswitchOpen$2;
import java.lang.Object;
import android.app.Activity;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Float;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import lnc.b5;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.StringBuilder;
import pp.c;
import com.kuaishou.android.live.log.b;

public final class LivePlayViewHelper	// class@000cf5
{
    public static final p a;
    public static final p b;
    public static final LivePlayViewHelper c;

    static {
       LivePlayViewHelper.c = new LivePlayViewHelper();
       LivePlayViewHelper.a = s.c(LivePlayViewHelper$isWideScreenFitKswitchOpen$2.INSTANCE);
       LivePlayViewHelper.b = s.c(LivePlayViewHelper$isPreviewLiveObserveLayoutChangeKswitchOpen$2.INSTANCE);
    }
    public void LivePlayViewHelper(){
       super();
    }
    public static final boolean c(int p0,int p1,float p2,Activity p3){
       if (PatchProxy.isSupport(LivePlayViewHelper.class)) {
          Object obj = PatchProxy.applyFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Float.valueOf(p2), p3, null, LivePlayViewHelper.class, "3");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       a.p(p3, "activity");
       boolean b = b5.a(p3);
       float f = (float)p0 / (float)p1;
       LivePlayViewHelper c = LivePlayViewHelper.c;
       boolean b1 = (c.b() && (!b && ((double)f - 0x3fe2000000000000 > 0 && ((double)p2 - 0x3ff0000000000000 < 0 && p2 - f < 0))))? true: false;
       b.Z(LiveLogTag.LIVE_PLAY_VIEW, "isWideScreenNeedFit:"+b1+" switchOpen:"+c.b()+' '+"screenRatio:"+f+" videoRatio:"+p2+" isMultiMode:"+b);
       return b1;
    }
    public final boolean a(){
       Object obj = PatchProxy.apply(null, this, LivePlayViewHelper.class, "2");
       if (obj == PatchProxyResult.class) {
          obj = LivePlayViewHelper.b.getValue();
       }
       return obj.booleanValue();
    }
    public final boolean b(){
       Object obj = PatchProxy.apply(null, this, LivePlayViewHelper.class, "1");
       if (obj == PatchProxyResult.class) {
          obj = LivePlayViewHelper.a.getValue();
       }
       return obj.booleanValue();
    }
}
