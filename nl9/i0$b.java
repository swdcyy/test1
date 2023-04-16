package nl9.i0$b;
import java.lang.Object;
import nl9.i0;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.app.Activity;
import androidx.fragment.app.c;
import mxb.i;
import com.kwai.framework.model.feed.BaseFeed;
import nl9.i0$a;

public class i0$b	// class@0031b8
{
    public Activity a;
    public c b;
    public String c;
    public String d;
    public int e;
    public String f;
    public boolean g;
    public boolean h;
    public i i;
    public BaseFeed j;

    public void i0$b(){
       super();
       this.d = "";
    }
    public i0 a(){
       Object obj = PatchProxy.apply(null, this, i0$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       i0 oi0 = new i0(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, null);
       return obj;
    }
    public i0$b b(Activity p0){
       this.a = p0;
       return this;
    }
    public i0$b c(i p0){
       this.i = p0;
       return this;
    }
    public i0$b d(boolean p0){
       this.g = p0;
       return this;
    }
    public i0$b e(boolean p0){
       this.h = p0;
       return this;
    }
    public i0$b f(BaseFeed p0){
       this.j = p0;
       return this;
    }
    public i0$b g(c p0){
       this.b = p0;
       return this;
    }
    public i0$b h(String p0){
       this.c = p0;
       return this;
    }
}
