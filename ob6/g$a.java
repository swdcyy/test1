package ob6.g$a;
import java.lang.Object;
import nsd.u;
import com.kwai.framework.network.keyconfig.BaseConfig;
import qb6.b;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kwai.framework.network.keyconfig.degrade.DegradeConfig;
import yk.a;
import java.lang.Number;
import com.kwai.framework.network.keyconfig.TimeRange;
import qb6.c;
import java.lang.Long;
import java.util.Objects;
import java.lang.Math;
import java.lang.CharSequence;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import java.util.Collection;
import pb6.d;
import qb6.a;
import java.util.ArrayList;
import java.lang.Integer;
import java.lang.Boolean;
import java.nio.ByteBuffer;
import trd.t;

public final class g$a	// class@001fea
{

    public void g$a(){
       super();
    }
    public void g$a(u p0){
       super();
    }
    public final b a(BaseConfig p0){
       int i;
       TimeRange timeRange;
       int i2;
       String str3;
       c uoc1;
       int i3;
       String str4;
       int i4;
       DegradeConfig uDegradeConf;
       b uob1;
       DegradeConfig uDegradeConf4;
       DegradeConfig uDegradeConf5;
       int i7;
       int i8;
       DegradeConfig uDegradeConf6;
       DegradeConfig uDegradeConf7;
       int i9;
       int i10;
       int i11;
       Object[] objArray;
       String obj5;
       Object obj6;
       int[] obj7;
       g$a uoa3;
       String str7;
       String str8;
       int[] ointArray2;
       String str9;
       BaseConfig obj10;
       c uoc2;
       c uoc3;
       Object obj12;
       b obj = this;
       b obj1 = p0;
       b uob = b.class;
       g$a uoa = g$a.class;
       String str = "1";
       DegradeConfig obj2 = PatchProxy.applyOneRefs(obj1, obj, uoa, str);
       if (obj2 != PatchProxyResult.class) {
          return obj2;
       }
       a.p(obj1, "baseConfig");
       obj2 = p0.c();
       a uoa1 = new a(1024);
       String str1 = "4";
       TimeRange obj3 = PatchProxy.apply(null, obj1, BaseConfig.class, str1);
       if (obj3 != PatchProxyResult.class) {
          i = obj3.intValue();
       }else {
          obj10 = obj1.mDnsTimeoutMs;
          obj12 = 0x3a98;
          if (obj10 < null) {
             obj10 = null;
          }
          if (obj10 > obj12) {
             i = 0x3a98;
          }
          obj1.mDnsTimeoutMs = i;
       }
       int i1 = i;
       obj3 = null;
       if (obj2 != null) {
          DegradeConfig apiDegradeTi = obj2.apiDegradeTime;
          if (apiDegradeTi != null) {
             timeRange = apiDegradeTi.mStart;
          label_0056 :
             if (obj2 != null) {
                apiDegradeTi = obj2.apiDegradeTime;
                if (apiDegradeTi != null) {
                   obj3 = apiDegradeTi.mEnd;
                }
             }
             TimeRange timeRange1 = obj3;
             c uoc = c.class;
             String str2 = "11";
             if (PatchProxy.isSupport(uoc)) {
                i2 = 2;
                str3 = str2;
                uoc1 = uoc;
                i3 = i1;
                DegradeConfig obj4 = PatchProxy.applyThreeRefs(uoa1, Long.valueOf(timeRange), Long.valueOf(timeRange1), 0, c.class, "7");
                if (obj4 != PatchProxyResult.class) {
                   i2 = obj4.intValue();
                   str4 = str3;
                label_0109 :
                   a.o(obj2, "degradeConfig");
                   Objects.requireNonNull(obj2);
                   obj4 = PatchProxy.apply(null, obj2, DegradeConfig.class, "8");
                   if (obj4 != PatchProxyResult.class) {
                      i4 = obj4.intValue();
                      uDegradeConf = null;
                   }else {
                      i4 = Math.max(0, Math.min(0x2710, obj2.blockingWaitDurationMs));
                   }
                   int i5 = uoa1.i(p0.h());
                   apiDegradeTi = obj2.disableHomeFeedAutoRefresh;
                   DegradeConfig disableSpeed = obj2.disableSpeedTesting;
                   obj4 = obj2.disableYodaSyncConfig;
                   DegradeConfig uDegradeConf1 = obj2.disableAzerothSyncConfig;
                   uDegradeConf = obj2.disableIMSDKSyncConfig;
                   obj2 = obj2.apiDelayAndRandRequestTimePolicy;
                   if (obj2 == null) {
                      List list1 = CollectionsKt__CollectionsKt.E();
                   }
                   DegradeConfig uDegradeConf2 = uDegradeConf;
                   String str5 = "2";
                   DegradeConfig uDegradeConf3 = obj4;
                   int[] ointArray = PatchProxy.applyTwoRefs(uoa1, obj2, obj, uoa, str5);
                   int i6 = i5;
                   if (ointArray != PatchProxyResult.class) {
                      uob1 = uob;
                      uDegradeConf4 = disableSpeed;
                      uDegradeConf5 = apiDegradeTi;
                      i7 = i4;
                      i8 = i2;
                      uDegradeConf6 = uDegradeConf1;
                      uDegradeConf7 = uDegradeConf3;
                      i9 = 0;
                   }else {
                      ointArray = new int[obj2.size()];
                      i5 = obj2.size();
                      i8 = i2;
                      i2 = 0;
                      while (i2 < i5) {
                         int i12 = i5;
                         List list = obj2.get(i2);
                         DegradeConfig uDegradeConf8 = obj2;
                         a uoa2 = a.class;
                         int[] ointArray1 = ointArray;
                         d uod = d.class;
                         DegradeConfig uDegradeConf9 = disableSpeed;
                         String str6 = "3";
                         DegradeConfig uDegradeConf10 = apiDegradeTi;
                         obj6 = PatchProxy.applyTwoRefs(uoa1, list, obj, uoa, str6);
                         if (obj6 != PatchProxyResult.class) {
                            i10 = obj6.intValue();
                            uob1 = uob;
                            uoa3 = uoa;
                            str7 = str;
                            i7 = i4;
                            str8 = str4;
                            obj5 = str1;
                            uDegradeConf6 = uDegradeConf1;
                            uDegradeConf7 = uDegradeConf3;
                            ointArray2 = ointArray1;
                            uDegradeConf4 = uDegradeConf9;
                            uDegradeConf5 = uDegradeConf10;
                            str9 = str5;
                         }else {
                            Objects.requireNonNull(list);
                            int i13 = i4;
                            d uod1 = PatchProxy.apply(null, list, uod, str);
                            if (uod1 != PatchProxyResult.class) {
                            }else if(list.featureName == null){
                               list.featureName = new ArrayList();
                            }
                            uod1 = list.featureName;
                            a.o(uod1, "policy.featureName");
                            obj6 = PatchProxy.applyTwoRefs(uoa1, uod1, obj, uoa, str1);
                            if (obj6 != PatchProxyResult.class) {
                               i11 = obj6.intValue();
                               uoa3 = uoa;
                               str7 = str;
                            }else {
                               i11 = uod1.size();
                               obj7 = new int[i11];
                               uoa3 = uoa;
                               int i14 = uod1.size();
                               str7 = str;
                               for (int i15 = 0; i15 < i14; i14 = i14) {
                                  obj7[i15] = uoa1.i(uod1.get(i15));
                                  i15 = i15 + 1;
                               }
                               Object obj11 = PatchProxy.applyTwoRefs(uoa1, obj7, null, uoa2, "12");
                               if (obj11 != PatchProxyResult.class) {
                                  i10 = obj11.intValue();
                               }else {
                                  uoa1.u(4, i11, 4);
                                  i11 = i11 - 1;
                                  while (i11 >= 0) {
                                     uoa1.f(obj7[i11]);
                                  }
                                  i10 = uoa1.k();
                               }
                               i11 = i10;
                            }
                            i10 = i11;
                            objArray = null;
                            Object obj9 = PatchProxy.apply(objArray, list, uod, str5);
                            long l = (obj9 != PatchProxyResult.class)? obj9.longValue(): list.a(list.delayTimeMs, 0, d.a, d.b);
                            long l1 = l;
                            obj9 = PatchProxy.apply(null, list, uod, str6);
                            long l2 = (obj9 != PatchProxyResult.class)? obj9.longValue(): list.a(list.randTimeMs, 0, d.a, d.b);
                            long l3 = l2;
                            if (PatchProxy.isSupport(uoa2)) {
                               uDegradeConf7 = uDegradeConf3;
                               ointArray2 = ointArray1;
                               uDegradeConf4 = uDegradeConf9;
                               uDegradeConf5 = uDegradeConf10;
                               i7 = i13;
                               uob1 = uob;
                               uDegradeConf6 = uDegradeConf1;
                               uob = null;
                               str9 = str5;
                               str8 = str4;
                               obj5 = str1;
                               obj9 = PatchProxy.applyFourRefs(uoa1, Integer.valueOf(i10), Long.valueOf(l1), Long.valueOf(l3), null, a.class, "9");
                               if (obj9 != PatchProxyResult.class) {
                                  i10 = obj9.intValue();
                               }
                            }else {
                               uob1 = uob;
                               str8 = str4;
                               obj5 = str1;
                               uDegradeConf6 = uDegradeConf1;
                               uDegradeConf7 = uDegradeConf3;
                               ointArray2 = ointArray1;
                               uDegradeConf4 = uDegradeConf9;
                               uDegradeConf5 = uDegradeConf10;
                               i7 = i13;
                               uob = null;
                               str9 = str5;
                            }
                            uoa1.t(3);
                            if (!PatchProxy.isSupport(uoa2) || !PatchProxy.applyVoidTwoRefs(uoa1, Long.valueOf(l3), null, uoa2, "15")) {
                               uoa1.e(2, l3, 0);
                            }
                            if (!PatchProxy.isSupport(uoa2) || !PatchProxy.applyVoidTwoRefs(uoa1, Long.valueOf(l1), null, uoa2, "14")) {
                               uoa1.e(1, l1, 0);
                            }
                            if (PatchProxy.isSupport(uoa2)) {
                               obj10 = null;
                               if (PatchProxy.applyVoidTwoRefs(uoa1, Integer.valueOf(i10), obj10, uoa2, str8)) {
                               label_0322 :
                                  obj7 = PatchProxy.applyOneRefs(uoa1, obj10, uoa2, "16");
                                  if (obj7 != PatchProxyResult.class) {
                                     i10 = obj7.intValue();
                                  }else {
                                     i10 = uoa1.j();
                                  }
                               }
                            }else {
                               obj10 = null;
                            }
                            uoa1.g(uob, i10, uob);
                            goto label_0322 ;
                         }
                         ointArray2[i2] = i10;
                         i2 = i2 + 1;
                         obj7 = this;
                         str4 = str8;
                         str1 = obj5;
                         str5 = str9;
                         ointArray = ointArray2;
                         obj2 = uDegradeConf8;
                         i5 = i12;
                         uob = uob1;
                         uDegradeConf3 = uDegradeConf7;
                         disableSpeed = uDegradeConf4;
                         apiDegradeTi = uDegradeConf5;
                         i4 = i7;
                         uDegradeConf1 = uDegradeConf6;
                         uoa = uoa3;
                         str = str7;
                      }
                      uob1 = uob;
                      uDegradeConf4 = disableSpeed;
                      uDegradeConf5 = apiDegradeTi;
                      i7 = i4;
                      uDegradeConf6 = uDegradeConf1;
                      uDegradeConf7 = uDegradeConf3;
                      i9 = 0;
                      ointArray2 = ointArray;
                   }
                   obj1 = uob1;
                   obj = PatchProxy.applyTwoRefs(uoa1, ointArray, null, obj1, "32");
                   if (obj != PatchProxyResult.class) {
                      i10 = obj.intValue();
                   }else {
                      uoa1.u(4, ointArray.length, 4);
                      i10 = ointArray.length;
                      i10 = i10 - 1;
                      while (i10 >= 0) {
                         uoa1.f(ointArray[i10]);
                      }
                      i10 = uoa1.k();
                   }
                   i11 = 9;
                   i4 = 10;
                   if (PatchProxy.isSupport(obj1)) {
                      objArray = new Object[11];
                      objArray[i9] = uoa1;
                      objArray[1] = Integer.valueOf(i3);
                      objArray[2] = Integer.valueOf(i8);
                      objArray[3] = Integer.valueOf(i7);
                      objArray[4] = Integer.valueOf(i6);
                      objArray[5] = Boolean.valueOf(uDegradeConf5);
                      objArray[6] = Boolean.valueOf(uDegradeConf4);
                      objArray[7] = Boolean.valueOf(uDegradeConf7);
                      objArray[8] = Boolean.valueOf(uDegradeConf6);
                      objArray[i11] = Boolean.valueOf(uDegradeConf2);
                      objArray[i4] = Integer.valueOf(i10);
                      obj5 = PatchProxy.apply(objArray, null, obj1, "20");
                      if (obj5 != PatchProxyResult.class) {
                         i10 = obj5.intValue();
                      }else {
                      label_03f4 :
                         uoa1.t(i4);
                         if (PatchProxy.isSupport(obj1)) {
                            if (PatchProxy.applyVoidTwoRefs(uoa1, Integer.valueOf(i10), null, obj1, "31")) {
                            label_040f :
                               if (!PatchProxy.isSupport(obj1) || !PatchProxy.applyVoidTwoRefs(uoa1, Integer.valueOf(i6), null, obj1, "25")) {
                                  uoa1.g(3, i6, i9);
                               }
                               if (!PatchProxy.isSupport(obj1) || !PatchProxy.applyVoidTwoRefs(uoa1, Integer.valueOf(i7), null, obj1, "24")) {
                                  uoa1.d(2, i7, 500);
                               }
                               if (PatchProxy.isSupport(obj1)) {
                                  obj6 = null;
                                  if (PatchProxy.applyVoidTwoRefs(uoa1, Integer.valueOf(i8), obj6, obj1, "23")) {
                                  label_045d :
                                     if (!PatchProxy.isSupport(obj1) || !PatchProxy.applyVoidTwoRefs(uoa1, Integer.valueOf(i3), obj6, obj1, "22")) {
                                        uoa1.d(i9, i3, 1000);
                                     }
                                     if (PatchProxy.isSupport(obj1)) {
                                        if (PatchProxy.applyVoidTwoRefs(uoa1, Boolean.valueOf(uDegradeConf2), null, obj1, "30")) {
                                        label_0491 :
                                           if (!PatchProxy.isSupport(obj1) || !PatchProxy.applyVoidTwoRefs(uoa1, Boolean.valueOf(uDegradeConf6), null, obj1, "29")) {
                                              uoa1.a(7, uDegradeConf6, i9);
                                           }
                                           if (!PatchProxy.isSupport(obj1) || !PatchProxy.applyVoidTwoRefs(uoa1, Boolean.valueOf(uDegradeConf7), null, obj1, "28")) {
                                              uoa1.a(6, uDegradeConf7, i9);
                                           }
                                           if (!PatchProxy.isSupport(obj1) || !PatchProxy.applyVoidTwoRefs(uoa1, Boolean.valueOf(uDegradeConf4), null, obj1, "27")) {
                                              uoa1.a(5, uDegradeConf4, i9);
                                           }
                                           if (!PatchProxy.isSupport(obj1) || !PatchProxy.applyVoidTwoRefs(uoa1, Boolean.valueOf(uDegradeConf5), null, obj1, "26")) {
                                              uoa1.a(4, uDegradeConf5, i9);
                                           }
                                           obj7 = PatchProxy.applyOneRefs(uoa1, null, obj1, "34");
                                           if (obj7 != PatchProxyResult.class) {
                                              i10 = obj7.intValue();
                                           }else {
                                              i10 = uoa1.j();
                                           }
                                        }
                                     }else {
                                        obj6 = null;
                                     }
                                     uoa1.a(8, uDegradeConf2, i9);
                                     goto label_0491 ;
                                  }
                               }else {
                                  obj6 = null;
                               }
                               uoa1.g(1, i8, i9);
                               goto label_045d ;
                            }
                         }else {
                            Object obj8 = null;
                         }
                         uoa1.g(i11, i10, i9);
                         goto label_040f ;
                      }
                   }else {
                      goto label_03f4 ;
                   }
                   uoa1.l(i10);
                   uoa1.m();
                   obj = b.i(uoa1.a);
                   a.o(obj, "HighPriorityConfig.getRo¡­ityConfig\(b.dataBuffer\(\)\)");
                   return obj;
                }
             }else {
                str3 = str2;
                uoc1 = uoc;
                i3 = i1;
                i2 = 2;
             }
             uoa1.t(i2);
             if (PatchProxy.isSupport(uoc1)) {
                uoc2 = uoc1;
                if (PatchProxy.applyVoidTwoRefs(uoa1, Long.valueOf(timeRange1), null, uoc2, "10")) {
                   uoc1 = uoc2;
                label_00cf :
                   if (PatchProxy.isSupport(uoc1)) {
                      uoc2 = uoc1;
                      if (PatchProxy.applyVoidTwoRefs(uoa1, Long.valueOf(timeRange), null, uoc2, "9")) {
                         uoc3 = uoc2;
                      label_00f4 :
                         str4 = str3;
                         obj12 = PatchProxy.applyOneRefs(uoa1, null, uoc3, str4);
                         i = (obj12 != PatchProxyResult.class)? obj12.intValue(): uoa1.j();
                         i2 = i;
                         goto label_0109 ;
                      }
                   }else {
                      uoc2 = uoc1;
                   }
                   uoc3 = uoc2;
                   uoa1.e(0, timeRange, 0);
                   goto label_00f4 ;
                }
             }else {
                uoc2 = uoc1;
             }
             uoc1 = uoc2;
             uoa1.e(1, timeRange1, 0);
             goto label_00cf ;
          }
       }
       timeRange = obj3;
       goto label_0056 ;
    }
    public final b b(){
       Object obj = this;
       BaseConfig obj1 = PatchProxy.apply(null, obj, g$a.class, "5");
       if (obj1 != PatchProxyResult.class) {
          return obj1;
       }
       obj1 = new BaseConfig();
       obj1.mDnsTimeoutMs = 1000;
       DegradeConfig uDegradeConf = new DegradeConfig();
       uDegradeConf.apiDegradeTime = new TimeRange(0x17790887d00, 0x177923ff100);
       uDegradeConf.blockingWaitDurationMs = 3000;
       uDegradeConf.disableHomeFeedAutoRefresh = true;
       uDegradeConf.disableSpeedTesting = true;
       uDegradeConf.disableYodaSyncConfig = false;
       uDegradeConf.disableAzerothSyncConfig = true;
       uDegradeConf.disableIMSDKSyncConfig = true;
       d[] uodArray = new d[]{v12,v4,v4,v4};
       d uod = new d(t.k("heartbeat"), 0, 0xea60);
       d uod1 = new d(t.k("redDot"), 0, 0x1d4c0);
       String[] stringArray = new String[]{"realLog","push"};
       uod = new d(CollectionsKt__CollectionsKt.L(stringArray), 0x2710, 0x2710);
       uod = new d(t.k("clientLog"), 0x2710, 0x7530);
       uDegradeConf.apiDelayAndRandRequestTimePolicy = CollectionsKt__CollectionsKt.L(uodArray);
       obj1.mDegrade = uDegradeConf;
       return obj.a(obj1);
    }
}
