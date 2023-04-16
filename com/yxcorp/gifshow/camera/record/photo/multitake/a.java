package com.yxcorp.gifshow.camera.record.photo.multitake.a;
import java.lang.Runnable;
import com.yxcorp.gifshow.camera.record.photo.multitake.MultiPicPreviewFragmentViewBinder$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import com.yxcorp.gifshow.album.viewbinder.AbsPreviewFragmentViewBinder;

public final class a implements Runnable	// class@000ef1
{
    public final MultiPicPreviewFragmentViewBinder$b b;

    public void a(MultiPicPreviewFragmentViewBinder$b p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       View view = this.b.b.o();
       if (view != null) {
          view.setAlpha(0x3f800000);
       }
       view = this.b.b.o();
       if (view != null) {
          view.setVisibility(0);
       }
       return;
    }
}
