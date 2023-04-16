package com.meizu.cloud.pushsdk.b.e$1;
import java.io.FileFilter;
import com.meizu.cloud.pushsdk.b.e;
import java.lang.Object;
import java.io.File;
import java.lang.String;

public class e$1 implements FileFilter	// class@0014ae
{
    public final e a;

    public void e$1(e p0){
       this.a = p0;
       super();
    }
    public boolean accept(File p0){
       return (p0.getName()).endsWith(".log.txt");
    }
}
