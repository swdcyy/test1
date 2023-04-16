package com.kuaishou.live.core.voiceparty.theater.player.quality.QualitySelectDialog$a;
import erd.g;
import com.kuaishou.live.core.voiceparty.theater.player.quality.QualitySelectDialog;
import java.lang.Object;
import kotlin.Pair;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import mrd.a;
import com.google.common.base.Optional;
import com.kwai.video.waynelive.quality.LiveQualityItem;
import msd.l;

public final class QualitySelectDialog$a implements g	// class@0019ab
{
    public final QualitySelectDialog b;

    public void QualitySelectDialog$a(QualitySelectDialog p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, QualitySelectDialog$a.class, "1")) {
       }else {
          QualitySelectDialog d = this.b.d;
          p0 = p0.getFirst().i();
          p0 = (p0 != null)? p0.orNull(): null;
          d.invoke(p0);
       }
       return;
    }
}
