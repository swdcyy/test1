package com.yxcorp.gifshow.share.operation.b$e;
import erd.o;
import uo7.k;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import e17.i;
import au6.e;

public final class b$e implements o	// class@001c07
{
    public final k b;

    public void b$e(k p0){
       this.b = p0;
       super();
    }
    public Object apply(Object p0){
       Object obj = p0;
       p0 = PatchProxy.applyOneRefs(obj, this, b$e.class, "1");
       if (p0 != PatchProxyResult.class) {
       }else {
          a.p(obj, "it");
          i.a(R.style.arg_RES_7f11066a, 0x7f1043cb);
          e.b(e.a, null, "save painter failed, downloadPanelPoster error ", obj, 1, null);
          p0 = this.b;
       }
       return p0;
    }
}
