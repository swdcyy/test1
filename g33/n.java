package g33.n;
import java.lang.Runnable;
import com.kuaishou.live.external.p;
import android.app.Activity;
import com.kwai.feature.api.live.base.model.LiveAudienceParam;
import java.lang.Object;
import os5.l;

public final class n implements Runnable	// class@002a58
{
    public final p b;
    public final Activity c;
    public final LiveAudienceParam d;

    public void n(p p0,Activity p1,LiveAudienceParam p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void run(){
       this.b.n().m1(this.c, this.d);
    }
}
