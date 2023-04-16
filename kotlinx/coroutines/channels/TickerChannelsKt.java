package kotlinx.coroutines.channels.TickerChannelsKt;
import htd.c0;
import asd.c;
import java.lang.Object;
import kotlinx.coroutines.channels.TickerChannelsKt$fixedDelayTicker$1;
import csd.b;
import qrd.j0;
import java.lang.IllegalStateException;
import java.lang.String;
import kotlinx.coroutines.c;
import qrd.l1;
import kotlinx.coroutines.channels.TickerChannelsKt$fixedPeriodTicker$1;
import ftd.j3;
import ftd.k3;
import java.lang.Long;
import dsd.a;
import java.lang.System;
import ftd.k1;
import usd.q;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.channels.TickerMode;
import htd.y;
import ftd.r1;
import kotlinx.coroutines.CoroutineDispatcher;
import ftd.z0;
import asd.a;
import kotlinx.coroutines.channels.TickerChannelsKt$ticker$3;
import ftd.k0;
import msd.p;
import kotlinx.coroutines.channels.ProduceKt;
import java.lang.StringBuilder;
import java.lang.IllegalArgumentException;
import kotlin.coroutines.EmptyCoroutineContext;

public final class TickerChannelsKt	// class@0019a2
{

    public static final Object a(long p0,long p1,c0 p2,c p3){
       TickerChannelsKt$fixedDelayTicker$1 uofixedDelay;
       TickerChannelsKt$fixedDelayTicker$1 l$0;
       TickerChannelsKt$fixedDelayTicker$1 j$1;
       TickerChannelsKt$fixedDelayTicker$1 j$0;
       TickerChannelsKt$fixedDelayTicker$1 uofixedDelay1;
       TickerChannelsKt$fixedDelayTicker$1 uofixedDelay2;
       if (p3 instanceof TickerChannelsKt$fixedDelayTicker$1) {
          uofixedDelay = p3;
          TickerChannelsKt$fixedDelayTicker$1 label = uofixedDelay.label;
          int i = Integer.MIN_VALUE;
          int i1 = label & i;
          if (i1) {
             int i2 = label - i;
             uofixedDelay.label = i2;
          label_0018 :
             TickerChannelsKt$fixedDelayTicker$1 result = uofixedDelay.result;
             Object obj = b.h();
             TickerChannelsKt$fixedDelayTicker$1 label1 = uofixedDelay.label;
             if (label1 != null) {
                if (label1 != 1) {
                   if (label1 != 2) {
                      if (label1 == 3) {
                         l$0 = uofixedDelay.L$0;
                         j$1 = uofixedDelay.J$1;
                         j$0 = uofixedDelay.J$0;
                         j0.n(result);
                      label_0036 :
                         uofixedDelay1 = l$0;
                         uofixedDelay2 = j$1;
                         l$0 = j$0;
                      }else {
                         throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                      }
                   }else {
                      l$0 = uofixedDelay.L$0;
                      j$1 = uofixedDelay.J$1;
                      j$0 = uofixedDelay.J$0;
                      j0.n(result);
                   label_0083 :
                      uofixedDelay.J$0 = j$0;
                      uofixedDelay.J$1 = j$1;
                      uofixedDelay.L$0 = l$0;
                      uofixedDelay.label = 3;
                      if (c.a(j$0, uofixedDelay) == obj) {
                         return obj;
                      }else {
                         goto label_0036 ;
                      }
                   }
                }else {
                   uofixedDelay1 = uofixedDelay.L$0;
                   uofixedDelay2 = uofixedDelay.J$1;
                   l$0 = uofixedDelay.J$0;
                   j0.n(result);
                }
             }else {
                j0.n(result);
                uofixedDelay.J$0 = p0;
                uofixedDelay.J$1 = p1;
                uofixedDelay.L$0 = p2;
                uofixedDelay.label = 1;
                if (c.a(p1, uofixedDelay) == obj) {
                   return obj;
                }
             }
             uofixedDelay.J$0 = l$0;
             uofixedDelay.J$1 = uofixedDelay2;
             uofixedDelay.L$0 = uofixedDelay1;
             uofixedDelay.label = 2;
             if (uofixedDelay1.l(l1.a, uofixedDelay) == obj) {
                return obj;
             }else {
                l$0 = uofixedDelay1;
                j$1 = uofixedDelay2;
                j$0 = l$0;
                goto label_0083 ;
             }
          }
       }
       uofixedDelay = new TickerChannelsKt$fixedDelayTicker$1(p3);
       goto label_0018 ;
    }
    public static final Object b(long p0,long p1,c0 p2,c p3){
       TickerChannelsKt$fixedPeriodTicker$1 uofixedPerio;
       TickerChannelsKt$fixedPeriodTicker$1 j$3;
       TickerChannelsKt$fixedPeriodTicker$1 j$1;
       TickerChannelsKt$fixedPeriodTicker$1 j$0;
       long l1;
       j3 oj3;
       Long longx;
       long l2;
       long l5;
       long l8;
       long l = p1;
       c uoc = p3;
       if (uoc instanceof TickerChannelsKt$fixedPeriodTicker$1) {
          uofixedPerio = uoc;
          TickerChannelsKt$fixedPeriodTicker$1 label = uofixedPerio.label;
          int i = Integer.MIN_VALUE;
          int i1 = label & i;
          if (i1) {
             int i2 = label - i;
             uofixedPerio.label = i2;
          label_001c :
             TickerChannelsKt$fixedPeriodTicker$1 result = uofixedPerio.result;
             Object obj = b.h();
             TickerChannelsKt$fixedPeriodTicker$1 label1 = uofixedPerio.label;
             i1 = 4;
             int i3 = 3;
             int i4 = 2;
             TickerChannelsKt$fixedPeriodTicker$1 uofixedPerio1 = 1;
             if (label1 != null) {
                if (label1 != uofixedPerio1) {
                   if (label1 != i4) {
                      if (label1 != i3) {
                         if (label1 == i1) {
                            j$3 = uofixedPerio.J$3;
                            uofixedPerio1 = uofixedPerio.J$2;
                            label1 = uofixedPerio.L$0;
                            j$1 = uofixedPerio.J$1;
                            j$0 = uofixedPerio.J$0;
                            j0.n(result);
                         }else {
                            throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                         }
                      }else {
                         j$3 = uofixedPerio.J$3;
                         uofixedPerio1 = uofixedPerio.J$2;
                         label1 = uofixedPerio.L$0;
                         j$1 = uofixedPerio.J$1;
                         j$0 = uofixedPerio.J$0;
                         j0.n(result);
                         l5 = 3;
                      }
                      result = 4;
                   label_013d :
                      j$1 = j$0;
                      j$0 = j$3;
                      j$3 = j$1;
                      result = label1;
                      i4 = 2;
                   label_00be :
                      l1 = uofixedPerio1 + j$0;
                      uofixedPerio.J$0 = j$1;
                      uofixedPerio.J$1 = j$3;
                      uofixedPerio.L$0 = result;
                      uofixedPerio.J$2 = l1;
                      uofixedPerio.J$3 = j$0;
                      uofixedPerio.label = i4;
                      if (result.l(l1.a, uofixedPerio) == obj) {
                         return obj;
                      }else {
                         label1 = result;
                         j$3 = j$0;
                         j$0 = j$1;
                         j$1 = j$3;
                      label_00db :
                         oj3 = k3.b();
                         if (oj3 != null) {
                            longx = a.g(oj3.a());
                            if (longx != null) {
                               l2 = longx.longValue();
                            label_00f4 :
                               long l3 = l2;
                               TickerChannelsKt$fixedPeriodTicker$1 uofixedPerio2 = uofixedPerio;
                               long l4 = l1 - l3;
                               TickerChannelsKt$fixedPeriodTicker$1 uofixedPerio3 = l1;
                               l5 = 0;
                               l4 = q.o(l4, l5);
                               if (!l4 - l5 && j$3 - l5) {
                                  l5 = l3 - uofixedPerio3;
                                  l5 = l5 % j$3;
                                  l5 = j$3 - l5;
                                  l4 = l3 + l5;
                                  l3 = k1.c(l5);
                                  uofixedPerio2.J$0 = j$0;
                                  uofixedPerio2.J$1 = j$1;
                                  uofixedPerio2.L$0 = label1;
                                  uofixedPerio2.J$2 = l4;
                                  uofixedPerio2.J$3 = j$3;
                                  long l6 = l4;
                                  uofixedPerio2.J$4 = l3;
                                  uofixedPerio2.J$5 = l4;
                                  uofixedPerio2.J$6 = l5;
                                  uofixedPerio2.label = 3;
                                  if (c.a(l3, uofixedPerio2) == obj) {
                                     return obj;
                                  }else {
                                     uofixedPerio = uofixedPerio2;
                                     l1 = l6;
                                     goto label_013c ;
                                  }
                               }else {
                                  l3 = l4;
                                  uofixedPerio2.J$0 = j$0;
                                  uofixedPerio2.J$1 = j$1;
                                  uofixedPerio2.L$0 = label1;
                                  TickerChannelsKt$fixedPeriodTicker$1 uofixedPerio4 = j$1;
                                  TickerChannelsKt$fixedPeriodTicker$1 uofixedPerio5 = uofixedPerio3;
                                  uofixedPerio2.J$2 = uofixedPerio5;
                                  uofixedPerio2.J$3 = j$3;
                                  uofixedPerio2.J$4 = l3;
                                  uofixedPerio2.J$5 = l3;
                                  uofixedPerio2.label = 4;
                                  if (c.a(k1.c(l3), uofixedPerio2) == obj) {
                                     return obj;
                                  }else {
                                     uofixedPerio1 = uofixedPerio5;
                                     uofixedPerio = uofixedPerio2;
                                     j$1 = uofixedPerio4;
                                     goto label_013d ;
                                  }
                               }
                            }
                         }
                         l2 = System.nanoTime();
                         goto label_00f4 ;
                      }
                   }else {
                      j$3 = uofixedPerio.J$3;
                      l1 = uofixedPerio.J$2;
                      label1 = uofixedPerio.L$0;
                      j$1 = uofixedPerio.J$1;
                      j$0 = uofixedPerio.J$0;
                      j0.n(result);
                      goto label_00db ;
                   }
                }else {
                   j$1 = uofixedPerio.J$0;
                   j0.n(result);
                   result = uofixedPerio.L$0;
                   j$3 = uofixedPerio.J$1;
                   uofixedPerio1 = uofixedPerio.J$2;
                }
             }else {
                j0.n(result);
                oj3 = k3.b();
                if (oj3 != null) {
                   longx = a.g(oj3.a());
                   if (longx != null) {
                      l8 = longx.longValue();
                   label_009e :
                      l8 = l8 + k1.d(p1);
                      long l9 = p0;
                      uofixedPerio.J$0 = l9;
                      uofixedPerio.J$1 = l;
                      result = p2;
                      uofixedPerio.L$0 = result;
                      uofixedPerio.J$2 = l8;
                      uofixedPerio.label = uofixedPerio1;
                      if (c.a(l, uofixedPerio) == obj) {
                         return obj;
                      }else {
                         l1 = l8;
                         long l10 = l9;
                      }
                   }
                }
                l8 = System.nanoTime();
                goto label_009e ;
             }
             long l7 = k1.d(j$1);
             goto label_00be ;
          }
       }
       uofixedPerio = new TickerChannelsKt$fixedPeriodTicker$1(uoc);
       goto label_001c ;
    }
    public static final y c(long p0,long p1,CoroutineContext p2,TickerMode p3){
       int i = p1;
       CoroutineDispatcher uCoroutineDi = 1;
       int i1 = 0;
       String str = (p0 - i1 >= 0)? 1: null;
       String str1 = " ms";
       if (str) {
          if (i - i1 < 0) {
             uCoroutineDi = null;
          }
          if (uCoroutineDi) {
             TickerChannelsKt$ticker$3 oticker$3 = new TickerChannelsKt$ticker$3(p3, p0, p1, null);
             return ProduceKt.d(r1.b, z0.h().plus(p2), 0, v10);
          }else {
             throw new IllegalArgumentException("Expected non-negative initial delay, but has "+p1+str1.toString());
          }
       }else {
          throw new IllegalArgumentException("Expected non-negative delay, but has "+p0+str1.toString());
       }
    }
    public static y d(long p0,long p1,CoroutineContext p2,TickerMode p3,int p4,Object p5){
       EmptyCoroutineContext iNSTANCE;
       if (p4 & 0x02) {
          p1 = p0;
       }
       if (p4 & 0x04) {
          iNSTANCE = EmptyCoroutineContext.INSTANCE;
       }
       if (p4 & 0x08) {
          p3 = TickerMode.FIXED_PERIOD;
       }
       return TickerChannelsKt.c(p0, p1, iNSTANCE, p3);
    }
}
