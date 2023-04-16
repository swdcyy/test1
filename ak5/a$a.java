package ak5.a$a;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.IllegalArgumentException;

public final class a$a	// class@0000b7
{
    public boolean a;
    public a$c b;
    public a$b c;
    public a$d d;
    public int e;
    public int f;
    public k g;
    public q h;
    public k i;
    public boolean j;
    public boolean k;
    public e l;
    public b m;

    public void a$a(){
       super();
       this.e = 158;
       this.f = 14;
       this.j = true;
    }
    public static void a(Object p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, a$a.class, "2")) {
          return;
       }
       if (p0 != null) {
          return;
       }
       Object[] objArray = new Object[]{"EmotionSDKConfig",p1};
       throw new IllegalArgumentException(String.format("%s:%smust be set!", objArray));
    }
}
