package com.yxcorp.gifshow.util.cdnresource.b;
import java.io.FileFilter;
import java.lang.Object;
import java.io.File;
import com.yxcorp.gifshow.util.cdnresource.CdnResource;
import java.lang.String;

public final class b implements FileFilter	// class@001f68
{
    public static final b b;

    static {
       b.b = new b();
    }
    public void b(){
       super();
    }
    public final boolean accept(File p0){
       return ((p0.getName()).equals(".DS_Store") ^ 0x01);
    }
}
