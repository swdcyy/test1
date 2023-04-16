package eub.i;
import g6c.o;
import q16.a;
import com.kuaishou.edit.draft.Workspace$Type;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import crd.a;
import android.content.Intent;
import android.content.Context;
import lnc.a1;
import com.yxcorp.gifshow.v3.EditorActivity;
import java.lang.Class;
import eub.i$a;
import g6c.c;
import brd.t;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import eub.i$c;
import erd.o;
import kotlin.Triple;
import java.lang.Double;
import java.lang.Boolean;
import g6c.n;
import tkd.b;
import tkd.d;
import f0c.t;
import com.yxcorp.gifshow.postwork.a;
import r26.e;
import java.util.concurrent.ConcurrentHashMap;
import eub.i$d;
import java.util.concurrent.Callable;
import t45.d;
import brd.z;
import eub.i$f;
import io.reactivex.g;
import java.util.List;
import com.yxcorp.gifshow.v3.constructor.WorkspaceConstructor;
import java.lang.RuntimeException;
import java.lang.Throwable;
import eub.i$b;
import y26.b$a;
import java.lang.Number;
import java.lang.Integer;
import w26.a;
import y26.b;
import g6c.m;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import com.yxcorp.gifshow.activity.GifshowActivity;
import w26.c;
import xvc.f;
import com.yxcorp.gifshow.edit.previewer.loaderv2.base.b$a;
import eub.a;
import com.kwai.video.minecraft.model.EditorSdk2V2$VideoEditorProject;
import com.kwai.video.editorsdk2.model.ImmutableArray;
import java.util.Iterator;
import java.lang.Iterable;
import com.kwai.video.minecraft.model.EditorSdk2V2$AnimatedSubAsset;
import maa.a;
import com.kwai.feature.post.api.core.model.EditCoverConfiguration;
import wba.m;
import eub.o;
import java.io.File;
import com.yxcorp.gifshow.util.PostUtils;
import qaa.a;
import com.yxcorp.gifshow.edit.draft.model.c;
import eub.k;
import laa.f;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.edit.draft.Cover$b;
import eub.i$e;
import q16.b;

public class i implements o	// class@002829
{
    public final a a;
    public f b;
    public final Intent c;
    public int d;
    public e e;
    public boolean f;
    public final i$a g;
    public a h;
    public Workspace$Type i;

