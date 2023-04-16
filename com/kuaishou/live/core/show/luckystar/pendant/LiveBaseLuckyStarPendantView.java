package com.kuaishou.live.core.show.luckystar.pendant.LiveBaseLuckyStarPendantView;
import ml8.d;
import android.widget.RelativeLayout;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import android.widget.TextView;
import java.lang.Integer;
import ekd.m1;
import com.yxcorp.gifshow.image.KwaiImageView;
import d61.c0;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import com.kuaishou.android.live.log.LiveLogTag;
import java.util.List;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.lang.Long;
import java.util.Locale;
import java.lang.CharSequence;

public abstract class LiveBaseLuckyStarPendantView extends RelativeLayout implements d	// class@000ceb
{
    public TextView b;
    public boolean c;

    public void LiveBaseLuckyStarPendantView(Context p0){
       super(p0, null);
    }
    public void LiveBaseLuckyStarPendantView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void LiveBaseLuckyStarPendantView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       if (PatchProxy.applyVoid(null, this, LiveBaseLuckyStarPendantView.class, "1")) {
       }else {
          a.k(this, this.getLayoutRes(), true);
          this.doBindView(this);
          this.c = false;
       }
       return;
    }
    public static void d(TextView p0,int p1){
       if (PatchProxy.isSupport(LiveBaseLuckyStarPendantView.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), null, LiveBaseLuckyStarPendantView.class, "6")) {
          return;
       }
       p0.setTextSize(1, (float)p1);
       return;
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveBaseLuckyStarPendantView.class, "3")) {
          return;
       }
       m1.f(p0, R.id.live_lucky_star_pendant_img).L(c0.a.b("/udata/pkg/kwai-client-image/live_pendant/live_lucky_star_new_pendant_default_40.webp"));
       return;
    }
    public void b(){
       this.c = false;
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, LiveBaseLuckyStarPendantView.class, "4")) {
          return;
       }
       b.P(LiveLogTag.LUCKY_STAR.appendTag("LuckyStarPendant"), "LiveLuckyStarPendantView announced");
       this.b.setText(R.string.arg_RES_7f10262a);
       LiveBaseLuckyStarPendantView.d(this.b, this.getOpeningTextSizeDp());
       this.c = true;
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveBaseLuckyStarPendantView.class, "2")) {
          return;
       }
       this.b = m1.f(p0, 0x7f0a2141);
       this.a(p0);
       return;
    }
    public void e(long p0){
       if (PatchProxy.isSupport(LiveBaseLuckyStarPendantView.class) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, LiveBaseLuckyStarPendantView.class, "5")) {
          return;
       }
       if (this.c == null && p0 > 0) {
          LiveBaseLuckyStarPendantView.d(this.b, this.getCountDownTextSizeDp());
          Object[] objArray = new Object[]{Long.valueOf(((p0 / 0xea60) % 100)),Long.valueOf(((p0 / 1000) % 60))};
          this.b.setText(String.format(Locale.US, "%02d:%02d", objArray));
       }else if(!p0){
          b.P(LiveLogTag.LUCKY_STAR.appendTag("LuckyStarPendant"), "LiveLuckyStarPendantView waiting");
          LiveBaseLuckyStarPendantView.d(this.b, this.getOpeningTextSizeDp());
          this.b.setText(R.string.arg_RES_7f10262b);
       }
       return;
    }
    public abstract int getCountDownTextSizeDp();
    public abstract int getLayoutRes();
    public abstract int getOpeningTextSizeDp();
    public void onDetachedFromWindow(){
       if (PatchProxy.applyVoid(null, this, LiveBaseLuckyStarPendantView.class, "7")) {
          return;
       }
       super.onDetachedFromWindow();
       this.b();
       return;
    }
}
