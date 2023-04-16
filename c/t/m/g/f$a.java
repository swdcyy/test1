package c.t.m.g.f$a;
import c.t.m.g.ap;
import java.lang.Runnable;
import java.lang.Object;
import c.t.m.g.f$1;
import java.lang.String;
import java.lang.StringBuilder;
import c.t.m.g.bt;
import c.t.m.g.by;
import c.t.m.g.bf;
import c.t.m.g.bd;
import java.lang.System;
import c.t.m.g.bj;
import c.t.m.g.aq;
import android.os.Bundle;
import java.lang.Throwable;

public class f$a implements ap, Runnable	// class@000c85
{
    public String a;
    public int b;

    public void f$a(){
       super();
       this.b = 0;
    }
    public void f$a(f$1 p0){
       super();
    }
    public void a(String p0){
       bt.c("FC", "NaviGps,"+this.b);
       if (bt.a()) {
          bt.a("GpsNaviPro", "upload success:"+p0);
       }
       return;
    }
    public void a(String p0,int p1){
       this.a = (by.a(p0))? "": p0;
       this.b = p1;
       return;
    }
    public final void a(byte[] p0){
       byte[] uobyteArray = bf.a(p0);
       byte[] uobyteArray1 = bd.a(uobyteArray.length);
       byte[] uobyteArray2 = new byte[((uobyteArray1.length + 1) + uobyteArray.length)];
       uobyteArray2[0] = 1;
       System.arraycopy(uobyteArray1, 0, uobyteArray2, 1, uobyteArray1.length);
       System.arraycopy(uobyteArray, 0, uobyteArray2, (uobyteArray1.length + 1), uobyteArray.length);
       uobyteArray = bj.a(uobyteArray2, bj.a("fc_gps_for_navi"));
       if (bt.a()) {
          bt.a("GpsNaviPro", "start upload:strBytes="+p0.length+",encBytes="+uobyteArray.length);
       }
       aq.a.a("https://rttgpsreport.map.qq.com/report?type=sdk&key=5e1fe70424035ee83066ac22b24f31dc", uobyteArray, this);
       return;
    }
    public void b(String p0){
       if (bt.a()) {
          bt.a("GpsNaviPro", "upload fail:"+p0);
       }
       return;
    }
    public void run(){
       if (by.a(this.a)) {
          return;
       }
       this.a = "";
       this.a((this.a).getBytes("UTF-8"));
       return;
    }
}
