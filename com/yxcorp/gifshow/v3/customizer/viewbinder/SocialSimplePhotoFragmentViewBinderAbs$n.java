package com.yxcorp.gifshow.v3.customizer.viewbinder.SocialSimplePhotoFragmentViewBinderAbs$n;
import erd.g;
import com.yxcorp.gifshow.v3.customizer.viewbinder.SocialSimplePhotoFragmentViewBinderAbs;
import java.lang.Object;
import kotlin.Pair;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import faa.a;
import java.lang.StringBuilder;
import java.io.File;
import q87.c;

public final class SocialSimplePhotoFragmentViewBinderAbs$n implements g	// class@000d84
{
    public final SocialSimplePhotoFragmentViewBinderAbs b;

    public void SocialSimplePhotoFragmentViewBinderAbs$n(SocialSimplePhotoFragmentViewBinderAbs p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SocialSimplePhotoFragmentViewBinderAbs$n.class, "1")) {
       }else {
          this.b.U = false;
          Object[] objArray = new Object[false];
          a.D().w("SocialSimplePhotoFragmentViewBinderAbs", "saveToAlbum finish originFile:"+p0.getFirst()+", cameraFile:"+p0.getSecond(), objArray);
       }
       return;
    }
}
