package cna.a;
import erd.g;
import java.lang.Object;
import com.yxcorp.gifshow.growth.cashreward.model.CashRewardDialogResponse;
import com.yxcorp.gifshow.HomeActivity;
import android.app.Activity;
import cra.w;
import java.lang.String;
import q87.c;
import zn.b;
import tkd.b;
import tkd.d;
import mp5.a;

public final class a implements g	// class@00052e
{
    public final int b;

    public void a(int p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       a tb = this.b;
       if (p0.mDialog == null) {
       }else {
          HomeActivity homeActivity = HomeActivity.H3();
          if (homeActivity != null && !homeActivity.isFinishing()) {
             Object[] objArray = new Object[0];
             w.C().w("GrowthModule", "Ê¹ÓÃtkµ¯´°Õ¹Ê¾ÒÑµÇÂ¼×´Ì¬µÄ½±Àøµ¯´°", objArray);
             p0.rewardEventType = tb;
             d.a(0x68d1816a).KI(new b("GrowthCashRewardDialog", p0));
          }
       }
       return;
    }
}
