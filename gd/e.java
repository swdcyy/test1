package gd.e;
import ed.v;
import gd.d;
import android.os.Build$VERSION;
import gd.c;
import ed.d;
import z1.g;
import gd.a;

public class e	// class@0016d8
{

    public static d a(v p0,boolean p1){
       int i;
       if (Build$VERSION.SDK_INT >= 26) {
          i = p0.c();
          return new c(p0.a(), i, new g(i));
       }else {
          i = p0.c();
          return new a(p0.a(), i, new g(i));
       }
    }
}
