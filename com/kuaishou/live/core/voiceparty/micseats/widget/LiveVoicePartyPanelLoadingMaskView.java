package com.kuaishou.live.core.voiceparty.micseats.widget.LiveVoicePartyPanelLoadingMaskView;
import android.widget.LinearLayout;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import lnc.a1;
import p1.a;
import android.view.View;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.GradientDrawable$Orientation;
import android.graphics.drawable.Drawable;
import android.widget.LinearLayout$LayoutParams;
import android.view.ViewGroup$LayoutParams;
import java.lang.Integer;
import com.kuaishou.live.core.voiceparty.LiveVoicePartyLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import nt2.c;
import java.lang.Runnable;
import ekd.k1;
import nt2.b;

public class LiveVoicePartyPanelLoadingMaskView extends LinearLayout	// class@00177d
{
    public final String b;
    public final long c;
    public final long d;
    public int e;
    public int f;
    public AnimatorSet g;

    public void LiveVoicePartyPanelLoadingMaskView(Context p0){
       super(p0);
       this.b = "LiveVoicePartyPanelLoadingMaskView";
       this.c = 1000;
       this.d = 500;
       this.a();
    }
    public void LiveVoicePartyPanelLoadingMaskView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.b = "LiveVoicePartyPanelLoadingMaskView";
       this.c = 1000;
       this.d = 500;
       this.a();
    }
    public void LiveVoicePartyPanelLoadingMaskView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.b = "LiveVoicePartyPanelLoadingMaskView";
       this.c = 1000;
       this.d = 500;
       this.a();
    }
    public final void a(){
       if (PatchProxy.applyVoid(null, this, LiveVoicePartyPanelLoadingMaskView.class, "1")) {
          return;
       }
       this.setOrientation(0);
       int i = a1.d(R.dimen.arg_RES_7f070a16);
       int i1 = a1.d(R.dimen.arg_RES_7f070a15);
       int i2 = a1.a(0x106000d);
       int i3 = a.d(a1.a(R.color.arg_RES_7f060774), 179);
       this.f = (i * 2) + i1;
       View view = new View(this.getContext());
       int[] ointArray = new int[]{i3,i2};
       view.setBackground(new GradientDrawable(GradientDrawable$Orientation.RIGHT_LEFT, ointArray));
       this.addView(view, new LinearLayout$LayoutParams(i, -1));
       view = new View(this.getContext());
       view.setBackgroundColor(i3);
       this.addView(view, new LinearLayout$LayoutParams(i1, -1));
       View view1 = new View(this.getContext());
       int[] ointArray1 = new int[]{i3,i2};
       view1.setBackground(new GradientDrawable(GradientDrawable$Orientation.LEFT_RIGHT, ointArray1));
       this.addView(view1, new LinearLayout$LayoutParams(i, -1));
       return;
    }
    public void b(int p0){
       if (PatchProxy.isSupport(LiveVoicePartyPanelLoadingMaskView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, LiveVoicePartyPanelLoadingMaskView.class, "2")) {
          return;
       }
       b.Z(LiveVoicePartyLogTag.OTHER, "LiveVoicePartyPanelLoadingMaskView playLoading");
       k1.o(new c(this, p0));
       return;
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, LiveVoicePartyPanelLoadingMaskView.class, "4")) {
          return;
       }
       b.Z(LiveVoicePartyLogTag.OTHER, "LiveVoicePartyPanelLoadingMaskView stopLoading");
       k1.o(new b(this));
       return;
    }
    public int getLoadingViewWidth(){
       return this.f;
    }
}
