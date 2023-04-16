package com.yxcorp.gifshow.v3.previewer.j;
import erd.g;
import com.yxcorp.gifshow.v3.previewer.PhotosEditPreviewV3Fragment;
import java.lang.Object;
import com.yxcorp.gifshow.util.MultiplePhotosWorkManager$CropPhotoWorkEvent;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.edit.draft.Workspace$Type;
import com.yxcorp.gifshow.v3.f;
import com.yxcorp.gifshow.util.PostExperimentUtils;
import uwc.b;
import nwc.k;
import java.util.Map;
import t36.f;
import lwc.t0;
import t36.f$a;
import com.yxcorp.gifshow.util.rx.RxBus;
import voc.z;
import voc.i0;

public final class j implements g	// class@0015a4
{
    public final PhotosEditPreviewV3Fragment b;

    public void j(PhotosEditPreviewV3Fragment p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       RxBus f;
       j tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, PhotosEditPreviewV3Fragment.class, "51")) {
       }else if(p0.d() != tb.Gh()){
          if (f.E(tb.Gh()) && (tb.p1 != null && !PostExperimentUtils.p1())) {
             tb.p1.Z0(5);
          }
       label_003a :
          f.p0(tb.X0, k.class).s0(new t0(p0));
          if (tb.Gh() == Workspace$Type.ATLAS) {
             RxBus.f.b(new z(p0.c()));
          }else if(tb.Gh() == Workspace$Type.LONG_PICTURE){
             RxBus.f.b(new i0(p0.c()));
          }else {
             f = RxBus.f;
             f.b(new i0(p0.c()));
             f.b(new z(p0.c()));
          }
       }
       return;
    }
}
