package com.yxcorp.gifshow.albumwrapper.imagecrop.e;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import com.yxcorp.gifshow.albumwrapper.imagecrop.ImageSelectSupplier;
import java.lang.String;
import com.yxcorp.gifshow.util.PostUtils;

public final class e implements g	// class@001b67
{
    public static final e b;

    static {
       e.b = new e();
    }
    public void e(){
       super();
    }
    public final void accept(Object p0){
       PostUtils.D(ImageSelectSupplier.n, p0.toString(), p0);
    }
}
