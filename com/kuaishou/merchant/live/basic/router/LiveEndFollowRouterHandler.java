package com.kuaishou.merchant.live.basic.router.LiveEndFollowRouterHandler;
import cb4.e;
import g64.a;
import java.lang.Object;
import cb4.d;
import com.kuaishou.merchant.router.base.RouterRequest;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import tkd.b;
import tkd.d;
import fs5.a;
import com.kuaishou.merchant.router.RouterConfig;
import java.util.Map;
import nv3.a;
import c24.q0;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kuaishou.merchant.log.biz.MerchantCommonLogBiz;
import p74.a;
import o74.a;
import fg6.a;
import com.google.gson.Gson;
import com.kuaishou.merchant.live.basic.router.LiveEndFollowRouterHandler$FollowModel;
import java.util.List;
import com.kuaishou.merchant.live.basic.router.LiveEndFollowRouterHandler$FollowModel$Component;
import com.kuaishou.merchant.live.basic.bubble.component.MerchantBubbleTextComponent;
import com.kuaishou.merchant.live.basic.bubble.component.MerchantBubbleButtonComponent;
import org.json.JSONObject;
import org.json.JSONException;
import java.util.HashMap;
import java.util.Iterator;

public class LiveEndFollowRouterHandler implements e	// class@0018b5
{
    public a a;

    public void LiveEndFollowRouterHandler(a p0){
       super();
       this.a = p0;
    }
    public boolean a(){
       return d.a(this);
    }
    public boolean b(RouterRequest p0){
       JSONObject jSONObject;
       HashMap hashMap;
       Iterator iterator;
       String str1;
       LiveEndFollowRouterHandler liveEndFollo = LiveEndFollowRouterHandler.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       JSONObject obj = PatchProxy.applyOneRefs(p0, this, liveEndFollo, "1");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (this.a == null) {
          return b;
       }
       if (d.a(-1397441499).bx()) {
          return b;
       }
       Map map = p0.c().c();
       String obj1 = PatchProxy.applyOneRefs(map, this, liveEndFollo, "2");
       obj = null;
       if (obj1 != patchProxyRe) {
       }else {
          Object obj4 = map.get("MERCHANT_COVER_CALLBACK");
          if (obj4 != null && obj4 instanceof a) {
          }else {
             jSONObject = obj;
          label_004e :
             obj1 = "data";
             String str = "";
             LiveEndFollowRouterHandler$FollowModel$Component obj2 = PatchProxy.applyThreeRefs(map, obj1, str, null, q0.class, "3");
             if (obj2 != patchProxyRe) {
                str = obj2;
             }else if(map == null || !map.containsKey(obj1)){
                obj4 = map.get(obj1);
                if (obj4 != null && obj4 instanceof String) {
                   str = obj4;
                }
             }
             if (TextUtils.isEmpty(str)) {
                a.s(MerchantCommonLogBiz.ROUTER, "LiveEndFollowRouterHandler", "show dialog with old data");
                obj1 = "datas";
                Object obj3 = null;
                obj2 = PatchProxy.applyThreeRefs(map, obj1, obj3, null, q0.class, "5");
                if (obj2 != patchProxyRe) {
                   obj3 = obj2;
                }else if(map == null || !map.containsKey(obj1)){
                   map = map.get(obj1);
                   if (map != null && map instanceof Map) {
                      obj3 = map;
                   }
                }
                str = a.a.q(obj3);
             }
             LiveEndFollowRouterHandler$FollowModel uFollowModel = LiveEndFollowRouterHandler$FollowModel.parse(str);
             if (uFollowModel == null) {
                a.s(MerchantCommonLogBiz.ROUTER, "LiveEndFollowRouterHandler", "model is null");
                return b;
             }else {
                LiveEndFollowRouterHandler$FollowModel mComponents = uFollowModel.mComponents;
                LiveEndFollowRouterHandler$FollowModel uFollowModel1 = (mComponents == null)? null: mComponents.size();
                MerchantBubbleTextComponent merchantBubb = obj;
                MerchantBubbleTextComponent merchantBubb1 = merchantBubb;
                MerchantBubbleButtonComponent merchantBubb2 = merchantBubb1;
                while (b < uFollowModel1) {
                   obj2 = mComponents.get(b);
                   LiveEndFollowRouterHandler$FollowModel$Component mCode = obj2.mCode;
                   obj2 = obj2.mPayload;
                   if (!TextUtils.isEmpty(obj2)) {
                      if (mCode == 3001) {
                         if (merchantBubb == null) {
                            merchantBubb = a.a.h(obj2, MerchantBubbleTextComponent.class);
                         }else {
                            merchantBubb1 = a.a.h(obj2, MerchantBubbleTextComponent.class);
                         }
                      }else if(mCode == 3101){
                         merchantBubb2 = a.a.h(obj2, MerchantBubbleButtonComponent.class);
                      }
                   }
                   b = b + 1;
                }
                if (!TextUtils.isEmpty(uFollowModel.mExtraMap)) {
                   try{
                      obj = new JSONObject(uFollowModel.mExtraMap);
                   }catch(org.json.JSONException e0){
                      e0.printStackTrace();
                   }
                }
             }
          }
       }
       jSONObject = obj1;
       goto label_004e ;
    }
    public String getName(){
       return d.b(this);
    }
}
