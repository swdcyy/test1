package lu1.k;
import androidx.lifecycle.Observer;
import lu1.q;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.common.core.basic.debuglog.LiveCommonLogTag;
import java.lang.StringBuilder;
import pp.c;
import com.kuaishou.android.live.log.b;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.ImageView;

public final class k implements Observer	// class@003043
{
    public final q b;

    public void k(q p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k.class, "1")) {
       }else {
          b.Z(LiveCommonLogTag.MULTI_PK, "muteIconVisibility change "+p0);
          a.o(p0, "it");
          int i = (p0.booleanValue())? 0: 8;
          this.b.j3().setVisibility(i);
          i = this.b;
          q e = i.E;
          if (e != null) {
             i.s3(e);
          }
       }
       return;
    }
}
