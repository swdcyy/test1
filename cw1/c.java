package cw1.c;
import ty1.b;
import com.kuaishou.live.common.core.component.pendant.pendantgroup.b;
import java.lang.Object;
import cw1.m0;
import cw1.n0;
import com.kwai.feature.api.live.base.service.pendant.pendantgroup.LivePendantRelation;

public final class c implements b	// class@001e5d
{
    public final b a;

    public void c(b p0){
       this.a = p0;
    }
    public final void a(int p0,int p1){
       m0 om0 = this.a.b();
       LivePendantRelation vOICE_PARTY_ = LivePendantRelation.VOICE_PARTY_SCENE;
       boolean b = (p0)? true: false;
       om0.a(vOICE_PARTY_, b);
       return;
    }
}
