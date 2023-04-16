package uq.a;
import er.m;
import com.kuaishou.android.vader.persistent.a;
import ar.c;
import java.util.Map;
import java.lang.String;
import java.lang.Object;
import tq.d;
import tq.h;
import com.kuaishou.android.vader.a;
import java.util.Random;
import java.util.concurrent.Future;
import java.util.Collection;
import java.util.Iterator;
import vq.d;
import vq.a;
import cr.f$a;
import cr.f;
import com.google.protobuf.nano.MessageNano;
import com.kuaishou.android.vader.Channel;
import ar.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.android.vader.config.ControlAction;
import tq.c;
import yq.a;
import com.kuaishou.android.vader.persistent.LogRecord;
import java.lang.StringBuilder;
import com.kuaishou.android.vader.persistent.DBAction;
import com.kuaishou.android.vader.persistent.DBAction$Type;
import java.lang.Boolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.lang.System;
import com.kuaishou.android.vader.Algorithm;
import com.kuaishou.android.vader.stat.VaderStat;
import cr.h;
import cr.g;
import cr.i;
import java.io.ByteArrayOutputStream;
import java.util.zip.GZIPOutputStream;
import java.io.OutputStream;
import java.lang.Throwable;
import java.io.IOException;
import java.util.Set;
import java.util.Map$Entry;
import org.json.JSONObject;
import wq.a;
import wq.b;
import fr.a;
import org.json.JSONException;
import java.lang.Integer;
import java.lang.Number;
import java.io.EOFException;
import zq.e;
import java.lang.IllegalStateException;

public class a	// class@002604
{
    public final Map a;
    public final d b;
    public final Random c;
    public c d;
    public final a e;
    public final c f;
    public final f g;
    public int h;
    public h i;
    public m j;
    public Map k;

