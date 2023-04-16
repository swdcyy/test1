package jv8.d;
import jv8.b;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gateway.pay.api.PayManager;
import android.content.Context;
import lv8.c;
import android.widget.Toast;
import lv8.g;
import android.net.Uri;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.tencent.mm.opensdk.openapi.IWXAPI;
import com.tencent.mm.opensdk.openapi.WXAPIFactory;
import com.tencent.mm.opensdk.modelbiz.OpenWebview$Req;
import com.tencent.mm.opensdk.modelbase.BaseReq;
import java.lang.StringBuilder;
import lv8.d;
import jv8.d$a;
import java.lang.reflect.Type;
import el.a;
import com.google.gson.Gson;
import java.util.HashMap;
import java.util.Map;
import ekd.q;
import com.tencent.mm.opensdk.modelbiz.WXOpenBusinessWebview$Req;
import jv8.d$b;
import java.lang.Throwable;
import nv8.b;
import com.tencent.mm.opensdk.modelbiz.WXOpenBusinessView$Req;

public final class d implements b	// class@0029b6
{

    public void d(){
       super();
    }
    public void a(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "1")) {
          return;
       }
       String str = "FAIL";
       if (!c.g(PayManager.getInstance().getContext(), "com.tencent.mm")) {
          Toast.makeText(PayManager.getInstance().getContext(), R.string.arg_RES_7f103bb4, 1).show();
          g.d("wechat contract failed, wechat not installed");
          g.j("GATEWAY_CONTRACT", str, g.l("wechat", p0, null));
          return;
       }else {
          String queryParamet = Uri.parse(p0).getQueryParameter("appid");
          if (TextUtils.isEmpty(queryParamet)) {
             g.j("GATEWAY_CONTRACT", str, g.l("wechat", p0, null));
             return;
          }else {
             IWXAPI iWXAPI = WXAPIFactory.createWXAPI(PayManager.getInstance().getContext(), null);
             iWXAPI.registerApp(queryParamet);
             OpenWebview$Req req = new OpenWebview$Req();
             req.url = p0;
             iWXAPI.sendReq(req);
             g.d("wechat contract start, providerConfig="+p0);
             g.j("GATEWAY_CONTRACT", "FINISH", g.l("wechat", p0, null));
             return;
          }
       }
    }
    public void a(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, d.class, "2")) {
          return;
       }
       if (!("IN_APP").equals(p1)) {
          this.a(p0);
          return;
       }else {
          String str = "FAIL";
          if (!c.g(PayManager.getInstance().getContext(), "com.tencent.mm")) {
             Toast.makeText(PayManager.getInstance().getContext(), R.string.arg_RES_7f103bb4, 1).show();
             g.d("wechat contractV2 failed, wechat not installed");
             g.j("GATEWAY_CONTRACT", str, g.l("wechat", p0, p1));
             return;
          }else {
             HashMap hashMap = d.a.i(p0, new d$a(this).getType());
             if (q.h(hashMap)) {
                g.j("GATEWAY_CONTRACT", str, g.l("wechat", p0, p1));
                return;
             }else {
                String str1 = hashMap.get("appid");
                if (TextUtils.isEmpty(str1)) {
                   g.j("GATEWAY_CONTRACT", str, g.l("wechat", p0, p1));
                   return;
                }else {
                   IWXAPI iWXAPI = WXAPIFactory.createWXAPI(PayManager.getInstance().getContext(), null);
                   iWXAPI.registerApp(str1);
                   WXOpenBusinessWebview$Req req = new WXOpenBusinessWebview$Req();
                   req.businessType = 12;
                   req.queryInfo = hashMap;
                   iWXAPI.sendReq(req);
                   g.d("wechat contractV2 start, providerConfig="+p0);
                   g.j("GATEWAY_CONTRACT", "FINISH", g.l("wechat", p0, p1));
                   return;
                }
             }
          }
       }
    }
    public void b(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "3")) {
          return;
       }
       g.d("wechat qrmContract not avaliable");
       return;
    }
    public void c(String p0){
       HashMap hashMap;
       String str = "WechatContract";
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "4")) {
          return;
       }
       if (!c.g(PayManager.getInstance().getContext(), "com.tencent.mm")) {
          Toast.makeText(PayManager.getInstance().getContext(), R.string.arg_RES_7f103bb4, 1).show();
          g.d("wechat scoreContract failed, wechat not installed");
          return;
       }else {
          String str1 = null;
          try{
             hashMap = d.a.i(p0, new d$b(this).getType());
          }catch(java.lang.Exception e9){
             b.g(str, "wechat scoreContract failed, parse providerConfig failed", e9);
             hashMap = str1;
          }
          if (q.h(hashMap)) {
             b.f(str, "wechat scoreContract reqMap is empty!!");
             return;
          }else {
             String str2 = hashMap.get("business_type");
             String str3 = hashMap.get("query");
             String str4 = hashMap.get("ext_info");
             hashMap = hashMap.get("appid");
             g.d("WechatContract wechat scoreContract, businessType="+str2+", query="+str3+", extInfo="+str4);
             if (!TextUtils.isEmpty(str2) && (!TextUtils.isEmpty(str3) && (TextUtils.isEmpty(str4) || TextUtils.isEmpty(hashMap)))) {
                b.f(str, "wechat scoreContract failed, param is empty");
                return;
             }else {
                IWXAPI iWXAPI = WXAPIFactory.createWXAPI(PayManager.getInstance().getContext(), str1);
                iWXAPI.registerApp(hashMap);
                if (iWXAPI.getWXAppSupportAPI() >= 0x25020500) {
                   WXOpenBusinessView$Req req = new WXOpenBusinessView$Req();
                   req.businessType = str2;
                   req.query = str3;
                   req.extInfo = str4;
                   iWXAPI.sendReq(req);
                }else {
                   Toast.makeText(PayManager.getInstance().getContext(), R.string.arg_RES_7f103bb5, 1).show();
                }
                return;
             }
          }
       }
    }
}
