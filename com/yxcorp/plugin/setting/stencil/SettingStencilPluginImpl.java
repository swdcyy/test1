package com.yxcorp.plugin.setting.stencil.SettingStencilPluginImpl;
import vgc.a;
import java.lang.Object;
import k2b.e0;
import com.yxcorp.gifshow.settings.stencil.entity.SettingItemStencil;
import ehc.g;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import zgd.a;
import com.yxcorp.plugin.setting.stencil.SettingStencilPluginImpl$createLoggerHandler$$inlined$let$lambda$1;
import msd.a;
import ehc.h;
import java.lang.Integer;
import java.lang.Number;
import zgd.b;
import xgd.a;
import com.yxcorp.plugin.setting.stencil.config.SettingItem;

public class SettingStencilPluginImpl implements a	// class@0008f4
{

    public void SettingStencilPluginImpl(){
       super();
    }
    public g F10(e0 p0,SettingItemStencil p1){
       String obj = PatchProxy.applyTwoRefs(p0, p1, this, SettingStencilPluginImpl.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "logPage");
       a.p(p1, "data");
       obj = p1.getItemLogName();
       a uoa = (obj != null)? new a(p0, obj, new SettingStencilPluginImpl$createLoggerHandler$$inlined$let$lambda$1(p0, p1)): null;
       return uoa;
    }
    public boolean isAvailable(){
       return true;
    }
    public h qc(e0 p0,SettingItemStencil p1){
       h oh;
       b obj = PatchProxy.applyTwoRefs(p0, p1, this, SettingStencilPluginImpl.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "logPage");
       a.p(p1, "data");
       Integer redDotType = p1.getRedDotType();
       obj = (redDotType != null)? new b(p0, redDotType.intValue()): null;
       return obj;
    }
    public int y10(SettingItemStencil p0){
       int iconResource;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyOneRefs(p0, this, SettingStencilPluginImpl.class, "3");
       if (obj != patchProxyRe) {
          return obj.intValue();
       }
       a.p(p0, "data");
       String itemKey = p0.getItemKey();
       if (itemKey != null) {
          object oobject = null;
          obj = PatchProxy.applyOneRefs(itemKey, oobject, a.class, "1");
          if (obj != patchProxyRe) {
          }else {
             a.p(itemKey, "key");
             SettingItem[] settingItemA = SettingItem.values();
             int len = settingItemA.length;
             int i = 0;
             while (i < len) {
                object oobject1 = settingItemA[i];
                if (a.g(oobject1.getKey(), itemKey)) {
                   oobject = oobject1;
                   break ;
                }
                i = i + 1;
             }
             obj = oobject;
          }
          if (obj != null) {
             iconResource = obj.getIconResource();
          label_0055 :
             return iconResource;
          }
       }
       iconResource = 0x7f081f8e;
       goto label_0055 ;
    }
}
