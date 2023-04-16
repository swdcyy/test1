package b56.b;
import b56.f0$b;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import lnc.a1;

public class b implements f0$b	// class@0003f7
{

    public void b(){
       super();
    }
    public void a(View p0,boolean p1){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, uob, "1")) {
          return;
       }
       if (p1) {
          Object obj = PatchProxy.apply(null, this, uob, "2");
          int i = (obj != PatchProxyResult.class)? obj.intValue(): a1.d(R.dimen.arg_RES_7f071113);
          p0.setTranslationY((float)(- i));
       }else {
          p0.setTranslationY(0);
       }
       return;
    }
}
