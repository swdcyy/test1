package com.kwai.wake.net.MatrixRequestApi$fetchControl$2;
import msd.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import java.lang.String;
import java.util.Map;
import asd.c;
import java.lang.Object;
import kotlin.jvm.internal.a;
import ftd.k0;
import qrd.l1;
import csd.b;
import qrd.j0;
import java.lang.IllegalStateException;
import com.kwai.wake.net.MatrixRequestApi;
import com.kwai.wake.net.MatrixApiService;
import com.android.kwai.foundation.network.SyncResult;

public final class MatrixRequestApi$fetchControl$2 extends SuspendLambda implements p	// class@001113
{
    public final Map $params;
    public final String $pkgStatusJson;
    public Object L$0;
    public int label;
    public k0 p$;

    public void MatrixRequestApi$fetchControl$2(String p0,Map p1,c p2){
       this.$pkgStatusJson = p0;
       this.$params = p1;
       super(2, p2);
    }
    public final c create(Object p0,c p1){
       a.p(p1, "completion");
       MatrixRequestApi$fetchControl$2 uofetchContr = new MatrixRequestApi$fetchControl$2(this.$pkgStatusJson, this.$params, p1);
       uofetchContr.p$ = p0;
       return uofetchContr;
    }
    public final Object invoke(Object p0,Object p1){
       return this.create(p0, p1).invokeSuspend(l1.a);
    }
    public final Object invokeSuspend(Object p0){
       Object obj = b.h();
       MatrixRequestApi$fetchControl$2 tlabel = this.label;
       if (tlabel != null) {
          if (tlabel == 1) {
             j0.n(p0);
          }else {
             throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
          }
       }else {
          j0.n(p0);
          this.L$0 = this.p$;
          this.label = 1;
          p0 = MatrixRequestApi.b.c().fetchControl(this.$pkgStatusJson, this.$params, this);
          if (p0 == obj) {
             return obj;
          }
       }
       if (p0.isSuccess()) {
          return p0.getResult();
       }else {
          return null;
       }
    }
}
