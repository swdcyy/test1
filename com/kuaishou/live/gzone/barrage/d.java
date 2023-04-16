package com.kuaishou.live.gzone.barrage.d;
import android.animation.AnimatorListenerAdapter;
import com.kuaishou.live.gzone.barrage.BarrageView;
import com.kuaishou.live.gzone.barrage.BarrageView$g;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.util.SparseArray;
import com.kuaishou.live.common.core.component.comments.combo.ComboCommentMessage;
import com.kuaishou.live.common.core.component.comments.combo.LiveComboCommentView;
import java.util.Queue;
import com.kuaishou.live.gzone.barrage.BarrageView$e;
import android.widget.RelativeLayout;
import android.graphics.drawable.Drawable;

public class d extends AnimatorListenerAdapter	// class@001c31
{
    public final BarrageView$g a;
    public final BarrageView b;

    public void d(BarrageView p0,BarrageView$g p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "1")) {
          return;
       }
       this.b.f.remove(this.a.h);
       this.a.g.setComboCommentMessage(null);
       this.b.e.offer(this.a);
       BarrageView g = this.b.g;
       d ta = this.a;
       BarrageView$e a = ta.a;
       if (g[a] == ta) {
          g[a] = null;
       }
       if (ta.g.getTag(0x7f0a15dc) != null) {
          this.a.g.setBackgroundDrawable(null);
          this.a.g.setTag(R.id.key_barrage_background, null);
       }
       return;
    }
}
