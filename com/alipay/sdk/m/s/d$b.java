package com.alipay.sdk.m.s.d$b;
import com.alipay.sdk.m.s.d$e;
import com.alipay.sdk.m.s.d;
import com.alipay.sdk.m.s.e;
import com.alipay.sdk.m.s.d$a;
import android.view.animation.Animation;

public class d$b extends d$e	// class@000ea3
{
    public final e b;
    public final d c;

    public void d$b(d p0,e p1){
       this.c = p0;
       this.b = p1;
       super(null);
    }
    public void onAnimationEnd(Animation p0){
       this.b.b();
       d.q(this.c, false);
    }
}
