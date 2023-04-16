package com.kwai.library.kwaiplayerkit.log.AbrGothamTraceImpl;
import ay6.d;
import java.lang.Object;
import com.kwai.library.kwaiplayerkit.log.AbrGothamTraceImpl$mLazyStackInitor$1;
import msd.a;
import qrd.p;
import qrd.s;
import com.kwai.library.kwaiplayerkit.log.AbrGothamTraceImpl$mAnrListener$2;
import com.kwai.library.kwaiplayerkit.log.AbrGothamTraceImpl$mLazyConfig$1;
import java.lang.String;
import kotlin.jvm.internal.a;
import ay6.g;
import android.os.Looper;
import android.os.SystemClock;
import java.lang.Integer;
import nsd.u;
import ay6.f;
import ay6.e;
import java.util.Objects;
import java.util.Set;
import java.util.LinkedList;
import ay6.h;
import z1.g;
import ay6.k;
import ay6.a;
import java.lang.Runnable;

public abstract class AbrGothamTraceImpl implements d	// class@00089b
{
    public final p a;
    public final p b;
    public final p c;
    public final p d;

    public void AbrGothamTraceImpl(){
       super();
       p op = s.c(AbrGothamTraceImpl$mLazyStackInitor$1.INSTANCE);
       this.a = op;
       this.b = op;
       this.c = s.c(new AbrGothamTraceImpl$mAnrListener$2(this));
       this.d = s.c(AbrGothamTraceImpl$mLazyConfig$1.INSTANCE);
    }
    public final void a(String p0){
       a.p(p0, "tag");
       g og = new g(a.g(Looper.getMainLooper(), Looper.myLooper()), null, p0, 0, null, null, SystemClock.elapsedRealtime(), false, 128, null);
       this.h(v0);
       e uoe = this.e();
       Objects.requireNonNull(f.c);
       a.p(uoe, "listener");
       f.a.add(uoe);
       this.f().push(v0);
    }
    public final void b(){
       if (!this.g()) {
          return;
       }
       this.d(false);
       return;
    }
    public final void c(){
       while (this.g()) {
          this.d(true);
       }
       return;
    }
    public final void d(boolean p0){
       g og = this.f().pollFirst();
       if (og != null) {
          og.h = p0;
          og.d = SystemClock.elapsedRealtime() - og.g;
          Objects.requireNonNull(h.e);
          h oh = h.d.q();
          if (oh == null) {
             oh = new h(og, this.d);
          }else {
             a.p(og, "<set-?>");
             oh.b = og;
             AbrGothamTraceImpl td = this.d;
             a.p(td, "<set-?>");
             oh.c = td;
          }
          a.a().a(oh);
       }
       if (this.f().isEmpty()) {
          e uoe = this.e();
          Objects.requireNonNull(f.c);
          a.p(uoe, "listener");
          f.a.remove(uoe);
       }
       return;
    }
    public final e e(){
       return this.c.getValue();
    }
    public final LinkedList f(){
       return this.b.getValue();
    }
    public final boolean g(){
       boolean b = (this.a.isInitialized() && !this.f().isEmpty())? true: false;
       return b;
    }
    public abstract void h(g p0);
}
