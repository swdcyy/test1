package ag9.b$a;
import java.lang.Runnable;
import ag9.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.model.music.Music;
import com.yxcorp.gifshow.camera.record.music.reco.BaseRecoCollectMusicController;

public final class b$a implements Runnable	// class@0000b6
{
    public final b b;

    public void b$a(b p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, b$a.class, "1")) {
          return;
       }
       b$a tb = this.b;
       tb.b.s2(tb.c);
       return;
    }
}
