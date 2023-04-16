package io.reactivex.rxkotlin.SubscribersKt;
import io.reactivex.rxkotlin.SubscribersKt$onNextStub$1;
import io.reactivex.rxkotlin.SubscribersKt$onErrorStub$1;
import io.reactivex.rxkotlin.SubscribersKt$onCompleteStub$1;
import msd.l;
import erd.g;
import io.reactivex.internal.functions.Functions;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import krd.c;
import brd.a0;
import crd.b;
import brd.t;
import msd.a;
import krd.b;
import erd.a;

public final class SubscribersKt	// class@0014e9
{
    public static final l a;
    public static final l b;
    public static final a c;

    static {
       SubscribersKt.a = SubscribersKt$onNextStub$1.INSTANCE;
       SubscribersKt.b = SubscribersKt$onErrorStub$1.INSTANCE;
       SubscribersKt.c = SubscribersKt$onCompleteStub$1.INSTANCE;
    }
    public static final g a(l p0){
       g og;
       if (p0 == SubscribersKt.a) {
          og = Functions.d();
          a.h(og, "Functions.emptyConsumer\(\)");
       }else if(p0 != null){
          og = new c(p0);
       }
       return og;
    }
    public static final g b(l p0){
       g f;
       if (p0 == SubscribersKt.b) {
          f = Functions.f;
          a.h(f, "Functions.ON_ERROR_MISSING");
       }else if(p0 != null){
          f = new c(p0);
       }
       return f;
    }
    public static final b c(a0 p0,l p1,l p2){
       a.q(p0, "$this$subscribeBy");
       a.q(p1, "onError");
       a.q(p2, "onSuccess");
       b uob = p0.R(SubscribersKt.a(p2), SubscribersKt.b(p1));
       a.h(uob, "subscribe\(onSuccess.asCo¡­rror.asOnErrorConsumer\(\)\)");
       return uob;
    }
    public static b d(t p0,l p1,a p2,l p3,int p4,Object p5){
       if (p4 & 0x01) {
          p1 = SubscribersKt.b;
       }
       p2 = (p4 & 0x02)? SubscribersKt.c: null;
       if (p4 & 0x04) {
          p3 = SubscribersKt.a;
       }
       a.q(p0, "$this$subscribeBy");
       a.q(p1, "onError");
       a.q(p2, "onComplete");
       a.q(p3, "onNext");
       g og = SubscribersKt.a(p3);
       g og1 = SubscribersKt.b(p1);
       if (p2 == SubscribersKt.c) {
          p2 = Functions.c;
          a.h(p2, "Functions.EMPTY_ACTION");
       }else if(p2 != null){
          b uob1 = new b(p2);
       }
       b uob = p0.subscribe(og, og1, p2);
       a.h(uob, "subscribe\(onNext.asConsu¡­ete.asOnCompleteAction\(\)\)");
       return uob;
    }
}
