package nz9.t;
import erd.g;
import nz9.z0;
import java.lang.Object;
import com.kwai.framework.model.user.User;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import uw9.o;
import java.lang.StringBuilder;
import q87.c;
import com.kwai.framework.model.user.FansGroupV2Info;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.component.fansgroup.FansGroupHelper;
import wh5.c;
import java.lang.Boolean;
import qp7.x0;
import qp7.b;
import os7.a;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import java.util.List;
import qvb.a;
import java.util.Collection;
import ekd.q;
import java.util.Iterator;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kwai.framework.model.user.User$FollowStatus;

public final class t implements g	// class@003249
{
    public final z0 b;

    public void t(z0 p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       Object[] objArray1;
       t tb = this.b;
       Objects.requireNonNull(tb);
       z0 oz0 = z0.class;
       if (PatchProxy.applyVoidOneRefs(p0, tb, oz0, "16")) {
       }else {
          int i = 0;
          Object[] objArray = new Object[i];
          o.C().w("AvatarAndFollowBaseElement", "updateUser: "+p0.getName()+", isFollowed "+tb.z0()+", isSpecialFocus "+tb.F0()+", before isSpecialFocus "+tb.e1, objArray);
          if (!p0.isFollowingOrFollowRequesting()) {
             objArray1 = new Object[i];
             o.C().w("AvatarAndFollowBaseElement", "unfollow", objArray1);
             tb.M = i;
             tb.P0();
          }else {
             tb.M = true;
             if (FansGroupHelper.b(tb.u.getFansGroupInfo()) && (!FansGroupHelper.c(tb.u.getFansGroupInfo()) && !c.j())) {
                Boolean tRUE = Boolean.TRUE;
                tb.u.getUser().setFansGroupV2IsShowGuidance(tRUE);
                tb.E().n(tRUE);
             }else {
                tb.E().n(Boolean.FALSE);
             }
             if (tb.F0()) {
                objArray1 = new Object[i];
                o.C().w("AvatarAndFollowBaseElement", "special focus", objArray1);
                tb.M = i;
                tb.E().t(Boolean.FALSE);
             }else if(tb.e1 != null){
                objArray1 = new Object[i];
                o.C().w("AvatarAndFollowBaseElement", "before is special focus", objArray1);
                tb.M = i;
                tb.P0();
             }else {
                objArray1 = new Object[i];
                o.C().w("AvatarAndFollowBaseElement", "show follow anim", objArray1);
                tb.E().s(Boolean.TRUE);
             }
          }
          if (tb.J == null || (!PatchProxy.applyVoidOneRefs(p0, tb, oz0, "17") && !tb.S.C())) {
             oz0 = tb.H;
             if (oz0 != null && !q.f(oz0.getItems())) {
                Iterator iterator = tb.H.getItems().iterator();
                while (iterator.hasNext()) {
                   QPhoto qPhoto = iterator.next();
                   if (qPhoto == null || TextUtils.isEmpty(qPhoto.getPhotoId())) {
                      continue ;
                   }else {
                      User user = qPhoto.getUser();
                      if (user != null && (user.getId()).equals(p0.getId())) {
                         if (user.getFollowStatus() != p0.getFollowStatus()) {
                            user.setFollowStatus(p0.getFollowStatus());
                         }
                         if (user.getFansGroupV2JoinedState() != p0.getFansGroupV2JoinedState()) {
                            user.setFansGroupV2JoinedState(Boolean.valueOf(p0.getFansGroupV2JoinedState()), p0.getFansGroupLevel());
                         }
                         if (user.showMissYouButton() != p0.showMissYouButton()) {
                            user.setShowMissButton(p0.showMissYouButton());
                         }
                      }
                   }
                }
             }
          }
          tb.e1 = tb.F0();
       }
       return;
    }
}
