package aca.d;
import tvc.c;
import com.yxcorp.gifshow.v3.editor.i;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import tkd.b;
import tkd.d;
import h69.b;
import aca.d$a;
import tvc.a;
import tvc.e;
import xvc.b;
import cca.b;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.editor.aicutv2.actions.VideoTemplatePanelAttachAction;
import com.yxcorp.gifshow.editor.aicutv2.actions.VideoTemplateChangedAction;
import cca.a;
import java.util.List;
import com.kwai.gifshow.post.api.core.camerasdk.model.Size;
import com.yxcorp.gifshow.editor.aicutv2.actions.VideoTemplateClearAction;
import java.lang.Boolean;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import com.kuaishou.edit.draft.Workspace$Type;
import xoc.c;
import com.yxcorp.gifshow.aicut.VideoTemplate;
import brd.t;
import i69.f;
import aca.a;
import erd.a;
import aca.b;
import aca.c;
import erd.g;
import crd.b;
import com.yxcorp.gifshow.editor.aicutv2.actions.VideoTemplateClearCancelAction;
import com.yxcorp.gifshow.editor.aicutv2.actions.VideoTemplateLoadItemAction;
import com.yxcorp.gifshow.editor.aicutv2.actions.VideoTemplateDisableAutoLoadAction;
import com.yxcorp.gifshow.editor.aicutv2.actions.VideoTemplateDestroyAction;
import k69.f;
import faa.a;
import q87.c;
import com.kwai.video.minecraft.model.EditorSdk2V2$VideoEditorProject;
import com.yxcorp.gifshow.v3.editor.aicut.AICutProjectManager;

public final class d extends c	// class@00008d
{
    public final b b;
    public f c;
    public b d;
    public final d$a e;
    public final i f;

    public void d(i p0){
       a.p(p0, "editorHelperContract");
       super();
       this.f = p0;
       this.b = d.a(-873393519);
       this.e = new d$a(this);
    }
    public e b(a p0,e p1){
       boolean b;
       d c;
       d d;
       Object obj = this;
       EditorDelegate obj1 = p0;
       b uob = p1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       d uod = d.class;
       Object obj2 = PatchProxy.applyTwoRefs(obj1, uob, obj, uod, "1");
       if (obj2 != patchProxyRe) {
       }else {
          a.p(obj1, "action");
          a.p(uob, "oldState");
          if (obj1 instanceof VideoTemplatePanelAttachAction) {
             this.c();
             obj.b.jF();
          }else if(obj1 instanceof VideoTemplateChangedAction){
             this.c();
             uob = b.a(uob, null, false, false, null, null, 0, false, false, false, null, 0, false, 0, null, false, false, 0xfffb, null);
          }else if(obj1 instanceof VideoTemplateClearAction){
             this.c();
             obj1 = PatchProxy.apply(null, obj, uod, "3");
             if (obj1 != patchProxyRe) {
                b = obj1.booleanValue();
             }else {
                obj1 = obj.f.f();
                a.o(obj1, "editorHelperContract.editorDelegate");
                c uoc = obj1.N();
                a.o(uoc, "draft");
                Workspace$Type aLBUM_MOVIE = Workspace$Type.ALBUM_MOVIE;
                if (uoc.a1() == aLBUM_MOVIE || uoc.b1() == aLBUM_MOVIE) {
                   VideoTemplate videoTemplat = c.a.b(uoc);
                   c = obj.c;
                   if (c == null) {
                      a.S("aiCutProject");
                   }
                   obj.d = c.n(videoTemplat).doFinally(new a(obj, videoTemplat)).subscribe(b.b, c.b);
                   b = true;
                }else {
                   b = false;
                }
             }
             if (b) {
                uob = b.a(uob, null, false, true, null, null, 0, false, false, false, null, 0, false, 0, null, false, false, 0xfffb, null);
             }
          }else if(obj1 instanceof VideoTemplateClearCancelAction){
             d = obj.d;
             if (d != null) {
                d.dispose();
             }
             uob = b.a(uob, null, false, false, null, null, 0, false, false, false, null, 0, false, 0, null, false, false, 0xfffb, null);
          }else if(obj1 instanceof VideoTemplateLoadItemAction){
             uob = (obj1.getLoadFirstItem())? b.a(uob, null, false, false, null, null, 0, false, false, false, null, 0, false, 0, null, false, false, 0xf7ff, null): b.a(uob, null, false, true, null, null, 0, false, false, false, null, 0, false, 0, null, false, false, 0xfffb, null);
          }else if(obj1 instanceof VideoTemplateDisableAutoLoadAction){
             uob = b.a(uob, null, false, false, null, null, 0, false, false, false, null, 0, false, 0, null, false, false, 0xf7ff, null);
          }else if(obj1 instanceof VideoTemplateDestroyAction){
             d = obj.c;
             if (d != null) {
                d.c(obj.e);
             }
          }
          obj2 = uob;
       }
       return obj2;
    }
    public final void c(){
       if (PatchProxy.applyVoid(null, this, d.class, "2")) {
          return;
       }
       if (this.c == null) {
          if (this.b.getProject() == null) {
             Object[] objArray = new Object[0];
             a.D().w("VideoTemplateChangeMW", "initProjectIfNeed: initProject", objArray);
             EditorDelegate uEditorDeleg = this.f.f();
             a.o(uEditorDeleg, "editorHelperContract\n            .editorDelegate");
             AICutProjectManager.a(new EditorSdk2V2$VideoEditorProject(), uEditorDeleg.N());
          }
          f project = this.b.getProject();
          a.m(project);
          this.c = project;
          if (project == null) {
             a.S("aiCutProject");
          }
          project.d(this.e);
       }
       return;
    }
}
