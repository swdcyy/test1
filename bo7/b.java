package bo7.b;
import ao7.a;
import tn7.b;
import com.google.gson.JsonObject;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.StringBuilder;
import com.kwai.sdk.eve.internal.common.utils.EveLog;
import com.kwai.sdk.eve.internal.common.utils.StopWatch;
import msd.a;
import nsd.u;
import java.io.File;
import com.google.gson.Gson;
import com.kwai.sdk.eve.internal.common.utils.DataKt;
import r50.a;
import com.google.gson.JsonElement;
import java.lang.Class;
import com.kwai.sdk.eve.internal.common.utils.TimeRange;
import java.util.List;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.Map;
import kotlin.Pair;
import java.util.ArrayList;
import java.util.Collection;
import java.lang.Iterable;
import trd.u;
import java.util.Iterator;
import com.kuaishou.eve.packageinfo.model.ModelExecutableInfo;
import java.lang.Boolean;
import sm7.p;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.Map$Entry;
import sm7.m;
import com.kuaishou.eve.packageinfo.ExecutableCode;
import com.kuaishou.eve.packageinfo.model.InPackExecutableInfo;
import qrd.r0;
import trd.t0;
import com.kuaishou.eve.packageinfo.model.TypedExecutable;
import bo7.a;
import java.lang.Enum;
import q50.c;
import com.kuaishou.eve.packageinfo.model.ExecutableInfo;
import p50.c;

public final class b implements a	// class@000433
{
    public a a;
    public p b;
    public Map c;
    public Map d;
    public Map e;
    public final b f;

