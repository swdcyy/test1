package ay7.c;
import erd.g;
import com.kwai.yoda.function.c;
import com.kwai.yoda.bridge.YodaBaseWebView;
import java.lang.String;
import java.lang.Object;
import java.lang.Throwable;
import java.util.Objects;
import xz7.f;

public final class c implements g	// class@0002e4
{
    public final c b;
    public final YodaBaseWebView c;
    public final String d;
    public final String e;
    public final String f;

    public void c(c p0,YodaBaseWebView p1,String p2,String p3,String p4){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
    }
    public final void accept(Object p0){
       c tb = this.b;
       Objects.requireNonNull(tb);
       tb.o(this.c, this.d, this.e, f.a(p0), p0.getMessage(), this.f);
    }
}
