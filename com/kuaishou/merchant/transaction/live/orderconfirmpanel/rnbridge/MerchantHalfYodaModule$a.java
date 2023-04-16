package com.kuaishou.merchant.transaction.live.orderconfirmpanel.rnbridge.MerchantHalfYodaModule$a;
import java.lang.Runnable;
import com.kuaishou.merchant.transaction.live.orderconfirmpanel.rnbridge.MerchantHalfYodaModule;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import tkd.b;
import tkd.d;
import vs3.a;
import android.app.Activity;
import android.content.Intent;
import com.kwai.sdk.switchconfig.a;
import com.yxcorp.utility.n;
import android.content.Context;

public class MerchantHalfYodaModule$a implements Runnable	// class@00084b
{
    public final GifshowActivity b;
    public final String c;
    public final MerchantHalfYodaModule d;

    public void MerchantHalfYodaModule$a(MerchantHalfYodaModule p0,GifshowActivity p1,String p2){
       this.d = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public void run(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, MerchantHalfYodaModule$a.class, "1")) {
          return;
       }
       Intent intent = d.a(0x7074b578).SL(this.b, this.c, objArray, "");
       intent.putExtra("isHalf", a.t().d("EnableHalfYoda", true));
       intent.putExtra("absoluteHeight", (int)((double)n.j(this.b) * 0x3fe75c28f5c28f5c));
       intent.putExtra("KEY_ADJUST_PAGE_SPAN_WHEN_SHOW_SOFT", true);
       intent.putExtra("KEY_BOTTOM_MARGIN_WHEN_SOFT", ((n.j(this.b) - intent.getIntExtra("absoluteHeight", 0)) - n.A(this.b)));
       d.a(0x7074b578).ZB(intent, this.b);
       return;
    }
}
