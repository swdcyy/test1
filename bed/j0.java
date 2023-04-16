package bed.j0;
import erd.g;
import bed.q0;
import java.lang.Object;
import android.content.Intent;
import java.util.Objects;
import java.lang.String;
import com.kwai.feature.post.api.music.data.MusicSource;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import a46.b;
import com.yxcorp.gifshow.util.LoadPolicy;
import java.lang.Class;
import brd.a0;
import lnc.y6;
import bed.h0;
import bed.n0;
import crd.b;

public final class j0 implements g	// class@00040f
{
    public final q0 b;

    public void j0(q0 p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       j0 tb = this.b;
       Objects.requireNonNull(tb);
       p0.putExtra("live_on", false);
       SerializableHook.putExtra(p0, "music_source", MusicSource.TAG);
       if (!TextUtils.x(tb.c)) {
          p0.putExtra("photo_task_id", tb.c);
       }
       p0.putExtra("camera_page_source", 8);
       y6.s(b.class, LoadPolicy.DIALOG).R(new h0(p0), n0.b);
       return;
    }
}
