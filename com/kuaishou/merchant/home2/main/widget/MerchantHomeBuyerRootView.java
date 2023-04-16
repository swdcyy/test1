package com.kuaishou.merchant.home2.main.widget.MerchantHomeBuyerRootView;
import android.widget.FrameLayout;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import android.os.Trace;
import com.kwai.sdk.switchconfig.a;
import java.lang.IllegalArgumentException;
import com.kwai.robust.PatchProxyResult;
import androidx.fragment.app.FragmentActivity;
import android.content.ContextWrapper;
import b04.a;
import b04.d;
import com.kuaishou.merchant.home2.basic.model.HomePage;
import java.lang.reflect.Type;
import zw3.b;
import com.kuaishou.merchant.home2.feed.model.FeedPage;
import java.lang.StringBuilder;
import km8.b;
import android.content.SharedPreferences;
import com.kuaishou.merchant.home.basic.log.MerchantHomeLogBiz;
import yz7.e;
import o74.a;
import java.util.Map;
import com.facebook.common.internal.ImmutableMap;
import p74.a;
import java.lang.Throwable;
import android.app.Activity;

public class MerchantHomeBuyerRootView extends FrameLayout	// class@00181b
{

    public void MerchantHomeBuyerRootView(Context p0){
       super(p0);
    }
    public void MerchantHomeBuyerRootView(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       Object obj = this;
       if (PatchProxy.isSupport(MerchantHomeBuyerRootView.class)) {
          Object[] objArray = new Object[]{Boolean.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, obj, MerchantHomeBuyerRootView.class, "2")) {
             return;
          }
       }
       Trace.beginSection("MerchantHomeBuyerRootView_onLayout");
       a.t().d("AnotherWayForMerchantHomeCache", 0);
       try{
          super.onLayout(p0, p1, p2, p3, p4);
          Trace.endSection();
          return;
       }catch(java.lang.IllegalArgumentException e0){
          IllegalArgumentException illegalArgum = e0;
          if (v8 && (illegalArgum.getMessage() != null && (illegalArgum.getMessage()).startsWith("Scrapped or attached views may not be recycled"))) {
             Context context = this.getContext();
             Context uContext = PatchProxy.applyOneRefs(context, obj, MerchantHomeBuyerRootView.class, "3");
             if (uContext != PatchProxyResult.class) {
             }else if(context instanceof ContextWrapper){
                if (context instanceof FragmentActivity) {
                   uContext = context;
                }else {
                   context = context.getBaseContext();
                   goto label_007a ;
                }
             }else {
                uContext = null;
             }
             if (uContext != null) {
                a uoa = a.r0(uContext);
                d uod = d.J0(uContext);
                HomePage homePage = b.a(HomePage.class);
                FeedPage uFeedPage = FeedPage.class;
                String str = b.a.getString(b.d("user")+"merchant_home_feed_cache", "null");
                FeedPage uFeedPage1 = (str == null || str == "")? null: b.a(str, uFeedPage);
                MerchantHomeLogBiz feed = MerchantHomeLogBiz.Feed;
                String str1 = e.f(uod.x0());
                String str2 = e.f(homePage);
                String str3 = e.f(uoa.g);
                str = e.f(uFeedPage1);
                if (PatchProxy.isSupport(a.class)) {
                   Object[] objArray1 = new Object[12];
                   objArray1[v7] = feed;
                   objArray1[v5] = "MerchantHomeBuyerRootView";
                   objArray1[v4] = "Scrapped or attached views may not be recycled";
                   objArray1[v3] = illegalArgum;
                   objArray1[4] = "homePage";
                   objArray1[5] = str1;
                   objArray1[6] = "homePageCache";
                   objArray1[7] = str2;
                   objArray1[8] = "feedPage";
                   objArray1[9] = str3;
                   objArray1[10] = "feedPageCache";
                   objArray1[11] = str;
                   if (PatchProxy.applyVoid(objArray1, null, a.class, "27")) {
                   label_0141 :
                      uContext.finish();
                      return;
                   }
                }
                a.o(feed, "MerchantHomeBuyerRootView", "Scrapped or attached views may not be recycled", illegalArgum, ImmutableMap.of("homePage", a.q(str1), "homePageCache", a.q(str2), "feedPage", a.q(str3), "feedPageCache", a.q(str)));
                goto label_0141 ;
             }
          }
       label_0145 :
          throw illegalArgum;
       }
    }
    public void onMeasure(int p0,int p1){
       if (PatchProxy.isSupport(MerchantHomeBuyerRootView.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, MerchantHomeBuyerRootView.class, "1")) {
          return;
       }
       Trace.beginSection("MerchantHomeBuyerRootView_onMeasure");
       super.onMeasure(p0, p1);
       Trace.endSection();
       return;
    }
}
