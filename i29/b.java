package i29.b;
import tl8.g;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Object;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import kp.w1;

public final class b implements g	// class@002623
{
    public final QPhoto a;

    public void b(QPhoto p0){
       this.a = p0;
    }
    public final void apply(Object p0){
       p0.photoPackage = w1.f(this.a.getEntity());
    }
}
