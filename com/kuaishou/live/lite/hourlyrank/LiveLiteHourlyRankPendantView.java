package com.kuaishou.live.lite.hourlyrank.LiveLiteHourlyRankPendantView;
import android.widget.RelativeLayout;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.view.View;
import com.kuaishou.live.widget.ShootMarqueeView;
import com.yxcorp.widget.KwaiRadiusStyles;
import com.kwai.robust.PatchProxyResult;
import android.graphics.drawable.Drawable;
import bld.b;
import lnc.a1;
import bld.c;
import java.lang.StringBuilder;
import java.lang.CharSequence;
import android.widget.TextView;
import java.lang.Integer;
import android.view.ViewGroup$LayoutParams;
import android.widget.RelativeLayout$LayoutParams;
import android.view.View$OnClickListener;
import com.kuaishou.live.widget.ShootMarqueeView$c;

public class LiveLiteHourlyRankPendantView extends RelativeLayout	// class@0009b6
{
    public ShootMarqueeView b;
    public String c;
    public int d;
    public String e;
    public String f;
    public long g;

    public void LiveLiteHourlyRankPendantView(Context p0){
       super(p0, null);
    }
    public void LiveLiteHourlyRankPendantView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void LiveLiteHourlyRankPendantView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.g = 3;
    }
    public String getContentText(){
       return this.f;
    }
    public String getRankType(){
       return this.c;
    }
    public void onFinishInflate(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveLiteHourlyRankPendantView.class, "1")) {
          return;
       }
       super.onFinishInflate();
       this.b = this.findViewById(0x7f0a202f);
       KwaiRadiusStyles fULL = KwaiRadiusStyles.FULL;
       Drawable uDrawable = PatchProxy.applyOneRefs(fULL, objArray, LiveLiteHourlyRankPendantView.class, "3");
       if (uDrawable != PatchProxyResult.class) {
       }else {
          b uob = new b();
          uob.v(a1.a(R.color.arg_RES_7f060846));
          uob.g(fULL);
          uDrawable = uob.a();
       }
       this.setBackground(uDrawable);
       this.setGravity(16);
       this.setPadding(0, 0, a1.d(R.dimen.arg_RES_7f070334), 0);
       return;
    }
    public void setContentText(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteHourlyRankPendantView.class, "4")) {
          return;
       }
       StringBuilder str = "";
       this.b.setText(p0);
       this.f = p0;
       this.d = this.b.getTextWidth();
       int i = 1;
       while ((long)i - this.g < 0) {
          str = str+p0+"        ";
          i = i + 1;
       }
       this.e = str+p0;
       return;
    }
    public void setContentViewLayoutParams(int p0){
       if (PatchProxy.isSupport(LiveLiteHourlyRankPendantView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, LiveLiteHourlyRankPendantView.class, "7")) {
          return;
       }
       RelativeLayout$LayoutParams layoutParams = this.b.getLayoutParams();
       layoutParams.width = p0;
       this.b.setLayoutParams(layoutParams);
       return;
    }
    public void setHourlyRankItemViewClickListener(View$OnClickListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteHourlyRankPendantView.class, "2")) {
          return;
       }
       this.setOnClickListener(p0);
       return;
    }
    public void setLiteRankHorseRaceTimes(long p0){
       this.g = p0;
    }
    public void setMarqueeListener(ShootMarqueeView$c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteHourlyRankPendantView.class, "8")) {
          return;
       }
       this.b.setMarqueeListener(p0);
       return;
    }
    public void setRankType(String p0){
       this.c = p0;
    }
}
