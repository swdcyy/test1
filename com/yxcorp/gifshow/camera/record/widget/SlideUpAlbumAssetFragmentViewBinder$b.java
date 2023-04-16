package com.yxcorp.gifshow.camera.record.widget.SlideUpAlbumAssetFragmentViewBinder$b;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import com.yxcorp.gifshow.camera.record.widget.SlideUpAlbumAssetFragmentViewBinder;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewTreeObserver;
import android.widget.Button;

public final class SlideUpAlbumAssetFragmentViewBinder$b implements ViewTreeObserver$OnGlobalLayoutListener	// class@000fe1
{
    public final SlideUpAlbumAssetFragmentViewBinder b;

    public void SlideUpAlbumAssetFragmentViewBinder$b(SlideUpAlbumAssetFragmentViewBinder p0){
       this.b = p0;
       super();
    }
    public void onGlobalLayout(){
       if (PatchProxy.applyVoid(null, this, SlideUpAlbumAssetFragmentViewBinder$b.class, "1")) {
          return;
       }
       SlideUpAlbumAssetFragmentViewBinder k = this.b.k;
       if (k != null) {
          ViewTreeObserver viewTreeObse = k.getViewTreeObserver();
          if (viewTreeObse != null) {
             viewTreeObse.removeOnGlobalLayoutListener(this);
          }
          this.b.y();
       }
       return;
    }
}
