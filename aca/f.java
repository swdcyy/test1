package aca.f;
import tvc.c;
import com.yxcorp.gifshow.v3.editor.i;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import tkd.b;
import tkd.d;
import h69.b;
import java.util.ArrayList;
import crd.a;
import com.kuaishou.logic.c;
import aca.f$a;
import com.kuaishou.logic.c$a;
import aca.f$b;
import tvc.a;
import tvc.e;
import xvc.b;
import cca.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.editor.aicutv2.actions.VideoTemplateLoadingInitAction;
import cca.a;
import brd.v;
import i69.f;
import h69.c$a;
import faa.a;
import q87.c;
import java.lang.System;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import java.util.List;
import h69.j;
import java.lang.StringBuilder;
import java.util.Collection;
import com.kuaishou.edit.draft.Workspace$Type;
import com.kuaishou.edit.draft.Workspace$Source;
import com.kwai.sdk.switchconfig.a;
import qrd.l1;
import h69.c;
import i69.h;
import k69.f;
import lnc.g7;
import com.yxcorp.gifshow.edit.draft.DraftUtils;
import brd.t;
import java.util.Iterator;
import java.lang.Iterable;
import com.yxcorp.gifshow.models.QMedia;
import lnc.a1;
import t45.d;
import brd.z;
import aca.g;
import erd.o;
import aca.h;
import aca.i;
import erd.g;
import crd.b;
import java.util.concurrent.TimeUnit;
import aca.j;
import aca.k;
import android.graphics.Bitmap;
import com.yxcorp.gifshow.aicut.VideoTemplate;
import com.yxcorp.gifshow.aicut.api.AICutErrorCode;
import nsd.u;
import com.kwai.gifshow.post.api.core.camerasdk.model.Size;
import com.yxcorp.gifshow.editor.aicutv2.actions.VideoTemplateLoadingShowEditAction;
import com.yxcorp.gifshow.editor.aicutv2.actions.VideoTemplateLoadingEditAction;
import xoc.b;
import java.util.Objects;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import com.yxcorp.gifshow.editor.aicutv2.actions.VideoTemplateHideLoadingAction;
import com.yxcorp.gifshow.editor.aicutv2.actions.VideoTemplateLoadingProgressAction;
import com.yxcorp.gifshow.editor.aicutv2.actions.VideoTemplateLoadingBitmapAction;
import com.yxcorp.gifshow.editor.aicutv2.actions.VideoTemplateLoadingCompleteAction;

public final class f extends c	// class@000092
{
    public final b b;
    public f c;
    public boolean d;
    public boolean e;
    public int f;
    public final ArrayList g;
    public final ArrayList h;
    public a i;
    public b j;
    public c k;
    public final h l;
    public final i m;

