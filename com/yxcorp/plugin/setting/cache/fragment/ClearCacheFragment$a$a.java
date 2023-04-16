package com.yxcorp.plugin.setting.cache.fragment.ClearCacheFragment$a$a;
import erd.o;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import brd.w;
import kotlin.jvm.internal.a;
import java.util.Iterator;
import java.lang.Iterable;
import bgd.c;
import java.lang.StringBuilder;
import com.kwai.framework.cache.a;
import x56.a;
import com.yxcorp.plugin.setting.cache.fragment.ClearCacheFragment$LocalResponse;
import brd.t;

public final class ClearCacheFragment$a$a implements o	// class@00082e
{
    public static final ClearCacheFragment$a$a b;

    static {
       ClearCacheFragment$a$a.b = new ClearCacheFragment$a$a();
    }
    public void ClearCacheFragment$a$a(){
       super();
    }
    public Object apply(Object p0){
       t ot = PatchProxy.applyOneRefs(p0, this, ClearCacheFragment$a$a.class, "1");
       if (ot != PatchProxyResult.class) {
       }else {
          a.p(p0, "items");
          Iterator iterator = p0.iterator();
          while (iterator.hasNext()) {
             c uoc = iterator.next();
             uoc.e(a.f().e(uoc.a()).f()+"KB");
          }
          ot = t.just(new ClearCacheFragment$LocalResponse(p0));
       }
       return ot;
    }
}
