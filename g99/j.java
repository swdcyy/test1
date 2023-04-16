package g99.j;
import tl8.g;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Object;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import java.lang.String;
import com.yxcorp.utility.TextUtils;

public final class j implements g	// class@002446
{
    public final QPhoto a;

    public void j(QPhoto p0){
       this.a = p0;
    }
    public final void apply(Object p0){
       ClientContent$LiveStreamPackage liveStreamPa = new ClientContent$LiveStreamPackage();
       liveStreamPa.identity = TextUtils.k(this.a.getLiveStreamId());
       p0.liveStreamPackage = liveStreamPa;
    }
}
