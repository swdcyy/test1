package g12.v;
import erd.g;
import g12.w;
import java.lang.Object;
import e06.b;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.Fragment;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.live.core.basic.utils.e;
import com.kwai.framework.model.user.User;
import qa6.a;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.share.screenshot.a0;

public final class v implements g	// class@002a3d
{
    public final w b;

    public void v(w p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       v tb = this.b;
       Object obj = p0;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(obj, tb, w.class, "3")) {
       }else if(!tb.p.isResumed()){
          p0 = e.h(tb.getActivity());
          if (p0 != null) {
             int i = (a.b(p0.getUser()))? 35: 36;
             a0.a(tb.getActivity(), obj, p0.getPhotoId(), i, p0.getUserId(), p0.getExpTag(), p0.mEntity);
          }
       }
       return;
    }
}
