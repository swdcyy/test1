package com.kuaishou.webkit.internal.loader.InstallUtils$5;
import java.io.FileFilter;
import java.lang.Object;
import java.io.File;

public class InstallUtils$5 implements FileFilter	// class@001339
{

    public void InstallUtils$5(){
       super();
    }
    public boolean accept(File p0){
       if (p0.isDirectory()) {
          return true;
       }
       return false;
    }
}
