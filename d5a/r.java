package d5a.r;
import java.util.concurrent.Callable;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kwai.dva.design.PluginInstallerUIHandler$d;
import java.lang.Object;
import android.app.Activity;
import com.kwai.dva.design.PluginInstallerUIHandler$a;
import com.kwai.dva.design.PluginInstallerUIHandler;
import com.kwai.plugin.dva.Dva;
import com.kwai.plugin.dva.install.b;
import java.lang.String;
import ae6.h;
import java.lang.Boolean;

public final class r implements Callable	// class@001e8d
{
    public final GifshowActivity b;
    public final PluginInstallerUIHandler$d c;

    public void r(GifshowActivity p0,PluginInstallerUIHandler$d p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final Object call(){
       h.a(Dva.instance().getPluginInstallManager(), "landscape", PluginInstallerUIHandler.d(this.b).d(this.c));
       return Boolean.TRUE;
    }
}
