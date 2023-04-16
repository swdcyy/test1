package dt1.e;
import yh3.a;
import dt1.b;
import com.kuaishou.live.common.core.component.multipk.game.cohesion.rank.LiveMultiPkCohesionRankVC$a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import androidx.lifecycle.MutableLiveData;
import java.lang.Boolean;
import androidx.lifecycle.LiveData;
import dt1.e$a;
import z0.a;
import androidx.lifecycle.Transformations;
import cu1.d;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import androidx.lifecycle.ViewModel;

public final class e extends a	// class@002019
{
    public final LiveData a;
    public final LiveData b;
    public final b c;
    public final LiveMultiPkCohesionRankVC$a d;

    public void e(b p0,LiveMultiPkCohesionRankVC$a p1){
       a.p(p0, "rankModel");
       a.p(p1, "delegate");
       super();
       this.c = p0;
       this.d = p1;
       MutableLiveData mutableLiveD = new MutableLiveData(Boolean.TRUE);
       this.o0(mutableLiveD);
       this.a = mutableLiveD;
       LiveData liveData = Transformations.distinctUntilChanged(Transformations.map(p0.a(), e$a.a));
       a.o(liveData, "Transformations.distinct¡­ViewStyle.NORMAL\n      }\)");
       this.b = d.a(liveData);
    }
    public void onCleared(){
       if (PatchProxy.applyVoid(null, this, e.class, "1")) {
          return;
       }
       super.onCleared();
       this.r0(this.a).setValue(Boolean.FALSE);
       return;
    }
}
