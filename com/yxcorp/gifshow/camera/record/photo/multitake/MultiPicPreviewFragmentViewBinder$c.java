package com.yxcorp.gifshow.camera.record.photo.multitake.MultiPicPreviewFragmentViewBinder$c;
import erd.g;
import com.yxcorp.gifshow.camera.record.photo.multitake.MultiPicPreviewFragmentViewBinder;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import com.yxcorp.gifshow.album.viewbinder.AbsPreviewFragmentViewBinder;

public final class MultiPicPreviewFragmentViewBinder$c implements g	// class@000ec0
{
    public final MultiPicPreviewFragmentViewBinder b;

    public void MultiPicPreviewFragmentViewBinder$c(MultiPicPreviewFragmentViewBinder p0){
       this.b = p0;
       super();
    }
    public final void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MultiPicPreviewFragmentViewBinder$c.class, "1")) {
          return;
       }
       p0 = this.b.o();
       if (p0 != null) {
          p0.setVisibility(4);
       }
       return;
    }
}
