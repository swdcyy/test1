package dca.o;
import com.yxcorp.gifshow.component.postlistcomponent.view.PostListComponentView$a;
import com.yxcorp.gifshow.editor.aicutv2.ui.VideoTemplateViewBinder;
import java.lang.Object;
import nn9.b;
import android.view.View;
import java.lang.String;
import xoc.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import mn9.a;
import java.util.Objects;
import eca.g;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import com.yxcorp.gifshow.v3.editor.i;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import h69.j;
import com.yxcorp.gifshow.aicut.VideoTemplate;
import tvc.e;
import com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel;
import cca.b;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import jn9.b;
import dca.s;
import mn9.b;
import bca.a;
import com.yxcorp.gifshow.editor.aicutv2.actions.AICutLastSelectedSubItemIdUpdateAction;
import xvc.b;
import lnc.g7;
import com.yxcorp.gifshow.editor.aicutv2.actions.VideoTemplateLoadingEditAction;
import com.kwai.feature.post.api.feature.memory.MemoryLogger;
import lnc.i3;
import k2b.e0;

public final class o implements PostListComponentView$a	// class@001efd
{
    public final VideoTemplateViewBinder a;

    public void o(VideoTemplateViewBinder p0){
       this.a = p0;
       super();
    }
    public boolean a(b p0,View p1,String p2){
       EditorDelegate uEditorDeleg;
       b a;
       ClientEvent$ElementPackage uElementPack;
       MemoryLogger b;
       b uob = b.class;
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, o.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "itemState");
       a.p(p1, "itemView");
       a.p(p2, "tag");
       a uoa = p0.g();
       Objects.requireNonNull(uoa, "null cannot be cast to non-null type com.yxcorp.gifshow.editor.aicutv2.ui.item.VideoTemplateUIItem");
       p2 = "editorHelperContract.editorDelegate";
       String str = null;
       if (uoa.g()) {
          uEditorDeleg = this.a.m.f();
          a.o(uEditorDeleg, p2);
          c uoc = uEditorDeleg.N();
          a.o(uoc, "editorHelperContract.editorDelegate.workspaceDraft");
          String str1 = j.d(uoc, false);
          VideoTemplate videoTemplat = uoa.b();
          if (!this.a.l.o0().b()) {
             String id = (videoTemplat != null)? videoTemplat.getId(): str;
             if (!a.g(id, str1)) {
             label_007b :
                if (videoTemplat == null) {
                   a = b.a;
                   Objects.requireNonNull(a);
                   if (!PatchProxy.applyVoid(str, a, uob, "11")) {
                      uElementPack = new ClientEvent$ElementPackage();
                      uElementPack.action2 = "EDIT_AICUT";
                      u1.u(1, uElementPack, str);
                   }
                }else {
                   a = b.a;
                   Objects.requireNonNull(a);
                   if (!PatchProxy.applyVoid(str, a, uob, "9")) {
                      uElementPack = new ClientEvent$ElementPackage();
                      uElementPack.action2 = "CHANGE_TEMPLATE_BUTTON";
                      u1.u(1, uElementPack, str);
                   }
                }
                a = this.a.l.z0().n();
                Objects.requireNonNull(a, "null cannot be cast to non-null type com.yxcorp.gifshow.editor.aicutv2.newtwork.VideoTemplateDataProvider");
                a.n(false);
                VideoTemplateViewBinder l = this.a.l;
                VideoTemplate videoTemplat1 = uoa.b();
                if (videoTemplat1 != null) {
                   str = videoTemplat1.getId();
                }
                l.t0(new AICutLastSelectedSubItemIdUpdateAction(str));
                return false;
             }
          }
          g.m(uoa, false, 1, str);
          goto label_007b ;
       }else {
          uEditorDeleg = this.a.m.f();
          a.o(uEditorDeleg, p2);
          if (g7.a(uEditorDeleg.N()) && uoa.j()) {
             this.a.l.t0(new VideoTemplateLoadingEditAction(false, 1));
             this.a.l.A0();
          }
          if (this.a.j != null) {
             b = MemoryLogger.b;
             String id1 = uoa.f().getId();
             Objects.requireNonNull(b);
             if (!PatchProxy.applyVoidOneRefs(id1, b, MemoryLogger.class, "5")) {
                uElementPack = new ClientEvent$ElementPackage();
                uElementPack.action2 = "QUIT_RETAIN_DIALOG_TEMPLATE";
                i3 oi3 = i3.f();
                oi3.d("template_id", id1);
                uElementPack.params = oi3.e();
                u1.L("", str, 1, uElementPack, str);
             }
          }
          return false;
       }
    }
}
