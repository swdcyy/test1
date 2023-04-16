package bu5.a;
import erd.g;
import com.kwai.feature.api.platform.antispam.AntispamInitModule;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Objects;
import com.kwai.sdk.switchconfig.a;
import java.lang.String;
import com.kwai.plugin.dva.work.WorkExecutors;
import com.kwai.plugin.dva.Dva;
import com.kwai.plugin.dva.install.b;
import com.kwai.plugin.dva.work.c;
import bu5.b;
import java.util.concurrent.Executor;
import com.kwai.plugin.dva.work.c$c;

public final class a implements g	// class@000603
{
    public final AntispamInitModule b;

    public void a(AntispamInitModule p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       a tb = this.b;
       Objects.requireNonNull(tb);
       if (p0.booleanValue()) {
          p0 = (a.t().d("dvaAntispamOpt", false))? WorkExecutors.c: WorkExecutors.b;
          Dva.instance().getPluginInstallManager().j("antispam").b(p0, new b(tb));
       }
       return;
    }
}
