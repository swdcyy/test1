package cic.j;
import erd.o;
import cic.h$b;
import com.yxcorp.gifshow.video.d;
import java.lang.Object;
import java.io.File;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.kwai.framework.model.feed.BaseFeed;
import com.kwai.framework.model.user.User;
import kp.r1;
import com.yxcorp.gifshow.video.d$c;
import com.yxcorp.gifshow.share.exception.PhotoDownloadInProgressException;
import o56.a;
import android.app.Application;
import java.lang.Exception;
import nsd.u;

public final class j implements o	// class@0005b1
{
    public final h$b b;
    public final d c;

    public void j(h$b p0,d p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public Object apply(Object p0){
       Object obj = p0;
       p0 = PatchProxy.applyOneRefs(obj, this, j.class, "1");
       if (p0 != PatchProxyResult.class) {
       }else {
          a.p(obj, "file");
          User user = r1.T1(this.b.c);
          if (obj.exists()) {
             p0 = this.b;
             p0 = this.c.Tm(obj, 0, p0.d, p0.e, p0.f, this.c.LZ(user), user);
             p0.build();
             a.o(p0, "task");
             p0 = p0.getOutputFile();
          }else {
             PhotoDownloadInProgressException photoDownloa = new PhotoDownloadInProgressException(null, null, a.B.getString(0x7f104727), 3, null);
             throw obj.exists();
          }
       }
       return p0;
    }
}
