package d22.h;
import w4.j;
import com.kuaishou.live.core.basic.widget.LiveKidLottieAnimationView;
import java.lang.Object;
import java.lang.Throwable;
import java.util.Objects;
import com.yxcorp.utility.SystemUtil;
import java.security.GeneralSecurityException;
import java.net.SocketException;
import java.nio.channels.ClosedChannelException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import javax.net.ssl.SSLException;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;
import java.lang.IllegalStateException;
import java.lang.String;
import qq3.a;
import q87.c;

public final class h implements j	// class@00242b
{
    public final LiveKidLottieAnimationView a;

    public void h(LiveKidLottieAnimationView p0){
       this.a = p0;
    }
    public final void onResult(Object p0){
       Objects.requireNonNull(this.a);
       if (SystemUtil.I()) {
          a uoa = (!p0 instanceof GeneralSecurityException && (!p0 instanceof SocketException && (!p0 instanceof ClosedChannelException && (!p0 instanceof InterruptedIOException && (!p0 instanceof ProtocolException && (!p0 instanceof SSLException && (p0 instanceof UnknownHostException || p0 instanceof UnknownServiceException)))))))? 1: null;
          if (!uoa) {
             throw new IllegalStateException("Unable to parse composition", p0);
          }
       }
       a.C().e("LiveLottieAnimationView", "failureListener Unable to parse composition", p0);
       return;
    }
}
