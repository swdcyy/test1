package k91.c;
import k91.b;
import java.lang.Object;
import k91.c$b;
import k91.c$a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.plugin.downloader.PluginDownloadExtension;
import com.kwai.plugin.dva.Dva;
import com.kwai.plugin.dva.install.b;
import com.kwai.plugin.dva.work.c;
import com.kwai.plugin.dva.work.c$c;
import q00.b;
import java.lang.Boolean;
import com.kuaishou.live.common.core.basic.resource.LiveResourceFileUtil$LiveResourceFileType;
import com.kuaishou.live.common.core.basic.resource.LiveResourceFileUtil$d;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.StringBuilder;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kwai.robust.PatchProxyResult;
import wkd.b;
import com.kwai.framework.perf.phonelevel.d;
import com.kwai.sdk.switchconfig.a;
import io7.c;
import java.io.File;
import com.kuaishou.live.common.core.basic.resource.LiveResourceFileUtil;
import qkd.b;
import ekd.k1;

public class c implements b	// class@002ce1
{
    public final c$b a;
    public c b;
    public boolean c;

    public void c(){
       super();
       c$a uoa = null;
       c$b uob = new c$b(uoa);
       this.a = uob;
       this.b = uoa;
       this.c = true;
       c uoc = c.class;
       if (PatchProxy.applyVoid(uoa, this, uoc, "3")) {
       }else if(!this.c() || PatchProxy.applyVoid(uoa, this, uoc, "6")){
          PluginDownloadExtension.k.s("ks_audio_process_so", 20);
          c uoc1 = Dva.instance().getPluginInstallManager().j("ks_audio_process_so");
          this.b = uoc1;
          uoc1.a(uob);
       }
       return;
    }
    public String a(){
       return "AI";
    }
    public void b(b p0,boolean p1){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, uoc, "2")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       String str = LiveResourceFileUtil$LiveResourceFileType.LIVE_ARYA_AI_DENOISE_MODEL.mFilePathInfo.b();
       b.Z(LiveLogTag.LIVE_ARYA, "denoise path:"+str);
       p0.m(str);
       p0.s(p1);
       PluginDownloadExtension.k.a("ks_audio_process_so");
       return;
    }
    public final boolean c(){
       Object obj = PatchProxy.apply(null, this, c.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.c == null) {
          b.Z(LiveLogTag.LIVE_ARYA, "ai降噪，命中被临时禁用");
          return false;
       }else if(b.a(-404437045).g()){
          b.Z(LiveLogTag.LIVE_ARYA, "ai降噪，命中低端机");
          return false;
       }else if(!a.t().u("SOURCE_LIVE").d("enableAIDenoise", false)){
          b.Z(LiveLogTag.LIVE_ARYA, "ai降噪，命中kSwitch已经关闭");
          return false;
       }else {
          return true;
       }
    }
    public void d(boolean p0){
       this.c = p0;
    }
    public boolean isAvailable(){
       boolean b1;
       boolean b2;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       c uoc = c.class;
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, uoc, "1");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (this.c()) {
          obj = PatchProxy.apply(objArray, objArray, uoc, "7");
          if (obj != patchProxyRe) {
             b1 = obj.booleanValue();
          }else if(Dva.instance().isLoaded("tflite") && Dva.instance().isLoaded("ks_audio_process_so")){
             b1 = true;
          }else {
             b1 = false;
          }
          if (b1) {
             Object obj1 = PatchProxy.apply(objArray, objArray, uoc, "8");
             if (obj1 != patchProxyRe) {
                b2 = obj1.booleanValue();
             }else {
                LiveResourceFileUtil$LiveResourceFileType lIVE_ARYA_AI = LiveResourceFileUtil$LiveResourceFileType.LIVE_ARYA_AI_DENOISE_MODEL;
                boolean b3 = b.S(LiveResourceFileUtil.j(lIVE_ARYA_AI, lIVE_ARYA_AI.mFilePathInfo.b()));
                if (!b3) {
                   LiveResourceFileUtil.h(lIVE_ARYA_AI);
                }
                b.Z(LiveLogTag.LIVE_ARYA, "模型文件："+b3);
                b2 = b3;
             }
             if (b2) {
             label_0087 :
                return b;
             }
          }
       }
    label_0086 :
       b = false;
       goto label_0087 ;
    }
    public void release(){
       if (PatchProxy.applyVoid(null, this, c.class, "9")) {
          return;
       }
       k1.n(this.a);
       c tb = this.b;
       if (tb != null) {
          tb.n(this.a);
          this.b = null;
       }
       return;
    }
}
