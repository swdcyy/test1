package com.kwai.performance.stability.crash.monitor.d;
import java.io.FileFilter;
import java.lang.Object;
import java.io.File;
import java.lang.String;
import kotlin.jvm.internal.a;

public final class d implements FileFilter	// class@0011ce
{
    public static final d b;

    static {
       d.b = new d();
    }
    public void d(){
       super();
    }
    public final boolean accept(File p0){
       a.p(p0, "file");
       return p0.isDirectory();
    }
}
