package com.kuaishou.android.security.internal.crypto.b;
import android.content.Context;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.android.security.internal.common.b;
import java.lang.Boolean;
import com.kuaishou.android.security.internal.plugin.n$a;
import com.kuaishou.android.security.internal.plugin.n;
import com.kuaishou.android.security.bridge.main.b;
import com.kuaishou.android.security.internal.common.h;
import java.util.Map;
import com.kuaishou.android.security.internal.dispatch.e;
import com.kuaishou.android.security.internal.plugin.bundle.a;
import com.kuaishou.android.security.internal.plugin.n$b;
import com.kuaishou.android.security.base.util.a;
import com.kuaishou.android.security.base.log.d;
import java.lang.Integer;
import com.kuaishou.android.security.base.log.KSecuritySdkILog;
import com.kuaishou.android.security.base.exception.KSException;
import java.lang.Exception;

public class b	// class@000f4a
{
    public Context a;
    public static b b;

    public void b(Context p0){
       super();
       if (p0 != null && this.a == null) {
          Context applicationC = p0.getApplicationContext();
          this.a = (applicationC != null)? applicationC: p0;
       }
    label_0014 :
       return;
    }
    public static synchronized b a(Context p0){
       _monitor_enter(b.class);
       Object obj = PatchProxy.applyOneRefs(p0, null, b.class, "1");
       if (obj != PatchProxyResult.class) {
          _monitor_exit(b.class);
          return obj;
       }else if(b.b == null){
          b.b = new b(p0);
       }
       _monitor_exit(b.class);
       return b.b;
    }
    public byte[] a(byte[] p0,b p1,boolean p2){
       if (PatchProxy.isSupport(b.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, p1, Boolean.valueOf(p2), this, b.class, "5");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.a(p0, p1, p2, false);
    }
    public byte[] a(byte[] p0,b p1,boolean p2,boolean p3){
       Object[] obj;
       Object[] objArray1;
       String str2;
       if (PatchProxy.isSupport(b.class)) {
          obj = PatchProxy.applyFourRefs(p0, p1, Boolean.valueOf(p2), Boolean.valueOf(p3), this, b.class, "4");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       n on = n.b().a(b.i().j().a()).a(null).b(3).a(p3).b("").a(p0).a();
       String str = "atlasDecrypt errno [%d]";
       if (e.a(this.a) != null && e.a(this.a).a() != null) {
          try{
             e.a(this.a).a().a(on, true, p1);
             if (on.g() == null || !on.g().a().length) {
                on = new byte[0];
                return on;
             }else {
                obj = new Object[true];
                obj[0] = a.a(on.g().a());
                d.b("atlasDecrypt return:%s", obj);
                return on.g().a();
             }
          }catch(com.kuaishou.android.security.base.exception.KSException e9){
             int errorCode = e9.getErrorCode();
             Object[] objArray = new Object[true];
             objArray[0] = Integer.valueOf(errorCode);
             String str1 = String.format(str, objArray);
             b.i().j().e().onSeucrityError(new KSException(str1, errorCode));
             b.i().j().e().report("kwsecurity_custom_report_key_01", str1);
             throw new KSException(str1, errorCode);
          }catch(java.lang.Exception e0){
             objArray1 = new Object[true];
             objArray1[0] = Integer.valueOf(699);
             str2 = String.format(e0, objArray1);
             b.i().j().e().onSeucrityError(new KSException(str2, 699));
             b.i().j().e().report("kwsecurity_custom_report_key_01", str2);
             throw new KSException(str2, 699);
          }
       }else {
          objArray1 = new Object[true];
          objArray1[0] = Integer.valueOf(110);
          str2 = String.format(str, objArray1);
          b.i().j().e().onSeucrityError(new KSException(str2, 110));
          b.i().j().e().report("kwsecurity_custom_report_key_01", str2);
          throw new KSException(str2, 110);
       }
    }
    public byte[] b(byte[] p0,b p1,boolean p2){
       if (PatchProxy.isSupport(b.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, p1, Boolean.valueOf(p2), this, b.class, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.b(p0, p1, p2, false);
    }
    public byte[] b(byte[] p0,b p1,boolean p2,boolean p3){
       Object[] objArray;
       String str;
       Object[] objArray1;
       String str1;
       if (PatchProxy.isSupport(b.class)) {
          Object obj = PatchProxy.applyFourRefs(p0, p1, Boolean.valueOf(p2), Boolean.valueOf(p3), this, b.class, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       n on = n.b().a(b.i().j().a()).a(null).b(3).a(p3).b("").a(p0).a();
       if (e.a(this.a) != null && e.a(this.a).a() != null) {
          try{
             e.a(this.a).a().b(on, p2, p1);
             if (on.g() == null || !on.g().a().length) {
                on = new byte[0];
                return on;
             }else {
                objArray = new Object[]{a.a(on.g().a())};
                d.b("aenc return:%s", objArray);
                on = on.g().a();
                str = b.i().j().h();
                if (str != null && str.length()) {
                   objArray = new Object[]{a.a(on)};
                   d.b("aenc return:%s", objArray);
                   return on;
                }else {
                   throw new KSException("KAsymSecurityCipher wbKey == null || wbKey.length\(\) == 0", 101);
                }
             }
          }catch(com.kuaishou.android.security.base.exception.KSException e11){
             int errorCode = e11.getErrorCode();
             objArray = new Object[]{Integer.valueOf(errorCode)};
             str = String.format("AsymEncrypt errno [%d]", objArray);
             b.i().j().e().onSeucrityError(new KSException(str, errorCode));
             b.i().j().e().report("kwsecurity_custom_report_key_01", str);
             throw new KSException(str, errorCode);
          }catch(java.lang.Exception e11){
             e11.printStackTrace();
             objArray1 = new Object[]{Integer.valueOf(599)};
             str1 = String.format("AsymEncrypt errno [%d]", objArray1);
             b.i().j().e().onSeucrityError(new KSException(str1, 599));
             b.i().j().e().report("kwsecurity_custom_report_key_01", str1);
             throw new KSException(str1, 599);
          }
       }else {
          objArray1 = new Object[]{Integer.valueOf(110)};
          str1 = String.format("safeEncrypt errno [%d]", objArray1);
          b.i().j().e().onSeucrityError(new KSException(str1, 110));
          b.i().j().e().report("kwsecurity_custom_report_key_01", str1);
          throw new KSException(str1, 110);
       }
    }
}
