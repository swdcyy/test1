package com.kwai.framework.network.keyconfig.a;
import ob6.p;
import com.kwai.framework.network.keyconfig.a$c;
import nsd.u;
import java.lang.Object;
import java.lang.String;
import java.util.concurrent.ExecutorService;
import t45.c;
import java.util.concurrent.Executor;
import brd.z;
import lrd.b;
import kotlin.jvm.internal.a;
import java.util.Objects;
import ob6.p$a;
import yb6.e;
import ob6.g;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import qb6.b;
import java.io.File;
import java.io.RandomAccessFile;
import ob6.g$a;
import java.nio.ByteBuffer;
import ta6.c;
import q87.c;
import java.io.Closeable;
import java.lang.Throwable;
import isd.b;
import java.io.IOException;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;
import o56.c;
import o56.a;
import android.app.Application;
import android.content.Context;
import com.yxcorp.utility.SystemUtil;
import com.kwai.framework.network.keyconfig.a$a;
import com.yxcorp.utility.NetworkUtilsCached$a;
import com.yxcorp.utility.NetworkUtilsCached;
import com.kwai.framework.network.keyconfig.a$b;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.lang.Number;
import pb6.b;
import ekd.e0;
import ekd.k1;
import ob6.h;
import com.kwai.framework.network.keyconfig.BaseConfig;
import java.lang.Boolean;
import android.os.SystemClock;
import com.kuaishou.gifshow.network.degrade.RequestTiming;
import java.lang.StringBuilder;
import qrd.l1;
import java.util.concurrent.TimeUnit;
import java.lang.IllegalStateException;
import e66.d;
import android.content.SharedPreferences;
import brd.a0;
import com.kwai.framework.network.keyconfig.a$m;
import t45.d;
import com.kwai.framework.network.keyconfig.a$n;
import erd.g;
import com.kwai.framework.network.keyconfig.a$o;
import ob6.f;
import wkd.b;
import j80.c;
import rb6.b;
import ob6.m;
import gb6.a;
import ob6.i;
import brd.t;
import com.kwai.framework.network.keyconfig.a$d;
import com.kwai.framework.network.diffinfo.DiffInfoSwitch;
import erd.o;
import com.kwai.framework.network.keyconfig.a$e;
import com.kwai.framework.network.keyconfig.a$k;
import com.kwai.framework.network.keyconfig.a$l;
import com.kwai.framework.network.keyconfig.a$f;
import com.kwai.framework.network.keyconfig.a$g;
import com.kwai.framework.network.keyconfig.a$h;
import com.kwai.framework.network.keyconfig.a$i;
import com.kwai.framework.network.keyconfig.a$j;
import erd.a;
import ok.n;
import com.google.common.util.concurrent.h;
import java.util.concurrent.ExecutionException;
import java.lang.Error;
import com.google.common.util.concurrent.ExecutionError;
import com.google.common.util.concurrent.UncheckedExecutionException;
import java.io.FileOutputStream;
import java.nio.channels.FileChannel;
import yk.b;
import java.lang.Long;
import com.kwai.framework.network.keyconfig.a$p;
import java.lang.Runnable;

public class a implements p	// class@000c31
{
    public final ExecutorService b;
    public final z c;
    public final ConcurrentLinkedQueue d;
    public final e e;
    public final g f;
    public final Future g;
    public b h;
    public long i;
    public Future j;
    public Future k;
    public boolean l;
    public long m;
    public boolean n;
    public h o;
    public static final a$c p;

