package i66.a;
import com.kuaishou.dfp.cloudid.bridge.DfpBridgeCallBack;
import java.lang.Object;
import java.lang.String;
import com.kwai.framework.deviceid.h$c;
import com.kwai.framework.deviceid.h;
import o56.a;
import k2b.r;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import wkd.b;
import com.yxcorp.gifshow.log.h;
import lnc.i3;
import java.lang.System;
import java.lang.Long;
import java.lang.Number;
import qe6.b;

public final class a implements DfpBridgeCallBack	// class@0017a8
{
    public final boolean a;

    public void a(boolean p0){
       this.a = p0;
    }
    public final void receiveMessage(String p0){
       a ta = this.a;
       h$c uoc = h.f();
       a.a = uoc.a;
       uoc = uoc.b;
       a.c = uoc;
       r.b(a.a, uoc);
       h.g(((a.a).equals(uoc.a) ^ 0x01));
       if (PatchProxy.applyVoid(null, null, h.class, "17")) {
       }else {
          i3 oi3 = i3.f();
          oi3.d("did", a.a);
          oi3.d("did_tag", String.valueOf(a.c));
          oi3.d("pre_did", a.e);
          oi3.d("pre_did_tag", String.valueOf(a.d));
          oi3.c("ts", Long.valueOf(System.currentTimeMillis()));
          b.a(0x4b316083).f1("YUNFAMA_SUB_PROCESS_REFRESH", oi3.e(), 21);
       }
       h.d(false, b.a(), ta);
       return;
    }
}
