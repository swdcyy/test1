package y66.b;
import e0d.d$a;
import java.lang.Object;
import p0d.h;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.image.network.ImageHttpStatistics;
import android.net.Uri;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import lnc.d0;
import android.text.TextUtils;
import java.lang.Integer;
import java.util.Map;
import com.yxcorp.image.network.NetworkRequestInfo;
import k2b.g;
import com.kwai.framework.imagebase.reporters.CdnResourceExtraMessage;
import com.yxcorp.image.callercontext.a;
import java.lang.Enum;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$UrlPackage;
import k2b.u1;
import fg6.a;
import com.google.gson.Gson;
import kotlin.jvm.internal.a;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$CdnResourceLoadStatEvent;
import com.google.gson.JsonObject;
import java.lang.StringBuilder;
import com.google.gson.JsonElement;
import com.yxcorp.utility.Log;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$StatPackage;
import wkd.b;
import com.yxcorp.gifshow.log.h;

public final class b implements d$a	// class@002844
{

    public void b(){
       super();
    }
    public void a(h p0){
       int b;
       String str;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       ImageHttpStatistics mRequestInfo = p0.b().mRequestInfo;
       if (mRequestInfo != null) {
          b = p0.f();
          Uri uri = p0.d();
          Object[] objArray = null;
          String host = (uri != null)? uri.getHost(): objArray;
          int i = 1;
          if (b && !TextUtils.x(host)) {
             d0 uod0 = d0.class;
             _monitor_enter(uod0);
             if (!TextUtils.isEmpty(host)) {
                d0.a.put(host, Integer.valueOf((d0.b(host) + i)));
             }
             _monitor_exit(uod0);
          }
          NetworkRequestInfo mErrorMessag = mRequestInfo.mErrorMessage;
          host = p0.a();
          h oh = (host == null || !host.length())? 1: null;
          if (!oh) {
             mErrorMessag = p0.a();
          }
          NetworkRequestInfo networkReque = mErrorMessag;
          g og = new g();
          og.m(p0.c());
          og.n(i);
          b = (p0.f())? 1: 2;
          try{
             og.j(b);
             og.b((long)p0.b().mByteSize);
             og.d((long)p0.b().mByteSize);
             og.q((long)p0.b().mByteSize);
             og.h(TextUtils.k(mRequestInfo.mRemoteIp));
             og.r(p0.e());
             str = "";
             host = PatchProxy.apply(objArray, p0, h.class, "6");
             if (host != patchProxyRe) {
             }else {
                uri = Uri.parse(p0.e());
                if (uri != null) {
                   host = uri.getHost();
                   if (host != null) {
                      str = host;
                   }
                }
                host = str;
             }
          }catch(java.lang.Exception e0){
          }
          og.f(host);
          b = (p0.h != null)? 1: 3;
          og.k(b);
          og.l(p0.b().getFetchTime());
          h b1 = p0.b;
          h a = p0.a;
          long l = (b1 - a > 0)? b1 - a: 0;
          og.p(l);
          og.y = mRequestInfo.mDnsCost;
          og.z = mRequestInfo.mConnectCost;
          og.A = mRequestInfo.mRequestCost;
          og.B = mRequestInfo.mWaitingResponseCost;
          og.C = mRequestInfo.mResponseCost;
          str = PatchProxy.applyThreeRefs(p0, mRequestInfo, networkReque, this, b.class, "2");
          if (str != patchProxyRe) {
          }else {
             CdnResourceExtraMessage uCdnResource1 = new CdnResourceExtraMessage();
             b1 = p0.i;
             if (b1 != null) {
                a a1 = b1.a;
                if (a1 != null) {
                   objArray = a1.toString();
                }
                uCdnResource1.mImageSource = objArray;
                uCdnResource1.mBizFt = b1.b;
                uCdnResource1.mBizExrta = b1.a();
             }
             uCdnResource1.mIsAnimated = p0.f;
             ClientEvent$UrlPackage urlPackage = u1.k();
             if (urlPackage != null) {
                urlPackage = urlPackage.page2;
                if (urlPackage != null) {
                label_014e :
                   uCdnResource1.mSubmitPage = urlPackage;
                   uCdnResource1.mCdnCache = p0.b().mCdnCache;
                   uCdnResource1.mHttpCode = mRequestInfo.mHttpCode;
                   uCdnResource1.mRequestId = mRequestInfo.mRequestId;
                   uCdnResource1.mProtocol = mRequestInfo.mProtocol;
                   uCdnResource1.mErrorMsg = networkReque;
                   str = a.a.q(uCdnResource1);
                   a.o(str, "Gsons.KWAI_GSON.toJson\(extraMessage\)");
                }
             }
             str = "getCurrent_Failed";
             goto label_014e ;
          }
          og.e(str);
          og.d = mRequestInfo.mQueueCost;
          ClientStat$CdnResourceLoadStatEvent uCdnResource = og.a();
          try{
             JsonObject jsonObject = new JsonObject();
             JsonObject jsonObject1 = new JsonObject();
             NetworkRequestInfo mContentType = mRequestInfo.mContentType;
             mContentType = (mContentType == null || !mContentType.length())? 1: null;
             if (mContentType) {
                mContentType = mRequestInfo.mContentSubType;
                if (mContentType != null && mContentType.length()) {
                   i = 0;
                }
                if (i) {
                label_01c1 :
                   if (jsonObject1.size() > 0) {
                      jsonObject.G("response", jsonObject1);
                   }
                   uCdnResource.cdnQosJson = jsonObject.toString();
                }
             }
             jsonObject1.c0("content_type", mRequestInfo.mContentType+"/"+mRequestInfo.mContentSubType);
             goto label_01c1 ;
          }catch(java.lang.Exception e0){
             Log.d("KwaiImageCdnResourceLoadStatEventReporter", "construct cdnQos json string failed on error "+e0);
          }
          ClientStat$StatPackage statPackage = new ClientStat$StatPackage();
          statPackage.cdnResourceLoadStatEvent = uCdnResource;
          b.a(0x4b316083).j(statPackage);
       }
       return;
    }
}
