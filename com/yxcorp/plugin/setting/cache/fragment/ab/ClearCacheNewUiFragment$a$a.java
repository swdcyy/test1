package com.yxcorp.plugin.setting.cache.fragment.ab.ClearCacheNewUiFragment$a$a;
import erd.o;
import java.lang.Object;
import java.util.List;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import brd.w;
import kotlin.jvm.internal.a;
import java.util.Iterator;
import java.lang.Iterable;
import bgd.c;
import com.kwai.framework.cache.initmodule.CheckDiskModule;
import com.yxcorp.plugin.setting.cache.CachePreferenceUtils;
import java.lang.Number;
import java.util.Map;
import java.util.Collection;
import java.lang.Long;
import v56.g;
import nsd.r0;
import java.lang.Float;
import java.util.Arrays;
import lnc.y6;
import com.yxcorp.gifshow.util.LoadPolicy;
import om6.d;
import brd.a0;
import brd.t;
import com.yxcorp.plugin.setting.cache.fragment.ab.a;
import erd.g;
import crd.b;
import com.yxcorp.plugin.setting.cache.fragment.ab.ClearCacheNewUiFragment$LocalResponse;

public final class ClearCacheNewUiFragment$a$a implements o	// class@000832
{
    public static final ClearCacheNewUiFragment$a$a b;

    static {
       ClearCacheNewUiFragment$a$a.b = new ClearCacheNewUiFragment$a$a();
    }
    public void ClearCacheNewUiFragment$a$a(){
       super();
    }
    public Object apply(Object p0){
       String obj;
       long l;
       float f;
       Object[] objArray;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       t ot = PatchProxy.applyOneRefs(p0, this, ClearCacheNewUiFragment$a$a.class, "1");
       if (ot != patchProxyRe) {
       }else {
          a.p(p0, "items");
          Iterator iterator = p0.iterator();
          while (iterator.hasNext()) {
             c uoc = iterator.next();
             int i = 1;
             if (!uoc.a()) {
                uoc.e("0.00 MB");
                if (CheckDiskModule.y) {
                   obj = PatchProxy.apply(null, null, CachePreferenceUtils.class, "3");
                   if (obj != patchProxyRe) {
                      l = obj.longValue();
                   }else {
                      l = 0;
                      Iterator iterator1 = CachePreferenceUtils.a().values().iterator();
                      while (iterator1.hasNext()) {
                         l = l + iterator1.next().longValue();
                      }
                   }
                   f = (float)l / 1024.00f;
                }else {
                   f = g.a();
                }
                int i1 = 1024;
                String str = "java.lang.String.format\(format, *args\)";
                if (f - (float)0x100000 > 0) {
                   objArray = new Object[i];
                   float f1 = (float)i1;
                   f = f / f1;
                   f = f / f1;
                   objArray[0] = Float.valueOf(f);
                   obj = String.format("%.2f GB", Arrays.copyOf(objArray, i));
                   a.o(obj, str);
                   uoc.e(obj);
                }else {
                   float f2 = (float)i1;
                   if (f - f2 > 0) {
                      Object[] objArray1 = new Object[i];
                      f = f / f2;
                      objArray1[0] = Float.valueOf(f);
                      obj = String.format("%.2f MB", Arrays.copyOf(objArray1, i));
                      a.o(obj, str);
                      uoc.e(obj);
                   }else if(f - (float)0 > 0){
                      objArray = new Object[i];
                      objArray[0] = Float.valueOf(f);
                      obj = String.format("%.2f KB", Arrays.copyOf(objArray, i));
                      a.o(obj, str);
                      uoc.e(obj);
                   }
                }
             }else if(uoc.a() == i){
                d uod = y6.s(d.class, LoadPolicy.SILENT_IMMEDIATE).e();
                a.o(uod, "draftAlbumPlugin");
                uod.yy().subscribe(new a(uoc));
             }
          }
          ot = t.just(new ClearCacheNewUiFragment$LocalResponse(p0));
       }
       return ot;
    }
}
