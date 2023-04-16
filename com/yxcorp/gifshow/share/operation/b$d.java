package com.yxcorp.gifshow.share.operation.b$d;
import erd.o;
import uo7.k;
import java.lang.Object;
import android.graphics.Bitmap;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import brd.w;
import kotlin.jvm.internal.a;
import brd.t;

public final class b$d implements o	// class@001c06
{
    public final k b;

    public void b$d(k p0){
       this.b = p0;
       super();
    }
    public Object apply(Object p0){
       t ot = PatchProxy.applyOneRefs(p0, this, b$d.class, "1");
       if (ot != PatchProxyResult.class) {
       }else {
          a.p(p0, "it");
          ot = t.just(this.b);
       }
       return ot;
    }
}
