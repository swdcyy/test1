package com.kwai.sdk.eve.internal.task.loader.v2.LoadedTaskV2$packageInfo$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kwai.sdk.eve.internal.task.loader.v2.LoadedTaskV2;
import java.lang.Object;
import sm7.p;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.a;
import java.util.Collection;
import java.util.Map;
import java.util.Iterator;
import java.lang.Iterable;
import s50.e;
import com.kuaishou.eve.packageinfo.model.LuaPipeline;
import com.kuaishou.eve.packageinfo.model.InPackExecutableInfo;
import sm7.m;
import com.kuaishou.eve.packageinfo.ExecutableCode;
import com.kuaishou.eve.packageinfo.model.TypedExecutable;
import s50.d;
import java.util.List;
import com.kuaishou.eve.packageinfo.model.ModelExecutableInfo;
import java.util.ArrayList;
import trd.u;
import p50.c;
import kotlin.Pair;
import qrd.r0;
import kotlin.collections.CollectionsKt__CollectionsKt;
import trd.t0;
import com.kuaishou.eve.packageinfo.model.InPackFilter;
import kotlin.collections.CollectionsKt___CollectionsKt;
import s50.b;
import s50.c;
import tn7.b;

public final class LoadedTaskV2$packageInfo$2 extends Lambda implements a	// class@0015d2
{
    public final LoadedTaskV2 this$0;

    public void LoadedTaskV2$packageInfo$2(LoadedTaskV2 p0){
       this.this$0 = p0;
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final p invoke(){
       String str;
       ExecutableCode uExecutableC;
       LoadedTaskV2 c;
       List obj1;
       String str1;
       ExecutableCode uExecutableC1;
       LoadedTaskV2 c1;
       ExecutableCode obj2;
       ArrayList uArrayList;
       Iterator iterator2;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       LoadedTaskV2$packageInfo$2 obj = PatchProxy.apply(objArray, this, LoadedTaskV2$packageInfo$2.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.this$0;
       Objects.requireNonNull(obj);
       p op = PatchProxy.apply(objArray, obj, LoadedTaskV2.class, "13");
       if (op != patchProxyRe) {
       }else {
          LinkedHashMap linkedHashMa = new LinkedHashMap();
          LoadedTaskV2 e = obj.e;
          if (e == null) {
             a.S("pipelines");
          }
          Iterator iterator = e.values().iterator();
          int i = 10;
          while (iterator.hasNext()) {
             e uoe = iterator.next();
             LuaPipeline luaPipeline = uoe.b();
             if (luaPipeline != null) {
                str = luaPipeline.h();
                uExecutableC = luaPipeline.b();
                c = obj.c;
                if (c == null) {
                   a.S("mappings");
                }
                obj1 = c.get(luaPipeline.h());
                a.m(obj1);
                linkedHashMa.put(str, new m(uExecutableC, obj1.a()));
             }
             obj1 = uoe.c();
             if (obj1 != null) {
                Iterator iterator1 = obj1.iterator();
                while (iterator1.hasNext()) {
                   TypedExecutable typedExecuta = iterator1.next();
                   if (typedExecuta instanceof InPackExecutableInfo) {
                      str1 = typedExecuta.h();
                      uExecutableC1 = typedExecuta.b();
                      c1 = obj.c;
                      if (c1 == null) {
                         a.S("mappings");
                      }
                      obj2 = c1.get(typedExecuta.h());
                      a.m(obj2);
                      linkedHashMa.put(str1, new m(uExecutableC1, obj2.a()));
                   }else if(typedExecuta instanceof ModelExecutableInfo){
                      str1 = typedExecuta.e();
                      uExecutableC1 = typedExecuta.b();
                      c1 = obj.c;
                      if (c1 == null) {
                         a.S("mappings");
                      }
                      obj2 = c1.get(typedExecuta.e());
                      a.m(obj2);
                      linkedHashMa.put(str1, new m(uExecutableC1, obj2.a()));
                   }
                }
             }
             List list = uoe.a();
             if (list != null) {
                uArrayList = new ArrayList(u.Y(list, i));
                iterator2 = list.iterator();
                while (iterator2.hasNext()) {
                   c uoc = iterator2.next();
                   str = uoc.b();
                   a.m(str);
                   uExecutableC = uoc.a();
                   a.m(uExecutableC);
                   c = obj.c;
                   if (c == null) {
                      a.S("mappings");
                   }
                   Object obj3 = c.get(uoc.b());
                   a.m(obj3);
                   uArrayList.add(r0.a(str, new m(uExecutableC, obj3.a())));
                }
             }else {
                uArrayList = CollectionsKt__CollectionsKt.E();
             }
             t0.w0(linkedHashMa, uArrayList);
          }
          ArrayList uArrayList1 = new ArrayList();
          iterator = obj.K3().iterator();
          while (iterator.hasNext()) {
             Object obj4 = iterator.next();
             if (obj4 instanceof InPackFilter) {
                uArrayList1.add(obj4);
             }
          }
          InPackFilter inPackFilter = CollectionsKt___CollectionsKt.p2(uArrayList1);
          if (inPackFilter != null) {
             String str2 = inPackFilter.h();
             obj2 = inPackFilter.b();
             LoadedTaskV2 c2 = obj.c;
             if (c2 == null) {
                a.S("mappings");
             }
             Object obj5 = c2.get(inPackFilter.h());
             a.m(obj5);
             linkedHashMa.put(str2, new m(obj2, obj5.a()));
          }
          iterator = obj.f.iterator();
          while (iterator.hasNext()) {
             b extra = iterator.next().extra;
             if (extra != null) {
                uArrayList = new ArrayList(u.Y(extra, i));
                iterator2 = extra.iterator();
                while (iterator2.hasNext()) {
                   c uoc1 = iterator2.next();
                   str1 = uoc1.b();
                   a.m(str1);
                   uExecutableC1 = uoc1.a();
                   a.m(uExecutableC1);
                   c1 = obj.c;
                   if (c1 == null) {
                      a.S("mappings");
                   }
                   Object obj6 = c1.get(uoc1.b());
                   a.m(obj6);
                   uArrayList.add(r0.a(str1, new m(uExecutableC1, obj6.a())));
                }
             }else {
                obj1 = CollectionsKt__CollectionsKt.E();
             }
             t0.w0(linkedHashMa, uArrayList);
          }
          op = new p(obj.b.name, obj.R3().md5, obj.R3().version, linkedHashMa);
       }
       return op;
    }
}
