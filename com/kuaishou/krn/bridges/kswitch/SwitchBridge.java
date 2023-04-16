package com.kuaishou.krn.bridges.kswitch.SwitchBridge;
import com.kuaishou.krn.base.KrnBridge;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.Promise;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.krn.bridges.kswitch.SwitchBridge$KswitchRequestParams;
import java.util.Collection;
import ekd.q;
import com.kuaishou.krn.c;
import kj0.f;
import kj0.d;
import com.kuaishou.krn.bridges.kswitch.SwitchBridge$KswitchResultParams;
import com.kuaishou.krn.bridges.kswitch.SwitchBridge$a;
import java.util.Iterator;
import java.util.List;
import com.kuaishou.krn.bridges.kswitch.SwitchBridge$ProjectKswitch;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.google.gson.JsonElement;
import com.facebook.react.bridge.WritableNativeMap;
import java.lang.Throwable;
import ek0.d;
import com.facebook.react.bridge.WritableMap;
import com.kwai.robust.PatchProxyResult;
import java.util.HashMap;

public class SwitchBridge extends KrnBridge	// class@000829
{

    public void SwitchBridge(ReactApplicationContext p0){
       super(p0);
    }
    public void getKswitchData(ReadableMap p0,Promise p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, SwitchBridge.class, "2")) {
          return;
       }
       if (p0 == null) {
          p1.reject("0", "params is null");
          return;
       }else {
          SwitchBridge$KswitchRequestParams kswitchReque = this.parseRequestParams(p0);
          if (kswitchReque == null || q.f(kswitchReque.requestList)) {
             p1.reject(String.valueOf(0x1e84f), "params not valid");
             return;
          }else {
             f uof = c.b().f();
             if (uof == null) {
                p1.reject(String.valueOf(0x1e84a), "please init KrnConfig first");
                return;
             }else {
                d uod = uof.c();
                if (uod == null) {
                   p1.reject(String.valueOf(0x1e84a), "please init SwitchManager first");
                   return;
                }else {
                   SwitchBridge$a uoa = null;
                   SwitchBridge$KswitchResultParams kswitchResul = new SwitchBridge$KswitchResultParams(uoa);
                   Iterator iterator = kswitchReque.requestList.iterator();
                   while (iterator.hasNext()) {
                      SwitchBridge$ProjectKswitch projectKswit = iterator.next();
                      if (projectKswit != null && !TextUtils.isEmpty(projectKswit.switchKey)) {
                         projectKswit.value = uod.b(projectKswit.projectName, projectKswit.switchKey, uoa);
                         kswitchResul.resultData.add(projectKswit);
                      }
                   }
                   WritableNativeMap writableNati = this.convertObjToNativeMap(kswitchResul);
                   if (writableNati == null) {
                      p1.reject(String.valueOf(0x1e84a), "native result to map error");
                      return;
                   }else {
                      p1.resolve(writableNati);
                      return;
                   }
                }
             }
          }
       }
    }
    public WritableMap getKswitchDataSync(ReadableMap p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, SwitchBridge.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == null) {
          d.i("params is null");
          return null;
       }else {
          SwitchBridge$KswitchRequestParams kswitchReque = this.parseRequestParams(p0);
          if (kswitchReque == null || q.f(kswitchReque.requestList)) {
             d.i("params not valid");
             return null;
          }else {
             f uof = c.b().f();
             if (uof == null) {
                d.i("please init KrnConfig first");
                return null;
             }else {
                d uod = uof.c();
                if (uod == null) {
                   d.i("please init SwitchManager first");
                   return null;
                }else {
                   SwitchBridge$KswitchResultParams kswitchResul = new SwitchBridge$KswitchResultParams(null);
                   Iterator iterator = kswitchReque.requestList.iterator();
                   while (iterator.hasNext()) {
                      SwitchBridge$ProjectKswitch projectKswit = iterator.next();
                      if (projectKswit != null && !TextUtils.isEmpty(projectKswit.switchKey)) {
                         projectKswit.value = uod.b(projectKswit.projectName, projectKswit.switchKey, null);
                         kswitchResul.resultData.add(projectKswit);
                      }
                   }
                   return this.convertObjToNativeMap(kswitchResul);
                }
             }
          }
       }
    }
    public String getName(){
       return "SwitchBridge";
    }
    public final SwitchBridge$KswitchRequestParams parseRequestParams(ReadableMap p0){
       SwitchBridge$KswitchRequestParams obj = PatchProxy.applyOneRefs(p0, this, SwitchBridge.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.convertJsonToBean(this.convertBeanToJson(p0.toHashMap()), SwitchBridge$KswitchRequestParams.class);
       return obj;
    }
}
