package m69.e;
import j69.g;
import java.lang.Object;
import java.lang.CharSequence;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import kotlin.jvm.internal.a;
import e17.i;

public final class e implements g	// class@002e15
{

    public void e(){
       super();
    }
    public void a(CharSequence p0,int p1){
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoe, "1")) {
          return;
       }
       a.p(p0, "text");
       i.e(R.style.arg_RES_7f11066a, p0, p1);
       return;
    }
}
