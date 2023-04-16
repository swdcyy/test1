package com.kwai.framework.model.decompose.metaext.KSModelMetaExtLogManager;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.lang.Throwable;
import kotlin.Pair;
import com.kwai.framework.model.decompose.metaext.a;
import com.kwai.framework.model.decompose.metaext.a$a;
import com.google.gson.JsonObject;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.utility.Log;
import kotlin.jvm.internal.a;
import com.kwai.framework.model.decompose.metaext.c;
import ekd.e0;
import com.kwai.framework.model.decompose.metaext.KSModelMetaExtLogManager$logWhenSetLoggerTwice$loggerClassName$1;
import msd.l;
import java.lang.IllegalArgumentException;
import java.lang.Number;
import com.kwai.robust.PatchProxyResult;
import java.io.StringWriter;
import java.lang.StringBuilder;
import java.lang.CharSequence;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import com.google.gson.JsonElement;

public final class KSModelMetaExtLogManager	// class@0016ab
{
    public static boolean a = true;
    public static a b;
    public static final KSModelMetaExtLogManager c;

    static {
       KSModelMetaExtLogManager.c = new KSModelMetaExtLogManager();
    }
    public void KSModelMetaExtLogManager(){
       super();
    }
    public static void e(KSModelMetaExtLogManager p0,String p1,String p2,Map p3,Throwable p4,Pair p5,int p6,Object p7){
       int i;
       p5 = (p6 & 0x10)? a.a.a(): 0;
       p0.d(p1, p2, p3, p4, p5);
       return;
    }
    public final void a(String p0,String p1,JsonObject p2,Throwable p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, KSModelMetaExtLogManager.class, "6")) {
          return;
       }
       Log.e(p0, this.f(p1, p2), p3);
       return;
    }
    public final void b(String p0,String p1,Map p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, KSModelMetaExtLogManager.class, "5")) {
          return;
       }
       a.p(p0, "tag");
       a.p(p1, "msg");
       a.p(p2, "params");
       JsonObject jsonObject = c.g(p2);
       a.o(jsonObject, "jsonObject");
       Log.g(p0, this.f(p1, jsonObject));
       return;
    }
    public final void c(a p0,a p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, KSModelMetaExtLogManager.class, "3")) {
          return;
       }
       if (e0.a) {
          throw new IllegalArgumentException("÷¬√¸¥ÌŒÛ: ÷ÿ∏¥…Ë÷√ KSModelMetaExtLogger !!!");
       }
       KSModelMetaExtLogManager$logWhenSetLoggerTwice$loggerClassName$1 iNSTANCE = KSModelMetaExtLogManager$logWhenSetLoggerTwice$loggerClassName$1.INSTANCE;
       JsonObject jsonObject = new JsonObject();
       jsonObject.c0("oldLogger", iNSTANCE.invoke(p0));
       jsonObject.c0("newLogger", iNSTANCE.invoke(p1));
       this.a("KSModelMetaExtLogManager", "÷¬√¸¥ÌŒÛ: ÷ÿ∏¥…Ë÷√ KSModelMetaExtLogger !!!", jsonObject, null);
       return;
    }
    public final void d(String p0,String p1,Map p2,Throwable p3,Pair p4){
       KSModelMetaExtLogManager kSModelMetaE = KSModelMetaExtLogManager.class;
       if (PatchProxy.isSupport(kSModelMetaE)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4};
          if (PatchProxy.applyVoid(objArray, this, kSModelMetaE, "4")) {
             return;
          }
       }
       a.p(p0, "tag");
       a.p(p1, "msg");
       a.p(p2, "params");
       a.p(p4, "samplingRate");
       JsonObject jsonObject = c.g(p2);
       if (e0.a) {
          if (KSModelMetaExtLogManager.a && p3 != null) {
             throw p3;
          }
       }else if(c.h(p4.getFirst().longValue(), p4.getSecond().longValue())){
          a b = KSModelMetaExtLogManager.b;
          if (b != null) {
             a.o(jsonObject, "paramsJsonObject");
             b.a(p0, p1, jsonObject, p3, p4);
          }
       }
       a.o(jsonObject, "paramsJsonObject");
       this.a(p0, p1, jsonObject, p3);
       return;
    }
    public final String f(String p0,JsonObject p1){
       StringWriter obj = PatchProxy.applyTwoRefs(p0, p1, this, KSModelMetaExtLogManager.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new StringWriter();
       char c = ';';
       obj.append("msg="+p0+c);
       Iterator iterator = p1.entrySet().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          String key = uEntry.getKey();
          StringBuilder str = key;
          obj.append(str+'='+uEntry.getValue()+c);
       }
       c = obj.toString();
       a.o(c, "writer.toString\(\)");
       return c;
    }
}
