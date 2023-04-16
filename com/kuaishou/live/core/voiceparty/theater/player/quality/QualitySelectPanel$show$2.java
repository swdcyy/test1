package com.kuaishou.live.core.voiceparty.theater.player.quality.QualitySelectPanel$show$2;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.core.voiceparty.theater.player.quality.QualitySelectPanel;
import java.lang.Object;
import com.kwai.video.waynelive.quality.LiveQualityItem;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import vw2.a;
import lnc.a1;
import java.lang.CharSequence;
import e17.i;

public final class QualitySelectPanel$show$2 extends Lambda implements l	// class@0019b3
{
    public final QualitySelectPanel this$0;

    public void QualitySelectPanel$show$2(QualitySelectPanel p0){
       this.this$0 = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(LiveQualityItem p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, QualitySelectPanel$show$2.class, "1")) {
          return;
       }
       a.p(p0, "it");
       QualitySelectPanel$show$2 tthis$0 = this.this$0;
       Objects.requireNonNull(tthis$0);
       if (!PatchProxy.applyVoidOneRefs(p0, tthis$0, QualitySelectPanel.class, "2")) {
          tthis$0.d.b(p0);
          i.d(R.style.arg_RES_7f110669, a1.r(R.string.arg_RES_7f1023fa, p0.getName()));
       }
       return;
    }
}
