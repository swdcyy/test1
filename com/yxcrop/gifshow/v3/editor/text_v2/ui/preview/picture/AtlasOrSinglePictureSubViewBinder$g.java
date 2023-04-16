package com.yxcrop.gifshow.v3.editor.text_v2.ui.preview.picture.AtlasOrSinglePictureSubViewBinder$g;
import androidx.lifecycle.Observer;
import com.yxcrop.gifshow.v3.editor.text_v2.ui.preview.picture.AtlasOrSinglePictureSubViewBinder;
import java.lang.Object;
import java.util.concurrent.atomic.AtomicInteger;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;

public final class AtlasOrSinglePictureSubViewBinder$g implements Observer	// class@000b3d
{
    public final AtlasOrSinglePictureSubViewBinder b;

    public void AtlasOrSinglePictureSubViewBinder$g(AtlasOrSinglePictureSubViewBinder p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AtlasOrSinglePictureSubViewBinder$g.class, "1")) {
       }else {
          Log.b(this.b.H(), "position change: "+p0.get());
          this.b.N(p0.get());
       }
       return;
    }
}
