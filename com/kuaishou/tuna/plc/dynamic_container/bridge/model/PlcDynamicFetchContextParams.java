package com.kuaishou.tuna.plc.dynamic_container.bridge.model.PlcDynamicFetchContextParams;
import java.io.Serializable;
import java.lang.Object;
import com.kwai.framework.model.feed.BaseFeed;
import java.util.Map;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.Collection;
import ekd.q;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import kp.r1;
import java.util.Arrays;
import fg6.a;
import com.google.gson.Gson;
import org.json.JSONObject;
import java.lang.StringBuilder;
import com.kuaishou.tuna.plc.dynamic_container.logger.PlcDynamicLogger;
import java.lang.Throwable;

public class PlcDynamicFetchContextParams implements Serializable	// class@000fdb
{
    public List mKeys;
    public static final long serialVersionUID = 0x9bf26999feca9abb;

    public void PlcDynamicFetchContextParams(){
       super();
    }
    public Map fetchContextData(BaseFeed p0){
       HashMap hashMap;
       Object obj = this;
       Object obj1 = p0;
       Map obj2 = PatchProxy.applyOneRefs(obj1, obj, PlcDynamicFetchContextParams.class, "1");
       if (obj2 != PatchProxyResult.class) {
          return obj2;
       }
       Map map = null;
       if (q.f(obj.mKeys)) {
          return map;
       }
       try{
          try{
             hashMap = new HashMap();
             Iterator iterator = obj.mKeys.iterator();
             while (iterator.hasNext()) {
                String str = iterator.next();
                if (TextUtils.x(str)) {
                   break ;
                }else if(TextUtils.n(str, "serverExpTag")){
                   hashMap.put("serverExpTag", r1.I1(p0));
                }else if(TextUtils.n(str, "expTag")){
                   hashMap.put("expTag", r1.M0(p0));
                }else if(TextUtils.n(str, "photoId")){
                   hashMap.put("photoId", r1.t1(p0));
                }else if(TextUtils.n(str, "feed")){
                   hashMap.put("feed", obj1);
                }else {
                   String[] stringArray = str.split("\\.");
                   if (stringArray.length < 2) {
                      break ;
                   }else {
                      List list = Arrays.asList(stringArray);
                      if (map == null) {
                         map = new JSONObject(a.a.q(obj1));
                      }
                      int i1 = list.size();
                      int i2 = 1;
                      Map map1 = map;
                      while (i2 < i1 && map1 != null) {
                         String str1 = list.get(i2);
                         int i3 = i1 - 1;
                         if (i2 == i3) {
                            Object obj3 = map1.opt(str1);
                            if (obj3 != null) {
                               hashMap.put(str, obj3);
                            }else {
                               PlcDynamicLogger.c("fetch context key:"+str1+" is null!");
                            }
                         }else {
                            map1 = map1.optJSONObject(str1);
                         }
                         i2 = i2 + 1;
                         int i4 = p0;
                      }
                   }
                }
                obj1 = p0;
             }
             return obj2;
          }catch(java.lang.Exception e0){
             int i = hashMap;
          }
          PlcDynamicLogger.j("fetchContextData error!", e0);
          obj2 = map;
          goto label_00e8 ;
       }catch(java.lang.Exception e0){
          goto label_00e2 ;
       }
    }
    public List getKeys(){
       return this.mKeys;
    }
    public void setKeys(List p0){
       this.mKeys = p0;
    }
}
