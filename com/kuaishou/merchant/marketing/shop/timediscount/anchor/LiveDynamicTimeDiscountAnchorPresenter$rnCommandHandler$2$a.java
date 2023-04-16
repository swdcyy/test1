package com.kuaishou.merchant.marketing.shop.timediscount.anchor.LiveDynamicTimeDiscountAnchorPresenter$rnCommandHandler$2$a;
import g14.e;
import com.kuaishou.merchant.marketing.shop.timediscount.anchor.LiveDynamicTimeDiscountAnchorPresenter$rnCommandHandler$2;
import java.lang.Object;
import android.app.Activity;
import java.lang.String;
import com.google.gson.JsonObject;
import g14.a;
import com.kwai.framework.model.user.User;
import com.kwai.framework.model.feed.BaseFeed;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.google.gson.JsonElement;
import com.google.gson.JsonArray;
import java.util.ArrayList;
import java.lang.Iterable;
import trd.u;
import java.util.Iterator;
import java.util.Collection;
import java.util.Objects;
import com.kuaishou.merchant.marketing.shop.timediscount.anchor.LiveDynamicTimeDiscountAnchorPresenter;
import java.lang.Integer;
import kotlin.jvm.internal.a;
import r94.a;
import fq5.b;
import android.net.Uri;
import ekd.x0;
import org.json.JSONArray;
import com.kuaishou.merchant.log.biz.MerchantCommonLogBiz;
import java.lang.Exception;
import p74.a;
import o74.a;
import android.net.Uri$Builder;
import y74.e;
import q94.n;
import g14.d;

public final class LiveDynamicTimeDiscountAnchorPresenter$rnCommandHandler$2$a implements e	// class@001c05
{
    public final LiveDynamicTimeDiscountAnchorPresenter$rnCommandHandler$2 a;

    public void LiveDynamicTimeDiscountAnchorPresenter$rnCommandHandler$2$a(LiveDynamicTimeDiscountAnchorPresenter$rnCommandHandler$2 p0){
       this.a = p0;
       super();
    }
    public final boolean a(Activity p0,String p1,JsonObject p2,a p3,User p4,BaseFeed p5){
       JsonElement obj1;
       String str;
       int i3;
       String str2;
       LiveDynamicTimeDiscountAnchorPresenter r;
       a c;
       LiveDynamicTimeDiscountAnchorPresenter q;
       String str3;
       String liveStreamId;
       LiveDynamicTimeDiscountAnchorPresenter q1;
       String str4;
       String str5;
       n a;
       LiveDynamicTimeDiscountAnchorPresenter q2;
       String liveStreamId1;
       LiveDynamicTimeDiscountAnchorPresenter q3;
       String str6;
       Uri uri;
       String str7;
       Uri$Builder uBuilder;
       Object obj = this;
       object oobject = p1;
       object oobject1 = p2;
       object oobject2 = p3;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       LiveDynamicTimeDiscountAnchorPresenter$rnCommandHandler$2$a ornCommandHa = LiveDynamicTimeDiscountAnchorPresenter$rnCommandHandler$2$a.class;
       boolean i = 1;
       int i1 = 0;
       if (PatchProxy.isSupport(ornCommandHa)) {
          Object[] objArray = new Object[]{p0,oobject,oobject1,oobject2,p4,p5};
          obj1 = PatchProxy.apply(objArray, obj, ornCommandHa, "1");
          if (obj1 != patchProxyRe) {
             return obj1.booleanValue();
          }
       }
       if (p0 == null || p0.isFinishing()) {
          oobject2.onFailed("Host is destroyed");
          return i1;
       }else if(p1.hashCode() == -127175436 && oobject.equals("clickPendant")){
          JsonArray jsonArray = null;
          if (oobject1 != null) {
             obj1 = oobject1.e0("receiveCondition");
             if (obj1 != null) {
                str = obj1.w();
             label_0066 :
                if (oobject1 != null) {
                   JsonElement jsonElement = oobject1.e0("pendantId");
                   if (jsonElement != null) {
                      jsonElement.w();
                   }
                }
                int i2 = -1;
                if (oobject1 != null) {
                   JsonElement jsonElement1 = oobject1.e0("currentPosition");
                   if (jsonElement1 != null) {
                      i3 = jsonElement1.p();
                   label_0087 :
                      if (oobject1 != null) {
                         jsonElement1 = oobject1.e0("status");
                         if (jsonElement1 != null) {
                            i2 = jsonElement1.p();
                         }
                      }
                      String str1 = "activityIds";
                      if (oobject1 != null) {
                         JsonElement jsonElement2 = oobject1.e0(str1);
                         if (jsonElement2 != null) {
                            jsonArray = jsonElement2.q();
                            ArrayList uArrayList = new ArrayList(u.Y(jsonArray, 10));
                            Iterator iterator = jsonArray.iterator();
                            while (iterator.hasNext()) {
                               uArrayList.add(iterator.next().w());
                            }
                            jsonArray = uArrayList;
                         }
                      }
                      if (jsonArray == null || jsonArray.isEmpty()) {
                         i1 = 1;
                      }
                      if (!i1) {
                         LiveDynamicTimeDiscountAnchorPresenter$rnCommandHandler$2 this$0 = obj.a.this$0;
                         Objects.requireNonNull(this$0);
                         if (PatchProxy.isSupport(LiveDynamicTimeDiscountAnchorPresenter.class)) {
                            str2 = str1;
                            if (!PatchProxy.applyVoidFourRefs(jsonArray, Integer.valueOf(i3), Integer.valueOf(i2), str, this$0, LiveDynamicTimeDiscountAnchorPresenter.class, "4")) {
                            }
                         }else {
                            str2 = str1;
                         }
                      }
                   label_01ac :
                      i = true;
                   }
                }
                i3 = -1;
                goto label_0087 ;
             }
          }
          str = jsonArray;
          goto label_0066 ;
       }else {
          i = false;
       }
       oobject2.onSuccess("");
       return i;
    }
    public String getLiveId(){
       return d.a(this);
    }
}
