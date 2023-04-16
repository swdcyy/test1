package d3a.a;
import vo5.g;
import java.lang.Object;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import com.kwai.feature.api.feed.detail.router.biz.normal.NormalDetailBizParam;
import java.lang.String;
import com.kwai.framework.model.channel.HotChannel;
import mhc.n1;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import d3a.a$a;
import whc.k0;
import com.kwai.feature.api.feed.detail.router.DetailCommonParam;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.entity.QPreInfo;
import z8a.a;
import ohc.g;
import com.kwai.sharelib.a;
import z8a.g;
import com.yxcorp.gifshow.detail.nonslide.toolbar.follow.d;

public class a implements g	// class@001e65
{

    public void a(){
       super();
    }
    public void Kv(GifshowActivity p0,PhotoDetailParam p1,NormalDetailBizParam p2,String p3,HotChannel p4,n1 p5){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4,p5};
          if (PatchProxy.applyVoid(objArray, this, uoa, "2")) {
             return;
          }
       }
       new a(p1, new k0(p1.mPhoto, p1.mDetailCommonParam.mPreInfo, p0), p3, 0).c(p0, new a$a(this, p5)).l();
       return;
    }
    public void UY(GifshowActivity p0,PhotoDetailParam p1,NormalDetailBizParam p2,String p3,HotChannel p4){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4};
          if (PatchProxy.applyVoid(objArray, this, uoa, "1")) {
             return;
          }
       }
       d.a(p0, p1, p2, p3, p4);
       return;
    }
    public boolean isAvailable(){
       return true;
    }
}
