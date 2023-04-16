package com.kuaishou.merchant.dynamicpendant.entrance.DyTroubleShootingModule;
import c08.a;
import java.lang.Object;
import java.lang.String;
import b08.a;
import fq5.b;
import com.kwai.framework.model.user.User;
import com.kwaishou.merchant.daccore.log.DyTroubleShooting;
import java.util.Objects;
import com.kwaishou.merchant.troubleshooting.core.TroubleShooting;
import o56.a;
import android.app.Application;
import qrd.p;
import com.kwaishou.merchant.daccore.log.DyTroubleShooting$dyTroubleShootingLogger$2$a;
import t08.a;
import java.lang.CharSequence;
import zsd.u;
import java.util.concurrent.ConcurrentHashMap;
import com.kwaishou.merchant.daccore.log.DyTroubleShooting$a;
import java.util.LinkedHashMap;
import qrd.l1;
import java.util.Map;
import f08.b;
import f08.b$a;
import java.lang.Throwable;
import com.kuaishou.merchant.dynamicpendant.entrance.DyTroubleShootingModule$openTroubleShootingFloatingRunnable$2;
import msd.a;
import qrd.s;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwaishou.merchant.daccore.log.DACKeyNode;
import com.kwaishou.merchant.troubleshooting.core.model.KeyNode;
import com.kwaishou.merchant.troubleshooting.core.model.Node;
import com.kwaishou.merchant.troubleshooting.core.model.RubasParams;
import java.lang.Runnable;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.sdk.switchconfig.a;
import java.lang.StringBuilder;
import f08.a;
import kotlin.jvm.internal.a;
import r08.i;
import com.kwaishou.merchant.troubleshooting.core.TroubleShooting$a;
import ekd.k1;

public final class DyTroubleShootingModule	// class@001696
{
    public final a a;
    public final String b;
    public final String c;
    public final String d;
    public final p e;

    public void DyTroubleShootingModule(a p0){
       String str1;
       TroubleShooting a;
       ConcurrentHashMap uConcurrentH;
       super();
       this.a = p0;
       this.b = a.d(p0);
       String str = null;
       if (p0 != null) {
          b uob = p0.b();
          if (uob != null) {
             User user = uob.I();
             if (user != null) {
                user = user.mName;
             label_001e :
                this.c = user;
                if (p0 != null) {
                   str = p0.e();
                }
                this.d = str;
                DyTroubleShooting c = DyTroubleShooting.c;
                try{
                   Objects.requireNonNull(c);
                   str1 = a.d(p0);
                   a = TroubleShooting.a;
                   a.F(a.B, str1, a.d());
                   a.I(DyTroubleShooting.b.getValue());
                   if (str1 == null || u.S1(str1)) {
                      uConcurrentH = 1;
                   label_0053 :
                      if (!uConcurrentH) {
                         uConcurrentH = DyTroubleShooting.a;
                         if (!uConcurrentH.containsKey(str1)) {
                            DyTroubleShooting$a uoa = new DyTroubleShooting$a();
                            uoa.a = c.s();
                            uConcurrentH.put(str1, uoa);
                         }
                      }
                   }else {
                      uConcurrentH = null;
                      goto label_0053 ;
                   }
                }catch(java.lang.Exception e0){
                   b$a.b(b.a, "DyTroubleShooting register error", e0, null, 4, null);
                }
                this.e = s.c(new DyTroubleShootingModule$openTroubleShootingFloatingRunnable$2(p0));
                return;
             }
          }
       }
       str1 = str;
       goto label_001e ;
    }
    public final void a(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, DyTroubleShootingModule.class, "4")) {
          return;
       }
       DyTroubleShooting c = DyTroubleShooting.c;
       DyTroubleShootingModule ta = this.a;
       String str = (ta != null)? a.d(ta): objArray;
       Objects.requireNonNull(c);
       try{
          int i = 0;
          KeyNode keyNode = DyTroubleShooting.o(c, str, i, DACKeyNode.DAC_FRAMEWORK, 2, null);
          TroubleShooting a = TroubleShooting.a;
          a.f(str, keyNode, objArray);
          if (keyNode != null) {
             objArray = keyNode.getId();
          label_0032 :
             DyTroubleShooting uDyTroubleSh = (objArray == null || u.S1(objArray))? 1: null;
             if (!uDyTroubleSh) {
                a.f(str, DyTroubleShooting.o(c, str, null, DACKeyNode.DAC_ENV_INIT, 2, null), objArray);
                a.f(str, DyTroubleShooting.o(c, str, null, DACKeyNode.DAC_RECEIVER_REQUEST_DATA, 2, null), objArray);
             }
          }else {
             goto label_0032 ;
          }
       }catch(java.lang.Exception e0){
          b$a.b(b.a, "addAssemblyCenterEnvNodes error", e0, null, 4, null);
       }
       return;
    }
    public final void b(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DyTroubleShootingModule.class, "5")) {
          return;
       }
       DyTroubleShooting.e(a.d(this.a), DACKeyNode.DAC_FRAMEWORK, p0, null, false, null, false, 120, null);
       return;
    }
    public final Runnable c(){
       Object obj = PatchProxy.apply(null, this, DyTroubleShootingModule.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.e.getValue();
    }
    public final void d(boolean p0){
       TroubleShooting a;
       DyTroubleShootingModule uDyTroubleSh = DyTroubleShootingModule.class;
       if (PatchProxy.isSupport(uDyTroubleSh) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uDyTroubleSh, "6")) {
          return;
       }
       DyTroubleShooting c = DyTroubleShooting.c;
       DyTroubleShootingModule tb = this.b;
       DyTroubleShootingModule td = this.d;
       DyTroubleShootingModule tc = this.c;
       try{
          Objects.requireNonNull(c);
          long l = a.t().b("LiveReportTroubleShootingSwitch", 0);
          b$a.e(b.a, "reportPageLogContextOnline "+tb+" isShopLive:"+p0+" switch:"+l, null, 2, null);
          if (!l - 2 || (!l - 1 && p0)) {
             a = TroubleShooting.a;
             a uoa = new a(td, tc, tb);
             Objects.requireNonNull(a);
             a.p(uoa, "reportRunnable");
             a.t(new i(tb, uoa));
          }
       }catch(java.lang.Exception e10){
          b$a.b(b.a, "reportPageLogContextOnline error", e10, null, 4, null);
       }
       return;
    }
    public final void e(){
       if (PatchProxy.applyVoid(null, this, DyTroubleShootingModule.class, "2")) {
          return;
       }
       if (!a.d()) {
          return;
       }
       k1.m(this.c());
       k1.r(this.c(), 3000);
       return;
    }
    public final void f(){
       if (PatchProxy.applyVoid(null, this, DyTroubleShootingModule.class, "3")) {
          return;
       }
       if (!a.d()) {
          return;
       }
       k1.m(this.c());
       return;
    }
}
