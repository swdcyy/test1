package com.kwai.emotionsdk.core.EmotionManagerDelegate$d;
import erd.g;
import com.kwai.emotionsdk.core.EmotionManagerDelegate;
import java.lang.Object;
import bk5.g;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.emotionsdk.core.j;
import kotlin.jvm.internal.a;
import java.util.List;
import java.util.Collection;
import java.lang.StringBuilder;
import java.lang.Thread;
import ok5.a;
import dk5.d;
import java.util.Objects;
import dk5.e;
import dk5.d$c;
import java.util.ArrayList;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.Set;
import dk5.d$b;
import java.lang.Throwable;
import java.lang.Runnable;
import android.os.Handler;
import el5.l;
import el5.j;
import java.util.concurrent.Callable;
import brd.t;
import el5.i;
import erd.r;
import jl5.m;
import brd.z;
import io.reactivex.android.schedulers.a;
import el5.g;
import io.reactivex.internal.functions.Functions;
import crd.b;
import el5.f;
import el5.e;
import el5.c;
import el5.a;
import ck5.l;
import ekd.k1;
import java.util.concurrent.atomic.AtomicInteger;
import com.kwai.emotionsdk.core.EmotionManagerDelegate$a;
import ek5.a;
import com.kwai.emotionsdk.core.exception.EmotionDataException;
import nsd.u;

public final class EmotionManagerDelegate$d implements g	// class@000d88
{
    public final EmotionManagerDelegate b;

    public void EmotionManagerDelegate$d(EmotionManagerDelegate p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       long l;
       if (PatchProxy.applyVoidOneRefs(p0, this, EmotionManagerDelegate$d.class, "1")) {
       }else {
          p0 = j.e();
          a.o(p0, "EmotionDataManagerInternal.getInstance\(\)");
          p0 = p0.a();
          a.o(p0, "EmotionDataManagerIntern…ance\(\).allEmotionPackages");
          int i = 1;
          String str = "Thread.currentThread\(\)";
          String str1 = "EmotionManagerDelegate";
          boolean b = false;
          if (p0.isEmpty() ^ i) {
             p0.b = i;
             p0.c = b;
             Thread thread = Thread.currentThread();
             a.o(thread, str);
             a.a(str1, "initEmotionDataInternal 7 初始化完成 "+thread.getName());
             p0 = d.a();
             Objects.requireNonNull(p0);
             if (!PatchProxy.applyVoid(null, p0, d.class, "3")) {
                if (p0.e == null) {
                   p0.e = new e(new d$c());
                }
                ArrayList uArrayList = new ArrayList();
                p0.a.writeLock().lock();
                p0.c = i;
                uArrayList.addAll(p0.b);
                p0.b.clear();
                p0.a.writeLock().unlock();
                p0.d.post(new d$b(uArrayList, p0.c, null));
             }
             p0 = l.b();
             Objects.requireNonNull(p0);
             str1 = "2";
             if (!PatchProxy.applyVoid(null, p0, l.class, str1)) {
                t.fromCallable(new j(p0)).filter(i.b).subscribeOn(m.b).observeOn(a.c()).subscribe(new g(p0), Functions.d());
             }
             p0 = f.b();
             Objects.requireNonNull(p0);
             if (!PatchProxy.applyVoid(null, p0, f.class, str1)) {
                t.fromCallable(e.b).filter(c.b).subscribeOn(m.b).observeOn(m.a).subscribe(new a(p0), Functions.d());
             }
             p0 = this.b;
             Objects.requireNonNull(p0);
             if (!PatchProxy.applyVoid(null, p0, EmotionManagerDelegate.class, "8")) {
                k1.o(new l(p0));
             }
             p0 = EmotionManagerDelegate.g;
             l = p0.a();
             a.b(i, p0.b().getAndIncrement(), l, "");
          }else {
             p0.b = b;
             p0.c = b;
             Thread thread1 = Thread.currentThread();
             a.o(thread1, str);
             a.a(str1, "initEmotionDataInternal 8 初始化失败 "+thread1.getName());
             this.b.g(new EmotionDataException("init data error", null, 2, null));
          }
       }
       return;
    }
}
