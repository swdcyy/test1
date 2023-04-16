package c.t.m.g.p$a;
import java.util.TimerTask;
import c.t.m.g.p;
import org.json.JSONObject;
import c.t.m.g.q;
import c.t.m.g.r;
import c.t.m.g.ax;
import java.lang.String;
import java.lang.Integer;
import java.lang.StringBuilder;
import c.t.m.g.bt;
import android.content.SharedPreferences;
import java.lang.System;
import java.lang.Object;
import c.t.m.g.ca;
import java.lang.Thread;
import java.lang.Throwable;
import android.content.SharedPreferences$Editor;
import oe6.g;
import java.util.Iterator;
import java.lang.Long;
import c.t.m.g.aq;
import java.lang.CharSequence;
import c.t.m.g.cb;
import c.t.m.g.by;
import c.t.m.g.bj;
import c.t.m.g.ap;
import android.os.Bundle;
import android.text.TextUtils;
import java.lang.Math;

public class p$a extends TimerTask	// class@000ca1
{
    public final p a;
    public final JSONObject b;
    public q c;
    public r d;

    public void p$a(p p0){
       this.a = p0;
       super();
       this.b = new JSONObject();
       this.c = null;
       this.d = null;
       this.c = q.a();
       this.d = r.a();
    }
    public final void a(){
       boolean b = this.a.f();
       String str = "CC_Task";
       if (b) {
          this.d.c();
       }
       JSONObject jSONObject = this.b();
       if (jSONObject != this.b) {
          int i = Integer.parseInt(jSONObject.optString("status", "-5"));
          bt.a(str, "status:"+i);
          if (!i && jSONObject.has("version")) {
             this.a(jSONObject);
          }
          ca.a(this.d.b(), "last_pull_time", String.valueOf(System.currentTimeMillis()));
          Thread.sleep(1000);
          bt.a(str, "---> finish update xml");
       }
       this.c.b();
       if (b) {
          this.d.d();
       }
       return;
    }
    public final void a(SharedPreferences$Editor p0,String p1,String p2,JSONObject p3){
       try{
          String str = this.c.e(p1);
          if (str == null) {
             return;
          }else {
             p0.putString(p1, p3.optString(p2, str));
          }
       }catch(java.lang.Exception e2){
          bt.a("CC_Task", "update sp error.", e2);
       }
       return;
    }
    public final void a(JSONObject p0){
       p$a tb;
       SharedPreferences sharedPrefer = this.d.b();
       if (sharedPrefer == null) {
          return;
       }
       String str = "cc_version";
       int i = this.c.b(str);
       int i1 = Integer.parseInt(p0.optString("version", this.c.e(str)));
       String str1 = "CC_Task";
       bt.a(str1, "locVer:"+i+",serVer:"+i1);
       if (i1 == i) {
          return;
       }
       bt.a(str1, "locVer != serVer, clear sp.");
       g.a(sharedPrefer.edit().clear());
       p0 = p0.optJSONObject("data");
       if (p0 == null) {
          tb = this.b;
       }
       SharedPreferences$Editor uEditor = sharedPrefer.edit();
       Iterator iterator = tb.keys();
       while (iterator.hasNext()) {
          this.a(uEditor, iterator.next(), iterator.next(), tb);
       }
       uEditor.putString(str, String.valueOf(i1));
       uEditor.putString("app_version", q.c);
       long l = Long.parseLong(tb.optString("cc_req_interval", this.c.e("cc_req_interval")));
       if (l - 0x1b7740 < 0) {
          l = 0x1b7740;
       }else if(l - 0x5265c00 > 0){
          l = 0x5265c00;
       }
       uEditor.putString("cc_req_interval", String.valueOf(l));
       g.a(uEditor);
       return;
    }
    public final JSONObject b(){
       String str = "";
       String str1 = "cc_version";
       if (p.c(this.a) == null) {
          return this.b;
       }
       String str2 = "https://cc.map.qq.com/?get_c3";
       if (!p.d(this.a)) {
          str2 = str2.replace("https:", "http:");
       }
       bt.a("CC_Task", "cc_url:"+str2);
       JSONObject jSONObject = new JSONObject();
       jSONObject.put(str1, this.c.e(str1));
       jSONObject.put("m_module", q.a);
       jSONObject.put("m_channel", q.b);
       jSONObject.put("m_version", q.c);
       str1 = cb.b();
       if (by.a(str1) || ("0123456789ABCDEF").equals(str1)) {
          str1 = cb.d();
       }
       jSONObject.put("imei", str1);
       str1 = bj.a("cc");
       String str3 = bj.a(jSONObject.toString(), str1);
       bt.a("CC_Task", "req:"+str3);
       Bundle uBundle = p.c(this.a).a(str2, str3.getBytes(), null);
       str3 = uBundle.getString("msg_suc", str);
       if (TextUtils.isEmpty(str3)) {
          bt.a("CC_Task", "net work error! res = ["+uBundle.getString("msg_fail", str)+"]");
          return this.b;
       }else {
          bt.a("CC_Task", "res:"+str3);
          str = this.b.toString();
          if (str.equals(str3)) {
             bt.a("CC_Task", "network or server error,response empty json");
          }else {
             bt.a("CC_Task", "start dec");
             str = bj.b(str3, str1);
             bt.a("CC_Task", "end dec, "+str);
          }
          p$a tb = (TextUtils.isEmpty(str))? this.b: new JSONObject(str);
          return tb;
       }
    }
    public void run(){
       if (Math.abs((System.currentTimeMillis() - this.c.c("last_pull_time"))) - p.a(this.a) >= 0) {
          this.a();
       }else {
          bt.a("CC_Task", "skip pull");
       }
       if (this.a.f()) {
          p.b(this.a);
       }
       return;
    }
}
