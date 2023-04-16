package com.kuaishou.pagedy.manager.DynamicPageCenter$a;
import ro4.a;
import com.kuaishou.pagedy.manager.DynamicPageCenter;
import su.g;
import co4.d;
import java.lang.Object;
import com.kuaishou.bowl.data.center.data.model.page.component.PageComponentResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.pagedy.PageDy;
import java.lang.System;
import oo4.c;
import com.kuaishou.bowl.event.utils.StageName;
import fv.c;
import java.lang.StringBuilder;
import java.util.Map;
import qu4.f;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import brd.t;
import java.util.HashMap;
import com.kuaishou.pagedy.manager.DynamicPageCenter$6;
import android.util.Pair;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import com.kuaishou.merchant.preload.net.cache.PreloadCache;
import sa4.a;
import iv.c;
import com.kuaishou.pagedy.manager.DynamicPageCenter$7;
import brd.x;
import cjd.e;
import erd.o;
import com.kuaishou.pagedy.manager.a;
import com.gifshow.tuna.player.poi.e;
import erd.g;
import crd.b;
import t45.d;
import brd.z;
import com.kuaishou.pagedy.manager.DynamicPageCenter$a$a;
import com.kuaishou.pagedy.manager.DynamicPageCenter$a$b;
import java.lang.Throwable;

public class DynamicPageCenter$a implements a	// class@000a8a
{
    public final g a;
    public final d b;
    public final DynamicPageCenter c;

    public void DynamicPageCenter$a(DynamicPageCenter p0,g p1,d p2){
       this.c = p0;
       this.a = p1;
       this.b = p2;
       super();
    }
    public void a(PageComponentResponse p0){
       f c;
       if (PatchProxy.applyVoidOneRefs(p0, this, DynamicPageCenter$a.class, "1")) {
          return;
       }
       if (this.a.t != null) {
          PageDy.e().g.b(System.currentTimeMillis());
          DynamicPageCenter$a tc = this.c;
          c.f(StageName.pdy_request_end, tc.p, tc.o);
       }
       this.c.e(this.a, p0, this.b);
       DynamicPageCenter$a tc1 = this.c;
       String str = (this.a.t != null)? "COMPONENT_DATA_MAIN_REQUEST_STEP_3": "COMPONENT_DATA_OTHER_REQUEST_STEP_3";
       tc1.c(str, "命中预请求:"+this.a.q, null);
       c = f.c;
       DynamicPageCenter l = this.c.l;
       String str1 = (this.a.t != null)? "主接口": "其他接口";
       c.f(l, str1, "预请求接口数据", p0);
       return;
    }
    public void b(){
       g og;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, DynamicPageCenter$a.class, "3")) {
          return;
       }
       DynamicPageCenter$a tc = this.c;
       String str = (this.a.t != null)? "COMPONENT_DATA_MAIN_REQUEST_STEP_3": "COMPONENT_DATA_OTHER_REQUEST_STEP_3";
       tc.c(str, "未命中预请求:"+this.a.q, objArray);
       tc = this.c;
       DynamicPageCenter$a ta = this.a;
       DynamicPageCenter$a tb = this.b;
       Objects.requireNonNull(tc);
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       DynamicPageCenter uDynamicPage = DynamicPageCenter.class;
       HashMap obj = PatchProxy.applyTwoRefs(ta, tb, tc, uDynamicPage, "9");
       if (obj != patchProxyRe) {
          objArray = obj;
       }else {
          obj = new HashMap();
          if (ta.D != null) {
             obj.put("needCache", String.valueOf(true));
             obj.put("cacheTimeout", String.valueOf(ta.E));
          }
          if (ta.t != null) {
             c.l(StageName.pgy_page_first_request, tc.p, tc.o, new DynamicPageCenter$6(tc, ta));
          }
          String str1 = "COMPONENT_DATA_MAIN_REQUEST_STEP_2";
          if (ta.C != null) {
             Object[] objArray1 = PatchProxy.applyOneRefs(ta, tc, uDynamicPage, "11");
             if (objArray1 != patchProxyRe) {
             }else if(ta.n == null){
                objArray1 = objArray;
             }else {
                HashMap hashMap = new HashMap();
                Iterator iterator = ta.n.entrySet().iterator();
                while (iterator.hasNext()) {
                   Map$Entry uEntry = iterator.next();
                   Object key = uEntry.getKey();
                   hashMap.put(key, String.valueOf(uEntry.getValue()));
                }
                objArray1 = PreloadCache.d.c(new a(ta.q, hashMap), PageComponentResponse.class);
             }
             g h = ta.H;
             if (h != null) {
                h.b(objArray1);
             }
             if (objArray1 != null) {
                Pair first = objArray1.first;
                if (first != null) {
                   g h1 = ta.H;
                   if (h1 != null) {
                      h1.a(first);
                   }
                   c.l(StageName.pgy_page_cache_hit, tc.p, tc.o, new DynamicPageCenter$7(tc, ta));
                   objArray1.first.isFromCache = true;
                   if (ta.t == null) {
                      str1 = "COMPONENT_DATA_OTHER_REQUEST_STEP_2";
                   }
                   tc.c(str1, "命中缓存", objArray);
                   og = tc.l(ta);
                   tc.t = true;
                   t ot = tc.k(obj, og);
                   if (ot != null) {
                      g g = ta.G;
                      if (g != null) {
                         ot = ot.compose(g);
                      }
                      tc.b = ot.map(new e()).subscribe(new a(tc, og, tb), e.b);
                   }
                   objArray = t.just(objArray1.first).observeOn(d.a);
                }
             }
          }
       label_0138 :
          if (ta.t == null) {
             str1 = "COMPONENT_DATA_OTHER_REQUEST_STEP_2";
          }
          tc.c(str1, "未命中缓存", objArray);
          t ot1 = tc.k(obj, ta);
          if (ot1 != null) {
             og = ta.G;
             if (og != null) {
                ot1 = ot1.compose(og);
             }
             og = ta.F;
             if (og != null) {
                ot1 = ot1.retryWhen(og);
             }
             objArray = ot1.map(new e());
          }
       }
       tc.a = objArray.subscribe(new DynamicPageCenter$a$a(this), new DynamicPageCenter$a$b(this));
       return;
    }
    public void onError(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DynamicPageCenter$a.class, "2")) {
          return;
       }
       this.c.u(this.b, this.a, p0);
       DynamicPageCenter$a tc = this.c;
       String str = (this.a.t != null)? "COMPONENT_DATA_MAIN_REQUEST_STEP_3": "COMPONENT_DATA_OTHER_REQUEST_STEP_3";
       tc.b(str, "预请求失败:"+this.a.q, p0, null);
       return;
    }
}
