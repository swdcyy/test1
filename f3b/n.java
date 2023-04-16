package f3b.n;
import java.lang.Object;
import java.util.List;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$AreaPackage;
import com.google.common.collect.ImmutableMap$b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Iterator;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import zk.g;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import java.util.Map;
import com.kwai.robust.PatchProxyResult;
import f3b.o;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import java.lang.Integer;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage$Type;
import java.lang.Long;
import java.lang.Number;
import com.kuaishou.client.log.content.packages.nano.ClientContent$TagPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$TagPackage$Type;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage$LiveStyle;
import java.lang.Boolean;
import com.kuaishou.client.log.content.packages.nano.ClientContent$TargetUserPackageV2;
import com.kuaishou.client.log.content.packages.nano.ClientContent$CommodityDetailPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$DistrictRankPackage$RankType;
import com.kuaishou.client.log.content.packages.nano.ClientContent$DistrictRankPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$CommentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$CollectionPackageV2;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveVoicePartyPackageV2;
import com.kuaishou.client.log.content.packages.nano.ClientContent$UserPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ProfilePackage;
import com.google.gson.c;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.lang.Exception;
import k2b.z1;
import java.util.Set;
import java.util.Map$Entry;
import com.google.common.base.CaseFormat;
import f3b.m;
import com.kuaishou.protobuf.log.nano.StidContainerProto$StidContainer;

public class n	// class@002889
{

