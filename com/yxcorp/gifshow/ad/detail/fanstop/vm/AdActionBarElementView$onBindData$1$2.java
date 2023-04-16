package com.yxcorp.gifshow.ad.detail.fanstop.vm.AdActionBarElementView$onBindData$1$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import zy8.g;
import java.lang.Object;
import java.util.Map;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.HashMap;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.ads.PhotoAdvertisement$ActionbarInfo;
import tw.j;
import java.lang.Integer;

public final class AdActionBarElementView$onBindData$1$2 extends Lambda implements a	// class@00154e
{
    public final g $it;

    public void AdActionBarElementView$onBindData$1$2(g p0){
       this.$it = p0;
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final Map invoke(){
       int i1;
       HashMap obj = PatchProxy.apply(null, this, AdActionBarElementView$onBindData$1$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       PhotoAdvertisement$ActionbarInfo uActionbarIn = j.i(this.$it.a());
       obj.put("photo_id", this.$it.a().getPhotoId());
       PhotoAdvertisement$ActionbarInfo uActionbarIn1 = null;
       int i = (uActionbarIn != null)? (int)uActionbarIn.mColorDelayTime: 0;
       obj.put("realShowDelayTime", Integer.valueOf(i));
       PhotoAdvertisement$ActionbarInfo mActionBarLo = (uActionbarIn != null)? uActionbarIn.mActionBarLoadTime: 0;
       obj.put("actionBarLoadTime", Integer.valueOf(mActionBarLo));
       mActionBarLo = (uActionbarIn != null)? uActionbarIn.mDownloadedBarLoadTime: 0;
       obj.put("downloadedActionBarLoadTime", Integer.valueOf(mActionBarLo));
       if (uActionbarIn != null) {
          mActionBarLo = uActionbarIn.mActionbarTag;
          if (mActionBarLo != null) {
          label_0066 :
             obj.put("actionBarTag", mActionBarLo);
             if (uActionbarIn != null) {
                uActionbarIn1 = uActionbarIn.mActionBarLocation;
             }
             obj.put("actionBarLocation", Integer.valueOf(uActionbarIn1));
             return obj;
          }
       }
       String str = "";
       goto label_0066 ;
    }
}
