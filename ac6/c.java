package ac6.c;
import j85.e;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.soc.arch.rubas.base.Rubas;
import com.kuaishou.livestream.message.nano.SCCNY2023AppDegradeConfig;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;
import fg6.a;
import na0.h;
import com.google.gson.Gson;
import ac6.d;

public final class c implements e	// class@00006f
{
    public static final c a;

    static {
       c.a = new c();
    }
    public void c(){
       super();
    }
    public final void onSignalReceive(String p0,String p1,byte[] p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, c.class, "1")) {
          return;
       }
       try{
          Rubas.f("perf_degrade_signal_parse_config", null, null, null, 14, null);
          SCCNY2023AppDegradeConfig degradeConfi = SCCNY2023AppDegradeConfig.parseFrom(p2).degradeConfig;
          Log.g("PerfDegradeUtils", "initKSwitchConfig configList : "+degradeConfi);
          d.c.d(a.a.h(degradeConfi, h.class), true);
       }catch(java.lang.Exception e8){
          Log.d("PerfDegradeUtils", "initSignalConfig exception : "+e8+".message");
          Rubas.f("perf_degrade_signal_parseConfig_failed", null, null, null, 14, null);
       }
       return;
    }
}
