package bed.b;
import erd.g;
import bed.y;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.lang.String;
import com.yxcorp.gifshow.model.SimpleMagicFace;
import com.kuaishou.android.model.music.Music;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.gifshow.post.api.core.plugin.RecordPostPlugin;
import java.lang.Object;
import java.io.Serializable;
import java.util.Objects;
import qm6.b$a;
import android.content.Context;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.plugin.search.result.hashtag.entity.TagInfo;
import lnc.s6;
import nm6.d;
import android.os.Bundle;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;

public final class b implements g	// class@000400
{
    public final y b;
    public final GifshowActivity c;
    public final String d;
    public final SimpleMagicFace e;
    public final Music f;
    public final QPhoto g;
    public final RecordPostPlugin h;

    public void b(y p0,GifshowActivity p1,String p2,SimpleMagicFace p3,Music p4,QPhoto p5,RecordPostPlugin p6){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       this.g = p5;
       this.h = p6;
    }
    public final void accept(Object p0){
       b tb = this.b;
       b tc = this.c;
       b td = this.d;
       b te = this.e;
       b tf = this.f;
       b tg = this.g;
       b th = this.h;
       Objects.requireNonNull(tb);
       b$a uoa = new b$a(tc, 0);
       if (!TextUtils.x(td)) {
          uoa.h0(td);
       }
       uoa.l(8);
       uoa.g0(tb.b.mTagType);
       uoa.h(tb.k());
       uoa.b0(true);
       uoa.f0(p0);
       uoa.t(true);
       if (s6.u() == 3) {
          uoa.a0(true);
       }
       p0 = new d();
       p0.p(true);
       Bundle uBundle = new Bundle();
       if (te != null) {
          SerializableHook.putSerializable(uBundle, "magic_face", te);
       }
       if (tf != null) {
          uBundle.putBoolean("musicNotShowProgress", true);
          SerializableHook.putSerializable(uBundle, "music", tf);
       }
       p0.n(uBundle);
       if (!tg.isVideoType() || TextUtils.x(tg.getPhotoId())) {
          p0.s(true);
       }
       th.S00(tc, uoa, tg, p0);
       return;
    }
}
