package dfd.c;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.plugin.search.entity.template.aggregate.TemplateBaseFeed;
import android.view.View;
import nfd.o3;
import android.view.ViewGroup$LayoutParams;
import android.widget.ImageView;
import yed.d;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import o56.a;
import android.content.Context;
import com.yxcorp.utility.n;
import com.yxcorp.gifshow.model.CDNUrl;
import jfd.d;
import com.yxcorp.plugin.search.entity.template.aggregate.CoverExtInfo;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.yxcorp.plugin.search.utils.j0;
import com.facebook.imagepipeline.request.ImageRequest;
import ekd.j;
import pb.d;
import com.facebook.drawee.backends.pipeline.Fresco;
import ac.a;
import com.facebook.drawee.view.DraweeView;
import com.facebook.drawee.controller.AbstractDraweeControllerBuilder;
import com.facebook.drawee.controller.AbstractDraweeController;
import nfd.t0;
import ekd.m1;
import com.kwai.framework.player.ui.impl.KwaiContentFrame;

public class c extends PresenterV2	// class@000cbc
{
    public d p;
    public d q;
    public KwaiImageView r;
    public KwaiImageView s;
    public boolean t;
    public TemplateBaseFeed u;
    public TemplateBaseFeed v;
    public CoverExtInfo w;

    public void c(){
       super();
    }
    public void c(boolean p0){
       super();
       this.t = p0;
    }
    public void E8(){
       CDNUrl[] obj;
       int i1;
       CoverExtInfo uCoverExtInf;
       c uoc = c.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoc, "3")) {
          return;
       }
       c tu = this.u;
       if (tu != null && this.v == tu) {
          return;
       }
       this.v = tu;
       if (tu != null) {
          this.w = tu.mCoverExtInfo;
       }
       o3.H(this.s, 0);
       if (!PatchProxy.applyVoid(objArray, this, uoc, "5")) {
          ViewGroup$LayoutParams layoutParams = this.s.getLayoutParams();
          ViewGroup$LayoutParams width = layoutParams.width;
          if (width <= null) {
             width = this.q.a() / 2;
          }
          layoutParams = layoutParams.height;
          if (layoutParams <= null) {
             tu = this.q;
             Objects.requireNonNull(tu);
             obj = PatchProxy.apply(objArray, tu, d.class, "2");
             if (obj != PatchProxyResult.class) {
                i1 = obj.intValue();
             }else if(tu.a == null){
                tu.a = n.u(a.B);
             }
             i1 = tu.a;
             i1 = i1 / 2;
          }
          obj = this.p.j(width, i1);
          c tw = this.w;
          if (tw != null) {
             CoverExtInfo mCoverUrls1 = tw.mCoverUrls;
             if (mCoverUrls1 != null) {
                uCoverExtInf = mCoverUrls1;
             }
          }
          this.s.V(uCoverExtInf, width, i1);
       }
       if (!PatchProxy.applyVoid(objArray, this, uoc, "4")) {
          uoc = this.w;
          if (uoc != null) {
             CoverExtInfo mCoverUrls = uoc.mCoverUrls;
             if (mCoverUrls != null) {
                j0.z(mCoverUrls, objArray, this.r, objArray, 0);
             }
          }
          ImageRequest[] imageRequest = this.p.l();
          if (!j.h(imageRequest)) {
             d uod = Fresco.newDraweeControllerBuilder();
             uod.y(this.r.getController());
             uod.u(imageRequest);
             AbstractDraweeController uAbstractDra = uod.e();
             this.r.setController(uAbstractDra);
             this.r.setVisibility(0);
          }
       }
       if (this.t != null) {
          int i = t0.i;
          j0.D(this.s, (float)i);
          j0.D(this.r, (float)i);
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "2")) {
          return;
       }
       KwaiImageView kwaiImageVie = m1.f(p0, R.id.follow_surface_cover);
       this.s = kwaiImageVie;
       if (kwaiImageVie == null) {
          this.s = m1.f(p0, 0x7f0a0f90).getCover();
       }
       this.r = m1.f(p0, 0x7f0a0f91);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, c.class, "1")) {
          return;
       }
       this.p = this.r8("SEARCH_PLAY_PHOTO_WRAPPER");
       this.q = this.r8("SEARCH_PLAY_LAZY_DATA");
       this.u = this.s8(TemplateBaseFeed.class);
       return;
    }
}
