package com.yxcorp.gifshow.relation.friend.reduce.FriendReduceFragment;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import android.app.Activity;
import com.kwai.framework.model.user.User;
import com.kwai.framework.model.feed.BaseFeed;
import z1.a;
import qa9.q;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.activity.GifshowActivity;
import androidx.fragment.app.c;
import androidx.fragment.app.FragmentActivity;
import com.yxcorp.gifshow.bottom.sheet.BottomSheetParams;
import com.yxcorp.utility.n;
import android.os.Bundle;
import qa9.s;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import lnc.g2;
import uac.l;
import androidx.fragment.app.Fragment;
import lnc.g2$a;
import uac.a;

public class FriendReduceFragment extends BaseFragment	// class@0018cd
{
    public static final int j;

    public void FriendReduceFragment(){
       super();
    }
    public static q ch(Activity p0,User p1,BaseFeed p2,boolean p3,boolean p4,boolean p5,a p6){
       int i = 0;
       int i1 = 1;
       if (PatchProxy.isSupport(FriendReduceFragment.class)) {
          Object[] objArray = new Object[]{p0,p1,p2,Boolean.valueOf(p3),Boolean.valueOf(p4),Boolean.valueOf(p5),p6};
          Object obj = PatchProxy.apply(objArray, null, FriendReduceFragment.class, "4");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       q oq = s.c(p0.getSupportFragmentManager(), FriendReduceFragment.class, "RemoveFromFriendsFragment", null, BottomSheetParams.ofStateless().setCancelable(i1, i1).setNeedPageLogger(i).setContentHeight(n.j(p0)));
       oq.g("user", p1);
       if (p2 != null) {
          oq.g("base_photo", p2);
       }
       oq.g("is_result_toast_enabled", Boolean.valueOf(p3));
       oq.g("is_manual", Boolean.valueOf(p4));
       oq.g("is_reverse_remove", Boolean.valueOf(p5));
       if (p6 != null) {
          oq.g("result_consumer", p6);
       }
       return oq;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, FriendReduceFragment.class, "1");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       return a.g(p0, 0x7f0d0523, p1, false);
    }
    public void onViewCreated(View p0,Bundle p1){
       Boolean uBoolean = Boolean.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, FriendReduceFragment.class, "2")) {
          return;
       }
       super.onViewCreated(p0, p1);
       g2 og2 = new g2(this, new l(this));
       a uoa = new a();
       uoa.b = this;
       q oq = s.a(this);
       if (oq != null) {
          User user = oq.a("user", User.class);
          if (user == null) {
             user = new User();
          }
          uoa.c = user;
          uoa.d = oq.a("base_photo", BaseFeed.class);
          uoa.e = oq.a("is_manual", uBoolean).booleanValue();
          uoa.g = oq.a("is_result_toast_enabled", uBoolean).booleanValue();
          uoa.f = oq.a("is_reverse_remove", uBoolean).booleanValue();
          uoa.h = oq.a("result_consumer", a.class);
       }
       og2.b(uoa);
       return;
    }
}
