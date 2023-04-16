package g93.a;
import lc1.b;
import androidx.lifecycle.LifecycleOwner;
import ip3.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import g93.a$a;
import g93.a$b;
import z1.a;
import java.util.List;
import lc1.a;
import lc1.f;

public abstract class a implements b	// class@002ad2
{
    public final a b;

    public void a(LifecycleOwner p0,a p1){
       a.p(p0, "lifecycleOwner");
       a.p(p1, "receiveCommentNoticeService");
       super();
       this.b = p1;
       p1.a(p0, new a$a(this), new a$b(this));
    }
    public List b(){
       return a.c(this);
    }
    public f c(){
       return a.b(this);
    }
    public void dispose(){
       a.a(this);
    }
}
