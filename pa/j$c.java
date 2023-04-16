package pa.j$c;
import erd.r;
import java.lang.Object;
import ox8.e;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.commercial.PhotoAdvertisementInterface;

public final class j$c implements r	// class@002900
{
    public static final j$c b;

    static {
       j$c.b = new j$c();
    }
    public void j$c(){
       super();
    }
    public boolean test(Object p0){
       boolean b;
       a.p(p0, "it");
       QPhoto qPhoto = p0.c();
       QPhoto qPhoto1 = null;
       PhotoAdvertisementInterface advertisemen = (qPhoto != null)? qPhoto.getAdvertisement(): qPhoto1;
       if (advertisemen != null) {
          p0 = p0.c();
          if (p0 != null) {
             qPhoto1 = p0.mEntity;
          }
          if (qPhoto1 != null) {
             b = true;
          label_0023 :
             return b;
          }
       }
       b = false;
       goto label_0023 ;
    }
}
