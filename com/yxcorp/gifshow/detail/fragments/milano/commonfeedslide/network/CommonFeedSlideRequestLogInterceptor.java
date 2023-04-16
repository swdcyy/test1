package com.yxcorp.gifshow.detail.fragments.milano.commonfeedslide.network.CommonFeedSlideRequestLogInterceptor;
import okhttp3.Interceptor;
import java.lang.Object;
import o0a.b;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.HashMap;
import com.kwai.sdk.switchconfig.a;
import java.lang.reflect.Type;
import okhttp3.Interceptor$Chain;
import okhttp3.Response;
import okhttp3.Request;
import o0a.a;
import com.google.common.base.Optional;
import uw9.o;
import java.lang.StringBuilder;
import q87.c;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import okhttp3.HttpUrl;
import okhttp3.Request$Builder;

public class CommonFeedSlideRequestLogInterceptor implements Interceptor	// class@001511
{
    public final HashMap a;

    public void CommonFeedSlideRequestLogInterceptor(){
       super();
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       b uob = b.class;
       Object[] objArray = null;
       HashMap hashMap = PatchProxy.apply(objArray, objArray, uob, "1");
       if (hashMap != patchProxyRe) {
       }else {
          hashMap = a.t().getValue("commonFeedSlideHostInfo", b.a, objArray);
          if (hashMap == null) {
             Object obj = PatchProxy.apply(objArray, objArray, uob, "2");
             if (obj != patchProxyRe) {
                hashMap = obj;
             }else {
                HashMap hashMap1 = new HashMap();
                hashMap1.put("orion", "orion.kuaishou.com");
                hashMap1.put("yule-activity", "yule.m.kuaishou.com");
                hashMap1.put("special", "special.m.kuaishou.com");
                hashMap1.put("2021yearendceremony", "activity.m.kuaishou.com");
                hashMap1.put("ug_activity", "ug.viviv.com");
                hashMap1.put("wog2022", "sf2022-api.gifshow.com");
                hashMap = hashMap1;
             }
          }
       }
       this.a = hashMap;
       return;
    }
    public Response intercept(Interceptor$Chain p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       CommonFeedSlideRequestLogInterceptor uCommonFeedS = CommonFeedSlideRequestLogInterceptor.class;
       Request obj = PatchProxy.applyOneRefs(p0, this, uCommonFeedS, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       try{
          obj = p0.request();
          a a = Optional.fromNullable(obj.tag(a.class)).or(new a(null)).a;
          Object[] objArray = new Object[0];
          o.C().w("CommonFeedSlideLog", "0.intercept: "+a, objArray);
          if (!TextUtils.x(a) && this.a.containsKey(a)) {
             String obj1 = PatchProxy.applyTwoRefs(obj, a, this, uCommonFeedS, "2");
             if (obj1 != patchProxyRe) {
                obj = obj1;
             }else {
                String str = obj.url().toString();
                obj1 = obj.url().host();
                String str1 = this.a.get(a);
                objArray = new Object[0];
                o.C().w("CommonFeedSlideLog", "1.replaceHost \n==> host is :"+str1+"\n==> originHost is:"+obj1, objArray);
                if (!TextUtils.x(str1) && !TextUtils.x(obj1)) {
                   if (!str1.equals(obj1)) {
                      str = str.replace(obj1, str1);
                   }
                   Object[] objArray1 = new Object[0];
                   o.C().w("CommonFeedSlideLog", "2.replaceHost:final \n==> "+obj.url().toString()+"\n==> "+str, objArray1);
                   obj = obj.newBuilder().url(str).build();
                }
             }
          }
          return p0.proceed(obj);
       }catch(java.lang.Exception e0){
       }
    }
}
