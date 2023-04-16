package com.yxcorp.gifshow.v3.previewer.PhotosEditPreviewV3Fragment$b;
import androidx.lifecycle.ViewModelProvider$Factory;
import com.yxcorp.gifshow.v3.previewer.PhotosEditPreviewV3Fragment;
import java.lang.Object;
import java.lang.Class;
import androidx.lifecycle.ViewModel;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import uwc.c;
import t36.f;
import ooc.j0;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import voc.o;
import java.util.Map;
import com.yxcorp.gifshow.v3.previewer.EditorBasePreviewFragment;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import rwc.j;

public class PhotosEditPreviewV3Fragment$b implements ViewModelProvider$Factory	// class@00157d
{
    public final PhotosEditPreviewV3Fragment a;

    public void PhotosEditPreviewV3Fragment$b(PhotosEditPreviewV3Fragment p0){
       this.a = p0;
       super();
    }
    public ViewModel create(Class p0){
       p0 = PatchProxy.applyOneRefs(p0, this, PhotosEditPreviewV3Fragment$b.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       PhotosEditPreviewV3Fragment$b ta = this.a;
       c uoc = new c(this.a.t1.o0(), ta.Y, ta.N, ta.X0, ta, ta.t1, ta.W, ta.y1);
       return p0;
    }
}
