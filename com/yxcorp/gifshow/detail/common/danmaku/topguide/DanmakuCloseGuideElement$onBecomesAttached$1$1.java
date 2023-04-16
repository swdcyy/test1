package com.yxcorp.gifshow.detail.common.danmaku.topguide.DanmakuCloseGuideElement$onBecomesAttached$1$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import lnc.i3;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class DanmakuCloseGuideElement$onBecomesAttached$1$1 extends Lambda implements l	// class@0013f7
{
    public static final DanmakuCloseGuideElement$onBecomesAttached$1$1 INSTANCE;

    static {
       DanmakuCloseGuideElement$onBecomesAttached$1$1.INSTANCE = new DanmakuCloseGuideElement$onBecomesAttached$1$1();
    }
    public void DanmakuCloseGuideElement$onBecomesAttached$1$1(){
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(i3 p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DanmakuCloseGuideElement$onBecomesAttached$1$1.class, "1")) {
          return;
       }
       a.p(p0, "$receiver");
       p0.d("type", "CLOSE");
       p0.d("send_source", "SYSTEM");
       return;
    }
}
