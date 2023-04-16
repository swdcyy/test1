package bpb.d;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import bpb.f;
import com.yxcorp.gifshow.music.cloudmusic.local.LocalMusicFragment;
import java.lang.Object;
import java.lang.String;

public class d extends Accessor	// class@000422
{
    public final LocalMusicFragment c;
    public final f d;

    public void d(f p0,LocalMusicFragment p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.W;
    }
    public void set(Object p0){
       this.c.W = p0;
    }
}
