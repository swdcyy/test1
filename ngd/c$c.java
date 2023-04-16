package ngd.c$c;
import erd.g;
import ngd.c;
import java.lang.Object;
import com.yxcorp.plugin.setting.fontscale.FontScaleFollowSystemStatus;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.plugin.setting.fontscale.FontScaleHelper;
import com.yxcorp.plugin.setting.widget.SlideSelector;

public final class c$c implements g	// class@001e36
{
    public final c b;

    public void c$c(c p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c$c.class, "1")) {
       }else if(p0 == FontScaleFollowSystemStatus.CLOSE_AUTO){
          float f = FontScaleHelper.a();
          c.P8(this.b).setCurrentLevel(FontScaleHelper.b(f));
          this.b.R8(f);
       }
       return;
    }
}
