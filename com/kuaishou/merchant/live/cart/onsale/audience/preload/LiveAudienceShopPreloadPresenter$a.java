package com.kuaishou.merchant.live.cart.onsale.audience.preload.LiveAudienceShopPreloadPresenter$a;
import la4.b;
import com.kuaishou.merchant.live.cart.onsale.audience.preload.LiveAudienceShopPreloadPresenter;
import java.lang.Object;
import java.lang.Exception;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.merchant.live.cart.onsale.logger.MerchantPluginLogBiz;
import p74.a;
import o74.a;
import com.kwai.dva.design.PluginInstallerUIHandler$d;
import vi5.h;
import android.os.Looper;
import android.os.MessageQueue;
import com.kuaishou.merchant.live.cart.onsale.audience.preload.f;
import android.os.MessageQueue$IdleHandler;
import la4.a;
import com.kwai.dva.design.PluginInstallerUIHandler$e;

public class LiveAudienceShopPreloadPresenter$a implements b	// class@00196c
{
    public final LiveAudienceShopPreloadPresenter b;
    public static final int c;

    public void LiveAudienceShopPreloadPresenter$a(LiveAudienceShopPreloadPresenter p0){
       this.b = p0;
       super();
    }
    public void a(Exception p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAudienceShopPreloadPresenter$a.class, "2")) {
          return;
       }
       a.s(MerchantPluginLogBiz.PLUGIN_TRANSACTION, "LiveAudienceShopPreloadPresenter", "Loading transaction plugin failed");
       return;
    }
    public void b(){
       h.h(this);
    }
    public void d(){
       if (PatchProxy.applyVoid(null, this, LiveAudienceShopPreloadPresenter$a.class, "1")) {
          return;
       }
       Looper.getMainLooper().getQueue().addIdleHandler(f.a);
       return;
    }
    public void e(){
       a.a(this);
    }
    public void f(boolean p0){
       h.d(this, p0);
    }
    public void n(PluginInstallerUIHandler$e p0){
       h.a(this, p0);
    }
    public void o(){
       h.b(this);
    }
    public void onStart(){
       a.c(this);
    }
    public void p(){
       h.c(this);
    }
}