    public void i(a p0,Workspace$Type p1){
       a.p(p0, "editPageParam");
       super();
       this.h = p0;
       this.i = p1;
       this.a = new a();
       this.c = new Intent(a1.c(), EditorActivity.class);
       this.d = -1;
       this.g = new i$a(this.h);
    }
    public boolean a(){
       return true;
    }
    public t b(c p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, i.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "noUiPublishManager");
       Object[] objArray = new Object[0];
       a.D().w("EditPageNoUiPublishStageImpl", "initDraft editPageParam:"+this.h+", recommendDraftType:"+this.i+" build", objArray);
       this.q(this.h);
       t ot = this.i().map(new i$c(this));
       a.o(ot, "buildWorkspaceDraft\(\).ma¡­H_MAX_PROGRESS, it\)\n    }");
       return ot;
    }
    public t c(c p0){
       Object[] obj = PatchProxy.applyOneRefs(p0, this, i.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "noUiPublishManager");
       obj = new Object[0];
       a.D().w("EditPageNoUiPublishStageImpl", "encode isSkip", obj);
       t ot = t.just(new Triple(Double.valueOf(100.00f), null, null));
       a.o(ot, "Observable.just\(Triple\(N¡­AX_PROGRESS, null, null\)\)");
       return ot;
    }
    public void d(boolean p0){
       b uob;
       i oi = i.class;
       if (PatchProxy.isSupport(oi) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, oi, "15")) {
          return;
       }
       n.d(this, p0);
       Object[] objArray = new Object[0];
       a.D().w("EditPageNoUiPublishStageImpl", "stop postInfoId:"+this.d+", isFailed:"+p0, objArray);
       this.a.dispose();
       if (!p0 && !PatchProxy.applyVoid(null, this, oi, "16")) {
          String str = "PluginManager.get\(PostWo¡­ternalPlugin::class.java\)";
          if (this.e != null) {
             uob = d.a(-273232199);
             a.o(uob, str);
             uob.a20().K3(this.e);
          }
          if (this.d > null) {
             uob = d.a(-273232199);
             a.o(uob, str);
             uob.a20().cancel(this.d);
          }
       }
    label_0081 :
       return;
    }
    public boolean e(){
       return n.c(this);
    }
    public double f(ConcurrentHashMap p0){
       return n.a(this, p0);
    }
    public t g(c p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, i.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "noUiPublishManager");
       Object[] objArray = new Object[0];
       a.D().w("EditPageNoUiPublishStageImpl", "loadProject build", objArray);
       t ot = t.fromCallable(new i$d(this, p0)).subscribeOn(d.c);
       a.o(ot, "Observable.fromCallable ¡­eOn\(KwaiSchedulers.ASYNC\)");
       return ot;
    }
    public t h(c p0){
       t obj = PatchProxy.applyOneRefs(p0, this, i.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "noUiPublishManager");
       Object[] objArray = new Object[0];
       a.D().w("EditPageNoUiPublishStageImpl", "upload build", objArray);
       obj = t.create(new i$f(this, p0));
       a.o(obj, "nextStepObservable");
       return this.o(obj, p0);
    }
    public t i(){
       t ot;
       List obj = PatchProxy.apply(null, this, i.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = WorkspaceConstructor.b(this.c);
       if (obj.isEmpty()) {
          ot = t.error(new RuntimeException("buildWorkspaceDraft draft is empty"));
          a.o(ot, "Observable.error\(Runtime¡­ceDraft draft is empty\"\)\)");
          return ot;
       }else {
          ot = t.fromCallable(new i$b(this, obj)).subscribeOn(d.c);
          a.o(ot, "Observable.fromCallable ¡­eOn\(KwaiSchedulers.ASYNC\)");
          return ot;
       }
    }
    public int j(b$a p0,c p1){
       int i;
       Integer obj = PatchProxy.applyTwoRefs(p0, p1, this, i.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       a.p(p0, "sharePageParamBuilder");
       a.p(p1, "noUiPublishManager");
       obj = Integer.valueOf(this.c.getIntExtra("EDIT_DIRECTLY_FORCE_VISIBILITY_EXPIRATION", 1));
       if (obj.intValue() < 0 || obj.intValue() > 2) {
          obj = null;
       }
       c uoc = p1.b().b();
       a.m(uoc);
       i = d.a(0x27e26f6e).lS(null, p0.g(), true, uoc, obj);
       Object[] objArray = new Object[0];
       a.D().w("EditPageNoUiPublishStageImpl", "directlyPublish postInfoId:"+i+", forceVisibilityType:"+obj, objArray);
       return i;
    }
    public final i$a k(){
       return this.g;
    }
    public final f l(){
       i obj = PatchProxy.apply(null, this, i.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.b;
       if (obj == null) {
          a.S("editDraftProjectRepo");
       }
       return obj;
    }
    public final Workspace$Type m(){
       return this.i;
    }
    public void n(c p0,b$a p1){
       int i;
       i oi = i.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, oi, "7")) {
          return;
       }
       a.p(p0, "workspaceDraft");
       a.p(p1, "loaderResult");
       i = 0;
       Object[] objArray = new Object[i];
       a.D().w("EditPageNoUiPublishStageImpl", "onLoadProject", objArray);
       boolean b = this instanceof a;
       if (!PatchProxy.isSupport(oi) || !PatchProxy.applyVoidThreeRefs(Boolean.valueOf(b), p0, p1, this, i.class, "8")) {
          Object[] objArray1 = new Object[i];
          a.D().w("EditPageNoUiPublishStageImpl", "fillCover noUiPublishFromDraft:"+b, objArray1);
          if (b) {
             Object[] objArray2 = new Object[i];
             a.D().w("EditPageNoUiPublishStageImpl", "fillCover from draft return", objArray2);
          }else {
             EditorSdk2V2$VideoEditorProject project = p1.getProject();
             if (project != null) {
                ImmutableArray immutableArr = project.animatedSubAssets();
                if (immutableArr != null) {
                   Iterator iterator = immutableArr.iterator();
                   while (iterator.hasNext()) {
                      iterator.next().setNotRenderInThumbnail(i);
                   }
                }
             }
             a x0 = this.h.X0;
             a.o(x0, "coverConfiguration");
             a uoa = p0.o0();
             a.m(uoa);
             a.o(uoa, "workspaceDraft.assetDraft!!");
             double d = m.d(x0, uoa);
             File uFile = PostUtils.f();
             a.o(uFile, "PostUtils.getCacheDir\(\)");
             String str = o.a.a(p1, uFile, d);
             StringBuilder str1 = "fillCover coverConfiguration:"+x0;
             Object[] objArray3 = new Object[i];
             a.D().w("EditPageNoUiPublishStageImpl", str1+", "+"coverTime:"+d+", coverPath:"+str, objArray3);
             a uoa1 = p0.s0();
             a.m(uoa1);
             a.o(uoa1, "workspaceDraft.coverDraft!!");
             uoa1.c0();
             GeneratedMessageLite$Builder uBuilder = uoa1.l(new k(d));
             a.o(uBuilder, "coverDraft.ensureFirstBu¡­ePoints\(coverTime\)\)\n    }");
             uBuilder.d(uoa1.Q(str));
             uBuilder.e(uoa1.Q(str));
             uoa1.f();
          }
       }
       return;
    }
    public t o(t p0,c p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, i.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "nextStepObservable");
       a.p(p1, "noUiPublishManager");
       p0 = p0.flatMap(new i$e(this, p1));
       a.o(p0, "nextStepObservable.flatM¡­rkListener\)\n      }\n    }");
       return p0;
    }
    public final void p(f p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "2")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.b = p0;
       return;
    }
    public final void q(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "4")) {
          return;
       }
       a.p(p0, "editPageParam");
       this.h = p0;
       b.a(this.c, p0);
       return;
    }
}
