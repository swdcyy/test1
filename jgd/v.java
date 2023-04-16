package jgd.v;
import java.lang.Object;
import com.yxcorp.gifshow.model.SelectOption;
import wgc.o;
import xgc.i;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import xgc.d;

public final class v	// class@0016f2
{

    public void v(){
       super();
    }
    public static i a(SelectOption p0,boolean p1,o p2){
       if (PatchProxy.isSupport(v.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Boolean.valueOf(p1), p2, null, v.class, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return d.a(p0, p1, p2);
    }
}
