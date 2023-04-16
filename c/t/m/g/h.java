package c.t.m.g.h;
import c.t.m.g.ao;
import java.lang.Runnable;
import c.t.m.g.av;
import java.io.File;
import java.lang.StringBuilder;
import c.t.m.g.s;
import java.util.ArrayList;
import c.t.m.g.bt;
import java.lang.String;
import android.os.Looper;
import android.net.wifi.ScanResult;
import android.util.Base64;
import android.os.Message;
import java.util.List;
import java.util.Iterator;
import java.lang.Object;
import c.t.m.g.bm;
import c.t.m.g.an;
import c.t.m.g.ay;
import java.lang.System;
import java.lang.Long;
import c.t.m.g.ca;
import c.t.m.g.bv$a;
import c.t.m.g.bv;
import c.t.m.g.j;
import c.t.m.g.bn;
import c.t.m.g.by;
import java.util.Collection;
import android.os.Handler;
import c.t.m.g.bf;
import c.t.m.g.bj;
import java.lang.CharSequence;
import c.t.m.g.h$1;
import c.t.m.g.ap;
import android.os.Bundle;
import c.t.m.g.aq;
import java.lang.Throwable;

public class h extends av implements ao, Runnable	// class@000c97
{
    public boolean c;
    public List d;
    public s e;
    public an f;
    public File g;
    public String h;
    public String i;
    public StringBuilder j;

    public void h(File p0){
       super();
       this.c = false;
       this.h = "wf4_bf";
       this.i = "wf4";
       this.j = new StringBuilder(100);
       this.e = new s(8192, 5);
       this.d = new ArrayList();
       this.g = p0;
       if (bt.a()) {
          bt.a("WifiInfoPro", "data dir:"+this.g.getAbsolutePath());
       }
       return;
    }
    public int a(Looper p0){
       this.a(100, 0);
       return 0;
    }
    public final String a(ScanResult p0){
       (this.j).setLength(0);
       StringBuilder str = this.j+p0.BSSID+',';
       str = this.j+Base64.encodeToString((p0.SSID).getBytes("UTF-8"), 2)+',';
       str = this.j+p0.frequency+',';
       this.j+Base64.encodeToString((p0.capabilities).getBytes("UTF-8"), 2);
       return this.j;
    }
    public void a(){
       this.a(101, 0);
    }
    public void a(Message p0){
       h oh = this;
       Message message = p0;
       if (oh.g == null) {
          return;
       }
       int i = 103;
       long l = 0x493e0;
       long l1 = 0;
       boolean b = false;
       String str = "WifiInfoPro";
       switch (message.what){
           case 'd':
             oh.f = new an(new File(oh.g, oh.i));
             oh.f.a(oh);
             byte[] uobyteArray = bm.a(new File(oh.g, oh.h));
             long l2 = System.currentTimeMillis();
             if ((l2 - ca.b("LocationSDK", "log_fc_wf_bf_create_t_ms", Long.valueOf(l1)).longValue()) - 0x9a7ec800 < 0 && !by.a(uobyteArray)) {
                oh.e.a(uobyteArray);
                bt.a(str, "bf init.");
             }else {
                ca.a("LocationSDK", "log_fc_wf_bf_create_t_ms", Long.valueOf(l2));
                bt.a(str, "bf reset.");
             }
             oh.a(i, l);
          label_0192 :
             bm.a(new File(oh.g, oh.h), oh.e.a(), b);
             oh.a(104, l);
             break;
           case 'e':
             oh.b(oh.d);
             bm.a(new File(oh.g, oh.h), oh.e.a(), b);
             if (oh.f != null) {
                oh.f.a();
                oh.f = null;
             label_009f :
                if (this.e()) {
                   oh.a(i, 0x1b7740);
                }
                long l3 = System.currentTimeMillis();
                long l4 = ca.b("LocationSDK", "log_fc_wf_up_t_ms", Long.valueOf(l1)).longValue();
                bv$a uoa = bv.a();
                if (uoa == bv$a.c || (uoa == bv$a.b && (j.f || j.g))) {
                   b = true;
                }
                if (bt.a()) {
                   bt.a(str, "lastUpT:"+l4+",deltaT:"+(l3 - l4)+",network status:"+uoa+",isUpload:"+b);
                }
                if (!b) {
                   return;
                }else {
                   v3 = l4 - l1;
                   if (!uoa || (l3 - l4) - 0x5265c00 < 0) {
                      if (!uoa) {
                         ca.a("LocationSDK", "log_fc_wf_up_t_ms", Long.valueOf(l3));
                      }
                      return;
                   }else {
                      bn.a("th_loc_task_t_consume", oh);
                      ca.a("LocationSDK", "log_fc_wf_up_t_ms", Long.valueOf(l3));
                   }
                }
             }else {
                goto label_009f ;
             }
             break;
           case 'f':
             Iterator iterator = message.obj.iterator();
             while (iterator.hasNext()) {
                ScanResult scanResult = iterator.next();
                if (!oh.e.b(scanResult.BSSID)) {
                   oh.e.a(scanResult.BSSID);
                   oh.d.add(oh.a(scanResult));
                }
             }
             if (bt.a()) {
                bt.a(str, "wf list size:"+oh.d.size());
             }
             if (oh.d.size() >= 30) {
                oh.b(oh.d);
             }
             break;
           case 'g':
             goto label_009f ;
           case 'h':
             goto label_0192 ;
           default:
       }
       return;
    }
    public void a(List p0){
       if (this.e() && !by.a(p0)) {
          Message message = this.d().obtainMessage(102);
          message.obj = p0;
          this.a(message, 0);
       }
       return;
    }
    public byte[] a(byte[] p0){
       p0 = bj.a(bf.a(p0), bj.a("fc_wf_up"));
       if (!by.a(p0)) {
          p0 = Base64.encode(p0, 2);
          if (!by.a(p0)) {
             return (new String(p0)+'$').getBytes("UTF-8");
          }
       }
       p0 = new byte[0];
       return p0;
    }
    public String b(){
       return "WifiInfoPro";
    }
    public final void b(List p0){
       if (this.c != null || (!by.a(p0) && !by.a(this.f))) {
          long l = this.f.b().length();
          if (bt.a()) {
             bt.a("WifiInfoPro", "wf file len:"+l);
          }
          if (l - 0xc800 <= 0) {
             StringBuilder str = new StringBuilder(500)+"1|"+p0.size();
             Iterator iterator = p0.iterator();
             while (iterator.hasNext()) {
                str = str+'|'+iterator.next();
             }
             this.f.a(str);
          }
          p0.clear();
       }
    label_0078 :
       return;
    }
    public void run(){
       this.c = true;
       if (this.f != null) {
          this.f.a();
          this.f = null;
       }
       File uFile = new File(this.g, this.i);
       if (bt.a()) {
          bt.a("WifiInfoPro", "upload:"+uFile.getName()+","+uFile.length());
       }
       byte[] uobyteArray = bf.a(bm.a(uFile));
       String str = (j.h)? "https://testdatalbs.sparta.html5.qq.com/tr?wf4": "https://analytics.map.qq.com/?wf4";
       if (!j.e) {
          str = str.replace("https:", "http:");
       }
       j.k.a(str, uobyteArray, new h$1(this, uFile));
       if (this.e()) {
          this.f = new an(new File(this.g, this.i));
          this.f.a(this);
       }
       this.c = false;
       return;
    }
}
