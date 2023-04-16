package com.kuaishou.merchant.dynamicpendant.mount.live.delegate.MerchantLeftTopAreaMountDelegate;
import i08.a;
import com.kuaishou.merchant.api.live.service.LiveMerchantTopPendantService;
import java.lang.Object;
import com.kuaishou.merchant.dynamicpendant.mount.live.delegate.MerchantLeftTopAreaMountDelegate$tempPendantItems$2;
import msd.a;
import qrd.p;
import qrd.s;
import android.view.View;
import com.kwaishou.merchant.daccore.data.model.PendantMountInfo;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.System;
import com.kwaishou.merchant.daccore.util.PendantUtil;
import com.kwaishou.merchant.daccore.util.PendantUtil$Companion;
import java.util.Map;
import java.lang.Integer;
import f08.f;
import f08.f$a;
import java.lang.Throwable;
import com.kuaishou.merchant.api.live.service.LiveMerchantTopPendantService$a;
import gw3.s;
import i08.a$a;
import java.lang.Number;

public final class MerchantLeftTopAreaMountDelegate implements a	// class@0016aa
{
    public final p a;
    public LiveMerchantTopPendantService b;

    public void MerchantLeftTopAreaMountDelegate(LiveMerchantTopPendantService p0){
       super();
       this.b = p0;
       this.a = s.c(MerchantLeftTopAreaMountDelegate$tempPendantItems$2.INSTANCE);
    }
    public boolean a(View p0,PendantMountInfo p1){
       Object obj = this;
       View view = p0;
       Object obj1 = p1;
       MerchantLeftTopAreaMountDelegate merchantLeft = MerchantLeftTopAreaMountDelegate.class;
       Object obj2 = PatchProxy.applyTwoRefs(view, obj1, obj, merchantLeft, "2");
       if (obj2 != PatchProxyResult.class) {
          return obj2.booleanValue();
       }
       int i = System.identityHashCode(p0);
       PendantUtil$Companion a = PendantUtil.a;
       String str = a.d(view, p1.getMaterialId(), true);
       if (this.d().containsKey(Integer.valueOf(i))) {
          f$a.s(f.a, p1.getLiveId(), str, "mount error: this view has mounted", null, null, 24, null);
          return false;
       }else if(p1.getWidth() > 0){
          view = a.h(view, (float)p1.getWidth(), 0);
       }
       a.g(view, obj1);
       s os = PatchProxy.applyTwoRefs(view, obj1, obj, merchantLeft, "5");
       if (os != PatchProxyResult.class) {
       }else {
          os = new s(view, obj1);
       }
       obj.b.e(os);
       this.d().put(Integer.valueOf(i), os);
       return true;
    }
    public boolean b(View p0,PendantMountInfo p1){
       p1 = PatchProxy.applyTwoRefs(p0, p1, this, MerchantLeftTopAreaMountDelegate.class, "3");
       if (p1 != PatchProxyResult.class) {
          return p1.booleanValue();
       }
       LiveMerchantTopPendantService$a uoa = this.d().remove(Integer.valueOf(System.identityHashCode(p0)));
       if (uoa == null) {
          return false;
       }
       this.b.b(uoa);
       return true;
    }
    public void c(Map p0,View p1,PendantMountInfo p2){
       String liveId;
       String this;
       String str;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, MerchantLeftTopAreaMountDelegate.class, "4")) {
          return;
       }
       try{
          a$a.a(this, p0, p1, p2);
          if (p0 == null || p0.isEmpty()) {
             str = 1;
          label_0023 :
             if (str) {
                return;
             }else {
                p0 = p0.get("heightForLayout");
                if (p0 != null) {
                   int i = p0.intValue();
                   Integer integer = (p2 != null)? Integer.valueOf(p2.getHeight()): null;
                   if (i > 0 && (integer == null || i != integer.intValue())) {
                      if (p2 != null) {
                         p2.setHeight(i);
                      }
                      this.b.a();
                   }
                }
             }
          }else {
             str = null;
             goto label_0023 ;
          }
       }catch(java.lang.Exception e11){
          Throwable throwable = e11;
          f$a a = f.a;
          if (p2) {
             liveId = p2.getLiveId();
          }
          this = liveId;
          PendantUtil$Companion a1 = PendantUtil.a;
          long materialId = (p2)? p2.getMaterialId(): -1;
          f$a.s(a, this, a1.d(p1, materialId, 0), "MerchantLeftTopAreaMountDelegate mountInfoChange error", throwable, null, 16, null);
       }
       return;
    }
    public final Map d(){
       Object obj = PatchProxy.apply(null, this, MerchantLeftTopAreaMountDelegate.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.getValue();
    }
}
