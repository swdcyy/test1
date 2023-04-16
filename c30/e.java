package c30.e;
import iu4.c;
import com.kuaishou.cover.container.loader.a;
import java.lang.Object;
import java.lang.String;
import tx4.h;
import iu4.b;
import java.util.Objects;
import java.lang.StringBuilder;
import d30.c;
import c30.f;
import java.lang.Runnable;
import iq8.x;

public final class e implements c	// class@0002e8
{
    public final a a;

    public void e(a p0){
       this.a = p0;
    }
    public Object a(String p0,String p1,h p2){
       return b.a(this, p0, p1, p2);
    }
    public final Object b(String p0,String p1){
       e ta = this.a;
       Objects.requireNonNull(ta);
       StringBuilder str = "UnitLoader: invoke functionName";
       String str1 = (p0 == null)? "": p0;
       c.d(str+str1);
       if (("closeV2").equals(p0)) {
          x.f(new f(ta));
       }
       return null;
    }
    public boolean c(String p0){
       return b.b(this, p0);
    }
}
