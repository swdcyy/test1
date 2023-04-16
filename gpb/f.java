package gpb.f;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import gpb.h;
import com.yxcorp.gifshow.music.cloudmusic.search.panel.MusicSearchPanelFragment;
import java.lang.Object;
import io.reactivex.subjects.PublishSubject;

public class f extends Accessor	// class@002b5a
{
    public final MusicSearchPanelFragment c;
    public final h d;

    public void f(h p0,MusicSearchPanelFragment p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.dh();
    }
}
