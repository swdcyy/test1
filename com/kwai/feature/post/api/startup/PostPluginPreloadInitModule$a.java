package com.kwai.feature.post.api.startup.PostPluginPreloadInitModule$a;
import qi7.a;
import com.kwai.feature.post.api.startup.PostPluginPreloadInitModule;
import java.lang.Object;
import java.lang.String;
import java.lang.ClassLoader;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.app.Application;
import o56.a;
import android.content.Context;
import com.kwai.video.kstmf.KSTMFConfig;
import lnc.p3;
import java.lang.StringBuilder;
import com.kwai.video.kstmf.KSTMFSoManager;
import q87.c;
import lnc.a1;
import com.kwai.plugin.dva.install.error.PluginInstallException;
import java.lang.Throwable;
import lnc.t;

public class PostPluginPreloadInitModule$a implements a	// class@001439
{
    public final PostPluginPreloadInitModule a;

    public void PostPluginPreloadInitModule$a(PostPluginPreloadInitModule p0){
       this.a = p0;
       super();
    }
    public void a(String p0,ClassLoader p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PostPluginPreloadInitModule$a.class, "1")) {
          return;
       }
       if (TextUtils.equals(p0, "post") || TextUtils.equals(p0, "video")) {
          KSTMFConfig.init(a.b());
          int i = 0;
          Object[] objArray = new Object[i];
          p3.D().A("TMF", "tmfEnableDvaDownload:"+KSTMFSoManager.getInstance().getTmfEnableDvaDownload(), objArray);
          objArray = new Object[i];
          p3.D().A("TMF", "forceEnableDvaDownload:"+KSTMFSoManager.getInstance().getForceEnableDvaDownload(), objArray);
          if (KSTMFSoManager.getInstance().getTmfEnableDvaDownload() || KSTMFSoManager.getInstance().getForceEnableDvaDownload()) {
             Object[] objArray1 = new Object[i];
             p3.D().A("TMF", "begin sync load", objArray1);
             long l = a1.k();
             int i1 = KSTMFConfig.tmfSyncGetLoadResult();
             Object[] objArray2 = new Object[i];
             p3.D().A("TMF", "end sync load, ret: "+i1, objArray2);
             PluginInstallException pluginInstal = null;
             if (i1 < 0) {
                pluginInstal = new PluginInstallException(i1, "tmf: the full ffmpeg plugin load error");
             }
             PluginInstallException pluginInstal1 = pluginInstal;
             boolean b = (i1 >= 0)? true: false;
             t.k("tmf_ffmpeg_full", "dialog", l, b, 0, false, pluginInstal1);
          }
       }
       return;
    }
}
