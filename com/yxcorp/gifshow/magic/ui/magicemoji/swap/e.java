package com.yxcorp.gifshow.magic.ui.magicemoji.swap.e;
import erd.o;
import java.lang.Object;
import java.lang.Integer;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.Pair;
import kotlin.jvm.internal.a;

public final class e implements o	// class@001c3b
{
    public final int b;

    public void e(int p0){
       this.b = p0;
       super();
    }
    public Object apply(Object p0){
       Pair pair = PatchProxy.applyOneRefs(p0, this, e.class, "1");
       if (pair != PatchProxyResult.class) {
       }else {
          a.p(p0, "it");
          pair = new Pair(Integer.valueOf(this.b), p0);
       }
       return pair;
    }
}
