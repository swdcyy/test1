package com.kwai.sdk.eve.internal.task.loader.v2.LoadedTaskV2;
import ao7.a;
import tn7.b;
import com.google.gson.JsonObject;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.LinkedHashMap;
import java.util.ArrayList;
import com.kwai.sdk.eve.internal.task.loader.v2.LoadedTaskV2$packageInfo$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.StringBuilder;
import com.kwai.sdk.eve.internal.common.utils.EveLog;
import com.kwai.sdk.eve.internal.common.utils.StopWatch;
import nsd.u;
import com.google.gson.Gson;
import com.kwai.sdk.eve.internal.common.utils.DataKt;
import s50.c;
import com.google.gson.JsonElement;
import java.lang.Class;
import com.kwai.sdk.eve.internal.common.utils.TimeRange;
import java.util.List;
import java.io.File;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.Collection;
import java.util.Map;
import java.lang.Iterable;
import trd.u;
import java.util.Iterator;
import s50.e;
import p50.c;
import com.kuaishou.eve.packageinfo.ExecutableCode;
import qrd.l1;
import java.lang.Number;
import com.kuaishou.eve.packageinfo.model.LuaPipeline;
import trd.t;
import sm7.p;
import java.lang.Boolean;
import s50.d;
import java.nio.charset.Charset;
import kotlin.io.FilesKt__FileReadWriteKt;
import com.kwai.sdk.eve.internal.task.loader.v2.LoadedTaskV2$a;
import java.lang.reflect.Type;
import el.a;
import java.util.Objects;
import kotlin.Pair;
import qrd.r0;
import trd.t0;
import s50.b;
import java.util.LinkedHashSet;
import java.util.Set;

public class LoadedTaskV2 implements a	// class@0015d3
{
    public final Object a;
    public c b;
    public Map c;
    public Map d;
    public Map e;
    public List f;
    public List g;
    public final p h;
    public final List i;
    public final b j;

