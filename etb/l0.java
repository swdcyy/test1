package etb.l0;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import lnc.a1;
import android.widget.TextView;
import android.widget.ImageView;
import android.view.View;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.android.model.mix.CoverMeta;
import kp.r1;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import ekd.j;
import com.kuaishou.android.model.mix.CommonMeta;
import jp.a;
import jd.c;
import dd.d;
import com.facebook.imagepipeline.request.ImageRequest;
import wb5.b;
import com.yxcorp.image.callercontext.a$a;
import com.yxcorp.image.callercontext.a;
import com.yxcorp.image.callercontext.ImageSource;
import pb.d;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.controller.AbstractDraweeControllerBuilder;
import ac.a;
import com.facebook.drawee.view.DraweeView;
import etb.m0;
import ub.b;
import com.facebook.drawee.controller.AbstractDraweeController;
import com.yxcorp.gifshow.image.KwaiImageView;
import wb5.h;
import com.yxcorp.gifshow.recycler.fragment.FragmentCompositeLifecycleState;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import brd.t;
import etb.k0;
import erd.g;
import io.reactivex.internal.functions.Functions;
import crd.b;
import android.graphics.drawable.Drawable;
import java.lang.Integer;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import java.lang.Boolean;
import hc.a;
import ekd.m1;
import etb.l0$a;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import com.yxcorp.gifshow.notice.box.detail.data.model.NoticeBoxVideoCardItem;
import com.yxcorp.gifshow.notice.box.data.NoticeBoxPlateSetting;

public class l0 extends PresenterV2	// class@002801
{
    public a A;
    public QPhoto p;
    public RecyclerFragment q;
    public String r;
    public NoticeBoxVideoCardItem s;
    public int t;
    public int u;
    public NoticeBoxPlateSetting v;
    public View w;
    public View x;
    public TextView y;
    public KwaiImageView z;

    public void l0(){
       super();
    }
    public void E8(){
       l0 ol0 = l0.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ol0, "3")) {
          return;
       }
       l0 tp = this.p;
       g og = 1;
       if (tp == null) {
          if (!PatchProxy.applyVoid(objArray, this, ol0, "5")) {
             if (this.u == og) {
                this.P8(a1.e(96.00f), a1.e(40.00f));
                this.y.setTextSize(14.00f);
             }else {
                this.P8(a1.e(48.00f), a1.e(20.00f));
                this.y.setTextSize(10.00f);
             }
          }
          this.z.setVisibility(8);
          this.x.setVisibility(0);
          this.y.setVisibility(0);
          this.w.setBackgroundResource(R.color.arg_RES_7f06173f);
       }else {
          l0 tz = this.z;
          if (!PatchProxy.applyVoidTwoRefs(tz, tp, this, ol0, "7") && tp != null) {
             QPhoto mEntity = tp.mEntity;
             if (mEntity != null) {
                CoverMeta uCoverMeta = r1.D0(mEntity);
                if (uCoverMeta == null) {
                   tz.i0();
                }else if(j.h(uCoverMeta.mWebpGifUrls) ^ og){
                   if (!PatchProxy.applyVoidThreeRefs(tz, mEntity, uCoverMeta, this, l0.class, "8")) {
                      this.A = objArray;
                      r1.w0(mEntity);
                      a$a uoa = a.d();
                      uoa.b(":ks-features:ft-social:notice");
                      uoa.d(ImageSource.FEED_COVER);
                      d uod = Fresco.newDraweeControllerBuilder();
                      uod.q(og);
                      d uod1 = uod.r(uoa.a());
                      uod1.y(tz.getController());
                      uod1.s(new m0(this));
                      uod1.v(b.g(uCoverMeta, a.c, objArray, og, objArray), 0);
                      tz.setController(uod1.e());
                   }
                }else {
                   h.k(tz, mEntity, a.c);
                }
             }
          }
          this.X7(this.q.Vg().j().subscribe(new k0(this), Functions.d()));
          this.z.setVisibility(0);
          this.x.setVisibility(8);
          this.y.setVisibility(8);
          this.w.setBackground(objArray);
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, l0.class, "4")) {
          return;
       }
       if (this.A != null) {
          this.A = null;
       }
       return;
    }
    public final void P8(int p0,int p1){
       l0 ol0 = l0.class;
       if (PatchProxy.isSupport(ol0) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, ol0, "6")) {
          return;
       }
       ViewGroup$LayoutParams layoutParams = this.x.getLayoutParams();
       layoutParams.width = p0;
       layoutParams.height = p0;
       ViewGroup$MarginLayoutParams layoutParams1 = this.y.getLayoutParams();
       layoutParams1.leftMargin = p1;
       layoutParams1.rightMargin = p1;
       return;
    }
    public void R8(boolean p0){
       l0 ol0 = l0.class;
       if (PatchProxy.isSupport(ol0) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, ol0, "9")) {
          return;
       }
       ol0 = this.A;
       if (ol0 == null) {
          return;
       }
       if (p0) {
          ol0.start();
       }else {
          ol0.stop();
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, l0.class, "2")) {
          return;
       }
       this.w = p0;
       this.x = m1.f(p0, 0x7f0a2e1b);
       this.y = m1.f(p0, 0x7f0a2e1c);
       this.z = m1.f(p0, 0x7f0a2e1a);
       this.w.setOnClickListener(new l0$a(this));
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, l0.class, "1")) {
          return;
       }
       this.p = this.s8(QPhoto.class);
       this.q = this.r8("FRAGMENT");
       this.r = this.r8("KEY_NOTICE_BOX_NAME");
       this.s = this.r8("NOTICE_BOX_ITEM_DATA");
       this.t = this.r8("NOTICE_BOX_ITEM_DATA_POSITION").intValue();
       this.u = this.r8("NOTICE_BOX_CARD_PHOTO_COUNT").intValue();
       this.v = this.t8("NOTICE_BOX_ITEM_PLATE_SETTING");
       return;
    }
}
