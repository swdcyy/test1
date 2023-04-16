package d29.c;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.ad.detail.vm.rightactionbar.avatar.AdAvatarElement;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import p1a.a;
import gz8.d;
import com.kwai.framework.model.feed.BaseFeed;
import kp.r1;

public final class c implements View$OnClickListener	// class@002037
{
    public final QPhoto b;
    public final AdAvatarElement c;

    public void c(QPhoto p0,AdAvatarElement p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, c.class, "1")) {
          return;
       }
       AdAvatarElement v = this.c.v;
       if (v == null) {
          a.S("mFragment");
       }
       d.c(v, AdAvatarElement.n0(this.c), (AdAvatarElement.o0(this.c).a0() + 1), this.b, null, false, 32, null);
       r1.q5(AdAvatarElement.n0(this.c).mEntity, 2);
       PatchProxy.onMethodExit(c.class, "1");
       return;
    }
}
