package com.yxcorp.gifshow.corona.common.plugin.fragment.CoronaTVBiFeedsProxyFragment$a;
import erd.g;
import com.yxcorp.gifshow.corona.common.plugin.fragment.CoronaTVBiFeedsProxyFragment;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.String;
import ul5.e;
import vl5.b;

public final class CoronaTVBiFeedsProxyFragment$a implements g	// class@001261
{
    public final CoronaTVBiFeedsProxyFragment b;

    public void CoronaTVBiFeedsProxyFragment$a(CoronaTVBiFeedsProxyFragment p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       boolean b = p0.booleanValue();
       CoronaTVBiFeedsProxyFragment$a uoa = CoronaTVBiFeedsProxyFragment$a.class;
       if (PatchProxy.isSupport(uoa) && (!PatchProxy.applyVoidOneRefs(Boolean.valueOf(b), this, uoa, "1") && b)) {
          b.c(this.b.n.a(), "TV_TAB_PROXY_IS_SELECT");
       }
       return;
    }
}
