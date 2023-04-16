package com.kwai.wake.net.MatrixRequestApi$fetchConfig$2;
import msd.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import java.util.Map;
import asd.c;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import ftd.k0;
import qrd.l1;
import csd.b;
import qrd.j0;
import java.lang.System;
import com.kwai.wake.net.MatrixRequestApi;
import com.kwai.wake.net.MatrixApiService;
import gx7.g;
import java.lang.StringBuilder;
import android.os.Build;
import com.android.kwai.foundation.network.SyncResult;
import java.lang.IllegalStateException;

public final class MatrixRequestApi$fetchConfig$2 extends SuspendLambda implements p	// class@001111
{
    public final Map $params;
    public int label;
    public k0 p$;

    public void MatrixRequestApi$fetchConfig$2(Map p0,c p1){
       this.$params = p0;
       super(2, p1);
    }
    public final c create(Object p0,c p1){
       a.p(p1, "completion");
       MatrixRequestApi$fetchConfig$2 uofetchConfi = new MatrixRequestApi$fetchConfig$2(this.$params, p1);
       uofetchConfi.p$ = p0;
       return uofetchConfi;
    }
    public final Object invoke(Object p0,Object p1){
       return this.create(p0, p1).invokeSuspend(l1.a);
    }
    public final Object invokeSuspend(Object p0){
       b.h();
       if (this.label != null) {
          throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
       }
       j0.n(p0);
       p0 = null;
       String str = String.valueOf(System.currentTimeMillis());
       a.o(str, "tsStr");
       SyncResult syncResult = MatrixRequestApi.b.c().fetchConfig("20002", "2.0.2", str, g.a.a(str), Build.MANUFACTURER+'_'+Build.BRAND+'_'+Build.MODEL, this.$params);
       if (syncResult.isSuccess()) {
          p0 = syncResult.getResult();
       }
       return p0;
    }
}
