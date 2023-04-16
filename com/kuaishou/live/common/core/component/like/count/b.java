package com.kuaishou.live.common.core.component.like.count.b;
import ok.x;
import com.kuaishou.live.common.core.component.like.count.b$b;
import java.lang.Object;
import java.util.concurrent.atomic.AtomicInteger;
import android.os.Handler;
import android.os.Looper;
import com.kuaishou.live.common.core.component.like.count.b$a;
import com.google.gson.JsonElement;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.os.SystemClock;
import java.lang.Runnable;
import ho1.d;
import ho1.c;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import d61.e0;
import brd.t;
import bp6.a;
import erd.g;
import crd.b;

public class b	// class@001459
{
    public long a;
    public final AtomicInteger b;
    public final x c;
    public final Handler d;
    public final int e;
    public long f;
    public long g;
    public LiveStreamFeedWrapper h;
    public boolean i;
    public JsonElement j;
    public final b$b k;
    public b l;
    public final Runnable m;

    public void b(int p0,x p1,b$b p2){
       super();
       this.a = 3000;
       this.b = new AtomicInteger();
       this.d = new Handler(Looper.getMainLooper());
       this.f = 1000;
       this.i = false;
       this.m = new b$a(this);
       this.c = p1;
       this.k = p2;
       this.e = p0;
    }
    public JsonElement a(){
       return this.j;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, b.class, "5")) {
          return;
       }
       this.b.incrementAndGet();
       long l = SystemClock.elapsedRealtime() - this.g;
       if (l - this.f >= 0) {
          this.d.post(this.m);
       }else if(this.b.get() == 1){
          this.d.removeCallbacks(this.m);
          this.d.postDelayed(this.m, (this.f - l));
       }
       return;
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, b.class, "6")) {
          return;
       }
       this.i = false;
       if (this.b.get() > 0) {
          this.d.removeCallbacks(this.m);
          this.l = c.b().a(this.c.get(), this.b.get(), this.f, this.e, e0.c(this.h), e0.b(), e0.a(this.h)).subscribe(new a());
       }
       return;
    }
    public void d(LiveStreamFeedWrapper p0){
       this.h = p0;
    }
}
