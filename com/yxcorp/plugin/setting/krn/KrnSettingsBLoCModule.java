package com.yxcorp.plugin.setting.krn.KrnSettingsBLoCModule;
import nc5.c;
import com.kuaishou.krn.base.KrnBridge;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.Callback;
import android.content.Intent;
import java.lang.String;
import java.io.Serializable;
import ekd.j0;
import com.yxcorp.gifshow.model.SwitchItem;
import java.lang.Object;
import com.facebook.react.bridge.WritableNativeMap;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import oe6.e;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import fg6.a;
import java.util.Map;
import com.google.gson.Gson;
import com.facebook.react.bridge.Arguments;
import com.kwai.robust.PatchProxyResult;
import java.util.HashMap;
import nc5.i;
import k2b.e0;
import java.lang.Boolean;
import rgd.a;
import fi0.c;
import java.lang.Throwable;
import q87.c;
import java.lang.Integer;
import wkd.b;
import com.kwai.component.menudot.b;
import com.yxcorp.plugin.setting.krn.KrnSettingsBLoCModule$a;
import java.lang.reflect.Type;
import el.a;
import com.google.gson.internal.LinkedTreeMap;
import com.kwai.framework.activitycontext.ActivityContext;
import android.app.Activity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import rgd.b;
import n3d.a;
import com.yxcorp.gifshow.plugin.impl.setting.SettingPluginHelper;
import rgd.c;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.plugin.impl.setting.SettingPluginHelper$startPushSilenceSettingActivity$1;
import android.content.Context;
import msd.a;

public class KrnSettingsBLoCModule extends KrnBridge implements c	// class@0008c9
{

    public void KrnSettingsBLoCModule(ReactApplicationContext p0){
       super(p0);
    }
    public static void a(KrnSettingsBLoCModule p0,Callback p1,int p2,int p3,Intent p4){
       p0.lambda$startPushSilenceSettingForResult$0(p1, p2, p3, p4);
    }
    public static void b(KrnSettingsBLoCModule p0,int p1,int p2,Intent p3){
       p0.lambda$startPushDetailSettings$1(p1, p2, p3);
    }
    private void lambda$startPushDetailSettings$1(int p0,int p1,Intent p2){
       if (p1 == -1 && p2 != null) {
          SwitchItem switchItem = j0.e(p2, "result_data");
          if (switchItem != null) {
             this.notifyEventToJS("switchItemChanged", this.convertObjToNativeMap(switchItem));
          }
       }
       return;
    }
    private void lambda$startPushSilenceSettingForResult$0(Callback p0,int p1,int p2,Intent p3){
       if (p2 == -1) {
          Serializable serializable = j0.e(p3, "result_silence_data");
          if (p3 != null && (serializable != null && serializable instanceof SwitchItem)) {
             this.notifyEventToJS("switchItemChanged", this.convertObjToNativeMap(serializable));
          }
       }else {
          Object[] objArray = new Object[0];
          p0.invoke(objArray);
       }
       return;
    }
    public void fetchCacheSettingsOnCompletion(Callback p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KrnSettingsBLoCModule.class, "9")) {
          return;
       }
       String str = e.y();
       if (TextUtils.x(str)) {
          Object[] objArray = new Object[0];
          p0.invoke(objArray);
       }else {
          Object[] objArray1 = new Object[]{Arguments.makeNativeMap(a.a.h(str, Map.class))};
          p0.invoke(objArray1);
       }
       return;
    }
    public Map getConstants(){
       HashMap obj = PatchProxy.apply(null, this, KrnSettingsBLoCModule.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       obj.put("CALLBACK_RED_DOT", "CALLBACK_RED_DOT");
       return obj;
    }
    public String getName(){
       return "SettingsBLoCModule";
    }
    public void hasNoDisturbRedDot(Callback p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KrnSettingsBLoCModule.class, "3")) {
          return;
       }
       int i = 1006;
       try{
          i.e(i, null);
          Object[] objArray = new Object[]{Boolean.valueOf(i.c(i))};
          p0.invoke(objArray);
       }catch(java.lang.Exception e1){
          Object[] objArray1 = new Object[0];
          p0.invoke(objArray1);
          a.C().e(c.a, "SettingsBLoCModule#hasNoDisturbRedDot", e1);
       }
       return;
    }
    public void onNoDisturbRedDotClicked(){
       if (PatchProxy.applyVoid(null, this, KrnSettingsBLoCModule.class, "2")) {
          return;
       }
       i.b(1006, null);
       return;
    }
    public void onUpdate(int p0,int p1){
       KrnSettingsBLoCModule krnSettingsB = KrnSettingsBLoCModule.class;
       if (PatchProxy.isSupport(krnSettingsB) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, krnSettingsB, "10")) {
          return;
       }
       if (p0 == 1006) {
          this.notifyEventToJS("CALLBACK_RED_DOT", Integer.valueOf(p1));
       }
       return;
    }
    public void saveCacheSettings(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KrnSettingsBLoCModule.class, "8")) {
          return;
       }
       e.n0(p0);
       return;
    }
    public void startListenForNoDisturbRedDot(Callback p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KrnSettingsBLoCModule.class, "6")) {
          return;
       }
       int i = 0x34c80eb4;
       try{
          b.a(i).r(1006, this);
          Object[] objArray = new Object[0];
          p0.invoke(objArray);
       }catch(java.lang.Exception e4){
          a.C().e(c.a, "SettingsBLoCModule#startListenForNoDisturbRedDot", e4);
       }
       return;
    }
    public void startPushDetailSettings(String p0,String p1,Callback p2){
       Gson a;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, KrnSettingsBLoCModule.class, "5")) {
          return;
       }
       try{
          a = a.a;
          SwitchItem switchItem = a.h(p0, SwitchItem.class);
          LinkedTreeMap linkedTreeMa = a.i(p1, new KrnSettingsBLoCModule$a(this).getType());
          SettingPluginHelper.e(ActivityContext.g().e(), linkedTreeMa, switchItem, new b(this));
       }catch(java.lang.Exception e7){
          a.C().e(c.a, "SettingsBLoCModule#startPushDetailSettings", e7);
       }
       return;
    }
    public void startPushSilenceSettingForResult(String p0,Callback p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, KrnSettingsBLoCModule.class, "4")) {
          return;
       }
       try{
          SwitchItem switchItem = a.a.h(p0, SwitchItem.class);
          Activity uActivity = ActivityContext.g().e();
          c uoc = new c(this, p1);
          if (!PatchProxy.applyVoidThreeRefs(uActivity, switchItem, uoc, null, SettingPluginHelper.class, "8")) {
             a.p(uActivity, "activity");
             a.p(switchItem, "selectedItem");
             a.p(uoc, "callback");
             SettingPluginHelper.a.a(uActivity, new SettingPluginHelper$startPushSilenceSettingActivity$1(uActivity, switchItem, uoc));
          }
       }catch(java.lang.Exception e9){
          a.C().e(c.a, "SettingsBLoCModule#startPushSilenceSettingForResult", e9);
       }
       return;
    }
    public void stopListenForNoDisturbRedDot(Callback p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KrnSettingsBLoCModule.class, "7")) {
          return;
       }
       int i = 0x34c80eb4;
       try{
          b.a(i).s(1006, this);
          Object[] objArray = new Object[0];
          p0.invoke(objArray);
       }catch(java.lang.Exception e4){
          a.C().e(c.a, "SettingsBLoCModule#stopListenForNoDisturbRedDot", e4);
       }
       return;
    }
}
