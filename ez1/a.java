package ez1.a;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.lang.System;

public class a	// class@002260
{
    public String a;
    public List b;
    public List c;

    public void a(){
       super();
    }
    public static String a(){
       Object obj = PatchProxy.apply(null, null, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new SimpleDateFormat("yyyyƒÍMM‘¬dd»’").format(new Date(System.currentTimeMillis()));
    }
}
