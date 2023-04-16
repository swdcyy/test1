package clc.d;
import com.kwai.framework.player.core.b$b;
import clc.f;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import p5a.e;
import de5.a;
import com.kwai.framework.player.core.b;
import com.yxcorp.gifshow.entity.QPhoto;
import e1a.p;

public final class d implements b$b	// class@0005ca
{
    public final f b;

    public void d(f p0){
       this.b = p0;
    }
    public final void d(int p0){
       d tb = this.b;
       Objects.requireNonNull(tb);
       if (p0 != 4) {
       }else if(!PatchProxy.applyVoid(null, tb, f.class, "1") && tb.p != null){
          p.g(tb.q.getPlayer(), tb.p);
       }
       return;
    }
}
