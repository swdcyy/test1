package com.kuaishou.android.security.bridge.main.b;
import com.kuaishou.android.security.bridge.main.a;
import android.os.ConditionVariable;
import java.util.concurrent.locks.ReentrantLock;
import com.kuaishou.android.security.internal.common.KSecurityContext;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.android.security.bridge.main.b$c;
import com.kuaishou.android.security.internal.common.h$a;
import java.lang.Number;
import com.kuaishou.android.security.base.perf.b;
import com.kuaishou.android.security.internal.common.h;
import com.kuaishou.android.security.internal.common.KSecurityContext$Mode;
import com.kuaishou.android.security.base.util.KSecurityTrack;
import com.kuaishou.android.security.internal.init.c;
import com.kuaishou.android.security.internal.dispatch.e;
import com.kuaishou.android.security.bridge.main.b$a;
import com.kuaishou.android.security.internal.init.c$a;
import android.content.Context;
import com.kuaishou.android.security.base.perf.e$b;
import com.kuaishou.android.security.base.perf.e;
import java.util.Locale;
import java.lang.Integer;
import com.kuaishou.android.security.base.perf.d$b;
import com.kuaishou.android.security.base.perf.d;
import com.kuaishou.android.security.base.util.j;
import com.kuaishou.android.security.base.log.KSecuritySdkILog;
import com.middleware.security.MXSec;
import com.kuaishou.android.security.bridge.main.b$b;
import u38.c;
import com.kuaishou.android.security.bridge.middleware.a;
import com.middleware.security.wrapper.IKSecurityBase;
import com.kuaishou.android.security.base.exception.KSException;
import java.lang.Throwable;
import com.kuaishou.android.security.base.exception.a;
import java.lang.Boolean;
import java.util.concurrent.locks.Lock;

public class b extends a	// class@0006bf
{
    public h a;
    public ConditionVariable b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public ConditionVariable g;
    public Lock h;
    public KSecurityContext i;

    public void b(){
       super();
       this.b = new ConditionVariable();
       this.c = false;
       this.d = false;
       this.e = false;
       this.f = false;
       this.g = new ConditionVariable();
       this.h = new ReentrantLock();
       this.i = new KSecurityContext();
    }
    public static ConditionVariable a(b p0){
       return p0.b;
    }
    public static boolean a(b p0,boolean p1){
       p0.e = p1;
       return p1;
    }
    public static b i(){
       Object obj = PatchProxy.apply(null, null, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return b$c.a();
    }
    public int a(h$a p0){
       int b;
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int[] ointArray = new int[]{b.a};
       if (this.d != null) {
          return b.a;
       }
       this.g.open();
       this.e = true;
       h oh = p0.b();
       this.a(oh);
       KSecurityContext$Mode aSYNC = KSecurityContext$Mode.ASYNC;
       b = (oh.d() == aSYNC)? true: false;
       this.c = b;
       KSecurityTrack.sLog(b.C);
       if (oh.d() == aSYNC) {
          KSecurityTrack.sLog(b.D);
          e.b().a(new b$a(this, ointArray, oh));
          e.b().a(oh.c());
       }else {
          KSecurityTrack.sLog(b.E);
          b = e.b().e(oh.c());
          this.e = false;
          this.b.open();
          KSecurityTrack.sLog(65);
          if (b == b.b) {
             KSecurityTrack.sLog(64);
             ointArray[0] = b.b;
             e.a(e$b.c, oh, "sync onerror", b);
             Object[] objArray = new Object[]{Integer.valueOf(b)};
             d.a(d$b.a, String.format(Locale.getDefault(), "KWSecurity sync initialize report:[%d]", objArray), b.f);
             j.d().a(b.f);
          }else {
             KSecurityTrack.sLog(66);
             this.j().e().onSecuriySuccess();
             j.d().j();
          }
          KSecurityTrack.setbEnableTrack(0);
       }
       MXSec.get().init(new b$b(this));
       MXSec.get().setWrapper(new a());
       return ointArray[0];
    }
    public final void a(h p0){
       this.a = p0;
    }
    public void a(boolean p0){
       this.d = p0;
    }
    public void b(boolean p0){
       this.e = p0;
    }
    public boolean g(){
       int i1;
       String str;
       d$b obj = PatchProxy.apply(null, this, b.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.d == null) {
          if (this.e == null) {
             this.g.block();
          }
          this.b.block();
       }
       if (this.d == null) {
          this.h.lock();
          if (this.f == null) {
             this.f = true;
             this.g.close();
             this.b.close();
             this.n();
             int i = 0;
             while (this.d == null) {
                this.n();
                i1 = i + 1;
                if (i > 5) {
                   break ;
                }
                i = i1;
             }
             if (this.d != null) {
                obj = d$b.a;
                i1 = b.q;
                str = "security initialize retry success";
             }else {
                obj = d$b.a;
                i1 = b.r;
                str = "security initialize retry failure";
             }
             d.a(obj, str, i1);
          }
          this.h.unlock();
       }
       return this.d;
    }
    public KSecurityContext h(){
       return this.i;
    }
    public h j(){
       return this.a;
    }
    public ConditionVariable k(){
       return this.b;
    }
    public boolean l(){
       return this.c;
    }
    public boolean m(){
       return this.e;
    }
    public final void n(){
       if (PatchProxy.applyVoid(null, this, b.class, "2")) {
          return;
       }
       KSecurityTrack.setbEnableTrack(true);
       this.h().setRetrySessionId("");
       this.a(this.j().f());
       this.h().setHasRetryInit(true);
       return;
    }
}
