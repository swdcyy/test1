package ced.u;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ded.g;
import com.yxcorp.plugin.search.result.hashtag.entity.TagInfo;
import com.kwai.library.widget.sensormanager.KwaiSensorManager;
import androidx.lifecycle.Lifecycle;
import androidx.fragment.app.Fragment;
import v17.b;
import android.view.View;
import ekd.m1;
import com.kwai.library.widget.gravityeffect.KwaiGravityEffectButton;
import com.yxcorp.plugin.search.response.SearchResultExtParams;

public class u extends PresenterV2	// class@000583
{
    public KwaiGravityEffectButton p;
    public KwaiGravityEffectButton q;
    public TagInfo r;
    public SearchResultExtParams s;
    public Fragment t;

    public void u(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, u.class, "3")) {
          return;
       }
       int i = g.c();
       if (3 == this.r.mTagType && i != g.g) {
          this.p = this.q;
       }
       KwaiSensorManager.d().g(this.t.getLifecycle(), this.p);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, u.class, "2")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a0f18);
       this.q = m1.f(p0, 0x7f0a0f19);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, u.class, "1")) {
          return;
       }
       this.t = this.r8("PageFragment");
       this.r = this.r8("TagInfo");
       this.s = this.r8("TagInfoExtParams");
       return;
    }
}
