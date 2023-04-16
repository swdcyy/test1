package com.yxcorp.gifshow.v3.editor.sticker.stickerlibrary.e;
import rtc.b;
import lnc.a1;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.v3.editor.sticker.model.StickerDetailInfo;
import java.lang.CharSequence;
import android.widget.TextView;
import com.yxcorp.gifshow.util.PostExperimentUtils;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import java.util.Collection;
import ekd.q;
import s0d.f;
import s0d.e;
import pb.d;
import com.facebook.drawee.backends.pipeline.Fresco;
import ac.a;
import com.facebook.drawee.view.DraweeView;
import com.facebook.drawee.controller.AbstractDraweeControllerBuilder;
import com.facebook.drawee.controller.AbstractDraweeController;
import java.util.List;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.view.View;
import ekd.m1;
import com.kwai.library.widget.progressbar.DownloadProgressBar;
import com.yxcorp.gifshow.image.KwaiImageView;
import rtc.d;
import android.view.View$OnClickListener;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.util.Set;
import x59.e$d;

public class e extends b	// class@00129f
{
    public Set t;
    public e$d u;
    public StickerDetailInfo v;
    public KwaiImageView w;
    public DownloadProgressBar x;
    public TextView y;
    public static final int z;

    static {
       e.z = a1.e(65.00f);
    }
    public void e(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, e.class, "3")) {
          return;
       }
       this.y.setText(this.v.mStickerId);
       if (PostExperimentUtils.j()) {
          this.y.setVisibility(0);
       }else {
          this.y.setVisibility(8);
       }
       super.E8();
       int i = 0x7f08202e;
       this.w.setPlaceHolderImage(i);
       if (this.v.isAnimatedOnPanel()) {
          StickerDetailInfo mWebpUrls = (!q.f(this.v.mWebpUrls))? this.v.mWebpUrls: this.v.mIconUrls;
          if (!q.f(mWebpUrls)) {
             d uod = Fresco.newDraweeControllerBuilder();
             uod.y(this.w.getController());
             uod.q(true);
             uod.u(f.x().q(mWebpUrls).w());
             AbstractDraweeController uAbstractDra = uod.e();
             this.w.setController(uAbstractDra);
          }else {
             this.w.y(i, e.z, e.z);
          }
       }else if(!q.f(this.v.mIconUrls)){
          this.w.P(this.v.mIconUrls);
       }else {
          this.w.y(i, e.z, e.z);
       }
       this.w.setVisibility(0);
       this.x.setVisibility(8);
       return;
    }
    public void J8(){
       PatchProxy.applyVoid(null, this, e.class, "4");
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "2")) {
          return;
       }
       super.doBindView(p0);
       this.x = m1.f(p0, 0x7f0a0c1a);
       this.w = m1.f(p0, 0x7f0a3b63);
       m1.a(p0, new d(this), R.id.sticker_item_container);
       this.y = m1.f(p0, 0x7f0a3b6a);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, e.class, "1")) {
          return;
       }
       super.j8();
       this.v = this.r8("DATA");
       this.t = this.r8("ARG_STICKER_CLICK_LISTENER");
       this.u = this.t8("ARG_STICKER_SELECT_LISTENER");
       return;
    }
}
