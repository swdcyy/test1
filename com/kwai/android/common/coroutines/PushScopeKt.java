package com.kwai.android.common.coroutines.PushScopeKt;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineStart;
import msd.p;
import ftd.r0;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kwai.android.common.coroutines.PushScope;
import ftd.k0;
import kotlinx.coroutines.a;
import kotlin.coroutines.EmptyCoroutineContext;
import ftd.z1;

public final class PushScopeKt	// class@00098b
{

    public static final r0 async(CoroutineContext p0,CoroutineStart p1,p p2){
       a.p(p0, "context");
       a.p(p1, "start");
       a.p(p2, "block");
       return a.a(PushScope.INSTANCE, p0, p1, p2);
    }
    public static r0 async$default(CoroutineContext p0,CoroutineStart p1,p p2,int p3,Object p4){
       EmptyCoroutineContext iNSTANCE;
       if (p3 & 0x01) {
          iNSTANCE = EmptyCoroutineContext.INSTANCE;
       }
       if (p3 & 0x02) {
          p1 = CoroutineStart.LAZY;
       }
       return PushScopeKt.async(iNSTANCE, p1, p2);
    }
    public static final z1 launch(CoroutineContext p0,CoroutineStart p1,p p2){
       a.p(p0, "context");
       a.p(p1, "start");
       a.p(p2, "block");
       return a.e(PushScope.INSTANCE, p0, p1, p2);
    }
    public static z1 launch$default(CoroutineContext p0,CoroutineStart p1,p p2,int p3,Object p4){
       EmptyCoroutineContext iNSTANCE;
       if (p3 & 0x01) {
          iNSTANCE = EmptyCoroutineContext.INSTANCE;
       }
       if (p3 & 0x02) {
          p1 = CoroutineStart.DEFAULT;
       }
       return PushScopeKt.launch(iNSTANCE, p1, p2);
    }
}
