package lq1.c$h;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import lq1.d;
import java.util.List;
import com.kuaishou.android.live.log.b;

public final class c$h implements g	// class@002ffe
{
    public static final c$h b;

    static {
       c$h.b = new c$h();
    }
    public void c$h(){
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c$h.class, "1")) {
       }else {
          b.y(d.a, "switchChatMode ", p0);
       }
       return;
    }
}
