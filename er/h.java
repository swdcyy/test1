package er.h;
import java.lang.Object;
import com.kuaishou.android.vader.Channel;
import er.i;
import er.j;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import er.b;

public abstract class h	// class@00158f
{

    public void h(){
       super();
    }
    public static h b(Channel p0,i p1,j p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, h.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new b(p0, p1, p2);
    }
    public abstract Channel a();
    public abstract i c();
    public abstract j d();
}
