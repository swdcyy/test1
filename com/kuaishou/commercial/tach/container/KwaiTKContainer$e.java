package com.kuaishou.commercial.tach.container.KwaiTKContainer$e;
import erd.g;
import ww4.b;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import i00.e;
import com.yxcorp.utility.Log;
import java.util.concurrent.TimeoutException;

public final class KwaiTKContainer$e implements g	// class@00167d
{
    public final b b;

    public void KwaiTKContainer$e(b p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       int i;
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaiTKContainer$e.class, "1")) {
       }else {
          e h = e.h;
          Log.g("TKContainer", "registerTKInitListener: exception "+h.d()+", "+h.e());
          if (h.e()) {
             p0 = this.b;
             if (p0 != null) {
                p0.a();
             }
          }else if(h.d()){
             p0 = this.b;
             if (p0 != null) {
                p0.b(2001, new Throwable("V8 has already failed"));
             }
          }else if(p0 instanceof TimeoutException){
             i = 2002;
          }else {
             i = 2003;
          }
          KwaiTKContainer$e tb = this.b;
          if (tb != null) {
             tb.b(i, p0);
          }
       }
       return;
    }
}
