package mq9.d;
import java.util.concurrent.Callable;
import android.app.Activity;
import cm5.d;
import java.lang.Object;
import androidx.fragment.app.FragmentActivity;
import java.lang.RuntimeException;
import java.lang.String;
import java.lang.Exception;
import java.lang.Boolean;
import com.kwai.dva.design.PluginInstallerUIHandler$a;
import com.kwai.dva.design.PluginInstallerUIHandler;
import mq9.f;
import com.kwai.dva.design.PluginInstallerUIHandler$d;
import com.kwai.plugin.dva.Dva;
import com.kwai.plugin.dva.install.b;
import ae6.h;

public final class d implements Callable	// class@003070
{
    public final Activity b;
    public final d c;

    public void d(Activity p0,d p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final Object call(){
       Boolean fALSE;
       d tb = this.b;
       d tc = this.c;
       if (!tb instanceof FragmentActivity) {
          tc.a(new RuntimeException("注意启动的 activity 必须是 FragmentActivity"));
          fALSE = Boolean.FALSE;
       }else {
          h.a(Dva.instance().getPluginInstallManager(), "corona_core_plugin", PluginInstallerUIHandler.d(tb).d(new f(tc)));
          fALSE = Boolean.TRUE;
       }
       return fALSE;
    }
}
