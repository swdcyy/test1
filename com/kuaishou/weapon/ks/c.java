package com.kuaishou.weapon.ks.c;
import android.os.FileObserver;
import java.lang.String;
import java.io.File;
import com.kuaishou.weapon.ks.r;
import com.kuaishou.weapon.ks.c$1;
import java.lang.Runnable;

public class c extends FileObserver	// class@001203
{
    public String a;
    public String b;

    public void c(String p0,String p1){
       super(p0, 4095);
       this.a = p0;
       this.b = p1;
    }
    public static String a(c p0){
       return p0.a;
    }
    public static String b(c p0){
       return p0.b;
    }
    public boolean a(){
       boolean b = false;
       File uFile = new File(this.b);
       if (uFile.exists()) {
          uFile.delete();
          b = true;
       }
       return b;
    }
    public void onEvent(int p0,String p1){
       if (p0 == 2 || (p0 == 4 || (p0 == 64 || (p0 == 128 || (p0 == 512 || (p0 == 1024 || p0 == 2048)))))) {
          r.a().a(new c$1(this));
       }
       return;
    }
}
