package com.kuaishou.merchant.live.cart.onsale.audience.component.base.BaseCartComponent$view$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.merchant.live.cart.onsale.audience.component.base.BaseCartComponent;
import android.view.View;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import android.view.ViewGroup;
import kotlin.jvm.internal.a;
import r34.b;
import mv.a;
import java.lang.System;
import com.kuaishou.merchant.live.cart.onsale.audience.model.ComponentInfo;
import java.lang.Long;
import com.kuaishou.merchant.live.cart.MerchantCartLogBiz;
import p74.a;
import java.lang.Throwable;
import o74.a;

public final class BaseCartComponent$view$2 extends Lambda implements a	// class@001931
{
    public final BaseCartComponent this$0;

    public void BaseCartComponent$view$2(BaseCartComponent p0){
       this.this$0 = p0;
       super(0);
    }
    public final View invoke(){
       Object obj = this;
       BaseCartComponent uBaseCartCom = BaseCartComponent.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       String str = "1";
       BaseCartComponent$view$2 obj1 = PatchProxy.apply(objArray, obj, BaseCartComponent$view$2.class, str);
       if (obj1 != patchProxyRe) {
          return obj1;
       }
       obj1 = obj.this$0;
       Objects.requireNonNull(obj1);
       BaseCartComponent uBaseCartCom1 = PatchProxy.apply(objArray, obj1, uBaseCartCom, str);
       if (uBaseCartCom1 != patchProxyRe) {
       }else {
          uBaseCartCom1 = obj1.a;
          if (uBaseCartCom1 == null) {
             a.S("parent");
          }
       }
       Objects.requireNonNull(obj1);
       View view = PatchProxy.applyOneRefs(uBaseCartCom1, obj1, uBaseCartCom, "5");
       if (view != patchProxyRe) {
       }else {
          uBaseCartCom = obj1.b;
          if (uBaseCartCom == null) {
             a.S("componentInfo");
          }
          try{
             if (!PatchProxy.applyVoidTwoRefs(obj1, uBaseCartCom, objArray, b.class, str)) {
                a uoa = a.a();
                String str1 = obj1.toString();
                long l = System.currentTimeMillis();
                String name = uBaseCartCom.getName();
                String str2 = uBaseCartCom.renderType();
                Objects.requireNonNull(uoa);
                a uoa1 = a.class;
                if (PatchProxy.isSupport(uoa1)) {
                   Object[] objArray1 = new Object[]{str1,Long.valueOf(l),name,str2,"EVENT_COMPONENT_COST_TIME"};
                   if (!PatchProxy.applyVoid(objArray1, uoa, uoa1, "11")) {
                   }
                }else {
                }
             }
          }catch(java.lang.Exception e0){
             a.l(MerchantCartLogBiz.LIVE_AUDIENCE_ON_SALE, "DynamicPerf", "onCreateViewStart", e0);
          }
          View view1 = obj1.j(uBaseCartCom1);
          if (view1 instanceof ViewGroup) {
             view = view1;
             view.setClipChildren(false);
             view.setClipToPadding(false);
          }
          if (!PatchProxy.applyVoidOneRefs(obj1, null, b.class, "2")) {
             try{
                a.a().i(obj1.toString(), System.currentTimeMillis());
             }catch(java.lang.Exception e0){
                a.l(MerchantCartLogBiz.LIVE_AUDIENCE_ON_SALE, "DynamicPerf", "onCreateViewEnd", e0);
             }
          }
       }
       return view;
    }
    public Object invoke(){
       return this.invoke();
    }
}
