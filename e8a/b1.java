package e8a.b1;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.l;
import com.kwai.feature.component.photofeatures.startup.response.AvatarInfoResponse;
import java.lang.Object;
import android.view.View;
import com.yxcorp.gifshow.detail.slidev2.presenter.e0;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import com.yxcorp.gifshow.entity.QPhoto;
import kp.r1;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import p1a.a;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import com.yxcorp.gifshow.detail.helper.AvatarTipHelper;
import com.kwai.framework.model.feed.BaseFeed;

public final class b1 implements View$OnClickListener	// class@002098
{
    public final l b;
    public final AvatarInfoResponse c;

    public void b1(l p0,AvatarInfoResponse p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void onClick(View p0){
       b1 tb = this.b;
       e0 e = tb.E;
       e0 z = tb.z;
       int i = tb.L.a0() + 1;
       AvatarInfoResponse mPhoto = this.c.mPhoto;
       e0 a = tb.A;
       int i1 = (r1.Q2(tb.z))? 285: 225;
       AvatarTipHelper.c(e, z, i, mPhoto, null, true, true, a, false, i1);
       r1.q5(tb.z.mEntity, 2);
       return;
    }
}
