package bd7.c;
import com.kwai.library.widget.popup.common.PopupInterface$f;
import bd7.e;
import com.kwai.nearby.local.migrate.view.NearbyMigrateGuideView$b;
import java.lang.Object;
import com.kwai.library.widget.popup.common.c;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.nearby.local.migrate.view.NearbyMigrateGuideView;
import android.content.Context;
import kotlin.jvm.internal.a;
import android.util.AttributeSet;
import nsd.u;
import bd7.c$a;
import o07.n;

public final class c implements PopupInterface$f	// class@000408
{
    public final e b;
    public final NearbyMigrateGuideView$b c;

    public void c(e p0,NearbyMigrateGuideView$b p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final View a(c p0,LayoutInflater p1,ViewGroup p2,Bundle p3){
       e c;
       p0 = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, c.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       p0 = this.b;
       Context context = (p2 != null)? p2.getContext(): 0;
       Context uContext = context;
       a.m(uContext);
       NearbyMigrateGuideView nearbyMigrat = new NearbyMigrateGuideView(uContext, null, 0, 6, null);
       p0.c = PatchProxyResult.class;
       c = this.b.c;
       if (c != null) {
          c.setOnVisibleChangeListener(new c$a(this));
       }
       c = this.b.c;
       a.m(c);
       return c;
    }
    public void b(c p0){
       n.a(this, p0);
    }
}
