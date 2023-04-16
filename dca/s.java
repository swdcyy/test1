package dca.s;
import com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel;
import jn9.b;
import com.yxcorp.gifshow.v3.editor.i;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import com.kuaishou.edit.draft.Workspace$Type;
import com.yxcorp.gifshow.v3.f;
import xvc.f;
import cca.b;
import java.util.Objects;
import cca.b$a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import cca.a;
import java.util.List;
import com.kwai.gifshow.post.api.core.camerasdk.model.Size;
import nsd.u;
import tvc.c;
import aca.e;
import aca.f;
import aca.d;
import tvc.e;
import com.yxcorp.gifshow.widget.adv.VideoSDKPlayerView;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gifshow.editor.aicutv2.actions.AICutIgnoreLoadingItemCallbackAction;
import xvc.b;
import com.yxcorp.gifshow.editor.aicutv2.actions.AICutLastSelectedSubItemIdUpdateAction;
import yba.a;
import com.yxcorp.gifshow.editor.aicutv2.actions.VideoTemplatePanelAttachAction;
import com.yxcorp.gifshow.editor.aicutv2.actions.VideoTemplatePanelDetachAction;
import com.yxcorp.gifshow.editor.aicutv2.actions.VideoTemplateLoadListAction;
import zba.a;
import xvc.g;
import com.yxcorp.gifshow.v3.EditorItemFunc;

public final class s extends EditReduxViewModel	// class@001f01
{
    public final b l;
    public final i m;

    public void s(b p0,i p1){
       int i = this;
       Object obj = p0;
       Object obj1 = p1;
       a.p(obj, "adapter");
       a.p(obj1, "editHelper");
       EditorDelegate uEditorDeleg = p1.f();
       a.o(uEditorDeleg, "editHelper.editorDelegate");
       boolean b = f.E(uEditorDeleg.getType());
       uEditorDeleg = p1.f();
       a.o(uEditorDeleg, "editHelper.editorDelegate");
       f uof = uEditorDeleg.f();
       b$a q = b.q;
       Objects.requireNonNull(q);
       b uob = PatchProxy.apply(null, q, b$a.class, "1");
       if (uob != PatchProxyResult.class) {
       }else {
          b uob1 = new b(null, false, false, null, null, 0, false, false, false, null, 0, false, 0, null, false, false, 0xffff, null);
       }
       c[] uocArray = new c[]{new e(obj),new f(obj1),new d(obj1)};
       super(b, uof, uob, uocArray, 0, 16, 0);
       i.l = obj;
       i.m = obj1;
       return;
    }
    public final void A0(){
       if (PatchProxy.applyVoid(null, this, s.class, "3")) {
          return;
       }
       if (this.o0().p != null && !TextUtils.x(this.o0().d())) {
          this.t0(new AICutIgnoreLoadingItemCallbackAction());
       }
       this.t0(new AICutLastSelectedSubItemIdUpdateAction(null));
       return;
    }
    public e v0(b p0,e p1){
       a a;
       Object obj = p0;
       b obj1 = p1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       String str = "1";
       String obj2 = PatchProxy.applyTwoRefs(obj, obj1, this, s.class, str);
       if (obj2 != patchProxyRe) {
       }else {
          obj2 = "action";
          a.p(obj, obj2);
          String str1 = "oldState";
          a.p(obj1, str1);
          a = a.a;
          Objects.requireNonNull(a);
          Object obj3 = PatchProxy.applyTwoRefs(obj, obj1, a, a.class, str);
          if (obj3 != patchProxyRe) {
             obj1 = obj3;
          }else {
             a.p(obj, obj2);
             a.p(obj1, str1);
             if (obj instanceof VideoTemplatePanelAttachAction) {
                obj1 = b.a(obj1, null, true, false, null, null, 0, false, false, false, null, 0, false, 0, 0, false, false, 0xfffd, null);
             }else {
                Object obj4 = obj1;
                if (obj instanceof VideoTemplatePanelDetachAction) {
                   obj1 = b.a(obj4, null, false, false, null, null, 0, false, false, false, null, 0, false, 0, null, false, false, 0xfffd, null);
                }else if(obj instanceof VideoTemplateLoadListAction){
                   obj1 = b.a(obj4, null, false, false, null, null, 0, false, false, false, null, 0, false, a.b.a(), null, false, false, 0xefff, null);
                }else {
                   obj1 = obj4;
                }
             }
          }
          obj2 = obj1;
       }
       return obj2;
    }
    public e w0(g p0,e p1){
       Object obj = p0;
       Size obj1 = p1;
       b uob = PatchProxy.applyTwoRefs(obj, obj1, this, s.class, "2");
       if (uob != PatchProxyResult.class) {
       }else {
          a.p(obj, "draftState");
          a.p(obj1, "oldState");
          Size size = obj1;
          obj1 = new Size(p0.g().b, p0.g().c);
          uob = b.a(this.o0(), null, false, false, null, null, 0, false, false, false, size, p0.f(), false, 0, null, false, false, 0xf9ff, null);
       }
       return uob;
    }
    public EditorItemFunc y0(){
       return EditorItemFunc.AICUT;
    }
    public final b z0(){
       return this.l;
    }
}