    public void n(){
       super();
    }
    public static void a(List p0,ClientEvent$AreaPackage p1,ImmutableMap$b p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, n.class, "13")) {
          return;
       }
       if (p0 != null && (p0.size() > 0 && p1 != null)) {
          Iterator iterator = p0.iterator();
          while (iterator.hasNext()) {
             String[] stringArray = (iterator.next()).split(",");
             int i = 1;
             if (stringArray.length > i && (("name").equals(stringArray[0]) && !TextUtils.x(p1.name))) {
                p2.c(stringArray[i], new g(p1.name));
             }
          }
       }
       return;
    }
    public static void b(ClientContent$ContentPackage p0,Map p1,ImmutableMap$b p2){
       String str6;
       Iterator iterator;
       String[] stringArray;
       int i1;
       ClientContent$TagPackage type;
       Iterator iterator1;
       String str10;
       String str11;
       ClientContent$ContentPackage uContentPack = p0;
       Map map = p1;
       ImmutableMap$b uob = p2;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       o oo = o.class;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, n.class, "1")) {
          return;
       }
       if (!map) {
          return;
       }
       if (!uContentPack) {
          return;
       }
       ClientContent$ContentPackage photoPackage = uContentPack.photoPackage;
       String obj = map.get("photo_package");
       String str = "authorId";
       String str1 = "serverExpTag";
       String str2 = "type";
       String str3 = "index";
       String str4 = "identity";
       int i = 1;
       String str5 = ",";
       if (!PatchProxy.applyVoidThreeRefs(photoPackage, obj, p2, null, n.class, "2") && (obj != null && (obj.size() > 0 && photoPackage != null))) {
          iterator = obj.iterator();
          while (iterator.hasNext()) {
             String[] stringArray1 = (iterator.next()).split(str5);
             if (stringArray1.length > i) {
                if (str4.equals(stringArray1[0]) && !TextUtils.x(photoPackage.identity)) {
                   uob.c(stringArray1[i], new g(photoPackage.identity));
                }else if(str2.equals(stringArray1[0])){
                   object oobject1 = stringArray1[1];
                   ClientContent$PhotoPackage type1 = photoPackage.type;
                   if (PatchProxy.isSupport(oo)) {
                      iterator1 = iterator;
                      str6 = str5;
                      str10 = str4;
                      str11 = PatchProxy.applyOneRefs(Integer.valueOf(type1), null, oo, "31");
                      if (str11 != patchProxyRe) {
                      label_00c5 :
                         uob.c(oobject1, new g(str11));
                      }
                   }else {
                      iterator1 = iterator;
                      str6 = str5;
                      str10 = str4;
                   }
                   str11 = o.g(ClientContent$PhotoPackage$Type.class, type1);
                   goto label_00c5 ;
                }else {
                   iterator1 = iterator;
                   str6 = str5;
                   str10 = str4;
                   if (("expTag").equals(stringArray1[0]) && !TextUtils.x(photoPackage.expTag)) {
                      uob.c(stringArray1[1], new g(photoPackage.expTag));
                   }else if(str1.equals(stringArray1[0]) && !TextUtils.x(photoPackage.serverExpTag)){
                      uob.c(stringArray1[1], new g(photoPackage.serverExpTag));
                   }else {
                      int i2 = 1;
                      if (str.equals(stringArray1[0])) {
                         uob.c(stringArray1[i2], new g(Long.valueOf(photoPackage.authorId)));
                      }else if(("sAuthorId").equals(stringArray1[0]) && !TextUtils.x(photoPackage.sAuthorId)){
                         i = 1;
                         uob.c(stringArray1[i], new g(photoPackage.sAuthorId));
                      }else {
                         i = 1;
                         if (str3.equals(stringArray1[0])) {
                            uob.c(stringArray1[i], new g(Long.valueOf(photoPackage.index)));
                         }
                      }
                      iterator = iterator1;
                      str5 = str6;
                      str4 = str10;
                   }
                }
                iterator = iterator1;
                str5 = str6;
                str4 = str10;
                i = 1;
             }
          }
       }
       photoPackage = uContentPack.tagPackage;
       obj = map.get("tag_package");
       str6 = str;
       str = str5;
       String str7 = str1;
       str1 = str4;
       String str8 = str3;
       String str9 = str2;
       str2 = "name";
       if (!PatchProxy.applyVoidThreeRefs(photoPackage, obj, p2, null, n.class, "3") && (obj != null && (obj.size() > 0 && photoPackage != null))) {
          iterator = obj.iterator();
          while (iterator.hasNext()) {
             stringArray = (iterator.next()).split(str);
             i1 = 1;
             if (stringArray.length > i1) {
                if (str1.equals(stringArray[0]) && !TextUtils.x(photoPackage.identity)) {
                   uob.c(stringArray[i1], new g(photoPackage.identity));
                }else if(str2.equals(stringArray[0]) && !TextUtils.x(photoPackage.name)){
                   uob.c(stringArray[1], new g(photoPackage.name));
                }else {
                   i = 1;
                   if (str9.equals(stringArray[0])) {
                      object oobject = stringArray[i];
                      type = photoPackage.type;
                      if (PatchProxy.isSupport(oo)) {
                         iterator1 = iterator;
                         str3 = PatchProxy.applyOneRefs(Integer.valueOf(type), null, oo, "30");
                         if (str3 != patchProxyRe) {
                         label_0232 :
                            uob.c(oobject, new g(str3));
                            iterator = iterator1;
                         }
                      }else {
                         iterator1 = iterator;
                         iterator = null;
                      }
                      str3 = o.g(ClientContent$TagPackage$Type.class, type);
                      goto label_0232 ;
                   }
                }
             }
          }
       }
       ClientContent$ContentPackage liveStreamPa = uContentPack.liveStreamPackage;
       String obj1 = map.get("live_stream_package");
       obj = str2;
       if (!PatchProxy.applyVoidThreeRefs(liveStreamPa, obj1, p2, null, n.class, "4") && (obj1 != null && (obj1.size() > 0 && liveStreamPa != null))) {
          iterator = obj1.iterator();
          while (iterator.hasNext()) {
             stringArray = (iterator.next()).split(str);
             i1 = 1;
             if (stringArray.length > i1) {
                if (("liveStreamId").equals(stringArray[0]) && !TextUtils.x(liveStreamPa.liveStreamId)) {
                   uob.c(stringArray[i1], new g(liveStreamPa.liveStreamId));
                }else if(("anchorUserId").equals(stringArray[0]) && !TextUtils.x(liveStreamPa.anchorUserId)){
                   uob.c(stringArray[1], new g(liveStreamPa.anchorUserId));
                }else {
                   str4 = str7;
                   if (str4.equals(stringArray[0]) && !TextUtils.x(liveStreamPa.serverExpTag)) {
                      uob.c(stringArray[1], new g(liveStreamPa.serverExpTag));
                   }else if(str1.equals(stringArray[0]) && !TextUtils.x(liveStreamPa.identity)){
                      uob.c(stringArray[1], new g(liveStreamPa.identity));
                   }else if(("sourceUrl").equals(stringArray[0]) && !TextUtils.x(liveStreamPa.sourceUrl)){
                      uob.c(stringArray[1], new g(liveStreamPa.sourceUrl));
                   }else if(("liveStyle").equals(stringArray[0])){
                      uob.c(stringArray[1], new g(o.g(ClientContent$LiveStreamPackage$LiveStyle.class, liveStreamPa.liveStyle)));
                   }else if(("myFollow").equals(stringArray[0])){
                      uob.c(stringArray[1], new g(Boolean.valueOf(liveStreamPa.myFollow)));
                   }else {
                      i = 1;
                      if (("friend").equals(stringArray[0])) {
                         uob.c(stringArray[i], new g(Boolean.valueOf(liveStreamPa.friend)));
                      }else if(("showIndexPlusOne").equals(stringArray[0])){
                         uob.c(stringArray[i], new g(Long.valueOf(liveStreamPa.showIndexPlusOne)));
                      }else if(("sessionId").equals(stringArray[0])){
                         uob.c(stringArray[i], new g(liveStreamPa.sessionId));
                      }else if(("sourceTypeNew").equals(stringArray[0])){
                         uob.c(stringArray[i], new g(Integer.valueOf(liveStreamPa.sourceTypeNew)));
                      }
                   }
                   str7 = str4;
                }
             }
          }
       }
       liveStreamPa = uContentPack.targetUserPackage;
       obj1 = map.get("target_user_package");
       if (!PatchProxy.applyVoidThreeRefs(liveStreamPa, obj1, p2, null, n.class, "5") && (obj1 != null && (!obj1.isEmpty() && liveStreamPa != null))) {
          iterator = obj1.iterator();
          while (iterator.hasNext()) {
             stringArray = (iterator.next()).split(str);
             i1 = 1;
             if (stringArray.length > i1 && (str1.equals(stringArray[0]) && !TextUtils.x(liveStreamPa.identity))) {
                uob.c(stringArray[i1], new g(liveStreamPa.identity));
             }
          }
       }
       liveStreamPa = uContentPack.commodityDetailPackage;
       obj1 = map.get("commodity_detail_package");
       if (!PatchProxy.applyVoidThreeRefs(liveStreamPa, obj1, p2, null, n.class, "6") && (obj1 != null && (!obj1.isEmpty() && liveStreamPa != null))) {
          iterator = obj1.iterator();
          while (iterator.hasNext()) {
             stringArray = (iterator.next()).split(str);
             i1 = 1;
             if (stringArray.length > i1) {
                if (("id").equals(stringArray[0]) && !TextUtils.x(liveStreamPa.id)) {
                   uob.c(stringArray[i1], new g(liveStreamPa.id));
                }else if(("itemActivityType").equals(stringArray[0])){
                   uob.c(stringArray[1], new g(Integer.valueOf(liveStreamPa.itemActivityType)));
                }else {
                   i = 1;
                   obj1 = str8;
                   if (obj1.equals(stringArray[0])) {
                      uob.c(stringArray[i], new g(Integer.valueOf(liveStreamPa.index)));
                   }else if(("isSnapup").equals(stringArray[0])){
                      uob.c(stringArray[i], new g(Integer.valueOf(liveStreamPa.isSnapup)));
                   }else if(("skuNum").equals(stringArray[0])){
                      uob.c(stringArray[i], new g(Integer.valueOf(liveStreamPa.skuNum)));
                   }
                   str8 = obj1;
                }
             }
          }
       }
       obj1 = str8;
       liveStreamPa = uContentPack.districtRankPackage;
       Object obj2 = map.get("district_rank_package");
       if (!PatchProxy.applyVoidThreeRefs(liveStreamPa, obj2, p2, null, n.class, "7") && (obj2 != null && (!obj2.isEmpty() && liveStreamPa != null))) {
          iterator = obj2.iterator();
          while (iterator.hasNext()) {
             stringArray = (iterator.next()).split(str);
             i1 = 1;
             if (stringArray.length > i1 && ("rankType").equals(stringArray[0])) {
                uob.c(stringArray[i1], new g(o.g(ClientContent$DistrictRankPackage$RankType.class, liveStreamPa.rankType)));
             }
          }
       }
       liveStreamPa = uContentPack.commentPackage;
       obj2 = map.get("comment_package");
       if (!PatchProxy.applyVoidThreeRefs(liveStreamPa, obj2, p2, null, n.class, "8") && (obj2 != null && (!obj2.isEmpty() && liveStreamPa != null))) {
          iterator = obj2.iterator();
          while (iterator.hasNext()) {
             stringArray = (iterator.next()).split(str);
             i1 = 1;
             if (stringArray.length > i1) {
                if (str1.equals(stringArray[0]) && !TextUtils.x(liveStreamPa.identity)) {
                   uob.c(stringArray[i1], new g(liveStreamPa.identity));
                }else {
                   str4 = str6;
                   if (str4.equals(stringArray[0]) && !TextUtils.x(liveStreamPa.authorId)) {
                      uob.c(stringArray[1], new g(liveStreamPa.authorId));
                   }else if(("childCommentCount").equals(stringArray[0])){
                      uob.c(stringArray[1], new g(Integer.valueOf(liveStreamPa.childCommentCount)));
                   }else if(("commentUserLabel").equals(stringArray[0]) && !TextUtils.x(liveStreamPa.commentUserLabel)){
                      uob.c(stringArray[1], new g(liveStreamPa.commentUserLabel));
                   }
                   str6 = str4;
                }
             }
          }
       }
       liveStreamPa = uContentPack.collectionPackage;
       obj2 = map.get("collection_package");
       if (!PatchProxy.applyVoidThreeRefs(liveStreamPa, obj2, p2, null, n.class, "9") && (obj2 != null && (!obj2.isEmpty() && liveStreamPa != null))) {
          iterator = obj2.iterator();
          while (iterator.hasNext()) {
             stringArray = (iterator.next()).split(str);
             i1 = 1;
             if (stringArray.length > i1 && (obj.equals(stringArray[0]) && !TextUtils.x(liveStreamPa.name))) {
                uob.c(stringArray[i1], new g(liveStreamPa.name));
             }
          }
       }
       liveStreamPa = uContentPack.liveVoicePartyPackage;
       obj2 = map.get("live_voice_party_package");
       if (!PatchProxy.applyVoidThreeRefs(liveStreamPa, obj2, p2, null, n.class, "10") && (obj2 != null && (!obj2.isEmpty() && liveStreamPa != null))) {
          iterator = obj2.iterator();
          while (iterator.hasNext()) {
             stringArray = (iterator.next()).split(str);
             i1 = 1;
             if (stringArray.length > i1) {
                if (("voicePartyId").equals(stringArray[0]) && !TextUtils.x(liveStreamPa.voicePartyId)) {
                   uob.c(stringArray[i1], new g(liveStreamPa.voicePartyId));
                }else if(("ktvId").equals(stringArray[0]) && !TextUtils.x(liveStreamPa.ktvId)){
                   uob.c(stringArray[1], new g(liveStreamPa.ktvId));
                }else if(("theaterId").equals(stringArray[0]) && !TextUtils.x(liveStreamPa.theaterId)){
                   uob.c(stringArray[1], new g(liveStreamPa.theaterId));
                }else if(("teamPkRoomId").equals(stringArray[0]) && !TextUtils.x(liveStreamPa.teamPkRoomId)){
                   uob.c(stringArray[1], new g(liveStreamPa.teamPkRoomId));
                }
             }
          }
       }
       liveStreamPa = uContentPack.userPackage;
       obj2 = map.get("user_package");
       if (!PatchProxy.applyVoidThreeRefs(liveStreamPa, obj2, p2, null, n.class, "11") && (obj2 != null && (!obj2.isEmpty() && liveStreamPa != null))) {
          iterator = obj2.iterator();
          while (iterator.hasNext()) {
             stringArray = (iterator.next()).split(str);
             i1 = 1;
             if (stringArray.length > i1) {
                if (str1.equals(stringArray[0]) && !TextUtils.x(liveStreamPa.identity)) {
                   uob.c(stringArray[i1], new g(liveStreamPa.identity));
                }else if(obj1.equals(stringArray[0])){
                   uob.c(stringArray[i1], new g(Integer.valueOf(liveStreamPa.index)));
                }else if(("params").equals(stringArray[0])){
                   uob.c(stringArray[i1], new g(liveStreamPa.params));
                }
             }
          }
       }
       uContentPack = uContentPack.profilePackage;
       Object obj3 = map.get("profile_package");
       if (!PatchProxy.applyVoidThreeRefs(uContentPack, obj3, p2, null, n.class, "12") && (obj3 != null && (!obj3.isEmpty() && uContentPack != null))) {
          iterator = obj3.iterator();
          while (iterator.hasNext()) {
             stringArray = (iterator.next()).split(str);
             if (stringArray.length > 1 && (("visitedUid").equals(stringArray[0]) && !TextUtils.x(uContentPack.visitedUid))) {
                uob.c(stringArray[1], new g(uContentPack.visitedUid));
             }
          }
       }
       return;
    }
    public static void c(String p0,String p1,String p2,Map p3,ImmutableMap$b p4){
       object oobject = p0;
       object oobject1 = p1;
       object oobject2 = p2;
       n on = n.class;
       JsonObject obj = null;
       if (PatchProxy.isSupport(on)) {
          Object[] objArray = new Object[]{oobject,oobject1,oobject2,p3,p4};
          if (PatchProxy.applyVoid(objArray, obj, on, "15")) {
             return;
          }
       }
       if (p2.length() > 3000) {
          return;
       }else {
          try{
             obj = new c().a(oobject2).r();
          }catch(java.lang.Exception e0){
             z1.d("urt", p0, oobject1, e0.getMessage());
          }
          JsonObject jsonObject = obj;
          if (jsonObject == null) {
             return;
          }else {
             Iterator iterator = p3.entrySet().iterator();
             while (iterator.hasNext()) {
                Map$Entry uEntry = iterator.next();
                if (uEntry.getValue() == null || uEntry.getValue().size() <= 0) {
                }else {
                   JsonObject jsonObject1 = jsonObject.e0(uEntry.getKey()).r();
                   Iterator iterator1 = uEntry.getValue().iterator();
                   while (iterator1.hasNext()) {
                      String[] stringArray = (iterator1.next()).split(",");
                      if (stringArray.length > 1) {
                         int len = stringArray.length;
                         String[] stringArray1 = new String[len];
                         for (int i = 0; i < stringArray.length; i = i + 1) {
                            stringArray1[i] = CaseFormat.LOWER_CAMEL.to(CaseFormat.LOWER_UNDERSCORE, stringArray[i]);
                         }
                         int i1 = len - 2;
                         len = len - 1;
                         m.e(p0, p1, m.a(p0, oobject1, stringArray1, jsonObject1), stringArray1[i1], stringArray1[len], p4);
                      }else {
                         continue ;
                      }
                   }
                }
             }
             return;
          }
       }
    }
    public static void d(List p0,StidContainerProto$StidContainer p1,ImmutableMap$b p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, n.class, "14")) {
          return;
       }
       if (p0 != null && (p0.size() > 0 && p1 != null)) {
          Iterator iterator = p0.iterator();
          while (iterator.hasNext()) {
             String[] stringArray = (iterator.next()).split(",");
             int i = 1;
             if (stringArray.length > i) {
                int i1 = 0;
                if (("stRecoId").equals(stringArray[i1]) && !TextUtils.x(p1.stRecoId)) {
                   p2.c(stringArray[i], new g(p1.stRecoId));
                }else if(("stAdId").equals(stringArray[i1]) && !TextUtils.x(p1.stAdId)){
                   p2.c(stringArray[i], new g(p1.stAdId));
                }else if(("stKsOrderId").equals(stringArray[i1]) && !TextUtils.x(p1.stKsOrderId)){
                   p2.c(stringArray[i], new g(p1.stKsOrderId));
                }else if(("stSsid").equals(stringArray[i1]) && !TextUtils.x(p1.stSsid)){
                   p2.c(stringArray[i], new g(p1.stSsid));
                }else if(("stPushId").equals(stringArray[i1]) && !TextUtils.x(p1.stPushId)){
                   p2.c(stringArray[i], new g(p1.stPushId));
                }else if(("stDplinkId").equals(stringArray[i1]) && !TextUtils.x(p1.stDplinkId)){
                   p2.c(stringArray[i], new g(p1.stDplinkId));
                }else if(("stRecoStgyId").equals(stringArray[i1]) && !TextUtils.x(p1.stRecoStgyId)){
                   p2.c(stringArray[i], new g(p1.stRecoStgyId));
                }
             }
          }
       }
       return;
    }
}
