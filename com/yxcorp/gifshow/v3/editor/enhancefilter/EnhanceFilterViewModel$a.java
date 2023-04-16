package com.yxcorp.gifshow.v3.editor.enhancefilter.EnhanceFilterViewModel$a;
import nwc.k;
import com.yxcorp.gifshow.v3.editor.enhancefilter.EnhanceFilterViewModel;
import java.lang.Object;
import com.yxcorp.gifshow.util.MultiplePhotosWorkManager$CropPhotoWorkEvent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import nwc.j;

public final class EnhanceFilterViewModel$a implements k	// class@000f74
{
    public final EnhanceFilterViewModel a;

    public void EnhanceFilterViewModel$a(EnhanceFilterViewModel p0){
       this.a = p0;
       super();
    }
    public void a(MultiplePhotosWorkManager$CropPhotoWorkEvent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EnhanceFilterViewModel$a.class, "1")) {
          return;
       }
       j.b(this, p0);
       this.a.t0();
       return;
    }
    public void b(MultiplePhotosWorkManager$CropPhotoWorkEvent p0){
       j.a(this, p0);
    }
}
