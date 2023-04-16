package sxa.b;
import java.lang.Runnable;
import com.yxcorp.gifshow.init.module.ChannelInitializer;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import org.json.JSONObject;
import com.yxcorp.utility.RomUtils;
import o56.a;
import k2b.u1;
import java.lang.Exception;

public final class b implements Runnable	// class@00244b
{
    public final ChannelInitializer b;

    public void b(ChannelInitializer p0){
       this.b = p0;
    }
    public final void run(){
       b tb = this.b;
       if (tb.c != null) {
          tb.c = false;
          if (!PatchProxy.applyVoidWithListener(null, tb, ChannelInitializer.class, "6")) {
             try{
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("rom_name", RomUtils.f());
                jSONObject.put("rom_version", RomUtils.i());
                jSONObject.put("channel", a.k);
                jSONObject.put("original_channel", a.l);
                u1.R("READ_CHANNEL_FROM_VENDOR", jSONObject.toString(), 9);
             }catch(java.lang.Exception e0){
                e0.printStackTrace();
             }
             PatchProxy.onMethodExit(ChannelInitializer.class, "6");
          }
       }
       return;
    }
}
