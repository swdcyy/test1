package dac.r;
import f7c.d;
import com.yxcorp.gifshow.relation.explore.fragment.ExploreFriendFragment;
import com.yxcorp.gifshow.pymk.f;
import com.kwai.framework.model.user.RecoUser;
import com.kwai.framework.model.user.User;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.yxcorp.gifshow.pymk.b;
import com.yxcorp.gifshow.pymk.net.RecommendUserResponseV2;
import java.util.Collection;
import ekd.q;
import java.util.List;
import y8c.g;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import e7c.b;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import g9c.a;
import qvb.i;
import qvb.a;
import y8c.t;
import java.util.ArrayList;
import java.util.Iterator;
import a7c.h;
import android.view.View;

public class r extends d	// class@00214a
{
    public final f f;
    public final boolean g;
    public final ExploreFriendFragment h;

    public void r(ExploreFriendFragment p0,f p1,boolean p2){
       this.h = p0;
       this.f = p1;
       this.g = p2;
       super();
    }
    public void Ad(RecoUser p0,User p1,int p2){
       boolean b;
       boolean b1;
       if (PatchProxy.isSupport(r.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, r.class, "1")) {
          return;
       }
       if (b.a()) {
          this.c(p0, p1, p2);
       }else {
          super.Ad(p0, p1, p2);
       }
       RecommendUserResponseV2 recommendUse = this.f.i2();
       if (recommendUse != null && !q.f(recommendUse.mFriendUserList)) {
          recommendUse.mFriendUserList.remove(p0);
          if (q.f(recommendUse.mFriendUserList)) {
             r th = this.h;
             b = false;
             th.L = b;
             b uob = th.g7();
             Objects.requireNonNull(uob);
             b uob1 = b.class;
             Object[] objArray = null;
             if (!PatchProxy.applyVoid(objArray, uob, uob1, "20")) {
                RecoUser obj = PatchProxy.apply(objArray, uob, uob1, "19");
                if (obj != PatchProxyResult.class) {
                   b1 = obj.booleanValue();
                }else {
                   obj = uob.N0(b);
                   b1 = (obj != null && obj.mViewType == 12)? true: false;
                }
                if (b1) {
                   if (uob.D != null) {
                      uob.n.remove(uob.N0(b));
                   }else {
                      uob.S0(b);
                   }
                }
             }
             if (this.b().isEmpty()) {
                this.h.sh().i();
             }
          }
       }
       return;
    }
    public void Ee(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, r.class, "2")) {
          return;
       }
       ArrayList uArrayList = new ArrayList();
       ArrayList uArrayList1 = new ArrayList();
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          RecoUser recoUser = iterator.next();
          if (recoUser.mUser.mIsNewFriend != null) {
             uArrayList.add(recoUser);
          }else {
             uArrayList1.add(recoUser);
          }
       }
       if (!uArrayList.isEmpty()) {
          super.Ee(uArrayList);
       }
       if (!uArrayList1.isEmpty()) {
          super.Ee(uArrayList1);
       }
       return;
    }
    public void Z3(RecoUser p0,h p1,View p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, r.class, "3")) {
          return;
       }
       View view = p2.findViewById(R.id.new_friend_notify);
       View view1 = p2.findViewById(R.id.tag_layout);
       View view2 = p2.findViewById(R.id.pymk_live_tip_text);
       if (p0.mUser.mIsNewFriend != null) {
          p2.setBackgroundResource(R.color.arg_RES_7f06173f);
          if (this.g != null && view != null) {
             view.setVisibility(0);
          }
          if (this.g != null && view1 != null) {
             this.h.Hh(view1, R.drawable.arg_RES_7f08094a);
          }
          if (this.g != null && view2 != null) {
             this.h.Gh(view2, R.color.arg_RES_7f06173f);
          }
       }else {
          p2.setBackgroundResource(R.drawable.arg_RES_7f08035d);
          if (this.g != null && view != null) {
             view.setVisibility(8);
          }
          if (this.g != null && view1 != null) {
             this.h.Hh(view1, R.drawable.arg_RES_7f08094b);
          }
          if (this.g != null && view2 != null) {
             this.h.Gh(view2, R.color.arg_RES_7f0617b3);
          }
       }
    label_0081 :
       return;
    }
}
