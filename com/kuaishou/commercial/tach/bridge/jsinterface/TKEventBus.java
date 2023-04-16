package com.kuaishou.commercial.tach.bridge.jsinterface.TKEventBus;
import com.tachikoma.core.component.TKBaseNativeModule;
import gx4.f;
import ph7.i;
import ph7.f;
import java.util.HashMap;
import com.kuaishou.commercial.tach.bridge.jsinterface.TKEventBus$a;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.tachikoma.core.bridge.d;
import java.lang.Throwable;
import java.lang.StringBuilder;
import wp8.a;
import com.tachikoma.core.component.TKBaseNativeModule$DestroyReason;
import com.kuaishou.commercial.tach.bridge.jsinterface.TKEventBus$b;
import java.lang.Runnable;
import iq8.x;
import org.json.JSONObject;
import com.tkruntime.v8.V8Function;
import java.lang.System;
import com.kuaishou.commercial.tach.bridge.jsinterface.TKEventBus$c;
import com.tkruntime.v8.V8Value;
import com.tkruntime.v8.JsValueRef;
import tx4.y;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import ph7.a;
import java.util.Collection;
import java.util.Iterator;

public class TKEventBus extends TKBaseNativeModule	// class@001640
{
    public a mEventCallback;
    public final f mKEventClient;
    public final Map mSubscribeMap;

    public void TKEventBus(f p0){
       super(p0);
       this.mKEventClient = i.d.b(2);
       this.mSubscribeMap = new HashMap();
       this.mEventCallback = new TKEventBus$a(this);
    }
    public final boolean d(String p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, TKEventBus.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (!TextUtils.x(p0)) {
          return true;
       }
       a.d(this.getTKJSContext(), new Throwable("eventType is empty: "+p1));
       return false;
    }
    public boolean isEventValueValid(String p0,boolean p1){
       TKEventBus tKEventBus = TKEventBus.class;
       if (PatchProxy.isSupport(tKEventBus)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), this, tKEventBus, "5");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       if (TextUtils.x(p0)) {
          d tKJSContext = this.getTKJSContext();
          String str = (p1)? "send": "receive event fail, value is null or empty";
          a.d(tKJSContext, new Throwable(str));
          return false;
       }else {
          return true;
       }
    }
    public void onDestroy(TKBaseNativeModule$DestroyReason p0,boolean p1){
       TKEventBus tKEventBus = TKEventBus.class;
       if (PatchProxy.isSupport(tKEventBus) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, tKEventBus, "8")) {
          return;
       }
       super.onDestroy(p0, p1);
       x.b(new TKEventBus$b(this));
       return;
    }
    public void sendEvent(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, TKEventBus.class, "4")) {
          return;
       }
       if (!this.d(p0, "sendEvent")) {
          return;
       }
       if (!this.isEventValueValid(p1, true)) {
          return;
       }
       this.mKEventClient.T1(p0, new JSONObject(p1));
       return;
    }
    public String subscribe(String p0,V8Function p1){
       String obj = PatchProxy.applyTwoRefs(p0, p1, this, TKEventBus.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!this.d(p0, "subscribe")) {
          return null;
       }
       obj = String.valueOf(System.nanoTime());
       TKEventBus$c uoc = new TKEventBus$c(obj, y.b(p1, this));
       List list = this.mSubscribeMap.get(p0);
       if (list == null) {
          ArrayList uArrayList = new ArrayList();
          uArrayList.add(uoc);
          this.mSubscribeMap.put(p0, uArrayList);
          this.mKEventClient.S1(p0, JSONObject.class, this.mEventCallback);
       }else {
          list.add(uoc);
       }
       return obj;
    }
    public void unRetainAllJsObj(){
       if (PatchProxy.applyVoid(null, this, TKEventBus.class, "7")) {
          return;
       }
       super.unRetainAllJsObj();
       Iterator iterator = this.mSubscribeMap.values().iterator();
       while (iterator.hasNext()) {
          Iterator iterator1 = iterator.next().iterator();
          while (iterator1.hasNext()) {
             TKEventBus$c uoc = iterator1.next();
             if (uoc != null) {
                y.c(uoc.b);
             }
          }
       }
       return;
    }
    public void unSubscribe(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKEventBus.class, "3")) {
          return;
       }
       this.unSubscribe(p0, null);
       return;
    }
    public void unSubscribe(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, TKEventBus.class, "2")) {
          return;
       }
       if (!this.d(p0, "unSubscribe")) {
          return;
       }
       List list = this.mSubscribeMap.get(p0);
       if (list == null) {
          return;
       }
       if (p1 == null) {
          list.clear();
       }else {
          Iterator iterator = list.iterator();
          while (iterator.hasNext()) {
             TKEventBus$c uoc = iterator.next();
             if (uoc != null && p1.equals(uoc.a)) {
                list.remove(uoc);
                break ;
             }
          }
       }
       if (list.isEmpty()) {
          this.mSubscribeMap.remove(p0);
          this.mKEventClient.Y1(p0, this.mEventCallback);
       }
       return;
    }
}
