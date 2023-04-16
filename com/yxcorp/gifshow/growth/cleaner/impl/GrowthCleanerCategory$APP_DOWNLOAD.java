package com.yxcorp.gifshow.growth.cleaner.impl.GrowthCleanerCategory$APP_DOWNLOAD;
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
import fna.r;
import java.util.Comparator;
import kotlin.collections.CollectionsKt___CollectionsKt;
import cra.c0;
import fna.b;
import fna.j;
import java.lang.Number;
import fna.j$g;
import fna.j$c;
import fna.j$a;

public final class GrowthCleanerCategory$APP_DOWNLOAD extends GrowthCleanerCategory	// class@001311
{
    public final String title;

    public void GrowthCleanerCategory$APP_DOWNLOAD(String p0,int p1){
       super(p0, p1, null);
       this.title = GrowthCleanerHelper.c(0x7f10058f);
    }
    public List filterAppList(j$e p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       List obj = PatchProxy.applyOneRefs(p0, this, GrowthCleanerCategory$APP_DOWNLOAD.class, "2");
       if (obj != patchProxyRe) {
          return obj;
       }
       a.p(p0, "event");
       List list = p0.b();
       obj = PatchProxy.applyOneRefs(list, null, v.class, "13");
       if (obj != patchProxyRe) {
       }else {
          a.p(list, "$this$filterDownloads");
          ArrayList uArrayList = new ArrayList();
          Iterator iterator = list.iterator();
          while (iterator.hasNext()) {
             Object obj1 = iterator.next();
             Object obj2 = obj1;
             int i = 1;
             if (obj2.a == null) {
                int i1 = obj2.n.isEmpty() ^ i;
                if (i1 && v.e(obj2.n) > 0) {
                label_005f :
                   if (i) {
                      uArrayList.add(obj1);
                   }
                }
             }
             i = 0;
             goto label_005f ;
          }
          obj = CollectionsKt___CollectionsKt.f5(uArrayList, new r());
       }
       return obj;
    }
    public c0 filterFileSize(a p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, GrowthCleanerCategory$APP_DOWNLOAD.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "appInfo");
       return v.a();
    }
    public List filterFileSizeList(a p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, GrowthCleanerCategory$APP_DOWNLOAD.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "appInfo");
       return p0.n;
    }
    public long getSize(b p0){
       b e = (p0 != null)? p0.e: -1;
       return e;
    }
    public long getSize(j p0){
       b obj = PatchProxy.applyOneRefs(p0, this, GrowthCleanerCategory$APP_DOWNLOAD.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       if (p0 instanceof j$g) {
          obj = p0.b().e;
       }else if(p0 instanceof j$e){
          obj = p0.c().e;
       }else if(p0 instanceof j$c){
          obj = p0.b().e;
       }else if(p0 instanceof j$a){
          obj = p0.b().e;
       }else {
          long l = -1;
       }
       return obj;
    }
    public String getTitle(){
       return this.title;
    }
}
