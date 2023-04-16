package com.kuaishou.webkit.internal.loader.InstallUtils$6;
import java.io.FilenameFilter;
import java.lang.Object;
import java.io.File;
import java.lang.String;

public class InstallUtils$6 implements FilenameFilter	// class@00133a
{

    public void InstallUtils$6(){
       super();
    }
    public boolean accept(File p0,String p1){
       return new File(p0, p1).isDirectory();
    }
}
