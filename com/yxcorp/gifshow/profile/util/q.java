package com.yxcorp.gifshow.profile.util.q;
import java.lang.Runnable;
import java.lang.Object;
import z5c.q1;
import z5c.e2;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import z5c.d2;
import l3c.e;
import com.yxcorp.gifshow.profile.kslog.KsLogProfileTag;
import java.util.List;
import v2c.e;
import java.lang.StringBuilder;
import v2c.g;
import z5c.v1;

public final class q implements Runnable	// class@0015e2
{
    public static final q b;

    static {
       q.b = new q();
    }
    public void q(){
       super();
    }
    public final void run(){
       String str = "1";
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, objArray, e2.class, str)) {
       }else {
          d2 uod2 = new d2();
          str = e.class;
          _monitor_enter(str);
          if (PatchProxy.applyVoidOneRefs(uod2, objArray, str, "1")) {
             _monitor_exit(str);
          }else {
             g.e(KsLogProfileTag.COMMON_DIALOG.appendTag("ProfileDialogHelper"), "registerDialogInterceptor: "+d2.class.getSimpleName());
             e.a.add(uod2);
             _monitor_exit(str);
          }
       }
       str.c();
       return;
    }
}
