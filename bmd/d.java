package bmd.d;
import uv8.o$b;
import bmd.d$c;
import bmd.d$b;
import bmd.d$a;
import com.yxcorp.gifshow.v3.EditorActivity;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import t36.f;
import ooc.j0;
import com.yxcorp.gifshow.v3.editor.BaseEditor;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.v3.editor.j;
import bmd.b;
import com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel;
import uwc.a;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import com.kuaishou.edit.draft.Workspace$Type;
import com.yxcorp.gifshow.v3.f;
import java.util.Objects;
import com.yxcorp.gifshow.v3.previewer.VideoEditPreviewV3Fragment;
import com.yxcorp.gifshow.widget.adv.VideoSDKPlayerView;
import smd.e;
import lq.i;
import lq.a;
import xvc.f;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider$Factory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import smd.d;
import androidx.lifecycle.ViewModel;
import java.lang.Boolean;
import com.kuaishou.edit.draft.Workspace$Source;

public final class d extends o$b	// class@000281
{
    public final y f;
    public final d$b g;
    public final d$a h;

    public void d(){
       super();
       this.f = new d$c(this);
       this.g = new d$b(this);
       this.h = new d$a(this);
    }
    public void a(EditorActivity p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "2")) {
          return;
       }
       a.p(p0, "editorActivity");
       super.a(p0);
       this.b.o0().d(this.h);
       return;
    }
    public BaseEditor e(){
       b uob = PatchProxy.apply(null, this, d.class, "4");
       if (uob != PatchProxyResult.class) {
       }else {
          o$b ta = this.a;
          a.o(ta, "mEditorActivity");
          uob = new b(ta);
       }
       return uob;
    }
    public void f(){
       if (PatchProxy.applyVoid(null, this, d.class, "3")) {
          return;
       }
       this.b.o0().c(this.h);
       super.f();
       return;
    }
    public final EditReduxViewModel h(){
       Object[] objArray = null;
       a obj = PatchProxy.apply(objArray, this, d.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.c();
       a.o(obj, "currentPreviewViewModel");
       c uoc = obj.w0();
       a.o(uoc, "currentPreviewViewModel.workspaceDraft");
       boolean b = f.E(uoc.a1());
       if (!b) {
          o$b td = this.d;
          Objects.requireNonNull(td, "null cannot be cast to non-null type com.yxcorp.gifshow.v3.previewer.VideoEditPreviewV3Fragment");
          objArray = td.Rh();
       }
       a uoa = i.m().p();
       a.o(uoa, "PostSession.current\(\).editSession\(\)");
       f uof = uoa.f();
       a.o(uof, "PostSession.current\(\).editSession\(\).editRepo");
       ViewModel viewModel = ViewModelProviders.of(this.d, new e(b, uof, objArray)).get(d.class);
       a.o(viewModel, "ViewModelProviders.of\(\n ¡­rViewModelV2::class.java\)");
       return viewModel;
    }
    public final boolean i(){
       boolean b;
       a obj = PatchProxy.apply(null, this, d.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.c();
       String str = "currentPreviewViewModel";
       a.o(obj, str);
       c uoc = obj.w0();
       a.o(uoc, "currentPreviewViewModel.workspaceDraft");
       if (uoc.a1() == Workspace$Type.SINGLE_PICTURE) {
          obj = this.c();
          a.o(obj, str);
          uoc = obj.w0();
          a.o(uoc, "currentPreviewViewModel.workspaceDraft");
          if (uoc.T0() != Workspace$Source.REEDIT) {
             b = true;
          label_0047 :
             return b;
          }
       }
       b = false;
       goto label_0047 ;
    }
}
