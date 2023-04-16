package com.kuaishou.live.core.voiceparty.theater.player.quality.QualitySelectDialog$c;
import wf2.c$b;
import com.kuaishou.live.core.voiceparty.theater.player.quality.QualitySelectDialog;
import java.util.List;
import com.kwai.video.waynelive.quality.LiveQualityItem;
import msd.l;
import msd.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class QualitySelectDialog$c implements c$b	// class@0019ad
{
    public final QualitySelectDialog a;
    public final List b;
    public final LiveQualityItem c;
    public final l d;
    public final a e;

    public void QualitySelectDialog$c(QualitySelectDialog p0,List p1,LiveQualityItem p2,l p3,a p4){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       super();
    }
    public final void onDismiss(){
       Object[] objArray = null;
       if (PatchProxy.applyVoidWithListener(objArray, this, QualitySelectDialog$c.class, "1")) {
          return;
       }
       this.a.a = objArray;
       this.e.invoke();
       PatchProxy.onMethodExit(QualitySelectDialog$c.class, "1");
       return;
    }
}
