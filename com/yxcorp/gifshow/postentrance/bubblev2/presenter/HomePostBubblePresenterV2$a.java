package com.yxcorp.gifshow.postentrance.bubblev2.presenter.HomePostBubblePresenterV2$a;
import ezb.f;
import com.yxcorp.gifshow.postentrance.bubblev2.presenter.HomePostBubblePresenterV2;
import ezb.l;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.gifshow.post.api.feature.postentrance.bubble.HomePostBubbleManager;
import an6.o;
import an6.e;
import com.kwai.gifshow.post.api.feature.camera.model.CameraIconInfo;
import com.kuaishou.android.model.mix.PostShowInfo;
import vzb.a;
import nsd.u;
import android.view.View;
import java.util.Objects;
import com.yxcorp.gifshow.postentrance.CameraViewSwitcher;
import kotlin.jvm.internal.a;

public final class HomePostBubblePresenterV2$a extends f	// class@00101a
{
    public String c;
    public final HomePostBubblePresenterV2 d;

    public void HomePostBubblePresenterV2$a(HomePostBubblePresenterV2 p0){
       this.d = p0;
       super(3);
    }
    public l b(){
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, HomePostBubblePresenterV2$a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       HomePostBubblePresenterV2$a tc = this.c;
       o oo = this.d.S8().g();
       if (oo != null) {
          objArray = oo.g();
       }
       l ol = new l(null, null, null, tc, objArray, null, 32, null);
       return obj;
    }
    public View c(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       HomePostBubblePresenterV2$a obj = PatchProxy.apply(objArray, this, HomePostBubblePresenterV2$a.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.d;
       Objects.requireNonNull(obj);
       HomePostBubblePresenterV2 homePostBubb = PatchProxy.apply(objArray, obj, HomePostBubblePresenterV2.class, "2");
       if (homePostBubb != patchProxyRe) {
       }else {
          homePostBubb = obj.w;
          if (homePostBubb == null) {
             a.S("cameraViewSwitcher");
          }
       }
       return homePostBubb.d().c();
    }
    public String d(){
       return "CameraBubbleItem";
    }
}
