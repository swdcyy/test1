package com.yxcorp.gifshow.v3.editor.enhancefilter.model.a;
import java.lang.Object;
import java.lang.System;
import com.kwai.middleware.resourcemanager.ResourceSdk;
import jb7.a;
import com.yxcorp.gifshow.v3.editor.enhancefilter.model.PostModelConfigExtra;
import java.lang.String;
import java.lang.Class;
import jb7.b;
import brd.t;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import com.kwai.middleware.resourcemanager.cache.type.CachePolicy;
import com.kwai.middleware.resourcemanager.cache.BaseResourceCacheRepo;
import t45.d;
import brd.z;
import tqc.c;
import erd.o;
import com.yxcorp.gifshow.v3.editor.enhancefilter.model.a$a;
import tqc.b;
import tqc.a;
import erd.g;
import crd.b;
import com.kwai.middleware.resourcemanager.cache.type.Result;
import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import ekd.q;
import java.util.Iterator;
import com.kwai.middleware.resourcemanager.material.cache.model.MaterialGroupInfo;
import com.kwai.middleware.resourcemanager.material.cache.model.MaterialDetailInfo;
import tqc.d;
import java.io.File;
import com.yxcorp.gifshow.model.CDNUrl;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;

public class a	// class@000f90
{
    public long a;
    public b b;
    public b c;

    public void a(){
       super();
       this.a = System.currentTimeMillis();
       this.b = ResourceSdk.f.b(new a("POST_ALGO_MODEL", 1, PostModelConfigExtra.class));
    }
    public t a(boolean p0){
       z obj;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, uoa, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       Object[] objArray = new Object[0];
       a.D().w("PostAlgoModelRepo", "fetchModelDownloadConfig: networkFirst:"+p0, objArray);
       uoa = this.b;
       CachePolicy nETWORK_ELSE = (p0)? CachePolicy.NETWORK_ELSE_CACHE: CachePolicy.CACHE_ONLY;
       obj = d.c;
       t ot = uoa.a(nETWORK_ELSE).observeOn(obj).subscribeOn(obj);
       return ot.map(new c(this));
    }
    public void b(boolean p0,a$a p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, uoa, "1")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("PostAlgoModelRepo", "fetchModelDownloadConfig: networkFirst:"+p0, objArray);
       uoa = this.b;
       CachePolicy nETWORK_ELSE = (p0)? CachePolicy.NETWORK_ELSE_CACHE: CachePolicy.CACHE_ONLY;
       z c = d.c;
       t ot = uoa.a(nETWORK_ELSE).observeOn(c).subscribeOn(c);
       this.c = ot.subscribe(new b(this, p1), new a(p1));
       return;
    }
    public final List c(Result p0){
       Object[] objArray1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       a uoa = a.class;
       ArrayList obj = PatchProxy.applyOneRefs(p0, this, uoa, "3");
       if (obj != patchProxyRe) {
          return obj;
       }
       Object[] objArray = new Object[0];
       a.D().w("PostAlgoModelRepo", "groupData", objArray);
       List list = p0.a();
       obj = new ArrayList();
       if (q.f(list)) {
          objArray1 = new Object[0];
          a.D().w("PostAlgoModelRepo", "groupData: materialGroupInfoResult.getInfoList\(\) is empty", objArray1);
          return obj;
       }else {
          Iterator iterator = list.iterator();
          while (true) {
             if (!iterator.hasNext()) {
                return obj;
             }
             MaterialGroupInfo materialGrou = iterator.next();
             if (q.f(materialGrou.getDetailInfoList())) {
                break ;
             }else {
                Iterator iterator1 = materialGrou.getDetailInfoList().iterator();
                while (iterator1.hasNext()) {
                   MaterialDetailInfo materialDeta = iterator1.next();
                   d uod = new d();
                   uod.a = materialDeta.getId();
                   uod.b = materialDeta.getMaterialName();
                   uod.c = materialDeta.getIconUrls();
                   PostModelConfigExtra extObject = materialDeta.getExtObject();
                   if (extObject != null) {
                      uod.e = extObject.getAlgoModelType();
                      uod.d = extObject.getAlgoModelAndroid();
                   }
                   String str = PatchProxy.applyOneRefs(uod, this, uoa, "4");
                   if (str != patchProxyRe) {
                   }else {
                      str = d.g.getAbsolutePath();
                      if (uod.b() != null && (!uod.b().isEmpty() && !TextUtils.x(uod.b().get(0).getUrl()))) {
                         str = str+File.separator+TextUtils.D(uod.b().get(0).getUrl());
                      }
                   }
                   uod.f = str;
                   obj.add(uod);
                }
             }
          }
          objArray1 = new Object[0];
          a.D().w("PostAlgoModelRepo", "groupData: groupInfo.getDetailInfoList\(\) is empty", objArray1);
          return obj;
       }
    }
}
