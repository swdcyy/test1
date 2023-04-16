package com.kwai.middleware.azeroth.scheduler.AzerothSchedulers$a;
import java.lang.Object;
import nsd.u;
import brd.z;
import lrd.b;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.concurrent.ExecutorService;
import f97.a;
import java.util.concurrent.Executor;
import io.reactivex.android.schedulers.a;
import com.kwai.middleware.azeroth.scheduler.AzerothSchedulers;
import qrd.p;
import java.util.concurrent.ThreadPoolExecutor;

public final class AzerothSchedulers$a	// class@000d65
{

    public void AzerothSchedulers$a(){
       super();
    }
    public void AzerothSchedulers$a(u p0){
       super();
    }
    public final z a(){
       z oz = b.a();
       a.h(oz, "Schedulers.computation\(\)");
       return oz;
    }
    public final z b(){
       z oz = b.b(a.c());
       a.h(oz, "Schedulers.from\(Async.getGlobalExecutor\(\)\)");
       return oz;
    }
    public final z c(){
       z oz = a.c();
       a.h(oz, "AndroidSchedulers.mainThread\(\)");
       return oz;
    }
    public final z d(){
       z oz = b.b(AzerothSchedulers.a.getValue());
       a.h(oz, "Schedulers.from\(mAzerothApiThread\)");
       return oz;
    }
}
