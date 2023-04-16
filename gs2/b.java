package gs2.b;
import erd.g;
import com.kuaishou.live.core.voiceparty.ktv.emptyrecommend.c$a;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Objects;
import com.kuaishou.live.core.voiceparty.ktv.emptyrecommend.c;
import com.kuaishou.android.model.music.Music;
import tt2.v;
import com.kuaishou.live.core.voiceparty.music.util.LiveVoicePartyKtvMusicDownloadHelper$d;
import com.kuaishou.live.core.voiceparty.music.util.LiveVoicePartyKtvMusicDownloadHelper;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.String;
import com.yxcorp.gifshow.util.PermissionUtils;

public final class b implements g	// class@002b90
{
    public final c$a b;

    public void b(c$a p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       b tb = this.b;
       Objects.requireNonNull(tb);
       if (p0.booleanValue()) {
          p0 = tb.b;
          c p = p0.p;
          if (p != null) {
             p.gb(p0.w, 1);
          }
          p0 = tb.b;
          p0.q.a(p0.w, p0);
       }else {
          String[] stringArray = new String[]{"android.permission.RECORD_AUDIO"};
          PermissionUtils.n(tb.b.getActivity(), stringArray);
       }
       return;
    }
}
