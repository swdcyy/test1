package o6b.a;
import com.kwai.android.common.bean.Channel;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import nsd.u;

public final class a	// class@001fad
{
    public final Channel a;
    public final int b;

    public void a(Channel p0,int p1){
       a.p(p0, "channel");
       super();
       this.a = p0;
       this.b = p1;
    }
    public void a(Channel p0,int p1,int p2,u p3){
       if (p2 & 0x02) {
          p1 = 0;
       }
       super(p0, p1);
       return;
    }
    public final Channel a(){
       return this.a;
    }
    public final int b(){
       return this.b;
    }
}
