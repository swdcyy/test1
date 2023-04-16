package com.oplus.ocs.base.common.api.b;
import java.lang.Object;
import android.content.Context;
import com.oplus.ocs.base.common.api.InternalClient;
import com.oplus.ocs.base.IAuthenticationListener;
import com.oplus.ocs.base.common.api.e;
import java.lang.String;
import com.oplus.ocs.base.utils.ServiceCheck;
import com.oplus.ocs.base.common.api.h;
import com.oplus.ocs.base.common.api.f;
import com.oplus.ocs.base.common.api.c;
import com.oplus.ocs.base.common.api.k;
import com.oplus.ocs.base.common.api.g;
import com.oplus.ocs.base.common.api.a;

public class b	// class@000add
{
    public static b a;

    public void b(){
       super();
    }
    public static b a(){
       if (b.a == null) {
          b uob = b.class;
          _monitor_enter(uob);
          if (b.a == null) {
             b.a = new b();
          }
          _monitor_exit(uob);
       }
       return b.a;
    }
    public static e a(Context p0,InternalClient p1,IAuthenticationListener p2){
       if (ServiceCheck.check(p0, "com.oplus.ocs")) {
          return new h(p0, p1, p2);
       }
       if (ServiceCheck.check(p0, "com.coloros.ocs.opencapabilityservice")) {
          return new f(p0, p1, p2);
       }
       return null;
    }
    public static e a(Context p0,String p1,c p2,k p3){
       if (ServiceCheck.check(p0, "com.oplus.ocs")) {
          return new g(p0, p1, p2, p3);
       }
       if (ServiceCheck.check(p0, "com.coloros.ocs.opencapabilityservice")) {
          return new a(p0, p1, p2, p3);
       }
       return null;
    }
}
