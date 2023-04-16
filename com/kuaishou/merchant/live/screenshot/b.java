package com.kuaishou.merchant.live.screenshot.b;
import java.lang.Object;
import com.kuaishou.merchant.live.screenshot.LiveMerchantScreenShotPageEventManager;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.System;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$UrlPackage;
import k2b.u1;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import java.lang.CharSequence;
import android.text.TextUtils;
import lnc.i3;
import q2b.h$b;
import k2b.e0;
import com.yxcorp.gifshow.activity.GifshowActivity;
import androidx.lifecycle.Lifecycle$Event;
import z1.k;
import j74.c;
import z1.a;
import j74.d;

public class b	// class@001ad3
{
    public LiveMerchantScreenShotPageEventManager a;
    public a b;
    public static long c;

    public void b(){
       super();
       this.a = new LiveMerchantScreenShotPageEventManager();
    }
    public void a(int p0,ClientContent$LiveStreamPackage p1,String p2){
       if (PatchProxy.isSupport(b.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, p2, this, b.class, "8")) {
          return;
       }
       this.b(p0, "", null, p2);
       return;
    }
    public void b(int p0,String p1,ClientContent$LiveStreamPackage p2,String p3){
       if (PatchProxy.isSupport(b.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), p1, null, p3, this, b.class, "9")) {
          return;
       }
       if ((System.currentTimeMillis() - b.c) - 1000 <= 0) {
          b.c = System.currentTimeMillis();
          return;
       }else {
          b.c = System.currentTimeMillis();
          ClientEvent$UrlPackage urlPackage = u1.k();
          if (urlPackage == null) {
             urlPackage = new ClientEvent$UrlPackage();
          }
          urlPackage.page = p0;
          urlPackage.page2 = p1;
          ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "SCREENSHOT";
          if (!TextUtils.isEmpty(p3)) {
             i3 oi3 = i3.f();
             oi3.d("url_page", p3);
             uElementPack.params = oi3.e();
          }
          h$b uob = h$b.e(7, "SCREENSHOT");
          uob.k(uElementPack);
          uob.h(uContentPack);
          uob.u(urlPackage);
          u1.p0("", null, uob);
          return;
       }
    }
    public void c(GifshowActivity p0,Lifecycle$Event p1,int p2,k p3){
       if (PatchProxy.isSupport(b.class) && PatchProxy.applyVoidFourRefs(p0, p1, Integer.valueOf(p2), p3, this, b.class, "2")) {
          return;
       }
       this.a.b(p0, p1, new c(this, p0, p2, p3));
       return;
    }
    public void d(GifshowActivity p0,Lifecycle$Event p1,String p2,k p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, b.class, "3")) {
          return;
       }
       this.a.b(p0, p1, new d(this, p0, p2, p3));
       return;
    }
    public void e(){
       if (PatchProxy.applyVoid(null, this, b.class, "4")) {
          return;
       }
       this.a.c();
       return;
    }
}
