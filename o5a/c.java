package o5a.c;
import erd.o;
import java.lang.Object;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.model.CDNUrl;
import o5a.n;
import qc6.b$d;

public final class c implements o	// class@0032a2
{
    public static final c b;

    static {
       c.b = new c();
    }
    public void c(){
       super();
    }
    public final Object apply(Object p0){
       b$d uod = new b$d();
       uod.a = n.n(p0);
       uod.b = p0.getDefaultVideoCdnUrl();
       return uod;
    }
}
