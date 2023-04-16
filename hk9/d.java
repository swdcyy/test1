package hk9.d;
import ik9.d;
import java.lang.Object;
import com.yxcorp.gifshow.comment.fragment.CommentsFragment;
import kk9.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import hk9.a;

public class d implements d	// class@0026a0
{

    public void d(){
       super();
    }
    public int a(){
       return 0x7f0d01f5;
    }
    public a b(CommentsFragment p0){
       p0 = PatchProxy.applyOneRefs(p0, this, d.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       return new a();
    }
    public int c(){
       return 0x7f0a34da;
    }
}
