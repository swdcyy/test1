package gx2.f$b;
import com.yxcorp.gifshow.widget.m;
import gx2.f;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import android.widget.TextView;
import com.kwai.robust.PatchProxyResult;
import dx2.a;
import com.kuaishou.live.core.voiceparty.theater.model.VoicePartyTheaterPlayListResponse$VoicePartyTheaterPlayOrderItem;
import gx2.c;

public class f$b extends m	// class@002bb6
{
    public final f c;

    public void f$b(f p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f$b.class, "1")) {
          return;
       }
       f$b tc = this.c;
       f q = tc.q;
       f r = tc.r;
       CharSequence text = tc.x.getText();
       a uoa = PatchProxy.applyTwoRefs(r, text, null, f.class, "5");
       if (uoa != PatchProxyResult.class) {
       }else {
          uoa = new a();
          if (text != null) {
             uoa.g = text.toString();
          }
          uoa.c = r.mVoicePartyTheaterPhotoWithEpisode;
          uoa.d = r.mAuthor;
       }
       q.d(r, uoa);
       return;
    }
}
