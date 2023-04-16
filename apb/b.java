package apb.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import apb.a;
import android.view.View$OnClickListener;
import ekd.m1;
import com.kuaishou.android.model.music.Music;
import com.kwai.feature.post.api.music.interfaces.CloudMusicHelper;

public class b extends PresenterV2	// class@0002a4
{
    public Music p;
    public CloudMusicHelper q;

    public void b(){
       super();
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "2")) {
          return;
       }
       m1.a(p0, new a(this), R.id.delete_btn);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, b.class, "1")) {
          return;
       }
       this.p = this.q8(Music.class);
       this.q = this.r8("CLOUD_MUSIC_HELPER");
       return;
    }
}
