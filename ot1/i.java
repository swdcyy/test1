package ot1.i;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.common.core.basic.debuglog.LiveCommonLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;

public final class i implements g	// class@003588
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
          b.Z(LiveCommonLogTag.MULTI_PK, "showSprintAnimError");
       }
       return;
    }
}
