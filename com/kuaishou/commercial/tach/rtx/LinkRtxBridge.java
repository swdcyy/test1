package com.kuaishou.commercial.tach.rtx.LinkRtxBridge;
import com.tachikoma.core.component.TKBaseNativeModule;
import gx4.f;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kuaishou.commercial.tach.rtx.LinkRtxBridge$a;
import java.lang.Runnable;
import iq8.x;

public class LinkRtxBridge extends TKBaseNativeModule	// class@001689
{

    public void LinkRtxBridge(f p0){
       super(p0);
    }
    public void close(int p0){
       if (PatchProxy.isSupport(LinkRtxBridge.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, LinkRtxBridge.class, "1")) {
          return;
       }
       x.f(new LinkRtxBridge$a(this));
       return;
    }
}
