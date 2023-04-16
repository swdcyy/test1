package b4d.h;
import erd.g;
import b4d.j;
import java.lang.Object;
import android.util.Pair;
import java.util.Objects;
import android.view.View;
import com.kwai.emotionsdk.bean.EmotionInfo;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;

public final class h implements g	// class@000371
{
    public final j b;

    public void h(j p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       h tb = this.b;
       Objects.requireNonNull(tb);
       Pair first = p0.first;
       p0 = p0.second;
       if (PatchProxy.applyVoidTwoRefs(first, p0, tb, j.class, "6")) {
       }else {
          Log.g("FinishButtonAnimPr", "showEmotionPreView: ..."+first+", "+p0);
          if (tb.t != null) {
             tb.S8(true);
          }
       }
       return;
    }
}
