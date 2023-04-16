package aca.k;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.util.PostUtils;

public final class k implements g	// class@000097
{
    public static final k b;

    static {
       k.b = new k();
    }
    public void k(){
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k.class, "1")) {
       }else {
          PostUtils.D("VideoTemplateLoadingMW", "playImages", p0);
       }
       return;
    }
}
