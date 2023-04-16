package cw1.z;
import oq5.c;
import com.kuaishou.live.common.core.component.pendant.pendantgroup.d;
import java.lang.Object;
import android.content.res.Configuration;
import cw1.m0;
import cw1.n0;
import com.kwai.feature.api.live.base.service.pendant.pendantgroup.LivePendantRelation;

public final class z implements c	// class@001e83
{
    public final d b;

    public void z(d p0){
       this.b = p0;
    }
    public final void onConfigurationChanged(Configuration p0){
       m0 om0 = this.b.b();
       LivePendantRelation sCREEN_LANDS = LivePendantRelation.SCREEN_LANDSCAPE;
       boolean b = (p0.orientation == 2)? true: false;
       om0.a(sCREEN_LANDS, b);
       return;
    }
}
