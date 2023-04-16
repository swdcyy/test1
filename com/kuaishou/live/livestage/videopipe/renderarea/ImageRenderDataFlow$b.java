package com.kuaishou.live.livestage.videopipe.renderarea.ImageRenderDataFlow$b;
import erd.g;
import com.kuaishou.live.livestage.videopipe.renderarea.ImageRenderDataFlow;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import mrd.a;

public final class ImageRenderDataFlow$b implements g	// class@000c05
{
    public final ImageRenderDataFlow b;

    public void ImageRenderDataFlow$b(ImageRenderDataFlow p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ImageRenderDataFlow$b.class, "1")) {
       }else {
          this.b.a.onNext(p0);
       }
       return;
    }
}
