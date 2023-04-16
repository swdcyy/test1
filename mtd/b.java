package mtd.b;
import msd.l;
import asd.c;
import dsd.e;
import kotlin.coroutines.CoroutineContext;
import java.lang.Object;
import kotlinx.coroutines.internal.ThreadContextKt;
import nsd.s0;
import csd.b;
import kotlin.Result;
import kotlin.TypeCastException;
import java.lang.String;
import java.lang.Throwable;
import qrd.j0;
import msd.p;
import ltd.a0;
import ftd.a;
import ftd.x;
import nsd.u;
import kotlinx.coroutines.JobSupport;
import ftd.g2;
import kotlinx.coroutines.TimeoutCancellationException;
import msd.a;
import java.lang.Boolean;

public final class b	// class@001d59
{

    public static final void a(l p0,c p1){
       c uoc = e.a(p1);
       CoroutineContext context = p1.getContext();
       Object obj = ThreadContextKt.c(context, null);
       if (p0 == null) {
          throw new TypeCastException("null cannot be cast to non-null type \(kotlin.coroutines.Continuation<T>\) -> kotlin.Any?");
       }
       p0 = s0.q(p0, 1).invoke(uoc);
       ThreadContextKt.a(context, obj);
       if (p0 != b.h()) {
          uoc.resumeWith(Result.constructor-impl(p0));
       }
       return;
    }
    public static final void b(p p0,Object p1,c p2){
       c uoc = e.a(p2);
       CoroutineContext context = p2.getContext();
       Object obj = ThreadContextKt.c(context, null);
       if (p0 == null) {
          throw new TypeCastException("null cannot be cast to non-null type \(R, kotlin.coroutines.Continuation<T>\) -> kotlin.Any?");
       }
       p0 = s0.q(p0, 2).invoke(p1, uoc);
       ThreadContextKt.a(context, obj);
       if (p0 != b.h()) {
          uoc.resumeWith(Result.constructor-impl(p0));
       }
       return;
    }
    public static final void c(l p0,c p1){
       p1 = e.a(p1);
       if (p0 == null) {
          throw new TypeCastException("null cannot be cast to non-null type \(kotlin.coroutines.Continuation<T>\) -> kotlin.Any?");
       }
       p0 = s0.q(p0, 1).invoke(p1);
       if (p0 != b.h()) {
          p1.resumeWith(Result.constructor-impl(p0));
       }
       return;
    }
    public static final void d(p p0,Object p1,c p2){
       p2 = e.a(p2);
       if (p0 == null) {
          throw new TypeCastException("null cannot be cast to non-null type \(R, kotlin.coroutines.Continuation<T>\) -> kotlin.Any?");
       }
       p0 = s0.q(p0, 2).invoke(p1, p2);
       if (p0 != b.h()) {
          p2.resumeWith(Result.constructor-impl(p0));
       }
       return;
    }
    public static final void e(c p0,l p1){
       p0 = e.a(p0);
       p1 = p1.invoke(p0);
       if (p1 != b.h()) {
          p0.resumeWith(Result.constructor-impl(p1));
       }
       return;
    }
    public static final Object f(a0 p0,Object p1,p p2){
       p0.m1();
       if (p2 == null) {
          throw new TypeCastException("null cannot be cast to non-null type \(R, kotlin.coroutines.Continuation<T>\) -> kotlin.Any?");
       }
       p1 = s0.q(p2, 2).invoke(p1, p0);
       if (p1 == b.h()) {
          p0 = b.h();
       }else {
          p0 = p0.K0(p1);
          if (p0 == g2.b) {
             p0 = b.h();
          }else if(!p0 instanceof x){
             p0 = g2.i(p0);
          }else {
             throw p0.a;
          }
       }
       return p0;
    }
    public static final Object g(a0 p0,Object p1,p p2){
       p0.m1();
       int i = 2;
       int i1 = 0;
       if (p2 == null) {
          throw new TypeCastException("null cannot be cast to non-null type \(R, kotlin.coroutines.Continuation<T>\) -> kotlin.Any?");
       }
       p1 = s0.q(p2, i).invoke(p1, p0);
       if (p1 == b.h()) {
          p1 = b.h();
       }else {
          p2 = p0.K0(p1);
          if (p2 == g2.b) {
             p1 = b.h();
          }else if(p2 instanceof x){
             x a = p2.a;
             if (!a instanceof TimeoutCancellationException || a.coroutine != p0) {
                i1 = 1;
             }
             if (!i1) {
                if (p1 instanceof x) {
                   throw p1.a;
                }
             }else {
                throw a;
             }
          }else {
             p1 = g2.i(p2);
          }
       }
       return p1;
    }
    public static final Object h(a0 p0,l p1,a p2){
       p2 = p2.invoke();
       if (p2 == b.h()) {
          return b.h();
       }
       p0 = p0.K0(p2);
       if (p0 == g2.b) {
          return b.h();
       }
       if (p0 instanceof x) {
          if (!p1.invoke(p0.a).booleanValue()) {
             if (p2 instanceof x) {
                throw p2.a;
             }
          }else {
             throw p0.a;
          }
       }else {
          p2 = g2.i(p0);
       }
       return p2;
    }
}
