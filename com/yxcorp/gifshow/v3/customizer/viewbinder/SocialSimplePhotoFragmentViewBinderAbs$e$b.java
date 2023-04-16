package com.yxcorp.gifshow.v3.customizer.viewbinder.SocialSimplePhotoFragmentViewBinderAbs$e$b;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.util.PostUtils;

public final class SocialSimplePhotoFragmentViewBinderAbs$e$b implements g	// class@000d7a
{
    public static final SocialSimplePhotoFragmentViewBinderAbs$e$b b;

    static {
       SocialSimplePhotoFragmentViewBinderAbs$e$b.b = new SocialSimplePhotoFragmentViewBinderAbs$e$b();
    }
    public void SocialSimplePhotoFragmentViewBinderAbs$e$b(){
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SocialSimplePhotoFragmentViewBinderAbs$e$b.class, "1")) {
       }else {
          PostUtils.D("SocialSimplePhotoFragmentViewBinderAbs", "saveToAlbum", p0);
       }
       return;
    }
}
