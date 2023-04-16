package com.yxcorp.gifshow.v3.editor.sticker.stickerlibrary.d;
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
import com.yxcorp.gifshow.v3.editor.sticker.f0;
import android.widget.ProgressBar;
import brd.a0;
import erd.g;
import io.reactivex.internal.functions.Functions;
import com.yxcorp.gifshow.v3.editor.sticker.stickerlibrary.b;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import s0d.f;
import java.util.Collection;
import s0d.e;
import pb.d;
import com.facebook.drawee.backends.pipeline.Fresco;
import ac.a;
import com.facebook.drawee.view.DraweeView;
import com.facebook.drawee.controller.AbstractDraweeControllerBuilder;
import com.facebook.drawee.controller.AbstractDraweeController;
import ekd.q;
import java.util.List;
import android.widget.ImageView;
import com.kwai.library.widget.progressbar.DownloadProgressBar;
import com.yxcorp.gifshow.util.PostBaseResourceDownloadHelper;
import java.util.Map;
import com.kwai.middleware.resourcemanager.download.BaseResourceDownloadHelper;
import com.yxcorp.gifshow.util.PostBaseResourceDownloadHelper$InfoWithResource;
import java.lang.Boolean;
import com.yxcorp.gifshow.v3.editor.sticker.stickerlibrary.d$a;
import com.yxcorp.gifshow.util.PostBaseResourceDownloadHelper$a;
import java.util.Iterator;
import java.util.Set;
import x59.e$c;
import android.view.View;
import ekd.m1;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.yxcorp.gifshow.v3.editor.sticker.stickerlibrary.a;
import android.view.View$OnClickListener;
import x59.e$d;

public class d extends b	// class@00129e
{
    public StickerDetailInfo t;
    public Set u;
    public e$d v;
    public KwaiImageView w;
    public DownloadProgressBar x;
    public TextView y;
    public static final int z;

    static {
       d.z = a1.e(65.00f);
    }
    public void d(){
       super();
    }
    public void E8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, d.class, "3")) {
          return;
       }
       this.y.setText(this.t.mStickerId);
       if (PostExperimentUtils.j()) {
          this.y.setVisibility(0);
       }else {
          this.y.setVisibility(8);
       }
       if (!f0.n(this.t)) {
          this.P8(0);
       }else {
          this.X7(f0.i(this.t, objArray).R(Functions.d(), b.b));
       }
       int i = 0x7f08202e;
       this.w.setPlaceHolderImage(i);
       if (this.t.isAnimatedOnPanel()) {
          d uod = Fresco.newDraweeControllerBuilder();
          uod.y(this.w.getController());
          uod.q(true);
          uod.u(f.x().q(this.t.mWebpUrls).w());
          AbstractDraweeController uAbstractDra = uod.e();
          this.w.setController(uAbstractDra);
       }else if(!q.f(this.t.mIconUrls)){
          this.w.P(this.t.mIconUrls);
       }else {
          this.w.y(i, d.z, d.z);
       }
       this.w.setVisibility(0);
       this.x.setVisibility(8);
       this.x.setProgressArcColor(a1.a(R.color.arg_RES_7f0609ce));
       super.E8();
       return;
    }
    public void J8(){
       d uod = d.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uod, "5")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, uod, "8")) {
          f0 uof0 = f0.j();
          d tt = this.t;
          if (uof0.b.containsKey(tt.getId())) {
             uof0.c.b(uof0.b.get(tt.getId()));
             uof0.a(tt);
          }
       }
       return;
    }
    public final void P8(boolean p0){
       d uod = d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uod, "7")) {
          return;
       }
       if (f0.j().f(this.t) && !p0) {
          return;
       }
       this.x.setVisibility(0);
       this.x.setProgress(1);
       f0.j().g(this.t, new d$a(this), p0);
       return;
    }
    public void R8(){
       if (PatchProxy.applyVoid(null, this, d.class, "6")) {
          return;
       }
       Iterator iterator = this.u.iterator();
       while (iterator.hasNext()) {
          iterator.next().b(this.t);
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "2")) {
          return;
       }
       super.doBindView(p0);
       this.x = m1.f(p0, 0x7f0a0c1a);
       this.w = m1.f(p0, 0x7f0a3b63);
       m1.a(p0, new a(this), R.id.sticker_item_container);
       this.y = m1.f(p0, 0x7f0a3b6a);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, d.class, "1")) {
          return;
       }
       super.j8();
       this.t = this.r8("DATA");
       this.u = this.r8("ARG_STICKER_CLICK_LISTENER");
       this.v = this.t8("ARG_STICKER_SELECT_LISTENER");
       return;
    }
}
