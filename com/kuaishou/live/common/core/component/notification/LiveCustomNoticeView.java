package com.kuaishou.live.common.core.component.notification.LiveCustomNoticeView;
import ml8.d;
import android.widget.RelativeLayout;
import android.content.Context;
import android.util.AttributeSet;
import com.yxcorp.gifshow.image.KwaiImageView;
import java.lang.Object;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.widget.ShootMarqueeView;
import android.widget.TextView;
import d61.f0;
import ekd.k1;
import com.kuaishou.live.common.core.component.notification.LiveCommonNotificationMessage;
import java.lang.CharSequence;
import iv1.c;
import java.lang.Runnable;

public class LiveCustomNoticeView extends RelativeLayout implements d	// class@0016e0
{
    public ShootMarqueeView b;
    public final KwaiImageView[] c;
    public View d;
    public final Object e;
    public static final int f;

    public void LiveCustomNoticeView(Context p0){
       super(p0, null, 0);
    }
    public void LiveCustomNoticeView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void LiveCustomNoticeView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       KwaiImageView[] kwaiImageVie = new KwaiImageView[3];
       this.c = kwaiImageVie;
       this.e = new Object();
       a.c(p0, R.layout.arg_RES_7f0d0adc, this);
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveCustomNoticeView.class, "3")) {
          return;
       }
       this.b = p0.findViewById(0x7f0a1be0);
       this.d = p0.findViewById(0x7f0a2229);
       this.c[0] = p0.findViewById(0x7f0a2226);
       this.c[1] = p0.findViewById(0x7f0a2227);
       this.c[2] = p0.findViewById(0x7f0a2228);
       f0.f(this.b, "sans-serif-medium");
       return;
    }
    public void onDetachedFromWindow(){
       if (PatchProxy.applyVoid(null, this, LiveCustomNoticeView.class, "2")) {
          return;
       }
       super.onDetachedFromWindow();
       k1.n(this.e);
       return;
    }
    public void onFinishInflate(){
       if (PatchProxy.applyVoid(null, this, LiveCustomNoticeView.class, "1")) {
          return;
       }
       super.onFinishInflate();
       this.doBindView(this);
       return;
    }
    public final void setupMarquee(LiveCommonNotificationMessage p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveCustomNoticeView.class, "5")) {
          return;
       }
       this.b.setText(p0.u());
       k1.s(new c(this), this.e, 1200);
       return;
    }
}
