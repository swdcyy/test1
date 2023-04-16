package a2c.e;
import g46.a;
import a2c.f;
import r16.d;
import java.lang.Object;
import z36.d;
import android.content.Context;
import android.content.Intent;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import kotlin.jvm.internal.a;
import q16.a;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import com.yxcorp.gifshow.profile.background.ProfileBackgroundPublishManager;
import com.yxcorp.gifshow.profile.background.ProfileBackgroundPublishManager$c;
import com.yxcorp.gifshow.profile.background.ProfileBackgroundPublishManager$b;
import com.yxcorp.gifshow.albumwrapper.imagecrop.ImageSelectSupplier$c;
import a2c.a;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.io.File;
import com.kwai.framework.model.feed.BaseFeed;

public final class e implements a	// class@000040
{
    public final f a;
    public final d b;

    public void e(f p0,d p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public void a(d p0,Context p1,int p2,Intent p3){
       if (PatchProxy.isSupport(e.class) && PatchProxy.applyVoidFourRefs(p0, p1, Integer.valueOf(p2), p3, this, e.class, "1")) {
          return;
       }
       a.p(p1, "context");
       Intent intent = new Intent();
       if (!p0 instanceof a) {
          p0 = null;
       }
       a w = (p0 != null)? p0.w: null;
       if (!w instanceof ArrayList) {
          w = null;
       }
       intent.putCharSequenceArrayListExtra("mix_video_tracks", w);
       List list = this.b.a4(intent);
       if (!list.isEmpty()) {
          SerializableHook.putExtra(intent, "video", list.get(0));
       }
       ProfileBackgroundPublishManager$c j = ProfileBackgroundPublishManager.j;
       j.a().u(new ProfileBackgroundPublishManager$b(true, true, null));
       e ta = this.a;
       j.a().c(ta.d, null, intent, ta.b.a);
       return;
    }
}
