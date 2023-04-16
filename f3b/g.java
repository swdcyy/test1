package f3b.g;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.log.utils.FeedLogCtxLenConfigManager;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;
import k2b.z1;
import com.kuaishou.protobuf.log.nano.StidContainerProto$StidContainer;
import java.lang.System;
import k2b.x1;
import com.yxcorp.gifshow.log.n;
import com.google.protobuf.nano.MessageNano;
import org.json.JSONObject;
import java.lang.Throwable;

public class g	// class@002883
{

    public void g(){
       super();
    }
    public static String a(String p0,String p1,String p2,String p3){
       Object obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, null, g.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int feedLogCtxMa = FeedLogCtxLenConfigManager.getFeedLogCtxMaxLength();
       if (!TextUtils.x(p0)) {
          int i = p0.length();
          if (i > feedLogCtxMa) {
             Log.g("FeedLogCtxScissors", "[stidcheck] stid > limit  eventType="+p2+" action="+p3+" "+p1+" stidLen="+i+" stidStr="+p0);
             z1.f(p2, p3, "id_limit", p1, i, feedLogCtxMa);
             p0 = "";
          }
       }
       return p0;
    }
    public static StidContainerProto$StidContainer b(StidContainerProto$StidContainer p0,String p1,String p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, g.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       p0.stAdId = g.d(p0.stAdId, "st_ad_id", p1, p2);
       p0.stRecoId = g.d(p0.stRecoId, "st_reco_id", p1, p2);
       p0.stSsid = g.d(p0.stSsid, "st_ssid", p1, p2);
       p0.stKsOrderId = g.d(p0.stKsOrderId, "st_ks_order_id", p1, p2);
       p0.stPushId = g.d(p0.stPushId, "st_push_id", p1, p2);
       p0.stDplinkId = g.d(p0.stDplinkId, "st_dplink_id", p1, p2);
       p0.stRecoStgyId = g.d(p0.stRecoStgyId, "st_reco_stgy_id", p1, p2);
       return p0;
    }
    public static String c(StidContainerProto$StidContainer p0,String p1,String p2,String p3){
       int i1;
       String str12;
       long l1;
       String str13;
       String str14;
       String str15;
       String str16;
       int i2;
       int i3;
       int i4;
       StidContainerProto$StidContainer stidContaine = p0;
       String str = p2;
       String str1 = p3;
       StidContainerProto$StidContainer obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, null, g.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       String str2 = "";
       if (!stidContaine) {
          return str2;
       }
       long l = System.currentTimeMillis();
       String str3 = " action=";
       Log.b("FeedLogCtxScissors", "cutStidData eventType="+str+str3+str1);
       if (n.A1().r()) {
          String str4 = "st_reco_stgy_id";
          String str5 = "st_ssid";
          String str6 = "st_ad_id";
          String str7 = "st_reco_id";
          if (!PatchProxy.applyVoidThreeRefs(p0, p2, p3, null, g.class, "4")) {
             stidContaine.stRecoId = g.a(stidContaine.stRecoId, str7, str, str1);
             stidContaine.stAdId = g.a(stidContaine.stAdId, str6, str, str1);
             stidContaine.stKsOrderId = g.a(stidContaine.stKsOrderId, "st_ks_order_id", str, str1);
             stidContaine.stSsid = g.a(stidContaine.stSsid, str5, str, str1);
             stidContaine.stPushId = g.a(stidContaine.stPushId, "st_push_id", str, str1);
             stidContaine.stDplinkId = g.a(stidContaine.stDplinkId, "st_dplink_id", str, str1);
             stidContaine.stRecoStgyId = g.a(stidContaine.stRecoStgyId, str4, str, str1);
          }
          String str8 = " stExParamsLen=";
          String str9 = " st_ex_params stExParamsLen > ";
          String str10 = str6;
          str6 = "[stidcheck] remove st_ex_params field eventType=";
          int i = 1;
          String str11 = str2;
          if (!TextUtils.x(p1)) {
             i1 = p1.length();
             if (i1 > FeedLogCtxLenConfigManager.getFeedLogCtxMaxLength()) {
                Log.g("FeedLogCtxScissors", str6+str+str3+str1+str9+0+str8+0);
                str2 = str9;
                str12 = str8;
                l1 = l;
                str13 = str7;
                str14 = str10;
                str10 = str4;
                str4 = str6;
                str15 = str5;
                z1.f(p2, p3, "id_limit", "st_ex_params", 0, FeedLogCtxLenConfigManager.getFeedLogCtxMaxLength());
                str16 = str11;
                i2 = 0;
                i3 = 1;
             label_0135 :
                int cachedSize = p0.getCachedSize();
                if ((cachedSize + i2) > FeedLogCtxLenConfigManager.getFeedLogCtxMaxLength()) {
                   if (i2 > 0) {
                      Log.g("FeedLogCtxScissors", str4+str+str3+str1+str2+i2+str12+i2);
                      i4 = cachedSize;
                      z1.f(p2, p3, "del_ex", "st_ex_params", i2, FeedLogCtxLenConfigManager.getFeedLogCtxMaxLength());
                   }else {
                      i4 = cachedSize;
                   }
                   if (i4 > FeedLogCtxLenConfigManager.getFeedLogCtxMaxLength()) {
                      obj = PatchProxy.applyThreeRefs(p0, p2, p3, null, g.class, "6");
                      if (obj != PatchProxyResult.class) {
                      }else {
                         stidContaine.stRecoId = g.e(stidContaine.stRecoId, str13, str, str1);
                         stidContaine.stAdId = g.e(stidContaine.stAdId, str14, str, str1);
                         stidContaine.stSsid = g.e(stidContaine.stSsid, str15, str, str1);
                         stidContaine.stRecoStgyId = g.e(stidContaine.stRecoStgyId, str10, str, str1);
                         obj = stidContaine;
                      }
                      g.b(obj, str, str1);
                   }
                }else {
                   i = i3;
                }
                Log.b("FeedLogCtxScissors", "校验完成 t="+(System.currentTimeMillis() - l1));
                str2 = (i)? str11: str16;
                return str2;
             }else {
                str2 = str9;
                str12 = str8;
                str15 = str5;
                l1 = l;
                str14 = str10;
                str13 = str7;
                str10 = str4;
                str4 = str6;
             }
          }else {
             str2 = str9;
             str12 = str8;
             str15 = str5;
             l1 = l;
             str14 = str10;
             str13 = str7;
             str10 = str4;
             str4 = str6;
             i1 = 0;
          }
          str16 = p1;
          i2 = i1;
          i3 = 0;
          goto label_0135 ;
       }else {
          g.b(stidContaine, str, str1);
          Log.b("FeedLogCtxScissors", "校验完成2 t="+(System.currentTimeMillis() - l));
          return str2;
       }
    }
    public static String d(String p0,String p1,String p2,String p3){
       Object obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, null, g.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (TextUtils.x(p0)) {
          return "";
       }
       int stidIdMaxLen = FeedLogCtxLenConfigManager.getStidIdMaxLen();
       int i = p0.length();
       if (i <= stidIdMaxLen) {
          return p0;
       }
       Log.g("FeedLogCtxScissors", "[stidcheck] cut stid string eventType="+p2+" action="+p3+" "+p1+" stidLen="+i+" stidStr="+p0);
       z1.f(p2, p3, "del_id", p1, i, stidIdMaxLen);
       return "";
    }
    public static String e(String p0,String p1,String p2,String p3){
       String str2;
       JSONObject jSONObject;
       StringBuilder str = p0;
       Object obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, null, g.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       String str1 = "";
       if (TextUtils.x(p0)) {
          return str1;
       }
       boolean b = false;
       try{
          int i = p0.length();
          int i1 = str.lastIndexOf("|");
          if (i1 >= 0) {
             int i2 = i1 + 1;
             if (i2 < i) {
                str2 = str.substring(0, i1);
                try{
                   String str3 = str.substring(i2);
                   if (str3.length() > 0) {
                      try{
                         jSONObject = new JSONObject(str3);
                         if (jSONObject.has("f")) {
                            Log.g("FeedLogCtxScissors", "[stidcheck] remove f field eventType="+p2+" action="+p3+" "+p1+" stidLen="+i+" stidStr="+str);
                            z1.f(p2, p3, "f", p1, i, FeedLogCtxLenConfigManager.getFeedLogCtxMaxLength());
                            jSONObject.remove("f");
                         }
                         b = jSONObject;
                      }catch(java.lang.Exception e0){
                         b = jSONObject;
                      }
                   }
                }catch(java.lang.Exception e0){
                }
             }else {
             label_00a5 :
                str2 = str1;
             }
          }else {
             goto label_00a5 ;
          }
       }catch(java.lang.Exception e0){
          str2 = str1;
       }
       str = str2;
       if (b) {
          str1 = b.toString();
       }
       return str+"|"+str1;
    }
    public static String f(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, g.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!TextUtils.x(p0)) {
          int i = p0.indexOf("|", (p0.indexOf("|", (p0.indexOf("|") + 1)) + 1));
          if (i > 0) {
             p0 = p0.substring(0, i);
          }
       }else {
          p0 = "";
       }
       return p0;
    }
}
