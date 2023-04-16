package com.kuaishou.live.locallife.explain.view.a;
import erd.g;
import com.kuaishou.live.locallife.explain.view.LocalLifeSpikeTimingLabelView$a;
import java.lang.Object;
import java.lang.Long;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.locallife.explain.view.LocalLifeSpikeTimingLabelView;
import kotlin.jvm.internal.a;
import com.kuaishou.live.locallife.model.LiveLocalLifeExplainCardPromotionStageInfo;
import gf3.c;
import java.lang.CharSequence;
import android.widget.TextView;
import com.kuaishou.live.locallife.model.LocalLifeLiveExplainMessage;
import msd.a;

public final class a implements g	// class@000c27
{
    public final LocalLifeSpikeTimingLabelView$a b;

    public void a(LocalLifeSpikeTimingLabelView$a p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
       }else {
          p0 = this.b.b;
          LocalLifeSpikeTimingLabelView g = p0.g;
          a.m(g);
          long l = p0.a(g.getMPromotionStageTime());
          if (l > 0) {
             p0 = this.b.b.b;
             if (p0 != null) {
                p0.setText(c.a(l));
             }
          }else {
             p0 = this.b;
             p0.b.b(p0.d, p0.e);
          }
       }
       return;
    }
}
