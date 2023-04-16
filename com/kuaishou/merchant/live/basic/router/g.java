package com.kuaishou.merchant.live.basic.router.g;
import cb4.e;
import android.content.Context;
import com.kuaishou.merchant.api.core.LiveMerchantBaseContext;
import java.lang.Object;
import ks3.t;
import cb4.d;
import com.kuaishou.merchant.router.base.RouterRequest;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.kuaishou.merchant.log.biz.MerchantCommonLogBiz;
import p74.a;
import o74.a;
import android.net.Uri;
import com.kuaishou.merchant.router.b;
import com.yxcorp.gifshow.activity.GifshowActivity;
import androidx.fragment.app.c;
import androidx.fragment.app.FragmentActivity;
import com.kuaishou.merchant.basic.util.f;
import java.lang.StringBuilder;
import com.kuaishou.merchant.router.RouterConfig;
import com.kuaishou.merchant.api.router.FragmentConfig;
import c24.y;
import z1.a;
import c24.z;
import us3.i;
import android.app.Activity;
import com.kwai.framework.model.feed.BaseFeed;

public class g implements e	// class@0018c7
{
    public final Context a;
    public t b;
    public LiveMerchantBaseContext c;

    public void g(Context p0,LiveMerchantBaseContext p1){
       super();
       this.c = p1;
       this.a = p0;
    }
    public void g(Context p0,t p1){
       super();
       this.b = p1;
       this.a = p0;
    }
    public boolean a(){
       return d.a(this);
    }
    public boolean b(RouterRequest p0){
       boolean b;
       boolean b1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       g og = g.class;
       MerchantCommonLogBiz obj = PatchProxy.applyOneRefs(p0, this, og, "1");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = MerchantCommonLogBiz.ROUTER;
       a.s(obj, "LiveMerchantInnerPageHandler", "onHandle");
       g tb = this.b;
       LiveMerchantBaseContext liveMerchant = (tb == null)? null: tb.a();
       if (liveMerchant == null) {
          liveMerchant = this.c;
       }
       String str = b.j(p0.d());
       g ta = this.a;
       c supportFragm = (ta instanceof GifshowActivity)? ta.getSupportFragmentManager(): null;
       String str1 = f.o(p0.d().toString(), liveMerchant);
       a.s(obj, "LiveMerchantInnerPageHandler", "open inner page, original: "+p0.d().toString()+", real: "+str1);
       RouterConfig routerConfig = p0.c();
       if (routerConfig == null) {
          routerConfig = new RouterConfig();
       }
       if (routerConfig.b().d() == null) {
          routerConfig.h(new y(supportFragm));
       }
       routerConfig.g(new z(liveMerchant));
       b = true;
       if (!routerConfig.f(this.a, str1).c()) {
          routerConfig = PatchProxy.applyOneRefs(str, this, og, "2");
          if (routerConfig != patchProxyRe) {
             b1 = routerConfig.booleanValue();
          }else if(!("kwai://merchant/selfdetail").equals(str) && (("kwai://merchant/halfselfdetail").equals(str) || ("kwai://merchant/detailv2").equals(str))){
             b = 0;
          }
       label_00ce :
          b1 = b;
          if (b1) {
             str1 = f.p(str1, liveMerchant);
          }
          return f.i(this.a, null, str1, liveMerchant.getLiveFeed(), false);
       }else {
          return b;
       }
    }
    public String getName(){
       return "LiveMerchantInnerPageHandler";
    }
}
