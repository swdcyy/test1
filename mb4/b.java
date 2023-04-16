package mb4.b;
import cb4.e;
import java.lang.Object;
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
import com.kuaishou.merchant.router.RouterConfig;
import android.app.Activity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kuaishou.merchant.api.router.FragmentConfig;
import androidx.fragment.app.c;
import mb4.a;
import z1.a;
import android.content.Context;
import us3.i;
import ekd.x0;
import xkd.b;
import tkd.b;
import tkd.d;
import vs3.a;
import com.kuaishou.merchant.router.b;
import android.os.Bundle;
import lb4.c;
import wkd.b;
import nf6.i;
import android.content.Intent;

public abstract class b implements e	// class@003454
{

    public void b(){
       super();
    }
    public boolean a(){
       return d.a(this);
    }
    public boolean b(RouterRequest p0){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       b uob = b.class;
       MerchantCommonLogBiz obj = PatchProxy.applyOneRefs(p0, this, uob, "1");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = MerchantCommonLogBiz.ROUTER;
       String str = "BaseDefaultRouterHandler";
       a.s(obj, str, "onHandle");
       this.d();
       String str1 = this.e(p0.d().toString());
       RouterConfig routerConfig = p0.c();
       Activity uActivity = p0.a();
       b = true;
       if (uActivity instanceof GifshowActivity) {
          if (routerConfig == null) {
             routerConfig = new RouterConfig();
          }
          if (routerConfig.b().d() == null) {
             routerConfig.h(new a(uActivity));
          }
          if (routerConfig.f(uActivity, str1).c()) {
             a.s(obj, str, "router default inner page opened!");
             return b;
          }
       }
       Uri uri = x0.f(str1);
       if (b.f(uri)) {
          d.a(0x7074b578).RP(uActivity, str1);
          return b;
       }else if(PatchProxy.isSupport(uob)){
          Intent obj1 = PatchProxy.applyThreeRefs(uActivity, uri, Boolean.FALSE, null, b.class, "2");
          if (obj1 != patchProxyRe) {
             b = obj1.booleanValue();
          }else {
          label_0095 :
             b uob1 = null;
             if (b.f().c != null) {
                uob1 = b.f().c.a(uri.toString());
             }
             obj1 = b.a(0x66dce92a).c(uActivity, uri, false, false);
             if (obj1 != null) {
                if (uob1 != null) {
                   obj1.putExtras(uob1);
                }
                uActivity.startActivity(obj1);
             }else {
                b = false;
             }
          }
       }else {
          goto label_0095 ;
       }
       return b;
    }
    public void d(){
    }
    public String e(String p0){
       return p0;
    }
    public String getName(){
       return d.b(this);
    }
}
