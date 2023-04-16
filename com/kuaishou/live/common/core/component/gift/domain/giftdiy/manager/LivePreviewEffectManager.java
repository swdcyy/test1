package com.kuaishou.live.common.core.component.gift.domain.giftdiy.manager.LivePreviewEffectManager;
import com.kuaishou.live.common.core.component.gift.base.LifecycleManager;
import androidx.lifecycle.LifecycleOwner;
import bj1.b;
import g03.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.live.common.core.component.gift.domain.giftdiy.manager.LivePreviewEffectManager$b;
import com.kuaishou.live.common.core.component.gift.domain.giftdiy.manager.LivePreviewEffectManager$c;
import com.kuaishou.live.common.core.component.gift.domain.giftdiy.manager.LivePreviewEffectManager$d;
import lz2.c;
import iy2.f$a;
import cj1.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import pp.c;
import com.kuaishou.android.live.log.b;
import e17.i;
import com.kuaishou.livestream.message.nano.LiveCommonEffectInfo;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.common.core.component.gift.domain.giftdiy.manager.LivePreviewEffectManager$a;
import com.kuaishou.live.common.core.component.gift.domain.effect.bean.MagicSdkProtocol;
import nsd.u;
import fg6.a;
import com.google.gson.Gson;
import java.lang.Throwable;
import java.lang.Long;
import kz2.a;
import pz2.c;
import java.lang.StringBuilder;
import kz2.d;
import com.kuaishou.live.common.core.component.gift.domain.giftdiy.manager.LivePreviewEffectManager$e;
import com.kuaishou.live.common.core.component.gift.domain.giftdiy.manager.LivePreviewEffectManager$startPreview$task$2;
import z1.k;
import msd.l;

public final class LivePreviewEffectManager extends LifecycleManager	// class@001247
{
    public final c c;
    public int d;
    public d e;
    public a f;
    public LiveCommonEffectInfo g;
    public final LivePreviewEffectManager$c h;
    public final LivePreviewEffectManager$d i;
    public final b j;
    public final a k;

    public void LivePreviewEffectManager(LifecycleOwner p0,b p1,a p2){
       a.p(p0, "lifecycleOwner");
       a.p(p1, "effectDelegate");
       a.p(p2, "liveEffectResourceProvider");
       super(p0);
       this.j = p1;
       this.k = p2;
       this.c = LivePreviewEffectManager$b.b;
       LivePreviewEffectManager$c uoc = new LivePreviewEffectManager$c(this);
       this.h = uoc;
       LivePreviewEffectManager$d uod = new LivePreviewEffectManager$d(this);
       this.i = uod;
       p1.B0(uod);
       p1.R2(uoc);
    }
    public final void b(String p0,int p1,a p2){
       if (PatchProxy.isSupport(LivePreviewEffectManager.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, this, LivePreviewEffectManager.class, "5")) {
          return;
       }
       b.f0(this.c, "[moveToState]", "source", p0, "from", Integer.valueOf(this.d), "to", Integer.valueOf(p1), "effectInfo", p2);
       if (this.d == p1) {
          return;
       }
       this.d = p1;
       if (p1 == 2 && !PatchProxy.applyVoid(null, this, LivePreviewEffectManager.class, "6")) {
          i.a(R.style.arg_RES_7f110668, 0x7f103e1d);
       }
       return;
    }
    public final void c(LiveCommonEffectInfo p0,a p1){
       a a;
       a uoa = this;
       String str = p0;
       LiveCommonEffectInfo obj = p1;
       LivePreviewEffectManager livePreviewE = LivePreviewEffectManager.class;
       if (PatchProxy.applyVoidTwoRefs(str, obj, uoa, livePreviewE, "2")) {
          return;
       }
       a.p(str, "commonEffectInfo");
       uoa.j.S0((long)0x40000);
       uoa.f = obj;
       uoa.g = str;
       String str1 = null;
       if (obj != null) {
          a = obj.a;
          if (a != null) {
             PatchProxyResult patchProxyRe = PatchProxyResult.class;
             Object obj1 = PatchProxy.applyOneRefs(a, uoa, livePreviewE, "7");
             if (obj1 != patchProxyRe) {
             }else {
                LivePreviewEffectManager$a uoa1 = new LivePreviewEffectManager$a(a, str1);
                int i = 4000;
                if (PatchProxy.isSupport(livePreviewE)) {
                   String str2 = PatchProxy.applyTwoRefs(uoa1, Integer.valueOf(i), uoa, livePreviewE, "8");
                   if (str2 != patchProxyRe) {
                   }else {
                   label_0054 :
                      String str3 = null;
                      long l1 = 0;
                      int i1 = 9;
                      u ou = null;
                      int i2 = 4000;
                      MagicSdkProtocol magicSdkProt = str2;
                      try{
                         magicSdkProt = new MagicSdkProtocol(str3, i2, uoa1, l1, i1, ou);
                         str2 = a.a.q(str2);
                      }catch(java.lang.Exception e0){
                         b.I(uoa.c, "[getMagicSdkProtocolJsonString] toJson fail.", e0);
                         str2 = "";
                      }
                   }
                }else {
                   goto label_0054 ;
                }
             }
             str.extraInfo = obj1;
          }
       }
       LiveCommonEffectInfo effectiveKey = str.effectiveKey;
       a.o(effectiveKey, "commonEffectInfo.effectiveKey");
       long l = uoa.j.C1(effectiveKey);
       LivePreviewEffectManager c = uoa.c;
       LivePreviewEffectManager e = uoa.e;
       Long longx = Long.valueOf(l);
       LivePreviewEffectManager e1 = uoa.e;
       Long longx1 = (e1 != null)? Long.valueOf(e1.b()): null;
       b.e0(c, "[startPreview]", "currentEffectTask", e, "magicFaceId", longx, "task.magicFaceId", longx1);
       e1 = uoa.e;
       if (e1 != null && (e1 != null && (!l - e1.b() && a.g(uoa.j.H(), uoa.e)))) {
          b.Z(uoa.c, "[startPreview] sendMsgToRenderTask");
          e1 = uoa.e;
          a.m(e1);
          obj = str.extraInfo;
          a.o(obj, "commonEffectInfo.extraInfo");
          if (!PatchProxy.applyVoidTwoRefs(e1, obj, uoa, livePreviewE, "4")) {
             b.Z(uoa.c, "[sendMsgToRenderTask]  info = "+obj);
             uoa.j.C0(e1, obj);
          }
       }else {
          uoa.b("startPreview", str1, obj);
          d uod = new d(p0, l, uoa.k, new LivePreviewEffectManager$e(uoa), new LivePreviewEffectManager$startPreview$task$2(uoa));
          uoa.e = e1;
          b.Z(uoa.c, "[startPreview] addTask£¬ extraInfo = "+e1.getExtraInfo());
          uoa.j.o1(e1);
       }
       return;
    }
    public final void d(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LivePreviewEffectManager.class, "3")) {
          return;
       }
       b.Z(this.c, "[stopPreview]  stop");
       if (this.j.H() instanceof d) {
          this.j.D();
       }
       this.e = objArray;
       this.f = objArray;
       this.g = objArray;
       this.j.j1((long)0x40000);
       return;
    }
    public void onDestroy(LifecycleOwner p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LivePreviewEffectManager.class, "1")) {
          return;
       }
       a.p(p0, "owner");
       super.onDestroy(p0);
       this.d();
       this.j.g1(this.i);
       this.j.X5(this.h);
       return;
    }
}
