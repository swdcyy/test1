package com.kuaishou.merchant.live.floatingwindow.MerchantLiveFloatWindowPluginImpl;
import fs3.e;
import java.lang.Object;
import wp5.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import f64.a;
import java.lang.Integer;
import f64.a$b;
import java.util.Collection;
import com.kuaishou.merchant.live.floatingwindow.MerchantLiveFloatWindowPluginImpl$1;

public class MerchantLiveFloatWindowPluginImpl implements e	// class@001a1f
{

    public void MerchantLiveFloatWindowPluginImpl(){
       super();
    }
    public c i0(){
       Object obj = PatchProxy.apply(null, this, MerchantLiveFloatWindowPluginImpl.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.n(0);
    }
    public boolean isAvailable(){
       return true;
    }
    public final a n(int p0){
       a obj;
       MerchantLiveFloatWindowPluginImpl merchantLive = MerchantLiveFloatWindowPluginImpl.class;
       if (PatchProxy.isSupport(merchantLive)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, merchantLive, "4");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = a$b.a;
       obj.a = p0;
       return obj;
    }
    public Collection p(){
       Object obj = PatchProxy.apply(null, this, MerchantLiveFloatWindowPluginImpl.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new MerchantLiveFloatWindowPluginImpl$1(this);
    }
    public c rh(int p0){
       MerchantLiveFloatWindowPluginImpl merchantLive = MerchantLiveFloatWindowPluginImpl.class;
       if (PatchProxy.isSupport(merchantLive)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, merchantLive, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.n(p0);
    }
}
