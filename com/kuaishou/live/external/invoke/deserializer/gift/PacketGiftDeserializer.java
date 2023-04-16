package com.kuaishou.live.external.invoke.deserializer.gift.PacketGiftDeserializer;
import com.google.gson.b;
import java.lang.Object;
import com.google.gson.JsonObject;
import java.lang.String;
import com.google.gson.JsonArray;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.JsonElement;
import java.lang.reflect.Type;
import com.google.gson.a;
import com.kuaishou.live.external.invoke.deserializer.gift.PacketGift;
import fg6.a;
import com.google.gson.Gson;
import ekd.k0;
import l33.e;
import el.a;
import java.util.List;
import l33.f;
import com.yxcorp.gifshow.model.CDNUrl;
import java.lang.Throwable;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;
import com.kuaishou.live.external.invoke.deserializer.gift.GiftPanelItemPromptInfo;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;

public class PacketGiftDeserializer implements b	// class@0008c2
{

    public void PacketGiftDeserializer(){
       super();
    }
    public static JsonArray a(JsonObject p0,String p1){
       JsonArray jsonArray = null;
       Object obj = PatchProxy.applyTwoRefs(p0, p1, jsonArray, PacketGiftDeserializer.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       JsonElement jsonElement = p0.e0(p1);
       if (jsonElement != null && !jsonElement.F()) {
          jsonArray = jsonElement.q();
       }
       return jsonArray;
    }
    public Object deserialize(JsonElement p0,Type p1,a p2){
       JsonArray jsonArray;
       p1 = PatchProxy.applyThreeRefs(p0, p1, p2, this, PacketGiftDeserializer.class, "2");
       if (p1 != PatchProxyResult.class) {
       }else {
          Gson b = a.b;
          String str = b.c(p0.m0("gift"), PacketGift.class);
          if (!PatchProxy.applyVoidThreeRefs(p0, p2, str, null, PacketGiftDeserializer.class, "3")) {
             str.mItemId = k0.h(p0, "itemId", "");
             int i = 0;
             str.mCount = k0.f(p0, "count", i);
             str.mExpireTime = k0.g(p0, "expireTime", 0);
             str.mItemType = k0.f(p0, "itemType", i);
             str.mDescription = k0.h(p0, "description", "");
             str.mExpiredSoon = k0.c(p0, "expiredSoon", i);
             str.mLiveVipGradeScore = k0.g(p0, "roomVipScore", 0);
             p2 = null;
             if (!PatchProxy.applyVoidTwoRefs(p0, str, p2, PacketGiftDeserializer.class, "4")) {
                jsonArray = PacketGiftDeserializer.a(p0, "topLeftIconUrls");
                str.mTopLeftIconUrls = (jsonArray == null)? p2: b.d(jsonArray, new e().getType());
             }
          label_009c :
             if (!PatchProxy.applyVoidTwoRefs(p0, str, p2, PacketGiftDeserializer.class, "5")) {
                jsonArray = PacketGiftDeserializer.a(p0, "dynamicGiftIconUrls");
                if (jsonArray == null) {
                   str.mDynamicGiftIconUrls = p2;
                }else {
                   try{
                      List list = b.d(jsonArray, new f().getType());
                      if (list != null) {
                         CDNUrl[] uCDNUrlArray = new CDNUrl[i];
                         str.mDynamicGiftIconUrls = list.toArray(uCDNUrlArray);
                      }
                   }catch(com.google.gson.JsonSyntaxException e10){
                      ExceptionHandler.handleCaughtException(e10);
                   }
                }
             }
          }
       }
       return p1;
    }
}
