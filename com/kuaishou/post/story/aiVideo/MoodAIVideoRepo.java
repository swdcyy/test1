package com.kuaishou.post.story.aiVideo.MoodAIVideoRepo;
import com.kuaishou.post.story.aiVideo.model.AIVideoBackgroundData;
import java.lang.Object;
import java.util.HashMap;
import com.kuaishou.post.story.aiVideo.MoodAIVideoRepo$mVideoBackgroundDownloader$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.util.List;
import brd.t;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Boolean;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.post.story.aiVideo.MoodAIVideoRepo$a;
import java.util.concurrent.Callable;
import com.kuaishou.post.story.aiVideo.MoodAIVideoRepo$b;
import erd.o;
import kotlin.jvm.internal.a;
import java.io.File;
import tp4.v;
import java.util.Objects;
import rp4.a;
import q87.c;
import java.lang.StringBuilder;
import qkd.b;
import xp4.a;
import com.kuaishou.post.story.aiVideo.model.AIVideoBackgroundRecoData;
import java.util.Collection;
import ekd.q;
import nsd.u;
import brd.w;
import kotlin.jvm.internal.Ref$LongRef;
import xp4.c;
import xp4.b;
import wkd.b;
import ia0.g;
import com.kwai.framework.model.router.RouteType;
import t45.d;
import brd.z;
import com.yxcorp.retrofit.a;
import com.yxcorp.retrofit.e;
import cjd.e;
import tp4.r;
import tp4.s;
import erd.g;
import tp4.t;
import tp4.u;
import com.kuaishou.post.story.aiVideo.MoodAIVideoRepo$c;
import com.kuaishou.post.story.aiVideo.MoodAIVideoRepo$d;
import com.kuaishou.post.story.aiVideo.MoodAIVideoRepo$e;

public final class MoodAIVideoRepo	// class@000ab3
{
    public final HashMap a;
    public AIVideoBackgroundData b;
    public final p c;

