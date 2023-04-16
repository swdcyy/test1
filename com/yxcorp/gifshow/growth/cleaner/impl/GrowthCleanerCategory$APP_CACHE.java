package com.yxcorp.gifshow.growth.cleaner.impl.GrowthCleanerCategory$APP_CACHE;
import com.yxcorp.gifshow.growth.cleaner.impl.GrowthCleanerCategory;
import java.lang.String;
import nsd.u;
import com.yxcorp.gifshow.growth.cleaner.impl.GrowthCleanerHelper;
import fna.j$e;
import java.util.List;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import fna.v;
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.Iterable;
import fna.a;
import cra.c0;
import java.lang.Number;
import fna.q;
import java.util.Comparator;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import fna.b;
import fna.j;
import fna.j$g;
import fna.j$c;
import fna.j$a;

public final class GrowthCleanerCategory$APP_CACHE extends GrowthCleanerCategory	// class@001310
{
    public final String title;

    public void GrowthCleanerCategory$APP_CACHE(String p0,int p1){
       super(p0, p1, null);
       this.title = GrowthCleanerHelper.c(0x7f10058e);
    }
    public List filterAppList(j$e p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       List obj = PatchProxy.applyOneRefs(p0, this, GrowthCleanerCategory$APP_CACHE.class, "2");
       if (obj != patchProxyRe) {
          return obj;
       }
       a.p(p0, "event");
       List list = p0.b();
       obj = PatchProxy.applyOneRefs(list, null, v.class, "9");
       if (obj != patchProxyRe) {
       }else {
          a.p(list, "$this$filterCaches");
          ArrayList uArrayList = new ArrayList();
          Iterator iterator = list.iterator();
          while (iterator.hasNext()) {
             Object obj1 = iterator.next();
             Object obj2 = obj1;
             obj2 = (obj2.a == null && (obj2.l.e() != null && obj2.l.f().longValue() > 0))? 1: null;
             if (obj2) {
                uArrayList.add(obj1);
             }
          }
          obj = CollectionsKt___CollectionsKt.f5(uArrayList, new q());
       }
       return obj;
    }
    public c0 filterFileSize(a p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, GrowthCleanerCategory$APP_CACHE.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "appInfo");
       return p0.l;
    }
    public List filterFileSizeList(a p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, GrowthCleanerCategory$APP_CACHE.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "appInfo");
       return CollectionsKt__CollectionsKt.E();
    }
    public long getSize(b p0){
       b c = (p0 != null)? p0.c: -1;
       return c;
    }
    public long getSize(j p0){
       b obj = PatchProxy.applyOneRefs(p0, this, GrowthCleanerCategory$APP_CACHE.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       if (p0 instanceof j$g) {
          obj = p0.b().c;
       }else if(p0 instanceof j$e){
          obj = p0.c().c;
       }else if(p0 instanceof j$c){
          obj = p0.b().c;
       }else if(p0 instanceof j$a){
          obj = p0.b().c;
       }else {
          long l = -1;
       }
       return obj;
    }
    public String getTitle(){
       return this.title;
    }
}
