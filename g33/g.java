package g33.g;
import java.lang.Runnable;
import com.kuaishou.live.external.p;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kwai.feature.api.live.base.model.LiveAudienceParam;
import java.lang.Object;
import os5.l;

public final class g implements Runnable	// class@002a51
{
    public final p b;
    public final GifshowActivity c;
    public final LiveAudienceParam d;
    public final int e;

    public void g(p p0,GifshowActivity p1,LiveAudienceParam p2,int p3){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
    }
    public final void run(){
       this.b.n().wV(this.c, this.d, this.e);
    }
}
