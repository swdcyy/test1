package d29.b;
import ok.h;
import com.yxcorp.gifshow.ad.detail.vm.rightactionbar.avatar.AdAvatarElement;
import java.lang.Object;
import java.lang.Void;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import crd.b;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.user.User;
import brd.t;
import com.smile.gifmaker.mvps.utils.model.DefaultObservableAndSyncable;
import d29.a;
import sfc.a;
import erd.g;

public final class b implements h	// class@002036
{
    public final AdAvatarElement b;

    public void b(AdAvatarElement p0){
       this.b = p0;
       super();
    }
    public Object apply(Object p0){
       p0 = PatchProxy.applyOneRefs(p0, this, b.class, "1");
       if (p0 != PatchProxyResult.class) {
       }else {
          p0 = AdAvatarElement.n0(this.b).getUser().observable().subscribe(new a(this), new a());
       }
       return p0;
    }
}
