package ag9.f$c;
import com.yxcorp.gifshow.camera.bubble.b$c;
import ag9.f;
import com.kuaishou.android.model.music.Music;
import java.lang.Object;
import com.kwai.library.widget.popup.common.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import j8c.a;
import q87.c;
import com.yxcorp.gifshow.camera.record.music.reco.BaseRecoCollectMusicController;
import ag9.g;

public final class f$c implements b$c	// class@0000bf
{
    public final f a;
    public final Music b;

    public void f$c(f p0,Music p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public final void a(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f$c.class, "1")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("RecoCollectMusicController", "music bubble Show", objArray);
       if (this.a.k2() == 4) {
          g.a.a();
       }
       this.a.p2(this.b);
       this.a.o2(this.b);
       return;
    }
}
