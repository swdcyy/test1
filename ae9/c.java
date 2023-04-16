package ae9.c;
import com.yxcorp.gifshow.widget.m;
import com.yxcorp.gifshow.camera.record.live.LiveEntryWrapperFragment;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class c extends m	// class@0000ad
{
    public final LiveEntryWrapperFragment c;

    public void c(LiveEntryWrapperFragment p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "1")) {
          return;
       }
       this.c.ch();
       return;
    }
}
