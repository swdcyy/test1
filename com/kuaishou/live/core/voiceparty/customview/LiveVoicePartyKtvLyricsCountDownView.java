package com.kuaishou.live.core.voiceparty.customview.LiveVoicePartyKtvLyricsCountDownView;
import android.widget.LinearLayout;
import lnc.a1;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.view.View;
import android.widget.LinearLayout$LayoutParams;
import bld.b;
import o56.c;
import o56.a;
import android.app.Application;
import android.content.res.Resources;
import com.yxcorp.widget.KwaiRadiusStyles;
import bld.c;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup$LayoutParams;

public class LiveVoicePartyKtvLyricsCountDownView extends LinearLayout	// class@0014b5
{
    public Context b;
    public static final int c;
    public static final int d;

    static {
       LiveVoicePartyKtvLyricsCountDownView.c = a1.e(6.00f);
       LiveVoicePartyKtvLyricsCountDownView.d = a1.e(10.00f);
    }
    public void LiveVoicePartyKtvLyricsCountDownView(Context p0){
       super(p0, null, 0);
    }
    public void LiveVoicePartyKtvLyricsCountDownView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void LiveVoicePartyKtvLyricsCountDownView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.b = p0;
       if (PatchProxy.applyVoid(null, this, LiveVoicePartyKtvLyricsCountDownView.class, "4")) {
       }else {
          this.removeAllViews();
          for (int i = 0; i < 4; i++) {
             View view = PatchProxy.apply(null, this, LiveVoicePartyKtvLyricsCountDownView.class, "5");
             if (view != PatchProxyResult.class) {
             }else {
                view = new View(this.b);
                LinearLayout$LayoutParams layoutParams = new LinearLayout$LayoutParams(LiveVoicePartyKtvLyricsCountDownView.c, LiveVoicePartyKtvLyricsCountDownView.c);
                layoutParams.rightMargin = LiveVoicePartyKtvLyricsCountDownView.d;
                b uob = new b();
                uob.v(a.a().a().getResources().getColor(R.color.arg_RES_7f060788));
                uob.g(KwaiRadiusStyles.R6);
                view.setBackground(uob.a());
                view.setLayoutParams(layoutParams);
                view.setVisibility(8);
             }
             this.addView(view);
          }
       }
       return;
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, LiveVoicePartyKtvLyricsCountDownView.class, "3")) {
          return;
       }
       int i = 0;
       if (this.getChildCount() > 0 && this.getChildAt(i).getVisibility()) {
          return;
       }
       for (; i < this.getChildCount(); i = i + 1) {
          this.getChildAt(i).setVisibility(8);
       }
       return;
    }
}
