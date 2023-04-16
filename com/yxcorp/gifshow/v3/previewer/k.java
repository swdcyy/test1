package com.yxcorp.gifshow.v3.previewer.k;
import erd.g;
import com.yxcorp.gifshow.v3.previewer.PhotosEditPreviewV3Fragment;
import java.lang.Object;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import java.util.Objects;
import faa.a;
import java.lang.String;
import q87.c;
import t36.f;
import ooc.j0;
import lwc.k;
import t36.f$a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.v3.editor.BaseEditorFragment;
import com.yxcorp.gifshow.v3.previewer.z;
import rwc.j;
import com.yxcorp.gifshow.v3.EditorManager;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import com.kuaishou.edit.draft.Workspace$Type;
import com.kuaishou.edit.draft.Workspace$Source;
import com.kuaishou.edit.draft.Workspace$From;
import lwc.z0;
import com.yxcorp.gifshow.v3.customizer.viewbinder.AbsPhotoFragmentV3ViewBinder;
import uv8.o;
import android.content.Context;
import android.view.View;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import com.yxcorp.gifshow.v3.EditorManager$b;
import com.yxcorp.gifshow.v3.customizer.viewbinder.BaseEditPreviewFragmentViewBinder;
import com.yxcorp.gifshow.v3.previewer.d;
import com.yxcorp.gifshow.v3.previewer.e;
import java.util.List;
import com.yxcorp.gifshow.v3.previewer.player.viewmodel.PicturesViewModel;
import wba.z;
import java.lang.Boolean;
import androidx.lifecycle.MutableLiveData;
import com.kwai.robust.PatchProxyResult;
import crd.b;
import lwc.d0;
import erd.r;
import brd.t;
import java.util.concurrent.TimeUnit;
import t45.d;
import brd.z;
import com.yxcorp.gifshow.v3.previewer.j;
import lwc.r;
import crd.a;

public final class k implements g	// class@0015a6
{
    public final PhotosEditPreviewV3Fragment b;

    public void k(PhotosEditPreviewV3Fragment p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       k b = this.b;
       c uoc = p0;
       Objects.requireNonNull(b);
       Object[] objArray = new Object[0];
       a.D().w("PhotosEditPreviewV3Fragment", "load: start init", objArray);
       b.t1.o0().s0(new k(b));
       objArray = null;
       if (PatchProxy.applyVoid(objArray, b, PhotosEditPreviewV3Fragment.class, "23")) {
       }else if(b.B == null){
          z oz = new z(b);
          b.y1.setValue(oz);
          EditorManager uEditorManag = new EditorManager(b.getActivity(), b.q, b.Gh(), b.Y.T0(), b.Y.B0(), oz, b.J, new z0(b), b.Ih(), b.t1.p0());
          b.B = v3;
          Object[] objArray2 = new Object[0];
          a.D().w("PhotosEditPreviewV3Fragment", "initEditorManager: finish", objArray2);
       }
       b.f1.s0(d.a);
       b.U0.s0(e.a);
       if (PatchProxy.applyVoid(objArray, b, PhotosEditPreviewV3Fragment.class, "56") || (b.Ih().i0() != null && b.Ih().e0() != null)) {
          PhotosEditPreviewV3Fragment v0 = b.V0;
          if (v0 != Workspace$Type.ATLAS && (v0 == Workspace$Type.LONG_PICTURE || v0 == Workspace$Type.SINGLE_PICTURE)) {
             float f = 0x3f800000;
             b.Ih().e0().setAlpha(f);
             b.Ih().i0().setAlpha(f);
          }
       }
       b.K = objArray;
       b.Ah();
       z.C(uoc, b.p1.w0());
       b.h1.setValue(Boolean.TRUE);
       PhotosEditPreviewV3Fragment q = b.Q;
       b uob = PatchProxy.apply(objArray, b, PhotosEditPreviewV3Fragment.class, "49");
       if (uob != PatchProxyResult.class) {
       }else {
          uob = b.F1.filter(new d0(b)).throttleLast(1000, TimeUnit.MILLISECONDS).observeOn(d.a).subscribe(new j(b), new r(b));
       }
       q.c(uob);
       Object[] objArray1 = new Object[0];
       a.D().w("PhotosEditPreviewV3Fragment", "load: end init", objArray1);
       return;
    }
}
