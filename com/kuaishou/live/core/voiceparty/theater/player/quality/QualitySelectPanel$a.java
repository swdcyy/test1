package com.kuaishou.live.core.voiceparty.theater.player.quality.QualitySelectPanel$a;
import erd.g;
import com.kuaishou.live.core.voiceparty.theater.player.quality.QualitySelectPanel;
import java.lang.Object;
import kotlin.Pair;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import mrd.a;
import com.google.common.base.Optional;
import com.kwai.video.waynelive.quality.LiveQualityItem;
import msd.l;

public final class QualitySelectPanel$a implements g	// class@0019b1
{
    public final QualitySelectPanel b;

    public void QualitySelectPanel$a(QualitySelectPanel p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, QualitySelectPanel$a.class, "1")) {
       }else {
          this.b.b = p0;
          QualitySelectPanel e = this.b.e;
          p0 = p0.getFirst().i();
          p0 = (p0 != null)? p0.orNull(): null;
          e.invoke(p0);
       }
       return;
    }
}
