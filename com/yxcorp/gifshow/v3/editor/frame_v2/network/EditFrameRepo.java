package com.yxcorp.gifshow.v3.editor.frame_v2.network.EditFrameRepo;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.ArrayList;
import com.yxcorp.gifshow.v3.editor.frame_v2.network.EditFrameRepo$compositeDisposable$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.yxcorp.gifshow.v3.editor.PostTaskManager;
import com.yxcorp.gifshow.v3.editor.frame_v2.network.EditFrameRepo$downloadHelper$2;
import com.yxcorp.gifshow.v3.editor.frame_v2.network.EditFrameRepo$mResourceManager$2;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.List;
import faa.a;
import java.lang.StringBuilder;
import java.lang.Iterable;
import java.lang.CharSequence;
import msd.l;
import kotlin.collections.CollectionsKt___CollectionsKt;
import q87.c;
import wqc.b;
import brd.v;
import xqc.f;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.v3.editor.frame_v2.network.EditCanvasBackgroundDownloadHelperV2;
import com.yxcorp.gifshow.v3.editor.PostTaskManager$a;
import com.yxcorp.gifshow.v3.editor.frame_v2.network.EditFrameRepo$a;
import com.yxcorp.gifshow.v3.editor.PostTaskManager$b;
import com.yxcorp.gifshow.v3.editor.PostTaskManager$PostTaskState;
import crd.a;
import wqc.e;
import wqc.c;
import com.google.common.collect.ImmutableList;
import java.util.Iterator;
import arc.a;
import java.util.Objects;
import maa.a;
import com.yxcorp.gifshow.edit.draft.model.c;
import com.kuaishou.edit.draft.Asset;
import com.yxcorp.gifshow.edit.draft.model.DraftFileManager;
import java.io.File;
import qkd.b;
import wqc.a;
import java.util.Collection;
import jb7.b;

public final class EditFrameRepo	// class@000fa2
{
    public final List a;
    public final p b;
    public final PostTaskManager c;
    public final p d;
    public final p e;
    public final c f;

    public void EditFrameRepo(c p0){
       a.p(p0, "mWorkspaceDraft");
       super();
       this.f = p0;
       this.a = new ArrayList();
       this.b = s.c(EditFrameRepo$compositeDisposable$2.INSTANCE);
       this.c = new PostTaskManager();
       this.d = s.c(EditFrameRepo$downloadHelper$2.INSTANCE);
       this.e = s.c(EditFrameRepo$mResourceManager$2.INSTANCE);
    }
    public final void a(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EditFrameRepo.class, "11")) {
          return;
       }
       if (!this.a.contains(p0)) {
          this.a.add(p0);
       }
       Object[] objArray = new Object[0];
       a.D().w("EditCanvasRepo", "failedList="+CollectionsKt___CollectionsKt.V2(this.a, ",", null, null, 0, null, null, 62, null), objArray);
       return;
    }
    public final void b(b p0,v p1){
       Object[] objArray;
       EditFrameRepo uEditFrameRe = EditFrameRepo.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, uEditFrameRe, "10")) {
          return;
       }
       a.p(p0, "backgroundData");
       if (p0.f() != 4) {
          objArray = new Object[0];
          a.D().w("EditCanvasRepo", "downloadBG only picture valid. type="+p0.f(), objArray);
          return;
       }else {
          Object[] objArray1 = new Object[0];
          a.D().w("EditCanvasRepo", "downloadBG start data:"+p0, objArray1);
          String str = p0.e();
          EditCanvasBackgroundDownloadHelperV2 uEditCanvasB = PatchProxy.apply(null, this, uEditFrameRe, "2");
          if (uEditCanvasB == PatchProxyResult.class) {
             uEditCanvasB = this.d.getValue();
          }
          f uof = new f(str, p0, uEditCanvasB);
          boolean b = (p1 == null)? true: false;
          if (b && this.a.contains(uof.d())) {
             objArray = new Object[0];
             a.D().w("EditCanvasRepo", "downloadBG task "+uof.d()+" has failed, skip silent download.", objArray);
             return;
          }else {
             EditFrameRepo$a uoa = new EditFrameRepo$a(this, uof, p0, b, p1);
             this.c.a(str);
             objArray = new Object[0];
             a.D().w("EditCanvasRepo", "downloadBG taskAdded:"+this.c.b(uof), objArray);
             return;
          }
       }
    }
    public final a c(){
       Object obj = PatchProxy.apply(null, this, EditFrameRepo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b.getValue();
    }
    public final List d(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       EditFrameRepo uEditFrameRe = EditFrameRepo.class;
       ArrayList obj = PatchProxy.apply(null, this, uEditFrameRe, "9");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = new ArrayList();
       obj.add(new e(1));
       ImmutableList immutableLis = c.b.a();
       Iterator obj1 = PatchProxy.applyOneRefs(immutableLis, this, uEditFrameRe, "7");
       if (obj1 != patchProxyRe) {
          immutableLis = obj1;
       }else {
          obj1 = immutableLis.iterator();
          while (obj1.hasNext()) {
             b uob = obj1.next();
             if (uob.f() == 2) {
                a a = a.a;
                EditFrameRepo tf = this.f;
                Objects.requireNonNull(a);
                String str = PatchProxy.applyOneRefs(tf, a, a.class, "3");
                int i = 0;
                if (str != patchProxyRe) {
                }else {
                   a.p(tf, "workspaceDraft");
                   a = tf.o0();
                   if (a != null) {
                      a.o(a, "workspaceDraft.assetDraft ?: return \"\"");
                      List list = a.z();
                      a.o(list, "assetDraft.messages");
                      if (list.size() > 0) {
                         Asset uAsset = a.z().get(i);
                         a.o(uAsset, "asset");
                         File uFile = DraftFileManager.E().B(uAsset.getFile(), a);
                         if (b.S(uFile)) {
                            a.o(uFile, "videoAssetFile");
                            str = uFile.getAbsolutePath();
                            a.o(str, "videoAssetFile.absolutePath");
                         }
                      }
                   }
                   str = "";
                }
                uob.g(str);
                Object[] objArray = new Object[i];
                a.D().w("EditCanvasRepo", "gaussian blur file path="+uob.d(), objArray);
             }
          }
       }
       ArrayList uArrayList = PatchProxy.applyOneRefs(immutableLis, this, uEditFrameRe, "6");
       if (uArrayList != patchProxyRe) {
       }else {
          uArrayList = new ArrayList();
          Iterator iterator = immutableLis.iterator();
          while (iterator.hasNext()) {
             uArrayList.add(new a(iterator.next()));
          }
       }
       obj.addAll(uArrayList);
       return obj;
    }
    public final b e(){
       Object obj = PatchProxy.apply(null, this, EditFrameRepo.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.e.getValue();
    }
}
