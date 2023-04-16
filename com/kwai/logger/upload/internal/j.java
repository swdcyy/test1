package com.kwai.logger.upload.internal.j;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.StringBuilder;
import java.lang.String;
import t87.d;

public final class j implements g	// class@000ed5
{
    public static final j b;

    static {
       j.b = new j();
    }
    public void j(){
       super();
    }
    public final void accept(Object p0){
       d.a("ObiwanUploader", "notify stage error"+p0.getMessage());
    }
}
