package ab5.x;
import java.lang.Runnable;
import com.yxcorp.gifshow.refresh.RefreshType;
import java.lang.String;
import java.lang.Object;
import lnc.i3;
import java.lang.Integer;
import java.lang.Number;
import k2b.u1;

public final class x implements Runnable	// class@00005f
{
    public final RefreshType b;
    public final String c;
    public final int d;

    public void x(RefreshType p0,String p1,int p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void run(){
       x tb = this.b;
       x tc = this.c;
       x td = this.d;
       i3 oi3 = i3.f();
       String str = (tb != null)? tb.refreshTypeToRefreshSource(): "unkown";
       oi3.d("refreshType", str);
       oi3.d("pageId", tc);
       oi3.c("index", Integer.valueOf(td));
       u1.R("HOME_REFRESH_TYPE", oi3.e(), 14);
       return;
    }
}
