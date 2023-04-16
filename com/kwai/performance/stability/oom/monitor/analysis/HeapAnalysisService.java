package com.kwai.performance.stability.oom.monitor.analysis.HeapAnalysisService;
import android.app.IntentService;
import com.kwai.performance.stability.oom.monitor.analysis.HeapAnalysisService$a;
import nsd.u;
import java.lang.String;
import com.kwai.performance.stability.oom.monitor.analysis.LeakModel;
import java.util.LinkedHashSet;
import java.util.LinkedHashMap;
import java.lang.System;
import java.lang.StringBuilder;
import java.lang.Thread;
import java.lang.Object;
import yf7.h;
import kotlin.jvm.internal.a;
import kshark.lite.HeapObject$HeapClass;
import kshark.lite.b;
import wsd.m;
import java.util.Iterator;
import kshark.lite.HeapObject$b;
import java.lang.Long;
import java.util.Map;
import kotlin.Pair;
import java.util.List;
import kotlin.sequences.SequencesKt___SequencesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import qrd.l1;
import java.lang.Number;
import rtd.h;
import rtd.i;
import java.lang.Boolean;
import com.kwai.performance.stability.oom.monitor.analysis.HeapAnalysisService$b;
import java.util.Set;
import java.lang.Integer;
import zsd.b;
import kshark.lite.HeapObject;
import com.kwai.performance.stability.oom.monitor.analysis.LeakModel$LeakObject;
import java.util.Map$Entry;
import com.kwai.performance.stability.oom.monitor.analysis.LeakModel$LeakClass;
import kshark.lite.HeapObject$d;
import std.i$d;
import kshark.lite.PrimitiveType;
import java.lang.Enum;
import kshark.lite.HeapObject$c;
import std.i$c;
import com.kwai.performance.stability.oom.monitor.analysis.LeakModel$MetaData;
import kshark.lite.HeapAnalyzer;
import com.kwai.performance.stability.oom.monitor.analysis.HeapAnalysisService$c;
import kshark.lite.OnAnalysisProgressListener;
import kshark.lite.HeapAnalyzer$a;
import kshark.lite.AndroidReferenceMatchers;
import kshark.lite.AndroidReferenceMatchers$Companion;
import kshark.lite.HeapAnalyzer$c;
import kshark.lite.ApplicationLeak;
import kshark.lite.LeakTrace;
import kshark.lite.LeakTrace$GcRootType;
import kshark.lite.LeakTraceObject;
import java.util.Collection;
import java.util.Objects;
import java.util.Arrays;
import com.kwai.performance.stability.oom.monitor.analysis.LeakModel$LeakTraceChain;
import java.util.ArrayList;
import kshark.lite.LeakTraceReference;
import kshark.lite.LeakTraceReference$ReferenceType;
import com.kwai.performance.stability.oom.monitor.analysis.LeakModel$LeakTraceChain$LeakPathItem;
import zsd.u;
import kshark.lite.LibraryLeak;
import kshark.lite.ReferencePattern;
import rtd.a0;
import com.kwai.performance.stability.oom.monitor.analysis.HeapAnalysisService$d;
import kshark.lite.HprofHeapGraph;
import java.io.File;
import kshark.lite.HprofRecordTag;
import trd.d1;
import rtd.c;
import okio.d;
import rtd.j;
import rtd.j$a;
import java.io.Closeable;
import java.lang.Throwable;
import isd.b;
import rtd.k;
import rtd.b0;
import rtd.c0;
import kshark.lite.internal.HprofInMemoryIndex;
import kotlin.jvm.internal.Ref$LongRef;
import kotlin.jvm.internal.Ref$IntRef;
import java.util.EnumSet;
import rtd.v;
import std.h;
import kshark.lite.internal.HprofInMemoryIndex$b;
import kshark.lite.internal.HprofInMemoryIndex$a;
import java.lang.Iterable;
import trd.e1;
import rtd.a0$a;
import kshark.lite.internal.SortedBytesMap;
import std.p;
import kshark.lite.HprofVersion;
import std.c;
import utd.f;
import utd.d;
import rtd.y;
import rtd.w;
import kshark.lite.c;
import java.lang.IllegalArgumentException;
import android.content.Intent;
import android.os.Parcelable;
import android.os.ResultReceiver;
import com.kwai.performance.stability.oom.monitor.OOMFileManager;
import com.kwai.performance.monitor.base.MonitorBuildConfig;
import java.nio.charset.Charset;
import kotlin.io.FilesKt__FileReadWriteKt;
import com.google.gson.c;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import zk.g;
import java.lang.Exception;
import com.google.gson.Gson;
import java.io.IOException;
import android.os.Bundle;

public final class HeapAnalysisService extends IntentService	// class@00125d
{
    public b b;
    public final LeakModel c;
    public final Set d;
    public final Map e;
    public final Map f;
    public final Map g;
    public final Map h;
    public static final HeapAnalysisService$a i;

