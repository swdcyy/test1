package com.kuaishou.android.security.internal.crypto.d;
import android.content.Context;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.android.security.internal.plugin.n$a;
import com.kuaishou.android.security.internal.plugin.n;
import com.kuaishou.android.security.bridge.main.b;
import com.kuaishou.android.security.internal.common.h;
import java.util.Map;
import com.kuaishou.android.security.internal.dispatch.e;
import com.kuaishou.android.security.internal.plugin.bundle.c;
import com.kuaishou.android.security.internal.plugin.n$b;
import com.kuaishou.android.security.base.util.a;
import com.kuaishou.android.security.base.log.d;
import java.lang.Integer;
import java.lang.Exception;
import com.kuaishou.android.security.base.log.KSecuritySdkILog;
import com.kuaishou.android.security.base.exception.KSException;

public class d	// class@000f4c
{
    public Context a;
    public static d b;

    public void d(Context p0){
       super();
       if (p0 != null && this.a == null) {
          Context applicationC = p0.getApplicationContext();
          this.a = (applicationC != null)? applicationC: p0;
       }
    label_0014 :
       return;
    }
    public static synchronized d a(Context p0){
       _monitor_enter(d.class);
       Object obj = PatchProxy.applyOneRefs(p0, null, d.class, "1");
       if (obj != PatchProxyResult.class) {
          _monitor_exit(d.class);
          return obj;
       }else if(d.b == null){
          d.b = new d(p0);
       }
       _monitor_exit(d.class);
       return d.b;
    }
    public String a(String p0){
       Object[] objArray;
       n obj = PatchProxy.applyOneRefs(p0, this, d.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int i = 3;
       String str = "";
       obj = n.b().a(b.i().j().a()).a(null).b(i).b(str).a(p0.getBytes()).a();
       d ta = this.a;
       if (ta != null && (e.a(ta) == null || e.a(this.a).e() == null)) {
          ta = this.a;
          if (ta != null) {
             if (e.a(ta) != null) {
                if (e.a(this.a).e() == null) {
                   str = "SecurityGuardManager.GetInstance\(mContext\).getSafeEnvComp\(\) return null";
                }
             }else {
                str = "SecurityGuardManager.GetInstance\(mContext\) return null";
             }
          }else {
             str = "mcontext is null";
          }
          objArray = new Object[i];
          objArray[0] = p0;
          objArray[1] = Integer.valueOf(110);
          objArray[2] = str;
          p0 = String.format("doCheck[%s] errno [%d] msg[%s]", objArray);
          b.i().j().e().onSeucrityError(new KSException(p0, 110));
          b.i().j().e().report("kwsecurity_custom_report_key_01", p0);
          throw new KSException(p0, 110);
       }else {
          try{
             e.a(this.a).e().e(obj, "0335");
             if (obj.g() != null && obj.g().a().length) {
                Object[] objArray1 = new Object[]{a.a(obj.g().a())};
                d.b("checkenv return:%s", objArray1);
                str = new String(obj.g().a());
             }
             return str;
          }catch(com.kuaishou.android.security.base.exception.KSException e0){
             objArray = new Object[i];
             objArray[0] = p0;
             objArray[1] = Integer.valueOf(e0.getErrorCode());
             objArray[2] = e0.getMessage();
             p0 = String.format("doCheck[%s] errno [%d] msg[%s]", objArray);
             b.i().j().e().onSeucrityError(new KSException(p0, e0.getErrorCode()));
             b.i().j().e().report("kwsecurity_custom_report_key_01", p0);
             throw new KSException(p0, e0.getErrorCode());
          }catch(java.lang.Exception e0){
             objArray = new Object[i];
             objArray[0] = p0;
             objArray[1] = Integer.valueOf(799);
             objArray[2] = e0.getMessage();
             String str1 = String.format("doCheck[%s] errno [%d] msg[%s]", objArray);
             b.i().j().e().onSeucrityError(new KSException(str1, 799));
             b.i().j().e().report("kwsecurity_custom_report_key_01", str1);
             throw new KSException(str1, 799);
          }
       }
    }
}
