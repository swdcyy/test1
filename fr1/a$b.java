package fr1.a$b;
import androidx.lifecycle.ViewModelProvider$Factory;
import fr1.a;
import java.lang.Object;
import java.lang.Class;
import androidx.lifecycle.ViewModel;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import fr1.b;
import dr1.f;
import er1.c;
import xp5.g;
import com.kuaishou.live.common.core.component.multiline.renderpart.arenaline.widget.LiveMultiLineArenaLineMemberModel;
import xp5.i;
import oq1.b;

public final class a$b implements ViewModelProvider$Factory	// class@002387
{
    public final a a;

    public void a$b(a p0){
       this.a = p0;
       super();
    }
    public ViewModel create(Class p0){
       a$b obj = PatchProxy.applyOneRefs(p0, this, a$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "aClass");
       obj = this.a;
       b uob = new b(obj.k, obj.l, obj.m, obj.n, obj.o, obj.p, obj.q);
       return p0;
    }
}
