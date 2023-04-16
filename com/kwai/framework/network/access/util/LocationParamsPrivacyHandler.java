package com.kwai.framework.network.access.util.LocationParamsPrivacyHandler;
import java.lang.Object;
import com.kwai.framework.network.access.util.LocationParamsPrivacyHandler$LocationPrivacyType;
import java.lang.String;
import java.util.Map;
import java.util.List;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.util.Collection;
import java.util.Iterator;
import com.yxcorp.retrofit.model.ConfigModel;
import java.lang.CharSequence;
import android.text.TextUtils;
import kotlin.jvm.internal.a;
import kotlin.text.StringsKt__StringsKt;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;

public final class LocationParamsPrivacyHandler	// class@00179c
{
    public static final LocationParamsPrivacyHandler a;

    static {
       LocationParamsPrivacyHandler.a = new LocationParamsPrivacyHandler();
    }
    public void LocationParamsPrivacyHandler(){
       super();
    }
    public final boolean a(LocationParamsPrivacyHandler$LocationPrivacyType p0,String p1,boolean p2,Map p3,List p4){
       ConfigModel obj1;
       boolean b;
       Object obj = this;
       object oobject = p0;
       object oobject1 = p1;
       object oobject2 = p3;
       int i = 2;
       if (PatchProxy.isSupport(LocationParamsPrivacyHandler.class)) {
          Object[] objArray = new Object[]{oobject,oobject1,Boolean.valueOf(p2),oobject2,p4};
          obj1 = PatchProxy.apply(objArray, obj, LocationParamsPrivacyHandler.class, "2");
          if (obj1 != PatchProxyResult.class) {
             return obj1.booleanValue();
          }
       }
       if (p2) {
          return 0;
       }else if(oobject2 == null || p3.isEmpty()){
          b = true;
       }else {
          b = false;
       }
       if (!b) {
          b = (p4 == null || p4.isEmpty())? true: false;
          if (!b) {
             Iterator iterator = p4.iterator();
             while (iterator.hasNext()) {
                Object obj2 = iterator.next();
                Object obj3 = obj2;
                Object obj4 = obj2;
                obj1 = PatchProxy.applyThreeRefs(p0, p1, obj3, this, LocationParamsPrivacyHandler.class, "5");
                if (obj1 != PatchProxyResult.class) {
                   b = obj1.booleanValue();
                }else if(oobject == LocationParamsPrivacyHandler$LocationPrivacyType.LatLon){
                   obj1 = obj4.mLatlonBlackList;
                }else {
                   obj1 = obj4.mLLBlackList;
                }
                String obj5 = (obj1 == null || obj1.isEmpty())? 1: 0;
                if (!obj5 && obj1.contains(oobject1)) {
                   b = true;
                }else {
                   b = false;
                }
                if (b) {
                   return 1;
                }else {
                   obj1 = PatchProxy.applyThreeRefs(p0, p1, obj4, this, LocationParamsPrivacyHandler.class, "4");
                   if (obj1 != PatchProxyResult.class) {
                      b = obj1.booleanValue();
                   }else if(oobject == LocationParamsPrivacyHandler$LocationPrivacyType.LatLon){
                      obj1 = obj4.mLatlonWhiteList;
                   }else {
                      obj1 = obj4.mLLWhiteList;
                   }
                   obj5 = (obj1 == null || obj1.isEmpty())? 1: null;
                   if (obj5) {
                      b = false;
                   }else if(obj1.contains(oobject1)){
                      b = true;
                   }else {
                      Iterator iterator1 = obj1.iterator();
                      while (true) {
                         if (iterator1.hasNext()) {
                            obj5 = iterator1.next();
                            if (!TextUtils.isEmpty(obj5)) {
                               a.o(obj5, "whitePath");
                               obj3 = null;
                               int i1 = 2;
                               if (StringsKt__StringsKt.O2(obj5, "*", 0, i1, obj3)) {
                                  int i2 = obj5.length() - 1;
                                  if (StringsKt__StringsKt.O2(oobject1, obj5.subSequence(0, i2), 0, i1, obj3)) {
                                     b = true;
                                  label_0119 :
                                     if (b) {
                                        obj1 = obj4.mBizCode;
                                        obj5 = PatchProxy.applyTwoRefs(obj1, oobject2, obj, LocationParamsPrivacyHandler.class, "3");
                                        if (obj5 != PatchProxyResult.class) {
                                           b = obj5.booleanValue();
                                        }else if(obj1 == null || !obj1.length()){
                                           obj5 = 1;
                                        }else {
                                           obj5 = null;
                                        }
                                        if (!obj5 && oobject2.containsKey(obj1)) {
                                           Boolean uBoolean = oobject2.get(obj1);
                                           if (uBoolean != null) {
                                              b = uBoolean.booleanValue();
                                           }
                                        }
                                        b = false;
                                        if (b) {
                                           return 0;
                                        }
                                     }
                                     obj4 = 2;
                                  }
                               }
                            }
                         }else {
                            b = false;
                            goto label_0119 ;
                         }
                      }
                   }
                   LocationParamsPrivacyHandler locationPara = 2;
                   goto label_0119 ;
                }
             }
          }
       }
       return 1;
    }
    public final void b(Map p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LocationParamsPrivacyHandler.class, "6")) {
          return;
       }
       p0.remove("lat");
       p0.remove("lon");
       Log.g("LocationParamsPrivacyHandler", "removeLatAndLon\(\): path == "+p1+"£¬remove lat/lon");
       return;
    }
}
