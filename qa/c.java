package qa.c;
import erd.o;
import java.lang.Object;
import com.yxcorp.gifshow.ad.response.InstreamAdResponse;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.ad.response.InstreamAdResponse$EApiData;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import com.yxcorp.gifshow.entity.QPhoto;
import ox8.e;
import s49.b;
import nsd.u;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import com.kuaishou.android.model.feed.k;

public final class c implements o	// class@0029b7
{
    public static final c b;

    static {
       c.b = new c();
    }
    public void c(){
       super();
    }
    public Object apply(Object p0){
       e uoe;
       Object obj = p0;
       a.p(obj, "it");
       p0 = obj.a();
       if (p0 != null) {
          p0 = p0.getMFeeds();
          if (p0 != null) {
             p0 = CollectionsKt___CollectionsKt.p2(p0);
          label_001c :
             QPhoto qPhoto = p0;
             if (qPhoto == null) {
                uoe = new e(false, null, -2, null, obj, null, obj.b(), 42, null);
             }else if(k.B(qPhoto) == null){
                uoe = new e(false, null, -3, null, obj, null, obj.b(), 42, null);
             }else {
                qPhoto.setListLoadSequenceID(obj.c());
                uoe = new e(true, qPhoto, 0, null, obj, null, 0, 108, null);
             }
             return p0;
          }
       }
       p0 = null;
       goto label_001c ;
    }
}
