package nl9.i0;
import android.app.Activity;
import androidx.fragment.app.c;
import java.lang.String;
import mxb.i;
import com.kwai.framework.model.feed.BaseFeed;
import nl9.i0$a;
import java.lang.Object;
import tkd.b;
import tkd.d;
import nl9.u;
import nl9.i0$b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public class i0	// class@0031b9
{
    public final Activity a;
    public final c b;
    public final String c;
    public final String d;
    public final String e;
    public final i f;
    public final int g;
    public final boolean h;
    public final boolean i;

    public void i0(Activity p0,c p1,String p2,String p3,int p4,String p5,boolean p6,boolean p7,i p8,BaseFeed p9,i0$a p10){
       super();
       this.a = p0;
       this.b = p1;
       this.c = d.a(-1694791652).Fi(p2, p9);
       this.d = p3;
       this.g = p4;
       this.e = p5;
       this.h = p6;
       this.i = p7;
       this.f = p8;
    }
    public static i0$b a(){
       Object obj = PatchProxy.apply(null, null, i0.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new i0$b();
    }
}
