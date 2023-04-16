package com.kuaishou.live.common.core.component.like.count.b$a;
import java.lang.Runnable;
import com.kuaishou.live.common.core.component.like.count.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import android.os.SystemClock;
import com.kuaishou.live.common.core.component.like.count.b$b;
import java.util.concurrent.atomic.AtomicInteger;
import ho1.d;
import ho1.c;
import ok.x;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import d61.e0;
import brd.t;
import ho1.e;
import erd.g;
import cjd.e;
import erd.o;
import ho1.g;
import ho1.f;
import crd.b;

public class b$a implements Runnable	// class@001457
{
    public final b b;

    public void b$a(b p0){
       this.b = p0;
       super();
    }
    public void run(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, b$a.class, "1")) {
          return;
       }
       b$a tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(objArray, tb, b.class, "3")) {
          tb.g = SystemClock.elapsedRealtime();
       }
       b k = this.b.k;
       if (k != null) {
          k.a();
       }
       int i = this.b.b.get();
       b$a tb1 = this.b;
       g og = new g(this, i);
       this.b.l = c.b().a(this.b.c.get(), i, tb1.f, tb1.e, e0.c(tb1.h), e0.b(), e0.a(this.b.h)).doOnNext(new e(this)).map(new e()).subscribe(og, new f(this));
       this.b.b.set(0);
       return;
    }
}
