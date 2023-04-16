package com.yxcorp.gifshow.ad.webview.jsbridge.d;
import erd.g;
import android.app.Activity;
import com.yxcorp.gifshow.commercial.bridge.model.NeoTaskLiveParam;
import f55.g;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.String;
import yx.j0;
import tkd.b;
import tkd.d;
import nl9.e0;
import com.yxcorp.gifshow.activity.GifshowActivity;
import brd.a0;
import o59.r;
import o59.c;
import crd.b;
import android.os.Bundle;

public final class d implements g	// class@0018cd
{
    public final Activity b;
    public final NeoTaskLiveParam c;
    public final g d;

    public void d(Activity p0,NeoTaskLiveParam p1,g p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void accept(Object p0){
       d tb = this.b;
       d tc = this.c;
       d td = this.d;
       int i = 0;
       if (p0.booleanValue()) {
          p0 = new Object[i];
          j0.f("AdvertiseBridgeModule", "neo live install success", p0);
          d.a(-489866664).Fj(tb, tc).R(new r(td), new c(td));
       }else {
          td.a(412, "plugin install failed", null);
          p0 = new Object[i];
          j0.c("AdvertiseBridgeModule", "neo live plugin install failed", p0);
       }
       return;
    }
}
