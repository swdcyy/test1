package com.kuaishou.android.security.internal.crypto.e;
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
import java.nio.charset.Charset;
import com.kuaishou.android.security.internal.dispatch.e;
import com.kuaishou.android.security.internal.plugin.bundle.d;
import com.kuaishou.android.security.internal.plugin.n$b;
import com.kuaishou.android.security.base.perf.d$b;
import com.kuaishou.android.security.base.perf.d;
import java.lang.StringBuilder;
import com.kuaishou.android.security.base.log.d;
import com.kuaishou.android.security.base.exception.KSException;
import java.lang.Integer;
import java.lang.Exception;
import com.kuaishou.android.security.base.log.KSecuritySdkILog;
import java.util.Locale;

public class e	// class@0006d6
{
    public Context a;
    public static e b;

    public void e(Context p0){
       super();
       if (p0 != null && this.a == null) {
          Context applicationC = p0.getApplicationContext();
          this.a = (applicationC != null)? applicationC: p0;
       }
    label_0014 :
       return;
    }
    public static e a(Context p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, e.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (e.b == null) {
          e.b = new e(p0);
       }
       return e.b;
    }
    public String a(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, e.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b(p0, false, "");
    }
    public String a(String p0,boolean p1,String p2){
       String obj;
       String str1;
       Object[] objArray1;
       d$b a;
       boolean b;
       String str = "0335";
       if (PatchProxy.isSupport(e.class)) {
          obj = PatchProxy.applyThreeRefs(p0, Boolean.valueOf(p1), p2, this, e.class, "5");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       try{
          int i = 0;
          obj = "";
          n on = n.b().a(b.i().j().a()).a(null).b(i).a(p1).e(p2).b(obj).a(p0.getBytes(Charset.forName("UTF-8"))).a();
          if (e.a(this.a) == null || e.a(this.a).g() == null) {
             if (this.a != null) {
                if (e.a(this.a) != null) {
                   if (e.a(this.a).g() == null) {
                      obj = "SecurityGuardManager.GetInstance\(mContext\).getSecureSignatureComp\(\) return null";
                   }
                }else {
                   obj = "SecurityGuardManager.GetInstance\(mContext\) return null";
                }
             }else {
                obj = "mcontext is null";
             }
             Object[] objArray = new Object[]{Integer.valueOf(110),obj};
             str1 = String.format(Locale.US, "challenge errno [%d] [%s]", objArray);
             b.i().j().e().onSeucrityError(new KSException(str1, 110));
             b.i().j().e().report("kwsecurity_custom_report_key_01", str1);
             throw new KSException(obj, 110);
          }else if(e.a(this.a).g().d(on, str) && (on.g() == null || !on.g().a().length)){
             a = d$b.a;
             Object[] objArray2 = new Object[1];
             objArray2[i] = Boolean.valueOf(p1);
             d.a(a, String.format("inner[%b] challenge return enull", objArray2), 0x111d5);
             b = e.a(this.a).g().d(on, str);
             if (b && (on.g() == null || !on.g().a().length)) {
                b = e.a(this.a).g().d(on, str);
             }
             if (b && (on.g() == null || !on.g().a().length)) {
                on = "inner[%b] challenge return enull final";
                Object[] objArray3 = new Object[1];
                objArray3[i] = Boolean.valueOf(p1);
                d.a(a, String.format(on, objArray3), 0x111d6);
                return obj;
             }else {
                a = 1;
             }
          }else {
             a = null;
          }
          if (a) {
             a = d$b.a;
             str = "inner[%b] challenge retry return %s";
             Object[] objArray4 = new Object[]{Boolean.valueOf(p1),new String(on.g().a())};
             d.a(a, String.format(str, objArray4), 0x111d7);
          }
          str1 = b.i().j().h();
          if (str1 != null && str1.length()) {
             str1 = new String(on.g().a());
             d.a("signPlus challenge return ["+str1+"]");
             return str1;
          }else {
             throw new KSException("challenge wbKey == null || wbKey.length\(\) == 0", 101);
          }
       }catch( e0){
       }
    }
    public String a(boolean p0,String p1,String p2){
       String obj;
       Object[] objArray1;
       d$b a;
       boolean b;
       String str = "0335";
       if (PatchProxy.isSupport(e.class)) {
          obj = PatchProxy.applyThreeRefs(Boolean.valueOf(p0), p1, p2, this, e.class, "6");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       try{
          int i = 0;
          n on = n.b().a(b.i().j().a()).a(null).b(i).a(p0).b(p2).e(p1).a();
          obj = "";
          if (e.a(this.a) == null || e.a(this.a).g() == null) {
             if (this.a != null) {
                if (e.a(this.a) != null) {
                   if (e.a(this.a).g() == null) {
                      obj = "SecurityGuardManager.GetInstance\(mContext\).getSecureSignatureComp\(\) return null";
                   }
                }else {
                   obj = "SecurityGuardManager.GetInstance\(mContext\) return null";
                }
             }else {
                obj = "mcontext is null";
             }
             Object[] objArray = new Object[]{Integer.valueOf(110),obj};
             on = String.format(Locale.US, "local challenge errno [%d] [%s]", objArray);
             b.i().j().e().onSeucrityError(new KSException(on, 110));
             b.i().j().e().report("kwsecurity_custom_report_key_01", on);
             throw new KSException(on, 110);
          }else if(e.a(this.a).g().a(on, str) && (on.g() == null || !on.g().a().length)){
             a = d$b.a;
             Object[] objArray2 = new Object[1];
             objArray2[i] = Boolean.valueOf(p0);
             d.a(a, String.format("inner[%b] local challenge return enull", objArray2), 0x111d5);
             b = e.a(this.a).g().a(on, str);
             if (b && (on.g() == null || !on.g().a().length)) {
                b = e.a(this.a).g().a(on, str);
             }
             if (b && (on.g() == null || !on.g().a().length)) {
                on = "inner[%b] local challenge return enull final";
                Object[] objArray3 = new Object[1];
                objArray3[i] = Boolean.valueOf(p0);
                d.a(a, String.format(on, objArray3), 0x111d6);
                return obj;
             }else {
                a = 1;
             }
          }else {
             a = null;
          }
          if (a) {
             a = d$b.a;
             str = "inner[%b] local challenge retry return %s";
             Object[] objArray4 = new Object[]{Boolean.valueOf(p0),new String(on.g().a())};
             d.a(a, String.format(str, objArray4), 0x111d7);
          }
          String str1 = b.i().j().h();
          if (str1 != null && str1.length()) {
             str1 = new String(on.g().a());
             d.a("local challenge return ["+str1+"]");
             return str1;
          }else {
             throw new KSException(101);
          }
       }catch( e0){
       }
    }
    public String b(String p0,boolean p1,String p2){
       String obj;
       String str2;
       Object[] objArray1;
       d$b a;
       boolean b;
       String str = "sign errno [%d] [%s]";
       String str1 = "0335";
       if (PatchProxy.isSupport(e.class)) {
          obj = PatchProxy.applyThreeRefs(p0, Boolean.valueOf(p1), p2, this, e.class, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       try{
          obj = "";
          n on = n.b().a(b.i().j().a()).a(null).b(0).a(p1).e(p2).b(obj).a(p0.getBytes(Charset.forName("UTF-8"))).a();
          if (e.a(this.a) == null || e.a(this.a).g() == null) {
             if (this.a != null) {
                if (e.a(this.a) != null) {
                   if (e.a(this.a).g() == null) {
                      obj = "SecurityGuardManager.GetInstance\(mContext\).getSecureSignatureComp\(\) return null";
                   }
                }else {
                   obj = "SecurityGuardManager.GetInstance\(mContext\) return null";
                }
             }else {
                obj = "mcontext is null";
             }
             Object[] objArray = new Object[]{Integer.valueOf(110),obj};
             str2 = String.format(Locale.US, "sign errno [%d] msg[%s]", objArray);
             b.i().j().e().onSeucrityError(new KSException(str2, 110));
             b.i().j().e().report("kwsecurity_custom_report_key_01", str2);
             throw new KSException(str2, 110);
          }else if(e.a(this.a).g().b(on, str1) && (on.g() == null || !on.g().a().length)){
             a = d$b.a;
             Object[] objArray2 = new Object[]{Boolean.valueOf(p1)};
             d.a(a, String.format("inner[%b] sign return enull", objArray2), 0x111d5);
             b = e.a(this.a).g().b(on, str1);
             if (b && (on.g() == null || !on.g().a().length)) {
                b = e.a(this.a).g().b(on, str1);
             }
             if (b && (on.g() == null || !on.g().a().length)) {
                on = "inner[%b] sign return enull final";
                Object[] objArray3 = new Object[]{Boolean.valueOf(p1)};
                d.a(a, String.format(on, objArray3), 0x111d6);
                return obj;
             }else {
                a = 1;
             }
          }else {
             a = null;
          }
          if (a) {
             a = d$b.a;
             str1 = "inner[%b] sign retry return %s";
             Object[] objArray4 = new Object[]{Boolean.valueOf(p1),new String(on.g().a())};
             d.a(a, String.format(str1, objArray4), 0x111d7);
          }
          str2 = b.i().j().h();
          if (str2 != null && str2.length()) {
             str2 = new String(on.g().a());
             d.a("sign final return ["+str2+"]");
             return str2;
          }else {
             throw new KSException("ksecuritysignature sign wbKey == null || wbKey.length\(\) == 0", 101);
          }
       }catch( e0){
       }
    }
    public String c(String p0,boolean p1,String p2){
       String obj;
       String str1;
       Object[] objArray1;
       d$b a;
       boolean b;
       String str = "0335";
       if (PatchProxy.isSupport(e.class)) {
          obj = PatchProxy.applyThreeRefs(p0, Boolean.valueOf(p1), p2, this, e.class, "4");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       try{
          int i = 0;
          obj = "";
          n on = n.b().a(b.i().j().a()).a(null).b(i).a(p1).e(p2).b(obj).a(p0.getBytes(Charset.forName("UTF-8"))).a();
          if (e.a(this.a) == null || e.a(this.a).g() == null) {
             if (this.a != null) {
                if (e.a(this.a) != null) {
                   if (e.a(this.a).g() == null) {
                      obj = "SecurityGuardManager.GetInstance\(mContext\).getSecureSignatureComp\(\) return null";
                   }
                }else {
                   obj = "SecurityGuardManager.GetInstance\(mContext\) return null";
                }
             }else {
                obj = "mcontext is null";
             }
             Object[] objArray = new Object[]{Integer.valueOf(110),obj};
             str1 = String.format(Locale.US, "signPlus errno [%d] msg[%s]", objArray);
             b.i().j().e().onSeucrityError(new KSException(str1, 110));
             b.i().j().e().report("kwsecurity_custom_report_key_01", str1);
             throw new KSException(str1, 110);
          }else if(e.a(this.a).g().f(on, str) && (on.g() == null || !on.g().a().length)){
             a = d$b.a;
             Object[] objArray2 = new Object[1];
             objArray2[i] = Boolean.valueOf(p1);
             d.a(a, String.format("inner[%b] signPlus return enull", objArray2), 0x2b5d);
             b = e.a(this.a).g().f(on, str);
             if (b && (on.g() == null || !on.g().a().length)) {
                b = e.a(this.a).g().f(on, str);
             }
             if (b && (on.g() == null || !on.g().a().length)) {
                on = "inner[%b] signPlus return enull final";
                Object[] objArray3 = new Object[1];
                objArray3[i] = Boolean.valueOf(p1);
                d.a(a, String.format(on, objArray3), 0x2b5e);
                return obj;
             }else {
                a = 1;
             }
          }else {
             a = null;
          }
          if (a) {
             a = d$b.a;
             str = "inner[%b] signPlus retry return %s";
             Object[] objArray4 = new Object[]{Boolean.valueOf(p1),new String(on.g().a())};
             d.a(a, String.format(str, objArray4), 0x111d7);
          }
          str1 = b.i().j().h();
          if (str1 != null && str1.length()) {
             str1 = new String(on.g().a());
             d.a("signPlus final return ["+str1+"]");
             return str1;
          }else {
             throw new KSException("signPlus wbKey == null || wbKey.length\(\) == 0 ", 101);
          }
       }catch( e0){
       }
    }
}
