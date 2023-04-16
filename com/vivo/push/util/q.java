package com.vivo.push.util.q;
import java.lang.String;
import com.vivo.push.model.InsideNotificationItem;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.vivo.push.util.p;
import org.json.JSONArray;
import com.vivo.push.model.UPSNotificationMessage;
import org.json.JSONObject;
import java.util.Map;
import com.vivo.push.util.m;
import java.lang.Throwable;
import java.lang.Object;

public final class q	// class@0010bf
{

    public static InsideNotificationItem a(String p0){
       InsideNotificationItem insideNotifi;
       try{
          insideNotifi = new InsideNotificationItem();
          if (TextUtils.isEmpty(p0)) {
             p.a("MessageConvertUtil", "notify msg pack to obj is null");
             return null;
          }else {
             JSONArray jSONArray = new JSONArray(p0);
             insideNotifi.setTargetType(jSONArray.getInt(0));
             insideNotifi.setTragetContext(jSONArray.getString(1));
             insideNotifi.setTitle(jSONArray.getString(2));
             insideNotifi.setContent(jSONArray.getString(3));
             insideNotifi.setNotifyType(jSONArray.getInt(4));
             insideNotifi.setPurePicUrl(jSONArray.getString(5));
             insideNotifi.setIconUrl(jSONArray.getString(6));
             insideNotifi.setCoverUrl(jSONArray.getString(7));
             insideNotifi.setSkipContent(jSONArray.getString(8));
             insideNotifi.setSkipType(jSONArray.getInt(9));
             insideNotifi.setShowTime(jSONArray.getBoolean(10));
             int i = 11;
             if (jSONArray.length() > i) {
                insideNotifi.setParams(m.a(new JSONObject(jSONArray.getString(i))));
             }
             i = 15;
             if (jSONArray.length() > i) {
                insideNotifi.setAppType(jSONArray.getInt(12));
                insideNotifi.setReactPackage(jSONArray.getString(13));
                insideNotifi.setIsShowBigPicOnMobileNet(jSONArray.getBoolean(14));
                insideNotifi.setSuitReactVersion(jSONArray.getString(i));
             }
             i = 16;
             if (jSONArray.length() > i) {
                insideNotifi.setMessageType(jSONArray.getInt(i));
             }
             i = 18;
             if (jSONArray.length() > i) {
                insideNotifi.setIsMacroReplace(jSONArray.getInt(17));
                insideNotifi.setAdClickCheckUrl(jSONArray.getString(i));
             }
             i = 19;
             if (jSONArray.length() > i) {
                insideNotifi.setCompatibleType(jSONArray.getInt(i));
             }
             i = 20;
             if (jSONArray.length() > i) {
                insideNotifi.setInnerPriority(jSONArray.getInt(i));
             }
             if (jSONArray.length() > 21) {
                insideNotifi.setDisplayStyle(jSONArray.getInt(21));
             }
          }
       }catch(org.json.JSONException e4){
          p.a("MessageConvertUtil", "notify msg pack to obj error", e4);
       }
       return insideNotifi;
    }
    public static UPSNotificationMessage a(InsideNotificationItem p0){
       UPSNotificationMessage uPSNotificat = new UPSNotificationMessage();
       uPSNotificat.setTargetType(p0.getTargetType());
       uPSNotificat.setTragetContext(p0.getTragetContent());
       uPSNotificat.setTitle(p0.getTitle());
       uPSNotificat.setContent(p0.getContent());
       uPSNotificat.setNotifyType(p0.getNotifyType());
       uPSNotificat.setPurePicUrl(p0.getPurePicUrl());
       uPSNotificat.setIconUrl(p0.getIconUrl());
       uPSNotificat.setCoverUrl(p0.getCoverUrl());
       uPSNotificat.setSkipContent(p0.getSkipContent());
       uPSNotificat.setSkipType(p0.getSkipType());
       uPSNotificat.setShowTime(p0.isShowTime());
       uPSNotificat.setMsgId(p0.getMsgId());
       uPSNotificat.setParams(p0.getParams());
       return uPSNotificat;
    }
    public static String b(InsideNotificationItem p0){
       JSONArray jSONArray = new JSONArray();
       jSONArray.put(p0.getTargetType());
       jSONArray.put(p0.getTragetContent());
       jSONArray.put(p0.getTitle());
       jSONArray.put(p0.getContent());
       jSONArray.put(p0.getNotifyType());
       jSONArray.put(p0.getPurePicUrl());
       jSONArray.put(p0.getIconUrl());
       jSONArray.put(p0.getCoverUrl());
       jSONArray.put(p0.getSkipContent());
       jSONArray.put(p0.getSkipType());
       jSONArray.put(p0.isShowTime());
       if (p0.getParams() != null) {
          jSONArray.put(new JSONObject(p0.getParams()));
       }else {
          jSONArray.put("{}");
       }
       jSONArray.put(p0.getAppType());
       jSONArray.put(p0.getReactPackage());
       jSONArray.put(p0.isShowBigPicOnMobileNet());
       jSONArray.put(p0.getSuitReactVersion());
       jSONArray.put(p0.getMessageType());
       jSONArray.put(p0.getIsMacroReplace());
       jSONArray.put(p0.getAdClickCheckUrl());
       jSONArray.put(p0.getCompatibleType());
       jSONArray.put(p0.getInnerPriority());
       jSONArray.put(p0.getDisplayStyle());
       return jSONArray.toString();
    }
}
