package com.yxcorp.download.c;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import org.json.JSONObject;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.utility.Log;
import wkd.b;
import com.yxcorp.gifshow.log.h;
import org.json.JSONException;
import com.yxcorp.download.DownloadTask;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.download.DownloadTask$DownloadTaskType;

public class c	// class@0011b8
{

    public void c(){
       super();
    }
    public static void a(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, c.class, "5")) {
          return;
       }
       try{
          JSONObject jSONObject = new JSONObject();
          jSONObject.put("biz_type", p0);
          if (!TextUtils.x(p1)) {
             jSONObject.put("res_id", p1);
          label_0021 :
             Log.b("DownloadManager:DownloadLoggerUtils", jSONObject.toString());
             h oh = b.a(0x4b316083);
             if (oh != null) {
                oh.logCustomEvent("KWAI_RESOURCE_USAGE", jSONObject.toString());
             }
          }else {
             goto label_0021 ;
          }
       }catch(org.json.JSONException e3){
          e3.printStackTrace();
       }
       return;
    }
    public static boolean b(JSONObject p0,DownloadTask p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       try{
          p0.put("download_lib", "hodor");
          p0.put("download_url", p1.getUrl());
          p0.put("file_size", p1.getTotalBytes());
          p0.put("biz_type", p1.getBizType());
          p0.put("task_type", p1.getDownloadTaskType());
          return true;
       }catch(org.json.JSONException e3){
          e3.printStackTrace();
          return false;
       }
    }
}