    public void f(i p0){
       a.p(p0, "editorHelperContract");
       super();
       this.m = p0;
       this.b = d.a(-873393519);
       this.g = new ArrayList();
       this.h = new ArrayList();
       this.i = new a();
       this.k = new c(60.00f, new f$a(this), true);
       this.l = new f$b(this);
    }
    public e b(a p0,e p1){
       Object[] objArray;
       f c;
       z a;
       b uob;
       f project;
       a uoa1;
       a uoa2;
       a uoa3;
       f uof = this;
       v obj = p0;
       Object obj1 = p1;
       f uof1 = f.class;
       EditorDelegate obj2 = PatchProxy.applyTwoRefs(obj, obj1, uof, uof1, "1");
       if (obj2 != PatchProxyResult.class) {
          obj1 = obj2;
       }else {
          a.p(obj, "action");
          a.p(obj1, "oldState");
          v4 = obj instanceof VideoTemplateLoadingInitAction;
          if (obj2 || obj1.e() != null) {
             String str = "aiCutProject";
             if (obj2) {
                obj = obj.getExternalEmitter();
                if (!PatchProxy.applyVoidOneRefs(obj, uof, uof1, "2")) {
                   String str1 = "ai_cut_loading_timeout";
                   String str2 = "editorHelperContract.editorDelegate.workspaceDraft";
                   String str3 = "VideoTemplateLoadingMW";
                   int i = 0;
                   String str4 = "editorHelperContract.editorDelegate";
                   if (uof.b.getProject() == null) {
                      c$a uoa = new c$a();
                      objArray = new Object[i];
                      a.D().s(str3, "initProject: cost start", objArray);
                      EditorDelegate uEditorDeleg = uof.m.f();
                      a.o(uEditorDeleg, str4);
                      c uoc = uEditorDeleg.N();
                      a.o(uoc, str2);
                      uoa.c(j.f(uoc));
                      Object[] objArray1 = new Object[0];
                      a.D().s(str3, "initProject: cost = "+(System.currentTimeMillis() - System.currentTimeMillis()), objArray1);
                      uof.g.addAll(uoa.b());
                      EditorDelegate uEditorDeleg1 = uof.m.f();
                      a.o(uEditorDeleg1, str4);
                      String taskId = uEditorDeleg1.getTaskId();
                      a.o(taskId, "editorHelperContract.editorDelegate.taskId");
                      uoa.d(taskId);
                      uEditorDeleg1 = uof.m.f();
                      a.o(uEditorDeleg1, str4);
                      Workspace$Type type = uEditorDeleg1.getType();
                      a.o(type, "editorHelperContract.editorDelegate.type");
                      uoa.g(type);
                      uEditorDeleg1 = uof.m.f();
                      a.o(uEditorDeleg1, str4);
                      c uoc1 = uEditorDeleg1.N();
                      a.o(uoc1, str2);
                      Workspace$Source source = uoc1.T0();
                      a.o(source, "editorHelperContract.edi¡­ate.workspaceDraft.source");
                      uoa.f(source);
                      uoa.e(a.t().a(str1, 40));
                      uof.c = uof.b.Br(uoa.a());
                   }else {
                      project = uof.b.getProject();
                      a.m(project);
                      uof.c = project;
                      if (project == null) {
                         a.S(str);
                      }
                      project.g(a.t().a(str1, 40));
                      project = uof.g;
                      f c2 = uof.c;
                      if (c2 == null) {
                         a.S(str);
                      }
                      project.addAll(c2.h());
                   }
                   uof.l.a(obj);
                   c = uof.c;
                   if (c == null) {
                      a.S(str);
                   }
                   c.d(uof.l);
                   c = uof.c;
                   if (c == null) {
                      a.S(str);
                   }
                   obj2 = uof.m.f();
                   a.o(obj2, str4);
                   c.r(g7.a(obj2.N()));
                   c = uof.c;
                   if (c == null) {
                      a.S(str);
                   }
                   obj2 = uof.m.f();
                   a.o(obj2, str4);
                   c.j(DraftUtils.S(obj2.N()));
                   c = uof.c;
                   if (c == null) {
                      a.S(str);
                   }
                   c.start();
                   Iterator iterator = uof.g.iterator();
                   while (iterator.hasNext()) {
                      if (iterator.next().isVideo()) {
                         uof.d = false;
                      }
                   }
                   if (!PatchProxy.applyVoid(null, uof, uof1, "3")) {
                      z c1 = d.c;
                      a = d.a;
                      uob = t.fromIterable(uof.g).subscribeOn(c1).flatMap(new g(a1.e(45.00f))).observeOn(a).subscribe(new h(uof), i.b);
                      uof.j = uob;
                      if (uob != null) {
                         uof.i.c(uob);
                      }
                      if (uof.g.size() == 1 && uof.d != null) {
                         Object[] objArray2 = new Object[0];
                         a.D().w(str3, "playImages only one image", objArray2);
                      }else {
                         uof.i.c(t.interval(1500, TimeUnit.MILLISECONDS).subscribeOn(c1).observeOn(a).subscribe(new j(uof), k.b));
                      }
                   }
                   EditorDelegate uEditorDeleg2 = uof.m.f();
                   a.o(uEditorDeleg2, str4);
                   c uoc2 = uEditorDeleg2.N();
                   a.o(uoc2, str2);
                   uof.b.xo(uoc2);
                }
                obj1 = b.a(obj1, a.a(new a(false, false, 0, null, false, null, false, null, 255, null), true, false, null, null, true, 0, false, null, 238, null), false, false, null, null, 0, false, false, false, null, 0, false, 0, null, false, false, 0xffbe, null);
             }else if(obj instanceof VideoTemplateLoadingShowEditAction){
                uoa1 = obj1.e();
                uoa2 = (uoa1 != null)? a.a(uoa1, false, true, 0, null, false, null, false, null, 253, null): null;
                obj1 = b.a(obj1, uoa2, false, false, null, null, 0, false, false, false, null, 0, false, 0, null, false, false, 0xfffe, null);
             }else if(obj instanceof VideoTemplateLoadingEditAction){
                uoa1 = obj1.e();
                uoa2 = (uoa1 != null)? a.a(uoa1, false, false, 0, null, false, null, obj.getApplyStyle(), null, 172, null): null;
                project = uof.c;
                if (project == null) {
                   a.S(str);
                }
                project.m(obj.getApplyStyle());
                uof.i.dispose();
                if (obj.isTemplateUnify()) {
                   uob = b.a;
                   Objects.requireNonNull(uob);
                   objArray = null;
                   if (!PatchProxy.applyVoid(objArray, uob, b.class, "7")) {
                      ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                      uElementPack.action2 = "EDIT_AICUT_CANCEL";
                      u1.u(1, uElementPack, objArray);
                   }
                }
                obj1 = b.a(obj1, uoa2, false, false, null, null, 0, false, false, false, null, 0, false, 0, null, false, false, 0xfffe, null);
             }else {
                uoa1 = 0;
                if (obj instanceof VideoTemplateHideLoadingAction) {
                   uoa3 = obj1.e();
                   uoa2 = (uoa3 != null)? a.a(uoa3, false, false, 0, null, false, uof.b.LM(), obj.getApplyStyle(), obj.getError(), 12, null): uoa1;
                   uof.i.dispose();
                   obj1 = b.a(obj1, uoa2, false, false, null, null, 0, false, false, false, null, 0, false, 0, null, false, false, 0xfffe, null);
                }else if(obj instanceof VideoTemplateLoadingProgressAction){
                   uoa3 = obj1.e();
                   uoa2 = (uoa3 != null)? a.a(uoa3, false, false, obj.getProgress(), null, false, null, false, null, 251, null): uoa1;
                   obj1 = b.a(obj1, uoa2, false, false, null, null, 0, false, false, false, null, 0, false, 0, null, false, false, 0xfffe, null);
                }else if(obj instanceof VideoTemplateLoadingBitmapAction){
                   uoa3 = obj1.e();
                   uoa2 = (uoa3 != null)? a.a(uoa3, false, false, 0, obj.getBitmap(), false, null, false, null, 247, null): uoa1;
                   obj1 = b.a(obj1, uoa2, false, false, null, null, 0, false, false, false, null, 0, false, 0, null, false, false, 0xfffe, null);
                }else if(obj instanceof VideoTemplateLoadingCompleteAction){
                   c = uof.c;
                   if (c == null) {
                      a.S(str);
                   }
                   c.c(uof.l);
                   obj1 = b.a(obj1, null, false, false, null, null, 0, true, false, false, null, 0, false, 0, null, false, false, 0xffbe, null);
                }
             }
          }
       }
       return obj1;
    }
}
