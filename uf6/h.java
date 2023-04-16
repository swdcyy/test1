package uf6.h;
import java.lang.Runnable;
import ob6.h;
import java.lang.Object;
import com.kwai.framework.switchs.SwitchConfigInitModule;
import com.kuaishou.gifshow.platform.network.keyconfig.FeatureConfig;
import com.kwai.sdk.switchconfig.a;
import com.google.gson.c;
import fg6.a;
import java.lang.String;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.kwai.sdk.switchconfig.ConfigPriority;
import java.lang.Exception;

public final class h implements Runnable	// class@0025e4
{
    public final h b;

    public void h(h p0){
       this.b = p0;
    }
    public final void run(){
       h tb = this.b;
       boolean s = SwitchConfigInitModule.s;
       try{
          h mFeatureConf = tb.mFeatureConfig;
          if (mFeatureConf != null && mFeatureConf.mSwitches != null) {
             a.t().h(new c().a(a.a.q(tb.mFeatureConfig.mSwitches)).r(), ConfigPriority.MIDDLE);
          }
       }catch(java.lang.Exception e0){
          e0.printStackTrace();
       }
       return;
    }
}
