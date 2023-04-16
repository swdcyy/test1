package com.kuaishou.android.security.internal.crypto.c;
import android.content.Context;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kuaishou.android.security.internal.plugin.n$a;
import com.kuaishou.android.security.internal.plugin.n;
import com.kuaishou.android.security.bridge.main.b;
import com.kuaishou.android.security.internal.common.h;
import java.util.Map;
import com.kuaishou.android.security.internal.dispatch.e;
import com.kuaishou.android.security.internal.plugin.bundle.b;
import com.kuaishou.android.security.internal.plugin.n$b;
import com.kuaishou.android.security.base.util.a;
import com.kuaishou.android.security.base.log.d;
import java.lang.Integer;
import java.lang.Exception;
import com.kuaishou.android.security.base.log.KSecuritySdkILog;
import com.kuaishou.android.security.base.exception.KSException;

public class c	// class@000f4b
{
    public Context a;
    public static c b;

    public void c(Context p0){
       super();
       if (p0 != null && this.a == null) {
          Context applicationC = p0.getApplicationContext();
          this.a = (applicationC != null)? applicationC: p0;
       }
    label_0014 :
       return;
    }
    public static synchronized c a(Context p0){
       _monitor_enter(c.class);
       Object obj = PatchProxy.applyOneRefs(p0, null, c.class, "1");
       if (obj != PatchProxyResult.class) {
          _monitor_exit(c.class);
          return obj;
       }else if(c.b == null){
          _monitor_enter(c.class);
          if (c.b == null) {
             c.b = new c(p0);
          }
          _monitor_exit(c.class);
       }
       _monitor_exit(c.class);
       return c.b;
    }
    public byte[] a(byte[] p0,boolean p1,boolean p2,String p3){
       Object[] objArray;
       Object[] objArray1;
       if (PatchProxy.isSupport(c.class)) {
          Object obj = PatchProxy.applyFourRefs(p0, Boolean.valueOf(p1), Boolean.valueOf(p2), p3, this, c.class, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       String str = "";
       n on = n.b().a(b.i().j().a()).a(null).b(3).a(p2).a(p0).b(str).e(p3).a();
       if (e.a(this.a) == null || e.a(this.a).d() == null) {
          c ta = this.a;
          if (ta != null) {
             if (e.a(ta) != null) {
                if (e.a(this.a).d() == null) {
                   str = "SecurityGuardManager.GetInstance\(mContext\).getSafeEncryptComp\(\) return null";
                }
             }else {
                str = "SecurityGuardManager.GetInstance\(mContext\) return null";
             }
          }else {
             str = "mcontext is null";
          }
          objArray = new Object[]{Integer.valueOf(110),str};
          String str1 = String.format("atlasDecrypt errno [%d][%s]", objArray);
          b.i().j().e().onSeucrityError(new KSException(str1, 110));
          b.i().j().e().report("kwsecurity_custom_report_key_01", str1);
          throw new KSException(str1, 110);
       }else {
          try{
             e.a(this.a).d().a(on, "0335", p1);
             if (on.g() == null || !on.g().a().length) {
                on = new byte[0];
                return on;
             }else {
                objArray1 = new Object[]{a.a(on.g().a())};
                d.b("atlasDecrypt return:%s", objArray1);
                return on.g().a();
             }
          }catch(com.kuaishou.android.security.base.exception.KSException e9){
             int errorCode = e9.getErrorCode();
             objArray1 = new Object[]{Integer.valueOf(errorCode),e9.getMessage()};
             String str2 = String.format("atlasDecrypt errno [%d] [%s]", objArray1);
             b.i().j().e().onSeucrityError(new KSException(str2, errorCode));
             b.i().j().e().report("kwsecurity_custom_report_key_01", str2);
             throw new KSException(str2, errorCode);
          }catch(java.lang.Exception e9){
             objArray = new Object[]{Integer.valueOf(699),e9.getMessage()};
             str2 = String.format("atlasDecrypt errno [%d][%s]", objArray);
             b.i().j().e().onSeucrityError(new KSException(str2, 699));
             b.i().j().e().report("kwsecurity_custom_report_key_01", str2);
             throw new KSException(str2, 699);
          }
       }
    }
    public byte[] b(byte[] p0,boolean p1,boolean p2,String p3){
       Object[] objArray;
       String str2;
       Object[] objArray1;
       String str = "safeEncrypt errno [%d] [%s]";
       if (PatchProxy.isSupport(c.class)) {
          Object obj = PatchProxy.applyFourRefs(p0, Boolean.valueOf(p1), Boolean.valueOf(p2), p3, this, c.class, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       String str1 = "";
       n on = n.b().a(b.i().j().a()).a(null).b(3).a(p2).a(p0).b(str1).e(p3).a();
       if (e.a(this.a) == null || e.a(this.a).d() == null) {
          c ta = this.a;
          if (ta != null) {
             if (e.a(ta) != null) {
                if (e.a(this.a).d() == null) {
                   str1 = "SecurityGuardManager.GetInstance\(mContext\).getSafeEncryptComp\(\) return null";
                }
             }else {
                str1 = "SecurityGuardManager.GetInstance\(mContext\) return null";
             }
          }else {
             str1 = "mcontext is null";
          }
          objArray = new Object[]{Integer.valueOf(110),str1};
          str2 = String.format("safeEncrypt errno [%d][%s]", objArray);
          b.i().j().e().onSeucrityError(new KSException(str2, 110));
          b.i().j().e().report("kwsecurity_custom_report_key_01", str2);
          throw new KSException(str1, 110);
       }else {
          try{
             e.a(this.a).d().c(on, "0335", p1);
             if (on.g() != null && (on.g().a() == null || !on.g().a().length)) {
                on = new byte[0];
                return on;
             }else {
                objArray1 = new Object[]{a.a(on.g().a())};
                d.b("enc return:%s", objArray1);
                on = on.g().a();
                str2 = b.i().j().h();
                if (str2 != null && str2.length()) {
                   str2 = "white enc return:%s";
                   objArray1 = new Object[]{a.a(on)};
                   d.b(str2, objArray1);
                   return on;
                }else {
                   throw new KSException("ksecuritycipher enc wbKey == null || wbKey.length\(\) == 0", 101);
                }
             }
          }catch(com.kuaishou.android.security.base.exception.KSException e10){
             int errorCode = e10.getErrorCode();
             objArray1 = new Object[]{Integer.valueOf(errorCode),e10.getMessage()};
             String str3 = String.format(str, objArray1);
             b.i().j().e().onSeucrityError(new KSException(str3, errorCode));
             b.i().j().e().report("kwsecurity_custom_report_key_01", str3);
             throw new KSException(str3, errorCode);
          }catch(java.lang.Exception e10){
             e10.printStackTrace();
             objArray = new Object[]{Integer.valueOf(599),e10.getMessage()};
             str3 = String.format(str, objArray);
             b.i().j().e().onSeucrityError(new KSException(str3, 599));
             b.i().j().e().report("kwsecurity_custom_report_key_01", str3);
             throw new KSException(str3, 599);
          }
       }
    }
    public byte[] c(byte[] p0,boolean p1,boolean p2,String p3){
       Object[] objArray;
       Object[] objArray1;
       if (PatchProxy.isSupport(c.class)) {
          Object obj = PatchProxy.applyFourRefs(p0, Boolean.valueOf(p1), Boolean.valueOf(p2), p3, this, c.class, "5");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       String str = "";
       n on = n.b().a(b.i().j().a()).a(null).b(3).a(p2).a(p0).b(str).e(p3).a();
       if (e.a(this.a) == null || e.a(this.a).d() == null) {
          c ta = this.a;
          if (ta != null) {
             if (e.a(ta) != null) {
                if (e.a(this.a).d() == null) {
                   str = "SecurityGuardManager.GetInstance\(mContext\).getSafeEncryptComp\(\) return null";
                }
             }else {
                str = "SecurityGuardManager.GetInstance\(mContext\) return null";
             }
          }else {
             str = "mcontext is null";
          }
          objArray = new Object[]{Integer.valueOf(110),str};
          String str1 = String.format("usafeEncrypt errno [%d][%s]", objArray);
          b.i().j().e().onSeucrityError(new KSException(str1, 110));
          b.i().j().e().report("kwsecurity_custom_report_key_01", str1);
          throw new KSException(str1, 110);
       }else {
          try{
             e.a(this.a).d().b(on, "0335", p1);
             if (on.g() == null || !on.g().a().length) {
                on = new byte[0];
                return on;
             }else {
                objArray1 = new Object[]{a.a(on.g().a())};
                d.b("udec return:%s", objArray1);
                return on.g().a();
             }
          }catch(com.kuaishou.android.security.base.exception.KSException e9){
             int errorCode = e9.getErrorCode();
             objArray1 = new Object[]{Integer.valueOf(errorCode),e9.getMessage()};
             String str2 = String.format("usafeDecrypt errno [%d][%s]", objArray1);
             b.i().j().e().onSeucrityError(new KSException(str2, errorCode));
             b.i().j().e().report("kwsecurity_custom_report_key_01", str2);
             throw new KSException(str2, errorCode);
          }catch(java.lang.Exception e9){
             objArray = new Object[]{Integer.valueOf(699),e9.getMessage()};
             str2 = String.format("usafeDecrypt errno [%d] [%s]", objArray);
             b.i().j().e().onSeucrityError(new KSException(str2, 699));
             b.i().j().e().report("kwsecurity_custom_report_key_01", str2);
             throw new KSException(str2, 699);
          }
       }
    }
    public byte[] d(byte[] p0,boolean p1,boolean p2,String p3){
       Object[] objArray;
       Object[] objArray1;
       if (PatchProxy.isSupport(c.class)) {
          Object obj = PatchProxy.applyFourRefs(p0, Boolean.valueOf(p1), Boolean.valueOf(p2), p3, this, c.class, "4");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       String str = "";
       n on = n.b().a(b.i().j().a()).a(null).b(3).a(p2).a(p0).b(str).e(p3).a();
       String str1 = "usafeEncrypt errno [%d][%s]";
       if (e.a(this.a) == null || e.a(this.a).d() == null) {
          c ta = this.a;
          if (ta != null) {
             if (e.a(ta) != null) {
                if (e.a(this.a).d() == null) {
                   str = "SecurityGuardManager.GetInstance\(mContext\).getSafeEncryptComp\(\) return null";
                }
             }else {
                str = "SecurityGuardManager.GetInstance\(mContext\) return null";
             }
          }else {
             str = "mcontext is null";
          }
          objArray = new Object[]{Integer.valueOf(110),str};
          String str2 = String.format(str1, objArray);
          b.i().j().e().onSeucrityError(new KSException(str2, 110));
          b.i().j().e().report("kwsecurity_custom_report_key_01", str2);
          throw new KSException(str, 110);
       }else {
          try{
             e.a(this.a).d().d(on, "0335", p1);
             if (on.g() == null || !on.g().a().length) {
                on = new byte[0];
                return on;
             }else {
                objArray1 = new Object[]{a.a(on.g().a())};
                d.b("uenc return:%s", objArray1);
                return on.g().a();
             }
          }catch(com.kuaishou.android.security.base.exception.KSException e9){
             int errorCode = e9.getErrorCode();
             objArray1 = new Object[]{Integer.valueOf(errorCode),e9.getMessage()};
             String str3 = String.format(str1, objArray1);
             b.i().j().e().onSeucrityError(new KSException(str3, errorCode));
             b.i().j().e().report("kwsecurity_custom_report_key_01", str3);
             throw new KSException(str3, errorCode);
          }catch(java.lang.Exception e9){
             objArray = new Object[]{Integer.valueOf(699),e9.getMessage()};
             str3 = String.format(str1, objArray);
             b.i().j().e().onSeucrityError(new KSException(str3, 699));
             b.i().j().e().report("kwsecurity_custom_report_key_01", str3);
             throw new KSException(str3, 699);
          }
       }
    }
}
