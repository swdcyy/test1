package com.yxcorp.gifshow.upload.u1;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.String;
import com.yxcorp.gifshow.util.PostUtils;

public final class u1 implements g	// class@001eaf
{
    public static final u1 b;

    static {
       u1.b = new u1();
    }
    public void u1(){
       super();
    }
    public final void accept(Object p0){
       PostUtils.D("UploadManager", "CloudVideoUploader failed ", p0);
    }
}
