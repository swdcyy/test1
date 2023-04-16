package f3b.u;
import java.lang.Object;
import java.lang.StringBuilder;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.protobuf.log.nano.StidContainerProto$StidContainer;
import com.kwai.robust.PatchProxyResult;
import fud.b;
import java.lang.Throwable;
import com.yxcorp.utility.Log;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.yxcorp.gifshow.log.model.FeedLogCtx;
import com.kuaishou.client.log.content.packages.nano.ClientContent$FeedLogContext;
import com.google.protobuf.nano.MessageNano;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ShowEvent;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ClickEvent;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$TaskEvent;
import java.util.Map;
import java.util.List;
import k2b.x1;
import com.yxcorp.gifshow.log.n;
import org.json.JSONObject;
import y2b.a;
import java.util.Objects;
import y2b.b;
import java.util.ArrayList;
import java.util.Collection;
import java.lang.Number;
import f3b.g;
import org.json.JSONArray;

public final class u	// class@002892
{
    public static Map a;

    public void u(){
       super();
    }
    public static void a(StringBuilder p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, u.class, "9")) {
          return;
       }
       if (!TextUtils.x(p1)) {
          if (p0.length() > 0) {
             p0 = p0+",";
          }
          p0+p1;
       }
       return;
    }
    public static StidContainerProto$StidContainer b(String p0,String p1){
       Object obj = null;
       StidContainerProto$StidContainer obj1 = PatchProxy.applyTwoRefs(p0, p1, obj, u.class, "11");
       if (obj1 != PatchProxyResult.class) {
          return obj1;
       }
       if (TextUtils.x(p1)) {
          return obj;
       }
       obj1 = new StidContainerProto$StidContainer();
       if (("st_push_id").equals(p0)) {
          obj1.stPushId = p1;
       }else if(("st_dplink_id").equals(p0)){
          obj1.stDplinkId = p1;
       }else if(("st_ad_id").equals(p0)){
          obj1.stAdId = p1;
       }else if(("st_ks_order_id").equals(p0)){
          obj1.stKsOrderId = p1;
       }else if(("st_reco_id").equals(p0)){
          obj1.stRecoId = p1;
       }else if(("st_ssid").equals(p0)){
          obj1.stSsid = p1;
       }else if(("st_reco_stgy_id").equals(p0)){
          obj1.stRecoStgyId = p1;
       }
       return obj1;
    }
    public static StidContainerProto$StidContainer c(String p0){
       StidContainerProto$StidContainer obj = null;
       Object obj1 = PatchProxy.applyOneRefs(p0, obj, u.class, "10");
       if (obj1 != PatchProxyResult.class) {
          return obj1;
       }
       if (TextUtils.x(p0)) {
          return obj;
       }
       try{
          obj = StidContainerProto$StidContainer.parseFrom(b.i(p0));
       }catch(com.google.protobuf.nano.InvalidProtocolBufferNanoException e5){
          Log.e("StidContainerUtils", "buildStidContainerFromString", e5);
       }catch(java.lang.Exception e5){
          Log.e("StidContainerUtils", "buildStidContainerFromString", e5);
       }
       return obj;
    }
    public static void d(ClientContent$ContentPackage p0){
       ClientContent$ContentPackage photoPackage = p0.photoPackage;
       if (photoPackage != null) {
          photoPackage.feedLogCtx = null;
       }
       p0 = p0.liveStreamPackage;
       if (p0 != null) {
          p0.feedLogCtx = null;
       }
       return;
    }
    public static StidContainerProto$StidContainer e(StidContainerProto$StidContainer p0){
       Object obj = null;
       StidContainerProto$StidContainer obj1 = PatchProxy.applyOneRefs(p0, obj, u.class, "6");
       if (obj1 != PatchProxyResult.class) {
          return obj1;
       }
       if (p0 == null) {
          return obj;
       }
       obj1 = new StidContainerProto$StidContainer();
       obj1.stAdId = p0.stAdId;
       obj1.stKsOrderId = p0.stKsOrderId;
       obj1.stRecoId = p0.stRecoId;
       obj1.stSsid = p0.stSsid;
       obj1.stPushId = p0.stPushId;
       obj1.stDplinkId = p0.stDplinkId;
       obj1.stRecoStgyId = p0.stRecoStgyId;
       return obj1;
    }
    public static ClientContent$FeedLogContext f(FeedLogCtx p0){
       ClientContent$FeedLogContext obj = PatchProxy.applyOneRefs(p0, null, u.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ClientContent$FeedLogContext();
       if (p0 == null) {
          return obj;
       }
       obj.interStidContainer = TextUtils.k(p0.stidContainer);
       obj.interStExParams = TextUtils.k(p0.stExParams);
       return obj;
    }
    public static void g(MessageNano p0,String p1,String p2,String p3){
       ClientEvent$ShowEvent showEvent;
       ClientEvent$ShowEvent contentPacka;
       ClientContent$PhotoPackage photoPackage1;
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, null, u.class, "20")) {
          return;
       }
       v0 = p0 instanceof ClientEvent$ShowEvent;
       ClientContent$FeedLogContext uFeedLogCont = null;
       if (v0) {
          showEvent = p0;
          contentPacka = showEvent.contentPackage;
          showEvent = showEvent.interStidContainer;
       }else if(p0 instanceof ClientEvent$ClickEvent){
          ClientEvent$ClickEvent uClickEvent = p0;
          contentPacka = uClickEvent.contentPackage;
          uClickEvent = uClickEvent.interStidContainer;
       }else if(p0 instanceof ClientEvent$TaskEvent){
          ClientEvent$TaskEvent taskEvent = p0;
          contentPacka = taskEvent.contentPackage;
          taskEvent = taskEvent.interStidContainer;
       }else {
          ClientContent$FeedLogContext uFeedLogCont1 = uFeedLogCont;
          contentPacka = uFeedLogCont1;
       }
       if (contentPacka == null) {
          return;
       }else if(showEvent == null && (u.h() != null && (u.h().isEmpty() || !u.h().containsKey(p1)))){
          u.d(contentPacka);
          return;
       }else {
          ClientContent$ContentPackage photoPackage = contentPacka.photoPackage;
          if (photoPackage != null) {
             photoPackage1 = photoPackage.feedLogCtx;
             if (photoPackage1 != null) {
             label_0060 :
                uFeedLogCont = photoPackage1;
             }else {
             label_0062 :
                photoPackage = contentPacka.liveStreamPackage;
                if (photoPackage != null) {
                   photoPackage1 = photoPackage.feedLogCtx;
                   if (photoPackage1 != null) {
                      goto label_0060 ;
                   }
                }
             }
          }else {
             goto label_0062 ;
          }
          u.d(contentPacka);
          if (uFeedLogCont == null) {
             return;
          }else {
             Map map = u.h().get(p1);
             if (map == null) {
                return;
             }else {
                photoPackage1 = 0;
                if (map.get(p2) == null || !map.get(p2).contains(p3)) {
                   p2 = "APP_GENERAL";
                   if (map.get(p2) == null || !map.get(p2).contains(p3)) {
                   label_00a7 :
                      if (photoPackage1) {
                         StidContainerProto$StidContainer stidContaine = u.c(uFeedLogCont.interStidContainer);
                         ClientContent$FeedLogContext interStExPar = uFeedLogCont.interStExParams;
                         if (stidContaine == null) {
                            Log.g("StidContainerUtils", "fillInterStidContainer interStidContainer is null not fill");
                            return;
                         }else if(v0){
                            p0.interStidContainer = stidContaine;
                            p0.interStExParams = TextUtils.k(interStExPar);
                         }else if(p0 instanceof ClientEvent$ClickEvent){
                            p0.interStidContainer = stidContaine;
                            p0.interStExParams = TextUtils.k(interStExPar);
                         }else if(p0 instanceof ClientEvent$TaskEvent){
                            p0.interStidContainer = stidContaine;
                            p0.interStExParams = TextUtils.k(interStExPar);
                         }
                      }
                      return;
                   }
                }
                photoPackage1 = 1;
                goto label_00a7 ;
             }
          }
       }
    }
    public static Map h(){
       Object obj = PatchProxy.apply(null, null, u.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (u.a == null) {
          u.a = n.A1().J();
       }
       return u.a;
    }
    public static JSONObject i(JSONObject p0,String p1,String p2){
       String str6;
       int i3;
       JSONObject jSONObject1;
       int i4;
       int i5;
       object obj = p0;
       String obj1 = PatchProxy.applyThreeRefs(p0, p1, p2, null, u.class, "4");
       if (obj1 != PatchProxyResult.class) {
          return obj1;
       }
       String[] stringArray = new String[0];
       if (!TextUtils.x(p2)) {
          stringArray = (p2).split(",");
       }
       String obj2 = null;
       JSONObject jSONObject = PatchProxy.applyOneRefs(obj, obj2, u.class, "3");
       if (jSONObject != PatchProxyResult.class) {
       }else if(obj != null){
          try{
             jSONObject = new JSONObject(p0.toString());
          label_004e :
             if (jSONObject == null) {
                jSONObject = new JSONObject();
             }
          }catch(java.lang.Exception e0){
             Log.e("StidContainerUtils", "copyJSONObject", e0);
          }
          jSONObject = obj2;
          goto label_004e ;
       }else {
          goto label_004d ;
       }
       if (stringArray != null && stringArray.length) {
          int len = stringArray.length;
          int i = 0;
          while (i < len) {
             obj = stringArray[i];
             String str = PatchProxy.applyOneRefs(obj, obj2, a.class, "2");
             String str1 = "";
             obj1 = "st_ad_id";
             String str2 = "st_reco_stgy_id";
             obj2 = "st_reco_id";
             String[] stringArray1 = stringArray;
             String str3 = "st_ks_order_id";
             int i1 = len;
             String str4 = "st_ssid";
             if (str != PatchProxyResult.class) {
             }else {
                Objects.requireNonNull(obj);
                switch (obj.hashCode()){
                    case 0x8ecf8299:
                      if (obj.equals(str4)) {
                         i5 = 0;
                      }
                      break;
                    case 0xac789bc5:
                      if (obj.equals(str3)) {
                         i5 = 1;
                      }
                      break;
                    case 0xb9169b9d:
                      if (obj.equals(obj2)) {
                         i5 = 2;
                      }
                      break;
                    case 0xfb7c4916:
                      if (obj.equals("st_dplink_id")) {
                         i5 = 3;
                      }
                      break;
                    case 0x41eae085:
                      if (obj.equals(str2)) {
                         i5 = 4;
                      }
                      break;
                    case 0x4a1c3359:
                      if (obj.equals(obj1)) {
                         i5 = 5;
                      }
                      break;
                    case 0x6b75f882:
                      if (obj.equals("st_push_id")) {
                         i5 = 6;
                      }
                      break;
                    default:
                   label_0097 :
                      i5 = -1;
                }
                switch (i5){
                    case 0:
                      str = "s_ss";
                      break;
                    case 1:
                      str = "s_orid";
                      break;
                    case 2:
                      str = "s_reco";
                      break;
                    case 3:
                      str = "s_dp";
                      break;
                    case 4:
                      str = "s_stgy";
                      break;
                    case 5:
                      str = "s_ad";
                      break;
                    case 6:
                      str = "s_push";
                      break;
                    default:
                      str = str1;
                }
             }
             int i2 = i;
             String str5 = str1;
             Object obj3 = null;
             Object obj4 = PatchProxy.applyOneRefs(obj, obj3, a.class, "3");
             if (obj4 != PatchProxyResult.class) {
                str6 = obj4;
             }else {
                Objects.requireNonNull(obj);
                switch (obj.hashCode()){
                    case 0x8ecf8299:
                      if (obj.equals(str4)) {
                         i4 = 0;
                      }
                      break;
                    case 0xac789bc5:
                      if (obj.equals(str3)) {
                         i4 = 1;
                      }
                      break;
                    case 0xb9169b9d:
                      if (obj.equals(obj2)) {
                         i4 = 2;
                      }
                      break;
                    case 0xfb7c4916:
                      if (obj.equals("st_dplink_id")) {
                         i4 = 3;
                      }
                      break;
                    case 0x41eae085:
                      if (obj.equals(str2)) {
                         i4 = 4;
                      }
                      break;
                    case 0x4a1c3359:
                      if (obj.equals(obj1)) {
                         i4 = 5;
                      }
                      break;
                    case 0x6b75f882:
                      if (obj.equals("st_push_id")) {
                         i4 = 6;
                      }
                      break;
                    default:
                   label_010b :
                      i4 = -1;
                }
                switch (i4){
                    case 0:
                      str6 = "c_ss";
                      break;
                    case 1:
                      str6 = "c_orid";
                      break;
                    case 2:
                      str6 = "c_reco";
                      break;
                    case 3:
                      str6 = "c_dp";
                      break;
                    case 4:
                      str6 = "c_stgy";
                      break;
                    case 5:
                      str6 = "c_ad";
                      break;
                    case 6:
                      str6 = "c_push";
                      break;
                    default:
                      obj1 = str5;
                   label_0166 :
                      if (!TextUtils.x(str) && !TextUtils.x(obj1)) {
                         if (!TextUtils.x(p1)) {
                            try{
                               obj2 = p1;
                               try{
                                  jSONObject1 = new JSONObject(obj2);
                               label_018f :
                                  if (jSONObject1 != null && jSONObject1.has(str)) {
                                     try{
                                        jSONObject.put(str, jSONObject1.get(str));
                                     }catch(java.lang.Exception e0){
                                        Log.e("StidContainerUtils", "getStExParamsMerge", e0);
                                     }
                                  }else {
                                     jSONObject.remove(str);
                                  }
                               }catch(java.lang.Exception e0){
                               }
                               Log.e("StidContainerUtils", "getStExParamsMerge", e0);
                            label_018e :
                               jSONObject1 = obj3;
                               goto label_018f ;
                            }catch(java.lang.Exception e0){
                               i3 = p1;
                               goto label_0188 ;
                            }
                         }else {
                            i3 = p1;
                            goto label_018e ;
                         }
                      }else {
                         i3 = p1;
                      }
                }
             }
             obj1 = str6;
             goto label_0166 ;
             i = i2 + 1;
             obj2 = obj3;
             stringArray = stringArray1;
             len = i1;
             obj1 = null;
          }
       }
       return jSONObject;
    }
    public static JSONObject j(StidContainerProto$StidContainer p0){
       JSONObject obj = PatchProxy.applyOneRefs(p0, null, u.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new JSONObject();
       if (p0 != null) {
          u.p(obj, "st_ad_id", p0.stAdId);
          u.p(obj, "st_ks_order_id", p0.stKsOrderId);
          u.p(obj, "st_reco_id", p0.stRecoId);
          u.p(obj, "st_ssid", p0.stSsid);
          u.p(obj, "st_push_id", p0.stPushId);
          u.p(obj, "st_dplink_id", p0.stDplinkId);
          u.p(obj, "st_reco_stgy_id", p0.stRecoStgyId);
       }
       return obj;
    }
    public static String k(StidContainerProto$StidContainer p0){
       StringBuilder obj = PatchProxy.applyOneRefs(p0, null, u.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = "";
       if (p0 != null) {
          if (!TextUtils.x(p0.stAdId)) {
             u.a(obj, "st_ad_id");
          }
          if (!TextUtils.x(p0.stKsOrderId)) {
             u.a(obj, "st_ks_order_id");
          }
          if (!TextUtils.x(p0.stRecoId)) {
             u.a(obj, "st_reco_id");
          }
          if (!TextUtils.x(p0.stSsid)) {
             u.a(obj, "st_ssid");
          }
          if (!TextUtils.x(p0.stPushId)) {
             u.a(obj, "st_push_id");
          }
          if (!TextUtils.x(p0.stDplinkId)) {
             u.a(obj, "st_dplink_id");
          }
          if (!TextUtils.x(p0.stRecoStgyId)) {
             u.a(obj, "st_reco_stgy_id");
          }
       }
       return obj;
    }
    public static List l(String p0,b p1){
       List list;
       ArrayList obj = PatchProxy.applyTwoRefs(p0, p1, null, u.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       if (p1 != null && (p1.d() != null && p1.d().size() > 0)) {
          obj.addAll(p1.d());
       }
    label_002e :
       if (!TextUtils.x(p0) && !("st_reco_id").equals(p0)) {
          obj.add(p0);
       }
       if (obj.size() > u.m()) {
          list = obj.subList((obj.size() - u.m()), obj.size());
       }
       return list;
    }
    public static int m(){
       Object obj = PatchProxy.apply(null, null, u.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = 10;
       if (n.A1().d() > i) {
          return i;
       }
       if (n.A1().d() < 1) {
          return 1;
       }
       return n.A1().d();
    }
    public static StidContainerProto$StidContainer n(StidContainerProto$StidContainer p0,StidContainerProto$StidContainer p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, u.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       p0 = u.e(p0);
       if (p0 == null) {
          p0 = u.e(p1);
       }else if(p1 != null){
          if (!TextUtils.x(p1.stAdId)) {
             p0.stAdId = p1.stAdId;
          }
          if (!TextUtils.x(p1.stKsOrderId)) {
             p0.stKsOrderId = p1.stKsOrderId;
          }
          if (!TextUtils.x(p1.stRecoId)) {
             p0.stRecoId = p1.stRecoId;
          }
          if (!TextUtils.x(p1.stSsid)) {
             p0.stSsid = p1.stSsid;
          }
          if (!TextUtils.x(p1.stPushId)) {
             p0.stPushId = p1.stPushId;
          }
          if (!TextUtils.x(p1.stDplinkId)) {
             p0.stDplinkId = p1.stDplinkId;
          }
          if (!TextUtils.x(p1.stRecoStgyId)) {
             p0.stRecoStgyId = p1.stRecoStgyId;
          }
       }
       return p0;
    }
    public static void o(JSONObject p0,String p1,JSONObject p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, u.class, "18")) {
          return;
       }
       if (!TextUtils.x(p1)) {
          try{
             p0.put(p1, p2);
          }catch(java.lang.Exception e6){
             Log.e("StidContainerUtils", "putJsonObjToJsonObj", e6);
          }
       }
    }
    public static void p(JSONObject p0,String p1,String p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, u.class, "17")) {
          return;
       }
       if (!TextUtils.x(p2) && !TextUtils.x(p1)) {
          try{
             p0.put(p1, p2);
          }catch(java.lang.Exception e6){
             Log.e("StidContainerUtils", "putStringToJsonObj", e6);
          }
       }
    }
    public static String q(StidContainerProto$StidContainer p0,String p1,String p2,List p3){
       String str = "";
       JSONObject obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, null, u.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          obj = new JSONObject();
          p1 = g.c(p0, p1, "toJson", str);
          if (p0 != null) {
             JSONObject jSONObject = u.j(p0);
             if (jSONObject != null && jSONObject.length() > 0) {
                u.o(obj, "stid_container", jSONObject);
             }
          }
          try{
             if (!TextUtils.x(p1)) {
                u.o(obj, "st_ex_params", new JSONObject(p1));
             }
          }catch(java.lang.Exception e9){
             Log.e("StidContainerUtils", "stidDataToJsonString", e9);
          }
          if (!TextUtils.x(p2)) {
             u.p(obj, "stid_merge", p2);
          }
          if (p3 != null && p3.size() > 0) {
             obj.put("st_merge_array", new JSONArray(p3));
          }
       }catch(java.lang.Exception e9){
          Log.e("StidContainerUtils", "stidDataToJsonString1", e9);
       }
    label_0071 :
       if (obj.length() > 0) {
          str = obj.toString();
       }
       return str;
    }
}
