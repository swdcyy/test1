package com.kuaishou.live.effect.resource.download.common.e;
import sz2.c;
import java.lang.Object;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.String;
import java.util.List;
import pp.c;
import c03.k$c;
import c03.m;
import java.util.concurrent.ConcurrentHashMap;
import g03.b;
import d03.b;
import java.util.HashSet;
import com.kuaishou.live.effect.resource.download.common.e$a;
import com.kuaishou.live.effect.resource.download.common.e$b;
import com.kuaishou.live.effect.resource.download.common.e$f;
import g03.a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Number;
import java.util.Objects;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.util.Map;
import d03.a;
import java.lang.Long;
import java.lang.Integer;
import java.util.ArrayList;
import java.util.Iterator;
import zz2.d;
import sz2.b;
import java.lang.StringBuilder;
import com.kuaishou.android.live.log.b;
import sz2.a;
import java.util.Collection;
import com.kuaishou.live.effect.resource.download.common.e$d;
import sz2.d;
import sz2.g;
import c03.k;
import c03.k$b;
import wkd.b;
import com.kuaishou.live.basic.resourcemanager.c;
import com.yxcorp.download.DownloadTask$DownloadTaskType;
import brd.t;
import java.util.concurrent.TimeUnit;
import c03.i;
import erd.g;
import c03.f;
import c03.l;
import c03.e;
import crd.b;
import c03.j;
import com.kuaishou.live.effect.resource.download.common.e$e;
import java.util.Set;
import java.lang.Throwable;
import e03.a;
import xz2.a;
import java.lang.Iterable;
import qk.m;
import com.kuaishou.live.effect.resource.download.common.d;
import ok.h;
import vz2.f;
import kotlin.jvm.internal.a;
import java.lang.Boolean;
import com.kuaishou.live.effect.resource.download.v2.Status;
import xz2.a$a;
import lnc.i3;
import k2b.k2;
import k2b.u1;
import iy2.b;
import e03.b;
import vz2.a;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import f03.a;
import com.kuaishou.live.effect.resource.download.common.e$c;
import c03.k$a;
import com.kuaishou.live.effect.resource.download.v2.b;
import ok.o;
import e03.a$a;
import jb7.a;
import com.kwai.middleware.resourcemanager.ResourceSdk;
import jb7.b;
import com.kwai.middleware.resourcemanager.cache.type.CachePolicy;
import com.kwai.middleware.resourcemanager.cache.BaseResourceCacheRepo;
import t45.d;
import brd.z;
import r51.i;
import erd.o;
import r51.h;
import c03.h;
import c03.g;
import com.kuaishou.livestream.message.nano.LiveCommonEffectInfo;
import c03.d;
import com.kuaishou.live.effect.resource.download.common.LiveMagicGiftDownloadController;
import vz2.c0;
import tz2.a;
import tz2.b;
import java.io.File;
import uz2.b;
import qkd.b;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;
import vz2.i;

public class e implements c	// class@001b3a
{
    public final List b;
    public final k c;
    public final m d;
    public final Map e;
    public final Map f;
    public final b g;
    public final b h;
    public final Set i;
    public final l j;
    public final l k;

