package com.kuaishou.live.common.core.component.multipk.game.vc.mvp.LiveMultiPkMvpTopScoreUserView;
import android.widget.LinearLayout;
import android.content.Context;
import android.util.AttributeSet;
import java.util.ArrayList;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import ll8.c$b;
import android.content.res.TypedArray;
import com.kuaishou.live.common.core.component.multipk.game.vc.mvp.LiveMultiPkMvpTopScoreUserView$TopScoreUserListAnchor;
import ht1.a;
import android.view.ViewParent;
import android.widget.ImageView;
import android.view.View;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.LinearLayout$LayoutParams;
import lnc.a1;
import android.view.ViewGroup$LayoutParams;
import com.kuaishou.live.common.core.component.multipk.game.vc.mvp.LiveMultiPkMvpTopScoreUserItemView;
import android.widget.FrameLayout;
import java.util.List;
import com.kuaishou.live.common.core.component.multipk.utils.LiveMultiPkResourceTypes;
import pu1.d;
import com.kuaishou.live.common.core.component.multipk.game.vc.mvp.LiveMultiPkMvpTopScoreUserItemView$a;
import java.util.Iterator;

public class LiveMultiPkMvpTopScoreUserView extends LinearLayout	// class@00162f
{
    public KwaiImageView b;
    public List c;
    public LiveMultiPkMvpTopScoreUserView$TopScoreUserListAnchor d;

    public void LiveMultiPkMvpTopScoreUserView(Context p0){
       super(p0, null, 0);
    }
    public void LiveMultiPkMvpTopScoreUserView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void LiveMultiPkMvpTopScoreUserView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.c = new ArrayList();
       if (!PatchProxy.isSupport(LiveMultiPkMvpTopScoreUserView.class) || (!PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, LiveMultiPkMvpTopScoreUserView.class, "1") && (!PatchProxy.isSupport(LiveMultiPkMvpTopScoreUserView.class) || !PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, LiveMultiPkMvpTopScoreUserView.class, "4")))) {
          TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.H2);
          LiveMultiPkMvpTopScoreUserView$TopScoreUserListAnchor sELF = LiveMultiPkMvpTopScoreUserView$TopScoreUserListAnchor.SELF;
          this.d = (!typedArray.getInt(0, sELF.value))? sELF: LiveMultiPkMvpTopScoreUserView$TopScoreUserListAnchor.OPPONENT;
          typedArray.recycle();
       }
       return;
    }
    public final void a(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMultiPkMvpTopScoreUserView.class, "6")) {
          return;
       }
       LiveMultiPkMvpTopScoreUserView tb = this.b;
       if (tb != null && tb.getParent() == null) {
          this.addView(this.b);
          return;
       }else {
          this.b = new KwaiImageView(this.getContext());
          LinearLayout$LayoutParams layoutParams = new LinearLayout$LayoutParams(a1.e(28.00f), a1.e(28.00f));
          layoutParams.gravity = 16;
          layoutParams.setMarginEnd(a1.e(7.00f));
          this.c(this.b, p0);
          this.addView(this.b, layoutParams);
          return;
       }
    }
    public void b(Context p0,a p1,LiveMultiPkMvpTopScoreUserView$TopScoreUserListAnchor p2){
       int i1;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, LiveMultiPkMvpTopScoreUserView.class, "2")) {
          return;
       }
       this.d = p2;
       if (p2 == LiveMultiPkMvpTopScoreUserView$TopScoreUserListAnchor.SELF) {
          this.a(p1);
       }
       for (int i = 0; i < 3; i++) {
          LiveMultiPkMvpTopScoreUserItemView liveMultiPkM = new LiveMultiPkMvpTopScoreUserItemView(p0);
          if (this.d == LiveMultiPkMvpTopScoreUserView$TopScoreUserListAnchor.SELF) {
             i1 = i + 1;
             liveMultiPkM.setRank(i1);
          }else {
             i1 = i - 3;
             liveMultiPkM.setRank(i1);
          }
          liveMultiPkM.setLayoutParams(new ViewGroup$LayoutParams(-2, -2));
          this.addView(liveMultiPkM);
          this.c.add(liveMultiPkM);
       }
       if (this.d == LiveMultiPkMvpTopScoreUserView$TopScoreUserListAnchor.OPPONENT) {
          this.a(p1);
       }
       return;
    }
    public final void c(KwaiImageView p0,a p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveMultiPkMvpTopScoreUserView.class, "9")) {
          return;
       }
       LiveMultiPkMvpTopScoreUserView td = this.d;
       if (td == LiveMultiPkMvpTopScoreUserView$TopScoreUserListAnchor.SELF) {
          p1.d(p0, LiveMultiPkResourceTypes.LIVE_PK_RANK_SELF_EMPTY);
       }else if(td == LiveMultiPkMvpTopScoreUserView$TopScoreUserListAnchor.OPPONENT){
          p1.d(p0, LiveMultiPkResourceTypes.LIVE_PK_RANK_OPPONENT_EMPTY);
       }
       return;
    }
    public void setScoreUserItemClickListener(LiveMultiPkMvpTopScoreUserItemView$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMultiPkMvpTopScoreUserView.class, "3")) {
          return;
       }
       Iterator iterator = this.c.iterator();
       while (iterator.hasNext()) {
          iterator.next().setLivePkMvpTopScoreUserItemClickListener(p0);
       }
       return;
    }
}
