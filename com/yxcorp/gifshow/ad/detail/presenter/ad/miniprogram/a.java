package com.yxcorp.gifshow.ad.detail.presenter.ad.miniprogram.a;
import agc.e;
import java.lang.Object;
import java.lang.String;
import android.net.Uri;
import java.util.Map;
import agc.d;
import android.app.Activity;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import o56.a;
import android.content.Context;
import com.yxcorp.utility.SystemUtil;
import com.tencent.mm.opensdk.openapi.IWXAPI;
import com.tencent.mm.opensdk.openapi.WXAPIFactory;
import com.yxcorp.gifshow.entity.QPhoto;
import fg6.a;
import com.yxcorp.gifshow.ad.detail.presenter.ad.miniprogram.WeChatMiniProgramInfo;
import com.google.gson.Gson;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.yxcorp.gifshow.ad.report.ResultMessage;
import o49.m;
import lnc.y0;
import yz8.d;
import org.json.JSONObject;
import u07.t$a;
import yz8.a;
import u07.u;
import yz8.b;
import java.lang.Runnable;
import u07.f;
import com.kwai.library.widget.popup.common.PopupInterface;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kwai.library.widget.popup.common.c;
import com.kwai.library.widget.popup.common.c$b;
import com.tencent.mm.opensdk.modelbiz.WXLaunchMiniProgram$Req;
import com.tencent.mm.opensdk.modelbase.BaseReq;
import java.lang.Integer;
import mxb.j0;
import mxb.i0;
import com.kwai.framework.model.feed.BaseFeed;
import yz8.c;
import com.yxcorp.gifshow.photoad.model.AdDataWrapper$AdLogParamAppender;
import com.kwai.robust.PatchProxyResult;
import android.app.Application;

public class a implements e	// class@0015db
{

    public void a(){
       super();
    }
    public String a(){
       return "ad";
    }
    public boolean b(Uri p0,Map p1){
       return d.b(this, p0, p1);
    }
    public String c(){
       return "kwai";
    }
    public void d(Activity p0,Map p1,Map p2){
       Gson gson;
       Map map = p1;
       Map map1 = p2;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, a.class, "3")) {
          return;
       }
       Application b = a.B;
       IWXAPI iWXAPI = WXAPIFactory.createWXAPI(b, SystemUtil.p(b, "WECHAT_APP_ID"), true);
       boolean b1 = iWXAPI.isWXAppInstalled();
       Object obj = map.get("params");
       if (map1) {
          String str = "QPhoto";
          if (map1.get(str) != null) {
             gson = map1.get(str);
          label_0043 :
             QPhoto qPhoto = gson;
             try{
                Object obj1 = a.a.h(obj, WeChatMiniProgramInfo.class);
                if (TextUtils.isEmpty(obj1.mOriginalID)) {
                   m.a(qPhoto, b1, ResultMessage.INVALID_ORIGINAL_ID, "", obj, "deeplink");
                   return;
                }else {
                   Object obj2 = map.get("alertInfo");
                   if (!y0.o(p0) && (b1 && !TextUtils.isEmpty(obj2))) {
                      d uod = new d(this, iWXAPI, qPhoto, obj, obj1);
                      if (!PatchProxy.applyVoidFourRefs(obj2, p0, qPhoto, b1, this, a.class, "4")) {
                         try{
                            JSONObject jSONObject = new JSONObject(obj2);
                            String str1 = jSONObject.optString("title");
                            String str2 = jSONObject.optString("negative");
                            t$a uoa = new t$a(p0);
                            uoa.z0(str1);
                            uoa.R0(str2);
                            uoa.T0(jSONObject.optString("positive"));
                            uoa.t0(new a(this, qPhoto));
                            uoa.u0(new b(this, b1, qPhoto));
                            f.e(uoa).Y(PopupInterface.a);
                            this.f(140, 191, qPhoto);
                         }catch(java.lang.Exception e0){
                            b1.run();
                         }
                      }
                   }else {
                      this.e(iWXAPI, qPhoto, obj, obj1);
                   }
                }
             }catch(java.lang.Exception e0){
                m.a(qPhoto, b1, ResultMessage.INVALID_PARAMS_STRING, "", obj, "deeplink");
                return;
             }
          }
       }
       gson = null;
       goto label_0043 ;
    }
    public final void e(IWXAPI p0,QPhoto p1,String p2,WeChatMiniProgramInfo p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, a.class, "5")) {
          return;
       }
       WXLaunchMiniProgram$Req req = new WXLaunchMiniProgram$Req();
       req.userName = p3.mOriginalID;
       req.path = p3.mPath;
       req.miniprogramType = p3.mType;
       req.extData = p3.mExtData;
       if (p0.sendReq(req)) {
          m.b(p1, p3.mOriginalID, p2, "deeplink");
       }else {
          m.a(p1, p0.isWXAppInstalled(), ResultMessage.FAILED_TO_OPEN_WECHAT, p3.mOriginalID, p2, "deeplink");
       }
       return;
    }
    public final void f(int p0,int p1,QPhoto p2){
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, this, a.class, "6")) {
          return;
       }
       if (p2 != null && p2.isAd()) {
          i0.a().e(p0, p2.mEntity).f(new c(p1)).a();
       }
       return;
    }
    public String getPath(){
       String obj = PatchProxy.apply(null, this, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = (SystemUtil.M(a.b(), "com.tencent.mm"))? "/openwechatminiprogram": "/notopenwechatminiprogram";
       return obj;
    }
}
