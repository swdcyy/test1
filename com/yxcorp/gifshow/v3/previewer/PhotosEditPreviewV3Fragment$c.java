package com.yxcorp.gifshow.v3.previewer.PhotosEditPreviewV3Fragment$c;
import t36.f$a;
import com.yxcorp.gifshow.v3.previewer.PhotosEditPreviewV3Fragment;
import java.lang.Object;
import ooc.r0;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class PhotosEditPreviewV3Fragment$c implements f$a	// class@00157e
{
    public final boolean a;
    public final PhotosEditPreviewV3Fragment b;

    public void PhotosEditPreviewV3Fragment$c(PhotosEditPreviewV3Fragment p0,boolean p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void apply(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PhotosEditPreviewV3Fragment$c.class, "1")) {
       }else {
          p0.e(this.a);
       }
       return;
    }
}
