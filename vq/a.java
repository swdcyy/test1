package vq.a;
import java.util.concurrent.atomic.AtomicInteger;
import com.kuaishou.android.vader.Channel;
import tq.d;
import er.j;
import java.lang.String;
import java.util.concurrent.ScheduledExecutorService;
import er.i;
import java.lang.Object;
import java.lang.StringBuilder;
import java.lang.Enum;
import vq.f;
import er.k;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.io.ByteArrayInputStream;
import java.util.zip.GZIPInputStream;
import java.io.InputStream;
import java.io.ByteArrayOutputStream;
import org.json.JSONObject;
import java.io.IOException;
import com.kuaishou.android.vader.config.LogPolicy;
import java.util.List;
import er.l;
import com.kuaishou.android.vader.config.LogResponse;
import java.util.Objects;
import java.lang.Long;
import java.lang.Exception;
import java.lang.IllegalStateException;
import java.util.Iterator;
import com.kuaishou.android.vader.persistent.LogRecord;
import com.kuaishou.android.vader.Algorithm;

public abstract class a	// class@0026d1
{
    public final i a;
    public final f b;
    public final j c;
    public final d d;
    public final ScheduledExecutorService e;
    public final Channel f;
    public final String g;
    public long h;
    public boolean i;
    public static AtomicInteger j;
    public static int k;
    public static int l;

    static {
       a.j = new AtomicInteger(0);
    }
    public void a(Channel p0,d p1,j p2,String p3,ScheduledExecutorService p4,i p5){
       super();
       this.i = false;
       this.f = p0;
       this.g = "LogChannel_"+p0.name()+"\("+p3+"\)";
       this.d = p1;
       this.e = p4;
       this.c = p2;
       this.a = p5;
       this.h = p5.b();
       this.b = new f(p5.c(), p5.e());
    }
    public static int a(){
       return a.l;
    }
    public static int b(){
       return a.k;
    }
    public abstract k c();
    public final byte[] d(byte[] p0,String p1,int p2){
       ByteArrayInputStream obj;
       int this;
       if (PatchProxy.isSupport(a.class)) {
          obj = PatchProxy.applyThreeRefs(p0, p1, Integer.valueOf(p2), this, a.class, "7");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       try{
          obj = new ByteArrayInputStream(p0);
          GZIPInputStream gZIPInputStr = new GZIPInputStream(obj);
          ByteArrayOutputStream uByteArrayOu = new ByteArrayOutputStream();
          byte[] uobyteArray = new byte[512];
          this = gZIPInputStr.read(uobyteArray);
          while (this >= 0) {
             uByteArrayOu.write(uobyteArray, 0, this);
          }
          obj.close();
          gZIPInputStr.close();
          uByteArrayOu.close();
          return uByteArrayOu.toByteArray();
       }catch(java.io.IOException e1){
          AtomicInteger j = a.j;
          try{
             j.incrementAndGet();
             JSONObject jSONObject = new JSONObject();
             jSONObject.put("fail_count", a.j.get()+"");
             jSONObject.put("fail_reason", e1.getMessage());
             jSONObject.put("custom_type", p1);
             jSONObject.put("fail_data", new String(p0));
             jSONObject.put("fail_seq_id", p2+"");
             jSONObject.put("fail_size", p0.length+"");
             this.d.logCustomEvent("V2_VADER_DECOMP_E", jSONObject.toString());
             return null;
          }catch(java.lang.Exception e0){
          }
       }
    }
    public abstract void e(LogPolicy p0);
    public abstract void f(List p0,l p1);
    public abstract void g(List p0,l p1);
    public abstract List h();
    public abstract List i();
    public final l j(List p0){
       long l;
       LogResponse obj = PatchProxy.applyOneRefs(p0, this, a.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          p0.size();
          LogResponse logResponse = this.c.c(p0, this.c());
          if (logResponse != null) {
             Objects.toString(logResponse.getLogPolicy());
             obj = logResponse.nextRequestPeriodInMs;
             if (obj != null) {
                if (this.f == Channel.USER_TRACK) {
                   l = (obj.longValue() <= 0)? 1000: logResponse.nextRequestPeriodInMs.longValue();
                   this.h = l;
                }else {
                   this.h = obj.longValue();
                }
             }
             return l.a(true, this.h, logResponse.getLogPolicy());
          }
       }catch(java.lang.Exception e6){
          this.d.a(e6);
       }
       return l.a(false, this.h, LogPolicy.NORMAL);
    }
    public abstract void k(long p0);
    public abstract void l(long p0);
    public abstract boolean m();
    public void n(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       if (this.i != null) {
          throw new IllegalStateException("Shouldn\'t start LogDataChannel twice.");
       }
       this.i = true;
       this.l(this.a.d());
       return;
    }
    public void o(){
       if (PatchProxy.applyVoid(null, this, a.class, "2")) {
          return;
       }
       List list = this.i();
       l ol = this.q(list);
       this.f(list, ol);
       boolean b = (ol.b() != LogPolicy.NORMAL)? true: false;
       if (!b) {
          if (!this.m()) {
             this.l(ol.c());
          }
       }else {
          this.e(ol.b());
          this.e.shutdown();
       }
       return;
    }
    public void p(){
       if (PatchProxy.applyVoid(null, this, a.class, "3")) {
          return;
       }
       List list = this.h();
       l ol = this.q(list);
       this.g(list, ol);
       boolean b = (ol.b() != LogPolicy.NORMAL)? true: false;
       if (!b) {
          if (!this.m()) {
             this.l(ol.c());
          }
       }else {
          this.e(ol.b());
          this.e.shutdown();
       }
       return;
    }
    public final l q(List p0){
       Iterator obj = PatchProxy.applyOneRefs(p0, this, a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       boolean b = true;
       if (p0.isEmpty()) {
          return l.a(b, this.h, LogPolicy.NORMAL);
       }
       obj = p0.iterator();
       while (obj.hasNext()) {
          LogRecord logRecord = obj.next();
          if (logRecord.compressAlgorithm() == Algorithm.GZIP.getValue()) {
             byte[] uobyteArray = this.d(logRecord.payload(), logRecord.customType(), logRecord.seqId());
             if (uobyteArray != null) {
                logRecord.setPayload(uobyteArray);
                logRecord.setCompressAlgorithm(Algorithm.NO_COMPRESS.getValue());
             }
          }
       }
       l ol = this.j(p0);
       ol.d();
       a.k = a.k + b;
       if (ol.d()) {
          this.b.c();
          return ol;
       }else {
          a.l = a.l + b;
          this.b.b();
          this.b.a();
          return l.a(ol.d(), this.b.a(), ol.b());
       }
    }
}
