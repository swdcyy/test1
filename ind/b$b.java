package ind.b$b;
import xsc.c;
import ind.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import xsc.b;
import java.lang.Integer;
import java.util.ArrayList;
import kotlin.jvm.internal.a;
import uv8.o$b;
import com.yxcorp.utility.Log;
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
import und.l;
import com.yxcorp.gifshow.v3.framework.post.EditDraftAction;
import nsd.u;
import xvc.b;
import com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel;

public final class b$b implements c	// class@00102d
{
    public final b a;

    public void b$b(b p0){
       this.a = p0;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, b$b.class, "6")) {
          return;
       }
       b.d(this);
       this.f();
       return;
    }
    public void b(int p0,int p1){
       b$b uob = b$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uob, "4")) {
          return;
       }
       b.e(this, p0, p1);
       this.f();
       return;
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, b$b.class, "5")) {
          return;
       }
       b.f(this);
       this.f();
       return;
    }
    public void d(int p0,int p1,ArrayList p2){
       if (PatchProxy.isSupport(b$b.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, this, b$b.class, "2")) {
          return;
       }
       a.p(p2, "originAssetIndexList");
       b.a(this, p0, p1, p2);
       this.f();
       return;
    }
    public void e(int p0,int p1,String p2){
       if (PatchProxy.isSupport(b$b.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, this, b$b.class, "3")) {
          return;
       }
       a.p(p2, "deletedAssetIdentifier");
       b.c(this, p0, p1, p2);
       this.f();
       return;
    }
    public final void f(){
       b$b uob = b$b.class;
       if (PatchProxy.applyVoid(null, this, uob, "7")) {
          return;
       }
       if (!PatchProxy.applyVoid(null, this, uob, "8")) {
          o$b d = this.a.d;
          if (d != null) {
             Log.b("TextEditorV2Factory", "updatePictureEditorInfo");
             ViewModel viewModel = ViewModelProviders.of(d).get(b.class);
             a.o(viewModel, "ViewModelProviders.of\(fr¡­resViewModel::class.java\)");
             h oh = f.l(d);
             List list = viewModel.r0();
             oh.O0(this.a.a, oh.G0().a1(), list, viewModel.w0());
          }
       }
       ViewModelProviders.of(this.a.d).get(l.class).t0(new EditDraftAction(false, 1, null));
       return;
    }
    public void onAttach(){
       if (PatchProxy.applyVoid(null, this, b$b.class, "1")) {
          return;
       }
       b.b(this);
       return;
    }
}
