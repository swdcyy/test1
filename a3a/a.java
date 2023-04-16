package a3a.a;
import lnc.c2;
import java.lang.Object;
import com.yxcorp.gifshow.entity.QPhoto;
import a3a.c;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import com.kuaishou.android.model.feed.k;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdGroup;

public final class a implements c2	// class@000022
{
    public static final a a;

    static {
       a.a = new a();
    }
    public void a(){
       super();
    }
    public final boolean accept(Object p0){
       int i = 1;
       if (p0.isAd()) {
          if (k.B(p0) != null) {
             PhotoAdvertisement$AdGroup[] uAdGroupArra = new PhotoAdvertisement$AdGroup[i];
             uAdGroupArra[0] = PhotoAdvertisement$AdGroup.FANS_TOP;
             if (k.B(p0).isAdGroup(uAdGroupArra)) {
             label_0023 :
                i = false;
             }
          }
       }else {
          goto label_0023 ;
       }
       return i;
    }
}
