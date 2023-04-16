package com.yxcorp.gifshow.detail.slidev2.presenter.e$a;
import yg5.t0;
import com.yxcorp.gifshow.detail.slidev2.presenter.e;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import kp.w1;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import k2b.e0;
import k2b.f0;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import k2b.u1;
import b8a.m;
import androidx.fragment.app.Fragment;
import java.lang.Runnable;
import k2b.n;
import java.lang.Integer;
import java.lang.Float;
import yg5.r0;
import yg5.s0;

public class e$a implements t0	// class@0018fa
{
    public final e b;

    public void e$a(e p0){
       this.b = p0;
       super();
    }
    public void s(boolean p0){
       e$a uoa = e$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa, "2")) {
          return;
       }
       if (p0) {
          e$a tb = this.b;
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoid(null, tb, e.class, "13")) {
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "WINDOW_PLAY";
             ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
             uContentPack.photoPackage = w1.f(tb.v.getEntity());
             u1.D0("2481438", f0.a(tb.w, tb.getActivity()), 3, uElementPack, uContentPack, null);
          }
          n.a(this.b.w, new m(this));
       }
       return;
    }
    public void wd(int p0,int p1,int p2,float p3,int p4){
       e$a uoa = this;
       e$a uoa1 = e$a.class;
       if (PatchProxy.isSupport(uoa1)) {
          Object[] objArray = new Object[]{Integer.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),Float.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, uoa1, "1")) {
             return;
          }
       }
       e$a b = uoa.b;
       boolean b1 = (p4 == 2)? true: false;
       b.P8(p0, p1, p2, p3, b1);
       return;
    }
    public void xe(boolean p0,r0 p1){
       s0.b(this, p0, p1);
    }
}
