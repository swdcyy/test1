package com.yxcorp.gifshow.detail.slidev2.presenter.h0;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import b8a.r2;
import hn5.n;
import hn5.m;
import android.content.Context;
import java.lang.Object;
import im8.f;
import java.lang.Boolean;
import com.yxcorp.gifshow.util.rx.RxBus;
import ujc.d;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import p5a.e;
import de5.a;
import com.kwai.framework.player.core.b$b;
import com.kwai.framework.player.core.b;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.entity.QPhoto;

public class h0 extends PresenterV2	// class@0019b9
{
    public BaseFragment p;
    public QPhoto q;
    public f r;
    public a s;
    public final b$b t;

    public void h0(){
       super();
       this.t = new r2(this);
    }
    public static void P8(h0 p0,int p1){
       p0.R8(p1);
    }
    private void R8(int p0){
       if (p0 == 3 && (m.a().U3(this.getContext()) && !this.r.get().booleanValue())) {
          RxBus.f.b(new d());
       }
    label_0029 :
       return;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, h0.class, "2")) {
          return;
       }
       this.s.getPlayer().w(this.t);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, h0.class, "3")) {
          return;
       }
       this.s.getPlayer().O(this.t);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, h0.class, "1")) {
          return;
       }
       this.p = this.r8("DETAIL_FRAGMENT");
       this.q = this.q8(QPhoto.class);
       this.r = this.x8("DETAIL_FROM_SLIDE");
       this.s = this.q8(a.class);
       return;
    }
}
