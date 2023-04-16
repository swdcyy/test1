package com.yxcorp.gifshow.camerasdk.r;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import org.json.JSONObject;
import k2b.u1;
import java.util.Objects;
import com.yxcorp.gifshow.camerasdk.YtechBizLogger;
import com.yxcorp.gifshow.camerasdk.YtechBizLogger$YtechBiz;
import com.yxcorp.gifshow.biz.monitor.log.BizLogger;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.biz.monitor.log.LogLevel;
import oa9.b;
import java.util.Map;
import java.lang.Throwable;
import com.yxcorp.gifshow.biz.monitor.log.BizLogger$b;

public class r	// class@00103f
{
    public final String a;
    public final String b;

    public void r(String p0,String p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final String a(String p0){
       JSONObject obj = PatchProxy.applyOneRefs(p0, this, r.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (TextUtils.x(p0)) {
          return "";
       }
       try{
          obj = new JSONObject(p0);
          obj.put("Business", this.a);
          p0 = obj.toString();
          return p0.replace("\"", "\\\"");
       }catch(java.lang.Exception e0){
          return v1;
       }
    }
    public final void b(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, r.class, "4")) {
          return;
       }
       u1.R("YTECH_STAT_INFO", p0, 26);
       return;
    }
    public final void c(String p0,String p1,String p2){
       String str7;
       LogLevel wARNING;
       Object obj1;
       BizLogger b;
       r or = this;
       String str = p0;
       Object obj = p1;
       String str1 = p2;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, r.class, "2")) {
          return;
       }
       Objects.requireNonNull(p0);
       int i = -1;
       switch (p0.hashCode()){
           case 'd':
             if (str.equals("d")) {
                i = 0;
             }
             break;
           case 'e':
             if (str.equals("e")) {
                i = 1;
             }
             break;
           case 'i':
             if (str.equals("i")) {
                i = 2;
             }
             break;
           case 'w':
             if (str.equals("w")) {
                i = 3;
             }
             break;
           default:
       }
       switch (i){
           case 0:
             YtechBizLogger.i().b(YtechBizLogger$YtechBiz.COMMON, obj, or.a(str1));
             return;
           case 1:
             YtechBizLogger.i().c(YtechBizLogger$YtechBiz.COMMON, obj, or.a(str1));
             return;
           case 2:
             YtechBizLogger.i().g(YtechBizLogger$YtechBiz.COMMON, obj, or.a(str1));
             return;
           case 3:
             YtechBizLogger ytechBizLogg = YtechBizLogger.i();
             YtechBizLogger$YtechBiz cOMMON = YtechBizLogger$YtechBiz.COMMON;
             String str2 = or.a(str1);
             Objects.requireNonNull(ytechBizLogg);
             if (!PatchProxy.applyVoidThreeRefs(cOMMON, p1, str2, ytechBizLogg, BizLogger.class, "6")) {
                String str3 = "biz";
                a.p(cOMMON, str3);
                String str4 = "tag";
                a.p(obj, str4);
                String str5 = "msg";
                a.p(str2, str5);
                String str6 = str2;
                YtechBizLogger$YtechBiz ytechBiz = cOMMON;
                YtechBizLogger ytechBizLogg1 = ytechBizLogg;
                if (!PatchProxy.applyVoidFourRefs(cOMMON, p1, str2, null, ytechBizLogg, BizLogger.class, "7")) {
                   a.p(ytechBiz, str3);
                   a.p(obj, str4);
                   a.p(str6, str5);
                   BizLogger uBizLogger = BizLogger.class;
                   int i1 = 4;
                   object oobject = null;
                   int i2 = 5;
                   if (PatchProxy.isSupport(uBizLogger)) {
                      Object[] objArray = new Object[i2];
                      objArray[0] = ytechBiz;
                      objArray[1] = obj;
                      objArray[2] = str6;
                      objArray[3] = oobject;
                      objArray[i1] = oobject;
                      if (!PatchProxy.applyVoid(objArray, ytechBizLogg1, uBizLogger, "8")) {
                      }
                   }else {
                   }
                }
             }
          label_011b :
             return;
             break;
           default:
             return;
       }
    }
}