    public void LoadedTaskV2(b p0,JsonObject p1){
       a.p(p0, "pack");
       a.p(p1, "manifestJson");
       super();
       this.j = p0;
       this.a = new Object();
       this.d = new LinkedHashMap();
       this.f = new ArrayList();
       this.g = new ArrayList();
       this.h = s.c(new LoadedTaskV2$packageInfo$2(this));
       EveLog.i$default("LoadedTask#constructor begin "+this.R3().taskId+' '+this.R3().version, false, 2, null);
       StopWatch stopWatch = new StopWatch(null, 1, null);
       stopWatch.e();
       c uoc = DataKt.a().c(p1, c.class);
       a.o(uoc, "manifest");
       this.b(uoc);
       EveLog.i$default("LoadedTask#constructor manifest loaded", false, 2, null);
       this.b = uoc;
       stopWatch.d("task.loadPackage");
       EveLog.i$default("task "+this.R3().taskId+" loadPackage finish , cost "+StopWatch.g(stopWatch, null, 1, null).c(), false, 2, null);
       this.i = this.g;
    }
    public List K3(){
       return this.i;
    }
    public File L3(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LoadedTaskV2.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "key");
       return this.a(p0);
    }
    public File M3(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LoadedTaskV2.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "key");
       return this.a(p0);
    }
    public File N3(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LoadedTaskV2.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "key");
       return this.a(p0);
    }
    public List O3(){
       ArrayList uArrayList1;
       ArrayList obj = PatchProxy.apply(null, this, LoadedTaskV2.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       LoadedTaskV2 te = this.e;
       if (te == null) {
          a.S("pipelines");
       }
       Collection uCollection = te.values();
       ArrayList uArrayList = new ArrayList(u.Y(uCollection, 10));
       Iterator iterator = uCollection.iterator();
       while (iterator.hasNext()) {
          List list = iterator.next().a();
          if (list != null) {
             uArrayList1 = new ArrayList(u.Y(list, 10));
             Iterator iterator1 = list.iterator();
             while (iterator1.hasNext()) {
                c uoc = iterator1.next();
                if (uoc.a() == ExecutableCode.MODEL && uoc.b() != null) {
                   String str = uoc.b();
                   a.m(str);
                   obj.add(str);
                }
                uArrayList1.add(l1.a);
             }
          }else {
             uArrayList1 = null;
          }
          uArrayList.add(uArrayList1);
       }
       return obj;
    }
    public float P3(){
       Object obj = PatchProxy.apply(null, this, LoadedTaskV2.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       return this.b.dataSampleRatio;
    }
    public List Q3(String p0){
       List list;
       LoadedTaskV2 obj = PatchProxy.applyOneRefs(p0, this, LoadedTaskV2.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "key");
       obj = this.e;
       if (obj == null) {
          a.S("pipelines");
       }
       p0 = obj.get(p0);
       a.m(p0);
       if (p0.b() != null) {
          LuaPipeline luaPipeline = p0.b();
          a.m(luaPipeline);
          list = t.k(luaPipeline);
       }else {
          list = p0.c();
          a.m(list);
       }
       return list;
    }
    public b R3(){
       return this.j;
    }
    public p S3(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       LoadedTaskV2 loadedTaskV2 = LoadedTaskV2.class;
       Object obj = PatchProxy.apply(null, this, loadedTaskV2, "11");
       if (obj != patchProxyRe) {
          return obj;
       }
       Object obj1 = PatchProxy.apply(null, this, loadedTaskV2, "1");
       if (obj1 != patchProxyRe) {
       }else {
          obj1 = this.h.getValue();
       }
       return obj1;
    }
    public boolean T3(){
       LoadedTaskV2 obj = PatchProxy.apply(null, this, LoadedTaskV2.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.e;
       if (obj == null) {
          a.S("pipelines");
       }
       Collection uCollection = obj.values();
       ArrayList uArrayList = new ArrayList(u.Y(uCollection, 10));
       Iterator iterator = uCollection.iterator();
       while (true) {
          if (!iterator.hasNext()) {
             return true;
          }
          if (iterator.next().b() == null) {
             break ;
          }else {
             uArrayList.add(l1.a);
          }
       }
       return false;
    }
    public final File a(String p0){
       LoadedTaskV2 obj = PatchProxy.applyOneRefs(p0, this, LoadedTaskV2.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a;
       _monitor_enter(obj);
       if (!this.d.containsKey(p0)) {
          LoadedTaskV2 td = this.d;
          File uFile = this.R3().a();
          LoadedTaskV2 tc = this.c;
          if (tc == null) {
             a.S("mappings");
          }
          Object obj1 = tc.get(p0);
          a.m(obj1);
          td.put(p0, new File(uFile, obj1.a()));
       }
       p0 = this.d.get(p0);
       a.m(p0);
       _monitor_exit(obj);
       return p0;
    }
    public final void b(c p0){
       Gson gson;
       LoadedTaskV2 obj2;
       Iterator obj3;
       e uoe = e.class;
       String str = "2";
       if (PatchProxy.applyVoidOneRefs(p0, this, LoadedTaskV2.class, str)) {
          return;
       }
       c obj = DataKt.a().i(FilesKt__FileReadWriteKt.z(new File(this.R3().a(), "mapping.json"), null, 1, null), new LoadedTaskV2$a().getType());
       a.o(obj, "gson.fromJson\(\n      Fil¡­Mapping>>\(\) {}.type\n    \)");
       this.c = obj;
       obj = p0.pipeline;
       ArrayList uArrayList = new ArrayList(u.Y(obj, 10));
       Iterator iterator = obj.iterator();
       String str1 = "mappings";
       while (iterator.hasNext()) {
          String str2 = iterator.next();
          gson = DataKt.a();
          File uFile = this.R3().a();
          LoadedTaskV2 tc = this.c;
          if (tc == null) {
             a.S(str1);
          }
          Object obj1 = tc.get(str2);
          a.m(obj1);
          obj1 = gson.h(FilesKt__FileReadWriteKt.z(new File(uFile, obj1.a()), null, 1, null), uoe);
          obj2 = obj1;
          Objects.requireNonNull(obj2);
          if (!PatchProxy.applyVoidOneRefs(str2, obj2, uoe, str)) {
             a.p(str2, "<set-?>");
             obj2.a = str2;
          }
          uArrayList.add(r0.a(str2, obj1));
       }
       this.e = t0.B0(uArrayList);
       Iterator iterator1 = p0.events.iterator();
       while (iterator1.hasNext()) {
          String str3 = iterator1.next();
          LoadedTaskV2 tf = this.f;
          Gson gson1 = DataKt.a();
          File uFile1 = this.R3().a();
          obj2 = this.c;
          if (obj2 == null) {
             a.S(str1);
          }
          obj3 = obj2.get(str3);
          a.m(obj3);
          obj3 = gson1.h(FilesKt__FileReadWriteKt.z(new File(uFile1, obj3.a()), null, 1, null), b.class);
          a.o(obj3, "gson.fromJson\(\n         ¡­nts::class.java\n        \)");
          tf.add(obj3);
       }
       LinkedHashSet linkedHashSe = new LinkedHashSet();
       obj3 = this.f.iterator();
       while (obj3.hasNext()) {
          linkedHashSe.addAll(obj3.next().events);
       }
       this.g.addAll(linkedHashSe);
       return;
    }
    public String m(){
       Object obj = PatchProxy.apply(null, this, LoadedTaskV2.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b.label;
    }
}
