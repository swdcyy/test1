package cw1.o0;
import ok.o;
import cw1.d0;
import java.lang.Object;
import com.kwai.feature.api.live.base.service.pendant.pendantgroup.LivePendantContainerScene;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.util.List;

public final class o0 implements o	// class@001e74
{
    public final d0 b;

    public void o0(d0 p0){
       this.b = p0;
    }
    public final boolean apply(Object p0){
       o0 tb = this.b;
       Objects.requireNonNull(tb);
       Object obj = PatchProxy.applyOneRefs(p0, tb, d0.class, "3");
       boolean b = (obj != PatchProxyResult.class)? obj.booleanValue(): tb.b.contains(p0);
       return b;
    }
}
