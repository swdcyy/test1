package com.yxcorp.gifshow.upload.x1;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.String;
import com.yxcorp.gifshow.util.PostUtils;

public final class x1 implements g	// class@001eb8
{
    public static final x1 b;

    static {
       x1.b = new x1();
    }
    public void x1(){
       super();
    }
    public final void accept(Object p0){
       PostUtils.D("UploadParamUtils", "uploadPhotoMeta", p0);
    }
}