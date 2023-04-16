package b56.b0;
import com.kwai.feed.player.ui.e;
import com.kwai.feed.player.ui.f;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.utility.Log;

public class b0 extends e	// class@0003f6
{
    public final f d;

    public void b0(f p0,View p1){
       this.d = p0;
       super(p1);
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, b0.class, "1")) {
          return;
       }
       Log.g("QualitySwitchPanel", "on exit end");
       this.d.b.setVisibility(8);
       this.d.c();
       return;
    }
}
