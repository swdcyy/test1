package pb.b;
import pb.b$a;
import java.lang.Object;
import java.util.List;
import com.facebook.common.internal.ImmutableList;
import java.lang.Boolean;
import ab.h;
import ab.i;
import rb.g;
import pb.f;

public class b	// class@002186
{
    public final ImmutableList a;
    public final f b;
    public final h c;
    public final g d;

    public void b(b$a p0){
       super();
       b$a a = p0.a;
       ImmutableList immutableLis = (a != null)? ImmutableList.copyOf(a): null;
       this.a = immutableLis;
       a = p0.b;
       if (a == null) {
          h oh = i.a(Boolean.FALSE);
       }
       this.c = a;
       this.b = p0.c;
       this.d = p0.d;
       return;
    }
    public ImmutableList a(){
       return this.a;
    }
    public h b(){
       return this.c;
    }
    public g c(){
       return this.d;
    }
    public f d(){
       return this.b;
    }
}