    public void b(b p0,JsonObject p1){
       a.p(p0, "pack");
       a.p(p1, "manifestJson");
       super();
       this.f = p0;
       EveLog.i$default("LoadedTask#constructor begin "+this.R3().taskId+' '+this.R3().version, false, 2, null);
       StopWatch stopWatch = new StopWatch(null, 1, null);
       stopWatch.e();
       File uFile = this.R3().a();
       a.m(uFile);
       a uoa = DataKt.a().c(p1, a.class);
       a.o(uoa, "manifest");
       this.b(uoa, uFile);
       EveLog.i$default("LoadedTask#constructor manifest loaded", false, 2, null);
       this.a = uoa;
       stopWatch.d("task.loadPackage");
       EveLog.i$default("task "+this.R3().taskId+" loadPackage finish , cost "+StopWatch.g(stopWatch, null, 1, null).c(), false, 2, null);
    }
    public List K3(){
       Object obj = PatchProxy.apply(null, this, b.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.a();
    }
    public File L3(String p0){
       b obj = PatchProxy.applyOneRefs(p0, this, b.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "key");
       obj = this.c;
       if (obj == null) {
          a.S("models");
       }
       p0 = obj.get(p0);
       a.m(p0);
       return p0.getSecond();
    }
    public File M3(String p0){
       b obj = PatchProxy.applyOneRefs(p0, this, b.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "key");
       obj = this.e;
       if (obj == null) {
          a.S("luas");
       }
       p0 = obj.get(p0);
       a.m(p0);
       return p0.getSecond();
    }
    public File N3(String p0){
       b obj = PatchProxy.applyOneRefs(p0, this, b.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "key");
       obj = this.d;
       if (obj == null) {
          a.S("sos");
       }
       p0 = obj.get(p0);
       a.m(p0);
       return p0.getSecond();
    }
    public List O3(){
       ArrayList obj = PatchProxy.apply(null, this, b.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       b tc = this.c;
       if (tc == null) {
          a.S("models");
       }
       Collection uCollection = tc.values();
       ArrayList uArrayList = new ArrayList(u.Y(uCollection, 10));
       Iterator iterator = uCollection.iterator();
       while (iterator.hasNext()) {
          uArrayList.add(Boolean.valueOf(obj.add(iterator.next().getFirst().e())));
       }
       return obj;
    }
    public float P3(){
       return 0x3f800000;
    }
    public List Q3(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "key");
       return this.a.b();
    }
    public b R3(){
       return this.f;
    }
    public p S3(){
       Map$Entry uEntry;
       Object key;
       b uob = b.class;
       Object[] objArray = null;
       ArrayList obj = PatchProxy.apply(objArray, this, uob, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!PatchProxy.applyVoid(objArray, this, uob, "16") && this.b == null) {
          LinkedHashMap linkedHashMa = new LinkedHashMap();
          b te = this.e;
          if (te == null) {
             a.S("luas");
          }
          Set set = te.entrySet();
          int i = 10;
          obj = new ArrayList(u.Y(set, i));
          Iterator iterator = set.iterator();
          while (iterator.hasNext()) {
             uEntry = iterator.next();
             key = uEntry.getKey();
             obj.add(r0.a(key, new m(ExecutableCode.LUA, uEntry.getValue().getFirst().i())));
          }
          t0.w0(linkedHashMa, obj);
          te = this.d;
          if (te == null) {
             a.S("sos");
          }
          set = te.entrySet();
          obj = new ArrayList(u.Y(set, i));
          iterator = set.iterator();
          while (iterator.hasNext()) {
             uEntry = iterator.next();
             key = uEntry.getKey();
             obj.add(r0.a(key, new m(ExecutableCode.SO, uEntry.getValue().getFirst().i())));
          }
          t0.w0(linkedHashMa, obj);
          te = this.c;
          if (te == null) {
             a.S("models");
          }
          set = te.entrySet();
          obj = new ArrayList(u.Y(set, i));
          iterator = set.iterator();
          while (iterator.hasNext()) {
             Map$Entry uEntry1 = iterator.next();
             Object key1 = uEntry1.getKey();
             obj.add(r0.a(key1, new m(ExecutableCode.MODEL, uEntry1.getValue().getFirst().f())));
          }
          t0.w0(linkedHashMa, obj);
          this.b = new p(this.a.name, this.R3().md5, this.R3().version, linkedHashMa);
       }
       uob = this.b;
       a.m(uob);
       return uob;
    }
    public boolean T3(){
       return false;
    }
    public final void a(TypedExecutable p0,File p1,Map p2,Map p3,Map p4){
       InPackExecutableInfo inPackExecut;
       String str1;
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4};
          if (PatchProxy.applyVoid(objArray, this, uob, "20")) {
             return;
          }
       }
       int i = a.b[p0.b().ordinal()];
       if (i != 1) {
          if (i != 2) {
             if (i == 3) {
                inPackExecut = p0;
                String str = inPackExecut.h();
                p4.put(str, r0.a(p0, new File(p1, inPackExecut.i())));
             }
          }else {
             inPackExecut = p0;
             str1 = inPackExecut.h();
             p3.put(str1, r0.a(p0, new File(p1, inPackExecut.i())));
          }
       }else {
          ModelExecutableInfo modelExecuta = p0;
          str1 = modelExecuta.e();
          p2.put(str1, r0.a(p0, new File(p1, modelExecuta.f())));
       }
       return;
    }
    public final void b(a p0,File p1){
       c uoc;
       String str;
       String str1;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, b.class, "17")) {
          return;
       }
       LinkedHashMap linkedHashMa = new LinkedHashMap();
       LinkedHashMap linkedHashMa1 = new LinkedHashMap();
       LinkedHashMap linkedHashMa2 = new LinkedHashMap();
       Iterator iterator = p0.b().iterator();
       while (iterator.hasNext()) {
          this.a(iterator.next(), p1, linkedHashMa, linkedHashMa1, linkedHashMa2);
       }
       iterator = p0.a().iterator();
       while (iterator.hasNext()) {
          uoc = iterator.next();
          if (uoc instanceof ExecutableInfo) {
             this.a(uoc, p1, linkedHashMa, linkedHashMa1, linkedHashMa2);
          }
       }
       p0 = p0.extra;
       if (p0 != null) {
          Iterator iterator1 = p0.iterator();
          while (iterator1.hasNext()) {
             uoc = iterator1.next();
             ExecutableCode uExecutableC = uoc.a();
             if (uExecutableC == null) {
                continue ;
             }else {
                int i = a.a[uExecutableC.ordinal()];
                if (i != 1) {
                   if (i != 2) {
                      if (i != 3) {
                         continue ;
                      }
                   }else {
                      str = uoc.b();
                      a.m(str);
                      str1 = uoc.c();
                      a.m(str1);
                      linkedHashMa1.put(str, r0.a(this.c(uoc), new File(p1, str1)));
                   }
                }else {
                   str = uoc.b();
                   a.m(str);
                   ModelExecutableInfo modelExecuta = PatchProxy.applyOneRefs(uoc, this, b.class, "18");
                   if (modelExecuta != PatchProxyResult.class) {
                   }else {
                      String str2 = uoc.b();
                      a.m(str2);
                      modelExecuta = new ModelExecutableInfo(str2, "tflite");
                      str2 = uoc.c();
                      a.m(str2);
                      if (!PatchProxy.applyVoidOneRefs(str2, modelExecuta, ModelExecutableInfo.class, "1")) {
                         a.p(str2, "<set-?>");
                         modelExecuta.path = str2;
                      }
                      ExecutableCode uExecutableC1 = uoc.a();
                      a.m(uExecutableC1);
                      modelExecuta.d(uExecutableC1);
                   }
                   str1 = uoc.c();
                   a.m(str1);
                   linkedHashMa.put(str, r0.a(modelExecuta, new File(p1, str1)));
                }
             }
             str = uoc.b();
             a.m(str);
             str1 = uoc.c();
             a.m(str1);
             linkedHashMa2.put(str, r0.a(this.c(uoc), new File(p1, str1)));
          }
       }
       this.c = linkedHashMa;
       this.d = linkedHashMa1;
       this.e = linkedHashMa2;
       return;
    }
    public final InPackExecutableInfo c(c p0){
       InPackExecutableInfo obj = PatchProxy.applyOneRefs(p0, this, b.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new InPackExecutableInfo();
       String str = p0.b();
       a.m(str);
       obj.k(str);
       str = p0.c();
       a.m(str);
       obj.l(str);
       ExecutableCode uExecutableC = p0.a();
       a.m(uExecutableC);
       obj.d(uExecutableC);
       return obj;
    }
    public String m(){
       Object obj = PatchProxy.apply(null, this, b.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.label;
    }
}
