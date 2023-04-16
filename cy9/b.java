package cy9.b;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.detail.common.information.cocreate.panel.a;
import java.lang.Object;
import android.view.View;
import java.lang.Integer;
import io.reactivex.subjects.PublishSubject;
import tkd.b;
import tkd.d;
import vu5.b;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kuaishou.android.model.mix.CoCreateInfo$CoCreateMember;
import java.lang.String;
import com.kwai.feature.api.router.social.profile.ProfileStartParam;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import n3d.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$BatchUserPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$UserPackage;
import com.kwai.framework.model.user.User;
import com.yxcorp.gifshow.log.model.ClickMetaData;
import k2b.u1;

public final class b implements View$OnClickListener	// class@001e32
{
    public final a b;

    public void b(a p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       b tb = this.b;
       a w = tb.w;
       if (w != null) {
          w.onNext(Integer.valueOf(-1));
       }
       b uob = d.a(-1718536792);
       GifshowActivity activity = tb.getActivity();
       ProfileStartParam profileStart = ProfileStartParam.m(String.valueOf(tb.p.mUserId));
       profileStart.C("COCREATE");
       profileStart.s(tb.R8());
       a x = tb.x;
       a uoa = null;
       QPhoto mEntity = (x != null)? x.mEntity: uoa;
       profileStart.x(mEntity);
       uob.tn(activity, profileStart, 0, uoa);
       if (!PatchProxy.applyVoid(uoa, tb, a.class, "10")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "AUTHORS_CREATE_POPUP";
          ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
          ClientContent$BatchUserPackage uBatchUserPa = new ClientContent$BatchUserPackage();
          uContentPack.batchUserPackage = uBatchUserPa;
          ClientContent$UserPackage[] userPackageA = new ClientContent$UserPackage[]{new ClientContent$UserPackage()};
          uBatchUserPa.userPackage = userPackageA;
          uContentPack.batchUserPackage.userPackage[0].identity = String.valueOf(tb.q.mId);
          uContentPack.batchUserPackage.userPackage[0].index = tb.R8() + 1;
          u1.B(new ClickMetaData().setType(3).setElementPackage(uElementPack).setContentPackage(uContentPack));
       }
       return;
    }
}
