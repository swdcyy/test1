package a66.c;
import erd.g;
import com.kuaishou.gifshow.network.degrade.RequestTiming;
import java.lang.Object;
import com.google.gson.JsonObject;
import com.yxcorp.gifshow.util.rx.RxBus;
import com.kwai.framework.config.heartbeat.g$c;

public final class c implements g	// class@00002c
{
    public final RequestTiming b;

    public void c(RequestTiming p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       RxBus.f.b(new g$c(p0, this.b));
    }
}
