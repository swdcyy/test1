package com.kuaishou.merchant.live.basic.router.MagicEffectRouterHandler;
import cb4.e;
import com.kuaishou.merchant.live.basic.router.MagicEffectRouterHandler$a;
import nsd.u;
import fq5.b;
import ks3.d0;
import ks3.r;
import java.lang.Object;
import cb4.d;
import com.kuaishou.merchant.router.base.RouterRequest;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import android.net.Uri;
import com.kuaishou.merchant.live.MerchantLiveLogBiz;
import java.lang.StringBuilder;
import p74.a;
import o74.a;
import kotlin.jvm.internal.Ref$LongRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import com.kuaishou.merchant.router.RouterConfig;
import java.util.Map;
import nv3.a;
import com.kuaishou.merchant.log.biz.MerchantCommonLogBiz;
import com.kuaishou.merchant.live.basic.router.MagicEffectRouterHandler$MagicModel;
import java.util.Objects;
import com.kuaishou.merchant.live.basic.router.MagicEffectRouterHandler$MagicModel$a;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import fg6.a;
import com.google.gson.Gson;
import java.lang.Exception;
import com.kuaishou.merchant.live.basic.router.MagicEffectRouterHandler$MagicModel$MaterialData;
import java.lang.Long;
import java.util.HashMap;
import lnc.o5;
import ekd.x0;
import kotlin.jvm.internal.a;
import tkd.b;
import tkd.d;
import ma4.e;
import zr3.a;
import com.kuaishou.merchant.live.basic.router.MagicEffectRouterHandler$b;
import android.view.View;
import com.kuaishou.merchant.live.basic.effect.CartPosUtil;
import com.kuaishou.merchant.live.basic.effect.CartPosUtil$Data;
import ps3.c;
import com.kuaishou.merchant.live.basic.effect.EffectMsg;
import o14.e;
import zr3.c;
import o14.c;

public final class MagicEffectRouterHandler implements e	// class@0018bd
{
    public final b a;
    public d0 b;
    public final r c;
    public static final MagicEffectRouterHandler$a d;

