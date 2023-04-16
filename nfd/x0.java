package nfd.x0;
import erd.g;
import android.app.Activity;
import com.kuaishou.android.model.music.Music;
import java.lang.Object;
import com.kwai.gifshow.post.api.core.plugin.RecordPostPlugin;
import qm6.b$a;
import android.content.Context;
import com.kwai.feature.post.api.music.data.MusicSource;
import qm6.b;

public final class x0 implements g	// class@001e21
{
    public final Activity b;
    public final Music c;

    public void x0(Activity p0,Music p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       x0 tb = this.b;
       p0.Um(tb, new b$a(tb, 0).P(this.c).U(MusicSource.SEARCH).f());
    }
}
