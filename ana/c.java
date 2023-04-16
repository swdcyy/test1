package ana.c;
import erd.g;
import java.lang.String;
import java.lang.Object;
import java.lang.Long;
import com.kwai.plugin.dva.Dva;
import com.kwai.plugin.dva.install.b;
import com.kwai.plugin.dva.work.c;

public final class c implements g	// class@0000a8
{
    public final String b;

    public void c(String p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       Dva.instance().getPluginInstallManager().j(this.b);
    }
}
