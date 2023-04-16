package eob.b;
import erd.g;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kwai.feature.post.api.feature.upload.interfaces.IUploadInfo;
import java.lang.Object;
import java.lang.Integer;
import eob.t;
import tkd.b;
import tkd.d;
import qw5.b;

public final class b implements g	// class@00278a
{
    public final GifshowActivity b;
    public final IUploadInfo c;

    public void b(GifshowActivity p0,IUploadInfo p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       b tb = this.b;
       b tc = this.c;
       if (t.b(p0.intValue())) {
          d.a(0x62409668).SV(tb, tc);
       }
       return;
    }
}
