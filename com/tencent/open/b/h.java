package com.tencent.open.b.h;
import java.lang.Object;
import java.util.Random;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.concurrent.Executor;
import com.tencent.open.utils.j;
import android.os.HandlerThread;
import java.lang.String;
import android.os.Looper;
import com.tencent.open.b.h$1;
import android.content.Context;
import com.tencent.open.utils.f;
import com.tencent.open.utils.g;
import android.os.Bundle;
import java.lang.StringBuilder;
import com.tencent.open.log.SLog;
import com.tencent.open.b.h$2;
import java.lang.Runnable;
import com.tencent.open.b.h$3;
import java.util.Map;
import com.tencent.open.utils.k;
import com.tencent.open.b.h$6;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.Integer;
import com.tencent.open.b.f;
import com.tencent.open.b.h$4;
import com.tencent.open.b.c;
import java.util.HashMap;
import com.tencent.open.b.g;
import java.util.Collection;
import android.os.Build;
import com.tencent.open.b.d;
import java.lang.Throwable;
import org.json.JSONArray;
import java.util.Iterator;
import java.io.Serializable;
import org.json.JSONObject;
import java.util.Set;
import com.tencent.open.b.h$5;

public class h	// class@000f51
{
    public Random b;
    public List c;
    public List d;
    public HandlerThread e;
    public Handler f;
    public Executor g;
    public Executor h;
    public static h a;

