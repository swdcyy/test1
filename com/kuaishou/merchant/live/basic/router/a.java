package com.kuaishou.merchant.live.basic.router.a;
import cb4.e;
import fq5.b;
import java.lang.Object;
import cb4.d;
import com.kuaishou.merchant.router.base.RouterRequest;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import android.net.Uri;
import com.kuaishou.merchant.log.biz.MerchantCommonLogBiz;
import p74.a;
import o74.a;
import mxb.j0;
import mxb.i0;
import lnc.o5;
import com.kwai.framework.model.feed.BaseFeed;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import c24.g;
import erd.g;
import c24.d;
import c24.e;
import c24.f;
import java.lang.Throwable;
import ekd.x0;

public class a implements e	// class@0018c0
{
    public final b a;

    public void a(b p0){
       super();
       this.a = p0;
    }
    public boolean a(){
       return d.a(this);
    }
    public boolean b(RouterRequest p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0 == null) {
          return true;
       }
       LiveStreamFeedWrapper liveStreamFe = this.a.r5();
       if (liveStreamFe != null && (liveStreamFe.mEntity == null || !liveStreamFe.isAd())) {
          a.s(MerchantCommonLogBiz.ROUTER, "LiveAdLoggerRouterHandler", "not ad live");
          return true;
       }else {
          try{
             Uri uri = p0.d();
             a.t(MerchantCommonLogBiz.ROUTER, "LiveAdLoggerRouterHandler", "report ad log ", "url", uri.toString());
             j0 oj0 = i0.a();
             oj0.e(o5.b(this.d(uri, "actionType"), 0), liveStreamFe.mEntity);
             String str = this.d(uri, "itemId");
             if (!TextUtils.x(str)) {
                oj0.d(new g(str));
             }
             int i = o5.b(this.d(uri, "jumpType"), 0);
             if (i > 0) {
                oj0.d(new d(i));
             }
             i = o5.b(this.d(uri, "impressionType"), 0);
             if (i > 0) {
                oj0.d(new e(i));
             }
             int i1 = o5.b(this.d(uri, "clickType"), 0);
             if (i1 > 0) {
                oj0.d(new f(i1));
             }
             oj0.a();
          }catch(java.lang.Exception e8){
             a.l(MerchantCommonLogBiz.ROUTER, "LiveAdLoggerRouterHandler", "report ad log error", e8);
          }
          return true;
       }
    }
    public final String d(Uri p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return x0.a(p0, p1);
    }
    public String getName(){
       return d.b(this);
    }
}
