package com.yxcorp.gifshow.camera.record.photo.multitake.MultiPicPreviewFragmentViewBinder$b;
import androidx.lifecycle.Observer;
import com.yxcorp.gifshow.camera.record.photo.multitake.MultiPicPreviewFragmentViewBinder;
import java.lang.Object;
import java.lang.Float;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.camera.record.photo.multitake.a;
import java.lang.Runnable;
import ekd.k1;
import android.view.View;
import com.yxcorp.gifshow.album.viewbinder.AbsPreviewFragmentViewBinder;

public final class MultiPicPreviewFragmentViewBinder$b implements Observer	// class@000ebf
{
    public final MultiPicPreviewFragmentViewBinder b;

    public void MultiPicPreviewFragmentViewBinder$b(MultiPicPreviewFragmentViewBinder p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MultiPicPreviewFragmentViewBinder$b.class, "1")) {
       }else if(p0.floatValue() - 0x3f800000 >= 0){
          k1.r(new a(this), 250);
       }else {
          p0 = this.b.o();
          if (p0 != null) {
             p0.setAlpha(0);
          }
          p0 = this.b.o();
          if (p0 != null) {
             p0.setVisibility(4);
          }
       }
       return;
    }
}
