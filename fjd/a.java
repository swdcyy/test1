package fjd.a;
import java.lang.Runnable;
import java.lang.String;
import com.yxcorp.retrofit.idc.models.Host;
import java.lang.Object;
import com.yxcorp.retrofit.idc.PreconnectManager;
import com.yxcorp.retrofit.idc.PreconnectManager$PreconnectLogger;
import wkd.b;
import com.yxcorp.gifshow.log.h;
import com.google.gson.Gson;

public final class a implements Runnable	// class@000e46
{
    public final String b;
    public final Host c;
    public final int d;

    public void a(String p0,Host p1,int p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void run(){
       _monitor_enter(PreconnectManager.class);
       b.a(0x4b316083).logCustomEvent("aegon_preconnect", PreconnectManager.f.q(new PreconnectManager$PreconnectLogger(this.b, this.c.mHost, this.d)));
       _monitor_exit(PreconnectManager.class);
    }
}