    public void h(){
       super();
       this.e = null;
       this.b = new Random();
       this.d = Collections.synchronizedList(new ArrayList());
       this.c = Collections.synchronizedList(new ArrayList());
       this.g = j.b();
       this.h = j.b();
       if (this.e == null) {
          HandlerThread handlerThrea = new HandlerThread("opensdk.report.handlerthread", 10);
          this.e = handlerThrea;
          handlerThrea.start();
       }
       if (this.e.isAlive() && this.e.getLooper() != null) {
          this.f = new h$1(this, this.e.getLooper());
       }
       return;
    }
    public static synchronized h a(){
       _monitor_enter(h.class);
       if (h.a == null) {
          h.a = new h();
       }
       _monitor_exit(h.class);
       return h.a;
    }
    public int a(int p0){
       String str = null;
       if (!p0) {
          p0 = g.a(f.a(), str).a("Common_CGIReportFrequencySuccess");
          if (!p0) {
             p0 = 10;
          }
       }else {
          p0 = g.a(f.a(), str).a("Common_CGIReportFrequencyFailed");
          if (!p0) {
             p0 = 100;
          }
       }
       return p0;
    }
    public void a(Bundle p0,String p1,boolean p2){
       if (p0 == null) {
          return;
       }
       SLog.v("openSDK_LOG.ReportManager", "-->reportVia, bundle: "+p0.toString());
       if (!this.a("report_via", p1) && !p2) {
          return;
       }
       this.g.execute(new h$2(this, p0, p2));
       return;
    }
    public void a(String p0,long p1,long p2,long p3,int p4){
       this.a(p0, p1, p2, p3, p4, "", false);
    }
    public void a(String p0,long p1,long p2,long p3,int p4,String p5,boolean p6){
       h oh = this;
       int i = p4;
       SLog.v("openSDK_LOG.ReportManager", "-->reportCgi, command: "+p0+" | startTime: "+p1+" | reqSize:"+p2+" | rspSize: "+p3+" | responseCode: "+i+" | detail: "+p5);
       if (!this.a("report_cgi", i) && !p6) {
          return;
       }
       h$3 u3 = new h$3(this, p1, p0, p5, p4, p2, p3, p6);
       oh.h.execute(v14);
       return;
    }
    public void a(String p0,Map p1){
       if (!k.b(f.a())) {
          return;
       }
       j.b(new h$6(this, p0, p1));
       return;
    }
    public boolean a(String p0,int p1){
       int i1;
       int i = 5;
       String str = null;
       if (p0.equals("report_cgi")) {
          i1 = g.a(f.a(), str).a("Common_CGIReportMaxcount");
          if (i1) {
          label_001c :
             i = i1;
          }
       }else if(p0.equals("report_via")){
          i1 = g.a(f.a(), str).a("Agent_ReportBatchCount");
          if (i1) {
          }
       }else {
          i = 0;
       }
       SLog.d("openSDK_LOG.ReportManager", "-->availableCount, report: "+p0+" | dataSize: "+p1+" | maxcount: "+i);
       if (p1 >= i) {
          return true;
       }else {
          return false;
       }
    }
    public boolean a(String p0,String p1){
       int i1;
       SLog.d("openSDK_LOG.ReportManager", "-->availableFrequency, report: "+p0+" | ext: "+p1);
       boolean b = false;
       if (TextUtils.isEmpty(p0)) {
          return b;
       }
       int i = 100;
       if (p0.equals("report_cgi")) {
          try{
             i1 = this.a(Integer.parseInt(p1));
             if (this.b.nextInt(i) < i1) {
                b = true;
             }
          }catch(java.lang.Exception e0){
             return b;
          }
       }else if(p0.equals("report_via")){
          i1 = f.a(p1);
          if (this.b.nextInt(i) < i1) {
             i = i1;
             b = true;
          label_005c :
             SLog.d("openSDK_LOG.ReportManager", "-->availableFrequency, result: "+b+" | frequency: "+i);
             return b;
          }
       }else {
          goto label_005c ;
       }
       i = i1;
       goto label_005c ;
    }
    public void b(){
       if (!k.b(f.a())) {
          return;
       }
       this.h.execute(new h$4(this));
       return;
    }
    public Map c(){
       Map map = null;
       if (!this.c.size()) {
          return map;
       }
       int i = 0;
       c uoc = this.c.get(i);
       if (uoc == null) {
          SLog.d("openSDK_LOG.ReportManager", "-->prepareCgiData, the 0th cgireportitem is null.");
          return map;
       }else {
          String str = "appid";
          String str1 = uoc.a.get(str);
          List list = g.a().a("report_cgi");
          if (list != null) {
             this.c.addAll(list);
          }
          SLog.d("openSDK_LOG.ReportManager", "-->prepareCgiData, mCgiList size: "+this.c.size());
          if (!this.c.size()) {
             return map;
          }else {
             try{
                HashMap hashMap = new HashMap();
                hashMap.put(str, str1);
                hashMap.put("releaseversion", "OpenSdk_3.5.4.lite");
                hashMap.put("device", Build.DEVICE);
                hashMap.put("qua", "V1_AND_OpenSDK_3.5.4.lite_1077_RDM_B");
                hashMap.put("key", "apn,frequency,commandid,resultcode,tmcost,reqsize,rspsize,detail,touin,deviceinfo");
                for (; i < this.c.size(); i = i + 1) {
                   uoc = this.c.get(i);
                   hashMap.put(i+"_1", uoc.a.get("apn"));
                   hashMap.put(i+"_2", uoc.a.get("frequency"));
                   hashMap.put(i+"_3", uoc.a.get("commandid"));
                   hashMap.put(i+"_4", uoc.a.get("resultCode"));
                   hashMap.put(i+"_5", uoc.a.get("timeCost"));
                   hashMap.put(i+"_6", uoc.a.get("reqSize"));
                   hashMap.put(i+"_7", uoc.a.get("rspSize"));
                   hashMap.put(i+"_8", uoc.a.get("detail"));
                   hashMap.put(i+"_9", uoc.a.get("uin"));
                   hashMap.put(i+"_10", d.e(f.a())+"&"+uoc.a.get("deviceInfo"));
                }
                SLog.v("openSDK_LOG.ReportManager", "-->prepareCgiData, end. params: "+hashMap.toString());
                return hashMap;
             }catch(java.lang.Exception e0){
                SLog.e("openSDK_LOG.ReportManager", "-->prepareCgiData, exception.", e0);
                return map;
             }
          }
       }
    }
    public Map d(){
       String str = "data";
       List list = g.a().a("report_via");
       if (list != null) {
          this.d.addAll(list);
       }
       String str1 = "openSDK_LOG.ReportManager";
       SLog.d(str1, "-->prepareViaData, mViaList size: "+this.d.size());
       if (!this.d.size()) {
          return null;
       }else {
          JSONArray jSONArray = new JSONArray();
          Iterator iterator = this.d.iterator();
          while (iterator.hasNext()) {
             Serializable serializable = iterator.next();
             JSONObject jSONObject = new JSONObject();
             Iterator iterator1 = serializable.a.keySet().iterator();
             while (iterator1.hasNext()) {
                String str2 = iterator1.next();
                try{
                   String str3 = serializable.a.get(str2);
                   if (str3 == null) {
                      str3 = "";
                   }
                   jSONObject.put(str2, str3);
                }catch(org.json.JSONException e9){
                   SLog.e(str1, "-->prepareViaData, put bundle to json array exception", e9);
                   goto label_0063 ;
                }
             }
             jSONArray.put(jSONObject);
          }
          SLog.v(str1, "-->prepareViaData, JSONArray array: "+jSONArray.toString());
          try{
             JSONObject jSONObject1 = new JSONObject();
             jSONObject1.put(str, jSONArray);
             HashMap hashMap = new HashMap();
             hashMap.put(str, jSONObject1.toString());
             return hashMap;
          }catch(org.json.JSONException e0){
             SLog.e(str1, v6, e0);
             return v3;
          }
       }
    }
    public void e(){
       if (!k.b(f.a())) {
          return;
       }
       this.g.execute(new h$5(this));
       return;
    }
}
