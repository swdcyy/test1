package co5.k;
import com.kwai.framework.model.kcube.TabViewInfo$TabIcon;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public class k	// class@00071c
{
    public final TabViewInfo$TabIcon a;
    public final TabViewInfo$TabIcon b;
    public final boolean c;

    public void k(boolean p0,TabViewInfo$TabIcon p1,TabViewInfo$TabIcon p2){
       super();
       this.c = p0;
       this.a = p1;
       this.b = p2;
    }
    public static k a(){
       Object obj = PatchProxy.apply(null, null, k.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new k(false, null, null);
    }
    public static k b(TabViewInfo$TabIcon p0,TabViewInfo$TabIcon p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, k.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new k(true, p0, p1);
    }
}
