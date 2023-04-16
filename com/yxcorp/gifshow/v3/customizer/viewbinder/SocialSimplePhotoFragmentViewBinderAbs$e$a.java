package com.yxcorp.gifshow.v3.customizer.viewbinder.SocialSimplePhotoFragmentViewBinderAbs$e$a;
import erd.g;
import com.yxcorp.gifshow.v3.customizer.viewbinder.SocialSimplePhotoFragmentViewBinderAbs$e;
import java.lang.Object;
import zq8.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import faa.a;
import q87.c;
import com.yxcorp.gifshow.v3.customizer.viewbinder.SocialSimplePhotoFragmentViewBinderAbs;

public final class SocialSimplePhotoFragmentViewBinderAbs$e$a implements g	// class@000d79
{
    public final SocialSimplePhotoFragmentViewBinderAbs$e b;

    public void SocialSimplePhotoFragmentViewBinderAbs$e$a(SocialSimplePhotoFragmentViewBinderAbs$e p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       Object[] objArray;
       if (PatchProxy.applyVoidOneRefs(p0, this, SocialSimplePhotoFragmentViewBinderAbs$e$a.class, "1")) {
       }else {
          String str = "SocialSimplePhotoFragmentViewBinderAbs";
          int i = 0;
          if ((p0.a).equals("permissionString")) {
             objArray = new Object[i];
             a.D().w(str, "saveToAlbum no", objArray);
          }else if((p0.a).equals("android.permission.WRITE_EXTERNAL_STORAGE")){
             if (p0.b != null) {
                SocialSimplePhotoFragmentViewBinderAbs.I0(this.b.c, i, i, 3, null);
             }else {
                objArray = new Object[i];
                a.D().w(str, "saveToAlbum no granted", objArray);
             }
          }
       }
       return;
    }
}
