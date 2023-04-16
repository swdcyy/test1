package com.tachikoma.core.debug.d;
import com.kuaishou.kds.devtools.framework.KdsDevtoolsCommonInspector;
import java.lang.String;
import com.kuaishou.kds.devtools.framework.KdsDevtoolsAgent;
import android.os.Looper;
import java.lang.StringBuilder;
import zp8.a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;

public class d extends KdsDevtoolsCommonInspector	// class@000dbf
{
    public final String a;
    public d$a b;
    public boolean c;

    public void d(String p0,KdsDevtoolsAgent p1,Looper p2,String p3,String p4){
       super(p1, p2, p3, p4);
       this.a = p0;
       a.i("TKInspector", "construct: "+p0+", "+p3+", "+p4);
    }
    public void a(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "1")) {
          return;
       }
       a.i("TKInspector", "sendMessage: "+p0+", "+this.a);
       super.sendMessage(p0);
       return;
    }
}
