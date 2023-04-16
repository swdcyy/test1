package com.kuaishou.android.security.internal.crypto.k$a;
import android.content.Context;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kuaishou.android.security.bridge.main.b;
import com.kuaishou.android.security.internal.common.h;
import com.kuaishou.android.security.internal.dispatch.JNICLibrary;
import java.lang.StringBuilder;
import com.kuaishou.android.security.base.log.d;

public class k$a	// class@000f4e
{
    public Context a;
    public static k$a b;

    public void k$a(Context p0){
       super();
       if (p0 != null && this.a == null) {
          Context applicationC = p0.getApplicationContext();
          this.a = (applicationC != null)? applicationC: p0;
       }
    label_0014 :
       return;
    }
    public static synchronized k$a a(Context p0){
       _monitor_enter(k$a.class);
       Object obj = PatchProxy.applyOneRefs(p0, null, k$a.class, "1");
       if (obj != PatchProxyResult.class) {
          _monitor_exit(k$a.class);
          return obj;
       }else if(k$a.b == null){
          k$a.b = new k$a(p0);
       }
       _monitor_exit(k$a.class);
       return k$a.b;
    }
    public boolean a(){
       Object[] objArray = null;
       Object[] obj = PatchProxy.apply(objArray, this, k$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = new Object[]{objArray,b.i().j().a(),objArray,objArray,this.a,objArray,objArray};
       Object obj1 = JNICLibrary.doCommandNative(0x28b0, obj);
       d.d("innerTblState= "+obj1);
       if (obj1 != null) {
          return (String.valueOf(obj1)).equals("1");
       }
       return 0;
    }
}
