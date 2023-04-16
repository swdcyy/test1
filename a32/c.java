package a32.c;
import erd.g;
import a32.e;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Objects;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import java.lang.String;
import com.kuaishou.android.live.log.b;

public final class c implements g	// class@00001e
{
    public final e b;

    public void c(e p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       c tb = this.b;
       Objects.requireNonNull(tb);
       b.c0(LiveLogTag.MULTI_WINDOW, "onMultiWindowModeSwitchSucceed", "isMultiWindow", p0);
       if (p0.booleanValue()) {
          tb.S8();
       }else {
          tb.R8();
       }
       return;
    }
}
