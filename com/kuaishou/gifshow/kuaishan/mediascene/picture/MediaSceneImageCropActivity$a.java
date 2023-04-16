package com.kuaishou.gifshow.kuaishan.mediascene.picture.MediaSceneImageCropActivity$a;
import kxa.c$a;
import com.kuaishou.gifshow.kuaishan.mediascene.picture.MediaSceneImageCropActivity;
import java.lang.Object;
import android.graphics.RectF;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.albinmathew.photocrop.cropoverlay.edge.Edge;

public final class MediaSceneImageCropActivity$a implements c$a	// class@001a87
{
    public final RectF a;
    public final MediaSceneImageCropActivity b;

    public void MediaSceneImageCropActivity$a(MediaSceneImageCropActivity p0){
       this.b = p0;
       super();
       this.a = new RectF();
    }
    public RectF a(){
       Object obj = PatchProxy.apply(null, this, MediaSceneImageCropActivity$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.a.left = Edge.LEFT.getCoordinate() - (float)this.b.b1;
       this.a.right = Edge.RIGHT.getCoordinate() + (float)this.b.b1;
       this.a.top = Edge.TOP.getCoordinate();
       this.a.bottom = Edge.BOTTOM.getCoordinate();
       return this.a;
    }
}
