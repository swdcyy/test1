package com.kuaishou.merchant.krn.popupmanager.PopupManagerBridge;
import com.kuaishou.krn.base.KrnBridge;
import com.facebook.react.bridge.ReactApplicationContext;
import com.kuaishou.merchant.krn.popupmanager.PopupManagerBridge$a;
import com.kuaishou.merchant.krn.popupmanager.PopupManagerBridge$b;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactContext;
import java.lang.String;
import com.facebook.react.bridge.Promise;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import tkd.b;
import tkd.d;
import ma4.e;
import ma4.c;
import java.util.List;
import com.google.gson.JsonArray;
import java.util.Iterator;
import com.google.gson.JsonElement;
import ma4.d;
import java.lang.Boolean;
import lnc.i3;
import java.lang.Integer;
import java.lang.Number;
import js6.a;
import android.content.Context;

public class PopupManagerBridge extends KrnBridge	// class@001870
{
    public final String EVENT_TYPE_POPUP;
    public final d mPopupListener;
    public final ReactApplicationContext mReactApplicationContext;

    public void PopupManagerBridge(ReactApplicationContext p0){
       super(p0);
       this.EVENT_TYPE_POPUP = "MerchantPopupStateChanged";
       this.mPopupListener = new PopupManagerBridge$a(this);
       this.mReactApplicationContext = p0;
       p0.addLifecycleEventListener(new PopupManagerBridge$b(this));
    }
    public String getName(){
       return "PopupManagerBridge";
    }
    public void getOpeningDialog(Promise p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PopupManagerBridge.class, "1")) {
          return;
       }
       c uoc = d.a(-1103669376).k60();
       if (uoc == null) {
          p0.reject("-1", "popup state service not found");
          return;
       }else {
          JsonArray jsonArray = new JsonArray();
          Iterator iterator = uoc.c().iterator();
          while (iterator.hasNext()) {
             jsonArray.a0(iterator.next());
          }
          p0.resolve(jsonArray.toString());
          return;
       }
    }
    public void initDialogStateListener(){
       if (PatchProxy.applyVoid(null, this, PopupManagerBridge.class, "2")) {
          return;
       }
       c uoc = d.a(-1103669376).k60();
       if (uoc == null) {
          return;
       }
       uoc.e(this.mPopupListener);
       uoc.d(this.mPopupListener);
       return;
    }
    public void publishEvent(boolean p0,String p1,String p2){
       if (PatchProxy.isSupport(PopupManagerBridge.class) && PatchProxy.applyVoidThreeRefs(Boolean.valueOf(p0), p1, p2, this, PopupManagerBridge.class, "3")) {
          return;
       }
       i3 oi3 = i3.f();
       oi3.c("state", Integer.valueOf(p0));
       oi3.d("dialogName", p1);
       oi3.d("uniqueId", p2);
       String str = oi3.e();
       a.b.pt(this.mReactApplicationContext, "MerchantPopupStateChanged", str);
       return;
    }
}
