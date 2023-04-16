package com.yxcorp.gifshow.init.module.o;
import com.kwai.library.widget.icon.b$c;
import java.lang.Object;
import java.lang.Throwable;
import com.yxcorp.gifshow.init.module.DayNightInitModule;
import com.kwai.library.widget.icon.KwaiIconException;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;

public final class o implements b$c	// class@0019d1
{
    public static final o a;

    static {
       o.a = new o();
    }
    public void o(){
       super();
    }
    public final void a(Throwable p0){
       ExceptionHandler.handleCaughtException(new KwaiIconException(p0));
    }
}
