package m9a.e;
import java.lang.Integer;
import java.lang.Object;
import com.google.common.collect.ImmutableList;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.util.List;

public final class e	// class@002f7b
{
    public static final List a;

    static {
       Integer integer = Integer.valueOf(9);
       e.a = ImmutableList.of(Integer.valueOf(16), integer, Integer.valueOf(8), integer, Integer.valueOf(47), Integer.valueOf(82), Integer.valueOf(90));
    }
    public void e(){
       super();
    }
    public static boolean a(int p0,QPhoto p1){
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, null, uoe, "1");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       boolean b = (p1 != null && (!p1.isMine() && (p1.isArticle() || e.a.contains(Integer.valueOf(p0)))))? true: false;
       return b;
    }
}