    static {
       a.p = new a$c(null);
    }
    public void a(){
       b uob1;
       super();
       ExecutorService uExecutorSer = c.f("key_config");
       this.b = uExecutorSer;
       z oz = b.b(uExecutorSer);
       a.o(oz, "Schedulers.from\(executor\)");
       this.c = oz;
       Objects.requireNonNull(p.a);
       this.d = p$a.a;
       this.e = new e(0, 0);
       String str = "KeyConfigManager";
       Object[] objArray = null;
       b uob = PatchProxy.apply(objArray, this, a.class, "23");
       if (uob != PatchProxyResult.class) {
       }else {
          try{
             File uFile = this.k();
             if (uFile.exists()) {
                RandomAccessFile randomAccess = new RandomAccessFile(uFile, "r");
                int i = (int)randomAccess.length();
                if (!i) {
                   uob = g.c.b();
                }else {
                   byte[] uobyteArray = new byte[i];
                   randomAccess.readFully(uobyteArray);
                   Object[] objArray1 = new Object[0];
                   c.C().w(str, "getHighPriorityConfig successfully.", objArray1);
                   uob = b.i(ByteBuffer.wrap(uobyteArray));
                }
                b.a(randomAccess, objArray);
                a.o(uob, "RandomAccessFile\(file, \"¡­er\)\n          }\n        }");
             }else {
                uob1 = g.c.b();
             }
          }catch(java.lang.Exception e2){
             if (!e2 instanceof IOException) {
                ExceptionHandler.handleCaughtException(e2);
             }
             c.C().v(str, "Error getting highPriorityConfig, use predefined one.", e2);
             uob1 = g.c.b();
          }
          uob = uob1;
       }
       this.f = new g(uob);
       c uoc = a.a();
       a.o(uoc, "AppEnv.get\(\)");
       if (SystemUtil.L(uoc.a())) {
          NetworkUtilsCached.m(a$a.b);
       }
       Future uFuture = this.b.submit(new a$b(this));
       a.o(uFuture, "executor.submit\(Callable¡­ }\n      keyConfig\n    }\)");
       this.g = uFuture;
       return;
    }
    public boolean a(){
       return false;
    }
    public boolean b(){
       return this.n;
    }
    public int c(){
       Object obj = PatchProxy.apply(null, this, a.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       _monitor_enter(this);
       _monitor_exit(this);
       return this.f.h();
    }
    public synchronized b d(){
       a obj = PatchProxy.apply(null, this, a.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (e0.a) {
          k1.c();
       }
       if (this.h == null) {
          h mBaseConfig = this.m().mBaseConfig;
          a.o(mBaseConfig, "getNetworkOrLocalKeyConfig\(\).mBaseConfig");
          this.h = new b(mBaseConfig);
       }
       obj = this.h;
       a.m(obj);
       return obj;
    }
    public boolean e(){
       Object obj = PatchProxy.apply(null, this, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.f.e();
    }
    public h f(){
       return this.o;
    }
    public h g(){
       h oh;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       a uoa = a.class;
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, uoa, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       uoa = PatchProxy.apply(objArray, this, uoa, "16");
       if (uoa != patchProxyRe) {
       }else {
          _monitor_enter(this);
          if (this.l != null) {
             uoa = this.o;
             _monitor_exit(this);
          }else {
             uoa = null;
             if (this.j == null && !this.i - uoa) {
                this.i = SystemClock.elapsedRealtime();
                this.j = this.l(RequestTiming.COLD_START, objArray);
             }
             long l = (long)this.f.n() - (SystemClock.elapsedRealtime() - this.i);
             if (l - uoa <= 0) {
                this.l = true;
                uoa = this.o;
                _monitor_exit(this);
             }else {
                Object[] objArray1 = new Object[0];
                c.C().w("KeyConfigManager", "Schedule wait at most "+l+" ms.", objArray1);
                a tj = this.j;
                if (tj != null) {
                   _monitor_exit(this);
                   try{
                      oh = tj.get(l, TimeUnit.MILLISECONDS);
                   }catch(java.util.concurrent.TimeoutException e0){
                      Object[] objArray2 = new Object[0];
                      c.C().w("KeyConfigManager", "Wait key config timeout.", objArray2);
                   }catch(java.io.IOException e0){
                      c.C().v("KeyConfigManager", "Probably a network error: ", e0);
                   }catch(java.lang.Exception e0){
                      c.C().v("KeyConfigManager", "Error when getting keyConfig result.", e0);
                   }
                   if (oh != null) {
                      _monitor_enter(this);
                      this.o = oh;
                      _monitor_exit(this);
                   }
                   h oh1 = oh;
                }else {
                   throw new IllegalStateException("Required value was null.".toString());
                }
             }
          }
       }
       return uoa;
    }
    public long getServerTimestamp(){
       long l;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       a obj = PatchProxy.apply(null, this, a.class, "7");
       if (obj != patchProxyRe) {
          return obj.longValue();
       }
       obj = this.e;
       Objects.requireNonNull(obj);
       e obj1 = PatchProxy.apply(null, obj, e.class, "2");
       if (obj1 != patchProxyRe) {
          l = obj1.longValue();
       }else {
          _monitor_enter(obj);
          obj1 = obj.b;
          long l1 = 0;
          if (!obj1 - l1) {
             _monitor_exit(obj);
             l = l1;
          }else {
             _monitor_exit(obj);
             l = obj1 + (SystemClock.elapsedRealtime() - obj.a);
          }
       }
       return l;
    }
    public int getVersion(){
       a obj = PatchProxy.apply(null, this, a.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.o;
       h mVersion = (obj != null)? obj.mVersion: null;
       if (mVersion <= null) {
          mVersion = d.a.getInt("Version", 0);
       }
       return mVersion;
    }
    public a0 h(RequestTiming p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "requestTiming");
       a0 uoa0 = a0.y(new a$m(this, p0, p1)).T(d.c).r(a$n.b).p(a$o.b);
       a.o(uoa0, "Single\n        .fromCall¡­config: ${it.message}\"\) }");
       return uoa0;
    }
    public f i(){
       return this.f;
    }
    public a0 j(RequestTiming p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "requestTiming");
       return this.h(p0, null);
    }
    public final File k(){
       File obj = PatchProxy.apply(null, this, a.class, "25");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new File(b.a(-1504323719).h("keyconfig"), "high_priority_config.fb");
       Object[] objArray = new Object[0];
       c.C().w("KeyConfigManager", "HP file: "+obj.getAbsolutePath(), objArray);
       return obj;
    }
    public final Future l(RequestTiming p0,String p1){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       a uoa = a.class;
       a obj = PatchProxy.applyTwoRefs(p0, p1, this, uoa, "9");
       if (obj != patchProxyRe) {
          return obj;
       }
       _monitor_enter(this);
       obj = this.k;
       int i = 0;
       if (obj != null) {
          Object[] objArray = new Object[i];
          c.C().w("KeyConfigManager", "KeyConfig is requesting already, waiting it\'s result.", objArray);
          _monitor_exit(this);
          return obj;
       }else {
          b uob = new b(this.getVersion());
          Object[] objArray1 = new Object[i];
          c.C().w("KeyConfigManager", "Prepare extra info", objArray1);
          Object[] objArray2 = new Object[i];
          c.C().w("KeyConfigManager", "KeyConfig isRequesting = true", objArray2);
          m om = new m();
          a uoa1 = om.a();
          t ot = b.a(0x45ddd0b2).a(this.getVersion(), p1, uoa1.a(), uoa1.b(), p0).doOnNext(new a$d(this, p1, p0));
          a.o(ot, "Singleton.get\(KeyConfigA¡­.mBaseConfig\)\n          }");
          t ot1 = PatchProxy.applyTwoRefs(ot, om, this, uoa, "11");
          if (ot1 != patchProxyRe) {
          }else if(DiffInfoSwitch.c.a()){
             ot = ot.observeOn(this.c).map(om).observeOn(d.a);
             a.o(ot, "this.observeOn\(scheduler¡­veOn\(KwaiSchedulers.MAIN\)");
          }
          ot1 = ot;
          Future uFuture = ot1.doOnNext(new a$e(uob, this, p1, p0)).singleOrError().r(a$k.b).p(a$l.b).H(new a$f(uob, this, p1, p0)).G(this.c).u(new a$g(this, p1, p0)).r(new a$h(uob, this, p1, p0)).p(new a$i(uob, this, p1, p0)).n(new a$j(this, p1, p0)).b0();
          this.k = uFuture;
          a.m(uFuture);
          _monitor_exit(this);
          return uFuture;
       }
    }
    public final h m(){
       a obj = PatchProxy.apply(null, this, a.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.o;
       if (obj == null) {
          obj = this.g;
          try{
             n.j(obj);
             obj = h.a(obj);
             a.o(obj, "Futures.getUnchecked\(localKeyConfig\)");
          }catch(java.util.concurrent.ExecutionException e0){
             Throwable cause = e0.getCause();
             if (cause instanceof Error) {
                throw new ExecutionError(cause);
             }else {
                throw new UncheckedExecutionException(cause);
             }
          }
       }
       return obj;
    }
    public final void n(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, a.class, "24")) {
          return;
       }
       try{
          FileOutputStream uFileOutputS = new FileOutputStream(this.k());
          uFileOutputS.getChannel().write(this.f.a.b.duplicate());
          uFileOutputS.getChannel().force(false);
          uFileOutputS.getChannel().close();
          b.a(uFileOutputS, objArray);
       }catch(java.lang.Exception e0){
          if (!e0 instanceof IOException) {
             ExceptionHandler.handleCaughtException(e0);
          }
          c.C().v("KeyConfigManager", "error saving highPriorityConfig", e0);
       }
       return;
    }
    public final void o(h p0,boolean p1,String p2){
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidThreeRefs(p0, Boolean.valueOf(p1), p2, this, a.class, "19")) {
          return;
       }
       a to = this.o;
       int i = 0;
       h mVersion = (to != null)? to.mVersion: null;
       if (p0.mVersion < mVersion) {
          Object[] objArray = new Object[i];
          c.C().w("KeyConfigManager", "Version "+p0.mVersion+" < "+mVersion+". Quit Saving.", objArray);
          return;
       }else {
          this.o = p0;
          to = this.e;
          h mBaseConfig = p0.mBaseConfig;
          a.o(mBaseConfig, "keyConfig.mBaseConfig");
          long l = mBaseConfig.g();
          Objects.requireNonNull(to);
          e uoe = e.class;
          if (!PatchProxy.isSupport(uoe) || !PatchProxy.applyVoidOneRefs(Long.valueOf(l), to, uoe, "1")) {
             _monitor_enter(to);
             to.a = SystemClock.elapsedRealtime();
             to.b = l;
             _monitor_exit(to);
          }
          to = this.f;
          mBaseConfig = p0.mBaseConfig;
          a.o(mBaseConfig, "keyConfig.mBaseConfig");
          Objects.requireNonNull(to);
          if (!PatchProxy.applyVoidOneRefs(mBaseConfig, to, g.class, "12")) {
             a.p(mBaseConfig, "baseConfig");
             to.a = g.c.a(mBaseConfig);
          }
          if (p1) {
             this.b.execute(new a$p(this, p0, p2));
          }
          return;
       }
    }
}