    public void MoodAIVideoRepo(AIVideoBackgroundData p0){
       super();
       HashMap hashMap = new HashMap();
       this.a = hashMap;
       this.c = s.c(MoodAIVideoRepo$mVideoBackgroundDownloader$2.INSTANCE);
       this.b = p0;
       if (p0 != null) {
          hashMap.put(p0.h(), p0.g());
       }
       return;
    }
    public final t a(int p0,boolean p1){
       MoodAIVideoRepo moodAIVideoR = MoodAIVideoRepo.class;
       if (PatchProxy.isSupport(moodAIVideoR)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Boolean.valueOf(p1), this, moodAIVideoR, "4");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       t ot = t.fromCallable(new MoodAIVideoRepo$a(this, p0, p1)).flatMap(new MoodAIVideoRepo$b(this, p1));
       a.o(ot, "Observable.fromCallable{¡­isMoodEdit\)\n      }\n    }");
       return ot;
    }
    public final void b(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, MoodAIVideoRepo.class, "8")) {
          return;
       }
       MoodAIVideoRepo tb = this.b;
       if (tb != null) {
          File uFile = tb.d();
          if (uFile != null) {
             if (uFile.exists()) {
                objArray = uFile;
             }
             if (objArray != null) {
                v b = v.b;
                tb = this.b;
                a.m(tb);
                File uFile1 = tb.d();
                a.m(uFile1);
                Objects.requireNonNull(b);
                PatchProxyResult patchProxyRe = PatchProxyResult.class;
                v ov = v.class;
                File uFile2 = PatchProxy.applyOneRefs(uFile1, b, ov, "14");
                if (uFile2 != patchProxyRe) {
                }else {
                   a.p(uFile1, "videoFile");
                   Object[] objArray1 = new Object[0];
                   a.D().w("MoodAIVideoUtils", "createVideoCoverIfNotExist", objArray1);
                   Object obj = PatchProxy.applyOneRefs(uFile1, b, ov, "7");
                   uFile2 = (obj != patchProxyRe)? obj: new File(b.e(), uFile1.getName()+"_"+"cover.jpg");
                   uFile2 = b.a(uFile1, uFile2, 2, 0, 0);
                }
                if (b.S(uFile2)) {
                   tb = this.b;
                   if (tb != null) {
                      a.m(uFile2);
                      String absolutePath = uFile2.getAbsolutePath();
                      a.o(absolutePath, "coverFile!!.absolutePath");
                      if (!PatchProxy.applyVoidOneRefs(absolutePath, tb, AIVideoBackgroundData.class, "7")) {
                         a.p(absolutePath, "<set-?>");
                         tb.f = absolutePath;
                      }
                   }
                }
             }
          }
       }
    label_00af :
       return;
    }
    public final AIVideoBackgroundData c(){
       return this.b;
    }
    public final t d(a p0,boolean p1){
       Object[] obj;
       t ot;
       t ot1;
       Object obj1;
       Object[] objArray2;
       AIVideoBackgroundData uAIVideoBack;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       MoodAIVideoRepo moodAIVideoR = MoodAIVideoRepo.class;
       if (PatchProxy.isSupport(moodAIVideoR)) {
          obj = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), this, moodAIVideoR, "3");
          if (obj != patchProxyRe) {
             return obj;
          }
       }
       a.p(p0, "recoParams");
       List list = p0.a();
       obj = PatchProxy.applyOneRefs(list, this, moodAIVideoR, "2");
       if (obj != patchProxyRe) {
       }else {
          MoodAIVideoRepo tb = this.b;
          String str = "MoodAIVideoRepo";
          if (tb == null) {
             objArray2 = new Object[0];
             a.D().w(str, "isNeedLoad: true, currentData is null ", objArray2);
          }else {
             a.m(tb);
             if (a.g(tb.h(), list)) {
                objArray2 = new Object[0];
                a.D().w(str, "isNeedLoad: same Text ", objArray2);
                MoodAIVideoRepo tb1 = this.b;
                a.m(tb1);
                if (v.b.g(tb1.c())) {
                   objArray2 = new Object[0];
                   a.D().w(str, "isNeedLoad: false, file is exist", objArray2);
                   tb = this.b;
                }else {
                   objArray2 = new Object[0];
                   a.D().w(str, "isNeedLoad: true, file is not exist ", objArray2);
                }
             }else {
                obj1 = this.a.get(list);
                if (!q.f(obj1)) {
                   Object[] objArray3 = new Object[0];
                   a.D().w(str, "isNeedLoad: has cache response ", objArray3);
                   a.m(obj1);
                   if (v.b.g(obj1.get(0))) {
                      objArray3 = new Object[0];
                      a.D().w(str, "isNeedLoad: false file is exist", objArray3);
                      uAIVideoBack = new AIVideoBackgroundData(list, obj1, 0, 0, null, 28, null);
                   }else {
                      objArray2 = new Object[0];
                      a.D().w(str, "isNeedLoad: true file is not exist", objArray2);
                   }
                }else {
                   objArray2 = new Object[0];
                   a.D().w(str, "isNeedLoad: true, no cache ", objArray2);
                }
             }
          }
          obj = null;
       }
       if (obj != null) {
          Object[] objArray = new Object[0];
          a.D().w("MoodAIVideoRepo", "loadIfNeed: has cache", objArray);
          this.b = obj;
          ot = t.just(Integer.valueOf(100));
          a.o(ot, "Observable.just\(PROGRESS_ONE_HUNDRED\)");
          return ot;
       }else {
          Object[] objArray1 = new Object[0];
          a.D().w("MoodAIVideoRepo", "loadIfNeed: no cache, load begin", objArray1);
          w[] owArray = new w[2];
          if (PatchProxy.isSupport(moodAIVideoR)) {
             ot1 = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), this, moodAIVideoR, "7");
             if (ot1 != patchProxyRe) {
             }else {
             label_012b :
                objArray1 = new Object[0];
                a.D().w("MoodAIVideoRepo", "requestRecoObservable", objArray1);
                obj1 = this.a.get(p0.a());
                if (obj1 != null) {
                   objArray2 = new Object[0];
                   a.D().w("MoodAIVideoRepo", "requestRecoWithMockProgress: use cache data", objArray2);
                   uAIVideoBack = new AIVideoBackgroundData(p0.a(), obj1, 0, 0, null, 28, null);
                   this.b = patchProxyRe;
                   ot1 = t.just(patchProxyRe);
                   a.o(ot1, "Observable.just\(mCurrentBackgroundData\)");
                }else {
                   objArray1 = new Object[0];
                   a.D().w("MoodAIVideoRepo", "requestRecoWithMockProgress: request server reco", objArray1);
                   Ref$LongRef longRef = new Ref$LongRef();
                   longRef.element = 0;
                   c b = c.b;
                   _monitor_enter(b);
                   b uob = PatchProxy.apply(null, b, c.class, "1");
                   if (uob != patchProxyRe) {
                      _monitor_exit(b);
                   }else if(c.a == null){
                      c.a = e.b(b.a(-1961311520).a(RouteType.API, d.b), b.class);
                   }
                   uob = c.a;
                   a.m(uob);
                   _monitor_exit(b);
                   ot1 = uob.a(p0.a(), p0.b, p0.c).map(new e()).flatMap(new r(this, p0)).doOnSubscribe(new s(longRef)).doOnNext(new t(longRef, p1)).doOnError(new u(longRef, p1));
                   a.o(ot1, "MoodAIVideoApiServiceMan¡­odEdit,\n        \)\n      }");
                }
             }
          }else {
             goto label_012b ;
          }
          owArray[0] = ot1.map(MoodAIVideoRepo$c.b);
          owArray[1] = this.a(0, p1).map(MoodAIVideoRepo$d.b).doOnNext(new MoodAIVideoRepo$e(this));
          ot = t.concatArray(owArray);
          a.o(ot, "Observable.concatArray\(\n¡­rateCoverSplash\(\) }\n    \)");
          return ot;
       }
    }
}
