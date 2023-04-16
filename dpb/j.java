package dpb.j;
import com.kwai.feature.post.api.music.interfaces.CloudMusicHelper$a;
import com.yxcorp.gifshow.music.cloudmusic.search.a;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import g9c.a;
import vpb.a;
import com.kuaishou.android.model.music.Music;
import androidx.recyclerview.widget.RecyclerView$Adapter;

public final class j implements CloudMusicHelper$a	// class@0024e2
{
    public final a a;

    public void j(a p0){
       this.a = p0;
    }
    public final void a(int p0){
       j ta = this.a;
       Objects.requireNonNull(ta);
       a uoa = a.class;
       if (!PatchProxy.isSupport(uoa) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), ta, uoa, "1")) {
          int i = 0;
          while (i < ta.Q0().size()) {
             a uoa1 = ta.Q0().get(i);
             if (!uoa1.c()) {
                Music music = uoa1.a();
                if (music != null && music.hashCode() == p0) {
                   ta.m0(i, Integer.valueOf(i));
                }
             }
             i = i + 1;
          }
       }
       return;
    }
}
