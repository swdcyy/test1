package en2.i;
import java.lang.String;
import java.lang.Object;
import com.kuaishou.live.core.show.wishlight.download.base.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kuaishou.live.core.show.wishlight.download.base.e;
import java.lang.IllegalArgumentException;

public class i	// class@002797
{
    public String a;
    public long b;
    public int c;
    public int d;
    public boolean e;
    public boolean f;

    public void i(String p0){
       super();
       this.e = true;
       this.f = true;
       this.a = p0;
    }
    public a a(){
       Object obj = PatchProxy.apply(null, this, i.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!TextUtils.isEmpty(this.a)) {
          return new e(this);
       }
       throw new IllegalArgumentException("mRootPath is null");
    }
    public int b(){
       return this.d;
    }
    public long c(){
       return this.b;
    }
    public int d(){
       return this.c;
    }
    public i e(boolean p0){
       this.f = p0;
       return this;
    }
    public i f(boolean p0){
       this.e = p0;
       return this;
    }
    public i g(int p0,int p1){
       this.c = p0;
       this.d = p1;
       return this;
    }
}
