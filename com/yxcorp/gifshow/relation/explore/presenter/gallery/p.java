package com.yxcorp.gifshow.relation.explore.presenter.gallery.p;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.relation.explore.presenter.gallery.p$a;
import com.yxcorp.gifshow.relation.explore.presenter.gallery.p$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.model.user.RecoUser;
import java.util.Collection;
import ekd.q;
import fac.c;
import com.kwai.framework.model.user.User;
import com.kwai.framework.model.user.UserExtraInfo;
import com.yxcorp.gifshow.relation.explore.presenter.f;
import yl8.b;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import androidx.recyclerview.widget.RecyclerView$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import lnc.a1;
import android.view.View$OnClickListener;
import iac.b1;
import android.view.View$OnLongClickListener;
import android.view.ViewGroup;
import fac.d;
import java.util.List;
import android.content.Context;
import java.util.Iterator;
import crd.b;
import ekd.m1;
import android.widget.TextView;
import android.widget.ImageView;
import ekd.p1;
import io.reactivex.subjects.PublishSubject;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import y8c.d;
import fac.b;

public abstract class p extends PresenterV2	// class@00184f
{
    public View$OnClickListener A;
    public RecoUser p;
    public List q;
    public PublishSubject r;
    public c s;
    public BaseFragment t;
    public d u;
    public b v;
    public TextView w;
    public View x;
    public ImageView y;
    public View$OnClickListener z;

    public void p(){
       super();
       this.z = new p$a(this);
       this.A = new p$b(this);
    }
    public void E8(){
       boolean b;
       if (PatchProxy.applyVoid(null, this, p.class, "2")) {
          return;
       }
       int i = 1;
       int i1 = q.f(this.p.mFeedList) ^ i;
       if (!this.s.i()) {
          RecoUser mUser = this.p.mUser;
          if (mUser != null && f.c(mUser.mExtraInfo)) {
             b = true;
          label_002f :
             this.p.mUser.b();
             RecyclerView$LayoutParams layoutParams = this.m8().getLayoutParams();
             layoutParams.width = this.s.g();
             layoutParams.height = (int)((float)this.s.c() + (this.s.e() * (float)a1.d(0x7f07028d)));
             this.m8().setLayoutParams(layoutParams);
             this.m8().setOnClickListener(this.z);
             this.m8().setOnLongClickListener(new b1(this));
             this.q = f.d(this.p, this.m8(), this.z, i, this.P8(i1, b));
             f.a(this.getContext(), this.m8(), i1, b, this.P8(i1, b));
             return;
          }
       }
       b = false;
       goto label_002f ;
    }
    public void J8(){
       p op = p.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, op, "4")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, op, "5")) {
          op = this.q;
          if (op != null) {
             Iterator iterator = op.iterator();
             while (iterator.hasNext()) {
                iterator.next().dispose();
             }
          }
       }
       return;
    }
    public abstract d P8(boolean p0,boolean p1);
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, p.class, "3")) {
          return;
       }
       this.x = m1.f(p0, 0x7f0a0333);
       this.w = m1.f(p0, 0x7f0a3560);
       this.y = m1.f(p0, 0x7f0a0785);
       p1.c(this.y, a1.e(16.00f), a1.e(16.00f), a1.e(16.00f), a1.e(16.00f));
       this.y.setOnClickListener(this.A);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, p.class, "1")) {
          return;
       }
       this.p = this.q8(RecoUser.class);
       this.r = this.r8("PYMK_ACCESS_IDSbigcard_btn");
       this.s = this.q8(c.class);
       this.t = this.r8("FRAGMENT");
       this.u = this.r8("ADAPTER_POSITION_GETTER");
       this.v = this.q8(b.class);
       return;
    }
}
