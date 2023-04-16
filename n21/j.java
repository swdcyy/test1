package n21.j;
import n21.j$a;
import java.lang.reflect.Type;
import el.a;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.lang.System;

public class j	// class@003291
{
    public static final Type a;
    public static Map b;

    static {
       j.a = new j$a().getType();
    }
    public void j(){
       super();
    }
    public static String a(){
       Object obj = PatchProxy.apply(null, null, j.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new SimpleDateFormat("yyyy.MM.dd").format(new Date(System.currentTimeMillis()));
    }
}
