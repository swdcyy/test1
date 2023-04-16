package com.kwai.nearby.local.pendant.b;
import java.io.FileFilter;
import java.lang.Object;
import java.io.File;
import cd7.g;

public final class b implements FileFilter	// class@000fa1
{
    public static final b b;

    static {
       b.b = new b();
    }
    public void b(){
       super();
    }
    public final boolean accept(File p0){
       boolean b = (p0.isFile() && !p0.isHidden())? true: false;
       return b;
    }
}
