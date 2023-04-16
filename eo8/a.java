package eo8.a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.os.SystemClock;

public class a	// class@00221d
{
    public int a;
    public int b;
    public long c;

    public void a(){
       super();
       this.a = Integer.MIN_VALUE;
       this.b = Integer.MIN_VALUE;
       this.c = -11;
    }
    public boolean a(int p0,int p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uoa, "1");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       long l = SystemClock.uptimeMillis();
       boolean b = ((l - this.c) - 10 <= 0 && (this.a != p0 || this.b != p1))? true: false;
       this.c = l;
       this.a = p0;
       this.b = p1;
       return b;
    }
}
