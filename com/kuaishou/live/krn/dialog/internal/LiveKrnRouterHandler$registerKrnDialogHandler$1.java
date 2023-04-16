package com.kuaishou.live.krn.dialog.internal.LiveKrnRouterHandler$registerKrnDialogHandler$1;
import msd.p;
import kotlin.jvm.internal.Lambda;
import s63.q;
import java.lang.Object;
import java.lang.String;
import msd.l;
import o63.d;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import xp5.g;
import lp3.c;
import lp3.e;
import android.net.Uri;

public final class LiveKrnRouterHandler$registerKrnDialogHandler$1 extends Lambda implements p	// class@001d5e
{
    public final q this$0;

    public void LiveKrnRouterHandler$registerKrnDialogHandler$1(q p0){
       this.this$0 = p0;
       super(2);
    }
    public Object invoke(Object p0,Object p1){
       return this.invoke(p0, p1);
    }
    public final d invoke(String p0,l p1){
       c obj = PatchProxy.applyTwoRefs(p0, p1, this, LiveKrnRouterHandler$registerKrnDialogHandler$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "url");
       obj = this.this$0.d.a(g.class);
       a.o(obj, "liveServiceManager.getSe¡­eInfoManager::class.java\)");
       Uri uri = Uri.parse(p0);
       a.o(uri, "Uri.parse\(url\)");
       return this.this$0.c(uri, obj.getLiveStreamId(), p1, "BRIDGE");
    }
}
