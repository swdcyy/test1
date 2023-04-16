package com.yxcorp.gifshow.atlas_detail.vertical.presenter.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.atlas_detail.vertical.presenter.a$a;
import com.yxcorp.gifshow.atlas_detail.vertical.presenter.a$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ge5.d;
import com.kwai.feature.api.feed.detail.router.biz.normal.NormalDetailBizParam;
import n99.b;
import io.reactivex.internal.functions.Functions;
import erd.g;
import crd.b;
import brd.t;
import java.util.List;
import uw9.b;
import y8c.a;

public class a extends PresenterV2	// class@001bdb
{
    public int A;
    public int B;
    public d p;
    public List q;
    public b r;
    public a s;
    public NormalDetailBizParam t;
    public t u;
    public m v;
    public g w;
    public Rect x;
    public r y;
    public final a z;

    public void a(){
       super();
       this.y = new a$a(this);
       this.z = new a$b(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, a.class, "2")) {
          return;
       }
       a tp = this.p;
       this.v = tp.d;
       this.w = tp.c;
       tp = this.t;
       NormalDetailBizParam mStartImageI = tp.mStartImageIndex;
       this.A = mStartImageI;
       this.B = tp.mStartImageOffset;
       if (mStartImageI > null) {
          this.X7(this.u.subscribe(new b(this), Functions.e));
       }
       if (!this.q.contains(this.z)) {
          this.q.add(this.z);
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       this.q = this.r8("DETAIL_ATTACH_LISTENERS");
       this.r = this.q8(b.class);
       this.s = this.r8("DETAIL_FRAGMENT");
       this.t = this.q8(NormalDetailBizParam.class);
       this.u = this.r8("DETAIL_PAGE_VISIBLE_OBSERVABLE");
       this.p = this.r8("PHOTO_ROOTVIEW_TOUCH_MANAGER");
       return;
    }
}
