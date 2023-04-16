package ao4.b;
import com.kwai.library.widget.button.SlipSwitchButton$b;
import com.kuaishou.network.testconfig.b;
import java.lang.Object;
import com.kwai.library.widget.button.SlipSwitchButton;
import java.lang.Boolean;
import java.lang.String;
import xf6.l;

public final class b implements SlipSwitchButton$b	// class@0002bb
{
    public final b a;

    public void b(b p0){
       this.a = p0;
    }
    public final void a(SlipSwitchButton p0,boolean p1){
       l.l("enable_api_region_scheduling", Boolean.valueOf(this.a.c.getSwitch()));
    }
}
