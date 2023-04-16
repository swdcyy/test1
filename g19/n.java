package g19.n;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.ad.detail.presenter.side.c;
import com.kwai.feature.component.photofeatures.startup.response.AvatarInfoResponse;
import java.lang.Object;
import android.view.View;
import com.yxcorp.gifshow.ad.detail.presenter.side.l;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import gz8.d;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import p1a.a;
import com.kwai.framework.model.feed.BaseFeed;
import kp.r1;

public final class n implements View$OnClickListener	// class@0023cd
{
    public final c b;
    public final AvatarInfoResponse c;

    public void n(c p0,AvatarInfoResponse p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void onClick(View p0){
       object oobject;
       n tb = this.b;
       l e = tb.E;
       QPhoto photo = tb.getPhoto();
       int i = 1;
       int i1 = tb.K.a0() + i;
       AvatarInfoResponse mPhoto = this.c.mPhoto;
       d uod = d.class;
       if (PatchProxy.isSupport(uod)) {
          Object[] objArray = new Object[]{e,photo,Integer.valueOf(i1),mPhoto,oobject};
          oobject = null;
          if (PatchProxy.applyVoid(objArray, oobject, uod, "2")) {
          label_0044 :
             r1.q5(tb.getPhoto().mEntity, 2);
             return;
          }
       }
       d.c(e, photo, i1, mPhoto, null, false, 32, null);
       goto label_0044 ;
    }
}
