package en2.g;
import erd.g;
import com.kuaishou.live.core.show.wishlight.download.base.a$a;
import java.lang.String;
import java.lang.Object;
import java.lang.Boolean;
import com.kuaishou.live.core.show.wishlight.download.base.e;
import java.util.List;
import com.kuaishou.android.live.log.b;
import com.kuaishou.live.core.show.wishlight.download.base.LiveAvatarFailType;
import java.lang.RuntimeException;
import java.lang.Throwable;

public final class g implements g	// class@002795
{
    public final a$a b;
    public final String c;

    public void g(a$a p0,String p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       g tb = this.b;
       g tc = this.c;
       if (tb == null) {
          b.P(e.i, "callback == null, do nothing");
       }else if(p0.booleanValue()){
          tb.onSuccess(tc);
       }else {
          tb.a(LiveAvatarFailType.FRESCO_SDK_ERROR, "fresco internal error.", new RuntimeException("fresco internal error."));
       }
       return;
    }
}
