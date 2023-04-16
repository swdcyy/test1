package com.yxcorp.gifshow.postwork.j;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.String;
import com.yxcorp.gifshow.util.PostUtils;

public final class j implements g	// class@0010cd
{
    public static final j b;

    static {
       j.b = new j();
    }
    public void j(){
       super();
    }
    public final void accept(Object p0){
       PostUtils.D("PostWorkInfoCacheHelper", "loadCachedWorks", p0);
    }
}
