package com.kwai.stentor.AsrProduct.Asr;
import com.kwai.stentor.Audio.AudioCallback;
import java.lang.Object;
import java.lang.Long;
import java.util.UUID;
import java.lang.String;
import java.util.concurrent.ConcurrentSkipListMap;
import com.kwai.stentor.AsrProduct.Asr$PB$StentorASRStatus;
import java.util.concurrent.ConcurrentHashMap;
import wt7.a;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.atomic.AtomicBoolean;
import com.kwai.stentor.Audio.AudioJni;
import java.util.concurrent.ThreadPoolExecutor;
import f97.a;
import vt7.a;
import java.lang.Runnable;
import java.util.concurrent.Future;
import java.util.concurrent.ExecutorService;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.util.Objects;
import com.google.gson.JsonObject;
import java.lang.Number;
import java.lang.Integer;
import java.lang.Boolean;
import java.lang.StringBuilder;
import java.util.Map;
import com.kwai.stentor.Audio.AudioCallback$DebugLevel;
import com.kwai.stentor.AsrProduct.Asr$PB$StentorASRState;
import com.kwai.stentor.AsrProduct.Asr$PB;
import com.kuaishou.protobuf.livestream.stentor.StentorMMU$RtSpeechRecognitionResponse;
import java.util.List;
import com.kuaishou.protobuf.livestream.stentor.StentorMMU$RtSpeechRecognitionResultDetail;
import com.kuaishou.protobuf.livestream.stentor.StentorMMU$RtAsrStatus;
import com.kwai.stentor.AsrProduct.Asr$a;
import java.lang.Enum;
import vt7.b;
import com.yxcorp.utility.Log;
import java.lang.System;
import java.lang.Math;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import com.kuaishou.protobuf.livestream.stentor.StentorMMU$RtSpeechRecognitionResultCode;
import com.google.gson.Gson;
import vt7.g;
import java.lang.Class;
import java.lang.Exception;
import java.util.Timer;
import vt7.d;
import java.util.TimerTask;
import vt7.c;
import com.kuaishou.protobuf.livestream.stentor.StentorMMU$RtSpeechRecognitionType;
import com.kuaishou.protobuf.livestream.stentor.StentorMMU$RtSpeechRecognitionRequest$a;
import com.kuaishou.protobuf.livestream.stentor.StentorMMU$RtSpeechRecognitionRequest;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLite;

public class Asr implements AudioCallback	// class@0018fd
{
    public Long A;
    public Map B;
    public Long C;
    public a D;
    public ReentrantLock E;
    public ReentrantLock F;
    public ReentrantLock G;
    public ExecutorService H;
    public AtomicBoolean I;
    public Long J;
    public Long K;
    public String a;
    public long b;
    public long c;
    public long d;
    public Asr$PB e;
    public Timer f;
    public boolean g;
    public int h;
    public int i;
    public Timer j;
    public boolean k;
    public int l;
    public int m;
    public String n;
    public boolean o;
    public Map p;
    public long q;
    public int r;
    public String s;
    public String t;
    public String u;
    public Asr$PB$StentorASRStatus v;
    public boolean w;
    public boolean x;
    public boolean y;
    public Long z;
    public static final String L = "com.kwai.stentor.AsrProduct.Asr";

