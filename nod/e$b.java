package nod.e$b;
import xsc.c;
import nod.e;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import xsc.b;
import faa.a;
import q87.c;
import java.lang.Integer;
import java.util.ArrayList;
import kotlin.jvm.internal.a;
import uv8.o$b;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import uwc.b;
import androidx.lifecycle.ViewModel;
import lwc.h;
import com.yxcorp.gifshow.v3.f;
import java.util.List;
import com.yxcorp.gifshow.v3.previewer.player.viewmodel.PicturesViewModel;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import com.kuaishou.edit.draft.Workspace$Type;
import android.app.Activity;
import yod.k;
import com.yxcorp.gifshow.v3.framework.post.EditDraftAction;
import nsd.u;
import xvc.b;
import com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel;

public final class e$b implements c	// class@001ea4
{
    public final e a;

    public void e$b(e p0){
       this.a = p0;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, e$b.class, "5")) {
          return;
       }
       b.d(this);
       Object[] objArray = new Object[0];
       a.D().w("TextEditorV3Factory", "onDiscard", objArray);
       this.f();
       return;
    }
    public void b(int p0,int p1){
       e$b uob = e$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uob, "3")) {
          return;
       }
       b.e(this, p0, p1);
       Object[] objArray = new Object[0];
       a.D().w("TextEditorV3Factory", "onMoveAssetSegment", objArray);
       this.f();
       return;
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, e$b.class, "4")) {
          return;
       }
       b.f(this);
       Object[] objArray = new Object[0];
       a.D().w("TextEditorV3Factory", "onSave", objArray);
       this.f();
       return;
    }
    public void d(int p0,int p1,ArrayList p2){
       if (PatchProxy.isSupport(e$b.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, this, e$b.class, "1")) {
          return;
       }
       a.p(p2, "originAssetIndexList");
       b.a(this, p0, p1, p2);
       Object[] objArray = new Object[0];
       a.D().w("TextEditorV3Factory", "onAddAssetSegmentList", objArray);
       this.f();
       return;
    }
    public void e(int p0,int p1,String p2){
       if (PatchProxy.isSupport(e$b.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, this, e$b.class, "2")) {
          return;
       }
       a.p(p2, "deletedAssetIdentifier");
       b.c(this, p0, p1, p2);
       Object[] objArray = new Object[0];
       a.D().w("TextEditorV3Factory", "onDeleteAssetSegmentList", objArray);
       this.f();
       return;
    }
    public final void f(){
       e$b uob = e$b.class;
       if (PatchProxy.applyVoid(null, this, uob, "6")) {
          return;
       }
       Object[] objArray = new Object[0];
       String str = "TextEditorV3Factory";
       a.D().w(str, "updateContainerView", objArray);
       if (!PatchProxy.applyVoid(null, this, uob, "7")) {
          Object[] objArray1 = new Object[0];
          a.D().w(str, "updatePictureEditorInfo", objArray1);
          o$b d = this.a.d;
          if (d != null) {
             ViewModel viewModel = ViewModelProviders.of(d).get(b.class);
             a.o(viewModel, "ViewModelProviders.of\(fr¡­resViewModel::class.java\)");
             h oh = f.l(d);
             List list = viewModel.r0();
             oh.O0(this.a.a, oh.G0().a1(), list, viewModel.w0());
          }
       }
       ViewModelProviders.of(this.a.d).get(k.class).t0(new EditDraftAction(0, 1, null));
       return;
    }
    public void onAttach(){
       b.b(this);
    }
}
