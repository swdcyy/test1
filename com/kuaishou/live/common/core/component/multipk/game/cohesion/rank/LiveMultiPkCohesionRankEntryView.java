package com.kuaishou.live.common.core.component.multipk.game.cohesion.rank.LiveMultiPkCohesionRankEntryView;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import com.kuaishou.live.common.core.basic.widget.LiveUserView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup$LayoutParams;
import lnc.a1;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

public class LiveMultiPkCohesionRankEntryView extends ConstraintLayout	// class@0015d2
{
    public final View B;
    public final View C;
    public final LiveUserView D;
    public final View E;

    public void LiveMultiPkCohesionRankEntryView(Context p0){
       super(p0, null);
    }
    public void LiveMultiPkCohesionRankEntryView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void LiveMultiPkCohesionRankEntryView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       a.d(p0, R.layout.arg_RES_7f0d0cbd, this, true);
       this.B = this.findViewById(0x7f0a2253);
       this.C = this.findViewById(0x7f0a2258);
       this.D = this.findViewById(0x7f0a2254);
       this.E = this.findViewById(0x7f0a2255);
       this.L();
    }
    public final void L(){
       if (PatchProxy.applyVoid(null, this, LiveMultiPkCohesionRankEntryView.class, "2")) {
          return;
       }
       ViewGroup$LayoutParams layoutParams = this.B.getLayoutParams();
       if (layoutParams != null) {
          layoutParams.width = a1.e(62.00f);
          this.B.setLayoutParams(layoutParams);
       }
       this.B.setBackground(a1.f(R.drawable.arg_RES_7f0813ba));
       this.C.setVisibility(0);
       this.D.setScaleX(0);
       this.D.setScaleY(0);
       this.E.setVisibility(8);
       return;
    }
}
