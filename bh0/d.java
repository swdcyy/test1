package bh0.d;
import n3d.a;
import bh0.a;
import com.kuaishou.house.live.lottery.HouseLotteryPendantData;
import java.lang.Object;
import android.content.Intent;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.framework.model.user.QCurrentUser;
import kotlin.jvm.internal.a;

public final class d implements a	// class@000387
{
    public final a b;
    public final HouseLotteryPendantData c;

    public void d(a p0,HouseLotteryPendantData p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void onActivityCallback(int p0,int p1,Intent p2){
       if (PatchProxy.isSupport(d.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, this, d.class, "1")) {
          return;
       }
       QCurrentUser mE = QCurrentUser.ME;
       a.o(mE, "QCurrentUser.ME");
       if (mE.isLogined()) {
          this.b.W8(this.c);
       }
       return;
    }
}
