package eob.q;
import io.reactivex.g;
import eob.t;
import androidx.fragment.app.FragmentActivity;
import java.lang.Object;
import brd.v;
import java.util.Objects;
import hob.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import lnc.i3;
import com.yxcorp.utility.Log;
import jd6.g;
import com.kwai.plugin.dva.Dva;
import java.lang.System;
import android.app.Activity;
import com.kwai.dva.design.PluginInstallerUIHandler$a;
import com.kwai.dva.design.PluginInstallerUIHandler;
import eob.r;
import com.kwai.dva.design.PluginInstallerUIHandler$d;
import com.kwai.plugin.dva.install.b;
import ae6.h;
import com.kwai.plugin.dva.work.c;
import com.kwai.framework.plugin.downloader.PluginDownloadExtension;
import eob.s;
import com.kwai.plugin.dva.work.c$c;
import java.lang.Integer;
import brd.g;

public final class q implements g	// class@002799
{
    public final t b;
    public final FragmentActivity c;
    public final boolean d;

    public void q(t p0,FragmentActivity p1,boolean p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void subscribe(v p0){
       q tb = this.b;
       q tc = this.c;
       q td = this.d;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoid(null, null, a.class, "1")) {
       }else {
          i3 oi3 = i3.f();
          oi3.d("status", "start");
          oi3.d("plugin", "moment");
          Log.g("MomentPluginLogger", oi3.e());
       }
       if (g.e("moment") || Dva.instance().isLoaded("moment")) {
          a.a(true, true, 0);
          p0.onNext(Integer.valueOf(true));
          p0.onComplete();
       }else {
          long l = System.currentTimeMillis();
          if (tc != null && td != null) {
             h.a(Dva.instance().getPluginInstallManager(), "moment", PluginInstallerUIHandler.d(tc).d(new r(tb, l, p0)));
          }else {
             PluginDownloadExtension.k.s("moment", 40);
             Dva.instance().getPluginInstallManager().j("moment").a(new s(tb, l, p0));
          }
       }
       return;
    }
}
