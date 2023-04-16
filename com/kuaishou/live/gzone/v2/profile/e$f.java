package com.kuaishou.live.gzone.v2.profile.e$f;
import androidx.recyclerview.widget.RecyclerView$r;
import com.kuaishou.live.gzone.v2.profile.e;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;
import com.kwai.framework.model.user.UserProfile;
import com.kuaishou.live.core.show.showprofile.LiveProfileParams;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import qvb.n0;
import com.kwai.robust.PatchProxyResult;
import java.util.List;
import qvb.a;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;

public class e$f extends RecyclerView$r	// class@001ce3
{
    public final e a;

    public void e$f(e p0){
       this.a = p0;
       super();
    }
    public void a(RecyclerView p0,int p1){
       e$f uof = e$f.class;
       if (PatchProxy.isSupport(uof) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uof, "1")) {
          return;
       }
       if (p1 == 1) {
          this.c(p0, 1);
       }
       return;
    }
    public void b(RecyclerView p0,int p1,int p2){
       if (PatchProxy.isSupport(e$f.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, e$f.class, "2")) {
          return;
       }
       boolean b = (p2 > 0)? true: false;
       this.c(p0, b);
       return;
    }
    public void c(RecyclerView p0,boolean p1){
       int b;
       e$f uof = e$f.class;
       if (PatchProxy.isSupport(uof) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, uof, "4")) {
          return;
       }
       e$f ta = this.a;
       if (!ta.n9(ta.r.getUserProfile())) {
          return;
       }
       RecyclerView$LayoutManager layoutManage = p0.getLayoutManager();
       if (!this.a.U0.isLoading() && layoutManage.getChildCount() > 0) {
          e obj = PatchProxy.apply(null, this, uof, "3");
          if (obj != PatchProxyResult.class) {
             b = obj.booleanValue();
          }else {
             obj = this.a.U0;
             b = (obj != null && (obj.getItems() != null && !this.a.U0.getItems().isEmpty()))? true: false;
          }
          if (b) {
             b = layoutManage.getItemCount();
             int i = (p1)? layoutManage.c(): layoutManage.E();
             if (i == (b - 1)) {
                this.a.U0.load();
             }
          }
       }
    label_0087 :
       return;
    }
}
