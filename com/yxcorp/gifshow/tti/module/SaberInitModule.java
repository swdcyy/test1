package com.yxcorp.gifshow.tti.module.SaberInitModule;
import com.kwai.framework.init.TTIInitModule;
import b76.a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.component.saber.ageonmanager.AegonProxyManager;
import com.kwai.component.saber.ageonmanager.AegonProxyManager$a;
import java.util.Objects;
import com.kwai.component.saber.ageonmanager.AegonSpManager;
import o56.c;
import o56.a;
import com.kwai.component.saber.ageonmanager.AegonSpManager$a;
import java.lang.Integer;
import java.lang.Boolean;
import java.lang.StringBuilder;
import android.content.SharedPreferences;
import java.lang.Number;
import com.kwai.component.saber.executor.e;
import com.kwai.component.saber.executor.WebSocketSpManager;
import com.kwai.component.saber.executor.WebSocketSpManager$a;
import kotlin.jvm.internal.a;

public final class SaberInitModule extends TTIInitModule	// class@001dcc
{

    public void SaberInitModule(){
       super();
    }
    public int f0(){
       return 7;
    }
    public void k0(a p0){
       AegonSpManager obj;
       String str2;
       boolean i2;
       int i3;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, SaberInitModule.class, "1")) {
          return;
       }
       AegonProxyManager uAegonProxyM = AegonProxyManager.f.a();
       Objects.requireNonNull(uAegonProxyM);
       AegonSpManager uAegonSpMana = AegonSpManager.class;
       if (!PatchProxy.applyVoid(null, uAegonProxyM, AegonProxyManager.class, "1") && a.a().c()) {
          AegonSpManager$a h = AegonSpManager.h;
          int i = h.a().a();
          AegonSpManager uAegonSpMana1 = h.a();
          Objects.requireNonNull(uAegonSpMana1);
          boolean b = true;
          int i1 = 0;
          if (PatchProxy.isSupport(uAegonSpMana)) {
             obj = PatchProxy.applyOneRefs(Integer.valueOf(i), uAegonSpMana1, uAegonSpMana, "11");
             if (obj != patchProxyRe) {
                b = obj.booleanValue();
             }else if(uAegonSpMana1.a() == i){
                if (PatchProxy.isSupport(uAegonSpMana)) {
                   Object obj2 = PatchProxy.applyOneRefs(Integer.valueOf(i), uAegonSpMana1, uAegonSpMana, "7");
                   if (obj2 != patchProxyRe) {
                      i2 = obj2.booleanValue();
                   label_0091 :
                      if (i2) {
                         str2 = uAegonSpMana1.b(i);
                         uAegonSpMana1 = (str2 == null || !str2.length())? 1: null;
                         if (uAegonSpMana1) {
                         label_00a6 :
                            b = false;
                         }
                      }else {
                         goto label_00a6 ;
                      }
                   }
                }
                i2 = uAegonSpMana1.f.getBoolean(uAegonSpMana1.e+i, i1);
                goto label_0091 ;
             }else {
                goto label_00a6 ;
             }
          }else {
             goto label_005b ;
          }
          if (b) {
             str2 = h.a().b(i);
             if (str2 != null) {
                obj = h.a();
                Objects.requireNonNull(obj);
                if (PatchProxy.isSupport(uAegonSpMana)) {
                   Object obj1 = PatchProxy.applyOneRefs(Integer.valueOf(i), obj, uAegonSpMana, "9");
                   if (obj1 != patchProxyRe) {
                      i2 = obj1.intValue();
                   label_00ea :
                      AegonSpManager uAegonSpMana2 = h.a();
                      Objects.requireNonNull(uAegonSpMana2);
                      if (PatchProxy.isSupport(uAegonSpMana)) {
                         uAegonSpMana = PatchProxy.applyOneRefs(Integer.valueOf(i), uAegonSpMana2, uAegonSpMana, "10");
                         if (uAegonSpMana != patchProxyRe) {
                            i3 = uAegonSpMana.intValue();
                         label_0121 :
                            uAegonProxyM.b(str2, i2, i3, i, true);
                         }
                      }
                      i3 = uAegonSpMana2.f.getInt(uAegonSpMana2.d+i, i1);
                      goto label_0121 ;
                   }
                }
                i2 = obj.f.getInt(obj.c+i, i1);
                goto label_00ea ;
             }
          }
       }
    label_0126 :
       e uoe = e.a();
       Objects.requireNonNull(uoe);
       WebSocketSpManager webSocketSpM = WebSocketSpManager.class;
       if (!PatchProxy.applyVoid(null, uoe, e.class, "4")) {
          WebSocketSpManager$a c = WebSocketSpManager.c;
          WebSocketSpManager webSocketSpM1 = c.a();
          Objects.requireNonNull(webSocketSpM1);
          String str = PatchProxy.applyOneRefs("key_WebSocket_StartUp", webSocketSpM1, webSocketSpM, "2");
          if (str != patchProxyRe) {
          }else {
             a.p("key_WebSocket_StartUp", "startUpKey");
             str = webSocketSpM1.a.getString("key_WebSocket_StartUp", "-1");
          }
          WebSocketSpManager webSocketSpM2 = c.a();
          Objects.requireNonNull(webSocketSpM2);
          String str1 = PatchProxy.applyOneRefs("key_WebSocket_Url", webSocketSpM2, webSocketSpM, "4");
          if (str1 != patchProxyRe) {
          }else {
             a.p("key_WebSocket_Url", "urlKey");
             str1 = webSocketSpM2.a.getString("key_WebSocket_Url", "-1");
          }
          if (str != null && (str1 != null && str.equals("1"))) {
             uoe.b(str1, str);
          }
       }
    label_0187 :
       return;
    }
}
