package com.kuaishou.android.security.internal.crypto.f;
import android.content.Context;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Integer;
import java.lang.Boolean;
import com.kuaishou.android.security.internal.plugin.n$a;
import com.kuaishou.android.security.internal.plugin.n;
import com.kuaishou.android.security.bridge.main.b;
import com.kuaishou.android.security.internal.common.h;
import java.util.Map;
import com.kuaishou.android.security.internal.dispatch.e;
import com.kuaishou.android.security.internal.plugin.bundle.f;
import com.kuaishou.android.security.internal.plugin.n$b;
import com.kuaishou.android.security.base.util.a;
import com.kuaishou.android.security.base.log.d;
import java.lang.Exception;
import com.kuaishou.android.security.base.log.KSecuritySdkILog;
import com.kuaishou.android.security.base.exception.KSException;

public class f	// class@000f4d
{
    public Context a;
    public static f b;

    public void f(Context p0){
       super();
       if (p0 != null) {
          Context applicationC = p0.getApplicationContext();
          this.a = applicationC;
          if (applicationC == null) {
             this.a = p0;
          }
       }
       return;
    }
    public static synchronized f a(Context p0){
       _monitor_enter(f.class);
       Object obj = PatchProxy.applyOneRefs(p0, null, f.class, "1");
       if (obj != PatchProxyResult.class) {
          _monitor_exit(f.class);
          return obj;
       }else if(f.b == null){
          f.b = new f(p0);
       }
       _monitor_exit(f.class);
       return f.b;
    }
    public String a(int p0,boolean p1,String p2){
       f obj;
       Object[] objArray;
       String str;
       if (PatchProxy.isSupport(f.class)) {
          obj = PatchProxy.applyThreeRefs(Integer.valueOf(p0), Boolean.valueOf(p1), p2, this, f.class, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p0 >= 0) {
          p2 = "";
          n on = n.b().a(b.i().j().a()).a(null).b(0).a(p1).e(p2).b(p2).a((String.valueOf(p0)).getBytes()).a();
          if (e.a(this.a) == null || e.a(this.a).f() == null) {
             obj = this.a;
             if (obj != null) {
                if (e.a(obj) != null) {
                   if (e.a(this.a).f() == null) {
                      p2 = "SecurityGuardManager.GetInstance\(mContext\).getSafeValueComp\(\) return null";
                   }
                }else {
                   p2 = "SecurityGuardManager.GetInstance\(mContext\) return null";
                }
             }else {
                p2 = "mcontext is null";
             }
             objArray = new Object[]{Integer.valueOf(p0),Integer.valueOf(110),p2};
             str = String.format("getConfigIndex[%d] errno [%d][%s]", objArray);
             b.i().j().e().onSeucrityError(new KSException(str, 110));
             b.i().j().e().report("kwsecurity_custom_report_key_01", str);
             throw new KSException(str, 110);
          }else {
             try{
                e.a(this.a).f().c(on, "0335");
                if (on.g() != null && on.g().a().length) {
                   objArray = new Object[]{a.a(on.g().a())};
                   d.b("getConfigIndex return:%s", objArray);
                   p2 = new String(on.g().a());
                }
                return p2;
             }catch(com.kuaishou.android.security.base.exception.KSException e10){
                int errorCode = e10.getErrorCode();
                objArray = new Object[]{Integer.valueOf(p0),Integer.valueOf(errorCode),e10.getMessage()};
                str = String.format("getConfigIndex[%d] errno [%d][%s]", objArray);
                b.i().j().e().onSeucrityError(new KSException(str, errorCode));
                b.i().j().e().report("kwsecurity_custom_report_key_01", str);
                throw new KSException(str, errorCode);
             }catch(java.lang.Exception e10){
                Object[] objArray1 = new Object[]{Integer.valueOf(p0),Integer.valueOf(899),e10.getMessage()};
                String str1 = String.format("getConfigIndex[%d] errno [%d][%s]", objArray1);
                b.i().j().e().onSeucrityError(new KSException(str1, 899));
                b.i().j().e().report("kwsecurity_custom_report_key_01", str1);
                throw new KSException(str1, 899);
             }
          }
       }else {
          d.d("index range invalid");
          throw new KSException("getConfigIndex index lt 0", 803);
       }
    }
}
