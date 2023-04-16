package com.yxcorp.gifshow.im_rtc.wrapper.AryaInitManager;
import com.yxcorp.gifshow.im_rtc.wrapper.AryaInitManager$aryaPluginName$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import jd6.g;
import com.kwai.plugin.dva.Dva;
import com.kwai.framework.plugin.downloader.PluginDownloadExtension;
import kotlin.jvm.internal.a;
import com.kwai.plugin.dva.install.b;
import com.kwai.plugin.dva.work.c;
import java.lang.StringBuilder;
import dc5.c;
import com.yxcorp.gifshow.im_rtc.wrapper.AryaInitManager$a;
import com.kwai.plugin.dva.work.c$c;

public final class AryaInitManager	// class@00193f
{
    public static final p a;
    public static final AryaInitManager b;

    static {
       AryaInitManager.b = new AryaInitManager();
       AryaInitManager.a = s.c(AryaInitManager$aryaPluginName$2.INSTANCE);
    }
    public void AryaInitManager(){
       super();
    }
    public final String a(){
       Object obj = PatchProxy.apply(null, this, AryaInitManager.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return AryaInitManager.a.getValue();
    }
    public final boolean b(){
       Object obj = PatchProxy.apply(null, this, AryaInitManager.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (g.e(this.a()) || Dva.instance().isLoaded(this.a()))? true: false;
       return b;
    }
    public synchronized final boolean c(){
       Dva obj = PatchProxy.apply(null, this, AryaInitManager.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (this.b()) {
          return b;
       }
       try{
          PluginDownloadExtension.k.s(this.a(), 40);
          obj = Dva.instance();
          a.o(obj, "Dva.instance\(\)");
          obj.getPluginInstallManager().j(this.a()).c();
          this.d("load arya so sucesss");
       }catch(java.lang.Exception e0){
          this.d("load arya so failed, cused by: "+e0);
          b = false;
       }
       return b;
    }
    public final void d(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AryaInitManager.class, "3")) {
          return;
       }
       c.g("AudioRecorder", p0);
       return;
    }
    public final void e(){
       if (PatchProxy.applyVoid(null, this, AryaInitManager.class, "4")) {
          return;
       }
       Dva uDva = Dva.instance();
       a.o(uDva, "Dva.instance\(\)");
       uDva.getPluginInstallManager().x(this.a()).a(new AryaInitManager$a());
       return;
    }
}
