package w2b.g;
import w2b.c;
import java.lang.Object;
import java.lang.String;
import java.util.concurrent.ExecutorService;
import t45.c;
import java.util.ArrayList;
import w2b.g$a;
import w2b.g$f;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.utility.Log;
import com.kuaishou.android.vader.b;
import com.kwai.robust.PatchProxyResult;
import java.util.UUID;
import com.kuaishou.android.vader.Channel;
import ar.b;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import com.kuaishou.android.vader.stat.VaderStat;
import java.lang.Integer;
import tq.b;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.util.List;
import android.content.Context;
import com.yxcorp.utility.SystemUtil;
import w2b.f;
import java.lang.Runnable;
import java.lang.Boolean;
import com.kuaishou.client.log.packages.nano.ClientLog$BatchReportEvent;
import com.google.protobuf.nano.MessageNano;
import w2b.e;
import com.kuaishou.client.log.packages.nano.ClientLog$ReportEvent;
import java.lang.Throwable;
import java.io.IOException;
import java.lang.UnsupportedOperationException;
import java.lang.StringBuilder;
import ekd.e0;
import com.yxcorp.gifshow.log.n;
import er.m;
import k2b.o0;
import w2b.g$b;
import tq.f;
import w2b.g$e;
import java.lang.Enum;
import com.kuaishou.protobuf.log.commentshow.nano.ClientCommentShowLogs$ClientCommentShowPage;
import com.kuaishou.log.realshow.nano.CoverShowLogs$CoverShowPage;
import com.kuaishou.log.realshow.nano.RealShowLogs$RealShowPage;
import com.kuaishou.log.realshow.nano.ClickLogs$ClickLog;
import w2b.g$c;
import w2b.g$d;

public class g implements c	// class@00271b
{
    public ExecutorService a;
    public boolean b;
    public final List c;
    public String d;
    public b e;
    public b f;
    public b g;
    public b h;
    public Context i;
    public String j;
    public String k;
    public String l;

