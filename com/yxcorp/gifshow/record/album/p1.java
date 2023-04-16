package com.yxcorp.gifshow.record.album.p1;
import java.io.FileFilter;
import java.lang.Object;
import java.io.File;
import java.lang.String;

public final class p1 implements FileFilter	// class@001747
{
    public static final p1 b;

    static {
       p1.b = new p1();
    }
    public void p1(){
       super();
    }
    public final boolean accept(File p0){
       boolean b = (p0.canRead() && (p0.isDirectory() && (p0.getName()).startsWith("kwai_lv_")))? true: false;
       return b;
    }
}
