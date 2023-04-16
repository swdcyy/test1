package com.yxcorp.gifshow.photoad.CommonCardType$TACHIKOMA;
import com.yxcorp.gifshow.photoad.CommonCardType;
import java.lang.String;
import nsd.u;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import com.kuaishou.android.model.feed.k;
import n49.s;

public final class CommonCardType$TACHIKOMA extends CommonCardType	// class@000f57
{

    public void CommonCardType$TACHIKOMA(String p0,int p1){
       super(p0, p1, null);
    }
    public boolean valid(QPhoto p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, CommonCardType$TACHIKOMA.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "qPhoto");
       return s.M(k.B(p0));
    }
}
