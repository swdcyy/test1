package nnd.a;
import yld.a;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import com.yxcorp.gifshow.v3.EditorItemFunc;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import nnd.a$a;
import com.yxcorp.gifshow.decoration.widget.BaseDrawer;
import com.yxcrop.gifshow.v3.editor.text_v2_share.element.NewEditTextBaseElement;
import com.yxcorp.gifshow.v3.EditorManager$b;
import com.yxcrop.gifshow.v3.editor.decoration_v2.ui.DecorationTimelineFragment;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import com.yxcrop.gifshow.v3.editor.text_v2.ui.timeline.TextTimelineFragmentV3;
import amd.c;
import tnd.b;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import und.l;
import androidx.lifecycle.ViewModel;
import java.util.Objects;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationBaseDrawer;
import com.yxcorp.gifshow.decoration.widget.BaseDrawerData$CustomButtonMode;
import tnd.c;
import k2b.e0;
import wnd.j;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerViewV2;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView;
import xld.a;
import xld.c;
import mod.a;
import voc.o;
import bvc.b;
import xld.b;
import nnd.b;
import java.lang.Runnable;
import android.widget.AbsoluteLayout;

public class a extends a	// class@001e90
{
    public final EditorManager$b l;

    public void a(View p0,Fragment p1,EditorDelegate p2,EditorItemFunc p3,boolean p4){
       a.p(p0, "rootView");
       a.p(p1, "fragment");
       a.p(p2, "editorDelegate");
       a.p(p3, "func");
       super(p0, p1, p2, EditorItemFunc.TEXT_V2, p4);
       this.l = new a$a(this, p3);
    }
    public boolean D(BaseDrawer p0){
       return p0 instanceof NewEditTextBaseElement;
    }
    public EditorManager$b F(){
       return this.l;
    }
    public DecorationTimelineFragment L(boolean p0){
       TextTimelineFragmentV3 textTimeline;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          textTimeline = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, uoa, "3");
          if (textTimeline != PatchProxyResult.class) {
          label_0025 :
             return textTimeline;
          }
       }
       textTimeline = new TextTimelineFragmentV3(p0);
       textTimeline.ph(this.E());
       goto label_0025 ;
    }
    public c M(Fragment p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "fragment");
       ViewModel viewModel = ViewModelProviders.of(b.b(p0)).get(l.class);
       Objects.requireNonNull(viewModel, "null cannot be cast to non-null type com.yxcrop.gifshow.v3.editor.decoration_v2.vm.DecorationViewModelV3<com.yxcrop.gifshow.v3.editor.decoration_v2.state.TextRootBaseState>");
       return viewModel;
    }
    public void N(EditDecorationBaseDrawer p0){
       Fragment uFragment;
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "2")) {
          return;
       }
       if (p0 != null) {
          if (p0.getCustomButtonMode() == BaseDrawerData$CustomButtonMode.TIME_PANEL) {
             this.J().show();
             uFragment = this.G();
             Objects.requireNonNull(uFragment, "null cannot be cast to non-null type com.yxcorp.gifshow.log.ILogPage");
             c.a.b(uFragment, "video");
          }else if(p0.getCustomButtonMode() == BaseDrawerData$CustomButtonMode.EDIT_TEXT){
             j.a.c(this.G(), this.I().getSelectDrawer());
             uFragment = this.G();
             Objects.requireNonNull(uFragment, "null cannot be cast to non-null type com.yxcorp.gifshow.log.ILogPage");
             c.a.b(uFragment, "photo");
          }
       }
       return;
    }
    public void x(a p0,a p1){
       boolean b;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "1")) {
       }else {
          a.p(p0, "newState");
          a.p(p1, "lastState");
          if (!p0.y().f() && !p0.D()) {
             o oo = this.E().x();
             a.o(oo, "editorDelegate.editorContext");
             if (!oo.b().d() && (!p0.s() && !p0.E().d())) {
                b = true;
             label_0054 :
                if (this.I().P() != b) {
                   if (!p0.y().f() && p1.y().f()) {
                      this.I().setShowCustomButton(b);
                      this.I().post(new b(this, b));
                   }else {
                      this.I().U0(b);
                   }
                }
             }
          }
          b = false;
          goto label_0054 ;
       }
       return;
    }
}
