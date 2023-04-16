package com.yxcorp.gifshow.upload.t0;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.String;
import com.yxcorp.gifshow.util.PostUtils;

public final class t0 implements g	// class@001eab
{
    public static final t0 b;

    static {
       t0.b = new t0();
    }
    public void t0(){
       super();
    }
    public final void accept(Object p0){
       PostUtils.D("PostWorkUtils", "cleanWorkspace", p0);
    }
}
