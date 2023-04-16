package gx2.f$a;
import com.yxcorp.gifshow.widget.m;
import gx2.f;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.voiceparty.theater.model.VoicePartyTheaterPlayListResponse$VoicePartyTheaterPlayOrderItem;
import com.kwai.framework.model.user.User;
import com.kuaishou.live.core.voiceparty.d0;
import gx2.c;

public class f$a extends m	// class@002bb5
{
    public final f c;

    public void f$a(f p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f$a.class, "1")) {
          return;
       }
       if (d0.p(this.c.r.mAuthor)) {
          f$a tc = this.c;
          tc.q.b(tc.r.mAuthor);
       }
       return;
    }
}
