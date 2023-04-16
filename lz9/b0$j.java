package lz9.b0$j;
import com.yxcorp.gifshow.detail.trigger.ActionTrigger$c;
import lz9.b0$b;
import com.yxcorp.gifshow.detail.trigger.ActionTrigger$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public class b0$j extends ActionTrigger$c	// class@002ed4
{

    public void b0$j(){
       super();
    }
    public void b0$j(b0$b p0){
       super();
    }
    public boolean a(ActionTrigger$a p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b0$j.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0.e - 7000 < 0) {
          return false;
       }
       return super.a(p0);
    }
    public long b(){
       return 7000;
    }
    public boolean c(){
       return false;
    }
}
