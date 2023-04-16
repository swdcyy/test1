package c46.a;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import c46.c;
import com.kwai.feature.post.api.music.data.HistoryMusic;
import java.lang.Object;
import com.kuaishou.android.model.music.Music;

public class a extends Accessor	// class@000645
{
    public final HistoryMusic c;
    public final c d;

    public void a(c p0,HistoryMusic p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.mMusic;
    }
    public void set(Object p0){
       this.c.mMusic = p0;
    }
}
