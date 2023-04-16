package dx9.h$a;
import a9c.e;
import java.lang.Object;
import com.yxcorp.gifshow.detail.model.response.CommentLimitInfo;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;

public class h$a extends e	// class@001fee
{

    public void h$a(){
       super();
    }
    public boolean a(Object p0,Object p1){
       boolean b;
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, h$a.class, "2");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else if(p0 != null || (p1 != null && (p0 != null && (p1 != null && (p0.mPhoto != null || p1.mPhoto != null))))){
          if (p0 != null && p1 != null) {
             p0 = p0.mPhoto;
             if (p0 != null) {
                p1 = p1.mPhoto;
                if (p1 == null || !p0.equals(p1)) {
                }
             }else {
             }
          }else {
          }
       }
    label_0039 :
       b = true;
       return b;
    }
    public boolean b(Object p0,Object p1){
       boolean b;
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, h$a.class, "1");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else if(p0 != null && p1 != null){
          p0 = p0.mPhoto;
          if (p0 != null && (p1.mPhoto != null && TextUtils.n(p0.getPhotoId(), p1.mPhoto.getPhotoId()))) {
             b = true;
          }
       }
    label_0035 :
       b = false;
       return b;
    }
}
