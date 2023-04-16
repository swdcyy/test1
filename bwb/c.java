package bwb.c;
import java.lang.Object;
import java.lang.String;
import bwb.c$a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import bwb.b;
import java.lang.Runnable;
import t45.c;

public class c	// class@0004cc
{

    public void c(){
       super();
    }
    public static void a(String p0,c$a p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, c.class, "1")) {
          return;
       }
       if (TextUtils.x(p0)) {
          return;
       }
       c.a(new b(p0, p1));
       return;
    }
}
