package com.kuaishou.merchant.krn.homeswitch.MerchantHomeSwitchModule;
import com.kuaishou.krn.base.KrnBridge;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.Promise;
import yr3.e;
import java.lang.Class;
import yr3.a;
import yr3.f;
import android.app.Activity;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.lang.Throwable;
import java.util.Map;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.HashMap;
import vd.d;
import java.lang.Integer;
import com.yxcorp.gifshow.util.LoadPolicy;
import brd.a0;
import q04.a;
import com.kuaishou.merchant.krn.homeswitch.a;
import erd.g;
import crd.b;

public class MerchantHomeSwitchModule extends KrnBridge	// class@001864
{

    public void MerchantHomeSwitchModule(ReactApplicationContext p0){
       super(p0);
    }
    public static void a(MerchantHomeSwitchModule p0,int p1,Promise p2,e p3){
       p0.lambda$switchHome$0(p1, p2, p3);
    }
    private void lambda$switchHome$0(int p0,Promise p1,e p2){
       if (f.r(e.class).XE(this.getCurrentActivity(), p0)) {
          p1.resolve(Boolean.TRUE);
       }else {
          p1.reject("0", "current activity is not MerchantHomeActivity!");
       }
       return;
    }
    public static void lambda$switchHome$1(Throwable p0){
    }
    public Map getConstants(){
       HashMap obj = PatchProxy.apply(null, this, MerchantHomeSwitchModule.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = d.b();
       obj.put("BUYER", Integer.valueOf(1));
       obj.put("SELLER", Integer.valueOf(2));
       return obj;
    }
    public String getName(){
       return "KSMerchantHomeSwitch";
    }
    public void switchHome(int p0,Promise p1){
       MerchantHomeSwitchModule merchantHome = MerchantHomeSwitchModule.class;
       if (PatchProxy.isSupport(merchantHome) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, merchantHome, "2")) {
          return;
       }
       f.s(e.class, LoadPolicy.DIALOG).R(new a(this, p0, p1), a.b);
       return;
    }
}
