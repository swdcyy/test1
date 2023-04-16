package com.alipay.sdk.m.s.d$c;
import com.alipay.sdk.m.s.d$e;
import com.alipay.sdk.m.s.d;
import com.alipay.sdk.m.s.e;
import java.lang.String;
import com.alipay.sdk.m.s.d$a;
import android.view.animation.Animation;
import android.view.View;
import android.widget.FrameLayout;

public class d$c extends d$e	// class@000ea4
{
    public final e b;
    public final String c;
    public final d d;

    public void d$c(d p0,e p1,String p2){
       this.d = p0;
       this.b = p1;
       this.c = p2;
       super(null);
    }
    public void onAnimationEnd(Animation p0){
       this.d.removeView(this.b);
       this.d.i.d(this.c);
       d.q(this.d, false);
    }
}
