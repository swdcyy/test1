package b06.d$c;
import tca.h;
import java.lang.Object;
import java.lang.String;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import com.kuaishou.android.model.feed.k;
import java.lang.Long;
import java.lang.System;
import l66.c;
import dda.b;
import com.kwai.framework.model.feed.BaseFeed;
import m66.a;

public class d$c implements h	// class@0003e1
{

    public void d$c(){
       super();
    }
    public String a(){
       return "expired_ad";
    }
    public boolean accept(Object p0){
       boolean b;
       PhotoAdvertisement obj = PatchProxy.applyOneRefs(p0, this, d$c.class, "1");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          obj = k.B(p0);
          if (obj != null) {
             PhotoAdvertisement mExpireTimes = obj.mExpireTimestamp;
             if (mExpireTimes != null && (mExpireTimes.longValue() > 0 && obj.mExpireTimestamp.longValue() - System.currentTimeMillis() <= 0)) {
                obj = 1;
             label_003a :
                if (obj) {
                   c.a().b(new b(p0.mEntity, 7));
                }
                b = obj;
             }
          }
          obj = 0;
          goto label_003a ;
       }
       return b;
    }
}
