package mj9.c;
import mj9.a$a;
import mj9.d;
import java.lang.Object;
import android.view.View;
import hlb.d;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import xl8.b;
import java.lang.Long;
import oj9.e;
import com.kwai.framework.model.channel.HotChannel;
import com.yxcorp.gifshow.refresh.RefreshType;
import com.kwai.component.homepage_interface.homeitemfragment.a;

public class c implements a$a	// class@003040
{
    public final d a;

    public void c(d p0){
       this.a = p0;
       super();
    }
    public void a(int p0,View p1,d p2){
       if (PatchProxy.isSupport(c.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, p2, this, c.class, "1")) {
          return;
       }
       this.a.s.d(p2);
       p0.mSubChannelId = Long.toString(p2.mSubChannelId);
       this.a.t.f(RefreshType.PROGRAM);
       return;
    }
}
