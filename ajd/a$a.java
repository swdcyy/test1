package ajd.a$a;
import byd.a;
import ajd.a;
import java.lang.Object;
import retrofit2.a;
import java.lang.Throwable;
import retrofit2.p;

public class a$a implements a	// class@000045
{
    public final a b;
    public final a c;

    public void a$a(a p0,a p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void onFailure(a p0,Throwable p1){
       this.b.onFailure(p0, p1);
    }
    public void onResponse(a p0,p p1){
       this.b.onResponse(p0, p1);
    }
}
