package og.c0;
import erd.o;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.feature.post.bridge.jsmodel.JsCameraCallbackParams$Param;
import java.lang.Object;
import java.lang.Boolean;
import tkd.b;
import tkd.d;
import gm9.b;
import java.lang.String;
import brd.t;
import java.lang.Exception;

public final class c0 implements o	// class@00279b
{
    public final GifshowActivity b;
    public final JsCameraCallbackParams$Param c;

    public void c0(GifshowActivity p0,JsCameraCallbackParams$Param p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final Object apply(Object p0){
       c0 tb = this.b;
       c0 tc = this.c;
       if (p0.booleanValue()) {
          return d.a(0x29d652b0).Xd(tb, tc.mActivity);
       }
       throw new Exception("plugin loaded failed: commercial_showcase_record");
    }
}
