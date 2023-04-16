package fx2.g;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import com.kuaishou.live.core.voiceparty.theater.tube.list.VoicePartyTheaterTubeListTabFragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.recycler.fragment.TabHostFragmentV2;
import kotlin.jvm.internal.a;
import android.view.ViewTreeObserver;
import android.widget.HorizontalScrollView;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.kuaishou.live.core.voiceparty.theater.tube.list.VoicePartyTheaterTubeListTabFragment$TabStatisticsHelper;

public final class g implements ViewTreeObserver$OnGlobalLayoutListener	// class@002a02
{
    public final VoicePartyTheaterTubeListTabFragment b;

    public void g(VoicePartyTheaterTubeListTabFragment p0){
       this.b = p0;
       super();
    }
    public void onGlobalLayout(){
       if (PatchProxy.applyVoid(null, this, g.class, "1")) {
          return;
       }
       TabHostFragmentV2 j = this.b.j;
       a.o(j, "mTabLayout");
       j.getViewTreeObserver().removeOnGlobalLayoutListener(this);
       if (this.b.K0()) {
          this.b.z.c();
       }
       return;
    }
}
