package mq9.e;
import java.util.concurrent.Callable;
import cm5.d;
import java.lang.Object;
import com.kwai.plugin.dva.Dva;
import com.kwai.plugin.dva.install.b;
import java.lang.String;
import com.kwai.plugin.dva.work.c;
import mq9.g;
import com.kwai.plugin.dva.work.c$c;
import java.lang.Boolean;

public final class e implements Callable	// class@003071
{
    public final d b;

    public void e(d p0){
       this.b = p0;
    }
    public final Object call(){
       Dva.instance().getPluginInstallManager().j("corona_core_plugin").a(new g(this.b));
       return Boolean.TRUE;
    }
}
