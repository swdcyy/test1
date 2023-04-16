package cpb.a;
import android.view.View$OnClickListener;
import cpb.b;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.model.music.Music;
import com.kwai.feature.post.api.music.interfaces.CloudMusicHelper$MusicState;
import com.kwai.feature.post.api.music.interfaces.CloudMusicHelper;
import voc.a0;
import y8c.g;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import g9c.a;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import com.yxcorp.gifshow.music.utils.m;

public final class a implements View$OnClickListener	// class@002366
{
    public final b b;

    public void a(b p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       a tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoid(null, tb, b.class, "3")) {
       }else if(tb.s.j(tb.r.hashCode()).isPlaying()){
          tb.s.stop();
       }
       tb.q.f(tb.r.getId());
       tb.p.g7().T0(tb.r);
       tb.p.g7().k0();
       m.a(tb.r);
       if (tb.p.g7().R0()) {
          tb.p.a();
       }
       return;
    }
}
