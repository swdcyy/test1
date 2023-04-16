package com.yxcorp.gifshow.postentrance.presenter.KsBottomBarCameraPresenterV2$c;
import ezb.f;
import com.yxcorp.gifshow.postentrance.presenter.KsBottomBarCameraPresenterV2;
import android.view.View;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import kotlin.jvm.internal.a;

public final class KsBottomBarCameraPresenterV2$c extends f	// class@001053
{
    public final KsBottomBarCameraPresenterV2 c;

    public void KsBottomBarCameraPresenterV2$c(KsBottomBarCameraPresenterV2 p0,int p1){
       this.c = p0;
       super(p1);
    }
    public View c(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       KsBottomBarCameraPresenterV2$c obj = PatchProxy.apply(objArray, this, KsBottomBarCameraPresenterV2$c.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.c;
       Objects.requireNonNull(obj);
       KsBottomBarCameraPresenterV2 ksBottomBarC = PatchProxy.apply(objArray, obj, KsBottomBarCameraPresenterV2.class, "7");
       if (ksBottomBarC != patchProxyRe) {
       }else {
          ksBottomBarC = obj.y;
          if (ksBottomBarC == null) {
             a.S("cameraDefaultButtonContainer");
          }
       }
       return ksBottomBarC;
    }
    public String d(){
       return "NasaDefault";
    }
    public boolean e(View p0){
       return false;
    }
}
