package k71.a;
import com.kuaishou.live.jsbridge.AbstractLiveJsCommand;
import java.lang.Class;
import java.lang.Object;
import o63.j$a;
import asd.c;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import lp3.e;
import or5.d;
import lp3.c;
import kotlin.jvm.internal.a;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import or5.b;
import rp5.a;
import android.app.Activity;
import tkd.b;
import tkd.d;
import f37.y;
import o63.m;
import o63.m$a;

public final class a extends AbstractLiveJsCommand	// class@002ca1
{

    public void a(){
       super();
    }
    public Class a(){
       return null;
    }
    public Object l(Object p0,j$a p1,c p2){
       p0 = PatchProxy.applyThreeRefs(p0, p1, p2, this, a.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       p0 = this.h().a(d.class);
       a.o(p0, "serviceManager.getServic¡­eInfoManager::class.java\)");
       d.a(0x6fa7b5d6).zm(this.h().a(a.class).c(), p0.j0());
       return m$a.g(m.g, null, false, 3, null);
    }
}
