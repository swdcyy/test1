package fx2.f;
import java.lang.Runnable;
import com.kuaishou.live.core.voiceparty.theater.tube.list.VoicePartyTheaterTubeListTabFragment;
import kotlin.jvm.internal.Ref$IntRef;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.recycler.fragment.TabHostFragmentV2;
import com.google.android.material.tabs.TabLayout$c;
import com.google.android.material.tabs.TabLayout;

public final class f implements Runnable	// class@002a01
{
    public final VoicePartyTheaterTubeListTabFragment b;
    public final Ref$IntRef c;

    public void f(VoicePartyTheaterTubeListTabFragment p0,Ref$IntRef p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, f.class, "1")) {
          return;
       }
       this.b.jh(this.c.element);
       f tb = this.b;
       tb.j.a(tb.A);
       return;
    }
}
