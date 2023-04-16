package com.yxcorp.gifshow.follow.stagger.container.HomeFollowFragment$2;
import com.yxcorp.gifshow.follow.stagger.HomeFollowItemLayoutManager;
import com.yxcorp.gifshow.follow.stagger.container.HomeFollowFragment;
import android.content.Context;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.yxcorp.gifshow.follow.config.util.FollowConfigUtil;
import iia.d;
import rja.c;
import com.yxcorp.gifshow.listcomponent.layoutmanager.VirtualLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$y;
import com.yxcorp.gifshow.follow.stagger.container.HomeFollowFragment$2$a;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView$x;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;

public class HomeFollowFragment$2 extends HomeFollowItemLayoutManager	// class@001153
{
    public final HomeFollowFragment k1;

    public void HomeFollowFragment$2(HomeFollowFragment p0,Context p1){
       this.k1 = p0;
       super(p1);
    }
    public void scrollToPosition(int p0){
       HomeFollowFragment$2 u2 = HomeFollowFragment$2.class;
       if (PatchProxy.isSupport(u2) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, u2, "2")) {
          return;
       }
       if (FollowConfigUtil.g() && !p0) {
          this.k1.Y.z.p(true);
       }
       super.scrollToPosition(p0);
       return;
    }
    public void scrollToPositionWithOffset(int p0,int p1){
       HomeFollowFragment$2 u2 = HomeFollowFragment$2.class;
       if (PatchProxy.isSupport(u2) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, u2, "3")) {
          return;
       }
       if (FollowConfigUtil.g() && !p0) {
          this.k1.Y.z.p(true);
       }
       super.scrollToPositionWithOffset(p0, p1);
       return;
    }
    public void smoothScrollToPosition(RecyclerView p0,RecyclerView$y p1,int p2){
       if (PatchProxy.isSupport(HomeFollowFragment$2.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, HomeFollowFragment$2.class, "1")) {
          return;
       }
       if (FollowConfigUtil.g() && !p2) {
          this.k1.Y.z.p(true);
       }
       HomeFollowFragment$2$a u2$a = new HomeFollowFragment$2$a(this, p0.getContext());
       u2$a.p(p2);
       this.startSmoothScroll(u2$a);
       return;
    }
}
