package com.yxcorp.gifshow.util.b0;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.String;
import com.yxcorp.gifshow.util.PostUtils;

public final class b0 implements g	// class@001f5c
{
    public static final b0 b;

    static {
       b0.b = new b0();
    }
    public void b0(){
       super();
    }
    public final void accept(Object p0){
       PostUtils.D("MultiplePhotosWorkManager", "crop error", p0);
    }
}
