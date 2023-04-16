package com.kuaishou.live.common.core.component.multipk.render.view.LiveMultiPkDuetContinuousWinView;
import androidx.constraintlayout.widget.ConstraintLayout;
import lnc.a1;
import android.content.Context;
import android.util.AttributeSet;
import ec3.f;
import android.view.ViewGroup;
import android.view.View;
import ha1.b;
import i2b.a;
import com.kuaishou.live.common.core.component.pk.combowin.LivePkComboWinNumberScrollView;
import android.widget.TextView;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.kuaishou.live.common.core.component.multipk.render.view.LiveMultiPkDuetContinuousWinView$a;
import android.view.View$OnClickListener;
import com.kuaishou.live.common.core.component.multipk.render.view.LiveMultiPkDuetContinuousWinView$b;
import jw1.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.utility.SystemUtil;
import java.lang.IllegalArgumentException;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.GradientDrawable$Orientation;
import android.graphics.drawable.Drawable;
import java.lang.Integer;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import jw1.d;
import com.kuaishou.live.common.core.component.multipk.render.view.LiveMultiPkDuetContinuousWinView$c;
import ht1.a;
import va1.l0;
import com.kuaishou.live.common.core.component.pk.LivePkResource$PkSkinResource;
import hc.b;
import com.kuaishou.live.common.core.component.pk.b;

public class LiveMultiPkDuetContinuousWinView extends ConstraintLayout	// class@001679
{
    public final b B;
    public final ConstraintLayout C;
    public final LivePkComboWinNumberScrollView D;
    public final TextView E;
    public final KwaiImageView F;
    public final ConstraintLayout G;
    public final LivePkComboWinNumberScrollView H;
    public final TextView I;
    public final KwaiImageView J;
    public a K;
    public LiveMultiPkDuetContinuousWinView$c L;
    public int M;
    public int N;
    public static final int O;
    public static int[] P;
    public static int[] Q;

