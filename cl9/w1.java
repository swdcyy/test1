package cl9.w1;
import android.view.View$OnClickListener;
import cl9.z1;
import java.lang.Object;
import android.view.View;
import java.lang.StringBuilder;
import java.lang.String;
import com.kwai.framework.model.user.User;
import com.kuaishou.android.model.mix.QComment;
import com.yxcorp.gifshow.entity.QPhoto;
import e95.e;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import com.kwai.component.fansgroup.FansGroupParams;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kwai.component.fansgroup.FansGroupSourceType;
import com.kwai.component.fansgroup.FansGroupHelper;

public final class w1 implements View$OnClickListener	// class@000679
{
    public final z1 b;

    public void w1(z1 p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       w1 tb = this.b;
       String str = tb.y+"";
       User mId = tb.u.getUser().mId;
       QComment mId1 = tb.u.mId;
       User mId2 = tb.t.getUser().mId;
       String photoId = tb.t.getPhotoId();
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe)) {
          Object[] objArray = new Object[]{str,mId,mId1,mId2,photoId};
          if (PatchProxy.applyVoid(objArray, null, uoe, "2")) {
          label_0079 :
             FansGroupHelper.e(new FansGroupParams().setHasJoinedFansGroup(tb.t.getUser().getFansGroupV2JoinedState()).setActivity(tb.getActivity()).setAuthorUser(tb.t.getUser()).setSource(FansGroupSourceType.COMMENT).setComment(tb.u).setExpTag(tb.t.getExpTag()).setFansGroupName(tb.x));
             return;
          }
       }
       a.p(str, "fansGroupLevel");
       a.p(mId, "commentAuthorId");
       a.p(mId1, "commentId");
       a.p(mId2, "photoAuthorId");
       a.p(photoId, "photoId");
       uoe = e.a;
       u1.u(1, uoe.b(str), uoe.a(mId, mId1, mId2, photoId));
       goto label_0079 ;
    }
}
