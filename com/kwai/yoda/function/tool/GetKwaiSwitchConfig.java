package com.kwai.yoda.function.tool.GetKwaiSwitchConfig;
import ay7.a;
import com.kwai.yoda.function.tool.GetKwaiSwitchConfig$a;
import nsd.u;
import java.lang.String;
import com.kwai.yoda.bridge.YodaBaseWebView;
import com.kwai.yoda.function.FunctionResultParams;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.yoda.function.tool.GetKwaiSwitchConfig$b;
import yz7.e;
import java.util.List;
import java.util.Collection;
import com.kwai.middleware.azeroth.Azeroth2;
import o97.a;
import com.kwai.yoda.function.tool.GetKwaiSwitchConfig$GetKswitchResultParams;
import java.util.Iterator;
import java.lang.Iterable;
import com.kwai.yoda.function.tool.GetKwaiSwitchConfig$c;
import tb7.j;
import com.google.gson.JsonElement;
import com.kwai.yoda.bridge.YodaException;

public final class GetKwaiSwitchConfig extends a	// class@00120f
{
    public static final GetKwaiSwitchConfig$a d;

    static {
       GetKwaiSwitchConfig.d = new GetKwaiSwitchConfig$a(null);
    }
    public void GetKwaiSwitchConfig(){
       super();
    }
    public String c(){
       return "getKswitchData";
    }
    public String d(){
       return "tool";
    }
    public boolean g(){
       return true;
    }
    public FunctionResultParams k(YodaBaseWebView p0,String p1){
       GetKwaiSwitchConfig$b uob;
       p0 = PatchProxy.applyTwoRefs(p0, p1, this, GetKwaiSwitchConfig.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       JsonElement jsonElement = null;
       try{
          uob = e.a(p1, GetKwaiSwitchConfig$b.class);
       }catch(java.lang.Exception e0){
          uob = jsonElement;
       }
       if (uob != null) {
          List list = uob.a();
          int i = 1;
          Azeroth2 uAzeroth2 = (list == null || list.isEmpty())? 1: null;
          if (!uAzeroth2) {
             a uoa = Azeroth2.B.q();
             if (uoa != null) {
                GetKwaiSwitchConfig$GetKswitchResultParams getKswitchRe = new GetKwaiSwitchConfig$GetKswitchResultParams();
                getKswitchRe.mResult = i;
                List list1 = uob.a();
                if (list1 != null) {
                   Iterator iterator = list1.iterator();
                   while (iterator.hasNext()) {
                      GetKwaiSwitchConfig$c uoc = iterator.next();
                      GetKwaiSwitchConfig$c switchKey = uoc.switchKey;
                      if (switchKey != null) {
                         String str = j.b(switchKey);
                         if (str != null) {
                            uoc.value = uoa.L5(uoc.projectName, str, jsonElement);
                            getKswitchRe.getResultData().add(uoc);
                         }
                      }
                   }
                }
                return getKswitchRe;
             }else {
                throw new YodaException(0x1e84a, "please init azeroth kswitch first");
             }
          }
       }
       throw new YodaException(0x1e84f, "params not valid");
    }
}
