package d29.e;
import tl8.g;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Object;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.yxcorp.utility.TextUtils;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import kp.w1;

public final class e implements g	// class@002039
{
    public final boolean a;
    public final QPhoto b;
    public final QPhoto c;

    public void e(boolean p0,QPhoto p1,QPhoto p2){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public void apply(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "1")) {
       }else {
          a.p(p0, "contentPackage");
          if (this.a != null && this.b != null) {
             ClientContent$LiveStreamPackage liveStreamPa = new ClientContent$LiveStreamPackage();
             liveStreamPa.identity = TextUtils.k(this.b.getLiveStreamId());
             p0.liveStreamPackage = liveStreamPa;
             p0.photoPackage = w1.f(this.c.mEntity);
          }
       }
       return;
    }
}
