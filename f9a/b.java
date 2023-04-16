package f9a.b;
import com.yxcorp.gifshow.log.model.CommonParams;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import kp.w1;
import java.lang.Long;
import qrd.l1;

public final class b	// class@0022e8
{
    public static final CommonParams a;

    static {
       b.a = new CommonParams();
    }
    public static final ClientContent$ContentPackage a(QPhoto p0){
       ClientContent$ContentPackage obj = PatchProxy.applyOneRefs(p0, null, b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "photo");
       obj = new ClientContent$ContentPackage();
       ClientContent$PhotoPackage photoPackage = w1.f(p0.mEntity);
       photoPackage.type = 1;
       photoPackage.identity = p0.getPhotoId();
       String userId = p0.getUserId();
       a.o(userId, "photo.userId");
       photoPackage.authorId = Long.parseLong(userId);
       photoPackage.index = (long)p0.getPosition();
       photoPackage.llsid = p0.getListLoadSequenceID();
       photoPackage.expTag = p0.getExpTag();
       obj.photoPackage = photoPackage;
       return obj;
    }
}