    public void Asr(){
       super();
       this.a = "";
       long l = 0;
       Long longx = Long.valueOf(l);
       this.c = l;
       this.d = -1;
       this.e = null;
       this.g = true;
       this.i = 10;
       this.k = true;
       this.l = 15;
       this.n = UUID.randomUUID().toString();
       this.o = false;
       this.p = new ConcurrentSkipListMap();
       this.q = l;
       this.r = 3;
       this.s = "";
       this.t = "";
       this.u = "";
       this.v = Asr$PB$StentorASRStatus.ASR_UNKNOWN;
       this.w = false;
       this.x = false;
       this.y = true;
       this.B = new ConcurrentHashMap();
       this.C = Long.valueOf(-1);
       this.D = new a();
       this.E = new ReentrantLock();
       this.F = new ReentrantLock();
       this.G = new ReentrantLock();
       this.I = new AtomicBoolean(false);
       this.J = longx;
       this.K = longx;
       long l1 = AudioJni.createHandler();
       this.b = l1;
       if (l1 - l) {
          AudioJni.setCallback(l1, this);
       }
       this.H = a.e("Stentor asr");
       Asr tD = this.D;
       tD.f = ".USED";
       tD.e = ".EDIT";
       tD.b();
       return;
    }
    public void A(byte[] p0,int p1,int p2,int p3,int p4,int p5){
       try{
          if (this.x == null && this.y == null) {
             this.E.lock();
             Asr tb = this.b;
             if (tb) {
                AudioJni.writeAudio(tb, p0, p1, p2, p3, p4, p5);
             }
             this.E.unlock();
          }
       }catch(java.lang.Exception e0){
       }
       return;
    }
    public void a(){
       this.x();
       this.y();
       Asr tI = this.I;
       try{
          tI.set(true);
          this.E.lock();
          tI = this.b;
          if (tI) {
             this.H.submit(new a(tI));
             this.b = 0;
          }
          this.E.unlock();
          return;
       }catch(java.lang.Exception e0){
       }
    }
    public void b(){
       Asr tb = this.b;
       if (tb) {
          AudioJni.startListen(tb);
          this.y = false;
          this.x = false;
          this.p();
          this.u = "";
       }
       return;
    }
    public void c(){
       Asr tb = this.b;
       if (tb - null) {
          if (this.x != null) {
             return;
          }else {
             AudioJni.stopListen(tb);
          }
       }
       return;
    }
    public String d(){
       return this.n;
    }
    public void e(int p0,String p1){
       Asr tD = this.D;
       tD.v = true;
       tD.w = p0;
       tD.x = p1;
    }
    public final void f(){
       Asr tD = this.D;
       tD.u = this.K;
       tD.o = (int)(tD.t.longValue() - (long)this.D.n);
       if (this.K.longValue() - null > 0) {
          this.D.p = Long.valueOf((this.J.longValue() / this.K.longValue()));
       }
       tD = this.D;
       tD.q = this.C;
       tD.G = this.t;
       tD.F = this.s;
       if (TextUtils.isEmpty(tD.j)) {
          this.D.j = this.n;
       }
       tD = this.D;
       Objects.requireNonNull(tD);
       JsonObject jsonObject = new JsonObject();
       jsonObject.a0("recognize_begin_timestamp", tD.l);
       jsonObject.a0("recognize_end_timestamp", tD.m);
       jsonObject.a0("total_success_count", Integer.valueOf(tD.n));
       jsonObject.a0("total_fail_count", Integer.valueOf(tD.o));
       jsonObject.a0("network_request_average_cost", tD.p);
       jsonObject.a0("network_request_max_cost", tD.q);
       jsonObject.a0("local_request_packet_size_averge", tD.r);
       jsonObject.a0("local_request_sended_interval", tD.s);
       jsonObject.a0("local_has_sended_packet_number", tD.t);
       jsonObject.a0("local_has_received_packet_number", tD.u);
       jsonObject.H("local_net_work_error", Boolean.valueOf(tD.v));
       jsonObject.a0("local_net_work_code", Integer.valueOf(tD.w));
       jsonObject.c0("local_net_work_info", tD.x);
       jsonObject.H("server_error", Boolean.valueOf(tD.y));
       jsonObject.a0("server_error_num", Integer.valueOf(tD.z));
       jsonObject.H("sdk_outof_time", Boolean.valueOf(tD.A));
       jsonObject.H("preEnd", Boolean.valueOf(tD.B));
       jsonObject.c0("asr_fixed_str", tD.F);
       jsonObject.c0("asr_dynamic_str", tD.G);
       jsonObject.c0("voice_session_id", tD.k);
       tD.c(tD.a, jsonObject);
       this.w("timeInterval: sessionID is "+this.n+",totalTime is "+this.J+",has sended packet "+this.B.size()+",has received packet "+this.K+",timeInterval :"+this.D.p, AudioCallback$DebugLevel.INFO);
       return;
    }
    public final void g(String p0,String p1,Asr$PB$StentorASRState p2,Asr$PB$StentorASRStatus p3,long p4,String p5){
       Asr te = this.e;
       if (te != null) {
          te.onResult(p0, p1, p2, p3, p4, p5);
       }
       return;
    }
    public final void h(StentorMMU$RtSpeechRecognitionResponse p0){
       Asr$PB$StentorASRStatus aSR_UNKNOWN;
       String str = "";
       for (int i = 0; i < p0.getNewResultDetailList().size(); i = i + 1) {
          str = str+p0.getNewResultDetailList().get(i).getFixedResult();
       }
       str = str;
       String newDynamicRe = p0.getNewDynamicResult();
       if (!TextUtils.isEmpty(str) || !TextUtils.isEmpty(newDynamicRe)) {
          this.s = str;
          this.t = newDynamicRe;
       }
       int i1 = Asr$a.a[p0.getRtAsrStatus().ordinal()];
       if (i1 != 1) {
          if (i1 != 2) {
             aSR_UNKNOWN = (i1 != 3)? Asr$PB$StentorASRStatus.ASR_UNKNOWN: Asr$PB$StentorASRStatus.ASR_RUNNING;
          }else {
             aSR_UNKNOWN = Asr$PB$StentorASRStatus.ASR_STOPPED;
          }
       }else {
          aSR_UNKNOWN = Asr$PB$StentorASRStatus.ASR_SILENCE;
       }
       Asr$PB$StentorASRStatus pB$StentorAS = aSR_UNKNOWN;
       this.v = pB$StentorAS;
       this.g(this.s, this.t, Asr$PB$StentorASRState.ASRContinue, pB$StentorAS, p0.getSerialNo(), p0.getReqId());
       return;
    }
    public void i(){
       if (this.y == null) {
          this.D.B = true;
          this.y = true;
          this.x();
          this.y();
          this.f();
          this.n();
          this.p();
       }
       return;
    }
    public boolean j(byte[] p0){
       this.H.submit(new b(this, p0));
       return true;
    }
    public final void k(StentorMMU$RtSpeechRecognitionResponse p0){
       Asr tD;
       Iterator iterator;
       Map$Entry uEntry;
       if (this.e == null) {
          Log.d(Asr.L, "mmuASR: mVoicePB is null");
          return;
       }else {
          long l = System.currentTimeMillis() - this.B.get(Long.valueOf(p0.getSerialNo())).longValue();
          this.J = Long.valueOf((this.J.longValue() + l));
          this.K = Long.valueOf((this.K.longValue() + 1));
          this.C = Long.valueOf(Math.max(this.C.longValue(), l));
          StringBuilder str = "reqId is "+this.n+"序号为"+p0.getSerialNo()+"的包花了"+l;
          AudioCallback$DebugLevel dEBUG = AudioCallback$DebugLevel.DEBUG;
          this.w(str+"ms，到目前为止从服务器端收到了"+this.K, dEBUG);
          if (this.o != null && (this.x != null || (p0.getRtAsrStatus() == StentorMMU$RtAsrStatus.ASR_STOPPED || p0.getRtAsrStatus() == StentorMMU$RtAsrStatus.ASR_SILENCE))) {
             this.c();
             this.x = true;
             this.w("mVadHasDetected : "+p0.getRtAsrStatus(), dEBUG);
          }
          if (p0.getStatusValue() == 1) {
             tD = this.D;
             tD.n = tD.n + true;
             if (!p0.getSerialNo() - this.q) {
                this.h(p0);
                this.q = this.q + 1;
             }else if(p0.getSerialNo() - this.q > 0){
                this.p.put(Long.valueOf(p0.getSerialNo()), p0);
                if (this.p.size() > this.r) {
                   iterator = this.p.entrySet().iterator();
                   uEntry = iterator.next();
                   this.h(uEntry.getValue());
                   iterator.remove();
                   this.q = uEntry.getKey().longValue() + 1;
                }
             }
             iterator = this.p.entrySet().iterator();
             while (iterator.hasNext()) {
                uEntry = iterator.next();
                if (!this.q - uEntry.getKey().longValue()) {
                   this.h(uEntry.getValue());
                   iterator.remove();
                   long l1 = uEntry.getKey().longValue() + 1;
                   this.q = l1;
                }else if(!p0.getSerialNo() - this.d){
                   this.w = true;
                }
                if (this.w != null && (!this.p.size() || this.p.size() > this.r)) {
                   Iterator iterator1 = this.p.entrySet().iterator();
                   while (iterator1.hasNext()) {
                      Map$Entry uEntry1 = iterator1.next();
                      this.h(uEntry1.getValue());
                      iterator1.remove();
                      l = uEntry1.getValue().getSerialNo() + 1;
                      this.q = l;
                   }
                   this.g(this.s, this.t, Asr$PB$StentorASRState.ASREnd, this.v, this.q, this.n);
                   this.y = true;
                   iterator1.A = false;
                   this.f();
                   this.o();
                   this.p();
                   this.x();
                   this.y();
                }
             }
          }else {
             tD = this.D;
             tD.o = tD.o + true;
             tD.y = true;
             tD.z = p0.getStatus().getNumber();
             this.w("grpc error: sessionID is "+this.n+",error code is "+p0.getStatus(), AudioCallback$DebugLevel.ERROR);
          }
          return;
       }
    }
    public void l(String p0){
       this.x();
       this.y();
       Iterator iterator = this.p.entrySet().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          this.h(uEntry.getValue());
          iterator.remove();
          long l = uEntry.getValue().getSerialNo() + 1;
          this.q = l;
       }
       this.g(this.s, this.t, Asr$PB$StentorASRState.ASROutOfTime, this.v, this.q, this.n);
       this.y = true;
       this.D.A = true;
       AudioCallback$DebugLevel iNFO = AudioCallback$DebugLevel.INFO;
       this.w(p0+"loggerEnd", iNFO);
       this.f();
       this.w(p0+" timeout timeInterval: sessionID is "+this.n+",totalTime is "+this.J+",has sended packet "+this.B.size()+",has received packet "+this.K+",timeInterval :"+this.D.p, iNFO);
       this.o();
       this.p();
       return;
    }
    public void logCallback(String p0,AudioCallback$DebugLevel p1){
       this.w(p0, p1);
    }
    public void m(Asr$PB p0,String p1){
       this.e = p0;
       p0.a = p1;
       this.w("Asr Version: 1.0.132 5395", AudioCallback$DebugLevel.ERROR);
    }
    public void modelOutput(int p0,int p1){
    }
    public final void n(){
       this.o();
       this.w = false;
       Long longx = Long.valueOf(0);
       this.J = longx;
       this.K = longx;
       this.B.clear();
    }
    public final void o(){
       this.c = 0;
       this.d = -1;
    }
    public final void p(){
       this.n = UUID.randomUUID().toString();
    }
    public void q(String p0){
       String str = "Asr setJsonConfig: "+p0;
       AudioCallback$DebugLevel eRROR = AudioCallback$DebugLevel.ERROR;
       try{
          this.w(str, eRROR);
          g og = new Gson().h(p0, g.class);
          if (og == null) {
             this.w("Asr setJsonConfig parse null", eRROR);
             return;
          }else if(og.asrAudioPackDuration > null){
             this.w("Asr setJsonConfig setPackDurationIn100Ms: "+og.asrAudioPackDuration, AudioCallback$DebugLevel.INFO);
             this.t(og.asrAudioPackDuration);
          }
          if (og.asrTimeoutEndPacket > null) {
             this.w("Asr setJsonConfig setMaxOutOfTime: "+og.asrTimeoutEndPacket, AudioCallback$DebugLevel.INFO);
             this.r(og.asrTimeoutEndPacket);
          }
          if (og.asrTimeoutVadSession > null) {
             this.w("Asr setJsonConfig setMaxVadDelayTime: "+og.asrTimeoutVadSession, AudioCallback$DebugLevel.INFO);
             this.l = og.asrTimeoutVadSession;
          }
       }catch(java.lang.Exception e4){
          e4.printStackTrace();
          this.w("Asr setJsonConfig exception: "+e4.getLocalizedMessage(), AudioCallback$DebugLevel.ERROR);
       }
          return;
    }
    public void r(int p0){
       this.i = p0;
    }
    public void s(boolean p0){
       this.o = p0;
    }
    public void setDataOutPut(byte[] p0,int p1,int p2,int p3,int p4,int p5,int p6,boolean p7){
       Asr j;
       Asr uAsr = this;
       int i = p1;
       int i1 = p6;
       if (!uAsr.I.get() && uAsr.y == null) {
          uAsr.A = Long.valueOf(System.currentTimeMillis());
          Timer timer = null;
          int i2 = 1000;
          long l = 0;
          StentorMMU$RtSpeechRecognitionRequest$a rtSpeechReco = 1;
          boolean b = false;
          if (!i1) {
             this.x();
             if (uAsr.o != null) {
                this.y();
                uAsr.G.lock();
                j = uAsr.j;
                if (j != null) {
                   j.cancel();
                   uAsr.j = timer;
                }
                Timer timer1 = new Timer();
                uAsr.j = timer1;
                uAsr.k = b;
                long l1 = (long)i2;
                timer1.schedule(new d(uAsr), l1, l1);
                uAsr.G.unlock();
             }
             uAsr.h = b;
             uAsr.p.clear();
             uAsr.s = "";
             uAsr.t = "";
             uAsr.v = Asr$PB$StentorASRStatus.ASR_UNKNOWN;
             uAsr.q = l;
             uAsr.w = b;
             this.n();
             uAsr.z = Long.valueOf(System.currentTimeMillis());
             uAsr.A = Long.valueOf(System.currentTimeMillis());
             uAsr.D.b();
             j = uAsr.D;
             j.k = uAsr.u;
             j.l = Long.valueOf(System.currentTimeMillis());
             j = uAsr.D;
             j.j = uAsr.n;
             j.r = Long.valueOf((long)i);
             uAsr.D.n = b;
             j = null;
          }else {
             j = 1;
          }
          uAsr.D.t = Long.valueOf((uAsr.c + 1));
          GeneratedMessageLite$Builder uBuilder = 2;
          if (p7) {
             uAsr.d = uAsr.c;
             uAsr.F.lock();
             j = uAsr.f;
             if (j != null) {
                j.cancel();
                uAsr.f = timer;
             }
             uAsr.f = new Timer();
             uAsr.g = b;
             uAsr.w("timer startTime begin", AudioCallback$DebugLevel.ERROR);
             long l2 = (long)i2;
             uAsr.f.schedule(new c(uAsr), l2, l2);
             uAsr.F.unlock();
             uAsr.w("reqid is "+uAsr.n+",serialno  end-----:"+uAsr.d, AudioCallback$DebugLevel.DEBUG);
             uAsr.D.m = Long.valueOf(System.currentTimeMillis());
             if (uAsr.D.t.longValue() - l > 0) {
                Asr d = uAsr.D;
                d.s = Long.valueOf(((d.m.longValue() - uAsr.D.l.longValue()) / uAsr.D.t.longValue()));
             }
             j = 2;
          }
          String str = (!p5)? "pcm": "opus";
          Asr c = uAsr.c;
          Asr n = uAsr.n;
          StentorMMU$RtSpeechRecognitionType aPPEND = StentorMMU$RtSpeechRecognitionType.APPEND;
          if (j != null) {
             if (j != rtSpeechReco && j == uBuilder) {
                aPPEND = StentorMMU$RtSpeechRecognitionType.CLOSE;
             }
          }else {
             aPPEND = StentorMMU$RtSpeechRecognitionType.NEW;
          }
          rtSpeechReco = StentorMMU$RtSpeechRecognitionRequest.newBuilder();
          rtSpeechReco.copyOnWrite();
          rtSpeechReco.instance.setReqId(n);
          rtSpeechReco.copyOnWrite();
          rtSpeechReco.instance.setType(aPPEND);
          rtSpeechReco.copyOnWrite();
          rtSpeechReco.instance.setAudioData(ByteString.copyFrom(p0));
          rtSpeechReco.copyOnWrite();
          rtSpeechReco.instance.setSerialNo(c);
          rtSpeechReco.copyOnWrite();
          rtSpeechReco.instance.setUserId(uAsr.a);
          rtSpeechReco.copyOnWrite();
          rtSpeechReco.instance.setModel(uAsr.D.a);
          rtSpeechReco.copyOnWrite();
          rtSpeechReco.instance.setFormat(str);
          rtSpeechReco.copyOnWrite();
          rtSpeechReco.instance.setChannel(p3);
          rtSpeechReco.copyOnWrite();
          rtSpeechReco.instance.setSampleRate(p2);
          rtSpeechReco.copyOnWrite();
          rtSpeechReco.instance.setDetectEndPoint(uAsr.o);
          StentorMMU$RtSpeechRecognitionRequest rtSpeechReco1 = rtSpeechReco.build();
          c = uAsr.e;
          if (c != null) {
             c.sendMessage(rtSpeechReco1, StentorMMU$RtSpeechRecognitionRequest.class);
          }
          uAsr.B.put(Long.valueOf(uAsr.c), Long.valueOf(System.currentTimeMillis()));
          uAsr.w("reqid is "+uAsr.n+"|type is"+j+"|serialno:"+i1+"|data length:"+i+"|interval time:"+(uAsr.A.longValue() - uAsr.z.longValue())+"current Time is:"+uAsr.A+"\n", AudioCallback$DebugLevel.DEBUG);
          uAsr.z = Long.valueOf(System.currentTimeMillis());
          uAsr.c = uAsr.c + 1;
       }
       return;
    }
    public void t(int p0){
       Asr tb = this.b;
       if (tb) {
          AudioJni.setPackDurationIn100Ms(tb, p0);
       }
       return;
    }
    public void u(String p0){
       this.a = p0;
       this.D.b = p0;
    }
    public void v(String p0){
       this.u = p0;
    }
    public void w(String p0,AudioCallback$DebugLevel p1){
       Asr te = this.e;
       if (te != null) {
          te.StentorLog(p0, p1);
       }else {
          Log.b(Asr.L, p0);
       }
       return;
    }
    public final void x(){
       this.F.lock();
       this.g = true;
       Asr tf = this.f;
       if (tf != null) {
          tf.cancel();
          this.f = null;
       }
       this.h = 0;
       this.F.unlock();
       return;
    }
    public final void y(){
       this.G.lock();
       this.k = true;
       Asr tj = this.j;
       if (tj != null) {
          tj.cancel();
          this.j = null;
          this.w("stop VAD Timer", AudioCallback$DebugLevel.ERROR);
       }
       this.m = 0;
       this.G.unlock();
       return;
    }
    public void z(){
       this.e = null;
    }
}
