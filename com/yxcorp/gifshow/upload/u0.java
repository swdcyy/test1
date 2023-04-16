package com.yxcorp.gifshow.upload.u0;
import java.lang.Object;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import java.lang.Runnable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.yxcorp.gifshow.edit.draft.model.c;
import qq.a;
import com.yxcorp.gifshow.edit.draft.model.DraftEditException;
import java.lang.Throwable;
import w46.b;
import com.yxcorp.gifshow.util.PostExperimentUtils;
import lnc.s6;
import com.yxcorp.gifshow.model.VideoQualityObserveHandler;
import com.kwai.robust.PatchProxyResult;
import java.util.Objects;
import com.yxcorp.gifshow.model.VideoQualityObserveHandler$a;
import kotlin.jvm.internal.a;
import android.content.SharedPreferences;
import q46.l;
import java.lang.StringBuilder;
import gq.a;
import q87.c;
import com.yxcorp.gifshow.edit.draft.DraftUtils;
import bba.b;
import com.google.protobuf.GeneratedMessageLite;
import com.kuaishou.edit.draft.Publish;
import com.kuaishou.edit.draft.CustomSetting;
import wba.f0;
import com.kwai.gifshow.post.api.core.camerasdk.model.VideoContext;
import qr4.i;
import qr4.m$k0;
import com.kwai.gifshow.post.api.core.camerasdk.model.b;
import com.yxcorp.gifshow.edit.draft.model.reedit.DraftPublishedBackUpUtils;
import com.yxcorp.gifshow.edit.draft.model.workspace.Phase;
import com.yxcorp.gifshow.edit.draft.model.DraftFileManager;
import brd.t;
import dnc.m1;
import java.util.concurrent.Callable;
import t45.d;
import brd.z;
import com.yxcorp.gifshow.upload.p0;
import erd.o;
import java.io.File;
import dnc.t1;
import dnc.l1;
import erd.a;
import erd.g;
import io.reactivex.internal.functions.Functions;
import com.yxcorp.gifshow.upload.t0;
import crd.b;
import dnc.q1;
import dnc.n1;

public class u0	// class@001eae
{

    public void u0(){
       super();
    }
    public static void a(c p0,boolean p1,boolean p2,Runnable p3){
       Object[] objArray;
       boolean b1;
       t ot;
       if (PatchProxy.isSupport(u0.class) && PatchProxy.applyVoidFourRefs(p0, Boolean.valueOf(p1), Boolean.valueOf(p2), p3, null, u0.class, "4")) {
          return;
       }
       if (p0.E()) {
          objArray = new Object[0];
          a.D().u("PostWorkUtils", new DraftEditException("Corrupted workspace."), objArray);
          if (PostExperimentUtils.f1() && p3 != null) {
             p3.run();
          }
          return;
       }else if(!p0.D()){
          objArray = new Object[0];
          a.D().u("PostWorkUtils", new DraftEditException("Workspace is not editing during post"), objArray);
          if (PostExperimentUtils.f1() && p3 != null) {
             p3.run();
          }
          return;
       }else {
          boolean b = s6.j();
          String str = p0.V0();
          PatchProxyResult patchProxyRe = PatchProxyResult.class;
          Object[] obj = PatchProxy.applyOneRefs(str, null, VideoQualityObserveHandler.class, "11");
          if (obj != patchProxyRe) {
             b1 = obj.booleanValue();
          }else {
             VideoQualityObserveHandler$a n = VideoQualityObserveHandler.n;
             Objects.requireNonNull(n);
             Object obj1 = PatchProxy.applyOneRefs(str, n, VideoQualityObserveHandler$a.class, "2");
             if (obj1 != patchProxyRe) {
                b1 = obj1.booleanValue();
             }else {
                a.p(str, "sessionId");
                b1 = l.g().getBoolean("VIDEO_QUALITY_PREFIX"+str, 0);
                Object[] objArray2 = new Object[0];
                a.D().w("VideoQualityObserveHandler", "getRecordResult : "+b1, objArray2);
             }
          }
          if (!p1 || (!DraftUtils.Y(p0) || PostExperimentUtils.l())) {
             if (p2) {
                int i = 1;
                if (!PostExperimentUtils.l()) {
                   p1 = (p0.Q0() != null && p0.Q0().v() != null)? p0.Q0().v().getCustomSetting().getShowVisibilityExpirationSwitch(): true;
                   p0.j0();
                   f0.d(p0.Q0(), p1, 0);
                   Object[] objArray1 = new Object[0];
                   a.D().s("PostWorkUtils", "Add inherit in VideoContext.", objArray1);
                   VideoContext videoContext = p0.d1();
                   VideoContext[] videoContext1 = new VideoContext[i];
                   videoContext1[0] = videoContext;
                   videoContext.d1(videoContext1);
                   videoContext.G1(0);
                   videoContext.F().b.C = false;
                   videoContext.F().b.s0 = false;
                   videoContext.d();
                   videoContext.g(0);
                   videoContext.Z1(0);
                   obj = new Object[0];
                   a.D().w("PostWorkUtils", "isActiveSaveLocalAlbum = "+videoContext.F().b.s0, obj);
                   b.q(p0.d1().F(), i);
                }
                if (b || b1) {
                   DraftPublishedBackUpUtils.b.c(p0, i);
                }
             }else {
                b.q(p0.d1().F(), 3);
             }
             b.a(p0.d1());
             objArray = new Object[0];
             a.D().s("PostWorkUtils", "Remove POST flat and save editing workspace.", objArray);
             p0.l1(Phase.POST);
             ot = DraftFileManager.E().b(p0);
          }else if(b || (b1 && !DraftUtils.Y(p0))){
             objArray = new Object[0];
             a.D().w("PostWorkUtils", "enablePhotoReeditAfterDeleted, delete editing workspace, save origin workspace", objArray);
             ot = t.fromCallable(new m1(p0)).observeOn(d.a).flatMap(p0.b);
          }else {
             objArray = new Object[0];
             a.D().w("PostWorkUtils", "Delete both editing and origin workspaces.", objArray);
             ot = DraftFileManager.E().n(DraftFileManager.E().H(p0)).observeOn(d.a).flatMap(new t1(p0));
          }
          ot.doAfterTerminate(new l1(p3)).subscribe(Functions.d(), t0.b);
          return;
       }
    }
    public static void b(File p0,boolean p1,boolean p2,Runnable p3){
       if (PatchProxy.isSupport(u0.class) && PatchProxy.applyVoidFourRefs(p0, Boolean.valueOf(p1), Boolean.valueOf(p2), p3, null, u0.class, "1")) {
          return;
       }
       if (p0 == null || !p0.exists()) {
          if (p3 != null) {
             p3.run();
          }
          return;
       }else {
          DraftFileManager.E().X(p0).observeOn(d.a).subscribe(new q1(p1, p2, p3), new n1(p0));
          return;
       }
    }
}
