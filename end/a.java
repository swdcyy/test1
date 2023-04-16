package end.a;
import and.a;
import yld.a;
import androidx.fragment.app.Fragment;
import android.view.View;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.v3.EditorItemFunc;
import end.a$a;
import com.yxcorp.gifshow.decoration.widget.BaseDrawer;
import com.yxcrop.gifshow.v3.editor.text_v2_share.element.NewEditTextBaseElement;
import com.yxcorp.gifshow.v3.EditorManager$b;
import com.yxcrop.gifshow.v3.editor.decoration_v2.ui.DecorationTimelineFragment;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import com.yxcrop.gifshow.v3.editor.subtitle_v2.ui.timeline.SubtitleTimelineFragment;
import amd.c;
import hnd.f;
import gnd.b;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationBaseDrawer;
import com.yxcorp.gifshow.decoration.widget.BaseDrawerData$CustomButtonMode;
import vmd.c;
import java.util.Objects;
import k2b.e0;
import tvc.e;
import com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel;
import zmd.a;
import java.util.List;
import java.util.Iterator;
import java.lang.Iterable;
import kotlin.collections.CollectionsKt__CollectionsKt;
import com.yxcrop.gifshow.v3.editor.text_v2_share.model.NewTextBaseElementData;
import com.yxcorp.gifshow.v3.editor.decoration.model.EditBaseDrawerData;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerViewV2;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView;
import com.yxcrop.gifshow.v3.editor.subtitle_v2.action.SubtitleItemClickAction;
import xvc.b;
import com.yxcorp.gifshow.v3.EditorManager;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.v3.editor.BaseEditorFragment;
import faa.a;
import q87.c;
import com.yxcorp.gifshow.v3.y;
import mod.a;
import voc.o;
import bvc.b;
import xld.a;
import end.a$b;
import java.lang.Runnable;
import android.widget.AbsoluteLayout;

public final class a extends a implements a	// class@000d9b
{
    public final EditorManager$b l;

    public void a(Fragment p0,View p1,EditorDelegate p2){
       a.p(p0, "fragment");
       a.p(p1, "rootView");
       a.p(p2, "delegate");
       super(p1, p0, p2, EditorItemFunc.SUBTITLE_V2, false);
       this.l = new a$a(this);
    }
    public boolean D(BaseDrawer p0){
       return p0 instanceof NewEditTextBaseElement;
    }
    public EditorManager$b F(){
       return this.l;
    }
    public DecorationTimelineFragment L(boolean p0){
       SubtitleTimelineFragment obj;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, uoa, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new SubtitleTimelineFragment();
       obj.ph(this.E());
       return obj;
    }
    public c M(Fragment p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "fragment");
       return b.a(p0);
    }
    public void N(EditDecorationBaseDrawer p0){
       c a;
       a uoa = a.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uoa, "2")) {
       }else if(p0 != null && p0.getCustomButtonMode() == BaseDrawerData$CustomButtonMode.SUBTITLE_PANEL){
          a = c.a;
          Fragment uFragment = this.G();
          Objects.requireNonNull(uFragment, "null cannot be cast to non-null type com.yxcorp.gifshow.log.ILogPage");
          String str = "subtitle";
          Objects.requireNonNull(a);
          if (!PatchProxy.applyVoidTwoRefs(uFragment, str, a, c.class, "8")) {
             a.p(uFragment, "iLogPage");
             a.p(str, "buttonType");
             a.c(uFragment, "EDIT_ADD_TEXT_ITEM", "edit_type", str);
          }
          Iterator iterator = this.K().o0().i().iterator();
          int i = 0;
          int i1 = 0;
          int i2 = 0;
          while (iterator.hasNext()) {
             Object obj = iterator.next();
             int i3 = i2 + 1;
             if (i2 < 0) {
                CollectionsKt__CollectionsKt.W();
             }
             int i4 = obj.l0();
             EditDecorationBaseDrawer selectDrawer = this.I().getSelectDrawer();
             if (selectDrawer != null && i4 == selectDrawer.getLayerIndex()) {
                i1 = i2;
             }
             i2 = i3;
          }
          this.K().t0(new SubtitleItemClickAction(i1));
          Object[] objArray = null;
          str = "5";
          BaseEditorFragment uBaseEditorF = PatchProxy.apply(objArray, this, uoa, str);
          if (uBaseEditorF != PatchProxyResult.class) {
          }else {
             BaseFragment uBaseFragmen = this.E().q();
             if (!uBaseFragmen instanceof BaseEditorFragment) {
                uBaseFragmen = objArray;
             }
             if (uBaseFragmen != null) {
                uBaseEditorF = uBaseFragmen.B;
             }else {
                uBaseEditorF = objArray;
             }
          }
          if (uBaseEditorF != null && !PatchProxy.applyVoid(objArray, uBaseEditorF, EditorManager.class, str)) {
             Object[] objArray1 = new Object[i];
             a.D().w("EditorManager", "startSubtitleEditor", objArray1);
             uBaseEditorF.r.e(EditorItemFunc.SUBTITLE_V2);
          }
       }
       return;
    }
    public void O7(a p0,a p1){
       boolean b;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "1")) {
          return;
       }
       a.p(p0, "newState");
       a.p(p1, "lastState");
       if (!p0.C().f()) {
          o oo = this.E().x();
          a.o(oo, "editorDelegate.editorContext");
          if (!oo.b().d() && (!p0.s() && !p0.E())) {
             b = true;
          label_0045 :
             if (this.I().P() != b) {
                if (this.I().getSelectDecorationDrawer() instanceof NewEditTextBaseElement) {
                   BaseDrawer selectDecora = this.I().getSelectDecorationDrawer();
                   Objects.requireNonNull(selectDecora, "null cannot be cast to non-null type com.yxcrop.gifshow.v3.editor.text_v2_share.element.NewEditTextBaseElement<com.yxcorp.gifshow.decoration.widget.BaseDrawerData!>");
                   if (!selectDecora.isSubtitle()) {
                      return;
                   }
                }
                if (p0.C().f() || (p1.C().f() || (!p0.E() && p1.E()))) {
                   this.I().setShowCustomButton(b);
                   this.I().post(new a$b(this, b));
                }else {
                   this.I().U0(b);
                }
             }
             return;
          }
       }
       b = false;
       goto label_0045 ;
    }
    public void x(a p0,a p1){
       this.O7(p0, p1);
    }
}
