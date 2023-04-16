package d6a.j;
import java.lang.Object;
import qvb.i;
import java.lang.String;
import com.yxcorp.gifshow.detail.slideplay.SlideMediaType;
import d6a.i;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import d6a.j$a;
import d6a.j$c;
import d6a.j$d;
import d6a.j$b;
import d6a.k;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import java.lang.Boolean;
import d6a.j$e;

public class j	// class@001ea4
{

    public void j(){
       super();
    }
    public static i a(i p0,String p1,SlideMediaType p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, j.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new j$a(p0, p1, p2);
    }
    public static i b(i p0,String p1,SlideMediaType p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, j.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new j$c(p0, p1, p2);
    }
    public static i c(i p0,String p1,SlideMediaType p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, j.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new j$d(p0, p1, p2);
    }
    public static i d(i p0,String p1,SlideMediaType p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, j.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new j$b(p0, p1, p2);
    }
    public static i e(i p0,String p1,SlideMediaType p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, j.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new k(p0, p1, p2);
    }
    public static i f(BaseFragment p0,i p1,SlideMediaType p2,String p3,boolean p4){
       j oj = j.class;
       if (PatchProxy.isSupport(oj)) {
          Object[] objArray = new Object[]{p0,p1,p2,null,Boolean.valueOf(p4)};
          oj = PatchProxy.apply(objArray, null, oj, "7");
          if (oj != PatchProxyResult.class) {
             return oj;
          }
       }
       if (p4) {
          return new j$e(p1, null, p0, p2);
       }else {
          return null;
       }
    }
}
