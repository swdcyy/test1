package ba2.b;
import java.lang.Runnable;
import com.kuaishou.live.core.show.hourlytrank.LiveFancyRankResultViewV2;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.FrameLayout;
import ba2.d;

public final class b implements Runnable	// class@000385
{
    public final LiveFancyRankResultViewV2 b;

    public void b(LiveFancyRankResultViewV2 p0){
       this.b = p0;
    }
    public final void run(){
       b tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoid(null, tb, LiveFancyRankResultViewV2.class, "9")) {
       }else if(tb.getVisibility() || PatchProxy.applyVoid(null, tb, LiveFancyRankResultViewV2.class, "10")){
          tb.post(new d(tb));
       }
       return;
    }
}
