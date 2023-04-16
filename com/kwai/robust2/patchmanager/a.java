package com.kwai.robust2.patchmanager.a;
import java.io.FileFilter;
import java.lang.Object;
import java.io.File;
import com.kwai.robust2.patchmanager.b;

public final class a implements FileFilter	// class@000ef2
{
    public static final a b;

    static {
       a.b = new a();
    }
    public void a(){
       super();
    }
    public final boolean accept(File p0){
       return b.q(p0);
    }
}
