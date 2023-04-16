package ds2.e;
import erd.g;
import ds2.d;
import java.lang.Object;
import com.kuaishou.live.core.voiceparty.model.LiveVoicePartyUpdateApplyCountResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Math;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import yh3.a;
import java.lang.Integer;

public final class e implements g	// class@00258e
{
    public final d b;

    public void e(d p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "1")) {
       }else {
          this.b.c = (long)Math.min(5000, p0.mApplyCountQueryIntervalMs);
          e tb = this.b;
          tb.r0(tb.u0()).setValue(Integer.valueOf(p0.mApplyCount));
       }
       return;
    }
}
