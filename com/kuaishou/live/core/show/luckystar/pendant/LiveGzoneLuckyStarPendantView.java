package com.kuaishou.live.core.show.luckystar.pendant.LiveGzoneLuckyStarPendantView;
import ya1.m;
import com.kuaishou.live.core.show.luckystar.pendant.LiveBaseLuckyStarPendantView;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ekd.m1;
import com.yxcorp.gifshow.image.KwaiImageView;
import d61.c0;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.widget.RelativeLayout;
import java.lang.Float;

public class LiveGzoneLuckyStarPendantView extends LiveBaseLuckyStarPendantView implements m	// class@000cec
{
    public TextView d;
    public boolean e;

    public void LiveGzoneLuckyStarPendantView(Context p0){
       super(p0, null);
    }
    public void LiveGzoneLuckyStarPendantView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void LiveGzoneLuckyStarPendantView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveGzoneLuckyStarPendantView.class, "1")) {
          return;
       }
       m1.f(p0, R.id.live_lucky_star_pendant_img).L(c0.a.b("/udata/pkg/kwai-client-image/live_pendant/live_lucky_star_new_pendant_default.webp"));
       return;
    }
    public int getCountDownTextSizeDp(){
       return 10;
    }
    public int getLayoutRes(){
       return 0x7f0d0bd2;
    }
    public int getOpeningTextSizeDp(){
       return 8;
    }
    public float getScale(){
       View obj = PatchProxy.apply(null, this, LiveGzoneLuckyStarPendantView.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       obj = this.getChildAt(0);
       if (obj instanceof m) {
          return obj.getScale();
       }
       return 0x3f800000;
    }
    public void setScale(float p0){
       if (PatchProxy.isSupport(LiveGzoneLuckyStarPendantView.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, LiveGzoneLuckyStarPendantView.class, "2")) {
          return;
       }
       View childAt = this.getChildAt(0);
       if (childAt instanceof m) {
          childAt.setScale(p0);
       }
       return;
    }
}
