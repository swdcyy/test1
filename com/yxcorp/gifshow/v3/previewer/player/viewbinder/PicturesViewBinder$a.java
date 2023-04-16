package com.yxcorp.gifshow.v3.previewer.player.viewbinder.PicturesViewBinder$a;
import androidx.lifecycle.Observer;
import com.yxcorp.gifshow.v3.previewer.player.viewbinder.PicturesViewBinder;
import java.lang.Object;
import java.util.concurrent.atomic.AtomicBoolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.video.editorsdk2.PreviewPlayer;
import com.kwai.video.editorsdk2.PreviewTextureView;
import faa.a;
import java.lang.StringBuilder;
import q87.c;

public final class PicturesViewBinder$a implements Observer	// class@0015ec
{
    public final PicturesViewBinder b;

    public void PicturesViewBinder$a(PicturesViewBinder p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PicturesViewBinder$a.class, "1")) {
       }else if(p0.get()){
          PicturesViewBinder t = this.b.t;
          if (t != null) {
             t.setPreviewPlayer(null);
          }
       }
       Object[] objArray = new Object[0];
       a.D().w("PicturesViewBinder", "mDetachPlayer it:"+p0.get(), objArray);
       return;
    }
}
