package com.yxcorp.gifshow.detail.common.controller.SidebarProgressElement$mPlayerStateChangedListener$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.detail.common.controller.SidebarProgressElement;
import com.kwai.framework.player.core.b$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.detail.common.controller.SidebarProgressElement$mPlayerStateChangedListener$2$a;

public final class SidebarProgressElement$mPlayerStateChangedListener$2 extends Lambda implements a	// class@0013d2
{
    public final SidebarProgressElement this$0;

    public void SidebarProgressElement$mPlayerStateChangedListener$2(SidebarProgressElement p0){
       this.this$0 = p0;
       super(0);
    }
    public final b$b invoke(){
       Object obj = PatchProxy.apply(null, this, SidebarProgressElement$mPlayerStateChangedListener$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new SidebarProgressElement$mPlayerStateChangedListener$2$a(this);
    }
    public Object invoke(){
       return this.invoke();
    }
}
