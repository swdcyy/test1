package com.yxcorp.gifshow.relation.inapp.a;
import my6.e;
import java.lang.Object;
import com.kwai.library.push.model.InAppEvent;
import com.yxcorp.gifshow.relation.inapp.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.util.Map;
import com.kwai.library.push.model.InAppNotification;
import com.google.gson.JsonObject;
import fg6.a;
import com.yxcorp.gifshow.relation.inapp.FollowInPushAttach;
import com.google.gson.JsonElement;
import com.google.gson.Gson;
import v9c.a;
import java.lang.StringBuilder;
import q87.c;
import com.yxcorp.gifshow.relation.inapp.b$a;
import java.lang.Enum;
import com.kwai.framework.activitycontext.ActivityContext;
import android.app.Activity;
import com.yxcorp.gifshow.relation.inapp.FollowInPushAttach$NewSingleFollower;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gifshow.activity.GifshowActivity;
import yac.b;
import jga.c;
import jga.f$a;
import wca.b;
import jga.f;
import yac.a;
import android.content.Context;
import com.yxcorp.gifshow.entity.helper.FollowHelper$a;
import com.yxcorp.gifshow.entity.helper.FollowHelper;
import yac.c;
import java.lang.Runnable;
import t45.c;
import java.lang.Integer;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ShowEvent;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import java.util.HashMap;
import zk.d;
import k2b.u1;

public final class a implements e	// class@0018d6
{
    public static final a a;

    static {
       a.a = new a();
    }
    public void a(){
       super();
    }
    public final boolean a(InAppEvent p0){
       boolean b;
       String str1;
       String str2;
       FollowInPushAttach uFollowInPus;
       f$a uoa;
       int i3;
       ClientEvent$ElementPackage uElementPack;
       HashMap hashMap;
       HashMap hashMap1;
       d uod;
       Activity obj = p0;
       b uob = b.class;
       c obj1 = null;
       Map obj2 = PatchProxy.applyOneRefs(obj, obj1, uob, "2");
       b = true;
       int i = 0;
       if (obj2 != PatchProxyResult.class) {
          b = obj2.booleanValue();
       }else if(obj != null){
          InAppEvent b1 = obj.b;
          if (b1 != null) {
             String str = "";
             if (b1.getExtraInfo() != null) {
                obj2 = b1.getExtraInfo();
                str1 = obj2.get("PUSH_ID");
                str2 = str1;
                str1 = obj2.get("KS_ORDER_ID");
             }else {
                str1 = str;
                str2 = str1;
             }
             JsonObject attach = b1.getAttach();
             try{
                uFollowInPus = a.a.c(attach, FollowInPushAttach.class);
             }catch(java.lang.Exception e0){
                Object[] objArray = new Object[i];
                a.C().s("Relation", "follow push event error "+e0, objArray);
                uFollowInPus = new FollowInPushAttach();
             }
             int i1 = b$a.a[obj.a.ordinal()];
             int i2 = 3;
             if (i1 != b) {
                if (i1 != 2) {
                   if (i1 == i2) {
                      if (!PatchProxy.applyVoidTwoRefs(uFollowInPus, b1, obj1, uob, "3")) {
                         if (uFollowInPus != null) {
                            b.a(b, uFollowInPus.followCount);
                         }
                         obj = ActivityContext.g().e();
                         String mSchema = b1.getmSchema();
                         if (uFollowInPus != null) {
                            FollowInPushAttach newSingleFol = uFollowInPus.newSingleFollower;
                            if (newSingleFol != null && uFollowInPus.followCount == b) {
                               if (!TextUtils.x(newSingleFol.id)) {
                                  if (obj instanceof GifshowActivity) {
                                     str = obj.Q2();
                                  }
                                  uFollowInPus = uFollowInPus.newSingleFollower;
                                  FollowInPushAttach$NewSingleFollower id = uFollowInPus.id;
                                  FollowInPushAttach$NewSingleFollower isPrivacyUse = uFollowInPus.isPrivacyUser;
                                  if (PatchProxy.isSupport(b.class)) {
                                     Object[] objArray1 = new Object[]{id,str,Boolean.valueOf(isPrivacyUse),mSchema,obj};
                                     if (!PatchProxy.applyVoid(objArray1, obj1, b.class, "1")) {
                                     }
                                  }else {
                                  }
                               }
                            }
                         }
                         b.a(mSchema, obj);
                      }
                   }
                }else if(uFollowInPus != null){
                   uFollowInPus = uFollowInPus.followCount;
                }else {
                   i3 = 0;
                }
                b.a(i, uFollowInPus);
                c.a(new c(b1));
             }else if(uFollowInPus != null){
                uFollowInPus = uFollowInPus.followCount;
             }else {
                i3 = 0;
             }
             if (PatchProxy.isSupport(uob)) {
                if (!PatchProxy.applyVoidThreeRefs(str2, str1, Integer.valueOf(uFollowInPus), null, b.class, "4")) {
                }
             }else {
                int i4 = 3;
             }
          }
       }
    label_01b1 :
       b = false;
    label_01b2 :
       return b;
    }
}
