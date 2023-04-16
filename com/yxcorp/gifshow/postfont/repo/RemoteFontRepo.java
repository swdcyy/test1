package com.yxcorp.gifshow.postfont.repo.RemoteFontRepo;
import com.yxcorp.gifshow.postfont.repo.RemoteFontRepo$a;
import nsd.u;
import java.lang.Object;
import com.yxcorp.gifshow.postfont.repo.RemoteFontRepo$resourceManager$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kwai.middleware.resourcemanager.cache.type.CachePolicy;
import java.lang.Integer;
import brd.t;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;
import jb7.b;
import com.kwai.middleware.resourcemanager.cache.BaseResourceCacheRepo;
import t45.d;
import brd.z;
import com.yxcorp.gifshow.postfont.repo.RemoteFontRepo$c;
import erd.o;
import com.yxcorp.gifshow.postfont.repo.RemoteFontRepo$b;
import com.yxcorp.gifshow.postfont.repo.RemoteFontRepo$d;
import com.yxcorp.gifshow.postfont.repo.RemoteFontRepo$e;
import erd.g;
import crd.b;
import com.yxcorp.gifshow.postfont.repo.RemoteFontRepo$f;
import com.kwai.middleware.resourcemanager.cache.type.Result;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.Iterable;
import com.kwai.middleware.resourcemanager.material.cache.model.MaterialGroupInfo;
import java.util.Collection;
import ekd.q;
import com.kwai.middleware.resourcemanager.material.cache.model.MaterialDetailInfo;
import com.yxcorp.gifshow.postfont.model.FontConfigExtra;
import d0c.a;
import d0c.e;

public final class RemoteFontRepo	// class@0010ab
{
    public final p a;
    public static final RemoteFontRepo$a b;

    static {
       RemoteFontRepo.b = new RemoteFontRepo$a(null);
    }
    public void RemoteFontRepo(){
       super();
       this.a = s.c(RemoteFontRepo$resourceManager$2.INSTANCE);
    }
    public final t a(CachePolicy p0,Integer p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, RemoteFontRepo.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "cachePolicy");
       boolean b = (p0 == CachePolicy.NETWORK_ELSE_CACHE)? true: false;
       Log.g("FontBIZ", "fetchConfigForEditFontObserver networkFirst:"+b+", cachePolicy:"+p0);
       t ot = this.d().a(p0).observeOn(d.c).map(new RemoteFontRepo$c(this, p1));
       a.o(ot, "resourceManager.fetch\(ca¡­ fontConfigList\n        }");
       return ot;
    }
    public final void b(CachePolicy p0,RemoteFontRepo$b p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, RemoteFontRepo.class, "2")) {
          return;
       }
       a.p(p0, "cachePolicy");
       Log.g("FontBIZ", "fetchConfigForEditFont cachePolicy:"+p0+", callback:"+p1+", cachePolicy:"+p0);
       this.d().a(p0).observeOn(d.c).subscribe(new RemoteFontRepo$d(this, p1), new RemoteFontRepo$e(p1));
       return;
    }
    public final t c(CachePolicy p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, RemoteFontRepo.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "cachePolicy");
       boolean b = (p0 == CachePolicy.NETWORK_ELSE_CACHE)? true: false;
       Log.g("FontBIZ", "fetchConfigForEditFontObserver networkFirst:"+b+", cachePolicy:"+p0);
       t ot = this.d().a(p0).observeOn(d.c).map(new RemoteFontRepo$f(this));
       a.o(ot, "resourceManager.fetch\(ca¡­ fontConfigList\n        }");
       return ot;
    }
    public final b d(){
       Object obj = PatchProxy.apply(null, this, RemoteFontRepo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.getValue();
    }
    public final void e(Result p0,List p1,Integer p2){
       Iterator iterator;
       MaterialDetailInfo obj2;
       Collection this;
       FontConfigExtra obj = p2;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, RemoteFontRepo.class, "10")) {
          return;
       }
       List list = p0.a();
       if (list != null) {
          super();
          iterator = list.iterator();
          while (iterator.hasNext()) {
             Object obj1 = iterator.next();
             obj2 = (a.g(obj1.getGroupType(), obj) || obj == null)? 1: null;
             if (obj2) {
                this.add(obj1);
             }
          }
       }else {
          this = null;
       }
       if (q.f(this)) {
          Log.b("FontBIZ", "groupData data is empty");
          return;
       }else if(this != null){
          iterator = this.iterator();
          while (iterator.hasNext()) {
             List detailInfoLi = iterator.next().getDetailInfoList();
             if (detailInfoLi != null) {
                Iterator detailInfoLi1 = detailInfoLi.iterator();
                while (detailInfoLi1.hasNext()) {
                   obj2 = detailInfoLi1.next();
                   obj = obj2.getExtObject();
                   String materialId = obj2.getMaterialId();
                   String str = (obj != null)? obj.getFontRealName(): null;
                   String str1 = (obj != null)? obj.getFontFileFullName(): null;
                   String str2 = (obj != null)? obj.getStatisticsName(): null;
                   String str3 = (obj != null)? obj.getCoverSelectedImageName(): null;
                   List list1 = e.a.a(obj2.getIconUrls());
                   List resourceUrls = obj2.getResourceUrls();
                   int i = 0;
                   int i1 = (obj != null)? obj.getAndroidLineSpace(): 0;
                   a uoa = new a(materialId, str, str1, list1, str3, str2, resourceUrls, i, i1, 128, 0);
                   p1.add(v15);
                   StringBuilder str4 = "name: ";
                   String fontRealName = (obj != null)? obj.getFontRealName(): null;
                   str4 = str4+fontRealName+", fontCover cdn size:";
                   List iconUrls = obj2.getIconUrls();
                   Integer integer = (iconUrls != null)? Integer.valueOf(iconUrls.size()): null;
                   Log.b("FontBIZ", str4+integer);
                }
             }
             int i2 = p1;
          }
       }
       return;
    }
}