    public void g(){
       super();
       this.a = c.f("log_operator");
       this.c = new ArrayList();
       this.d = null;
       this.j = "";
       this.k = "";
       this.l = "";
    }
    public void g(g$a p0){
       super();
       this.a = c.f("log_operator");
       this.c = new ArrayList();
       this.d = null;
       this.j = "";
       this.k = "";
       this.l = "";
    }
    public static c n(){
       return g$f.a;
    }
    public void a(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "7")) {
          return;
       }
       if (!(this.j).equals(p0) && p0 != null) {
          this.j = p0;
          Log.g("LogOperatorImpl", "Schedule update logControlConfig");
          b uob = this.t();
          if (uob != null) {
             uob.m(p0);
          }
       }else {
          Log.g("LogOperatorImpl", "LogControlConfig stays unchanged.");
       }
       return;
    }
    public String b(){
       Object obj = PatchProxy.apply(null, this, g.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.k = UUID.randomUUID().toString();
       return this.k;
    }
    public void c(){
       this.b = true;
    }
    public void d(){
       if (PatchProxy.applyVoid(null, this, g.class, "11")) {
          return;
       }
       b uob = this.t();
       if (uob != null) {
          uob.k();
       }
       uob = this.o();
       if (uob != null) {
          uob.k();
       }
       uob = this.r();
       if (uob != null) {
          uob.k();
       }
       uob = this.s();
       if (uob != null) {
          uob.k();
       }
       return;
    }
    public b e(Channel p0,String p1){
       b obj = PatchProxy.applyTwoRefs(p0, p1, this, g.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.t();
       if (obj != null) {
          return obj.g(p0, p1);
       }
       return null;
    }
    public String f(){
       String str = "stat_not_ready";
       b obj = PatchProxy.apply(null, this, g.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          obj = this.t();
          if (obj != null) {
             str = obj.h().get(1, TimeUnit.SECONDS).toString();
          }
          return str;
       }catch(java.util.concurrent.TimeoutException e0){
       label_002d :
          return e0;
       }catch(java.lang.InterruptedException e0){
       }catch(java.util.concurrent.ExecutionException e0){
          str = "stat_computation_error";
          goto label_002d ;
       }
    }
    public void g(int p0){
       g og = g.class;
       if (PatchProxy.isSupport(og) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, og, "9")) {
          return;
       }
       Channel uChannel = b.a(p0);
       b uob = this.t();
       if (uob != null && uChannel != Channel.USER_TRACK) {
          uob.l(uChannel);
       }
       uob = this.s();
       if (uob != null && uChannel == Channel.USER_TRACK) {
          uob.l(uChannel);
       }
       return;
    }
    public String getSessionId(){
       return this.k;
    }
    public void h(int p0){
       if (PatchProxy.isSupport(g.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, g.class, "10")) {
          return;
       }
       b uob = this.t();
       if (uob != null) {
          uob.n();
       }
       return;
    }
    public void i(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "5")) {
          return;
       }
       if (!TextUtils.isEmpty(p0)) {
          this.d = null;
          this.c.remove(p0);
       }
       return;
    }
    public void j(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "4")) {
          return;
       }
       this.b = false;
       this.d = p0;
       this.c.add(p0);
       return;
    }
    public void k(Context p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "1")) {
          return;
       }
       this.i = p0.getApplicationContext();
       if (!SystemUtil.L(p0)) {
          this.l = SystemUtil.r(p0);
       }
       return;
    }
    public void l(byte[] p0,Channel p1,String p2,b p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, g.class, "2")) {
          return;
       }
       String str = "LogOperatorImpl";
       if (p0 == null) {
          Log.g(str, "Add empty log, ignore it.");
          return;
       }else if(p2 == null){
          Log.g(str, "Add log but type is unknown.");
          return;
       }else {
          f uof = new f(this, p2, p0, p1, p3);
          this.a.execute(v7);
          return;
       }
    }
    public void m(byte[] p0,boolean p1,String p2){
       if (PatchProxy.isSupport(g.class) && PatchProxy.applyVoidThreeRefs(p0, Boolean.valueOf(p1), p2, this, g.class, "3")) {
          return;
       }
       String str = "LogOperatorImpl";
       if (p0 == null) {
          Log.g(str, "Add empty log, ignore it.");
          return;
       }else if(p2 == null){
          Log.g(str, "Add log but type is unknown.");
          return;
       }else if(("kwai").equals(p2)){
          try{
             ClientLog$BatchReportEvent event = MessageNano.mergeFrom(new ClientLog$BatchReportEvent(), p0).event;
             if (event == null) {
                return;
             }else {
                int len = event.length;
                for (int i = 0; i < len; i = i + 1) {
                   this.a.execute(super(this, event[i], p1));
                }
             }
          }catch(com.google.protobuf.nano.InvalidProtocolBufferNanoException e8){
             Log.h(str, "Invalid client log content", e8);
             e8.printStackTrace();
          }
          return;
       }else {
          throw new UnsupportedOperationException("Unsupported log type: "+p2);
       }
    }
    public synchronized final b o(){
       Context b;
       g obj = PatchProxy.applyWithListener(null, this, g.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.i;
       if (obj == null) {
          b = e0.b;
       }
       if (this.f == null && b != null) {
          this.f = new b(b, n.L.F1(), "", new g$b(this));
       }
       PatchProxy.onMethodExit(g.class, "19");
       return this.f;
    }
    public void onDestroy(){
    }
    public boolean p(){
       Object obj = PatchProxy.apply(null, this, g.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (this.b != null || (!this.c.isEmpty() && (this.c.size() != b || !this.c.contains(this.d)))) {
          b = false;
       }
       return b;
    }
    public final MessageNano q(byte[] p0,Channel p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, g.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int i = g$e.a[p1.ordinal()];
       if (i == 1) {
          return MessageNano.mergeFrom(new ClickLogs$ClickLog(), p0);
       }
       if (i == 2) {
          return MessageNano.mergeFrom(new RealShowLogs$RealShowPage(), p0);
       }
       if (i == 3) {
          return MessageNano.mergeFrom(new CoverShowLogs$CoverShowPage(), p0);
       }
       if (i != 4) {
          return null;
       }
       return MessageNano.mergeFrom(new ClientCommentShowLogs$ClientCommentShowPage(), p0);
    }
    public synchronized final b r(){
       Context b;
       g obj = PatchProxy.applyWithListener(null, this, g.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.i;
       if (obj == null) {
          b = e0.b;
       }
       if (this.g == null && b != null) {
          this.g = new b(b, n.L.s1(), "", new g$c(this));
       }
       PatchProxy.onMethodExit(g.class, "20");
       return this.g;
    }
    public final b s(){
       Context b;
       g obj = PatchProxy.applyWithListener(null, this, g.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.i;
       if (obj == null) {
          b = e0.b;
       }
       if (this.h == null && b != null) {
          this.h = new b(b, n.L.C1(), "", new g$d(this));
       }
       PatchProxy.onMethodExit(g.class, "21");
       return this.h;
    }
    public synchronized final b t(){
       Context b;
       g obj = PatchProxy.applyWithListener(null, this, g.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.i;
       if (obj == null) {
          b = e0.b;
       }
       if (this.e == null && b != null) {
          this.e = new b(b, n.L.k1(), "", new g$a(this));
       }
       PatchProxy.onMethodExit(g.class, "18");
       return this.e;
    }
}
