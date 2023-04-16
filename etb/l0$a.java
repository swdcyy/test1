package etb.l0$a;
import com.yxcorp.gifshow.widget.m;
import etb.l0;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.notice.box.detail.data.model.NoticeBoxVideoCardItem;
import com.smile.gifmaker.mvps.utils.model.DefaultObservableAndSyncable;
import k2b.e0;
import com.yxcorp.gifshow.notice.box.data.NoticeBoxPlateSetting;
import dtb.c;
import e17.i;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.notice.box.detail.data.model.NoticeBoxVideoCardItem$CardPhotoInfo;
import com.yxcorp.gifshow.entity.QPhoto;
import java.util.List;
import ftb.b;

public class l0$a extends m	// class@002800
{
    public final l0 c;

    public void l0$a(l0 p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, l0$a.class, "1")) {
          return;
       }
       l0 s = this.c.s;
       if (s.mUnread != null) {
          s.mUnread = false;
          s.notifyChanged();
       }
       l0$a tc = this.c;
       c.h(tc.q, tc.s, "video", tc.v, (tc.t + 1));
       tc = this.c;
       if (tc.p == null) {
          i.a(R.style.arg_RES_7f11066a, 0x7f104dc3);
       }else if(tc.s.mCardPhotoInfo != null){
          tc = this.c;
          NoticeBoxVideoCardItem mCardPhotoIn = tc.s.mCardPhotoInfo;
          b.a(tc.getActivity(), tc.p, tc.u, mCardPhotoIn.mPhotos, mCardPhotoIn.mPhotoIds, tc.r, p0);
       }
       return;
    }
}
