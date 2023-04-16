package bu7.y;
import java.util.concurrent.Callable;
import com.kwai.tokenshare.c;
import java.lang.Object;
import java.util.Objects;
import com.kwai.tokenshare.KwaiTokenInitModule;
import java.lang.Boolean;

public final class y implements Callable	// class@0004a1
{
    public final c b;

    public void y(c p0){
       this.b = p0;
    }
    public final Object call(){
       y tb = this.b;
       Objects.requireNonNull(tb);
       boolean b = (KwaiTokenInitModule.L)? tb.a.q0(): false;
       if (!b) {
          KwaiTokenInitModule.J = true;
       }
       return Boolean.valueOf(b);
    }
}
