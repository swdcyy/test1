package com.smile.gifshow.post.profile.d;
import erd.o;
import com.smile.gifshow.post.profile.MiYouImageSelectSupplier$b;
import com.yxcorp.gifshow.albumwrapper.imagecrop.ImageSelectSupplier$Type;
import java.lang.Object;
import zq8.a;
import java.lang.String;
import kotlin.jvm.internal.a;
import w69.i;
import com.yxcorp.gifshow.albumwrapper.imagecrop.ImageSelectSupplier$ImageSelectType;
import com.yxcorp.gifshow.albumwrapper.imagecrop.ImageSelectSupplier;
import brd.t;

public final class d implements o	// class@000c60
{
    public final MiYouImageSelectSupplier$b b;
    public final ImageSelectSupplier$Type c;

    public void d(MiYouImageSelectSupplier$b p0,ImageSelectSupplier$Type p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public Object apply(Object p0){
       a.p(p0, "permission");
       if (p0.b != null) {
          p0 = this.b;
          p0.b.c(p0.c, this.c, p0.d);
          p0 = this.b.b.b;
       }else {
          p0 = t.empty();
       }
       return p0;
    }
}
