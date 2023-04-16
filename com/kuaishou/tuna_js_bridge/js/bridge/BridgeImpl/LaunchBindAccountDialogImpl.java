package com.kuaishou.tuna_js_bridge.js.bridge.BridgeImpl.LaunchBindAccountDialogImpl;
import dy5.a;
import java.lang.Object;
import dy5.d;
import dy5.h;
import com.kwai.framework.model.user.AdBusinessInfo$AcceptBindWindowInfo;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import y05.d;
import xz4.o;
import xz4.o$a;
import w2c.a;

public class LaunchBindAccountDialogImpl implements a	// class@001140
{

    public void LaunchBindAccountDialogImpl(){
       super();
    }
    public void a(d p0,Object p1,h p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, LaunchBindAccountDialogImpl.class, "1")) {
       }else {
          Activity uActivity = p0.c();
          d uod = new d(p2);
          if (!PatchProxy.applyVoidFourRefs(uActivity, p1, "BUSINESS_PLATFORM_FUNCTION", uod, null, o.class, "6")) {
             o.e(uActivity, p1, "BUSINESS_PLATFORM_FUNCTION", uod, null);
          }
       }
       return;
    }
}
