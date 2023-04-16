package com.meizu.cloud.pushsdk.handler.d;
import java.lang.String;
import com.meizu.cloud.pushsdk.handler.MessageV3;
import java.lang.StringBuilder;
import com.meizu.cloud.pushinternal.DebugLogger;
import org.json.JSONObject;
import java.util.HashMap;
import java.util.Iterator;
import java.lang.Object;
import java.util.Map;
import org.json.JSONException;
import java.lang.CharSequence;
import android.text.TextUtils;

public class d	// class@00155e
{

    public static MessageV3 a(String p0){
       String str10;
       String str = p0;
       String str1 = "upload_data_package_name";
       String str2 = "push_timestamp";
       String str3 = "pk";
       String str4 = "notification_message";
       String str5 = "task_id";
       String str6 = "through_message";
       String str7 = "parameters";
       String str8 = "message serialize stringToMessageV3 start, msgText="+str;
       String str9 = "MessageSerialize";
       try{
          DebugLogger.i(str9, str8);
          MessageV3 messageV3 = new MessageV3();
          try{
             str10 = str9;
             JSONObject jSONObject = new JSONObject(str);
             if (!jSONObject.isNull(str5)) {
                messageV3.setTaskId(jSONObject.getString(str5));
             }
             if (!jSONObject.isNull("seq_id")) {
                messageV3.setSeqId(jSONObject.getString("seq_id"));
             }
             if (!jSONObject.isNull("device_id")) {
                messageV3.setDeviceId(jSONObject.getString("device_id"));
             }
             if (!jSONObject.isNull("title")) {
                messageV3.setTitle(jSONObject.getString("title"));
             }
             if (!jSONObject.isNull("content")) {
                messageV3.setContent(jSONObject.getString("content"));
             }
             if (!jSONObject.isNull("package_name")) {
                messageV3.setPackageName(jSONObject.getString("package_name"));
             }
             if (!jSONObject.isNull("clickType")) {
                messageV3.setClickType(jSONObject.getInt("clickType"));
             }
             if (!jSONObject.isNull("isDiscard")) {
                messageV3.setIsDiscard(jSONObject.getBoolean("isDiscard"));
             }
             if (!jSONObject.isNull("activity")) {
                messageV3.setActivity(jSONObject.getString("activity"));
             }
             if (!jSONObject.isNull("url")) {
                messageV3.setWebUrl(jSONObject.getString("url"));
             }
             if (!jSONObject.isNull(str3)) {
                messageV3.setUriPackageName(jSONObject.getString(str3));
             }
             if (!jSONObject.isNull(str2)) {
                messageV3.setPushTimestamp(jSONObject.getString(str2));
             }
             if (!jSONObject.isNull(str1)) {
                messageV3.setUploadDataPackageName(jSONObject.getString(str1));
             }
             str = str7;
             if (!jSONObject.isNull(str)) {
                JSONObject jSONObject1 = jSONObject.getJSONObject(str);
                HashMap hashMap = new HashMap(jSONObject1.length());
                Iterator iterator = jSONObject1.keys();
                while (iterator.hasNext()) {
                   str2 = iterator.next();
                   hashMap.put(str2, jSONObject1.getString(str2));
                }
                messageV3.setParamsMap(hashMap);
             }
             str = str6;
             if (!jSONObject.isNull(str)) {
                messageV3.setThroughMessage(jSONObject.getString(str));
             }
             str = str4;
             if (!jSONObject.isNull(str)) {
                messageV3.setNotificationMessage(jSONObject.getString(str));
             }
             str = "message serialize stringToMessageV3 success, messageV3="+messageV3;
             try{
                int i = str10;
                DebugLogger.i(i, str);
                return messageV3;
             }catch(org.json.JSONException e0){
             }
          }catch(org.json.JSONException e0){
             str5 = str10;
          }
       }catch(org.json.JSONException e0){
          str5 = str9;
       }
    }
    public static String a(MessageV3 p0){
       String str = "message serialize messageV3ToString start, messageV3="+p0;
       try{
          DebugLogger.i("MessageSerialize", str);
          JSONObject jSONObject = new JSONObject();
          if (!TextUtils.isEmpty(p0.getTaskId())) {
             jSONObject.put("task_id", p0.getTaskId());
          }
          if (!TextUtils.isEmpty(p0.getSeqId())) {
             jSONObject.put("seq_id", p0.getSeqId());
          }
          if (!TextUtils.isEmpty(p0.getDeviceId())) {
             jSONObject.put("device_id", p0.getDeviceId());
          }
          if (!TextUtils.isEmpty(p0.getTitle())) {
             jSONObject.put("title", p0.getTitle());
          }
          if (!TextUtils.isEmpty(p0.getContent())) {
             jSONObject.put("content", p0.getContent());
          }
          if (!TextUtils.isEmpty(p0.getPackageName())) {
             jSONObject.put("package_name", p0.getPackageName());
          }
          jSONObject.put("clickType", p0.getClickType());
          jSONObject.put("isDiscard", p0.isDiscard());
          if (!TextUtils.isEmpty(p0.getActivity())) {
             jSONObject.put("activity", p0.getActivity());
          }
          if (!TextUtils.isEmpty(p0.getWebUrl())) {
             jSONObject.put("url", p0.getWebUrl());
          }
          if (!TextUtils.isEmpty(p0.getUriPackageName())) {
             jSONObject.put("pk", p0.getUriPackageName());
          }
          if (!TextUtils.isEmpty(p0.getPushTimestamp())) {
             jSONObject.put("push_timestamp", p0.getPushTimestamp());
          }
          if (!TextUtils.isEmpty(p0.getUploadDataPackageName())) {
             jSONObject.put("upload_data_package_name", p0.getUploadDataPackageName());
          }
          if (p0.getParamsMap() != null && p0.getParamsMap().size() > 0) {
             jSONObject.put("parameters", new JSONObject(p0.getParamsMap()));
          }
          if (!TextUtils.isEmpty(p0.getThroughMessage())) {
             jSONObject.put("through_message", p0.getThroughMessage());
          }
          if (!TextUtils.isEmpty(p0.getNotificationMessage())) {
             jSONObject.put("notification_message", p0.getNotificationMessage());
          }
          String str1 = jSONObject.toString();
          DebugLogger.i("MessageSerialize", "message serialize messageV3ToString success, msgText="+str1);
          return str1;
       }catch(org.json.JSONException e5){
          DebugLogger.e("MessageSerialize", "message serialize messageV3ToString error, "+e5.getMessage());
          e5.printStackTrace();
          return null;
       }
    }
}
