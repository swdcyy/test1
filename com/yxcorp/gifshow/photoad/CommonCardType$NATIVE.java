package com.yxcorp.gifshow.photoad.CommonCardType$NATIVE;
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
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdWebCardInfo;
import tw.j;

public final class CommonCardType$NATIVE extends CommonCardType	// class@000f56
{

    public void CommonCardType$NATIVE(String p0,int p1){
       super(p0, p1, null);
    }
    public boolean valid(QPhoto p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, CommonCardType$NATIVE.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "qPhoto");
       PhotoAdvertisement$AdWebCardInfo uAdWebCardIn = j.u(p0);
       boolean b = (uAdWebCardIn != null && uAdWebCardIn.mCardType == 12)? true: false;
       return b;
    }
}
