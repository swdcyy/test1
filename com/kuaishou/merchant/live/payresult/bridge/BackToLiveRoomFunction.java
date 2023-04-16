package com.kuaishou.merchant.live.payresult.bridge.BackToLiveRoomFunction;
import com.kwai.yoda.function.c;
import com.kwai.yoda.bridge.YodaBaseWebView;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Object;
import com.kuaishou.merchant.live.payresult.bridge.BackToLiveRoomFunction$JsBackToLiveRoomParam;
import u64.a;
import erd.g;
import brd.t;
import crd.b;

public class BackToLiveRoomFunction extends c	// class@001aa9
{
    public static final int f;

    public void BackToLiveRoomFunction(){
       super();
    }
    public void a(YodaBaseWebView p0,String p1,String p2,String p3,String p4){
       BackToLiveRoomFunction uBackToLiveR = BackToLiveRoomFunction.class;
       if (PatchProxy.isSupport(uBackToLiveR)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4};
          if (PatchProxy.applyVoid(objArray, this, uBackToLiveR, "2")) {
             return;
          }
       }
       a uoa = new a(this, p0, p1, p2, p4);
       this.r(p0, p1, p2, p4, this.q(p0, p3, BackToLiveRoomFunction$JsBackToLiveRoomParam.class, v7));
       return;
    }
}
