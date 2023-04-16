package le9.d;
import le9.h;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.concurrent.ConcurrentHashMap;
import com.yxcorp.gifshow.camera.record.magic.dataConvey.model.MagicRequest;
import ne9.b;
import brd.t;

public abstract class d	// class@002dbc
{
    public final Map a;
    public final h b;

    public void d(h p0){
       a.p(p0, "callback");
       super();
       this.b = p0;
       this.a = new ConcurrentHashMap();
    }
    public final h a(){
       return this.b;
    }
    public abstract String b();
    public abstract t c(MagicRequest p0,b p1);
    public void d(){
    }
    public void e(){
    }
    public void f(){
    }
    public abstract boolean g(int p0);
}
