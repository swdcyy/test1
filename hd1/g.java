package hd1.g;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.lang.System;

public class g	// class@002675
{
    public String a;
    public int b;
    public boolean c;

    public void g(){
       super();
    }
    public static String a(){
       Object obj = PatchProxy.apply(null, null, g.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new SimpleDateFormat("yyyyƒÍMM‘¬dd»’").format(new Date(System.currentTimeMillis()));
    }
}
