package com.kwai.emotion.adapter.match.search.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import im8.f;
import com.kwai.emotionsdk.bean.EmotionInfo;
import zj5.l;
import ac.b;
import com.facebook.drawee.view.DraweeView;
import yb.a;
import xb.t$b;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import s0d.f;
import java.util.Collection;
import s0d.e;
import ub.b;
import com.facebook.imagepipeline.request.ImageRequest;
import pb.d;
import com.facebook.drawee.controller.AbstractDraweeControllerBuilder;
import com.facebook.drawee.controller.AbstractDraweeController;
import ac.a;
import java.lang.Boolean;
import android.widget.TextView;
import android.view.View;
import zj5.m;
import android.view.View$OnClickListener;
import ekd.m1;
import java.lang.Integer;

public class a extends PresenterV2	// class@000d66
{
    public KwaiBindableImageView p;
    public TextView q;
    public EmotionInfo r;
    public int s;
    public f t;
    public f u;
    public l v;

    public void a(){
       super();
    }
    public void E8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, a.class, "3")) {
          return;
       }
       a tv = this.v;
       if (tv != null) {
          tv.c(this.u.get(), this.r, this.s);
       }
       this.p.getHierarchy().u(t$b.e);
       this.p.setPlaceHolderImage(R.drawable.arg_RES_7f080f2d);
       d uod = this.p.g0(objArray, objArray, f.x().q(this.r.mEmotionImageSmallUrl).w());
       a tp = this.p;
       if (uod != null) {
          uod.q(true);
          objArray = uod.e();
       }
       tp.setController(objArray);
       if (this.t.get().booleanValue() && this.s == null) {
          this.q.setVisibility(0);
       }else {
          this.q.setVisibility(8);
       }
       this.m8().setOnClickListener(new m(this));
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "2")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a0cfa);
       this.q = m1.f(p0, 0x7f0a0d05);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       this.r = this.q8(EmotionInfo.class);
       this.s = this.r8("ADAPTER_POSITION").intValue();
       this.t = this.x8("GIF_RECOMMEND_FLAG");
       this.u = this.x8("GIF_SEARCH_KEYWORD");
       this.v = this.t8("SEARCH_GIF_INTERACT_CALLBACK");
       return;
    }
}