    static {
       LiveMultiPkDuetContinuousWinView.O = a1.d(0x7f070267);
    }
    public void LiveMultiPkDuetContinuousWinView(Context p0){
       super(p0, null);
    }
    public void LiveMultiPkDuetContinuousWinView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void LiveMultiPkDuetContinuousWinView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.N = -1;
       boolean b = true;
       if (f.b()) {
          b.c(p0, R.layout.live_pk_combo_win_group_layout, this, b);
       }else {
          a.d(p0, R.layout.live_pk_combo_win_group_layout, this, b);
       }
       ConstraintLayout uConstraintL = this.findViewById(R.id.live_pk_combo_win_left_top_view);
       this.C = uConstraintL;
       this.D = this.findViewById(0x7f0a2274);
       this.E = this.findViewById(0x7f0a2275);
       this.F = this.findViewById(0x7f0a2273);
       ConstraintLayout uConstraintL1 = this.findViewById(R.id.live_pk_combo_win_right_top_view);
       this.G = uConstraintL1;
       this.H = this.findViewById(0x7f0a2293);
       this.I = this.findViewById(0x7f0a2294);
       this.J = this.findViewById(0x7f0a2292);
       uConstraintL.setOnClickListener(new LiveMultiPkDuetContinuousWinView$a(this));
       uConstraintL1.setOnClickListener(new LiveMultiPkDuetContinuousWinView$b(this));
       this.B = new b();
       return;
    }
    public final boolean L(){
       Object obj = PatchProxy.apply(null, this, LiveMultiPkDuetContinuousWinView.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.M != null)? true: false;
       if (b || !SystemUtil.I()) {
          return b;
       }else {
          throw new IllegalArgumentException("ContinuousWinPosition cannot be UNKNOWN, it should be init before the whole view used");
       }
    }
    public final void M(View p0,int[] p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveMultiPkDuetContinuousWinView.class, "12")) {
          return;
       }
       GradientDrawable gradientDraw = new GradientDrawable();
       gradientDraw.setColors(p1);
       gradientDraw.setOrientation(GradientDrawable$Orientation.LEFT_RIGHT);
       gradientDraw.setCornerRadius((float)a1.d(R.dimen.arg_RES_7f07042c));
       p0.setBackground(gradientDraw);
       return;
    }
    public final void N(View p0,int p1){
       if (PatchProxy.isSupport(LiveMultiPkDuetContinuousWinView.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, LiveMultiPkDuetContinuousWinView.class, "11")) {
          return;
       }
       ViewGroup$LayoutParams layoutParams = p0.getLayoutParams();
       if (layoutParams instanceof ViewGroup$MarginLayoutParams) {
          layoutParams.topMargin = p1;
          p0.setLayoutParams(layoutParams);
       }
       return;
    }
    public final void setContinuousWinCountsWithoutScrollAnim(int p0){
       if (PatchProxy.isSupport(LiveMultiPkDuetContinuousWinView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, LiveMultiPkDuetContinuousWinView.class, "5")) {
          return;
       }
       if (!this.L()) {
          return;
       }
       if (this.M == true) {
          this.D.setCurrentWinCounts(p0);
          this.D.setNumberShadowColor(true);
          d.a(this.E, R.color.arg_RES_7f06042c);
       }else {
          this.H.setCurrentWinCounts(p0);
          this.H.setNumberShadowColor(false);
          d.a(this.I, R.color.arg_RES_7f06028a);
       }
       return;
    }
    public void setContinuousWinPosition(int p0){
       this.M = p0;
    }
    public void setOnContinuousWinIconClickListener(LiveMultiPkDuetContinuousWinView$c p0){
       this.L = p0;
    }
    public void setSkinManager(a p0){
       this.K = p0;
    }
    public void setVisibility(int p0){
       if (PatchProxy.isSupport(LiveMultiPkDuetContinuousWinView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, LiveMultiPkDuetContinuousWinView.class, "1")) {
          return;
       }
       if (!p0 && this.L()) {
          int i = 1;
          if (!PatchProxy.applyVoid(null, this, LiveMultiPkDuetContinuousWinView.class, "10")) {
             LiveMultiPkDuetContinuousWinView tK = this.K;
             if (tK != null) {
                int[] ointArray = new int[]{tK.f("live_pk_combo_win_background_self_start_color", a1.a(0x7f060461)),this.K.f("live_pk_combo_win_background_self_end_color", a1.a(0x7f060676)),this.K.f("live_pk_combo_win_background_self_end_color", l0.c(a1.a(0x7f060676), 0x3f000000))};
                LiveMultiPkDuetContinuousWinView.P = ointArray;
                int[] ointArray1 = new int[]{this.K.f("live_pk_combo_win_background_opponent_start_color", l0.c(a1.a(0x7f060310), 0x3f000000)),this.K.f("live_pk_combo_win_background_opponent_start_color", a1.a(0x7f060310)),this.K.f("live_pk_combo_win_background_opponent_end_color", a1.a(0x7f060275))};
                LiveMultiPkDuetContinuousWinView.Q = ointArray1;
             }
          }
          if (this.M == i) {
             this.C.setVisibility(0);
             this.G.setVisibility(8);
             this.N(this.C, LiveMultiPkDuetContinuousWinView.O);
             this.M(this.C, LiveMultiPkDuetContinuousWinView.P);
             b.b(this.F, LivePkResource$PkSkinResource.LIVE_PK_COMBO_WIN, null);
          }else {
             this.C.setVisibility(8);
             this.G.setVisibility(0);
             this.N(this.G, LiveMultiPkDuetContinuousWinView.O);
             this.M(this.G, LiveMultiPkDuetContinuousWinView.Q);
             b.b(this.J, LivePkResource$PkSkinResource.LIVE_PK_COMBO_WIN, null);
          }
       }
       super.setVisibility(p0);
       return;
    }
}
