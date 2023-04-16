package ag9.b;
import erd.a;
import com.yxcorp.gifshow.camera.record.music.reco.BaseRecoCollectMusicController;
import com.kuaishou.android.model.music.Music;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ag9.b$a;
import java.lang.Runnable;
import com.yxcorp.gifshow.camera.record.base.d;

public final class b implements a	// class@0000b7
{
    public final BaseRecoCollectMusicController b;
    public final Music c;

    public void b(BaseRecoCollectMusicController p0,Music p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, b.class, "1")) {
          return;
       }
       this.b.b2(new b$a(this));
       return;
    }
}
