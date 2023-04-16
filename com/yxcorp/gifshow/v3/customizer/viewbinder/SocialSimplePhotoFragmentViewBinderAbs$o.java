package com.yxcorp.gifshow.v3.customizer.viewbinder.SocialSimplePhotoFragmentViewBinderAbs$o;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.util.PostUtils;

public final class SocialSimplePhotoFragmentViewBinderAbs$o implements g	// class@000d85
{
    public static final SocialSimplePhotoFragmentViewBinderAbs$o b;

    static {
       SocialSimplePhotoFragmentViewBinderAbs$o.b = new SocialSimplePhotoFragmentViewBinderAbs$o();
    }
    public void SocialSimplePhotoFragmentViewBinderAbs$o(){
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SocialSimplePhotoFragmentViewBinderAbs$o.class, "1")) {
       }else {
          PostUtils.D("SocialSimplePhotoFragmentViewBinderAbs", "saveToAlbum", p0);
       }
       return;
    }
}
