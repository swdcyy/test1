package com.yxcorp.gifshow.relation.explore.presenter.n$d;
import bac.h$b;
import com.yxcorp.gifshow.relation.explore.presenter.n;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import g9c.a;
import com.yxcorp.gifshow.relation.feed.presenter.FeedBigCardStatePresenter;
import qvb.n0;
import com.kwai.framework.model.user.RecoUser;
import org.json.JSONObject;
import a7c.h;
import com.kwai.framework.model.user.User;
import g7c.i;

public class n$d implements h$b	// class@00185a
{
    public final n a;

    public void n$d(n p0){
       this.a = p0;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, n$d.class, "1")) {
          return;
       }
       this.a.q9();
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, n$d.class, "3")) {
          return;
       }
       this.a.n9();
       boolean b = false;
       if (this.a.Z0.getItemCount() == 1 && (this.a.v.hasMore() && this.a.S == null)) {
          this.a.v.load();
          this.a.S = b;
       }else if(this.a.Z0.R0()){
          this.a.h9();
       }
       RecoUser recoUser = this.a.Z0.N0(b);
       if (recoUser != null) {
          recoUser = recoUser.mUser;
          if (recoUser != null) {
             n$d ta = this.a;
             i.b(recoUser, ta.d1, ta.y.k(), "gesture");
          }
       }
       return;
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, n$d.class, "2")) {
          return;
       }
       this.a.o9();
       return;
    }
}
