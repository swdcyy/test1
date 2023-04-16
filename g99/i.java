package g99.i;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.atlas_detail.common.presenter.toolbar.c;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.feature.component.photofeatures.startup.response.AvatarInfoResponse;
import java.lang.Object;
import android.view.View;
import im8.f;
import p1a.a;
import java.lang.String;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import com.yxcorp.gifshow.detail.helper.AvatarTipHelper;

public final class i implements View$OnClickListener	// class@002445
{
    public final c b;
    public final QPhoto c;
    public final AvatarInfoResponse d;

    public void i(c p0,QPhoto p1,AvatarInfoResponse p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void onClick(View p0){
       i tb = this.b;
       String str = tb.P8(this.d);
       AvatarTipHelper.b(tb.u, tb.r, 0, this.c, tb.t.get(), true, false, tb.q, str, null, 21);
    }
}
