package aca.i;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.util.PostUtils;

public final class i implements g	// class@000095
{
    public static final i b;

    static {
       i.b = new i();
    }
    public void i(){
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "1")) {
       }else {
          PostUtils.D("VideoTemplateLoadingMW", "playImages", p0);
       }
       return;
    }
}