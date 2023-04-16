package d6a.j$c;
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
import com.kwai.framework.model.feed.BaseFeed;
import kp.r1;

public class j$c extends k	// class@001ea1
{

    public void j$c(i p0,String p1,SlideMediaType p2){
       super(p0, p1, p2);
    }
    public boolean a(QPhoto p0,boolean p1){
       Object obj;
       boolean b;
       j$c uoc = j$c.class;
       if (PatchProxy.isSupport(uoc)) {
          obj = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), this, uoc, "1");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       obj = PatchProxy.applyOneRefs(p0, null, j.class, "8");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else if(p0.getUser() != null && (!TextUtils.x(p0.getPhotoId()) && r1.S2(p0.mEntity))){
          b = true;
       }else {
          b = false;
       }
       return b;
    }
}
