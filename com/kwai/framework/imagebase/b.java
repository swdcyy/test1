package com.kwai.framework.imagebase.b;
import g0d.a;
import java.lang.Object;
import com.yxcorp.image.common.exception.ImageInitializeThrowable;
import java.lang.Throwable;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;

public final class b implements a	// class@000b59
{
    public static final b a;

    static {
       b.a = new b();
    }
    public void b(){
       super();
    }
    public final void a(ImageInitializeThrowable p0){
       ExceptionHandler.handleCaughtException(p0);
    }
}
