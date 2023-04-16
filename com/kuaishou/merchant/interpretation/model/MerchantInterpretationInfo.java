package com.kuaishou.merchant.interpretation.model.MerchantInterpretationInfo;
import im8.g;
import java.lang.Object;
import java.util.ArrayList;
import com.kuaishou.merchant.api.core.model.Commodity;
import java.lang.String;
import java.util.List;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import fg6.a;
import com.kuaishou.merchant.interpretation.model.MerchantInterpretationInfo$a;
import java.lang.reflect.Type;
import el.a;
import com.google.gson.Gson;
import java.util.Collection;
import ekd.q;
import h04.c;
import java.lang.StringBuilder;
import q87.c;
import java.lang.Throwable;
import java.util.Map;
import android.net.Uri;
import lnc.o5;
import com.kuaishou.merchant.api.core.model.Commodity$ExtraInfo;
import java.lang.Integer;
import java.lang.CharSequence;
import android.text.TextUtils;
import org.json.JSONArray;
import k04.c;
import java.util.HashMap;

public class MerchantInterpretationInfo implements g	// class@001847
{
    public int channel;
    public Commodity commodity;
    public List coverUrls;
    public int entranceType;
    public String liveStreamId;
    public String mLiveJumpUrl;
    public String mPayload;
    public String pageUrl;
    public List photoUrls;
    public boolean requestNetwork;
    public String searchSessionId;
    public String sellerId;
    public String serverExpTag;

    public void MerchantInterpretationInfo(){
       super();
       this.photoUrls = new ArrayList();
       this.coverUrls = new ArrayList();
       this.commodity = new Commodity();
    }
    public static List parseCdnUrlArrayString(String p0){
       int i;
       ArrayList obj = PatchProxy.applyOneRefs(p0, null, MerchantInterpretationInfo.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       try{
          i = 0;
          List list = a.a.i(p0, new MerchantInterpretationInfo$a().getType());
          if (!q.f(list)) {
             obj.addAll(list);
          }
          Object[] objArray1 = new Object[i];
          c.C().w("MerchantInterpretationInfo", "cdns.size = "+obj.size(), objArray1);
       }catch(com.google.gson.JsonSyntaxException e5){
          Object[] objArray = new Object[i];
          c.C().u("MerchantInterpretationInfo", e5, objArray);
       }
       return obj;
    }
    public static MerchantInterpretationInfo parseData(Map p0,Uri p1){
       Object[] objArray;
       MerchantInterpretationInfo obj = PatchProxy.applyTwoRefs(p0, p1, null, MerchantInterpretationInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new MerchantInterpretationInfo();
       obj.commodity.mId = p0.get("itemId");
       obj.commodity.mShowIconList = MerchantInterpretationInfo.parseIntArray(p0.get("showIconList"));
       obj.commodity.mTitle = p0.get("title");
       obj.commodity.mImageUrls = MerchantInterpretationInfo.parseCdnUrlArrayString(p0.get("imageUrls"));
       obj.commodity.mDisplayPrice = p0.get("price");
       obj.commodity.mJumpUrl = p0.get("jumpUrl");
       obj.sellerId = p0.get("sellerId");
       int i = o5.b(p0.get("channel"), 0);
       try{
          obj.channel = i;
          obj.commodity.getExtraInfo().mSaleType = Integer.parseInt(p0.get("itemSaleType"));
       }catch(java.lang.NumberFormatException e2){
          objArray = new Object[0];
          c.C().u("MerchantInterpretationInfo", e2, objArray);
       }
       try{
          obj.entranceType = Integer.parseInt(p0.get("entranceType"));
       }catch(java.lang.NumberFormatException e2){
          objArray = new Object[0];
          c.C().u("MerchantInterpretationInfo", e2, objArray);
       }
       String str = p0.get("payload");
       try{
          obj.mPayload = str;
          boolean b = true;
          if (Integer.parseInt(p0.get("requestType")) != b) {
             b = false;
          }
          obj.requestNetwork = b;
       }catch(java.lang.NumberFormatException e2){
          Object[] objArray1 = new Object[0];
          c.C().u("MerchantInterpretationInfo", e2, objArray1);
       }
       obj.liveStreamId = p0.get("liveStreamId");
       obj.photoUrls = MerchantInterpretationInfo.parseCdnUrlArrayString(p0.get("photoUrls"));
       obj.coverUrls = MerchantInterpretationInfo.parseCdnUrlArrayString(p0.get("coverUrls"));
       obj.serverExpTag = p0.get("serverExpTag");
       obj.searchSessionId = p0.get("sessionId");
       obj.mLiveJumpUrl = p0.get("liveJumpLink");
       obj.pageUrl = p1.toString();
       return obj;
    }
    public static int[] parseIntArray(String p0){
       int[] ointArray = null;
       Object[] obj = PatchProxy.applyOneRefs(p0, ointArray, MerchantInterpretationInfo.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = 0;
       try{
          if (!TextUtils.isEmpty(p0)) {
             JSONArray jSONArray = new JSONArray(p0);
             if (jSONArray.length() <= 0) {
                return ointArray;
             }else {
                ointArray = new int[jSONArray.length()];
                int i = 0;
                while (i <= jSONArray.length()) {
                   Object obj1 = jSONArray.get(i);
                   if (obj1 instanceof Integer) {
                      ointArray[i] = obj1.intValue();
                   }else if(obj1 instanceof String){
                      ointArray[i] = Integer.valueOf(Integer.parseInt(obj1)).intValue();
                   }
                   i++;
                }
             }
          }
       }catch(org.json.JSONException e5){
          obj = new Object[obj];
          c.C().u("MerchantInterpretationInfo", e5, obj);
       }
       return ointArray;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, MerchantInterpretationInfo.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new c();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, MerchantInterpretationInfo.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(MerchantInterpretationInfo.class, new c());
       }else {
          obj.put(MerchantInterpretationInfo.class, null);
       }
       return obj;
    }
}
