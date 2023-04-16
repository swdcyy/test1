package mc9.k;
import erd.o;
import com.yxcorp.gifshow.camera.record.autoapply.sample.c;
import com.kuaishou.android.model.feed.VideoFeed;
import java.lang.Object;
import java.lang.Throwable;
import java.util.Objects;
import j8c.a;
import java.lang.StringBuilder;
import java.lang.String;
import w46.b;
import java.lang.IndexOutOfBoundsException;
import com.yxcorp.retrofit.model.KwaiException;
import com.yxcorp.gifshow.camera.record.autoapply.sample.SampleDownloadException;
import brd.t;

public final class k implements o	// class@002e4a
{
    public final c b;
    public final VideoFeed c;

    public void k(c p0,VideoFeed p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final Object apply(Object p0){
       Objects.requireNonNull(this.b);
       a.D().e("SampleProcessor", "obtain feed:"+this.c.getId()+" error", p0);
       int i = 1;
       if (p0 instanceof IndexOutOfBoundsException) {
       }else if(!p0 instanceof KwaiException){
          KwaiException mErrorCode = p0.mErrorCode;
          if (mErrorCode == 224 || (mErrorCode == 403 || (mErrorCode != 0xc372 && mErrorCode != 0xc379))) {
          }
       }
    label_0050 :
       p0 = (i)? t.error(new SampleDownloadException(p0)): t.error(p0);
       return p0;
    }
}
