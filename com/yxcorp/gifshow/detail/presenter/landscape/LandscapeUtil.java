package com.yxcorp.gifshow.detail.presenter.landscape.LandscapeUtil;
import com.yxcorp.gifshow.detail.presenter.landscape.LandscapeUtil$isEnableNasaSlideLandscape$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.yxcorp.gifshow.detail.presenter.landscape.LandscapeUtil$isEnableNasaSlideLandscapeSlide$2;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import tl5.b;
import com.kwai.framework.model.feed.BaseFeed;
import uw9.o;
import java.lang.StringBuilder;
import android.os.Build$VERSION;
import kp.r1;
import com.kuaishou.android.model.mix.w;
import q87.c;
import com.kuaishou.android.model.mix.PhotoDisplayLocationInfo;

public final class LandscapeUtil	// class@0016eb
{
    public static final p a;
    public static final p b;

    static {
       LandscapeUtil.a = s.c(LandscapeUtil$isEnableNasaSlideLandscape$2.INSTANCE);
       LandscapeUtil.b = s.c(LandscapeUtil$isEnableNasaSlideLandscapeSlide$2.INSTANCE);
    }
    public static final boolean a(QPhoto p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LandscapeUtil.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (LandscapeUtil.d(p0) || b.e(p0))? true: false;
       return b;
    }
    public static final boolean b(){
       Object obj = PatchProxy.apply(null, null, LandscapeUtil.class, "4");
       if (obj == PatchProxyResult.class) {
          obj = LandscapeUtil.a.getValue();
       }
       return obj.booleanValue();
    }
    public static final boolean c(BaseFeed p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LandscapeUtil.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       int i = 0;
       if (p0 != null) {
          Object[] objArray = new Object[i];
          o.C().s("LandscapeEntrance", " build version > 19: "+Build$VERSION.SDK_INT+','+" is Video Feed: "+r1.D3(p0)+", enable fullscreen play: "+w.P(p0), objArray);
       }
       if (p0 != null && (r1.D3(p0) && w.P(p0))) {
          i = true;
       }
    label_0061 :
       return i;
    }
    public static final boolean d(QPhoto p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LandscapeUtil.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (p0 != null) {
          o oo = o.C();
          StringBuilder str = " qPhoto is Hdr "+p0.isHdr()+", "+"heightRation > 0 ";
          PhotoDisplayLocationInfo photoDisplay = p0.getPhotoDisplayLocationInfo();
          photoDisplay = (photoDisplay != null)? photoDisplay.mHeightRatio: 0;
          boolean b1 = (photoDisplay > 0)? true: false;
          Object[] objArray = new Object[0];
          oo.s("LandscapeEntrance", str+b1, objArray);
       }
       if (p0 != null && LandscapeUtil.c(p0.mEntity)) {
          if (p0.isHdr()) {
             PhotoDisplayLocationInfo photoDisplay1 = p0.getPhotoDisplayLocationInfo();
             photoDisplay1 = (photoDisplay1 != null)? photoDisplay1.mHeightRatio: 0;
             if (photoDisplay1 > 0) {
             label_0076 :
                b = false;
             }
          }
       }else {
          goto label_0076 ;
       }
       return b;
    }
}
