package com.kuaishou.live.lite.luckystar.LiveLiteLuckyStarPendantView;
import android.widget.LinearLayout;
import android.content.Context;
import android.util.AttributeSet;
import java.util.HashSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup;
import android.view.View;
import ha1.b;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.TextView;
import com.kuaishou.live.widget.LivePkShimmerLayout;
import bld.b;
import o56.c;
import o56.a;
import android.app.Application;
import android.content.res.Resources;
import com.yxcorp.widget.KwaiRadiusStyles;
import bld.c;
import android.graphics.drawable.Drawable;
import java.lang.CharSequence;
import java.lang.Long;
import java.lang.Math;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gifshow.model.CDNUrl;
import ud3.b;
import com.yxcorp.gifshow.image.KwaiBindableImageView;

public class LiveLiteLuckyStarPendantView extends LinearLayout	// class@000a2f
{
    public KwaiImageView b;
    public TextView c;
    public LivePkShimmerLayout d;
    public HashSet e;

    public void LiveLiteLuckyStarPendantView(Context p0){
       super(p0, null);
    }
    public void LiveLiteLuckyStarPendantView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void LiveLiteLuckyStarPendantView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.e = new HashSet();
       if (PatchProxy.applyVoid(null, this, LiveLiteLuckyStarPendantView.class, "1")) {
       }else {
          View view = b.d(this, R.layout.live_lite_lucky_star_pendant_layout, true);
          this.b = view.findViewById(0x7f0a17f2);
          this.c = view.findViewById(0x7f0a17f1);
          LivePkShimmerLayout livePkShimme = view.findViewById(R.id.lite_lucky_star_simmer_view);
          this.d = livePkShimme;
          b uob = new b();
          uob.v(a.a().a().getResources().getColor(R.color.arg_RES_7f060846));
          uob.g(KwaiRadiusStyles.FULL);
          livePkShimme.setBackground(uob.a());
       }
       return;
    }
    public View getAnchorView(){
       return this.b;
    }
    public LivePkShimmerLayout getShimmerView(){
       return this.d;
    }
    public void setContextText(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteLuckyStarPendantView.class, "3")) {
          return;
       }
       this.c.setText(p0);
       return;
    }
    public void setCountdownText(long p0){
       if (PatchProxy.isSupport(LiveLiteLuckyStarPendantView.class) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, LiveLiteLuckyStarPendantView.class, "4")) {
          return;
       }
       this.c.setText(TextUtils.K(Math.max(0, p0)));
       return;
    }
    public void setIconUrl(CDNUrl[] p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteLuckyStarPendantView.class, "2")) {
          return;
       }
       if (b.a(p0, this.e)) {
          this.b.U(p0);
          b.b(p0, this.e);
       }
       return;
    }
}
