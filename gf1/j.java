package gf1.j;
import ok.x;
import com.kuaishou.live.common.core.component.comments.fluency.quick.j;
import lp3.e;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import xp5.g;
import lp3.c;

public final class j implements x	// class@0024c3
{
    public final j b;
    public final e c;

    public void j(j p0,e p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final Object get(){
       j tb = this.b;
       j tc = this.c;
       Objects.requireNonNull(tb);
       String str = PatchProxy.applyOneRefs(tc, tb, j.class, "5");
       if (str != PatchProxyResult.class) {
       }else {
          str = tc.a(g.class).getLiveStreamId();
       }
       return str;
    }
}
