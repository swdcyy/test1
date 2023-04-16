package com.yxcorp.gifshow.detail.presenter.landscape.helper.LandscapePhotoShareStateHelper;
import com.yxcorp.gifshow.detail.presenter.landscape.helper.LandscapePhotoShareStateHelper$mLandscapePhotoShareStates$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Object;
import java.util.concurrent.ConcurrentHashMap;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.entity.QPhoto;
import f5a.b;
import kotlin.jvm.internal.a;

public final class LandscapePhotoShareStateHelper	// class@0016f0
{
    public static final p a;
    public static final LandscapePhotoShareStateHelper b;

    static {
       LandscapePhotoShareStateHelper.b = new LandscapePhotoShareStateHelper();
       LandscapePhotoShareStateHelper.a = s.c(LandscapePhotoShareStateHelper$mLandscapePhotoShareStates$2.INSTANCE);
    }
    public void LandscapePhotoShareStateHelper(){
       super();
    }
    public final ConcurrentHashMap a(){
       Object obj = PatchProxy.apply(null, this, LandscapePhotoShareStateHelper.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LandscapePhotoShareStateHelper.a.getValue();
    }
    public final b b(QPhoto p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LandscapePhotoShareStateHelper.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "photo");
       return this.a().remove(p0.getPhotoId());
    }
}
