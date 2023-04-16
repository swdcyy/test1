package com.yxcorp.gifshow.follow.stagger.presenter.d0;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.component.photo.reduce.h;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import com.kuaishou.android.model.mix.AggregateTemplateMeta;
import android.view.View;
import com.kuaishou.android.model.mix.CommonMeta;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import k2b.e0;
import ia5.a;
import ha5.b;
import ekd.m1;
import eja.u1;
import android.view.View$OnClickListener;
import eja.t1;
import com.kuaishou.android.model.feed.AggregateTemplateFeed;
import java.lang.Integer;
import ha5.e;

public class d0 extends PresenterV2	// class@00120d
{
    public long A;
    public String B;
    public View p;
    public View q;
    public CommonMeta r;
    public AggregateTemplateFeed s;
    public RecyclerFragment t;
    public int u;
    public AggregateTemplateMeta v;
    public e w;
    public b x;
    public h y;
    public String z;

    public void d0(){
       super();
    }
    public void E8(){
       d0 uod0 = d0.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uod0, "3")) {
          return;
       }
       this.y = new h(this.t);
       d0 tq = this.q;
       int i = (this.v.mHideCloseButton != null)? 8: 0;
       tq.setVisibility(i);
       this.r.mPosition = this.u;
       this.z = "following";
       if (!PatchProxy.applyVoid(objArray, this, uod0, "9")) {
          uod0 = this.r;
          if (uod0.mShowed == null) {
             uod0.mShowed = true;
             a.e(this.t, this.v.mContentType, this.z, new QPhoto(this.s), 1463, this.p);
             uod0 = this.x;
             if (uod0 != null) {
                uod0.c(this.s, this.u, this.v);
             }
          }
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, d0.class, "4")) {
          return;
       }
       this.A = 0;
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d0.class, "2")) {
          return;
       }
       this.q = m1.f(p0, 0x7f0a0782);
       this.p = m1.f(p0, 0x7f0a0923);
       m1.a(p0, new u1(this), R.id.close);
       m1.a(p0, new t1(this), R.id.container);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, d0.class, "1")) {
          return;
       }
       this.r = this.q8(CommonMeta.class);
       this.s = this.q8(AggregateTemplateFeed.class);
       this.t = this.r8("FRAGMENT");
       this.u = this.r8("ADAPTER_POSITION").intValue();
       this.v = this.q8(AggregateTemplateMeta.class);
       this.w = this.t8("PHOTO_CLICK_LISTENER");
       this.x = this.t8("AGGREGATE_PHOTO_OPERATE_LISTENER");
       return;
    }
}
