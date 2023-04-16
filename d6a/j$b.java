package d6a.j$b;
import d6a.k;
import qvb.i;
import java.lang.String;
import com.yxcorp.gifshow.detail.slideplay.SlideMediaType;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import com.kwai.robust.PatchProxyResult;
import d6a.i;
import d6a.h;

public class j$b extends k	// class@001ea0
{

    public void j$b(i p0,String p1,SlideMediaType p2){
       super(p0, p1, p2);
    }
    public boolean a(QPhoto p0,boolean p1){
       j$b uob = j$b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), this, uob, "1");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       return h.a(this, p0, true);
    }
}
