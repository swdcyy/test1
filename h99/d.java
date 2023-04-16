package h99.d;
import erd.g;
import h99.e$a;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kwai.framework.model.feed.BaseFeed;
import java.lang.Object;
import com.yxcorp.gifshow.share.OperationModel;
import java.util.Objects;
import tkd.b;
import tkd.d;
import nl9.a0;
import h99.e;
import h99.f;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import android.app.Activity;
import java.lang.String;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import k2b.y1;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import kp.w1;
import k2b.u1;

public final class d implements g	// class@00256f
{
    public final e$a b;
    public final GifshowActivity c;
    public final BaseFeed d;

    public void d(e$a p0,GifshowActivity p1,BaseFeed p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void accept(Object p0){
       d tb = this.b;
       Objects.requireNonNull(tb);
       d.a(-61392074).V20(this.c, "3", tb.e.d.c.getPhoto());
       u1.u(1, y1.a("fans_headline", 835, 5), w1.h(this.d));
    }
}
