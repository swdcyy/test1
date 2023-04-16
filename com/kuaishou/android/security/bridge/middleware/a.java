package com.kuaishou.android.security.bridge.middleware.a;
import com.middleware.security.wrapper.IKSecurityBase;
import com.kuaishou.android.security.bridge.main.a;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kuaishou.android.security.KSecurity;
import com.kuaishou.android.security.KSecurity$ENV;
import com.kuaishou.android.security.base.util.n;
import x38.a;
import com.kuaishou.android.security.bridge.main.b;
import com.kuaishou.android.security.internal.common.h;
import android.content.Context;
import com.kuaishou.android.security.base.logsender.a;
import x38.c;
import com.kuaishou.android.security.base.cloudconfig.b;
import java.lang.Throwable;
import com.kuaishou.android.security.base.log.d;
import com.kuaishou.android.security.internal.crypto.k$a;
import com.kuaishou.android.security.internal.dispatch.b;
import org.json.JSONObject;
import com.kuaishou.android.security.base.cloudconfig.a;

public class a extends a implements IKSecurityBase	// class@0006c0
{

    public void a(){
       super();
    }
    public byte[] atlasDecrypt(String p0,String p1,int p2,byte[] p3){
       if (PatchProxy.isSupport(a.class)) {
          p0 = PatchProxy.applyFourRefs(p0, p1, Integer.valueOf(p2), p3, this, a.class, "3");
          if (p0 != PatchProxyResult.class) {
             return p0;
          }
       }
       boolean b = true;
       try{
          return this.b(p3, b, p1);
       }catch(com.kuaishou.android.security.base.exception.KSException e0){
          byte[] uobyteArray = new byte[0];
          return uobyteArray;
       }
    }
    public byte[] atlasEncrypt(String p0,String p1,int p2,byte[] p3){
       if (PatchProxy.isSupport(a.class)) {
          p0 = PatchProxy.applyFourRefs(p0, p1, Integer.valueOf(p2), p3, this, a.class, "2");
          if (p0 != PatchProxyResult.class) {
             return p0;
          }
       }
       boolean b = true;
       try{
          return this.a(p3, b, p1);
       }catch(com.kuaishou.android.security.base.exception.KSException e0){
          byte[] uobyteArray = new byte[0];
          return uobyteArray;
       }
    }
    public String atlasSign(String p0,String p1,int p2,String p3){
       if (PatchProxy.isSupport(a.class)) {
          p0 = PatchProxy.applyFourRefs(p0, p1, Integer.valueOf(p2), p3, this, a.class, "8");
          if (p0 != PatchProxyResult.class) {
             return p0;
          }
       }
       boolean b = true;
       try{
          return this.d(p3, b, p1);
       }catch(com.kuaishou.android.security.base.exception.KSException e0){
          return "";
       }
    }
    public String atlasSignLite(String p0,String p1,int p2,String p3){
       if (PatchProxy.isSupport(a.class)) {
          p0 = PatchProxy.applyFourRefs(p0, p1, Integer.valueOf(p2), p3, this, a.class, "9");
          if (p0 != PatchProxyResult.class) {
             return p0;
          }
       }
       boolean b = true;
       try{
          return this.a(p3, b, p1);
       }catch(com.kuaishou.android.security.base.exception.KSException e0){
          return "";
       }
    }
    public String challenge(String p0,String p1,int p2,String p3){
       if (PatchProxy.isSupport(a.class)) {
          p0 = PatchProxy.applyFourRefs(p0, p1, Integer.valueOf(p2), p3, this, a.class, "10");
          if (p0 != PatchProxyResult.class) {
             return p0;
          }
       }
       boolean b = true;
       try{
          return this.c(p3, b, p1);
       }catch(com.kuaishou.android.security.base.exception.KSException e0){
          return "";
       }
    }
    public boolean detectEnvironment(String p0,String p1,int p2,int p3){
       KSecurity$ENV rOOT;
       if (PatchProxy.isSupport(a.class)) {
          p0 = PatchProxy.applyFourRefs(p0, p1, Integer.valueOf(p2), Integer.valueOf(p3), this, a.class, "6");
          if (p0 != PatchProxyResult.class) {
             return p0.booleanValue();
          }
       }
       try{
          boolean b = false;
          switch (p3){
              case 0:
                rOOT = KSecurity$ENV.ROOT;
             label_0041 :
                b = this.a(rOOT, true, p1);
                break;
              case 1:
                rOOT = KSecurity$ENV.MALWARE;
                goto label_0041 ;
                break;
              case 2:
                rOOT = KSecurity$ENV.HOOK;
                goto label_0041 ;
                break;
              case 3:
                rOOT = KSecurity$ENV.EMULATOR;
                goto label_0041 ;
                break;
              case 4:
                rOOT = KSecurity$ENV.ANTIDEBUG;
                goto label_0041 ;
                break;
              case 5:
                rOOT = KSecurity$ENV.REPACK;
                goto label_0041 ;
                break;
              case 6:
                b = KSecurity.isInitialize();
                break;
              default:
          }
          return b;
       }catch(com.kuaishou.android.security.base.exception.KSException e0){
       }
    }
    public Object dfpCall(int p0,Object[] p1){
       boolean b;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, uoa, "12");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       uoa = null;
       if (p0 != 0x110006) {
          if (p0 != 0x110007) {
             if (p0 != 0x11000f) {
                b = true;
                int i = 0;
                switch (p0){
                    case 0x110001:
                      if (p1 != null) {
                         Context uContext = b.i().j().c();
                         b.a(uContext).a(p1[i]);
                         b.a(uContext).a(b);
                      }
                      break;
                    case 0x110002:
                      if (p1 != null) {
                         a.a(b.i().j().c()).a(p1[i]);
                      }
                      break;
                    case 0x110003:
                      if (p1 != null) {
                         n.a(p1[i], p1[b]);
                      }
                      break;
                    case 0x110004:
                      if (p1 != null) {
                         n.a(p1[i], p1[b], p1[2].booleanValue(), p1[3].booleanValue());
                      }
                      break;
                    default:
                }
             }else {
                uoa = a.a(b.i().j().c()).a();
             }
          }else {
             a.a(b.i().j().c()).b();
          }
       }else {
          a.a(b.i().j().c()).c();
       }
       return uoa;
    }
    public boolean g(){
       Object obj = PatchProxy.apply(null, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (!b.i().g()) {
          return this.f().a();
       }
       return true;
    }
    public String getSecurityValue(String p0,String p1,int p2,int p3){
       if (PatchProxy.isSupport(a.class)) {
          p0 = PatchProxy.applyFourRefs(p0, p1, Integer.valueOf(p2), Integer.valueOf(p3), this, a.class, "7");
          if (p0 != PatchProxyResult.class) {
             return p0;
          }
       }
       boolean b = true;
       try{
          return this.a(p3, b, p1);
       }catch(com.kuaishou.android.security.base.exception.KSException e0){
          return "";
       }
    }
    public String localChallenge(String p0,String p1,int p2,String p3){
       if (PatchProxy.isSupport(a.class)) {
          p0 = PatchProxy.applyFourRefs(p0, p1, Integer.valueOf(p2), p3, this, a.class, "11");
          if (p0 != PatchProxyResult.class) {
             return p0;
          }
       }
       boolean b = true;
       try{
          return this.a(b, p1, p3);
       }catch(com.kuaishou.android.security.base.exception.KSException e0){
          return "";
       }
    }
    public void parseKConfPolicy(JSONObject p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "13")) {
          return;
       }
       a.a(b.i().j().c()).f(p0);
       return;
    }
    public byte[] uDecrypt(String p0,String p1,int p2,byte[] p3){
       if (PatchProxy.isSupport(a.class)) {
          p0 = PatchProxy.applyFourRefs(p0, p1, Integer.valueOf(p2), p3, this, a.class, "5");
          if (p0 != PatchProxyResult.class) {
             return p0;
          }
       }
       boolean b = true;
       boolean b1 = false;
       try{
          return this.a(p3, b1, b, p1);
       }catch(com.kuaishou.android.security.base.exception.KSException e0){
          byte[] uobyteArray = new byte[b1];
          return uobyteArray;
       }
    }
    public byte[] uEncrypt(String p0,String p1,int p2,byte[] p3){
       if (PatchProxy.isSupport(a.class)) {
          p0 = PatchProxy.applyFourRefs(p0, p1, Integer.valueOf(p2), p3, this, a.class, "4");
          if (p0 != PatchProxyResult.class) {
             return p0;
          }
       }
       boolean b = true;
       boolean b1 = false;
       try{
          return this.b(p3, b1, b, p1);
       }catch(com.kuaishou.android.security.base.exception.KSException e0){
          byte[] uobyteArray = new byte[b1];
          return uobyteArray;
       }
    }
}
