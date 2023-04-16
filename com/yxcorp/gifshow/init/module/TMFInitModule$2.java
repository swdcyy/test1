package com.yxcorp.gifshow.init.module.TMFInitModule$2;
import com.kwai.plugin.dva.install.a;
import com.yxcorp.gifshow.init.module.TMFInitModule;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.app.Application;
import o56.a;
import android.content.Context;
import com.kwai.video.kstmf.KSTMFConfig;
import com.yxcorp.utility.Log;
import java.util.Objects;
import com.kwai.plugin.dva.Dva;
import com.kwai.plugin.dva.install.b;
import java.util.List;
import java.util.Iterator;
import com.kwai.plugin.dva.repository.model.PluginConfig;

public class TMFInitModule$2 implements a	// class@0019a4
{
    public final TMFInitModule a;

    public void TMFInitModule$2(TMFInitModule p0){
       this.a = p0;
       super();
    }
    public void a(String p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, TMFInitModule$2.class, "1")) {
          return;
       }
       if (TextUtils.equals(p0, "post") || TextUtils.equals(p0, "video")) {
          KSTMFConfig.init(a.b());
          if (KSTMFConfig.getLoadState() != 3 && (KSTMFConfig.getOpenDvaDownload() && TextUtils.equals(p0, "video"))) {
             Log.n("TMF", "videoDependentFFMPEG");
             TMFInitModule$2 ta = this.a;
             Objects.requireNonNull(ta);
             if (!PatchProxy.applyVoidWithListener(null, ta, TMFInitModule.class, "3")) {
                Iterator iterator = Dva.instance().getPluginInstallManager().b().iterator();
                while (iterator.hasNext()) {
                   PluginConfig pluginConfig = iterator.next();
                   if ((pluginConfig.name).equals("video") && !pluginConfig.depends.contains("tmf_ffmpeg_full")) {
                      pluginConfig.depends.add("tmf_ffmpeg_full");
                   }
                }
                PatchProxy.onMethodExit(TMFInitModule.class, "3");
             }
          }
       }
       PatchProxy.onMethodExit(TMFInitModule$2.class, "1");
       return;
    }
}
