package com.kuaishou.live.core.basic.activity.LivePlayFragment$d;
import h91.a;
import java.lang.Object;
import m02.v0;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import d61.g;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ResultPackage;
import com.yxcorp.utility.TextUtils;
import q2b.h$b;
import k2b.u1;
import java.lang.Boolean;

public class LivePlayFragment$d implements a	// class@001810
{

    public void LivePlayFragment$d(){
       super();
    }
    public void LivePlayFragment$d(v0 p0){
       super();
    }
    public void onError(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LivePlayFragment$d.class, "1")) {
          return;
       }
       ClientEvent$ResultPackage resultPackag = new ClientEvent$ResultPackage();
       resultPackag.message = TextUtils.k(g.e(p0));
       h$b uob = h$b.d(8, 25);
       uob.q(resultPackag);
       u1.r0(uob);
       return;
    }
    public void onSuccess(Object p0){
    }
}
