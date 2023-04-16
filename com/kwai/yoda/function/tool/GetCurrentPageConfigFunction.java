package com.kwai.yoda.function.tool.GetCurrentPageConfigFunction;
import ay7.a;
import com.kwai.yoda.function.tool.GetCurrentPageConfigFunction$a;
import nsd.u;
import java.lang.String;
import com.kwai.yoda.bridge.YodaBaseWebView;
import com.kwai.yoda.function.FunctionResultParams;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import org.json.JSONObject;
import java.net.URL;
import com.kwai.yoda.function.tool.GetCurrentPageConfigFunction$CurrentPageConfigResultParams;
import com.kwai.yoda.Yoda;
import kotlin.jvm.internal.a;
import java.lang.Boolean;
import com.kwai.yoda.YodaInitConfig;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;
import android.text.TextUtils;
import java.util.List;
import java.util.Collection;
import com.kwai.yoda.bridge.YodaException;

public final class GetCurrentPageConfigFunction extends a	// class@00120a
{
    public static String d;
    public static final GetCurrentPageConfigFunction$a e;

    static {
       GetCurrentPageConfigFunction.e = new GetCurrentPageConfigFunction$a(null);
       GetCurrentPageConfigFunction.d = "getCurrentPageConfig";
    }
    public void GetCurrentPageConfigFunction(){
       super();
    }
    public String c(){
       return GetCurrentPageConfigFunction.d;
    }
    public String d(){
       return "tool";
    }
    public FunctionResultParams k(YodaBaseWebView p0,String p1){
       boolean b1;
       String str = "url not valid";
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, GetCurrentPageConfigFunction.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       boolean b = false;
       JSONObject jSONObject = (p1 == null || !p1.length())? 1: null;
       Yoda yoda = 0x1e84f;
       if (!jSONObject) {
          if (p0 != null) {
             p1 = new JSONObject(p1).optString("pageUrl");
             URL uRL = (p1 == null || !p1.length())? 1: null;
             if (!uRL) {
                try{
                   uRL = new URL(p1);
                   p1 = (p1 == null || !p1.length())? 1: null;
                   if (!p1) {
                      p1 = uRL.getHost();
                      str = uRL.getPath();
                      GetCurrentPageConfigFunction$CurrentPageConfigResultParams uCurrentPage = (p1 == null || !p1.length())? 1: null;
                      if (!uCurrentPage) {
                         uCurrentPage = new GetCurrentPageConfigFunction$CurrentPageConfigResultParams();
                         uCurrentPage.mResult = 1;
                         yoda = Yoda.get();
                         String str1 = "Yoda.get\(\)";
                         a.h(yoda, str1);
                         uCurrentPage.enableDebugger = yoda.isDebugToolEnable();
                         uCurrentPage.enableWK = p0.isUseKsWebView();
                         a.h(str, "requestPath");
                         p0 = PatchProxy.applyTwoRefs(p1, str, this, GetCurrentPageConfigFunction.class, "2");
                         if (p0 != PatchProxyResult.class) {
                            b = p0.booleanValue();
                         }else {
                            Yoda yoda1 = Yoda.get();
                            a.h(yoda1, str1);
                            YodaInitConfig config = yoda1.getConfig();
                            if (config != null) {
                               a.h(config, "Yoda.get\(\).config ?: return true");
                               Map renderUrlBla = config.getRenderUrlBlackList();
                               if (renderUrlBla != null) {
                                  Iterator iterator = renderUrlBla.keySet().iterator();
                                  do {
                                     if (iterator.hasNext()) {
                                        str1 = iterator.next();
                                        if (!TextUtils.isEmpty(str1)) {
                                           int i = a.g(p1, str1) ^ 1;
                                           if (i) {
                                              continue ;
                                           }else {
                                              Iterator obj1 = renderUrlBla.get(str1);
                                              if (obj1 == null) {
                                                 a.L();
                                              }
                                              Iterator obj2 = PatchProxy.applyTwoRefs(str, obj1, this, GetCurrentPageConfigFunction.class, "3");
                                              if (obj2 != PatchProxyResult.class) {
                                                 b1 = obj2.booleanValue();
                                              }else if(obj1 == null || obj1.isEmpty()){
                                                 obj1 = obj1.iterator();
                                                 while (true) {
                                                    if (obj1.hasNext()) {
                                                       obj2 = obj1.next().values().iterator();
                                                       while (true) {
                                                          if (obj2.hasNext()) {
                                                             String str2 = obj2.next();
                                                             if (!TextUtils.isEmpty(str2) || !TextUtils.isEmpty(str)) {
                                                                if (TextUtils.isEmpty(str2)) {
                                                                   continue ;
                                                                }else if(a.g(str2, "*")){
                                                                   if (TextUtils.isEmpty(str)) {
                                                                      continue ;
                                                                   }else {
                                                                      int i1 = a.g(str2, str) ^ 1;
                                                                      if (i1) {
                                                                         continue ;
                                                                      }
                                                                   }
                                                                }
                                                             }
                                                             b1 = true;
                                                          }else {
                                                             continue ;
                                                          }
                                                       }
                                                    }
                                                 }
                                              }
                                              b1 = false;
                                           }
                                        }
                                     }
                                  } while (b1);
                               }
                            }
                            b = true;
                         }
                         uCurrentPage.enablePeerRender = b;
                         return uCurrentPage;
                      }else {
                         throw new YodaException(yoda, "url host is empty");
                      }
                   }else {
                      throw new YodaException(yoda, str);
                   }
                }catch(java.lang.Exception e0){
                   throw new YodaException(yoda, e0);
                }
             }else {
                throw new YodaException(yoda, "url is null");
             }
          }else {
             throw new YodaException(0x1e850, "client status error: webview is null.");
          }
       }else {
          throw new YodaException(yoda, "The Input is invalid: root params should be object.");
       }
    }
}