    static {
       MagicEffectRouterHandler.d = new MagicEffectRouterHandler$a(null);
    }
    public void MagicEffectRouterHandler(b p0,d0 p1,r p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public boolean a(){
       return d.a(this);
    }
    public boolean b(RouterRequest p0){
       String str7;
       PatchProxyResult patchProxyRe1;
       String str8;
       boolean b1;
       Boolean followFace;
       String str9;
       boolean b3;
       String str10;
       PatchProxyResult patchProxyRe2;
       MagicEffectRouterHandler b6;
       String obj = this;
       String obj1 = p0;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       String str = "1";
       String obj2 = PatchProxy.applyOneRefs(obj1, obj, MagicEffectRouterHandler.class, str);
       if (obj2 != patchProxyRe) {
          return obj2.booleanValue();
       }
       boolean b = false;
       if (obj.b == null) {
          return b;
       }
       if (obj1 == null) {
          return false;
       }
       Uri uri = p0.d();
       String str1 = "MagicEffectRouterHandler";
       a.s(MerchantLiveLogBiz.MAGIC_EFFECT, str1, "url:"+uri);
       Ref$LongRef longRef = new Ref$LongRef();
       longRef.element = 0;
       Ref$ObjectRef objectRef = new Ref$ObjectRef();
       Object obj3 = null;
       objectRef.element = obj3;
       Map map = p0.c().c();
       obj2 = map.get("MERCHANT_COVER_CALLBACK");
       if (!obj2 instanceof a) {
          obj2 = obj3;
       }
       obj2 = "data";
       String str2 = "needUserInfo";
       String str3 = "needCartPos";
       String str4 = "requestJson";
       obj = "logParams";
       Object obj4 = obj2;
       String str5 = "followFace";
       obj1 = "displayImmediately";
       Uri uri1 = uri;
       String str6 = "magicFaceId";
       if (map.containsKey(obj2)) {
          str7 = obj;
          a.s(MerchantCommonLogBiz.ROUTER, str1, "parse data from new material");
          MagicEffectRouterHandler$MagicModel$a companion = MagicEffectRouterHandler$MagicModel.Companion;
          MagicEffectRouterHandler$MagicModel obj5 = map.get(obj2);
          if (!obj5 instanceof String) {
             obj5 = null;
          }
          try{
             Objects.requireNonNull(companion);
             Long obj6 = PatchProxy.applyOneRefs(obj5, companion, MagicEffectRouterHandler$MagicModel$a.class, str);
             if (obj6 != patchProxyRe) {
                obj5 = obj6;
             }else if(TextUtils.x(obj5)){
                patchProxyRe1 = patchProxyRe;
                str8 = str;
             }else {
                obj5 = a.a.h(obj5, MagicEffectRouterHandler$MagicModel.class);
             }
             patchProxyRe1 = patchProxyRe;
             str8 = str;
          label_00d2 :
             if (obj5 != null) {
                MagicEffectRouterHandler$MagicModel$MaterialData materialMap = obj5.getMaterialMap();
                if (materialMap != null) {
                   obj6 = materialMap.getMagicFaceId();
                   long l = (obj6 != null)? obj6.longValue(): 0;
                   longRef.element = l;
                   Boolean displayImmed = materialMap.getDisplayImmediately();
                   b1 = (displayImmed != null)? displayImmed.booleanValue(): 0;
                   followFace = materialMap.getFollowFace();
                   boolean b2 = (followFace != null)? followFace.booleanValue(): null;
                   objectRef.element = materialMap.getLogParams();
                   if (map instanceof HashMap) {
                      Map map1 = map;
                      str = materialMap.getRequestJson();
                      str9 = "";
                      if (str == null) {
                         str = str9;
                      }
                      map1.put(str4, str);
                      map1.put(str2, Boolean.valueOf(materialMap.getNeedUserInfo()));
                      map1.put(str3, Boolean.valueOf(materialMap.getNeedCartPos()));
                      obj2 = materialMap.getImages();
                      if (obj2 == null) {
                         obj2 = str9;
                      }
                      map1.put("images", obj2);
                   }
                   b3 = b1;
                   b1 = b2;
                   obj = str7;
                }
             }
             obj = str7;
             b3 = false;
             b1 = false;
          }catch(java.lang.Exception e0){
             patchProxyRe1 = patchProxyRe;
             str8 = str;
             a.h(MerchantCommonLogBiz.ROUTER, "MagicModel", "parse json failed", "msg", e0.getMessage());
          }
          obj5 = null;
          goto label_00d2 ;
       }else {
          patchProxyRe1 = patchProxyRe;
          str8 = str;
          a.s(MerchantCommonLogBiz.ROUTER, str1, "old material");
          longRef.element = o5.c(String.valueOf(map.get(str6)));
          b3 = Boolean.parseBoolean(String.valueOf(map.get(obj1)));
          b1 = Boolean.parseBoolean(String.valueOf(map.get(str5)));
          Object obj7 = map.get(obj);
          if (!obj7 instanceof String) {
             obj7 = null;
          }
          objectRef.element = obj7;
       }
       str7 = str3;
       str9 = str4;
       long l1 = 0;
       Uri uri2 = uri1;
       if (!longRef.element - l1) {
          str10 = str2;
          longRef.element = o5.d(x0.a(uri2, str6), l1);
       }else {
          str10 = str2;
       }
       str3 = "true";
       boolean b4 = true;
       b3 = (b3 || a.g(x0.a(uri2, obj1), str3))? true: false;
       b1 = (b1 || a.g(x0.a(uri2, str5), str3))? true: false;
       Ref$ObjectRef element = objectRef.element;
       str3 = (element == null || !element.length())? 1: null;
       if (str3) {
          objectRef.element = x0.a(uri2, obj);
       }
       if (longRef.element <= 0) {
          return false;
       }else if(d.a(-1103669376).M3(p0)){
          return b4;
       }else {
          a.t(MerchantLiveLogBiz.MAGIC_EFFECT, str1, "playMagicFace", str6, Long.valueOf(longRef.element));
          Ref$LongRef element1 = longRef.element;
          a uoa = a.class;
          if (PatchProxy.isSupport(uoa)) {
             str2 = str8;
             uoa = PatchProxy.applyOneRefs(Long.valueOf(element1), null, uoa, str2);
             patchProxyRe2 = patchProxyRe1;
             if (uoa != patchProxyRe2) {
             label_0230 :
                boolean b5 = uoa;
                b5.b = b3;
                b5.c = b1;
                str5 = str7;
                String str11 = str9;
                MagicEffectRouterHandler$b uob = new MagicEffectRouterHandler$b(longRef, obj4, objectRef, this, p0);
                b5.f = b3;
                MagicEffectRouterHandler magicEffectR = this;
                if (!PatchProxy.applyVoidThreeRefs(b5, uri2, map, this, MagicEffectRouterHandler.class, "2")) {
                   obj2 = magicEffectR.e(map, uri2, str11);
                   int i = (obj2.length() > 0)? 1: 0;
                   if (i) {
                      b5.a(obj2);
                   }
                   if (magicEffectR.d(map, uri2, str5)) {
                      b6 = magicEffectR.c;
                      if (b6 != null && b6.c()) {
                         View view = b6.a();
                         str1 = PatchProxy.applyOneRefs(view, null, CartPosUtil.class, str2);
                         if (str1 != patchProxyRe2) {
                         }else {
                            str1 = EffectMsg.createReqJson(2701, new CartPosUtil$Data(c.a(view)));
                         }
                         b5.a(str1);
                      }
                   }
                   if (magicEffectR.d(map, uri2, str10)) {
                      b5.b(new e());
                   }
                   obj2 = magicEffectR.e(map, uri2, "images");
                   if (!TextUtils.x(obj2)) {
                      b5.b(new c(obj2));
                   }
                }
                b6 = magicEffectR.b;
                if (b6 != null) {
                   b6.f(b5);
                }
                return true;
             }
          }else {
             patchProxyRe2 = patchProxyRe1;
             str2 = str8;
          }
          uoa = new a();
          uoa.a = element1;
          goto label_0230 ;
       }
    }
    public final boolean d(Map p0,Uri p1,String p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, MagicEffectRouterHandler.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (Boolean.parseBoolean(String.valueOf(p0.get(p2))) || Boolean.parseBoolean(x0.a(p1, p2)))? true: false;
       return b;
    }
    public final String e(Map p0,Uri p1,String p2){
       String str;
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, MagicEffectRouterHandler.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       p0 = p0.get(p2);
       if (!p0 instanceof String) {
          str = null;
       }
       obj = (str == null || !str.length())? 1: 0;
       if (obj) {
          str = x0.a(p1, p2);
       }
       if (str == null) {
          str = "";
       }
       return str;
    }
    public String getName(){
       return d.b(this);
    }
}
