package com.yxcorp.gifshow.widget.cdn.KwaiLottieAnimationView$b;
import w4.j;
import com.yxcorp.gifshow.widget.cdn.KwaiLottieAnimationView;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Throwable;
import java.util.Objects;
import zsd.u;
import java.lang.CharSequence;
import kotlin.text.StringsKt__StringsKt;
import java.security.GeneralSecurityException;
import java.net.SocketException;
import java.nio.channels.ClosedChannelException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import javax.net.ssl.SSLException;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;
import com.yxcorp.utility.Log;
import com.airbnb.lottie.LottieAnimationView;
import java.util.Iterator;
import java.lang.Iterable;

public final class KwaiLottieAnimationView$b implements j	// class@001967
{
    public final String a;
    public String b;
    public final long c;
    public final KwaiLottieAnimationView d;

    public void KwaiLottieAnimationView$b(KwaiLottieAnimationView p0,String p1,String p2,long p3){
       a.p(p1, "token");
       a.p(p2, "payload");
       this.d = p0;
       super();
       this.a = p1;
       this.b = p2;
       this.c = p3;
    }
    public void onResult(Object p0){
       KwaiLottieAnimationView$b ta = this.a;
       KwaiLottieAnimationView$b tb = this.b;
       Objects.requireNonNull(this.d);
       int i = 2;
       Object obj = null;
       boolean b = false;
       KwaiLottieAnimationView$b uob = (u.q2(tb, "http", b, i, obj) && (StringsKt__StringsKt.O2(tb, ta, b, i, obj) && StringsKt__StringsKt.O2(tb, ".json", b, i, obj)))? 1: null;
       if (uob) {
          if (!p0 instanceof GeneralSecurityException && (!p0 instanceof SocketException && (!p0 instanceof ClosedChannelException && (!p0 instanceof InterruptedIOException && (!p0 instanceof ProtocolException && (!p0 instanceof SSLException && (p0 instanceof UnknownHostException || p0 instanceof UnknownServiceException))))))) {
             b = true;
          }
          if (!b) {
             Log.g("KwaiLottieAnimationView", "Fallback to zip format and try again.");
             p0 = u.g2(this.b, ".json", ".zip", false, 4, null);
             this.b = p0;
             this.d.setAnimationFromUrl(p0);
          label_0092 :
             return;
          }
       }
       Iterator iterator = this.d.t.iterator();
       while (iterator.hasNext()) {
          iterator.next().onResult(p0);
       }
       this.d.H(this.a, this.b, false, this.c);
       this.d.setFailureListener(obj);
       goto label_0092 ;
    }
}
