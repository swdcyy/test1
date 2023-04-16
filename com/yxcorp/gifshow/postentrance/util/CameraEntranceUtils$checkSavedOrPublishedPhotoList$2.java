package com.yxcorp.gifshow.postentrance.util.CameraEntranceUtils$checkSavedOrPublishedPhotoList$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.sdk.switchconfig.a;
import com.yxcorp.gifshow.postentrance.util.CameraEntranceUtils$checkSavedOrPublishedPhotoList$2$a;
import java.lang.reflect.Type;
import el.a;

public final class CameraEntranceUtils$checkSavedOrPublishedPhotoList$2 extends Lambda implements a	// class@001076
{
    public static final CameraEntranceUtils$checkSavedOrPublishedPhotoList$2 INSTANCE;

    static {
       CameraEntranceUtils$checkSavedOrPublishedPhotoList$2.INSTANCE = new CameraEntranceUtils$checkSavedOrPublishedPhotoList$2();
    }
    public void CameraEntranceUtils$checkSavedOrPublishedPhotoList$2(){
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final ArrayList invoke(){
       Object obj = PatchProxy.apply(null, this, CameraEntranceUtils$checkSavedOrPublishedPhotoList$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a.t().getValue("isCheckSavedOrPublishedPhoto", new CameraEntranceUtils$checkSavedOrPublishedPhotoList$2$a().getType(), new ArrayList());
    }
}
