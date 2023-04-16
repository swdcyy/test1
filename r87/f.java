package r87.f;
import java.lang.Runnable;
import r87.g;
import java.lang.Object;
import java.io.File;
import java.util.List;
import java.lang.System;
import r87.h;
import java.lang.String;
import b97.c;

public final class f implements Runnable	// class@00231a
{
    public final g b;

    public void f(g p0){
       this.b = p0;
    }
    public final void run(){
       f tb = this.b;
       List list = tb.j(tb.b);
       if (list == null) {
       }else {
          long l = System.currentTimeMillis();
          long l1 = (long)tb.a.b * 0x5265c00;
          for (int i = 0; i < list.size(); i = i + 1) {
             File uFile = list.get(i);
             long l2 = l - tb.g(uFile.getName());
             if (l2 - l1 >= 0) {
                list.get(i).getAbsolutePath();
                c.a(uFile);
             }
          }
       }
       return;
    }
}
