package ab4.c;
import cb4.c;
import cb4.f;
import com.kuaishou.merchant.router.base.RouterRequest;
import cb4.e;
import java.lang.Object;

public final class c implements c	// class@00005c
{
    public final f a;
    public final RouterRequest b;
    public final e c;

    public void c(f p0,RouterRequest p1,e p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public final void onResult(boolean p0){
       this.a.d(this.b, this.c, p0);
    }
}
