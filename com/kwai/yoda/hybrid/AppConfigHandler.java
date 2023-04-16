package com.kwai.yoda.hybrid.AppConfigHandler;
import com.kwai.yoda.hybrid.AppConfigHandler$a;
import nsd.u;
import iy7.d;
import iy7.b;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kwai.yoda.hybrid.AppConfigHandler$preloadFileContentMap$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.yoda.hybrid.AppConfigHandler$b;
import io.reactivex.g;
import brd.t;
import com.kwai.yoda.hybrid.AppConfigHandler$c;
import erd.o;
import com.kwai.middleware.azeroth.scheduler.AzerothSchedulers;
import brd.z;
import com.kwai.middleware.azeroth.scheduler.AzerothSchedulers$a;
import com.kwai.yoda.hybrid.AppConfigHandler$d;
import com.kwai.yoda.hybrid.AppConfigHandler$e;
import erd.g;
import crd.b;
import java.util.HashMap;
import com.kwai.robust.PatchProxyResult;
import com.kwai.middleware.azeroth.Azeroth2;
import android.content.Context;
import com.kwai.yoda.model.AppConfigParams$DomainInfo;
import java.io.Serializable;
import hy7.r;
import com.kwai.yoda.hybrid.AppConfigHandler$f;
import java.util.concurrent.Callable;
import com.kwai.yoda.hybrid.AppConfigHandler$g;
import com.kwai.yoda.hybrid.AppConfigHandler$h;
import com.kwai.yoda.hybrid.AppConfigHandler$i;
import com.kwai.yoda.hybrid.AppConfigHandler$j;
import com.kwai.yoda.hybrid.AppConfigHandler$k;
import iy7.f;
import java.io.File;
import tb7.c;
import java.util.Map;
import rb7.c;
import jy7.a;
import rb7.a;
import com.kwai.yoda.hybrid.AppConfigHandler$l;
import com.kwai.yoda.hybrid.AppConfigHandler$m;
import com.kwai.yoda.model.AppConfigParams;
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.Iterable;
import com.kwai.yoda.model.AppConfigParams$BizInfo;
import iy7.a;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.Collection;
import com.kwai.yoda.hybrid.AppConfigHandler$n;
import com.kwai.yoda.hybrid.AppConfigHandler$o;
import com.kwai.yoda.kernel.cookie.YodaCookie;
import java.util.Objects;
import oy7.b;
import ub7.f;
import java.util.concurrent.CopyOnWriteArrayList;
import tb7.f;
import java.util.Comparator;
import kotlin.collections.CollectionsKt___CollectionsKt;
import tb7.g;
import zsd.u;
import ry7.b;
import com.kwai.yoda.kernel.YodaV2;
import ny7.h;
import java.util.LinkedHashMap;
import ny7.g;
import java.util.concurrent.ConcurrentHashMap;
import ny7.b;

public final class AppConfigHandler	// class@001279
{
    public final p a;
    public List b;
    public boolean c;
    public final d d;
    public final b e;
    public static final AppConfigHandler$a f;

