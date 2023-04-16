package b06.c;
import lnc.c2;
import qk.g0;
import java.util.Set;
import java.lang.Object;
import com.yxcorp.gifshow.entity.QPhoto;
import wy5.b;
import java.lang.String;
import q87.c;
import java.lang.StringBuilder;
import com.kuaishou.android.live.model.QLivePlayConfig;

public final class c implements c2	// class@0003de
{
    public final g0 a;
    public final Set b;

    public void c(g0 p0,Set p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final boolean accept(Object p0){
       Object[] objArray1;
       c ta = this.a;
       c tb = this.b;
       boolean b = true;
       int i = 0;
       if (p0 == null) {
          Object[] objArray = new Object[i];
          b.C().w("QPhotoFilter", "filterInvalidPhotos, filter feed is null", objArray);
       }else {
          String str = "filterInvalidPhotos, filter feed ";
          if (p0.isUnknownType()) {
             objArray1 = new Object[i];
             b.C().w("QPhotoFilter", str+p0.getPhotoId()+", unknown feed type", objArray1);
             ta.put("unknown_feed", p0);
          }else if(p0.isLiveStream() && p0.getLivePlayConfig() == null){
             objArray1 = new Object[i];
             b.C().w("QPhotoFilter", str+p0.getPhotoId()+", livePlayConfig is null", objArray1);
             ta.put("REMOVE_INVALID_FEED", p0);
          }else if(p0.recognizeAsInvalidData()){
             Object[] objArray2 = new Object[i];
             b.C().w("QPhotoFilter", str+p0.getPhotoId()+", recognizeAsInvalidData", objArray2);
             tb.add(p0);
             ta.put("REMOVE_INVALID_FEED", p0);
          }
          b = false;
       }
       return b;
    }
}
