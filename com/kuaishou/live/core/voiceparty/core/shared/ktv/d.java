package com.kuaishou.live.core.voiceparty.core.shared.ktv.d;
import erd.o;
import java.lang.Object;
import com.kuaishou.livestream.message.nano.KtvMusicOrderInfo;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import brd.w;
import kotlin.jvm.internal.a;
import com.kuaishou.livestream.message.nano.KtvMusicInfo;
import yx2.p;
import brd.t;
import t45.d;
import brd.z;
import yx2.o;
import com.kuaishou.live.core.voiceparty.util.d;

public final class d implements o	// class@001446
{
    public static final d b;

    static {
       d.b = new d();
    }
    public void d(){
       super();
    }
    public Object apply(Object p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       object obj = PatchProxy.applyOneRefs(p0, this, d.class, "1");
       if (obj != patchProxyRe) {
       }else {
          a.p(p0, "it");
          obj = p0.musicInfo.lrcUrl[0];
          Object obj1 = PatchProxy.applyTwoRefs(obj, p0, null, p.class, "2");
          obj = (obj1 != patchProxyRe)? obj1: t.just(obj).observeOn(d.c).map(new o(p0)).map(d.b).observeOn(d.a);
       }
       return obj;
    }
}
