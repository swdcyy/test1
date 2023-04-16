package bx9.j;
import um5.b;
import java.lang.Object;
import com.yxcorp.gifshow.comment.fragment.CommentsFragment;
import com.yxcorp.gifshow.entity.QPhoto;
import um5.a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import bx9.h;
import java.lang.Integer;
import bx9.a;
import java.util.Objects;
import hx9.e;

public class j implements b	// class@000507
{

    public void j(){
       super();
    }
    public a ge(CommentsFragment p0,QPhoto p1){
       a obj = PatchProxy.applyTwoRefs(p0, p1, this, j.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int i = 2;
       if (PatchProxy.isSupport(h.class)) {
          obj = PatchProxy.applyThreeRefs(p0, p1, Integer.valueOf(i), null, h.class, "1");
          if (obj != PatchProxyResult.class) {
          label_0031 :
             Objects.requireNonNull(obj);
             return obj;
          }
       }
       obj = new a(p0, p1);
       goto label_0031 ;
    }
    public boolean isAvailable(){
       return true;
    }
    public void nv(String p0,Integer p1,QPhoto p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, j.class, "2")) {
          return;
       }
       e.a.a(p0, p1.intValue(), p2);
       return;
    }
}
