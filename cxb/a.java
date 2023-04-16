package cxb.a;
import java.lang.Object;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.photo.download.model.StatModel;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import cxb.a$a;
import com.yxcorp.gifshow.entity.QPhoto;
import axb.b;
import com.yxcorp.gifshow.photo.download.utils.e;

public class a	// class@00208c
{

    public void a(){
       super();
    }
    public static void a(GifshowActivity p0,BaseFeed p1,StatModel p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, a.class, "4")) {
          return;
       }
       a$a uoa = new a$a(p1, p0, p2);
       if (!PatchProxy.applyVoidTwoRefs(p1, uoa, null, a.class, "6")) {
          e.g(new QPhoto(p1), uoa);
       }
       return;
    }
}
