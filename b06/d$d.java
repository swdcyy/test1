package b06.d$d;
import tca.h;
import java.lang.Object;
import java.lang.String;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.android.model.feed.PhotoType;
import kp.w1;

public class d$d implements h	// class@0003e2
{

    public void d$d(){
       super();
    }
    public String a(){
       return "reco_feed";
    }
    public boolean accept(Object p0){
       boolean b;
       Object obj = PatchProxy.applyOneRefs(p0, this, d$d.class, "1");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else if(w1.r(p0.mEntity) == PhotoType.RECOMMEND_USER_TEMPLATE){
          b = true;
       }else {
          b = false;
       }
       return b;
    }
}
