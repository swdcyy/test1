package d61.g$a;
import ok.h;
import java.lang.Object;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;

public class g$a implements h	// class@001f1b
{

    public void g$a(){
       super();
    }
    public Object apply(Object p0){
       QPhoto qPhoto = PatchProxy.applyOneRefs(p0, this, g$a.class, "1");
       if (qPhoto != PatchProxyResult.class) {
       }else {
          qPhoto = new QPhoto(p0);
       }
       return qPhoto;
    }
}
