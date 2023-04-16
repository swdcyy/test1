package b5d.i;
import erd.g;
import com.yxcorp.plugin.music.player.controller.VSVCloudMusicHelper;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class i implements g	// class@0003ad
{
    public final VSVCloudMusicHelper b;

    public void i(VSVCloudMusicHelper p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "1")) {
       }else {
          this.b.reset();
       }
       return;
    }
}
