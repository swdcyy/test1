package gx2.g$b;
import com.yxcorp.gifshow.widget.m;
import gx2.g;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import android.widget.TextView;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import dx2.a;
import com.kuaishou.live.core.voiceparty.theater.model.VoicePartyTheaterPlayListResponse$VoicePartyTheaterPlayOrderItem;
import gx2.c;

public class g$b extends m	// class@002bb9
{
    public final g c;

    public void g$b(g p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g$b.class, "1")) {
          return;
       }
       g$b tc = this.c;
       g q = tc.q;
       g r = tc.r;
       CharSequence text = tc.w.getText();
       Objects.requireNonNull(tc);
       a uoa = PatchProxy.applyOneRefs(text, tc, g.class, "5");
       if (uoa != PatchProxyResult.class) {
       }else {
          uoa = new a();
          if (text != null) {
             uoa.g = text.toString();
          }
          g r1 = tc.r;
          uoa.c = r1.mVoicePartyTheaterPhotoWithEpisode;
          uoa.d = r1.mAuthor;
       }
       q.d(r, uoa);
       return;
    }
}
