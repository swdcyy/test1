package com.yxcorp.gifshow.featured.feedprefetcher.allinone.NasaLaunchOptManager$mFeedRequestParams$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.util.Map;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.featured.feedprefetcher.allinone.NasaLaunchOptManager;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.featured.feedprefetcher.allinone.NasaLaunchOptIndexModel;
import pea.b;
import java.util.LinkedHashMap;
import java.lang.Integer;

public final class NasaLaunchOptManager$mFeedRequestParams$2 extends Lambda implements a	// class@000fa1
{
    public static final NasaLaunchOptManager$mFeedRequestParams$2 INSTANCE;

    static {
       NasaLaunchOptManager$mFeedRequestParams$2.INSTANCE = new NasaLaunchOptManager$mFeedRequestParams$2();
    }
    public void NasaLaunchOptManager$mFeedRequestParams$2(){
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final Map invoke(){
       String photoId;
       LinkedHashMap linkedHashMa;
       String photoId1;
       Object[] objArray = null;
       NasaLaunchOptManager obj = PatchProxy.apply(objArray, this, NasaLaunchOptManager$mFeedRequestParams$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = NasaLaunchOptManager.m;
       String str = "useCacheCount";
       if (obj.g()) {
          String str1 = NasaLaunchOptManager.a(obj);
          String str2 = "getFeedRequestParams photoId:";
          NasaLaunchOptIndexModel nasaLaunchOp = NasaLaunchOptManager.d();
          photoId = (nasaLaunchOp != null)? nasaLaunchOp.getPhotoId(): objArray;
          str2 = str2+photoId+", authorId:";
          nasaLaunchOp = NasaLaunchOptManager.d();
          if (nasaLaunchOp != null) {
             objArray = nasaLaunchOp.getAid();
          }
          b.b(str1, str2+objArray);
          linkedHashMa = new LinkedHashMap();
          linkedHashMa.put(str, Integer.valueOf(1));
          NasaLaunchOptIndexModel nasaLaunchOp1 = NasaLaunchOptManager.d();
          str2 = "";
          if (nasaLaunchOp1 != null) {
             photoId1 = nasaLaunchOp1.getPhotoId();
             if (photoId1 != null) {
             label_006d :
                linkedHashMa.put("pid", photoId1);
                nasaLaunchOp1 = NasaLaunchOptManager.d();
                if (nasaLaunchOp1 != null) {
                   photoId1 = nasaLaunchOp1.getAid();
                   if (photoId1 != null) {
                      str2 = photoId1;
                   }
                }
                linkedHashMa.put("aid", str2);
             }
          }
          photoId1 = str2;
          goto label_006d ;
       }else {
          b.b(NasaLaunchOptManager.a(obj), "getFeedRequestParams empty cache");
          linkedHashMa = new LinkedHashMap();
          linkedHashMa.put(str, Integer.valueOf(0));
       }
       return linkedHashMa;
    }
}
