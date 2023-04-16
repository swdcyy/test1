package cpb.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.music.cloudmusic.local.LocalMusicFragment;
import voc.a0;
import java.lang.StringBuilder;
import java.lang.String;
import java.lang.Object;
import com.yxcorp.utility.Log;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import cpb.a;
import android.view.View$OnClickListener;
import ekd.m1;
import com.kuaishou.android.model.music.Music;
import com.kwai.feature.post.api.music.interfaces.CloudMusicHelper;

public class b extends PresenterV2	// class@002367
{
    public final LocalMusicFragment p;
    public final a0 q;
    public Music r;
    public CloudMusicHelper s;

    public void b(LocalMusicFragment p0,a0 p1){
       super();
       Log.g("ImportMusicDeletePresenter", "ImportMusicDeletePresenter musicFragment:"+p0);
       this.p = p0;
       this.q = p1;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "2")) {
          return;
       }
       Log.g("ImportMusicDeletePresenter", "doBindView rootView:"+p0);
       m1.a(p0, new a(this), R.id.delete_btn);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, b.class, "1")) {
          return;
       }
       this.r = this.q8(Music.class);
       this.s = this.r8("CLOUD_MUSIC_HELPER");
       return;
    }
}
