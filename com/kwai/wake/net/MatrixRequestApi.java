package com.kwai.wake.net.MatrixRequestApi;
import com.kwai.wake.net.MatrixRequestApi$matrixApiService$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Object;
import java.util.Map;
import asd.c;
import com.kwai.wake.net.MatrixRequestApi$fetchConfig$1;
import csd.b;
import ftd.r0;
import qrd.j0;
import java.lang.IllegalStateException;
import java.lang.String;
import gx7.d;
import com.kwai.wake.net.MatrixRequestApi$fetchConfig$2;
import ftd.k0;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineStart;
import msd.p;
import kotlinx.coroutines.a;
import kotlin.Result;
import java.lang.Throwable;
import com.kwai.wake.net.MatrixRequestApi$fetchControl$1;
import com.kwai.wake.net.MatrixRequestApi$fetchControl$2;
import cx7.a;
import com.kwai.wake.net.MatrixApiService;

public final class MatrixRequestApi	// class@001116
{
    public static final p a;
    public static final MatrixRequestApi b;

    static {
       MatrixRequestApi.b = new MatrixRequestApi();
       MatrixRequestApi.a = s.c(MatrixRequestApi$matrixApiService$2.INSTANCE);
    }
    public void MatrixRequestApi(){
       super();
    }
    public final Object a(Map p0,c p1){
       MatrixRequestApi$fetchConfig$1 uofetchConfi;
       if (p1 instanceof MatrixRequestApi$fetchConfig$1) {
          uofetchConfi = p1;
          MatrixRequestApi$fetchConfig$1 label = uofetchConfi.label;
          int i = Integer.MIN_VALUE;
          if (label & i) {
             uofetchConfi.label = label - i;
          label_0018 :
             MatrixRequestApi$fetchConfig$1 result = uofetchConfi.result;
             Object obj = b.h();
             MatrixRequestApi$fetchConfig$1 label1 = uofetchConfi.label;
             Object obj1 = null;
             if (label1 != null) {
                if (label1 == 1) {
                   j0.n(result);
                }else {
                   throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
             }else {
                j0.n(result);
                r0 or0 = a.b(d.b, null, null, new MatrixRequestApi$fetchConfig$2(p0, obj1), 3, null);
                uofetchConfi.L$0 = this;
                uofetchConfi.L$1 = p0;
                uofetchConfi.L$2 = or0;
                uofetchConfi.label = 1;
                result = or0.C(uofetchConfi);
                if (result == obj) {
                   return obj;
                }
             }
             p0 = Result.constructor-impl(result);
             if (!Result.isFailure-impl(p0)) {
                obj1 = p0;
             }
             return obj1;
          }
       }
       uofetchConfi = new MatrixRequestApi$fetchConfig$1(this, p1);
       goto label_0018 ;
    }
    public final Object b(String p0,Map p1,c p2){
       MatrixRequestApi$fetchControl$1 uofetchContr;
       if (p2 instanceof MatrixRequestApi$fetchControl$1) {
          uofetchContr = p2;
          MatrixRequestApi$fetchControl$1 label = uofetchContr.label;
          int i = Integer.MIN_VALUE;
          if (label & i) {
             uofetchContr.label = label - i;
          label_0018 :
             MatrixRequestApi$fetchControl$1 result = uofetchContr.result;
             Object obj = b.h();
             MatrixRequestApi$fetchControl$1 label1 = uofetchContr.label;
             Object obj1 = null;
             if (label1 != null) {
                if (label1 == 1) {
                   j0.n(result);
                }else {
                   throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
             }else {
                j0.n(result);
                r0 or0 = a.b(d.b, null, null, new MatrixRequestApi$fetchControl$2(p0, p1, obj1), 3, null);
                uofetchContr.L$0 = this;
                uofetchContr.L$1 = p0;
                uofetchContr.L$2 = p1;
                uofetchContr.L$3 = or0;
                uofetchContr.label = 1;
                result = or0.C(uofetchContr);
                if (result == obj) {
                   return obj;
                }
             }
             p0 = Result.constructor-impl(result);
             if (!Result.isFailure-impl(p0)) {
                obj1 = p0;
             }
             return obj1;
          }
       }
       uofetchContr = new MatrixRequestApi$fetchControl$1(this, p2);
       goto label_0018 ;
    }
    public final MatrixApiService c(){
       return MatrixRequestApi.a.getValue();
    }
}