    static {
       AppConfigHandler.f = new AppConfigHandler$a(null);
    }
    public void AppConfigHandler(d p0,b p1){
       a.q(p0, "mPreloadFileDao");
       a.q(p1, "mBizInfoDao");
       super();
       this.d = p0;
       this.e = p1;
       this.a = s.c(AppConfigHandler$preloadFileContentMap$2.INSTANCE);
       this.b = CollectionsKt__CollectionsKt.E();
    }
    public synchronized final boolean a(){
       return this.c;
    }
    public final void b(){
       if (PatchProxy.applyVoid(null, this, AppConfigHandler.class, "10")) {
          return;
       }
       t ot = t.create(new AppConfigHandler$b(this)).map(AppConfigHandler$c.b);
       a.h(ot, "Observable.create<List<S¡­ray\(\).contentToString\(\) }");
       AzerothSchedulers$a b = AzerothSchedulers.b;
       ot = ot.subscribeOn(b.a()).observeOn(b.c());
       a.h(ot, "this.subscribeOn\(Azeroth¡­hSchedulers.mainThread\(\)\)");
       ot.subscribe(new AppConfigHandler$d(this), AppConfigHandler$e.b);
       return;
    }
    public final List c(){
       return this.b;
    }
    public final HashMap d(){
       Object obj = PatchProxy.apply(null, this, AppConfigHandler.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.getValue();
    }
    public final void e(){
       if (PatchProxy.applyVoid(null, this, AppConfigHandler.class, "3")) {
          return;
       }
       if (this.a()) {
          return;
       }
       this.k(r.a(Azeroth2.B.d(), "key_domain_info", AppConfigParams$DomainInfo.class));
       t.fromCallable(new AppConfigHandler$f(this)).subscribe(new AppConfigHandler$g(this), AppConfigHandler$h.b);
       this.c = true;
       return;
    }
    public final void f(){
       if (PatchProxy.applyVoid(null, this, AppConfigHandler.class, "13")) {
          return;
       }
       t.fromCallable(new AppConfigHandler$i(this)).subscribe(new AppConfigHandler$j(this), AppConfigHandler$k.b);
       return;
    }
    public final void g(f p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AppConfigHandler.class, "17")) {
          return;
       }
       File uFile = new File(p0.c);
       String str = (uFile.canRead())? c.e(uFile): "";
       this.d().put(p0.d, str);
       return;
    }
    public final void h(){
       if (PatchProxy.applyVoid(null, this, AppConfigHandler.class, "6")) {
          return;
       }
       c.c.e(new a());
       return;
    }
    public final void i(t p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AppConfigHandler.class, "19")) {
          return;
       }
       p0.subscribe(AppConfigHandler$l.b, AppConfigHandler$m.b);
       return;
    }
    public final void j(AppConfigParams p0){
       t ot;
       if (PatchProxy.applyVoidOneRefs(p0, this, AppConfigHandler.class, "14")) {
          return;
       }
       ArrayList uArrayList = new ArrayList();
       p0 = p0.mBizInfoList;
       if (p0 != null) {
          Iterator iterator = p0.iterator();
          while (iterator.hasNext()) {
             AppConfigParams$BizInfo uBizInfo = iterator.next();
             AppConfigParams$BizInfo mBizId = uBizInfo.mBizId;
             a.h(mBizId, "bizInfo.mBizId");
             a uoa = new a(mBizId);
             mBizId = uBizInfo.mBizName;
             a.h(mBizId, "bizInfo.mBizName");
             uoa.a = mBizId;
             uoa.b = uBizInfo.mVersion;
             mBizId = uBizInfo.mUrl;
             a.h(mBizId, "bizInfo.mUrl");
             uoa.c = mBizId;
             uoa.d = uBizInfo.mData;
             uoa.e = uBizInfo.mLaunchModel;
             uArrayList.add(uoa);
          }
       }
       LinkedHashSet linkedHashSe = new LinkedHashSet();
       Iterator iterator1 = this.b.iterator();
       while (iterator1.hasNext()) {
          linkedHashSe.add(iterator1.next().f);
       }
       iterator1 = uArrayList.iterator();
       while (iterator1.hasNext()) {
          linkedHashSe.remove(iterator1.next().f);
       }
       if (linkedHashSe.isEmpty() ^ 0x01) {
          ot = t.fromCallable(new AppConfigHandler$n(this, linkedHashSe));
          a.h(ot, "Observable.fromCallable ¡­DeleteInfoIds.toList\(\)\) }");
          this.i(ot);
       }
       this.b = uArrayList;
       ot = t.fromCallable(new AppConfigHandler$o(this, uArrayList));
       a.h(ot, "Observable.fromCallable ¡­.updateList\(dbInfoList\) }");
       this.i(ot);
       return;
    }
    public final void k(AppConfigParams$DomainInfo p0){
       g a;
       List list;
       Iterator iterator;
       String str;
       String obj1;
       if (PatchProxy.applyVoidOneRefs(p0, this, AppConfigHandler.class, "15")) {
          return;
       }
       if (p0 != null) {
          YodaCookie f = YodaCookie.f;
          AppConfigParams$DomainInfo mInjectCooki = p0.mInjectCookies;
          Objects.requireNonNull(f);
          YodaCookie yodaCookie = YodaCookie.class;
          if (!PatchProxy.applyVoidOneRefs(mInjectCooki, f, yodaCookie, "6")) {
             ArrayList uArrayList = new ArrayList();
             if (mInjectCooki != null) {
                uArrayList.addAll(mInjectCooki);
             }
             b a1 = YodaCookie.a;
             if (a1 != null) {
                a1 = a1.a;
                if (a1 != null) {
                   list = a1.get();
                   if (list != null) {
                      uArrayList.addAll(list);
                   }
                }
             }
             if (uArrayList.isEmpty()) {
                list = CollectionsKt__CollectionsKt.E();
             }else {
                ArrayList uArrayList1 = new ArrayList();
                iterator = uArrayList.iterator();
                int i1 = 0;
                while (iterator.hasNext()) {
                   Object obj = iterator.next();
                   obj1 = obj;
                   if (obj1 == null || !obj1.length()) {
                      i1 = 1;
                   }
                   i1 = i1 ^ 1;
                   if (i1) {
                      uArrayList1.add(obj);
                   }
                }
                CopyOnWriteArrayList uCopyOnWrite = new CopyOnWriteArrayList();
                CollectionsKt___CollectionsKt.f5(uArrayList1, f.b);
                Iterator iterator1 = uArrayList1.iterator();
                while (iterator1.hasNext()) {
                   str = iterator1.next();
                   a.q(uCopyOnWrite, "rootHosts");
                   obj1 = (str == null || !str.length())? 1: null;
                   if (obj1) {
                      uCopyOnWrite = CollectionsKt__CollectionsKt.E();
                   }else {
                      uCopyOnWrite = CollectionsKt___CollectionsKt.J5(uCopyOnWrite);
                      Iterator iterator2 = uCopyOnWrite.iterator();
                      String str1 = "";
                      while (true) {
                         if (iterator2.hasNext()) {
                            String str2 = iterator2.next();
                            if (g.d(str, str2)) {
                               continue ;
                            }else if(u.H1(str2, str, i1, 2, null)){
                               str1 = str2;
                            }else {
                               continue ;
                            }
                         }else if(str1.length() > 0){
                            obj1 = 1;
                         }else {
                            obj1 = null;
                         }
                         if (obj1) {
                            uCopyOnWrite.remove(str1);
                         }
                         uCopyOnWrite.add(str);
                      }
                   }
                }
                CopyOnWriteArrayList uCopyOnWrite1 = uCopyOnWrite;
             }
             if (list.isEmpty() ^ 1) {
                iterator = f.h().iterator();
                while (iterator.hasNext()) {
                   str = iterator.next();
                   if (!list.contains(str)) {
                      a.h(str, "it");
                      YodaCookie.f.a(str, 1);
                   }
                }
             }
             f.h().clear();
             f.h().addAll(list);
             if (!PatchProxy.applyVoid(null, f, yodaCookie, "7")) {
                c.c.e(new b());
             }
          }
          h oh = YodaV2.f.a();
          p0 = p0.mJsBridgeApiMap;
          Objects.requireNonNull(oh);
          if (!PatchProxy.applyVoidOneRefs(p0, oh, h.class, "1")) {
             LinkedHashMap linkedHashMa = new LinkedHashMap();
             if (p0 != null) {
                linkedHashMa.putAll(p0);
             }
             h i = oh.i;
             if (i != null) {
                a = i.a;
                if (a != null) {
                   Map map = a.get();
                   if (map != null) {
                      linkedHashMa.putAll(map);
                   }
                }
             }
             oh.f.clear();
             oh.f.putAll(linkedHashMa);
             if (!PatchProxy.applyVoid(null, oh, h.class, "3")) {
                c.c.e(new b());
             }
          }
       }
    label_017a :
       return;
    }
}
