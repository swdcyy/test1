package com.yxcorp.gifshow.widget.EditorCropImageView$b;
import kxa.c$a;
import com.yxcorp.gifshow.widget.EditorCropImageView;
import java.lang.Object;
import android.graphics.RectF;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.image.KwaiZoomImageView;

public final class EditorCropImageView$b implements c$a	// class@001823
{
    public final EditorCropImageView a;

    public void EditorCropImageView$b(EditorCropImageView p0){
       this.a = p0;
       super();
    }
    public final RectF a(){
       Object obj = PatchProxy.apply(null, this, EditorCropImageView$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.c.getDisplayRect();
    }
}
