package com.kuaishou.commercial.tach.rtx.RTXBridgeCenter$a;
import f55.g;
import com.kuaishou.commercial.tach.rtx.RTXBridgeCenter;
import com.tkruntime.v8.V8Function;
import java.lang.Object;
import java.lang.String;
import android.os.Bundle;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.tkruntime.v8.V8Object;
import yz7.e;

public class RTXBridgeCenter$a implements g	// class@00168a
{
    public final V8Function b;
    public final RTXBridgeCenter c;

    public void RTXBridgeCenter$a(RTXBridgeCenter p0,V8Function p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void a(int p0,String p1,Bundle p2){
       if (PatchProxy.isSupport(RTXBridgeCenter$a.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, p2, this, RTXBridgeCenter$a.class, "2")) {
          return;
       }
       Object[] objArray = new Object[]{p1};
       this.b.call(null, objArray);
       return;
    }
    public void onSuccess(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RTXBridgeCenter$a.class, "1")) {
          return;
       }
       RTXBridgeCenter$a tb = this.b;
       Object[] objArray = new Object[1];
       p0 = (p0 != null)? e.f(p0): "";
       objArray[0] = p0;
       tb.call(null, objArray);
       return;
    }
}
