package laa.c;
import com.yxcorp.gifshow.edit.draft.model.c$b;
import laa.e;
import java.lang.Object;

public final class c	// class@002d7d
{

    public static boolean a(c$b p0,e p1,e p2){
       Object obj = null;
       p1 = (p1 != null)? p0.d(p1): obj;
       if (p2 != null) {
          obj = p0.d(p2);
       }
       boolean b = true;
       if (p1 == null || obj == null) {
          if (p1 == obj) {
             b = false;
          }
          return b;
       }else {
          return (p1.equals(obj) ^ b);
       }
    }
    public static int b(c$b p0,int p1){
       p1++;
       return p1;
    }
}
