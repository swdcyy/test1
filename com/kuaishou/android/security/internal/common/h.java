package com.kuaishou.android.security.internal.common.h;
import java.lang.Object;
import android.content.Context;
import java.lang.String;
import com.kuaishou.android.security.base.log.KSecuritySdkILog;
import com.kuaishou.android.security.internal.common.KSecurityContext$Mode;
import com.kuaishou.android.security.base.util.KSecurityTrack$IKSecurityTrackCallback;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.android.security.internal.common.h$a;
import com.kuaishou.android.security.internal.common.a$b;

public abstract class h	// class@0006d1
{

    public void h(){
       super();
    }
    public static h a(Context p0,String p1,String p2,KSecuritySdkILog p3,KSecurityContext$Mode p4,KSecurityTrack$IKSecurityTrackCallback p5){
       h oh = h.class;
       if (PatchProxy.isSupport(oh)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4,p5};
          Object obj = PatchProxy.apply(objArray, null, oh, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return h.b().a(p0).a(p1).b(p2).a(p3).a(p4).a(p5).b();
    }
    public static h$a b(){
       Object obj = PatchProxy.apply(null, null, h.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new a$b();
    }
    public abstract String a();
    public abstract Context c();
    public abstract KSecurityContext$Mode d();
    public abstract KSecuritySdkILog e();
    public abstract h$a f();
    public abstract KSecurityTrack$IKSecurityTrackCallback g();
    public abstract String h();
}
