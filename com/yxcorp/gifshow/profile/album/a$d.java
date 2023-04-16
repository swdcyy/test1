package com.yxcorp.gifshow.profile.album.a$d;
import erd.o;
import com.yxcorp.gifshow.profile.album.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import brd.w;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.albumwrapper.imagecrop.ImageSelectSupplier$Type;
import brd.t;
import com.yxcorp.gifshow.albumwrapper.imagecrop.ImageSelectSupplier;

public final class a$d implements o	// class@001214
{
    public final a b;
    public final boolean c;

    public void a$d(a p0,boolean p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public Object apply(Object p0){
       t ot = PatchProxy.applyOneRefs(p0, this, a$d.class, "1");
       if (ot != PatchProxyResult.class) {
       }else {
          a.p(p0, "it");
          p0 = (this.c != null)? t.just(ImageSelectSupplier$Type.UNKNOWN): this.b.b();
          ot = p0;
       }
       return ot;
    }
}
