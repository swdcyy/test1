package i91.b;
import io.reactivex.g;
import com.kuaishou.live.common.core.basic.arya.b;
import android.content.Context;
import java.lang.String;
import java.lang.Object;
import brd.v;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.kwai.plugin.dva.Dva;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import brd.g;
import androidx.fragment.app.FragmentActivity;
import com.kwai.plugin.dva.work.c$c;
import i91.e;
import android.app.Activity;
import com.kwai.dva.design.PluginInstallerUIHandler$a;
import com.kwai.dva.design.PluginInstallerUIHandler;
import com.kwai.dva.design.PluginInstallerUIHandler$d;
import i91.f;
import com.kwai.plugin.dva.install.b;
import ae6.h;
import vi5.j;
import wi5.a;
import com.kwai.framework.plugin.downloader.PluginDownloadExtension;
import com.kwai.plugin.dva.work.c;

public final class b implements g	// class@00285c
{
    public final b b;
    public final boolean c;
    public final Context d;
    public final String e;
    public final boolean f;

    public void b(b p0,boolean p1,Context p2,String p3,boolean p4){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
    }
    public final void subscribe(v p0){
       Object[] obj;
       boolean b1;
       e uoe;
       PluginInstallerUIHandler$a uoa;
       f uof;
       PluginDownloadExtension k;
       b uob = this;
       object oobject = p0;
       b b = uob.b;
       b c = uob.c;
       b d = uob.d;
       b e = uob.e;
       b f = uob.f;
       Objects.requireNonNull(b);
       if (PatchProxy.isSupport(b.class)) {
          obj = PatchProxy.applyFourRefs(Boolean.valueOf(c), d, e, p0, b, b.class, "7");
          if (obj != PatchProxyResult.class) {
             b1 = obj.booleanValue();
          }else if(Dva.instance().isLoaded(e)){
             b.c0(LiveLogTag.LIVE_ARYA_SO_LOAD, "canStartInstall: plugin already loaded", "pluginName", e);
             oobject.onNext(Boolean.TRUE);
             p0.onComplete();
          }else if(c != null && !d instanceof FragmentActivity){
             b.B(LiveLogTag.LIVE_ARYA_SO_LOAD, "canStartInstall: activity is null or not FragmentActivity, abort!");
             oobject.onNext(Boolean.FALSE);
             p0.onComplete();
          }else {
             b1 = true;
          }
          b1 = false;
       }else {
          goto label_0039 ;
       }
       if (b1) {
          if (PatchProxy.isSupport(b.class)) {
             obj = new Object[]{Boolean.valueOf(c),Boolean.valueOf(f),d,e,oobject};
             if (!PatchProxy.applyVoid(obj, b, b.class, "8")) {
             }
          }else {
          }
       }
    label_0104 :
       return;
    }
}