    public void a(m p0,a p1,c p2,Map p3,String p4){
       super();
       this.k = null;
       this.j = p0;
       d uod = p0.d();
       this.b = uod;
       this.i = p0.e();
       this.a = p3;
       this.d = new a(p4, uod);
       this.c = new Random();
       this.f = p2;
       this.e = p1;
       p1.j();
       Iterator iterator = p3.values().iterator();
       while (iterator.hasNext()) {
          iterator.next().n();
       }
       this.g = f.a().b(p4).c(0).a();
       return;
    }
    public Future a(MessageNano p0,Channel p1,String p2,b p3){
       ControlAction obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.d.a(p0);
       Future uFuture = null;
       if (obj instanceof a || this.c.nextFloat() - obj.getSampleRatio() < 0) {
          Channel uChannel = (obj.getChannel() == null)? p1: obj.getChannel();
          d uod = this.a.get(uChannel);
          if (uod.r()) {
             return uFuture;
          }else {
             LogRecord logRecord = this.c(p0, uChannel, p2, true, p3);
             if (uChannel != p1) {
                this.b.b("dynamic_channel_changed", "oc: "+p1+", tc: "+uChannel+", type: "+logRecord.customType()+", customSeqId: "+logRecord.customSeqId());
             }
             if ((long)logRecord.payload().length - 0xe1000 <= 0) {
                uFuture = this.e.a(new DBAction(logRecord, DBAction$Type.Add));
             }else {
                this.b.b("log_size_too_large", logRecord.seqId()+", "+logRecord.customType()+", "+logRecord.customSeqId()+", "+logRecord.payload().length);
             }
             uod.u(logRecord);
          }
       }else {
          obj.getSampleRatio();
          this.h = this.h + 1;
       }
       return uFuture;
    }
    public Future b(MessageNano p0,Channel p1,String p2,boolean p3,boolean p4,boolean p5){
       ControlAction obj;
       LogRecord this;
       a uoa = this;
       object oobject = p0;
       object oobject1 = p1;
       a uoa1 = a.class;
       int i = 1;
       if (PatchProxy.isSupport(uoa1)) {
          Object[] objArray = new Object[]{oobject,oobject1,p2,Boolean.valueOf(p3),Boolean.valueOf(p4),Boolean.valueOf(p5)};
          obj = PatchProxy.apply(objArray, this, uoa1, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = uoa.d.a(p0);
       Future uFuture = null;
       if (obj instanceof a || uoa.c.nextFloat() - obj.getSampleRatio() < 0) {
          object oobject2 = (obj.getChannel() == null)? oobject1: obj.getChannel();
          d uod = (p3)? uoa.a.get(oobject2): uoa.a.get(p1);
          d uod1 = uod;
          if (uod1.r()) {
             return uFuture;
          }else if(p3){
             this = this.c(p0, oobject2, p2, false, null);
          }else {
             this = this.c(p0, p1, p2, false, null);
          }
          if (oobject2 != oobject1) {
             uoa.b.b("dynamic_channel_changed", "oc: "+p1+", tc: "+oobject2+", type: "+this.customType()+", customSeqId: "+this.customSeqId());
          }
          if ((long)this.payload().length - 0xe1000 <= 0) {
             uFuture = (p5)? uoa.e.b(new DBAction(this, DBAction$Type.Add)): uoa.e.a(new DBAction(this, DBAction$Type.Add));
          }else {
             uoa.b.b("log_size_too_large", this.seqId()+", "+this.customType()+", "+this.customSeqId()+", "+this.payload().length);
          }
          if (p4) {
             uod1.t(this);
          }else {
             uod1.u(this);
          }
       }else {
          obj.getSampleRatio();
          uoa.h = uoa.h + i;
       }
       return uFuture;
    }
    public final LogRecord c(MessageNano p0,Channel p1,String p2,boolean p3,b p4){
       b obj;
       LogRecord logRecord;
       a uoa = this;
       object oobject = p1;
       object oobject1 = p2;
       a uoa1 = a.class;
       if (PatchProxy.isSupport(uoa1)) {
          Object[] objArray = new Object[]{p0,oobject,oobject1,Boolean.valueOf(p3),p4};
          obj = PatchProxy.apply(objArray, this, uoa1, "9");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = (p4 == null)? uoa.f.b(p1, oobject1): p4;
       if (uoa.i.d() && (a.j.get() < 20 && p3)) {
          byte[] uobyteArray = MessageNano.toByteArray(p0);
          byte[] uobyteArray1 = this.f(uobyteArray);
          logRecord = (uobyteArray1 == null)? new LogRecord(obj.e(), p1, obj.a(), p2, obj.d(), System.currentTimeMillis(), uobyteArray, Algorithm.NO_COMPRESS.getValue()): new LogRecord(obj.e(), p1, obj.a(), p2, obj.d(), System.currentTimeMillis(), uobyteArray1, Algorithm.GZIP.getValue());
          return v11;
       }else {
          logRecord = new LogRecord(obj.e(), p1, obj.a(), p2, obj.d(), System.currentTimeMillis(), MessageNano.toByteArray(p0), Algorithm.NO_COMPRESS.getValue());
          return v11;
       }
    }
    public b d(Channel p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, a.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.f.b(p0, p1);
    }
    public VaderStat e(){
       Object obj = PatchProxy.apply(null, this, a.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return VaderStat.create(this.g.d().c(this.h).a(), this.f.e(), this.f.d(), i.a(a.b(), a.a()));
    }
    public final byte[] f(byte[] p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 != null) {
          try{
             ByteArrayOutputStream uByteArrayOu = new ByteArrayOutputStream(p0.length);
             GZIPOutputStream gZIPOutputSt = new GZIPOutputStream(uByteArrayOu);
             gZIPOutputSt.write(p0);
             gZIPOutputSt.flush();
             gZIPOutputSt.close();
             uByteArrayOu.flush();
             uByteArrayOu.close();
             p0 = uByteArrayOu.toByteArray();
             if (this.g(p0)) {
                gZIPOutputSt.close();
                uByteArrayOu.close();
                return p0;
             }else {
                this.b.logCustomEvent("V2_VADER_COMP_E", "current compressed Not in GZIP format");
                gZIPOutputSt.close();
                uByteArrayOu.close();
                return null;
             }
          }catch(java.io.IOException e6){
             this.b.logCustomEvent("V2_VADER_COMP_E", e6.getMessage());
          }
          return null;
       }else {
          goto label_006f ;
       }
    }
    public final boolean g(byte[] p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       int i = -1;
       int i1 = (p0.length > 0)? p0[0] & 0x00ff: -1;
       if (1 < p0.length) {
          i = p0[1] & 0x00ff;
       }
       if ((this.i(i1) | (this.i(i) << 8)) != 0x8b1f) {
          return 0;
       }else {
          return 1;
       }
    }
    public void h(){
       if (PatchProxy.applyVoid(null, this, a.class, "4")) {
          return;
       }
       g og = this.f.f();
       Iterator iterator = this.j.a().entrySet().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          if (og != null) {
             try{
                JSONObject jSONObject = new JSONObject();
                d uod = this.a.get(uEntry.getKey());
                if (uod == null) {
                   this.b.b("Assembler", "logChannel == null");
                }else {
                   jSONObject.put("dbName", this.j.c());
                   jSONObject.put("channelType", a.a(this.j.c(), uEntry.getKey()));
                   jSONObject.put("memoryBacklogCount", uod.y().size());
                   jSONObject.put("dbBacklogCount", og.e());
                   this.b.logCustomEvent("V2_VADER_BACKLOG_INFO", jSONObject.toString());
                }
             }catch(org.json.JSONException e2){
                e2.printStackTrace();
                goto label_0020 ;
             }
          }
       }
       return;
    }
    public final int i(int p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoa, "12");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       int i = -1;
       if (p0 != i) {
          if (p0 >= i && p0 <= 255) {
             return p0;
          }else {
             throw new IOException(uoa.getName()+".read\(\) returned value out of range -1..255: "+p0);
          }
       }else {
          throw new EOFException();
       }
    }
    public void j(e p0,Channel p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "6")) {
          return;
       }
       d uod = this.a.get(p1);
       if (uod == null) {
          throw new IllegalStateException("Old channel shouldn\'t be null");
       }
       if (uod.s()) {
          if (this.k == null) {
             this.k = p0.a();
          }
          this.b.b("recreate_channel", "channel: "+p1);
          StringBuilder str = "Channel "+p1+" is degraded. Create a new one.";
          d uod1 = this.k.get(p1);
          this.a.put(p1, uod1);
          uod1.n();
       }
       return;
    }
    public void k(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "8")) {
          return;
       }
       this.b.b("update_log_control_config", p0);
       this.d = new a(p0, this.b);
       return;
    }
    public void l(){
       if (PatchProxy.applyVoid(null, this, a.class, "3")) {
          return;
       }
       Iterator iterator = this.a.values().iterator();
       while (iterator.hasNext()) {
          iterator.next().A();
       }
       return;
    }
}
