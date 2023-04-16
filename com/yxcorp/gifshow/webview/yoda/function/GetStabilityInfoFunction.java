package com.yxcorp.gifshow.webview.yoda.function.GetStabilityInfoFunction;
import com.kwai.yoda.function.c;
import com.kwai.yoda.bridge.YodaBaseWebView;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Object;
import fg6.a;
import com.yxcorp.gifshow.webview.yoda.function.GetStabilityInfoFunction$a;
import com.google.gson.Gson;
import java.util.Collection;
import com.kwai.imsdk.internal.util.b;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import o66.d;
import txc.c;
import java.lang.Throwable;
import q87.c;
import com.yxcorp.gifshow.webview.yoda.function.GetStabilityInfoFunction$StabilityResult$a;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import oe6.g;
import com.yxcorp.gifshow.webview.yoda.function.GetStabilityInfoFunction$StabilityResult;
import com.kwai.yoda.function.FunctionResultParams;
import com.kwai.yoda.bridge.YodaException;
import java.lang.Exception;

public class GetStabilityInfoFunction extends c	// class@0017b2
{

    public void GetStabilityInfoFunction(){
       super();
    }
    public void a(YodaBaseWebView p0,String p1,String p2,String p3,String p4){
       int i1;
       Object obj = this;
       object oobject = p0;
       object oobject1 = p1;
       object oobject2 = p2;
       object oobject3 = p3;
       object oobject4 = p4;
       GetStabilityInfoFunction getStability = GetStabilityInfoFunction.class;
       int i = 1;
       if (PatchProxy.isSupport(getStability)) {
          Object[] objArray = new Object[]{oobject,oobject1,oobject2,oobject3,oobject4};
          if (PatchProxy.applyVoid(objArray, obj, getStability, "1")) {
             return;
          }
       }
       HashMap hashMap = 0x1e84f;
       try{
          Object obj1 = a.a.h(oobject3, GetStabilityInfoFunction$a.class);
          if (obj1 != null) {
             if (b.c(obj1.mUrlList)) {
                obj.p(oobject, oobject1, oobject2, oobject4);
                return;
             }else {
                hashMap = new HashMap();
                Iterator iterator = obj1.mUrlList.iterator();
                while (iterator.hasNext()) {
                   SharedPreferences$Editor obj2 = iterator.next();
                   try{
                      i1 = d.f(obj2);
                   }catch(java.lang.Exception e0){
                      Object[] objArray1 = new Object[0];
                      c.C().u(getStability.getSimpleName(), e0, objArray1);
                      i1 = -1;
                   }
                   GetStabilityInfoFunction$StabilityResult$a stabilityRes = new GetStabilityInfoFunction$StabilityResult$a();
                   stabilityRes.mCrashCount = i1;
                   hashMap.put(obj2, stabilityRes);
                   if (obj1.mReset == null || (PatchProxy.applyVoidOneRefs(obj2, null, d.class, "2") || d.a == null)) {
                      continue ;
                   }else {
                      List list = d.c(obj2);
                      if (list.isEmpty()) {
                         continue ;
                      }else {
                         obj2 = d.a.edit();
                         Iterator iterator1 = list.iterator();
                         while (iterator1.hasNext()) {
                            obj2.remove(iterator1.next());
                         }
                         g.a(obj2);
                      }
                   }
                }
                GetStabilityInfoFunction$StabilityResult stabilityRes1 = new GetStabilityInfoFunction$StabilityResult();
                stabilityRes1.mCrashDataMap = hashMap;
                stabilityRes1.mResult = i;
                this.l(p0, stabilityRes1, p1, p2, "", p4);
                return;
             }
          }else {
             throw new YodaException(hashMap, "non-json object.");
          }
       }catch(java.lang.Exception e0){
          throw new YodaException(hashMap, e0.getMessage());
       }
    }
}
