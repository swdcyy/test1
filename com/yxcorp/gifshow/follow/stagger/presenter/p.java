package com.yxcorp.gifshow.follow.stagger.presenter.p;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.model.mix.AggregateTemplateMeta;
import java.lang.Integer;
import android.view.View;
import com.kwai.framework.model.user.User;
import brd.t;
import com.smile.gifmaker.mvps.utils.model.DefaultObservableAndSyncable;
import eja.c0;
import erd.g;
import crd.b;
import com.yxcorp.gifshow.util.rx.RxBus;
import wca.n;
import t45.d;
import brd.z;
import eja.f0;
import lnc.a1;
import java.lang.CharSequence;
import android.widget.TextView;
import android.widget.ImageView;
import ekd.m1;
import com.yxcorp.gifshow.follow.stagger.presenter.n;
import android.view.View$OnClickListener;

public class p extends PresenterV2	// class@00121c
{
    public ImageView p;
    public TextView q;
    public View r;
    public AggregateTemplateMeta s;
    public int t;

    public void p(){
       super();
       this.t = 1;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, p.class, "3")) {
          return;
       }
       if (this.s.mRecommendUser != null) {
          this.r.setTag(R.id.tag_view_refere, Integer.valueOf(18));
          this.P8(this.s.mRecommendUser);
          this.X7(this.s.mRecommendUser.observable().subscribe(new c0(this)));
          this.X7(RxBus.f.f(n.class).observeOn(d.a).subscribe(new f0(this)));
       }
       return;
    }
    public final void P8(User p0){
       p op = p.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, op, "7")) {
          return;
       }
       if (p0.isFollowingOrFollowRequesting()) {
          if (!PatchProxy.applyVoid(null, this, op, "8")) {
             this.q.setText(a1.p(R.string.arg_RES_7f101021));
             this.p.setVisibility(8);
             this.r.setSelected(true);
             this.t = 2;
          }
       }else {
          this.R8();
       }
       return;
    }
    public final void R8(){
       if (PatchProxy.applyVoid(null, this, p.class, "9")) {
          return;
       }
       this.q.setText(a1.p(R.string.arg_RES_7f100f8f));
       this.p.setVisibility(0);
       this.r.setSelected(0);
       this.t = 1;
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, p.class, "2")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a0f6e);
       this.q = m1.f(p0, 0x7f0a0fa1);
       this.r = m1.f(p0, 0x7f0a0f4e);
       m1.a(p0, new n(this), R.id.follow_button);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, p.class, "1")) {
          return;
       }
       this.s = this.q8(AggregateTemplateMeta.class);
       return;
    }
}
