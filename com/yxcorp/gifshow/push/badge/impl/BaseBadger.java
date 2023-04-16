package com.yxcorp.gifshow.push.badge.impl.BaseBadger;
import com.yxcorp.gifshow.push.badge.a;
import java.lang.Object;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.lang.String;
import kotlin.jvm.internal.a;
import kotlinx.coroutines.ExecutorCoroutineDispatcher;
import ftd.o1;
import ftd.z1;
import ftd.w;
import ftd.c3;
import kotlin.coroutines.CoroutineContext;
import asd.a;
import ftd.k0;
import ftd.l0;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import android.content.Context;
import msd.a;
import com.yxcorp.gifshow.push.badge.impl.BaseBadger$asyncBadge$1;
import asd.c;
import kotlinx.coroutines.CoroutineStart;
import msd.p;
import kotlinx.coroutines.a;

public abstract class BaseBadger implements a	// class@001629
{
    public CoroutineContext a;
    public k0 b;
    public final String c;
    public final List d;

    public void BaseBadger(){
       super();
       ExecutorService uExecutorSer = Executors.newSingleThreadExecutor();
       a.o(uExecutorSer, "Executors.newSingleThreadExecutor\(\)");
       CoroutineContext uCoroutineCo = o1.c(uExecutorSer).plus(c3.c(null, 1, null));
       this.a = uCoroutineCo;
       this.b = l0.a(uCoroutineCo);
       this.c = "android.intent.action.BADGE_COUNT_UPDATE";
       this.d = CollectionsKt__CollectionsKt.E();
    }
    public List a(){
       return this.d;
    }
    public final void c(Context p0,a p1){
       a.p(p0, "context");
       a.p(p1, "block");
       a.f(this.b, null, null, new BaseBadger$asyncBadge$1(this, p1, p0, null), 3, null);
    }
    public final String d(){
       return this.c;
    }
}
