package cj3.c;
import java.util.ArrayList;
import java.lang.Object;
import com.yxcorp.gifshow.entity.QPhoto;
import p5a.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.List;

public class c	// class@000571
{
    public static List a;
    public static List b;

    static {
       c.a = new ArrayList();
       c.b = new ArrayList();
    }
    public void c(){
       super();
    }
    public static c a(QPhoto p0){
       Object obj = null;
       Object obj1 = PatchProxy.applyOneRefs(p0, obj, c.class, "3");
       if (obj1 != PatchProxyResult.class) {
          return obj1;
       }
       if (p0 == null) {
          return obj;
       }
       int i = c.a.indexOf(p0.getPhotoId());
       if (i == -1) {
          return obj;
       }
       c.a.remove(i);
       return c.b.remove(i);
    }
}
