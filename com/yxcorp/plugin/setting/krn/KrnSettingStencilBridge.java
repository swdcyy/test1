package com.yxcorp.plugin.setting.krn.KrnSettingStencilBridge;
import com.kuaishou.krn.base.KrnBridge;
import com.facebook.react.bridge.ReactApplicationContext;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import com.kwai.framework.model.user.QCurrentUser;
import com.facebook.react.bridge.Promise;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import java.lang.Throwable;
import android.content.SharedPreferences;
import oe6.n;
import rgd.a;
import q87.c;
import android.content.SharedPreferences$Editor;
import oe6.g;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.Arguments;

public class KrnSettingStencilBridge extends KrnBridge	// class@0008c7
{

    public void KrnSettingStencilBridge(ReactApplicationContext p0){
       super(p0);
    }
    public final String generateCacheKey(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KrnSettingStencilBridge.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return QCurrentUser.ME.getId()+"_setting_stencil_page_key_"+p0;
    }
    public String getName(){
       return "KrnSettingStencilManager";
    }
    public void readStencilCache(String p0,Promise p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, KrnSettingStencilBridge.class, "1")) {
          return;
       }
       if (TextUtils.isEmpty(p0)) {
          p1.reject(new JSApplicationIllegalArgumentException("pageKey must not be null"));
          return;
       }else {
          p1.resolve(n.b().getString(this.generateCacheKey(p0), ""));
          return;
       }
    }
    public void writeStencilCache(String p0,String p1,Promise p2){
       Object[] objArray;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, KrnSettingStencilBridge.class, "2")) {
          return;
       }
       if (TextUtils.isEmpty(p0)) {
          p2.reject(new JSApplicationIllegalArgumentException("pageKey must not be null"));
          objArray = new Object[0];
          a.C().w("KrnSettingStencilManager", "writeStencilCache: pageKey must not be null", objArray);
          return;
       }else if(TextUtils.isEmpty(p1)){
          p2.reject(new JSApplicationIllegalArgumentException("stencil must not be null"));
          objArray = new Object[0];
          a.C().w("KrnSettingStencilManager", "writeStencilCache: stencil must not be null", objArray);
          return;
       }else {
          Object[] objArray1 = new Object[0];
          a.C().w("KrnSettingStencilManager", "writeStencilCache start:"+p0, objArray1);
          g.a(n.b().edit().putString(this.generateCacheKey(p0), p1));
          Object[] objArray2 = new Object[0];
          a.C().w("KrnSettingStencilManager", "writeStencilCache end:"+p0, objArray2);
          WritableMap writableMap = Arguments.createMap();
          writableMap.putBoolean("result", true);
          p2.resolve(writableMap);
          return;
       }
    }
}