    static {
       HeapAnalysisService.i = new HeapAnalysisService$a(null);
    }
    public void HeapAnalysisService(){
       super("HeapAnalysisService");
       this.c = new LeakModel();
       this.d = new LinkedHashSet();
       this.e = new LinkedHashMap();
       this.f = new LinkedHashMap();
       this.g = new LinkedHashMap();
       this.h = new LinkedHashMap();
    }
    public final void a(){
       HeapObject$HeapClass heapClass6;
       String str6;
       String str7;
       String str8;
       HeapObject$HeapClass heapClass7;
       HeapObject$HeapClass heapClass8;
       HeapObject$HeapClass heapClass9;
       Pair pair;
       long l3;
       long l4;
       h oh;
       h oh1;
       String str9;
       HeapAnalysisService$b obj1;
       h oh3;
       Integer integer3;
       Iterator obj2;
       int i2;
       HeapObject$HeapClass heapClass10;
       l1 a;
       int i3;
       HeapAnalysisService heapAnalysis = this;
       long l = System.currentTimeMillis();
       String str = "HeapAnalysisService";
       h.d(str, "filterLeakingObjects "+Thread.currentThread());
       HeapAnalysisService b = heapAnalysis.b;
       String str1 = "mHeapGraph";
       if (b == null) {
          a.S(str1);
       }
       String str2 = "android.app.Activity";
       HeapObject$HeapClass heapClass = b.g(str2);
       HeapAnalysisService b1 = heapAnalysis.b;
       if (b1 == null) {
          a.S(str1);
       }
       HeapObject$HeapClass heapClass1 = b1.g("androidx.fragment.app.Fragment");
       if (heapClass1 == null) {
          b1 = heapAnalysis.b;
          if (b1 == null) {
             a.S(str1);
          }
          heapClass1 = b1.g("android.app.Fragment");
       }
       if (heapClass1 == null) {
          b1 = heapAnalysis.b;
          if (b1 == null) {
             a.S(str1);
          }
          heapClass1 = b1.g("android.support.v4.app.Fragment");
       }
       HeapAnalysisService b2 = heapAnalysis.b;
       if (b2 == null) {
          a.S(str1);
       }
       String str3 = "android.graphics.Bitmap";
       HeapObject$HeapClass heapClass2 = b2.g(str3);
       HeapAnalysisService b3 = heapAnalysis.b;
       if (b3 == null) {
          a.S(str1);
       }
       HeapObject$HeapClass heapClass3 = b3.g("libcore.util.NativeAllocationRegistry");
       HeapAnalysisService b4 = heapAnalysis.b;
       if (b4 == null) {
          a.S(str1);
       }
       HeapObject$HeapClass heapClass4 = b4.g("libcore.util.NativeAllocationRegistry$CleanerThunk");
       HeapAnalysisService b5 = heapAnalysis.b;
       if (b5 == null) {
          a.S(str1);
       }
       HeapObject$HeapClass heapClass5 = b5.g("android.view.Window");
       LinkedHashMap linkedHashMa = new LinkedHashMap();
       LinkedHashMap linkedHashMa1 = new LinkedHashMap();
       HeapAnalysisService b6 = heapAnalysis.b;
       if (b6 == null) {
          a.S(str1);
       }
       Iterator iterator = b6.k().iterator();
       Integer integer = null;
       long l1 = l;
       String str4 = " objectId:";
       String str5 = "OOM_ANALYSIS";
       while (iterator.hasNext()) {
          Iterator iterator1 = iterator;
          Object obj = iterator.next();
          if (obj.l()) {
             heapClass6 = heapClass;
             str6 = str;
             str7 = str1;
             str8 = str2;
             str = str3;
             heapClass7 = heapClass3;
             heapClass8 = heapClass4;
             heapClass9 = heapClass5;
          }else {
             heapClass8 = heapClass4;
             heapClass9 = heapClass5;
             long l2 = obj.j();
             str7 = str1;
             if (linkedHashMa.get(Long.valueOf(l2)) != null) {
                pair = linkedHashMa.get(Long.valueOf(l2));
                a.m(pair);
                str6 = str3;
                heapClass7 = heapClass3;
             }else {
                List list = SequencesKt___SequencesKt.V2(obj.i().i());
                heapClass7 = heapClass3;
                i2 = list.size() - 2;
                heapClass3 = CollectionsKt___CollectionsKt.F2(list, i2);
                l4 = 0;
                long l6 = (heapClass3 != null)? heapClass3.d(): l4;
                i2 = list.size() - 5;
                heapClass10 = CollectionsKt___CollectionsKt.F2(list, i2);
                if (heapClass10 != null) {
                   l4 = heapClass10.d();
                }
                str6 = str3;
                pair = new Pair(Long.valueOf(l6), Long.valueOf(l4));
                linkedHashMa.put(Long.valueOf(l2), pair);
                a = l1.a;
             }
             l3 = pair.component1().longValue();
             l4 = pair.component2().longValue();
             int b7 = true;
             if (heapClass != null && !heapClass.d() - l4) {
                oh = obj.h(str2, "mDestroyed");
                a.m(oh);
                oh1 = obj.h(str2, "mFinished");
                a.m(oh1);
                Boolean uBoolean = oh.b().a();
                a.m(uBoolean);
                if (!uBoolean.booleanValue()) {
                   uBoolean = oh1.b().a();
                   a.m(uBoolean);
                   if (!uBoolean.booleanValue()) {
                   label_02c3 :
                      heapClass6 = heapClass;
                   }
                }
                l3 = obj.d() & 0xffffffff;
                h.d(str, "activity name : "+obj.k()+" mDestroyed:"+oh.b().a()+" mFinished:"+oh1.b().a()+str4+l3);
                if (heapAnalysis.d(linkedHashMa1, l2, b7).b() <= 45) {
                   heapAnalysis.d.add(Long.valueOf(obj.d()));
                   heapAnalysis.e.put(Long.valueOf(obj.d()), "Activity Leak");
                   h oh2 = obj.h(str2, "mTitleColor");
                   if (oh2 != null) {
                      i oi = oh2.b();
                      if (oi != null) {
                         integer = oi.b();
                      }
                   }
                   if (integer != null) {
                      Integer integer1 = oh2.b().b();
                      a.m(integer1);
                      int i = 16;
                      heapClass6 = heapClass;
                      str9 = Integer.toString(integer1.intValue(), b.a(i));
                      String str10 = "java.lang.Integer.toStri¡­\(this, checkRadix\(radix\)\)";
                      a.o(str9, str10);
                      heapAnalysis.f.put(Long.valueOf(obj.d()), str9);
                      Integer integer2 = oh2.b().b();
                      a.m(integer2);
                      str1 = Integer.toString(integer2.intValue(), b.a(i));
                      a.o(str1, str10);
                      str9 = obj.k()+'@'+str1;
                      if (heapAnalysis.g.containsKey(str9)) {
                         obj1 = heapAnalysis.g.get(str9);
                         a.m(obj1);
                         heapAnalysis.h.put(Long.valueOf(obj.d()), obj1);
                      }
                   }else {
                      heapClass6 = heapClass;
                   }
                   h.d(str5, obj.k()+str4+obj.d());
                }else {
                   goto label_02c3 ;
                }
             }else {
                heapClass6 = heapClass;
                obj1 = null;
                if (heapClass1 != null && !heapClass1.d() - l3) {
                   oh = obj.h(heapClass1.j(), "mFragmentManager");
                   if (oh != null && oh.b().c() == null) {
                      oh = obj.h(heapClass1.j(), "mCalled");
                      if (oh != null) {
                         Boolean uBoolean1 = oh.b().a();
                         a.m(uBoolean1);
                         if (uBoolean1.booleanValue()) {
                         label_0311 :
                            h.d(str, "fragment name:"+obj.k()+" isLeak:"+b7);
                            if (heapAnalysis.d(linkedHashMa1, l2, b7).b() <= 45 && b7) {
                               heapAnalysis.d.add(Long.valueOf(obj.d()));
                               heapAnalysis.e.put(Long.valueOf(obj.d()), "Fragment Leak");
                               oh3 = obj.h(heapClass1.j(), "mWho");
                               if (oh3 != null) {
                                  i oi1 = oh3.b();
                                  if (oi1 != null) {
                                     integer = oi1.d();
                                  }
                               }
                               integer3 = integer;
                               if (integer3 != null) {
                                  heapAnalysis.f.put(Long.valueOf(obj.d()), integer3);
                                  str9 = obj.k()+'@'+integer3;
                                  if (heapAnalysis.g.containsKey(str9)) {
                                     obj2 = heapAnalysis.g.get(str9);
                                     a.m(obj2);
                                     heapAnalysis.h.put(Long.valueOf(obj.d()), obj2);
                                  }
                               }
                               h.d(str5, obj.k()+str4+obj.d());
                            }
                         }
                      }
                      b7 = false;
                      goto label_0311 ;
                   }
                }else if(heapClass2 != null && !heapClass2.d() - l3){
                   str3 = str6;
                   oh3 = obj.h(str3, "mWidth");
                   oh1 = obj.h(str3, "mHeight");
                   a.m(oh3);
                   integer3 = oh3.b().b();
                   a.m(integer3);
                   int i1 = integer3.intValue();
                   a.m(oh1);
                   Integer integer4 = oh1.b().b();
                   a.m(integer4);
                   i2 = integer4.intValue();
                   b7 = i1 * i2;
                   str8 = str2;
                   if (b7 >= 0x100201) {
                      h.b(str, "suspect leak! bitmap name: "+obj.k()+" width: "+i1+" height:"+i2);
                      if (heapAnalysis.d(linkedHashMa1, l2, true).b() <= 45) {
                         heapAnalysis.d.add(Long.valueOf(obj.d()));
                         str6 = str;
                         heapAnalysis.e.put(Long.valueOf(obj.d()), "Bitmap Size Over Threshold, "+i1+'x'+i2);
                         h.d(str5, obj.k()+str4+obj.d());
                         LeakModel$LeakObject leakObject = new LeakModel$LeakObject();
                         leakObject.className = obj.k();
                         leakObject.size = String.valueOf(b7);
                         leakObject.extDetail = i1+" x "+i2;
                         long l5 = obj.d() & 0xffffffff;
                         leakObject.objectId = String.valueOf(l5);
                         heapAnalysis.c.leakObjects.add(leakObject);
                      label_04e2 :
                         str = str3;
                      }
                   }
                   str6 = str;
                   goto label_04e2 ;
                }else {
                   str8 = str2;
                   str6 = str;
                   str = str6;
                   if (heapClass7 == null || (heapClass7.d() - l3 && (heapClass8 == null || (!heapClass8.d() - l3 || (heapClass9 != null && !heapClass9.d() - l3))))) {
                      heapAnalysis.d(linkedHashMa1, l2, obj1);
                   }
                }
             }
             str8 = str2;
             str6 = str;
             str = str6;
          }
          str3 = str;
          heapClass4 = heapClass8;
          l = l1;
          iterator = iterator1;
          heapClass5 = heapClass9;
          str1 = str7;
          str = str6;
          heapClass3 = heapClass7;
          heapClass = heapClass6;
          str2 = str8;
       }
       str7 = str1;
       obj2 = linkedHashMa1.entrySet().iterator();
       while (obj2.hasNext()) {
          Map$Entry uEntry = obj2.next();
          long l7 = uEntry.getKey().longValue();
          HeapAnalysisService$b value = uEntry.getValue();
          LeakModel$LeakClass leakClass = new LeakModel$LeakClass();
          b2 = heapAnalysis.b;
          if (b2 == null) {
             a.S(str7);
          }
          heapClass10 = b2.u(l7).a();
          str1 = (heapClass10 != null)? heapClass10.j(): integer;
          leakClass.className = str1;
          leakClass.objectCount = String.valueOf(value.a());
          h.d(str5, "leakClass.className: "+leakClass.className+" leakClass.objectCount: "+leakClass.objectCount);
          heapAnalysis.c.leakClasses.add(leakClass);
       }
       b = heapAnalysis.b;
       if (b == null) {
          a.S(str7);
       }
       obj2 = b.r().iterator();
       str1 = 0x40000;
       while (obj2.hasNext()) {
          HeapObject$d uod = obj2.next();
          i3 = (int)uod.e.b();
          if (i3 >= str1) {
             str1 = uod.h();
             l3 = uod.d() & 0xffffffff;
             h.b(str5, "uspect leak! primitive arrayName:"+str1+" size:"+i3+" typeName:"+uod.i().toString()+", objectId:"+l3+", toString:"+uod.toString());
             heapAnalysis.d.add(Long.valueOf(uod.d()));
             heapAnalysis.e.put(Long.valueOf(uod.d()), "Primitive Array Size Over Threshold, "+i3);
             LeakModel$LeakObject leakObject1 = new LeakModel$LeakObject();
             leakObject1.className = str1;
             leakObject1.size = String.valueOf(i3);
             long l8 = uod.d() & 0xffffffff;
             leakObject1.objectId = String.valueOf(l8);
             heapAnalysis.c.leakObjects.add(leakObject1);
          }
       }
       b = heapAnalysis.b;
       if (b == null) {
          a.S(str7);
       }
       obj2 = b.p().iterator();
       while (obj2.hasNext()) {
          HeapObject$c uoc = obj2.next();
          i3 = (int)uoc.e.b();
          if (i3 >= str1) {
             str2 = uoc.h();
             h.d(str5, "object arrayName:"+str2+str4+uoc.d());
             heapAnalysis.d.add(Long.valueOf(uoc.d()));
             LeakModel$LeakObject leakObject2 = new LeakModel$LeakObject();
             leakObject2.className = str2;
             leakObject2.size = String.valueOf(i3);
             long l9 = uoc.d() & 0xffffffff;
             leakObject2.objectId = String.valueOf(l9);
             heapAnalysis.c.leakObjects.add(leakObject2);
          }
       }
       long l10 = System.currentTimeMillis();
       LeakModel metaData = heapAnalysis.c.metaData;
       if (metaData != null) {
          metaData.filterInstanceTime = String.valueOf(((float)(l10 - l1) / (float)1000));
       }
       h.d(str5, "filterLeakingObjects time:"+(((float)(l10 - l1) * 0x3f800000) / (float)1000));
       return;
    }
    public final void b(){
       HeapAnalyzer$c a;
       String str13;
       LeakTrace$GcRootType gcRootType;
       LeakTraceObject leakTraceObj;
       String str14;
       String str15;
       String str16;
       LeakModel$LeakTraceChain leakTraceCha;
       long l3;
       Iterator iterator2;
       LeakTraceReference leakTraceRef;
       String referenceNam;
       LeakModel$LeakTraceChain$LeakPathItem leakTraceCha1;
       Iterator iterator3;
       LeakModel$LeakTraceChain$LeakPathItem leakTraceCha2;
       HeapAnalysisService heapAnalysis = this;
       long l = System.currentTimeMillis();
       HeapAnalyzer heapAnalyzer = new HeapAnalyzer(new HeapAnalysisService$c(heapAnalysis));
       HeapAnalysisService b = heapAnalysis.b;
       if (b == null) {
          a.S("mHeapGraph");
       }
       HeapAnalyzer$c uoc = heapAnalyzer.c(new HeapAnalyzer$a(b, AndroidReferenceMatchers.Companion.b(), false), heapAnalysis.d);
       a = uoc.a;
       uoc = uoc.b;
       h.d("OOM_ANALYSIS", "---------------------------Application Leak---------------------------------------");
       h.d("OOM_ANALYSIS", "ApplicationLeak size:"+a.size());
       Iterator iterator = a.iterator();
       String str = ", declaredClassName:";
       StringBuilder str1 = ", referenceType:";
       String str2 = ", referenceGenericName:";
       String str3 = ", referenceDisplayName:";
       String str4 = ", referenceName:";
       String str5 = "clazz:";
       String str6 = "ApplicationLeak";
       String str7 = ", leaking reason:";
       long l1 = l;
       String str8 = ", labels:";
       String str9 = "GC Root:";
       HeapAnalyzer$c uoc1 = uoc;
       String str10 = "null cannot be cast to non-null type kotlin.Array<T>";
       long l2 = 0xffffffff;
       String str11 = "[";
       String str12 = "java.util.Arrays.toString\(this\)";
       while (iterator.hasNext()) {
          ApplicationLeak uApplication = iterator.next();
          Iterator iterator1 = iterator;
          str13 = str;
          h.d("OOM_ANALYSIS", "shortDescription:"+uApplication.getShortDescription()+", signature:"+uApplication.getSignature()+" same leak size:"+uApplication.getLeakTraces().size());
          LeakTrace leakTrace = uApplication.getLeakTraces().get(0);
          gcRootType = leakTrace.component1();
          List list = leakTrace.component2();
          leakTraceObj = leakTrace.component3();
          str14 = str1;
          str1 = gcRootType.getDescription();
          str15 = str2;
          str16 = str3;
          String[] stringArray = new String[0];
          Object[] objArray = leakTraceObj.getLabels().toArray(stringArray);
          Objects.requireNonNull(objArray, str10);
          leakTraceObj.setLeakingStatusReason(String.valueOf(heapAnalysis.e.get(Long.valueOf(leakTraceObj.getObjectId()))));
          str8 = Arrays.toString(objArray);
          a.o(str8, str12);
          l = leakTraceObj.getObjectId() & l2;
          h.d("OOM_ANALYSIS", str9+str1+", leakObjClazz:"+leakTraceObj.getClassName()+", leakObjType:"+leakTraceObj.getTypeName()+str8+str8+str7+leakTraceObj.getLeakingStatusReason()+", leaking obj:"+l);
          leakTraceCha = new LeakModel$LeakTraceChain();
          leakTraceCha.shortDescription = uApplication.getShortDescription();
          leakTraceCha.signature = uApplication.getSignature();
          leakTraceCha.sameLeakSize = uApplication.getLeakTraces().size();
          leakTraceCha.gcRoot = str1;
          str9 = Arrays.toString(objArray);
          a.o(str9, str12);
          leakTraceCha.labels = str9;
          leakTraceCha.leakReason = leakTraceObj.getLeakingStatusReason();
          leakTraceCha.leakType = str6;
          l3 = leakTraceObj.getObjectId() & l2;
          leakTraceCha.leakObjectId = String.valueOf(l3);
          leakTraceCha.leakObjectHash = heapAnalysis.f.get(Long.valueOf(leakTraceObj.getObjectId()));
          leakTraceCha.tracePath = new ArrayList();
          heapAnalysis.c.leakTraceChains.add(leakTraceCha);
          iterator2 = list.iterator();
          while (iterator2.hasNext()) {
             leakTraceRef = iterator2.next();
             referenceNam = leakTraceRef.getReferenceName();
             str7 = leakTraceRef.getOriginObject().getClassName();
             str6 = leakTraceRef.getReferenceDisplayName();
             str12 = leakTraceRef.getReferenceGenericName();
             str = leakTraceRef.getReferenceType().toString();
             str10 = leakTraceRef.getOwningClassName();
             str1 = str5+str7+str4+referenceNam;
             referenceNam = str16;
             h.d("OOM_ANALYSIS", str1+referenceNam+str6+str15+str12+str14+str+str13+str10);
             leakTraceCha1 = new LeakModel$LeakTraceChain$LeakPathItem();
             iterator3 = iterator2;
             str3 = str11;
             if (!u.q2(str6, str3, false, 2, null)) {
                str7 = str7+'.'+str6;
             }
             leakTraceCha1.referenceName = str7;
             leakTraceCha1.referenceType = str;
             leakTraceCha1.declaredClassName = str10;
             leakTraceCha.tracePath.add(leakTraceCha1);
             str16 = referenceNam;
             str11 = str3;
             iterator2 = iterator3;
          }
          leakTraceCha2 = new LeakModel$LeakTraceChain$LeakPathItem();
          leakTraceCha2.referenceName = leakTraceObj.getClassName();
          leakTraceCha2.referenceType = leakTraceObj.getTypeName();
          leakTraceCha.tracePath.add(leakTraceCha2);
          l = l1;
          uoc = uoc1;
          iterator = iterator1;
          str7 = null;
       }
       String str17 = str;
       str14 = str1;
       str15 = str2;
       referenceNam = str3;
       str3 = str11;
       str = "=======================================================================";
       h.d("OOM_ANALYSIS", str);
       h.d("OOM_ANALYSIS", "----------------------------Library Leak--------------------------------------");
       h.d("OOM_ANALYSIS", "LibraryLeak size:"+uoc1.size());
       Iterator iterator4 = uoc1.iterator();
       if (iterator4.hasNext()) {
          LibraryLeak libraryLeak = iterator4.next();
          String str18 = str;
          h.d("OOM_ANALYSIS", "description:"+libraryLeak.getDescription()+", shortDescription:"+libraryLeak.getShortDescription()+", pattern:"+libraryLeak.getPattern().toString());
          int i = 0;
          LeakTrace leakTrace1 = libraryLeak.getLeakTraces().get(i);
          gcRootType = leakTrace1.component1();
          List list1 = leakTrace1.component2();
          LeakTraceObject leakTraceObj1 = leakTrace1.component3();
          String str19 = str3;
          str3 = gcRootType.getDescription();
          str13 = str17;
          str16 = referenceNam;
          String[] stringArray1 = new String[i];
          Object[] objArray1 = leakTraceObj1.getLabels().toArray(stringArray1);
          Objects.requireNonNull(objArray1, str10);
          leakTraceObj1.setLeakingStatusReason(String.valueOf(heapAnalysis.e.get(Long.valueOf(leakTraceObj1.getObjectId()))));
          str8 = Arrays.toString(objArray1);
          a.o(str8, str12);
          h.d("OOM_ANALYSIS", str9+str3+", leakClazz:"+leakTraceObj1.getClassName()+str8+str8+str7+leakTraceObj1.getLeakingStatusReason());
          leakTraceCha = new LeakModel$LeakTraceChain();
          leakTraceCha.shortDescription = libraryLeak.getShortDescription();
          leakTraceCha.detailDescription = libraryLeak.getDescription();
          leakTraceCha.signature = libraryLeak.getSignature();
          leakTraceCha.sameLeakSize = libraryLeak.getLeakTraces().size();
          leakTraceCha.gcRoot = str3;
          str9 = Arrays.toString(objArray1);
          a.o(str9, str12);
          leakTraceCha.labels = str9;
          leakTraceCha.leakReason = leakTraceObj1.getLeakingStatusReason();
          leakTraceCha.leakType = str6;
          leakTraceCha.leakObjectId = String.valueOf((leakTraceObj1.getObjectId() & l2));
          leakTraceCha.leakObjectHash = heapAnalysis.f.get(Long.valueOf(leakTraceObj1.getObjectId()));
          Long longx = heapAnalysis.h.get(Long.valueOf(leakTraceObj1.getObjectId()));
          l3 = (longx != null)? longx.longValue(): 0;
          leakTraceCha.leakTime = l3;
          leakTraceCha.tracePath = new ArrayList();
          heapAnalysis.c.leakTraceChains.add(leakTraceCha);
          iterator2 = list1.iterator();
          while (iterator2.hasNext()) {
             leakTraceRef = iterator2.next();
             str17 = leakTraceRef.getOriginObject().getClassName();
             referenceNam = leakTraceRef.getReferenceName();
             str7 = leakTraceRef.getReferenceDisplayName();
             str6 = leakTraceRef.getReferenceGenericName();
             str12 = leakTraceRef.getReferenceType().toString();
             str10 = leakTraceRef.getOwningClassName();
             str1 = str5+str17+str4+referenceNam;
             str2 = str15;
             str1 = str1+str16+str7+str2+str6;
             str6 = str14;
             str3 = str13;
             h.d("OOM_ANALYSIS", str1+str6+str12+str3+str10);
             leakTraceCha1 = new LeakModel$LeakTraceChain$LeakPathItem();
             iterator3 = iterator2;
             String str20 = str4;
             String str21 = str5;
             str4 = str19;
             if (u.q2(str7, str4, false, 2, null)) {
                str9 = str17;
                leakTraceObj = 46;
             }else {
                str9 = str17+'.'+str7;
             }
             leakTraceCha1.referenceName = str9;
             leakTraceCha1.referenceType = str12;
             leakTraceCha1.declaredClassName = str10;
             leakTraceCha.tracePath.add(leakTraceCha1);
             str19 = str4;
             str14 = str6;
             str15 = str2;
             str13 = str3;
             str4 = str20;
             str5 = str21;
             iterator2 = iterator3;
          }
          leakTraceCha2 = new LeakModel$LeakTraceChain$LeakPathItem();
          leakTraceCha2.referenceName = leakTraceObj1.getClassName();
          leakTraceCha2.referenceType = leakTraceObj1.getTypeName();
          leakTraceCha.tracePath.add(leakTraceCha2);
          str8 = str18;
       }else {
          str8 = str;
       }
       h.d("OOM_ANALYSIS", str8);
       LeakModel metaData = heapAnalysis.c.metaData;
       a.m(metaData);
       float f = (float)(System.currentTimeMillis() - l1) / (float)1000;
       metaData.findGCPathTime = String.valueOf(f);
       h.d("OOM_ANALYSIS", "findPathsToGcRoot cost time: "+f);
       return;
    }
    public final void c(String p0){
       k a;
       int i = 1;
       int i1 = 0;
       String str = (!p0.length())? 1: null;
       if (str) {
          return;
       }else {
          h.d("HeapAnalysisService", "start analyze");
          a0 b = a0.b;
          Objects.requireNonNull(b);
          a0.a = new HeapAnalysisService$d();
          File uFile = new File(p0);
          HprofRecordTag[] hprofRecordT = new HprofRecordTag[]{HprofRecordTag.ROOT_JNI_GLOBAL,HprofRecordTag.ROOT_JNI_LOCAL,HprofRecordTag.ROOT_NATIVE_STACK,HprofRecordTag.ROOT_STICKY_CLASS,HprofRecordTag.ROOT_THREAD_BLOCK,HprofRecordTag.ROOT_THREAD_OBJECT};
          Set set = d1.u(hprofRecordT);
          Objects.requireNonNull(HprofHeapGraph.j);
          a.p(uFile, "$this$openHeapGraph");
          a.p(set, "indexedGcRootTypes");
          c uoc = new c(uFile);
          a.p(uoc, "$this$openHeapGraph");
          a.p(set, "indexedGcRootTypes");
          d uod = uoc.b();
          j oj = j.f.a(uod);
          b.a(uod, null);
          Objects.requireNonNull(k.d);
          a.p(uoc, "hprofSourceProvider");
          a.p(oj, "hprofHeader");
          a.p(set, "indexedGcRootTags");
          Objects.requireNonNull(b0.c);
          a.p(uoc, "hprofSourceProvider");
          a.p(oj, "hprofHeader");
          b0 uob0 = new b0(uoc, oj, null);
          HprofInMemoryIndex$b p = HprofInMemoryIndex.p;
          Objects.requireNonNull(p);
          a.p(uob0, "reader");
          a.p(oj, "hprofHeader");
          a.p(set, "indexedGcRootTags");
          Ref$LongRef longRef = new Ref$LongRef();
          c uoc1 = uoc;
          longRef.element = 0;
          Ref$LongRef longRef1 = new Ref$LongRef();
          longRef1.element = 0;
          Ref$LongRef longRef2 = new Ref$LongRef();
          longRef2.element = 0;
          Ref$LongRef longRef3 = new Ref$LongRef();
          longRef3.element = 0;
          Ref$IntRef intRef = new Ref$IntRef();
          intRef.element = 0;
          String str1 = "HeapAnalysisService";
          Ref$IntRef intRef1 = new Ref$IntRef();
          intRef1.element = 0;
          long l = System.currentTimeMillis();
          Ref$IntRef intRef2 = new Ref$IntRef();
          intRef2.element = 0;
          Ref$IntRef intRef3 = new Ref$IntRef();
          intRef3.element = 0;
          String str2 = "hprofSourceProvider";
          Ref$IntRef intRef4 = new Ref$IntRef();
          intRef4.element = 0;
          HprofRecordTag cLASS_DUMP = HprofRecordTag.CLASS_DUMP;
          String str3 = "hprofHeader";
          HprofRecordTag iNSTANCE_DUM = HprofRecordTag.INSTANCE_DUMP;
          a0 uoa0 = b;
          HprofRecordTag oBJECT_ARRAY = HprofRecordTag.OBJECT_ARRAY_DUMP;
          Set set1 = set;
          HprofRecordTag pRIMITIVE_AR = HprofRecordTag.PRIMITIVE_ARRAY_DUMP;
          j oj1 = oj;
          EnumSet uEnumSet = EnumSet.of(cLASS_DUMP, iNSTANCE_DUM, oBJECT_ARRAY, pRIMITIVE_AR);
          HprofRecordTag hprofRecordT1 = pRIMITIVE_AR;
          a.o(uEnumSet, "EnumSet.of\(CLASS_DUMP, I¡­MP, PRIMITIVE_ARRAY_DUMP\)");
          h oh = new h(intRef, longRef, intRef4, intRef1, longRef1, intRef2, longRef2, intRef3, longRef3);
          long l1 = uob0.a(uEnumSet, pRIMITIVE_AR);
          boolean i2 = p.a(longRef.element);
          int i3 = p.a(longRef1.element);
          int i4 = p.a(longRef2.element);
          int i5 = p.a(longRef3.element);
          boolean b1 = (oj1.a() == 8)? true: false;
          HprofInMemoryIndex$a uoa = new HprofInMemoryIndex$a(b1, l1, intRef.element, intRef1.element, intRef2.element, intRef3.element, i2, i3, i4, i5, intRef4.element);
          HprofRecordTag[] hprofRecordT2 = new HprofRecordTag[]{HprofRecordTag.LOAD_CLASS,cLASS_DUMP,iNSTANCE_DUM,oBJECT_ARRAY,hprofRecordT1};
          EnumSet uEnumSet1 = EnumSet.of(HprofRecordTag.STRING_IN_UTF8, hprofRecordT2);
          a.o(uEnumSet1, "EnumSet.of\(\n        STRI¡­MITIVE_ARRAY_DUMP\n      \)");
          Objects.requireNonNull(HprofRecordTag.Companion);
          uob0.a(e1.C(uEnumSet1, CollectionsKt___CollectionsKt.R2(HprofRecordTag.rootTags, set1)), longRef2);
          a0$a uoa1 = uoa0.a();
          if (uoa1 != null) {
             uoa1.d("classCount:"+intRef.element+" instanceCount:"+intRef1.element+' '+"objectArrayCount:"+intRef2.element+" primitiveArrayCount:"+intRef3.element);
          }
          String str4 = str3;
          j oj2 = oj1;
          a.p(oj2, str4);
          HprofVersion hprofVersion = (longRef2.h == longRef2.g.length)? 1: null;
          if (hprofVersion) {
             SortedBytesMap sortedBytesM = longRef2.j.b();
             SortedBytesMap sortedBytesM1 = longRef2.k.b();
             SortedBytesMap sortedBytesM2 = longRef2.l.b();
             SortedBytesMap sortedBytesM3 = longRef2.i.b();
             HprofInMemoryIndex$a c = longRef2.c;
             HprofInMemoryIndex$a e = longRef2.e;
             HprofInMemoryIndex$a f = longRef2.f;
             HprofInMemoryIndex$a m = longRef2.m;
             HprofInMemoryIndex$a n = longRef2.n;
             HprofInMemoryIndex$a o = longRef2.o;
             HprofInMemoryIndex$a p1 = longRef2.p;
             HprofInMemoryIndex$a q = longRef2.q;
             i2 = (oj2.b() != HprofVersion.ANDROID)? true: false;
             c uoc2 = uEnumSet;
             c uoc3 = new c(longRef2.b, longRef2.g);
             HprofInMemoryIndex hprofInMemor = new HprofInMemoryIndex(c, e, f, sortedBytesM3, sortedBytesM, sortedBytesM1, sortedBytesM2, m, n, o, p1, q, i2, uoc2, longRef2.d, null);
             k ok = new k(uoc1, oj2, oBJECT_ARRAY, null);
             a = ok.a;
             k b2 = ok.b;
             Objects.requireNonNull(w.e);
             a.p(a, str2);
             a.p(b2, str4);
             this.b = new HprofHeapGraph(ok.b, new w(a.a(), b2, null), ok.c);
             h.d(str1, "build index cost time: "+(System.currentTimeMillis() - l));
             return;
          }else {
             throw new IllegalArgumentException("Read "+longRef2.h+" into fields bytes instead of expected "+longRef2.g.length.toString());
          }
       }
    }
    public final HeapAnalysisService$b d(Map p0,long p1,boolean p2){
       HeapAnalysisService$b uob = p0.get(Long.valueOf(p1));
       if (uob != null) {
       }else {
          uob = new HeapAnalysisService$b();
          p0.put(Long.valueOf(p1), uob);
       }
       uob.a = uob.a() + 1;
       if (p2) {
          uob.b = uob.b() + 1;
       }
       return uob;
    }
    public void onHandleIntent(Intent p0){
       int i;
       File uFile;
       List list;
       String str = "OOM_ANALYSIS_EXCEPTION";
       if (p0 != null) {
          ResultReceiver parcelableEx = p0.getParcelableExtra("RESULT_RECEIVER");
          if (parcelableEx != null) {
             a.o(parcelableEx, "intent.getParcelableExtr\x20\x02ESULT_RECEIVER\) ?: return\x00");
             String stringExtra = p0.getStringExtra("HPROF_FILE");
             if (stringExtra != null) {
                a.o(stringExtra, "intent.getStringExtra\(Param.HPROF_FILE\) ?: return");
                String stringExtra1 = p0.getStringExtra("JSON_FILE");
                if (stringExtra1 != null) {
                   a.o(stringExtra1, "intent.getStringExtra\(Param.JSON_FILE\) ?: return");
                   String stringExtra2 = p0.getStringExtra("ROOT_PATH");
                   if (stringExtra2 != null) {
                      a.o(stringExtra2, "intent.getStringExtra\(Param.ROOT_PATH\) ?: return");
                      OOMFileManager.c = stringExtra2;
                      OOMFileManager.b = MonitorBuildConfig.h()+'_';
                      try{
                         i = 0;
                         this.c(stringExtra);
                         HeapAnalysisService tc = this.c;
                         LeakModel$MetaData metaData = new LeakModel$MetaData();
                         metaData.jvmFree = p0.getStringExtra("JAVA_FREE_MEM");
                         metaData.jvmTotal = p0.getStringExtra("JAVA_TOT_MEM");
                         metaData.jvmMax = p0.getStringExtra("JAVA_MAX_MEM");
                         metaData.deviceMemTotal = p0.getStringExtra("DEVICE_MAX_MEM");
                         metaData.deviceMemAvailable = p0.getStringExtra("DEVICE_AVA_MEM");
                         metaData.sdkInt = p0.getStringExtra("SDK");
                         metaData.manufacture = p0.getStringExtra("MANUFACTURE");
                         metaData.fdCount = p0.getStringExtra("FD");
                         metaData.pss = p0.getStringExtra("PSS");
                         metaData.rss = p0.getStringExtra("RSS");
                         metaData.vss = p0.getStringExtra("VSS");
                         metaData.threadCount = p0.getStringExtra("THREAD");
                         metaData.buildModel = p0.getStringExtra("MODEL");
                         metaData.time = p0.getStringExtra("TIME");
                         metaData.usageSeconds = p0.getStringExtra("USAGE_TIME");
                         metaData.currentPage = p0.getStringExtra("CURRENT_PAGE");
                         metaData.dumpReason = p0.getStringExtra("REASON");
                         metaData.extDetail = p0.getStringExtra("OOM_INFO");
                         String stringExtra3 = p0.getStringExtra("EXTRA_FILE");
                         String str1 = "HeapAnalysisService";
                         if (stringExtra3 != null) {
                            try{
                               stringExtra3 = FilesKt__FileReadWriteKt.z(new File(stringExtra3), i, 1, i);
                               metaData.activityRecord = stringExtra3;
                               JsonElement jsonElement = new c().a(stringExtra3);
                               a.o(jsonElement, "JsonParser\(\).parse\(activityRecord\)");
                               JsonObject jsonObject = jsonElement.r();
                               Iterator iterator = jsonObject.w0().iterator();
                               while (iterator.hasNext()) {
                                  String str2 = iterator.next();
                                  a.o(str2, "key");
                                  g og = jsonObject.r0(str2);
                                  a.o(og, "jo.getAsJsonPrimitive\(key\)");
                                  this.g.put(str2, Long.valueOf(og.t()));
                               }
                            }catch(java.lang.Exception e15){
                               e15.printStackTrace();
                               h.g(str1, "failed to read activity record\n "+e15);
                            }
                         }
                      }catch(java.lang.Exception e15){
                         e15.printStackTrace();
                         h.c(str, "build index exception "+e15.getMessage(), 1);
                         parcelableEx.send(1002, i);
                      }
                   }
                }
             }
          }
       }
    }
}
