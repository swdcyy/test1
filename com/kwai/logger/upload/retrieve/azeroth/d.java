package com.kwai.logger.upload.retrieve.azeroth.d;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.StringBuilder;
import java.lang.String;
import t87.d;

public final class d implements g	// class@000eeb
{
    public static final d b;

    static {
       d.b = new d();
    }
    public void d(){
       super();
    }
    public final void accept(Object p0){
       d.b("ObiwanUploader", "LogDispatcherError:"+p0.getMessage());
    }
}
