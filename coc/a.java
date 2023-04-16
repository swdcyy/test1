package coc.a;
import com.kwai.sdk.switchconfig.a;
import java.lang.String;
import o56.a;
import lnc.t0;
import qfc.a;
import java.lang.StringBuilder;
import java.lang.Object;
import q87.c;
import java.util.UUID;
import java.lang.RuntimeException;
import java.lang.Throwable;
import com.yxcorp.gifshow.util.PostUtils;
import java.lang.System;
import lnc.i3;
import java.lang.Integer;
import java.lang.Number;
import java.lang.Long;

public class a	// class@00059f
{
    public final String a;
    public final int b;
    public String c;
    public int d;
    public long e;
    public long f;
    public final String g;
    public long h;
    public static final boolean i;

    static {
       int i = 0;
       double d = (double)a.t().a("modelDownloadLogSampleRate", 10) / 100.00f;
       double d1 = (double)t0.a(a.a, 0x2710) / 10000.00f;
       Object[] objArray = new Object[i];
       a.C().w("DownloadLoggerHelper", "sample rate : "+d1+", "+d, objArray);
       if (d - 0x3ff0000000000000 >= 0 || d1 - d < 0) {
          i = true;
       }
       a.i = i;
    }
    public void a(String p0,int p1){
       super();
       this.h = 0;
       Object[] objArray = new Object[0];
       a.C().w("DownloadLoggerHelper", this+" DownloadLoggerHelper : "+p0+"--"+p1, objArray);
       this.a = p0;
       this.b = p1;
       this.g = UUID.randomUUID().toString();
    }
    public void a(){
       this.f(0, "");
    }
    public void b(int p0,String p1){
       if (this.b == 2) {
          PostUtils.D("DownloadLoggerHelper", this+" DownloadError", new RuntimeException("code : "+p0+", msg : "+p1));
       }
       this.f(p0, p1);
       return;
    }
    public void c(String p0){
       Object[] objArray = new Object[0];
       a.C().w("DownloadLoggerHelper", this+" onDownloadStart : "+p0, objArray);
       if (!this.e) {
          this.e = System.currentTimeMillis();
       }
       this.c = p0;
       return;
    }
    public void d(){
       Object[] objArray = new Object[0];
       a.C().w("DownloadLoggerHelper", this+" onRetry : "+this.a, objArray);
       this.d = this.d + 1;
    }
    public void e(){
       Object[] objArray = new Object[0];
       a.C().w("DownloadLoggerHelper", this+" onUnzipStart", objArray);
       if (!this.f) {
          this.f = System.currentTimeMillis();
       }
       return;
    }
    public final void f(int p0,String p1){
       a tf = this.f;
       long l = System.currentTimeMillis() - tf;
       i3 oi3 = i3.f();
       oi3.d("category", this.a);
       oi3.c("downloadMode", Integer.valueOf(this.b));
       oi3.d("url", this.c);
       oi3.c("retryCount", Integer.valueOf(this.d));
       oi3.c("errorCode", Integer.valueOf(p0));
       oi3.d("errorMsg", p1);
       oi3.c("unZipTime", Long.valueOf(l));
       oi3.c("downloadTime", Long.valueOf((tf - this.e)));
       oi3.c("cost", Long.valueOf((System.currentTimeMillis() - this.e)));
       oi3.d("key", this.g);
       oi3.c("originSize", Long.valueOf(this.h));
       String str = oi3.e();
       Object[] objArray = new Object[0];
       a.C().w("DownloadLoggerHelper", this+" reportResult : "+str, objArray);
       PostUtils.x("MODEL_DOWNLOAD", str);
       if (a.i) {
          PostUtils.x("MODEL_DOWNLOAD_SAMPLE", str);
       }
       return;
    }
}
