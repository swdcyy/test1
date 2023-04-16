package com.yxcorp.gifshow.imagecrop.ImageCropActivity$b;
import f79.c$a;
import java.lang.Object;
import android.graphics.RectF;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.albinmathew.photocrop.cropoverlay.edge.Edge;

public final class ImageCropActivity$b implements c$a	// class@00194d
{
    public final RectF a;

    public void ImageCropActivity$b(){
       super();
       this.a = new RectF();
    }
    public RectF a(){
       Object obj = PatchProxy.apply(null, this, ImageCropActivity$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.a.left = Edge.LEFT.getCoordinate();
       this.a.right = Edge.RIGHT.getCoordinate();
       this.a.top = Edge.TOP.getCoordinate();
       this.a.bottom = Edge.BOTTOM.getCoordinate();
       return this.a;
    }
}
