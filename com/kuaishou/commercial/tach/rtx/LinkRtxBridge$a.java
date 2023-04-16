package com.kuaishou.commercial.tach.rtx.LinkRtxBridge$a;
import java.lang.Runnable;
import com.kuaishou.commercial.tach.rtx.LinkRtxBridge;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.tk.api.b;
import tkd.b;
import tkd.d;
import vx4.g;

public class LinkRtxBridge$a implements Runnable	// class@001688
{
    public final LinkRtxBridge b;

    public void LinkRtxBridge$a(LinkRtxBridge p0){
       this.b = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, LinkRtxBridge$a.class, "1")) {
          return;
       }
       if (b.b().e()) {
          d.a(-1108900079).close();
       }else {
          d.a(-1108900079).J2();
       }
       return;
    }
}
