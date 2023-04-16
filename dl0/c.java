package dl0.c;
import java.util.concurrent.Callable;
import dl0.a;
import java.lang.Object;
import com.kwai.plugin.dva.Dva;
import com.kwai.plugin.dva.install.b;
import java.lang.String;
import com.kwai.plugin.dva.work.c;
import dl0.d;
import com.kwai.plugin.dva.work.c$c;
import java.lang.Boolean;

public final class c implements Callable	// class@001fb3
{
    public final a b;

    public void c(a p0){
       this.b = p0;
    }
    public final Object call(){
       Dva.instance().getPluginInstallManager().j("life_plugin").a(new d(this.b));
       return Boolean.TRUE;
    }
}
