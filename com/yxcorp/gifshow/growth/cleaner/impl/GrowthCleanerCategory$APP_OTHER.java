package com.yxcorp.gifshow.growth.cleaner.impl.GrowthCleanerCategory$APP_OTHER;
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
import java.util.Collection;
import fna.t;
import java.util.Comparator;
import kotlin.collections.CollectionsKt___CollectionsKt;
import cra.c0;
import fna.b;
import fna.j;
import java.lang.Number;
import fna.j$g;
import fna.j$c;
import fna.j$a;

public final class GrowthCleanerCategory$APP_OTHER extends GrowthCleanerCategory	// class@001313
{
    public final String title;

    public void GrowthCleanerCategory$APP_OTHER(String p0,int p1){
       super(p0, p1, null);
       this.title = GrowthCleanerHelper.c(0x7f100591);
    }
    public List filterAppList(j$e p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       List obj = PatchProxy.applyOneRefs(p0, this, GrowthCleanerCategory$APP_OTHER.class, "2");
       if (obj != patchProxyRe) {
          return obj;
       }
       a.p(p0, "event");
       List list = p0.b();
       obj = PatchProxy.applyOneRefs(list, null, v.class, "14");
       if (obj != patchProxyRe) {
       }else {
          a.p(list, "$this$filterOthers");
          ArrayList uArrayList = new ArrayList();
          Iterator iterator = list.iterator();
          while (iterator.hasNext()) {
             Object obj1 = iterator.next();
             Object obj2 = obj1;
             int i = 1;
             if (obj2.a == null) {
                int i1 = obj2.o.isEmpty() ^ i;
                if (i1 && v.e(obj2.o) > 0) {
                label_005f :
                   if (i) {
                      uArrayList.add(obj1);
                   }
                }
             }
             i = 0;
             goto label_005f ;
          }
          obj = CollectionsKt___CollectionsKt.f5(uArrayList, new t());
       }
       return obj;
    }
    public c0 filterFileSize(a p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, GrowthCleanerCategory$APP_OTHER.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "appInfo");
       return v.a();
    }
    public List filterFileSizeList(a p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, GrowthCleanerCategory$APP_OTHER.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "appInfo");
       return p0.o;
    }
    public long getSize(b p0){
       b f = (p0 != null)? p0.f: -1;
       return f;
    }
    public long getSize(j p0){
       b obj = PatchProxy.applyOneRefs(p0, this, GrowthCleanerCategory$APP_OTHER.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       if (p0 instanceof j$g) {
          obj = p0.b().f;
       }else if(p0 instanceof j$e){
          obj = p0.c().f;
       }else if(p0 instanceof j$c){
          obj = p0.b().f;
       }else if(p0 instanceof j$a){
          obj = p0.b().f;
       }else {
          long l = -1;
       }
       return obj;
    }
    public String getTitle(){
       return this.title;
    }
}
