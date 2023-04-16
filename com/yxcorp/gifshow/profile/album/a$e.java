package com.yxcorp.gifshow.profile.album.a$e;
import erd.o;
import com.yxcorp.gifshow.profile.album.a;
import w69.i;
import com.yxcorp.gifshow.albumwrapper.imagecrop.ImageSelectSupplier$ImageSelectType;
import java.lang.Object;
import com.yxcorp.gifshow.albumwrapper.imagecrop.ImageSelectSupplier$Type;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import brd.w;
import kotlin.jvm.internal.a;
import brd.t;

public final class a$e implements o	// class@001215
{
    public final a b;
    public final i c;
    public final ImageSelectSupplier$ImageSelectType d;

    public void a$e(a p0,i p1,ImageSelectSupplier$ImageSelectType p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public Object apply(Object p0){
       t ot = PatchProxy.applyOneRefs(p0, this, a$e.class, "1");
       if (ot != PatchProxyResult.class) {
       }else {
          a.p(p0, "type");
          ot = this.b.k(this.c, this.d, p0);
       }
       return ot;
    }
}
