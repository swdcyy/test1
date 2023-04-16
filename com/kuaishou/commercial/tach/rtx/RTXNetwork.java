package com.kuaishou.commercial.tach.rtx.RTXNetwork;
import com.tachikoma.core.component.TKBaseNativeModule;
import gx4.f;
import com.tkruntime.v8.V8Object;
import com.tkruntime.v8.V8Function;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import tkd.b;
import tkd.d;
import vx4.e;

public class RTXNetwork extends TKBaseNativeModule	// class@00168c
{

    public void RTXNetwork(f p0){
       super(p0);
    }
    public void request(V8Object p0,V8Function p1,V8Function p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, RTXNetwork.class, "1")) {
          return;
       }
       d.a(0x304e5269).T5(p0, p1, p2);
       return;
    }
}
