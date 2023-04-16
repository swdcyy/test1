package co2.l2;
import java.lang.Runnable;
import com.kuaishou.live.core.voiceparty.g0;
import android.view.View;
import java.lang.Object;
import java.util.Objects;
import com.kuaishou.live.core.voiceparty.g0$a;
import com.kuaishou.live.core.voiceparty.d0;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.util.Arrays;

public final class l2 implements Runnable	// class@00059b
{
    public final g0 b;
    public final int c;
    public final View d;

    public void l2(g0 p0,int p1,View p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void run(){
       int i;
       l2 tb = this.b;
       l2 tc = this.c;
       l2 td = this.d;
       Objects.requireNonNull(tb);
       int[] obj = PatchProxy.applyOneRefs(td, null, d0.class, "14");
       if (obj != PatchProxyResult.class) {
          i = obj.intValue();
       }else {
          obj = d0.a;
          Arrays.fill(obj, 0);
          td.getLocationInWindow(obj);
          i = obj[1] + td.getMeasuredHeight();
       }
       tb.a(1, new g0$a(tc, i, td));
       return;
    }
}
