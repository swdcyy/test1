package bpb.e;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import bpb.f;
import com.yxcorp.gifshow.music.cloudmusic.local.LocalMusicFragment;
import java.lang.Object;

public class e extends Accessor	// class@000423
{
    public final LocalMusicFragment c;
    public final f d;

    public void e(f p0,LocalMusicFragment p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c;
    }
}
