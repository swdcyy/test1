package com.kuaishou.live.gzone.treasurebox.widget.TreasureBoxV2StyleCellView$a;
import android.animation.AnimatorListenerAdapter;
import com.kuaishou.live.gzone.treasurebox.widget.TreasureBoxV2StyleCellView;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.gzone.treasurebox.bean.LiveTreasureBoxModel;
import java.lang.Boolean;
import brd.y;

public class TreasureBoxV2StyleCellView$a extends AnimatorListenerAdapter	// class@001ca8
{
    public final TreasureBoxV2StyleCellView a;

    public void TreasureBoxV2StyleCellView$a(TreasureBoxV2StyleCellView p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TreasureBoxV2StyleCellView$a.class, "1")) {
          return;
       }
       super.onAnimationEnd(p0);
       TreasureBoxV2StyleCellView l = this.a.L;
       if (l != null) {
          l.mPendingAnimation = false;
          l.mOpenedDoneSubject.onNext(Boolean.TRUE);
       }
       this.a.P(true);
       return;
    }
}
