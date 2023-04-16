package l69.w$a$a$b;
import java.lang.Runnable;
import l69.w$a$a;
import java.io.IOException;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import l69.w$a;
import com.yxcorp.gifshow.aicut.api.AICutStyle;
import java.lang.Throwable;
import i69.j;

public final class w$a$a$b implements Runnable	// class@002cb0
{
    public final w$a$a b;
    public final IOException c;

    public void w$a$a$b(w$a$a p0,IOException p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, w$a$a$b.class, "1")) {
          return;
       }
       w$a$a b = this.b.b;
       b.e.b(b.d, this.c);
       return;
    }
}
