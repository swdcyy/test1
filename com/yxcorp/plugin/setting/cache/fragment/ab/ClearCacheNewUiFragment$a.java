package com.yxcorp.plugin.setting.cache.fragment.ab.ClearCacheNewUiFragment$a;
import qvb.f;
import java.util.List;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.plugin.setting.cache.fragment.ab.ClearCacheNewUiFragment$LocalResponse;
import brd.t;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import t45.d;
import brd.z;
import com.yxcorp.plugin.setting.cache.fragment.ab.ClearCacheNewUiFragment$a$a;
import erd.o;
import la6.b;
import java.lang.Boolean;

public final class ClearCacheNewUiFragment$a extends f	// class@000833
{
    public final List p;

    public void ClearCacheNewUiFragment$a(List p0){
       a.p(p0, "fixedItems");
       super();
       this.p = p0;
    }
    public boolean B1(Object p0){
       return this.h2(p0);
    }
    public boolean E1(){
       return false;
    }
    public t I1(){
       t obj = PatchProxy.apply(null, this, ClearCacheNewUiFragment$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = t.just(this.p).observeOn(d.c).flatMap(ClearCacheNewUiFragment$a$a.b);
       a.o(obj, "Observable.just\(fixedIte¡­esponse\(items\)\)\n        }");
       return obj;
    }
    public boolean X1(b p0){
       return this.h2(p0);
    }
    public boolean h2(ClearCacheNewUiFragment$LocalResponse p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ClearCacheNewUiFragment$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "response");
       return false;
    }
    public boolean hasMore(){
       return false;
    }
    public boolean i(){
       return false;
    }
}
