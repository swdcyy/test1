package com.loc.cc;
import com.loc.cg;
import java.lang.String;
import java.io.File;
import java.lang.Throwable;
import com.loc.an;

public final class cc extends cg	// class@0013b4
{
    public int a;
    public String b;

    public void cc(String p0,cg p1){
       super(p1);
       this.a = 30;
       this.b = p0;
    }
    public static int a(String p0){
       int i = 0;
       File uFile = new File(p0);
       if (!uFile.exists()) {
          return i;
       }
       i = uFile.list().length;
       return i;
    }
    public final boolean a(){
       if (cc.a(this.b) < this.a) {
          return false;
       }
       return true;
    }
}