    public void e(){
       super();
       this.b = LiveLogTag.LIVE_EFFECT.appendTag("LiveEffectResourceLoader");
       this.c = k$c.a;
       this.d = new m();
       this.e = new ConcurrentHashMap();
       this.f = new ConcurrentHashMap();
       this.g = new b();
       this.h = new b();
       this.i = new HashSet();
       this.j = new e$a(this);
       this.k = new e$b(this);
    }
    public void e(e$a p0){
       super();
       this.b = LiveLogTag.LIVE_EFFECT.appendTag("LiveEffectResourceLoader");
       this.c = k$c.a;
       this.d = new m();
       this.e = new ConcurrentHashMap();
       this.f = new ConcurrentHashMap();
       this.g = new b();
       this.h = new b();
       this.i = new HashSet();
       this.j = new e$a(this);
       this.k = new e$b(this);
    }
    public static e b(){
       return e$f.a;
    }
    public a Bl(){
       return this.g;
    }
    public long C1(String p0){
       long l;
       b b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       e obj = PatchProxy.applyOneRefs(p0, this, e.class, "8");
       if (obj != patchProxyRe) {
          return obj.longValue();
       }
       obj = this.h;
       Objects.requireNonNull(obj);
       Object obj1 = PatchProxy.applyOneRefs(p0, obj, b.class, "2");
       if (obj1 != patchProxyRe) {
          l = obj1.longValue();
       }else if(TextUtils.x(p0)){
          if (obj.a.isEmpty()) {
             b = obj.b;
             if (b != null) {
                obj.a.putAll(b.get());
             }
          }
          Long longx = obj.a.get(p0);
          if (longx != null) {
             l = longx.longValue();
          }
       }
       l = 0;
       return l;
    }
    public void Go(List p0,int p1){
       e j;
       a uoa1;
       Iterator iterator1;
       a uoa2;
       k ok1;
       e uoe;
       e uoe1;
       e uoe3;
       f uof;
       ArrayList uArrayList2;
       m b;
       Object obj = this;
       int i = p1;
       if (PatchProxy.isSupport(e.class)) {
          if (PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), obj, e.class, "5")) {
             return;
          }
       }else {
          int i1 = p0;
       }
       ArrayList uArrayList = new ArrayList();
       Iterator iterator = p0.iterator();
       String str = "2";
       while (iterator.hasNext()) {
          d uod = iterator.next();
          b uob = uod.a();
          String str1 = uob.d();
          if (obj.e.containsKey(str1)) {
             b.S(obj.b, "[downloadImmediately] mLiveEffectResourceDownloadStatusMap.containsKey:"+str1, "downloadStatus", obj.e.get(str1));
          }else {
             obj.f.put(str1, uob);
             String str2 = "[addResourceState]";
             if (!PatchProxy.applyVoidOneRefs(uob, obj, e.class, "13")) {
                uoa2 = uob.b();
                ArrayList uArrayList3 = (uoa2 != null)? new ArrayList(uoa2.c()): null;
                obj.e.put(uob.d(), new e$d(uob.d(), uob.a().b(), g.b(uArrayList3)));
                b.S(obj.b, str2, "mLiveEffectResourceDownloadStatusMap", obj.e);
             }
             uArrayList.add(uod);
             a uoa = uob.b();
             if (uoa != null && uoa.c().size() > 0) {
                e c = obj.c;
                j = obj.j;
                Objects.requireNonNull(c);
                k ok = k.class;
                if (PatchProxy.isSupport(ok) && PatchProxy.applyVoidThreeRefs(uoa, Integer.valueOf(p1), j, c, k.class, "1")) {
                   uoa1 = uoa;
                   iterator1 = iterator;
                }else {
                   iterator1 = iterator;
                   b.S(c.a, "[download]", "downloadList", uoa.c());
                   if (!PatchProxy.applyVoidOneRefs(uoa, c, ok, str)) {
                      str = g.b(uoa.c());
                      if (c.b.containsKey(str)) {
                         b.S(c.a, str2, "mLiveEffectResourceDownloadStatusMap contain", str);
                      }else {
                         uArrayList2 = new ArrayList();
                         List list1 = uoa.a();
                         if (list1.size() > 0) {
                            uArrayList2.add(g.b(list1));
                         }
                         list1 = uoa.e();
                         if (list1.size() > 0) {
                            uArrayList2.add(g.b(list1));
                         }
                         c.b.put(str, new k$b(str, uArrayList2));
                         b.T(c.a, "[addResourceState]", "dependKey", str, "resKeyList", uArrayList2);
                      }
                   }
                   if (uoa.a().size() <= 0 || (PatchProxy.isSupport(ok) && PatchProxy.applyVoidThreeRefs(uoa, Integer.valueOf(p1), j, c, k.class, "3"))) {
                      ok1 = ok;
                      uoe = j;
                      uoe1 = c;
                      uoa1 = uoa;
                   }else {
                      String str5 = g.b(uoa.c());
                      ok1 = ok;
                      uoe = j;
                      str2 = str5;
                      uoe1 = c;
                      c = uoe;
                      uoa1 = uoa;
                      uof = new f(c, uoa, str2, c, p1);
                      e uoe5 = uoa;
                      uoe3 = uoa;
                      uoe5 = new e(uoe1, uoa1, str2, c, p1);
                      b.a(-759560405).a("MAGIC_FACE_DEPEND", DownloadTask$DownloadTaskType.IMMEDIATE, uoa.a()).timeout(uoa.d(), TimeUnit.MILLISECONDS).doOnSubscribe(new i(str5, uoa, i)).subscribe(v14, uoe3);
                   }
                   if (uoa1.e().size() > 0 && (!PatchProxy.isSupport(ok1) || !PatchProxy.applyVoidThreeRefs(uoa1, Integer.valueOf(p1), uoe, uoe1, k.class, "4"))) {
                      String str3 = g.b(uoa1.c());
                      str2 = g.b(uoa1.e());
                      e uoe2 = uoe1;
                      k$b uob1 = uoe2.b.get(str3);
                      b.c0(LiveLogTag.PARALLEL_EFFECT, "tryDownloadOtherMagicFaceResource", "otherMagicFaceKey", str2);
                      if (uob1 != null) {
                         uoe3 = e.b();
                         List list = uoa1.e();
                         j oj = new j(uoe2, uob1, str2, uoe, p1);
                         Objects.requireNonNull(uoe3);
                         if (!PatchProxy.applyVoidTwoRefs(list, v14, uoe3, e.class, "18")) {
                            e$e uoe4 = new e$e(uoe3, v14, list.size());
                            uoe3.i.add(uoe4);
                            ArrayList uArrayList1 = new ArrayList();
                            Iterator iterator2 = list.iterator();
                            while (iterator2.hasNext()) {
                               str2 = iterator2.next();
                               String str4 = String.valueOf(e.b().C1(str2));
                               if (("0").equals(str4)) {
                                  uoe4.a(str2, -1, null);
                               }else {
                                  a uoa3 = new a(str4);
                                  uoe3.Qg(uoa3.d(), uoe4);
                                  uArrayList1.add(new d(str4, uoa3, 3000));
                                  continue ;
                               }
                            }
                            uoe3.Go(uArrayList1, 12);
                         }
                      }else {
                         b.r(uoe2.a, "[tryDownloadOtherMagicFaceResource], downloadStatus = null£¬dependKey = "+str3);
                      }
                   }
                }
             label_02ad :
                uoa2 = uoa1;
                str = uoa2.f(uoa1.c());
                a.g(str1, uob.a().b(), str, uoa2.c());
             }else {
                iterator1 = iterator;
                a.g(str1, uob.a().b(), null, null);
             }
             iterator = iterator1;
          }
       }
       if (!PatchProxy.isSupport(e.class) || !PatchProxy.applyVoidTwoRefs(uArrayList, Integer.valueOf(p1), obj, e.class, "6")) {
          String str6 = "[downloadMagicFaceImmediately]";
          if (uArrayList.size() <= 0) {
             b.S(obj.b, str6, "renderRequests.size\(\)", Integer.valueOf(uArrayList.size()));
          }else {
             uArrayList2 = new ArrayList();
             m.s(uArrayList).F(d.b).n(uArrayList2);
             b.S(obj.b, str6, "download magicFaceIdList", uArrayList2);
             uof = f.e;
             j = obj.k;
             Objects.requireNonNull(uof);
             if (!PatchProxy.applyVoidTwoRefs(uArrayList2, j, uof, f.class, str)) {
                a.p(uArrayList2, "resIdList");
                a.p(j, "observer");
                b = f.b;
                Objects.requireNonNull(b);
                if (!PatchProxy.applyVoidTwoRefs(uArrayList2, j, b, m.class, str) && uArrayList2.size() > 0) {
                   Iterator iterator3 = uArrayList2.iterator();
                   while (iterator3.hasNext()) {
                      b.d(iterator3.next(), j);
                   }
                }
             }
             f.e.c(uArrayList, i);
          }
       }
       return;
    }
    public void Qg(String p0,l p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, e.class, "2")) {
          return;
       }
       this.d.d(p0, p1);
       return;
    }
    public void Xk(String p0,l p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, e.class, "3")) {
          return;
       }
       this.d.e(p0, p1);
       return;
    }
    public final void a(){
       boolean b;
       boolean b1;
       a$a a1;
       a$a uoa2;
       Object[] objArray2;
       i3 oi3;
       Object obj = this;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, obj, e.class, "16")) {
          return;
       }
       Iterator iterator = obj.e.values().iterator();
       while (iterator.hasNext()) {
          e$d uod = iterator.next();
          Objects.requireNonNull(uod);
          String str = "2";
          e$d obj1 = PatchProxy.apply(objArray, uod, e$d.class, str);
          if (obj1 != PatchProxyResult.class) {
             b = obj1.booleanValue();
          }else {
             Iterator iterator2 = uod.c.values().iterator();
             while (true) {
                if (iterator2.hasNext()) {
                   if (!Status.isDownloadComplete(iterator2.next())) {
                      b = false;
                   }
                }else {
                   b = true;
                }
             }
          }
          if (b && !PatchProxy.applyVoidOneRefs(uod, obj, e.class, "17")) {
             obj1 = uod.b;
             b obj2 = PatchProxy.apply(objArray, uod, e$d.class, "4");
             if (obj2 != PatchProxyResult.class) {
                b1 = obj2.booleanValue();
             }else {
                Iterator iterator1 = uod.c.values().iterator();
                while (true) {
                   if (iterator1.hasNext()) {
                      if (!Status.isDownloadSuccess(iterator1.next())) {
                         b1 = false;
                      }else {
                         continue ;
                      }
                   }else {
                      b1 = true;
                   }
                }
             }
             b.T(obj.b, "[onDownloadStatusCompleted]", "effectKey", obj1, "success", Boolean.valueOf(b1));
             if (b1) {
                obj.d.a(obj1);
             }else {
                e d = obj.d;
                int i4 = (uod.a(uod.a))? 0x2719: 0x2718;
                d.b(obj1, i4, objArray);
             }
             obj2 = obj.f.get(obj1);
             if (obj2 != null) {
                a uoa = obj2.b();
                List list = (uoa != null)? uoa.c(): new ArrayList();
                String str1 = "";
                String str2 = (uoa != null)? uoa.f(list): str1;
                e$d a = uod.a;
                boolean b2 = uod.a(str2);
                boolean b3 = uod.a(uod.a);
                a uoa1 = a.class;
                int i = 5;
                int i1 = 4;
                int i2 = 2;
                int i3 = 7;
                if (PatchProxy.isSupport(uoa1)) {
                   Object[] objArray1 = new Object[i3];
                   objArray1[0] = obj1;
                   objArray1[1] = a;
                   objArray1[i2] = str2;
                   objArray1[3] = list;
                   objArray1[i1] = Boolean.valueOf(b1);
                   objArray1[i] = Boolean.valueOf(b2);
                   objArray1[6] = Boolean.valueOf(b3);
                   if (!PatchProxy.applyVoid(objArray1, null, uoa1, str)) {
                   }
                }else {
                   i3 = 0;
                }
             }
          label_01d7 :
             obj.e.remove(obj1);
          }
          objArray = null;
       }
       return;
    }
    public void c(String p0,Status p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, e.class, "14")) {
          return;
       }
       b.T(this.b, "[onDependResourceDownloadCompleted]", "resId", p0, "status", p1);
       Iterator iterator = this.e.values().iterator();
       while (iterator.hasNext()) {
          iterator.next().b(p0, p1);
       }
       this.a();
       return;
    }
    public void d(String p0,Status p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, e.class, "15")) {
          return;
       }
       b.T(this.b, "[onMagicFaceResourceDownloadCompleted]", "magicFaceId", p0, "status", p1);
       Iterator iterator = this.e.values().iterator();
       while (iterator.hasNext()) {
          iterator.next().b(p0, p1);
       }
       this.a();
       return;
    }
    public void ei(a p0,b p1){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, e.class, "4")) {
          return;
       }
       b uob = p0.e();
       Objects.requireNonNull(uob);
       String str = "1";
       a obj = PatchProxy.apply(null, uob, b.class, str);
       int i = 0;
       if (obj != patchProxyRe) {
          b = obj.booleanValue();
       }else if(e.b().he().g(uob.b()) != null){
          b = true;
       }else {
          b = false;
       }
       b.S(this.b, "[checkLiveEffectResourceReady]", "magicFaceReady", Boolean.valueOf(b));
       obj = p0.b();
       if (obj == null) {
          p1.a(b);
       }else {
          a uoa = obj;
          if (uoa.c().size() > 0) {
             e tc = this.c;
             e$c uoc = new e$c(this, p1, b, p0);
             Objects.requireNonNull(tc);
             if (!PatchProxy.applyVoidTwoRefs(obj, uoc, tc, k.class, "6")) {
                boolean b1 = (uoa.a().size() > 0)? true: false;
                boolean b2 = (uoa.e().size() > 0)? true: false;
                Boolean[] uBooleanArra = new Boolean[]{Boolean.valueOf(b1),Boolean.valueOf(b2)};
                k$a uoa1 = new k$a(tc, uoc, m.t(uBooleanArra).p(b.b).size());
                if (b1) {
                   c uoc1 = b.a(-759560405);
                   String str1 = "MAGIC_FACE_DEPEND";
                   List list = uoa.a();
                   Objects.requireNonNull(uoc1);
                   t ot = PatchProxy.applyTwoRefs(str1, list, uoc1, c.class, str);
                   if (ot != patchProxyRe) {
                   }else {
                      a uoa2 = new a(str1, 1, Object.class);
                      ot = ResourceSdk.f.b(uoa2).a(CachePolicy.NETWORK_ELSE_CACHE).subscribeOn(d.b).map(new i(uoc1, list)).map(new h(uoc1, uoa2, list)).observeOn(d.a);
                   }
                   ot.subscribe(new h(tc, uoa1), new g(tc, uoa1));
                }
                if (b2) {
                   b.Z(LiveLogTag.PARALLEL_EFFECT, "check other magic depend");
                   Iterator iterator = uoa.e().iterator();
                   while (iterator.hasNext()) {
                      e.b().Bl().a(String.valueOf(e.b().C1(iterator.next())), null).c(new d(uoa1));
                   }
                }
             }
          }else {
             p1.a(b);
          }
       }
       return;
    }
    public a he(){
       Object obj = PatchProxy.apply(null, this, e.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveMagicGiftDownloadController.t();
    }
    public void hl(String p0){
       f e;
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "7")) {
          return;
       }
       e = f.e;
       Objects.requireNonNull(e);
       if (!PatchProxy.applyVoidOneRefs(p0, e, f.class, "5")) {
          a.p(p0, "magicGiftId");
          MagicEmoji$MagicFace magicFace = c0.b(p0);
          if (magicFace != null) {
             e.b().he().j(magicFace);
          }
       }
       e.e(p0, this.k);
       return;
    }
    public void kb(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, e.class, "9")) {
          return;
       }
       e th = this.h;
       Objects.requireNonNull(th);
       if (!PatchProxy.applyVoid(objArray, th, b.class, "1")) {
          th.a.clear();
       }
       return;
    }
    public void lh(a p0){
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, str)) {
          return;
       }
       b c = b.c;
       Objects.requireNonNull(c);
       if (!PatchProxy.applyVoidOneRefs(p0, c, b.class, str)) {
          a.p(p0, "config");
          b.b = p0;
       }
       e th = this.h;
       p0 = p0.e();
       Objects.requireNonNull(th);
       if (!PatchProxy.applyVoidOneRefs(p0, th, b.class, "3")) {
          a.p(p0, "mapGetter");
          th.b = p0;
       }
       return;
    }
    public void qn(MagicEmoji$MagicFace p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "11")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       File uFile = b.e(p0);
       if (uFile == null) {
          return;
       }
       try{
          b.p(uFile);
       }catch(java.io.IOException e3){
          ExceptionHandler.handleCaughtException(e3);
       }
       return;
    }
    public File sk(){
       Object obj = PatchProxy.apply(null, this, e.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return i.e.a();
    }
}
