package c24.j0;
import ms3.c;
import java.lang.String;
import android.view.View;
import hu4.h;
import java.lang.Object;
import ms3.c$a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import c24.j0$a;

public final class j0 implements c	// class@000482
{
    public final long a;
    public final String b;
    public final View c;
    public final int d;
    public final int e;
    public final h f;

    public void j0(long p0,String p1,View p2,int p3,int p4,h p5){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       this.f = p5;
       super();
    }
    public String a(){
       return this.b;
    }
    public c$a b(){
       Object obj = PatchProxy.apply(null, this, j0.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new j0$a(this);
    }
    public View c(){
       return this.c;
    }
    public String getContent(){
       return "";
    }
    public long getDuration(){
       return this.a;
    }
    public int getHeight(){
       return this.e;
    }
    public String getIconUrl(){
       return "";
    }
    public int getWidth(){
       return this.d;
    }
}
