package jca.a$h;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.util.PostUtils;

public final class a$h implements g	// class@002a4e
{
    public static final a$h b;

    static {
       a$h.b = new a$h();
    }
    public void a$h(){
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$h.class, "1")) {
       }else {
          PostUtils.D("FineTuningPanelViewBinder", "mSeekBarSubject", p0);
       }
       return;
    }
}
