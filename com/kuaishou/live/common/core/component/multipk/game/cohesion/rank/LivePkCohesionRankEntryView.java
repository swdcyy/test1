package com.kuaishou.live.common.core.component.multipk.game.cohesion.rank.LivePkCohesionRankEntryView;
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

public class LivePkCohesionRankEntryView extends ConstraintLayout	// class@0015dc
{
    public final View B;
    public final View C;
    public final LiveUserView D;
    public final View E;
    public AnimatorSet F;

    public void LivePkCohesionRankEntryView(Context p0){
       super(p0, null);
    }
    public void LivePkCohesionRankEntryView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void LivePkCohesionRankEntryView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       a.d(p0, R.layout.arg_RES_7f0d0cf6, this, true);
       View view = this.findViewById(R.id.live_pk_cohesion_rank_entry);
       this.B = view;
       View view1 = this.findViewById(R.id.live_pk_cohesion_rank_tip_container);
       this.C = view1;
       LiveUserView liveUserView = this.findViewById(R.id.live_pk_cohesion_rank_my_avatar);
       this.D = liveUserView;
       View view2 = this.findViewById(R.id.live_pk_cohesion_rank_tip_complete_container);
       this.E = view2;
       if (PatchProxy.applyVoid(null, this, LivePkCohesionRankEntryView.class, "2")) {
       }else {
          ViewGroup$LayoutParams layoutParams = view.getLayoutParams();
          if (layoutParams != null) {
             layoutParams.width = a1.e(75.00f);
             view.setLayoutParams(layoutParams);
          }
          view.setBackground(a1.f(R.drawable.arg_RES_7f0813ba));
          view1.setTranslationX(0);
          view1.setAlpha(0x3f800000);
          liveUserView.setScaleX(0);
          liveUserView.setScaleY(0);
          view2.setTranslationX(0);
          view2.setAlpha(0);
       }
       return;
    }
}
