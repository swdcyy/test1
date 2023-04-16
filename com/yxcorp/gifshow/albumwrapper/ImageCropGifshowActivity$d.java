package com.yxcorp.gifshow.albumwrapper.ImageCropGifshowActivity$d;
import kxa.c$a;
import java.lang.Object;
import android.graphics.RectF;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.albinmathew.photocrop.cropoverlay.edge.Edge;

public final class ImageCropGifshowActivity$d implements c$a	// class@001b4c
{
    public final RectF a;

    public void ImageCropGifshowActivity$d(){
       super();
       this.a = new RectF();
    }
    public RectF a(){
       Object obj = PatchProxy.apply(null, this, ImageCropGifshowActivity$d.class, "1");
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
