package com.kuaishou.merchant.live.basic.router.MagicEffectRouterHandler$b;
import ks3.c0;
import kotlin.jvm.internal.Ref$LongRef;
import nv3.a;
import kotlin.jvm.internal.Ref$ObjectRef;
import com.kuaishou.merchant.live.basic.router.MagicEffectRouterHandler;
import com.kuaishou.merchant.router.base.RouterRequest;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import ks3.b0;
import tkd.b;
import tkd.d;
import ma4.e;
import ma4.c;
import na4.m;
import com.kuaishou.merchant.live.MerchantLiveLogBiz;
import java.lang.Long;
import p74.a;
import o74.a;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import fg6.a;
import com.kuaishou.merchant.live.basic.router.MagicEffectRouterHandler$LogParams;
import com.google.gson.Gson;
import z54.b;
import java.lang.Integer;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import fq5.b;

public final class MagicEffectRouterHandler$b implements c0	// class@0018bc
{
    public final Ref$LongRef a;
    public final a b;
    public final Ref$ObjectRef c;
    public final MagicEffectRouterHandler d;
    public final RouterRequest e;

    public void MagicEffectRouterHandler$b(Ref$LongRef p0,a p1,Ref$ObjectRef p2,MagicEffectRouterHandler p3,RouterRequest p4){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       super();
    }
    public void a(boolean p0){
       if (PatchProxy.isSupport2(MagicEffectRouterHandler$b.class, "2") && PatchProxy.applyVoidOneRefsWithListener(Boolean.valueOf(p0), this, MagicEffectRouterHandler$b.class, "2")) {
          return;
       }
       b0.a(this, p0);
       MagicEffectRouterHandler$b tb = this.b;
       if (tb != null) {
          tb.onDismiss();
       }
       c uoc = d.a(-1103669376).k60();
       if (uoc != null) {
          uoc.f(m.d(this.e));
       }
       PatchProxy.onMethodExit(MagicEffectRouterHandler$b.class, "2");
       return;
    }
    public void b(){
       b a;
       if (PatchProxy.applyVoidWithListener(null, this, MagicEffectRouterHandler$b.class, "1")) {
          return;
       }
       b0.b(this);
       a.t(MerchantLiveLogBiz.MAGIC_EFFECT, "MagicEffectRouterHandler", "onRenderStart", "magicFaceId", Long.valueOf(this.a.element));
       MagicEffectRouterHandler$b tb = this.b;
       if (tb != null) {
          tb.onShow();
       }
       c uoc = d.a(-1103669376).k60();
       if (uoc != null) {
          uoc.b(m.d(this.e));
       }
       try{
          if (!TextUtils.x(this.c.element)) {
             MagicEffectRouterHandler$LogParams logParams = a.a.h(this.c.element, MagicEffectRouterHandler$LogParams.class);
             if (logParams != null) {
                a = b.a;
                String name = logParams.getName();
                if (name == null) {
                   name = "";
                }
                Integer type = logParams.getType();
                int i = (type != null)? type.intValue(): 0;
                a.a(name, i, String.valueOf(this.a.element), String.valueOf(logParams.getMaterialId()), this.d.a.a());
             }
          }
          PatchProxy.onMethodExit(e0, "1");
          return;
       }catch(java.lang.Exception e0){
       }
    }
}
