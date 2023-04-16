package com.yxcorp.gifshow.widget.cdn.KwaiLottieAnimationView$a;
import w4.k;
import com.yxcorp.gifshow.widget.cdn.KwaiLottieAnimationView;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import w4.e;

public final class KwaiLottieAnimationView$a implements k	// class@001966
{
    public final String a;
    public final String b;
    public final long c;
    public final KwaiLottieAnimationView d;

    public void KwaiLottieAnimationView$a(KwaiLottieAnimationView p0,String p1,String p2,long p3){
       a.p(p1, "token");
       a.p(p2, "payload");
       this.d = p0;
       super();
       this.a = p1;
       this.b = p2;
       this.c = p3;
    }
    public void a(e p0){
       this.d.H(this.a, this.b, true, this.c);
    }
}
