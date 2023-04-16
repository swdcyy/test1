package laa.d;
import com.yxcorp.gifshow.edit.draft.model.c$c;
import laa.e;
import java.lang.Object;
import com.yxcorp.gifshow.edit.draft.model.c$b;
import java.lang.String;

public final class d	// class@002d7f
{

    public static int a(c$c p0,e p1){
       if (p1 == null || (p0.d(p1)).isEmpty()) {
          return 0;
       }
       return 1;
    }
    public static boolean b(c$c p0,e p1,e p2){
       String str = "";
       String str1 = (p1 != null)? p0.d(p1): str;
       if (p2 != null) {
          str = p0.d(p2);
       }
       return (str1.equals(str) ^ 0x01);
    }
}
