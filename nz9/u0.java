package nz9.u0;
import tl8.g;
import nz9.z0;
import java.lang.Object;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kwai.feature.component.photofeatures.startup.response.AvatarInfoResponse;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import java.lang.String;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.utility.TextUtils;

public final class u0 implements g	// class@00324a
{
    public final z0 a;

    public void u0(z0 p0){
       this.a = p0;
    }
    public final void apply(Object p0){
       u0 ta = this.a;
       AvatarInfoResponse mPhoto = (ta.Q != null)? ta.Q.mPhoto: null;
       if (ta.B0(true) && mPhoto != null) {
          ClientContent$LiveStreamPackage liveStreamPa = new ClientContent$LiveStreamPackage();
          liveStreamPa.identity = TextUtils.k(mPhoto.getLiveStreamId());
          p0.liveStreamPackage = liveStreamPa;
       }
       return;
    }
}
