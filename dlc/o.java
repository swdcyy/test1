package dlc.o;
import android.view.View$OnClickListener;
import dlc.s;
import java.lang.Object;
import android.view.View;
import im8.f;
import com.yxcorp.gifshow.entity.TrendingInfo;
import alc.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;

public final class o implements View$OnClickListener	// class@002260
{
    public final s b;

    public void o(s p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       o tb = this.b;
       tb.W8();
       TrendingInfo trendingInfo = tb.K.get();
       if (PatchProxy.applyVoidOneRefs(trendingInfo, null, a.class, "7")) {
       }else if(trendingInfo == null){
          u1.u(1, a.b(trendingInfo), null);
       }
       return;
    }
}
