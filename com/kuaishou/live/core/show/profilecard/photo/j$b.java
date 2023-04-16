package com.kuaishou.live.core.show.profilecard.photo.j$b;
import androidx.recyclerview.widget.RecyclerView$r;
import com.kuaishou.live.core.show.profilecard.photo.j;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;
import com.kwai.framework.model.user.UserProfile;
import com.kuaishou.live.core.show.showprofile.LiveProfileParams;
import lf2.n;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import qvb.n0;
import com.kwai.robust.PatchProxyResult;
import java.util.List;
import qvb.a;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;

public class j$b extends RecyclerView$r	// class@000dea
{
    public final j a;

    public void j$b(j p0){
       this.a = p0;
       super();
    }
    public void a(RecyclerView p0,int p1){
       j$b uob = j$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uob, "1")) {
          return;
       }
       if (p1 == 1) {
          this.c(p0, 1);
       }
       return;
    }
    public void b(RecyclerView p0,int p1,int p2){
       if (PatchProxy.isSupport(j$b.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, j$b.class, "2")) {
          return;
       }
       boolean b = (p2 > 0)? true: false;
       this.c(p0, b);
       return;
    }
    public void c(RecyclerView p0,boolean p1){
       int b;
       j$b uob = j$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, uob, "4")) {
          return;
       }
       if (!n.a(this.a.w.getUserProfile())) {
          return;
       }
       RecyclerView$LayoutManager layoutManage = p0.getLayoutManager();
       if (!this.a.G.isLoading() && layoutManage.getChildCount() > 0) {
          j obj = PatchProxy.apply(null, this, uob, "3");
          if (obj != PatchProxyResult.class) {
             b = obj.booleanValue();
          }else {
             obj = this.a.G;
             b = (obj != null && (obj.getItems() != null && !this.a.G.getItems().isEmpty()))? true: false;
          }
          if (b) {
             b = layoutManage.getItemCount();
             int i = (p1)? layoutManage.c(): layoutManage.E();
             if (i == (b - 1)) {
                b.Z(LiveLogTag.LIVE_PROFILE, "tryToLoadMore");
                this.a.G.load();
             }
          }
       }
    label_008e :
       return;
    }
}
