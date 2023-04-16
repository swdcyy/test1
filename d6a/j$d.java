package d6a.j$d;
import d6a.k;
import qvb.i;
import java.lang.String;
import com.yxcorp.gifshow.detail.slideplay.SlideMediaType;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import d6a.j;
import com.kwai.framework.model.user.User;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;

public class j$d extends k	// class@001ea2
{

    public void j$d(i p0,String p1,SlideMediaType p2){
       super(p0, p1, p2);
    }
    public boolean a(QPhoto p0,boolean p1){
       Object obj;
       boolean b;
       j$d uod = j$d.class;
       if (PatchProxy.isSupport(uod)) {
          obj = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), this, uod, "1");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       obj = PatchProxy.applyOneRefs(p0, null, j.class, "10");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else if(p0.getUser() != null && (!TextUtils.x(p0.getPhotoId()) && (!p0.isVideoType() && (p0.isImageType() || p0.isLiveStream())))){
          b = true;
       }else {
          b = false;
       }
       return b;
    }
}
