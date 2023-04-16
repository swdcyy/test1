package com.yxcorp.gifshow.ad.fill.AdNotShownCache$save$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import com.kuaishou.android.model.feed.k;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdGroup;

public final class AdNotShownCache$save$1 extends Lambda implements l	// class@001771
{
    public static final AdNotShownCache$save$1 INSTANCE;

    static {
       AdNotShownCache$save$1.INSTANCE = new AdNotShownCache$save$1();
    }
    public void AdNotShownCache$save$1(){
       super(1);
    }
    public Object invoke(Object p0){
       return Boolean.valueOf(this.invoke(p0));
    }
    public final boolean invoke(QPhoto p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, AdNotShownCache$save$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "it");
       PhotoAdvertisement photoAdverti = k.B(p0);
       int i = 0;
       if (photoAdverti != null && (photoAdverti.mCreativeId > 0 && photoAdverti.mShowAdItemReported == null)) {
          PhotoAdvertisement$AdGroup[] uAdGroupArra = new PhotoAdvertisement$AdGroup[]{PhotoAdvertisement$AdGroup.DSP};
          if (photoAdverti.isAdGroup(uAdGroupArra)) {
             i = true;
          }
       }
       return i;
    }
}
