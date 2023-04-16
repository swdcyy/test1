package com.kwai.performance.stability.crash.monitor.internal.c;
import java.io.FileFilter;
import java.lang.Object;
import java.io.File;
import com.kwai.performance.stability.crash.monitor.internal.ExceptionReporter;
import java.lang.String;
import kotlin.jvm.internal.a;

public final class c implements FileFilter	// class@0011e9
{
    public static final c b;

    static {
       c.b = new c();
    }
    public void c(){
       super();
    }
    public final boolean accept(File p0){
       a.p(p0, "file");
       return p0.isDirectory();
    }
}
