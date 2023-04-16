package com.kuaishou.weapon.ks.bu$1;
import java.io.FileFilter;
import java.lang.String;
import java.lang.Object;
import java.io.File;
import java.lang.CharSequence;

public final class bu$1 implements FileFilter	// class@0011f4
{
    public final String a;

    public void bu$1(String p0){
       this.a = p0;
       super();
    }
    public boolean accept(File p0){
       if (p0.isDirectory()) {
          return true;
       }
       if (((p0.getName()).toLowerCase()).contains(this.a)) {
          return true;
       }
       return false;
    }
}
