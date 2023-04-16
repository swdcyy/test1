package com.yxcorp.gifshow.v3.customizer.viewbinder.SocialSimplePhotoFragmentViewBinderAbs$a;
import java.lang.Object;
import nsd.u;
import android.app.Activity;
import com.yxcorp.gifshow.model.RectInfo;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import android.content.Intent;
import java.io.Serializable;
import ekd.j0;
import com.yxcorp.gifshow.model.EditorSplashImageInfo;
import faa.a;
import java.lang.StringBuilder;
import q87.c;

public final class SocialSimplePhotoFragmentViewBinderAbs$a	// class@000d75
{

    public void SocialSimplePhotoFragmentViewBinderAbs$a(){
       super();
    }
    public void SocialSimplePhotoFragmentViewBinderAbs$a(u p0){
       super();
    }
    public final RectInfo a(Activity p0){
       Object[] obj = PatchProxy.applyOneRefs(p0, this, SocialSimplePhotoFragmentViewBinderAbs$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "activity");
       EditorSplashImageInfo uEditorSplas = j0.e(p0.getIntent(), "INTENT_EDITOR_SPLASH_IMAGE_INFO");
       int i = 0;
       if (uEditorSplas == null || uEditorSplas.getEditorSplashType() != 5) {
          obj = new Object[i];
          a.D().w("SocialSimplePhotoFragmentViewBinderAbs", "onCreate no info", obj);
          return null;
       }else {
          obj = new Object[i];
          a.D().w("SocialSimplePhotoFragmentViewBinderAbs", "getSmallImageRectInfo smallRectInfo:"+uEditorSplas.getSmallRectInfo(), obj);
          return uEditorSplas.getSmallRectInfo();
       }
    }
}
