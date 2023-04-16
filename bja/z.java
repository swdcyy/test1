package bja.z;
import erd.g;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.plugin.impl.SharePlugin.KwaiOp;
import java.lang.Object;
import java.lang.Boolean;
import tkd.b;
import tkd.d;
import vo5.n;
import com.kwai.framework.activitycontext.ActivityContext;
import android.app.Activity;
import com.yxcorp.gifshow.activity.GifshowActivity;

public final class z implements g	// class@0003fa
{
    public final QPhoto b;
    public final KwaiOp c;

    public void z(QPhoto p0,KwaiOp p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       d.a(0x19b005bd).hq(ActivityContext.g().e(), this.b, this.c);
    }
}
