package com.kuaishou.live.audience.course.m;
import io.reactivex.g;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gateway.pay.params.GatewayPayInputParams;
import java.lang.Object;
import brd.v;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gateway.pay.api.PayManager;
import com.kuaishou.live.audience.course.m$a;
import android.app.Activity;
import com.yxcorp.gateway.pay.api.PayCallback;

public class m implements g	// class@000c0a
{
    public final GifshowActivity b;
    public final GatewayPayInputParams c;

    public void m(GifshowActivity p0,GatewayPayInputParams p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void subscribe(v p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, m.class, "1")) {
          return;
       }
       PayManager.getInstance().startPay(this.b, this.c, new m$a(this, p0));
       return;
    }
}
