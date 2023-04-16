package nfd.r2;
import java.lang.Object;
import java.util.List;
import java.lang.String;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;

public class r2	// class@001dfe
{

    public void r2(){
       super();
    }
    public static QPhoto a(List p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, r2.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 != null && !TextUtils.x(p1)) {
          int i = 0;
          while (i < p0.size()) {
             QPhoto qPhoto = p0.get(i);
             if (TextUtils.n(qPhoto.getBizId(), p1)) {
                return qPhoto;
             }
             i = i + 1;
          }
       }
       return null;
    }
    public static String b(QPhoto p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, r2.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == null) {
          return null;
       }
       return p0.getWrapperPhotoId();
    }
}
