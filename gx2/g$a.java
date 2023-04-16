package gx2.g$a;
import com.yxcorp.gifshow.widget.m;
import gx2.g;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.voiceparty.theater.model.VoicePartyTheaterPlayListResponse$VoicePartyTheaterPlayOrderItem;
import com.kuaishou.live.core.voiceparty.theater.model.VoicePartyTheaterNormalAuthorInfo;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import gx2.c;

public class g$a extends m	// class@002bb8
{
    public final g c;

    public void g$a(g p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g$a.class, "1")) {
          return;
       }
       VoicePartyTheaterPlayListResponse$VoicePartyTheaterPlayOrderItem mNormalAutho = this.c.r.mNormalAuthorInfo;
       if (!TextUtils.x(mNormalAutho.mUserLink)) {
          this.c.q.a(mNormalAutho.mUserLink);
       }
       return;
    }
}
