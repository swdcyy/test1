package com.yxcorp.gifshow.profile.album.a$f;
import erd.o;
import com.yxcorp.gifshow.profile.album.a;
import w69.i;
import com.yxcorp.gifshow.albumwrapper.imagecrop.ImageSelectSupplier$Type;
import com.yxcorp.gifshow.albumwrapper.imagecrop.ImageSelectSupplier$ImageSelectType;
import java.lang.Object;
import zq8.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import brd.w;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.albumwrapper.imagecrop.ImageSelectSupplier;
import brd.t;

public final class a$f implements o	// class@001216
{
    public final a b;
    public final i c;
    public final ImageSelectSupplier$Type d;
    public final ImageSelectSupplier$ImageSelectType e;

    public void a$f(a p0,i p1,ImageSelectSupplier$Type p2,ImageSelectSupplier$ImageSelectType p3){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       super();
    }
    public Object apply(Object p0){
       ImageSelectSupplier imageSelectS = PatchProxy.applyOneRefs(p0, this, a$f.class, "1");
       if (imageSelectS != PatchProxyResult.class) {
       }else {
          a.p(p0, "permission");
          if (p0.b != null) {
             this.b.c(this.c, this.d, this.e);
             imageSelectS = this.b.b;
          }else {
             imageSelectS = t.empty();
          }
       }
       return imageSelectS;
    }
}
